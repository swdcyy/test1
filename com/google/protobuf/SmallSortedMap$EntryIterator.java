package com.google.protobuf.SmallSortedMap$EntryIterator;
import java.util.Iterator;
import com.google.protobuf.SmallSortedMap;
import java.lang.Object;
import com.google.protobuf.SmallSortedMap$1;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Map$Entry;
import java.lang.IllegalStateException;
import java.lang.String;

public class SmallSortedMap$EntryIterator implements Iterator	// class@0004b0
{
    public Iterator lazyOverflowIterator;
    public boolean nextCalledBeforeRemove;
    public int pos;
    public final SmallSortedMap this$0;

    public void SmallSortedMap$EntryIterator(SmallSortedMap p0){
       this.this$0 = p0;
       super();
       this.pos = -1;
    }
    public void SmallSortedMap$EntryIterator(SmallSortedMap p0,SmallSortedMap$1 p1){
       super(p0);
    }
    public final Iterator getOverflowIterator(){
       if (this.lazyOverflowIterator == null) {
          this.lazyOverflowIterator = this.this$0.overflowEntries.entrySet().iterator();
       }
       return this.lazyOverflowIterator;
    }
    public boolean hasNext(){
       int i = 1;
       if ((this.pos + i) >= this.this$0.entryList.size() && (this.this$0.overflowEntries.isEmpty() || !this.getOverflowIterator().hasNext())) {
          i = false;
       }
       return i;
    }
    public Object next(){
       return this.next();
    }
    public Map$Entry next(){
       this.nextCalledBeforeRemove = true;
       int i = this.pos + true;
       this.pos = i;
       if (i < this.this$0.entryList.size()) {
          return this.this$0.entryList.get(this.pos);
       }
       return this.getOverflowIterator().next();
    }
    public void remove(){
       if (this.nextCalledBeforeRemove == null) {
          throw new IllegalStateException("remove\(\) was called before next\(\)");
       }
       this.nextCalledBeforeRemove = false;
       this.this$0.checkMutable();
       if (this.pos < this.this$0.entryList.size()) {
          SmallSortedMap$EntryIterator tpos = this.pos;
          this.pos = tpos - 1;
          this.this$0.removeArrayEntryAt(tpos);
       }else {
          this.getOverflowIterator().remove();
       }
       return;
    }
}
