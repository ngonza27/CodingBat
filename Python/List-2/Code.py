"""
Author: Nicolas Gonzalez Vallejo
"""

def count_evens(nums):
  count=0
  for i in range(0,len(nums)):
    if nums[i]%2 == 0:
      count=count+1
  return count


def big_diff(nums):
  return max(nums)-min(nums)


def centered_average(nums):
  avg = 0
  nums.sort()
  for i in range(1,len(nums)-1):
    avg=avg+nums[i]
  return avg/(len(nums)-2)


def sum13(nums):
  sum=0
  if len(nums) == 0:
    return 0
  for i in range(0,len(nums)):
    if nums[i] == 13:
      nums[i] = 0
      if i+1 < len(nums):
        nums[i+1] = 0
    sum=sum+nums[i]
  return sum


def sum67(nums):
  sum=0
  flag=False
  for i in range(0,len(nums)):
    if nums[i] == 6:
      flag=True
    if flag == False:
      sum=sum+nums[i]
    if nums[i] == 7:
      flag=False
  return sum


def has22(nums):
  for i in range(0,len(nums)):
    if (i+1 <len(nums)) and (nums[i] == 2 and nums[i+1] ==2):
      return True
  return False