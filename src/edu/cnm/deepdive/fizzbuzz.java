package edu.cnm.deepdive;

public class fizzbuzz {

  public static void main(String[] args) {
    int counter;
    for (counter = 0; counter <= 100; counter++) {
      if (counter % 5 == 0 && counter % 3 == 0) {
        System.out.println("Fizzbuzz");
      } else if(counter % 5 == 0) {
        System.out.println("Fizz");
      } else if(counter % 3 == 0) {
        System.out.println(("Buzz"));
      } else {
        System.out.println(counter);
      }
    }

/*
 public static void buzz();
  */
 //     int x;
 //     int y;
    }


  }

