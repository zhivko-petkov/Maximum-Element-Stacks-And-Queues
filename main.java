package Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCommands = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numOfCommands; i++) {
            String[] command = sc.nextLine().split(" ");
            if(command.length > 1){
                stack.push(Integer.parseInt(command[1]));
            } else if (command.length == 1){

                if(command[0].equals("2")){
                    stack.pop();
                } else if (command[0].equals("3")){
                    System.out.println(Collections.max(stack));
                }
            }

        }
    }
}
