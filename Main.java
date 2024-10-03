import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Enter the IP address from left to right");
    Scanner s = new Scanner(System.in);
    int first = s.nextInt();
    int second = s.nextInt();
    int third = s.nextInt();
    int fourth = s.nextInt();
    System.out.println(first + "." + second + "." + third + "." + fourth);
    IPAddress you = new IPAddress(first, second, third, fourth);
    you.converttoSubnetMask(first, second, third, fourth);
    System.out.println();
    you.printBinary(first, second, third, fourth);
    you.printOctal(first, second, third, fourth);
    you.printHexadecimal(first, second, third, fourth);
  }
}