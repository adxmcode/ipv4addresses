public class IPAddress{
  private int first;
  private int second;
  private int third;
  private int fourth;

  public IPAddress(){
    first = 192;
    second = 168;
    third = 0;
    fourth = 1;
  }

  public IPAddress(int a, int b, int c, int d){
    first = a;
    second = b;
    third = c;
    fourth = d;
  }

   public void converttoSubnetMask(int a, int b, int c, int d){
      if(a == 10){
        if((b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)){
          System.out.print("Your subnet mask is: 255.0.0.0");
        }
      }
      else if (a == 172){
        if((b >= 16 && b <= 31) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)){
          System.out.print("Your subnet mask is: 255.255.0.0");
        }
      }
      else if (a == 192){
        if((b == 168) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)){
          System.out.print("Your subnet mask is: 255.255.255.0");
        }
      }
     else{
       System.out.print("No subnet masks are possible from the IP address typed.");
     }
    }

    public void converttoBinary(int number){
      String reversebinaryNumber = "";
      String truebinaryNumber = "";
      if(number == 0){
        reversebinaryNumber += "0";
      }
      else{
        while(number > 0){
            if(number % 2 == 0){
              reversebinaryNumber += "0";
            }
          else{
              reversebinaryNumber += "1";
          }
          number = number / 2;
        }
      }
      for(int i = reversebinaryNumber.length(); i >= 1; i--){
        truebinaryNumber += reversebinaryNumber.substring(i - 1, i);
      }
      System.out.print(truebinaryNumber);
    }

    public void converttoHexadecimal(int number){
      String reverseHexadecimalnumber = "";
      String trueHexadecimalnumber = "";
      if(number == 0){
        reverseHexadecimalnumber += "0";
      }
      else{
        while(number > 0){
          if (number % 16 == 1){
            reverseHexadecimalnumber += "1";
          }
          else if (number % 16 == 2){
            reverseHexadecimalnumber += "2";
          }
          else if (number % 16 == 3){
            reverseHexadecimalnumber += "3";
          }
          else if (number % 16 == 4){
            reverseHexadecimalnumber += "4";
          }
          else if (number % 16 == 5){
            reverseHexadecimalnumber += "5";
          }
          else if (number % 16 == 6){
            reverseHexadecimalnumber += "6";
          }
          else if (number % 16 == 7){
            reverseHexadecimalnumber += "7";
          }
          else if (number % 16 == 8){
            reverseHexadecimalnumber += "8";
          }
          else if (number % 16 == 9){
            reverseHexadecimalnumber += "9";
          }
          else if (number % 16 == 10){
            reverseHexadecimalnumber += "A";
          }
          else if (number % 16 == 11){
            reverseHexadecimalnumber += "B";
          }
          else if (number % 16 == 12){
            reverseHexadecimalnumber += "C";
          }
          else if (number % 16 == 13){
            reverseHexadecimalnumber += "D";
          }
          else if (number % 16 == 14){
            reverseHexadecimalnumber += "E";
          }
          else if (number % 16 == 15){
            reverseHexadecimalnumber += "F";
          }
          else if (number % 16 == 0){
            reverseHexadecimalnumber += "0";
          }
          number = number / 16;
         }
      }
      for(int i = reverseHexadecimalnumber.length(); i >= 1; i--){
          trueHexadecimalnumber += reverseHexadecimalnumber.substring(i - 1, i);
      }
      System.out.print(trueHexadecimalnumber);
    }

    public void converttoOctal(int number){
      String reverseOctalnumber = "";
      String trueOctalnumber = "";
      if(number == 0){
        reverseOctalnumber += "0";
      }
      else{
        while(number > 0){
          if (number % 8 == 1){
            reverseOctalnumber += "1";
          }
          else if (number % 8 == 2){
              reverseOctalnumber += "2";
          }
          else if (number % 8 == 3){
              reverseOctalnumber += "3";
          }
          else if (number % 8 == 4){
              reverseOctalnumber += "4";
          }
          else if (number % 8 == 5){
              reverseOctalnumber += "5";
          }
          else if (number % 8 == 6){
              reverseOctalnumber += "6";
          }
          else if (number % 8 == 7){
              reverseOctalnumber += "7";
          }
          else if (number % 8 == 0){
              reverseOctalnumber += "0";
          }
          number = number / 8;
         }
      }
      for(int i = reverseOctalnumber.length(); i >= 1; i--){
          trueOctalnumber += reverseOctalnumber.substring(i - 1, i);
      }
      System.out.print(trueOctalnumber);
    }

  public void printBinary(int a, int b, int c, int d){
    System.out.print("Your IP address in binary is: ");
    converttoBinary(a);
    System.out.print(".");
    converttoBinary(b);
    System.out.print(".");
    converttoBinary(c);
    System.out.print(".");
    converttoBinary(d);
    System.out.println("");
  }

  public void printOctal(int a, int b, int c, int d){
    System.out.print("Your IP address in octal is: ");
    converttoOctal(a);
    System.out.print(".");
    converttoOctal(b);
    System.out.print(".");
    converttoOctal(c);
    System.out.print(".");
    converttoOctal(d);
    System.out.println("");
  }

  public void printHexadecimal(int a, int b, int c, int d){
    System.out.print("Your IP address in hexadecimal is: ");
    converttoHexadecimal(a);
    System.out.print(".");
    converttoHexadecimal(b);
    System.out.print(".");
    converttoHexadecimal(c);
    System.out.print(".");
    converttoHexadecimal(d);
    System.out.println("");
  }
}