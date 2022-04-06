from collections import deque


def enqueue(queue,element):
  """
  add element at last of deque
  """
  queue.append(element)

def dequeue(queue):
  """
  Remove element from 1st position of deque
  """
  print(queue.popleft())

if __name__=='__main__':
  queue_1 = deque()

  enqueue(queue_1,1)
  enqueue(queue_1,2)
  enqueue(queue_1,3)
  print(queue_1)

  dequeue(queue_1)
  dequeue(queue_1)

  print(queue_1)