from flask import Flask , jsonify, render_template
import requests


app = Flask(__name__)

@app.route('/') # decorator
def index():
  return render_template('index.html') #페이지 소스를 브라우저를 읽는 과정
#templates 는 자동으로 경로 설정 된다.

#routing: 사용자의 접속 경로를 지정

#외부 api 정보 가져오기

@app.route('/posts')
def show_posts():
  response= requests.get('https://jsonplaceholder.typicode.com/posts')
  to_serve=response.json()
  return jsonify(to_serve)

@app.route('/quote/<string:name>')
def show_quote(name=None):
  return "This is quote {}".format(name)

if __name__=='__main__':
  app.run(host='0.0.0.0', port=5000, debug=True)

