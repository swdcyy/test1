package com.google.protobuf.Internal$MapAdapter$IteratorAdapter;
import java.util.Iterator;
import com.google.protobuf.Internal$MapAdapter;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.protobuf.Internal$MapAdapter$EntryAdapter;

public class Internal$MapAdapter$IteratorAdapter implements Iterator	// class@000453
{
    public final Iterator realIterator;
    public final Internal$MapAdapter this$0;

    public void Internal$MapAdapter$IteratorAdapter(Internal$MapAdapter p0,Iterator p1){
       this.this$0 = p0;
       super();
       this.realIterator = p1;
    }
    public boolean hasNext(){
       return this.realIterator.hasNext();
    }
    public Object next(){
       return this.next();
    }
    public Map$Entry next(){
       return new Internal$MapAdapter$EntryAdapter(this.this$0, this.realIterator.next());
    }
    public void remove(){
       this.realIterator.remove();
    }
}
