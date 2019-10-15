"""
Author: Nicolas Gonzalez Vallejo
"""

def double_char(str):
  solution=""
  for i in range(len(str)):
    solution = solution+str[i]*2
  return solution


def count_hi(str):
  count=0
  for i in range(len(str)-1):
    if str[i] == "h" and str[i+1] == "i":
      count=count+1
  return count


def cat_dog(str):
  count_cat=0
  count_dog=0
  for i in range(len(str)-2):
    if str[i:i+3] == "cat":
      count_cat=count_cat+1
    if str[i:i+3] == "dog":
      count_dog=count_dog+1
  return count_cat == count_dog


def count_code(str):
  count=0
  for i in range(len(str)-3):
    if str[i:i+2] == "co" and str[i+3] == "e":
      count=count+1
  return count

def end_other(a, b):
  a_=a.lower()
  b_=b.lower()
  if b_ == a_[-len(b_):]:
    return True
  if a_ == b_[-len(a_):]:
    return True
  return False


def xyz_there(str):
  if str[0:3] == "xyz":
    return True
  for i in range(len(str)-3):
      if str[i] != "." and str[i+1:i+4] == "xyz":
        return True
  return False