package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class list1 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.addFirst(200);
        list.addLast(300);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        Stack<Integer> stack=new Stack<>();
        stack.push(22);
        stack.push(33);
        stack.push(45);
        stack.pop();
        stack.push(99);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(33));
        System.out.println(stack.get(2));
        System.out.println(stack.empty());
    }
}
