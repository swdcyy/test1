package com.google.protobuf.SmallSortedMap$DescendingEntryIterator;
import java.util.Iterator;
import com.google.protobuf.SmallSortedMap;
import java.lang.Object;
import java.util.List;
import com.google.protobuf.SmallSortedMap$1;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import java.lang.UnsupportedOperationException;

public class SmallSortedMap$DescendingEntryIterator implements Iterator	// class@0004aa
{
    public Iterator lazyOverflowIterator;
    public int pos;
    public final SmallSortedMap this$0;

    public void SmallSortedMap$DescendingEntryIterator(SmallSortedMap p0){
       this.this$0 = p0;
       super();
       this.pos = p0.entryList.size();
    }
    public void SmallSortedMap$DescendingEntryIterator(SmallSortedMap p0,SmallSortedMap$1 p1){
       super(p0);
    }
    public final Iterator getOverflowIterator(){
       if (this.lazyOverflowIterator == null) {
          this.lazyOverflowIterator = this.this$0.overflowEntriesDescending.entrySet().iterator();
       }
       return this.lazyOverflowIterator;
    }
    public boolean hasNext(){
       SmallSortedMap$DescendingEntryIterator tpos = this.pos;
       boolean b = (tpos <= null || (tpos <= this.this$0.entryList.size() || this.getOverflowIterator().hasNext()))? true: false;
       return b;
    }
    public Object next(){
       return this.next();
    }
    public Map$Entry next(){
       if (this.getOverflowIterator().hasNext()) {
          return this.getOverflowIterator().next();
       }
       int i = this.pos - 1;
       this.pos = i;
       return this.this$0.entryList.get(i);
    }
    public void remove(){
       throw new UnsupportedOperationException();
    }
}
