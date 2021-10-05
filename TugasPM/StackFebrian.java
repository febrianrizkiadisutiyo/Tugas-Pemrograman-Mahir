package TugasPM;

public class StackFebrian {
    public String[] data;
    public int top = 0;

    public StackFebrian(int n) {
        data = new String[n];
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public boolean isFull() {
        return top == data.length;
    }
    public void push(String value){
        if (!isFull()) {
            data[top] = value;
            top = top+1;
        }else {
            System.out.println("Stack penuh");
        }
    }
    public String pop() {
        if (!isEmpty()) {
            top = top-1;
            String r = data[top];
            return r;
        } else {
            return "-1";
        }
    }
}
