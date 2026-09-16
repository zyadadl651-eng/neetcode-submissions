class Solution {
    
    static class MyStack {
        private char[] arr;
        private int top;
        private int capacity;

        public MyStack(int size) {
            capacity = size;
            arr = new char[capacity];
            top = -1;
        }

        public void push(char x) {
            if (!isFull()) {
                arr[++top] = x;
            }
        }

        public char pop() {
            if (!isEmpty()) {
                return arr[top--];
            }
            return '\0'; 
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        MyStack stack = new MyStack(s.length());

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) return false;
                char topChar = stack.pop();

                if ((c == ')' && topChar != '(') ||
                    (c == '}' && topChar != '{') ||
                    (c == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}