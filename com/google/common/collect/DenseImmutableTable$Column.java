package com.google.common.collect.DenseImmutableTable$Column;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.DenseImmutableTable;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;

public final class DenseImmutableTable$Column extends DenseImmutableTable$ImmutableArrayMap	// class@0017bd
{
    public final int columnIndex;
    public final DenseImmutableTable this$0;

    public void DenseImmutableTable$Column(DenseImmutableTable p0,int p1){
       this.this$0 = p0;
       super(p0.columnCounts[p1]);
       this.columnIndex = p1;
    }
    public Object getValue(int p0){
       return this.this$0.values[p0][this.columnIndex];
    }
    public boolean isPartialView(){
       return true;
    }
    public ImmutableMap keyToIndex(){
       return this.this$0.rowKeyToIndex;
    }
}
