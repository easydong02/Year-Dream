
def push(stack, element):
  """
  Add value into the stack
  """
  
  stack.append(element)

def pop(stack):
  """
  remove last value ever pushed
  """
  return print(stack.pop())

def peek(stack):
  """
  Print and show value what pops next
  """
  return print("peek value is : {}".format(stack[-1]))

def is_empty(stack):
  """
  Check whether stack is empty or not
  """
  if len(stack)==0:
    print(True)
  else:
    print(False)

if __name__ =='__main__': 
  #shell에서 실행된다면 아래의 태스크 수행
  # Stacking process
  stack_1 = []
  push(stack_1,1)
  push(stack_1,2)
  push(stack_1,3)
  pop(stack_1)
  
  print(stack_1)
  peek(stack_1)
  is_empty(stack_1)
