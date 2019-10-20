"""
Author: Nicolas Gonzalez Vallejo
"""

def cigar_party(cigars, is_weekend):
  return (not is_weekend and cigars >= 40 and cigars <= 60) or \
         (is_weekend and cigars >= 40)


def date_fashion(you, date):
  if you <= 2 or date <=2:
    return 0
  elif you >= 8 or date >= 8:
    return 2
  return 1


def squirrel_play(temp, is_summer):
  return (not is_summer and temp >=60 and temp <=90) or \
         (is_summer and temp >=60 and temp <=100)



def caught_speeding(speed, is_birthday):
  if (speed <= 60 and not is_birthday) or \
     (speed <= 65 and is_birthday):
    return 0
  elif (speed >= 61 and speed <= 80 and not is_birthday) or \
       (speed >= 66 and speed <= 85 and is_birthday):
    return 1
  elif (speed >= 81 and not is_birthday) or \
       (speed >= 86 and is_birthday):
    return 2
  

def sorta_sum(a, b):
  if a+b >= 10 and a+b <= 19:
    return 20
  return a+b


def alarm_clock(day, vacation):
  if (day >= 1 and day <= 5) and not vacation:
    return "7:00"
  elif (day == 0 or day == 6) and not vacation:
    return "10:00"
  elif (day >= 1 and day <= 5) and vacation:
    return "10:00"
  elif (day == 0 or day == 6) and vacation:
    return "off"
  return "off"


def love6(a, b):
  return a==6 or b==6 or abs(a-b)==6 or a+b==6


def in1to10(n, outside_mode):
  if (n >=1 and n <=10) and not outside_mode:
    return True
  elif (n <=1 or n >=10) and outside_mode:
    return True
  return False


def near_ten(num):
  return num%10<=2 or num%10>=8