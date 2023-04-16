package com.google.protobuf.UnmodifiableLazyStringList$2;
import java.util.Iterator;
import com.google.protobuf.UnmodifiableLazyStringList;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public class UnmodifiableLazyStringList$2 implements Iterator	// class@0004e2
{
    public Iterator iter;
    public final UnmodifiableLazyStringList this$0;

    public void UnmodifiableLazyStringList$2(UnmodifiableLazyStringList p0){
       this.this$0 = p0;
       super();
       this.iter = p0.list.iterator();
    }
    public boolean hasNext(){
       return this.iter.hasNext();
    }
    public Object next(){
       return this.next();
    }
    public String next(){
       return this.iter.next();
    }
    public void remove(){
       throw new UnsupportedOperationException();
    }
}
