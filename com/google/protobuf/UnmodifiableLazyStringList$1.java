package com.google.protobuf.UnmodifiableLazyStringList$1;
import java.util.ListIterator;
import com.google.protobuf.UnmodifiableLazyStringList;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public class UnmodifiableLazyStringList$1 implements ListIterator	// class@0004e1
{
    public ListIterator iter;
    public final UnmodifiableLazyStringList this$0;
    public final int val$index;

    public void UnmodifiableLazyStringList$1(UnmodifiableLazyStringList p0,int p1){
       this.this$0 = p0;
       this.val$index = p1;
       super();
       this.iter = p0.list.listIterator(p1);
    }
    public void add(Object p0){
       this.add(p0);
    }
    public void add(String p0){
       throw new UnsupportedOperationException();
    }
    public boolean hasNext(){
       return this.iter.hasNext();
    }
    public boolean hasPrevious(){
       return this.iter.hasPrevious();
    }
    public Object next(){
       return this.next();
    }
    public String next(){
       return this.iter.next();
    }
    public int nextIndex(){
       return this.iter.nextIndex();
    }
    public Object previous(){
       return this.previous();
    }
    public String previous(){
       return this.iter.previous();
    }
    public int previousIndex(){
       return this.iter.previousIndex();
    }
    public void remove(){
       throw new UnsupportedOperationException();
    }
    public void set(Object p0){
       this.set(p0);
    }
    public void set(String p0){
       throw new UnsupportedOperationException();
    }
}
