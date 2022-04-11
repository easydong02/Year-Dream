print( 3 == 3 )
print( 3 != 3 )
print( 3  < 3 )
print( 3 <= 3 ) #비교 연산자

yesterday = 10000
cur_price = 13000
print(cur_price == yesterday * 1.3) #비교연산자의 값은 True와 False로 boolean타입 반환

print(1)
if True:
    print(2)
    print(3)
print(4)  #if 조건문, 조건이 참일때 다음 블럭 실행

#조건이 3개 이상이라면 if - elif - else 구문을 사용해야 합니다. 파이썬 인터프리터는 위에서 아래 방향으로 조건을 차례로 비교합니다.
#중요한 것은 조건을 충족하는 경우 들여쓰기된 코드를 실행하고 전체 if - elif - else 코드의 실행을 종료합니다.
if 조건-1 :   
    print("state – 1")  
elif 조건-2 :   
    print("state – 2")  
elif 조건-3 :   
    print("state – 3")  
 . . . . . . .  
else :   
    print("state – N")
    
    
print(True and True)
print(True and True and False)
print(True or False)
print(not True) #논리연산자 and는 둘다 참, or은 하나라도 참이면 True 반환


#점수에 따라 반복문과 조건문 생성
리스트 =[10,20,30,40]
for scor in 리스트:
  if scor>= 40:
    result = "A"
  elif scor >=30:
    result = "B"
  
  print(f"{result}입니다.")
  
