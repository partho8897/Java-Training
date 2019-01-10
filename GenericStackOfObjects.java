package training.stack;

public class GenericStackOfObjects<T> {
    private T[] s;
    private int top = -1;
    private int capacity;
    public GenericStackOfObjects(int capacity)
    {
        this.capacity = capacity;
        s = (T[]) new Object[capacity];
    }
    
    private void resize(int n)
    {
        T[] copy = (T[]) new Object[n];
        for(int i = 0 ; i < n ; i++)
        {
            copy[i] = s[i];
        }
        s = copy;
        capacity = n;
    }
    
    public void push(T item)
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
    T peek()
    {
        return s[top];
    }
    public T pop()
    {
        if(!isEmpty())
        {
            T item = s[top];
            s[top] = null;
            top--;
            if(top > 0 && top == capacity / 4)
                resize(capacity/2);
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



