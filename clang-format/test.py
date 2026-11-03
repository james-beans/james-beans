#!/usr/bin/env python3

import sys

def main():
  print("Hello, World!")

  grade = input("What letter grade did you get? ").strip().upper()

  match grade:
    case "A":
      print("You did great!")
    case "B":
      print("You did good!")
    case "C":
      print("You did okay!")
    case "D":
      print("You passed!")
    case "E":
      print("You barely passed!")
    case "F":
      print("You failed!")
    case _:
      print("You didn't enter a grade between A-F.")
      return 1

  return 0

if __name__ == "__main__":
  sys.exit(main())
