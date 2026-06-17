class MinStack {
    Stack <Integer> stack;
    Stack <Integer> minStack;

    public MinStack() {
        stack= new Stack<>();
        minStack= new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty())
            minStack.push(val);
        else
            minStack.push(Math.min(val, minStack.peek()));  //push the minimum value, compare with previously inserted value(at top of minstack)
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
