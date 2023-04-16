package com.google.common.collect.DenseImmutableTable$Row;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.DenseImmutableTable;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;

public final class DenseImmutableTable$Row extends DenseImmutableTable$ImmutableArrayMap	// class@0017c1
{
    public final int rowIndex;
    public final DenseImmutableTable this$0;

    public void DenseImmutableTable$Row(DenseImmutableTable p0,int p1){
       this.this$0 = p0;
       super(p0.rowCounts[p1]);
       this.rowIndex = p1;
    }
    public Object getValue(int p0){
       return this.this$0.values[this.rowIndex][p0];
    }
    public boolean isPartialView(){
       return true;
    }
    public ImmutableMap keyToIndex(){
       return this.this$0.columnKeyToIndex;
    }
}
