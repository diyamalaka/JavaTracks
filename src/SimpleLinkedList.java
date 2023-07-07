import java.lang.reflect.Type;
import java.util.*;
class SimpleLinkedList<T>
{
    int head=-1;
    List<T> collections ;
    public SimpleLinkedList()
    {
        collections=new ArrayList<T>();
    }
    public SimpleLinkedList(T[] values)
    {
        collections=new ArrayList<T>();
        collections.addAll(Arrays.asList(values));
        head+=values.length;
    }
    T[] asArray(Type type)
    {
        T[] result= (T[]) new Object[collections.size()];
        for (int i=head;i>=0;i--)
        {
            result[head-i]=collections.get(i);
        }
        return result;
    }
    T pop()
    {
        if(head<0)
            throw new NoSuchElementException();
        T value=collections.get(head);
        collections.remove(head);
        head--;
        return value;
    }
    void push(T value)
    {
        collections.add(value);
        head++;
    }
    void reverse()
    {
        int start=0;
        int end=head;
        while(start<end)
        {
            T temp=collections.get(start);
            collections.set(start,collections.get(end));
            collections.set(end,temp);
            start++;
            end--;
        }
    }
    public int size()
    {
        return head+1;
    }
}