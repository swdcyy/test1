package com.google.protobuf.SmallSortedMap$DescendingEntrySet;
import com.google.protobuf.SmallSortedMap$EntrySet;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.SmallSortedMap$1;
import java.util.Iterator;
import com.google.protobuf.SmallSortedMap$DescendingEntryIterator;

public class SmallSortedMap$DescendingEntrySet extends SmallSortedMap$EntrySet	// class@0004ab
{
    public final SmallSortedMap this$0;

    public void SmallSortedMap$DescendingEntrySet(SmallSortedMap p0){
       this.this$0 = p0;
       super(p0, null);
    }
    public void SmallSortedMap$DescendingEntrySet(SmallSortedMap p0,SmallSortedMap$1 p1){
       super(p0);
    }
    public Iterator iterator(){
       return new SmallSortedMap$DescendingEntryIterator(this.this$0, null);
    }
}
