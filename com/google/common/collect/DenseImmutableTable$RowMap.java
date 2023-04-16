package com.google.common.collect.DenseImmutableTable$RowMap;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.DenseImmutableTable$a;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.DenseImmutableTable$Row;
import java.lang.Object;

public final class DenseImmutableTable$RowMap extends DenseImmutableTable$ImmutableArrayMap	// class@0017c2
{
    public final DenseImmutableTable this$0;

    public void DenseImmutableTable$RowMap(DenseImmutableTable p0){
       this.this$0 = p0;
       super(p0.rowCounts.length);
    }
    public void DenseImmutableTable$RowMap(DenseImmutableTable p0,DenseImmutableTable$a p1){
       super(p0);
    }
    public ImmutableMap getValue(int p0){
       return new DenseImmutableTable$Row(this.this$0, p0);
    }
    public Object getValue(int p0){
       return this.getValue(p0);
    }
    public boolean isPartialView(){
       return false;
    }
    public ImmutableMap keyToIndex(){
       return this.this$0.rowKeyToIndex;
    }
}
