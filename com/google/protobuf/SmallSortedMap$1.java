package com.google.protobuf.SmallSortedMap$1;
import com.google.protobuf.SmallSortedMap;
import java.util.Map$Entry;
import java.lang.Object;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.Comparable;

public final class SmallSortedMap$1 extends SmallSortedMap	// class@0004a9
{

    public void SmallSortedMap$1(int p0){
       super(p0, null);
    }
    public void makeImmutable(){
       Map$Entry arrayEntryAt;
       if (!this.isImmutable()) {
          int i = 0;
          while (i < this.getNumArrayEntries()) {
             arrayEntryAt = this.getArrayEntryAt(i);
             if (arrayEntryAt.getKey().isRepeated()) {
                arrayEntryAt.setValue(Collections.unmodifiableList(arrayEntryAt.getValue()));
             }
             i = i + 1;
          }
          Iterator iterator = this.getOverflowEntries().iterator();
          while (iterator.hasNext()) {
             arrayEntryAt = iterator.next();
             if (arrayEntryAt.getKey().isRepeated()) {
                arrayEntryAt.setValue(Collections.unmodifiableList(arrayEntryAt.getValue()));
             }
          }
       }
       super.makeImmutable();
       return;
    }
    public Object put(Object p0,Object p1){
       return super.put(p0, p1);
    }
}
