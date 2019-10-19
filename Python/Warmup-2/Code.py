"""
Author: Nicolas Gonzalez Vallejo
"""

def string_times(str, n):
  return str*n


def front_times(str, n):
  return str[0:3]*n


def string_bits(str):
  solution=""
  for i in range(len(str)):
    if i%2 == 0:
      solution=solution+str[i]
  return solution


def string_splosion(str):
  final=""
  for i in range(len(str)):
    final=final+str[0:i]
  return final+str


def last2(str):
  count=0
  for i in range(len(str)-2):
    if str[i:i+2] == str[-2:]:
      count=count+1      
  return count


def array_count9(nums):
  count=0
  for i in nums:
    if i == 9:
      count=count+1
  return count


def array_front9(nums):
  for i in range(len(nums)):
    if i <= 3 and nums[i] == 9:
      return True
  return False


def array123(nums):
  for i in range(len(nums)-2):
    if nums[i]==1 and nums[i+1]==2 and nums[i+2]==3:
      return True
  return False


def string_match(a, b):
  count=0
  for i in range(len(a)-1):
    if a[i:i+2] == b[i:i+2]:
      count = count+1
  return count