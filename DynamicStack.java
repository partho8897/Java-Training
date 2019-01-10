package training.stack;

public class DynamicStack {
    private Object[] s;
    private int top = -1;
    private int capacity;
    public DynamicStack(int capacity)
    {
        this.capacity = capacity;
        s = new Object[capacity];
    }
    
    private void resize(int n)
    {
        Object[] copy = new Object[n];
        for(int i = 0 ; i < capacity ; i++)
        {
            copy[i] = s[i];
        }
        s = copy;
        capacity = n;
    }
    
    public void push(Object item)
    {
        if(top == capacity-1)
        {
            resize(2*capacity);
        }
        else
        {
            top++;
            s[top] = item;
        }
        
    }
    Object peek()
    {
        return s[top];
    }
    public Object pop()
    {
        if(!isEmpty())
        {
            Object item = s[--top];
            s[top] = null;
            
            if(top > 0 && top == capacity / 4)
                resize(s.length/4);
            return item;
        }
        return null;
    }
    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }
    int getsize()
    {
        return capacity;
        
    }
}



