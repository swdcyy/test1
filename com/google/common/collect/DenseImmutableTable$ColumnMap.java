package com.google.common.collect.DenseImmutableTable$ColumnMap;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.DenseImmutableTable$a;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.DenseImmutableTable$Column;
import java.lang.Object;

public final class DenseImmutableTable$ColumnMap extends DenseImmutableTable$ImmutableArrayMap	// class@0017be
{
    public final DenseImmutableTable this$0;

    public void DenseImmutableTable$ColumnMap(DenseImmutableTable p0){
       this.this$0 = p0;
       super(p0.columnCounts.length);
    }
    public void DenseImmutableTable$ColumnMap(DenseImmutableTable p0,DenseImmutableTable$a p1){
       super(p0);
    }
    public ImmutableMap getValue(int p0){
       return new DenseImmutableTable$Column(this.this$0, p0);
    }
    public Object getValue(int p0){
       return this.getValue(p0);
    }
    public boolean isPartialView(){
       return false;
    }
    public ImmutableMap keyToIndex(){
       return this.this$0.columnKeyToIndex;
    }
}
