package com.google.protobuf.SmallSortedMap$EntrySet;
import java.util.AbstractSet;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.SmallSortedMap$1;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Comparable;
import java.util.Iterator;
import com.google.protobuf.SmallSortedMap$EntryIterator;

public class SmallSortedMap$EntrySet extends AbstractSet	// class@0004b1
{
    public final SmallSortedMap this$0;

    public void SmallSortedMap$EntrySet(SmallSortedMap p0){
       this.this$0 = p0;
       super();
    }
    public void SmallSortedMap$EntrySet(SmallSortedMap p0,SmallSortedMap$1 p1){
       super(p0);
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean add(Map$Entry p0){
       if (this.contains(p0)) {
          return false;
       }
       this.this$0.put(p0.getKey(), p0.getValue());
       return true;
    }
    public void clear(){
       this.this$0.clear();
    }
    public boolean contains(Object p0){
       Object obj = this.this$0.get(p0.getKey());
       p0 = p0.getValue();
       boolean b = (obj == p0 || (obj != null && obj.equals(p0)))? true: false;
       return b;
    }
    public Iterator iterator(){
       return new SmallSortedMap$EntryIterator(this.this$0, null);
    }
    public boolean remove(Object p0){
       if (!this.contains(p0)) {
          return false;
       }
       this.this$0.remove(p0.getKey());
       return true;
    }
    public int size(){
       return this.this$0.size();
    }
}
