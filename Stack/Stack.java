package Stack;

public class Stack {
    int stack[] = new int[10];
    int tos;

    // set heigth of stack
    Stack(){
        tos = -1;
    }

    // move elements to stack
    void push(int item){
        if(tos == 9){
            System.out.println("Stack is full!");
        } else{
            stack[++tos] = item;
        }
    }

    // get elements from stack
    int pop(){
        if(tos < 0){
            System.out.println("Stack is not full!");
            return 0;
        } else{
            return stack[tos--];
        }
    }
}
