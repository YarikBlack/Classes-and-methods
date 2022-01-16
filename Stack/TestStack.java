package Stack;

public class TestStack {
    public static void main(String[] args){
        Stack myStack = new Stack();
        Stack myStack1 = new Stack();

        // set elements in first stack
        for(int i = 0; i < 10; i++) myStack.push(i);
        //set slement in second stack
        for(int i = 10; i < 20; i++) myStack1.push(i);

        // get elements from stacks
        System.out.println("Elements in first Stack: ");
        for(int i = 0; i < 10; i++){
            System.out.println(myStack.pop());
        }

        System.out.println("Elements in second Stack: ");
        for(int i = 0; i < 10; i++){
            System.out.println(myStack1.pop());
        }
    }
}
