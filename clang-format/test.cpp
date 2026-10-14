#include <iostream>

using std::cin;
using std::cout;

int main() {
  cout << "Hello, World!\n";

  char grade;

  cout << "What letter grade did you get? ";
  cin >> grade;

  switch (grade) {
    case 'A': {
      cout << "You did great!\n";
      break;
    }
    case 'B': {
      cout << "You did good!\n";
      break;
    }
    case 'C': {
      cout << "You did okay!\n";
      break;
    }
    case 'D': {
      cout << "You passed!\n";
      break;
    }
    case 'E': {
      cout << "You barely passed!\n";
      break;
    }
    case 'F': {
      cout << "You failed!\n";
      break;
    }
    default: {
      cout << "You didn't enter a grade between A-F.\n";
      return 1;
    }
  }

  return 0;
}