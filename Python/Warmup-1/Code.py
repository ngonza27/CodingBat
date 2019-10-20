"""
Author: Nicolas Gonzalez Vallejo
"""

def sleep_in(weekday, vacation):
  return not weekday or vacation


def monkey_trouble(a_smile, b_smile):
  return (a_smile and b_smile) or (not a_smile and not b_smile) 


def sum_double(a, b):
  if a == b:
    return (a+b)*2
  return a+b


def diff21(n):
  if n>21:
    return (n-21)*2
  return 21-n


def parrot_trouble(talking, hour):
  if (hour < 7 or hour > 20) and talking:
    return True
  return False


def makes10(a, b):
  return a==10 or b==10 or a+b==10


def near_hundred(n):
  return abs(200-n) <= 10 or  abs(100-n) <= 10


def pos_neg(a, b, negative):
  if negative:
    return a < 0 and b < 0
  return (a < 0 and b > 0) or \
         (a > 0 and b < 0) 


def not_string(str):
  if str[0:3] == "not":
    return str
  return "not "+str


def missing_char(str, n):
  return str[0:n]+str[n+1:len(str)]


def front_back(str):
  if len(str) < 2:
    return str
  return str[-1:]+str[1:len(str)-1]+str[0]


def front3(str):
  if len(str) <= 3:
    return str+str+str
  return str[:3]+str[:3]+str[:3]