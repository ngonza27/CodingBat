"""
Author: Nicolas Gonzalez Vallejo
"""

def make_bricks(small, big, goal):
  if goal >= big*5:
    count=goal-big*5
  else:
    count=goal%5
  if count <= small:
    return True
  return False


def lone_sum(a, b, c):
  if a == b == c:
    return 0
  if a==b:
    a,b = 0,0
  if b==c:
    b,c = 0,0
  if a == c:
    a,c = 0,0
  return a+b+c


def lucky_sum(a, b, c):
  if a == 13:
    a,b,c = 0,0,0
  elif b == 13:
    b,c = 0,0
  elif c == 13:
    c = 0
  return a+b+c


def no_teen_sum(a, b, c):
  return fix_teen(a)+fix_teen(b)+fix_teen(c)
  
def fix_teen(n):
  if n >= 13 and n <= 19 and n != 15 and n != 16:
    return 0
  return n


def round_sum(a, b, c):
  return round10(a)+round10(b)+round10(c)

def round10(num):
  if num%10 >= 5:
    return num+(10-num%10)
  return num-(num%10)


def close_far(a, b, c):
  return (abs(a-b) <= 1 and abs(a-c) >= 2 and abs(b-c) >= 2)  or \
         (abs(a-c) <= 1 and abs(a-b) >= 2 and abs(c-b) >= 2)


def make_chocolate(small, big, goal):
  if goal >= big*5:
    count=goal-big*5
  else:
    count=goal%5
  if count <= small:
    return count
  return -1
