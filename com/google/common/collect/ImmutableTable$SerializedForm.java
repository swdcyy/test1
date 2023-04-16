package com.google.common.collect.ImmutableTable$SerializedForm;
import java.io.Serializable;
import java.lang.Object;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.s$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableTable;

public final class ImmutableTable$SerializedForm implements Serializable	// class@00180a
{
    public final int[] cellColumnIndices;
    public final int[] cellRowIndices;
    public final Object[] cellValues;
    public final Object[] columnKeys;
    public final Object[] rowKeys;
    public static final long serialVersionUID;

    public void ImmutableTable$SerializedForm(Object[] p0,Object[] p1,Object[] p2,int[] p3,int[] p4){
       super();
       this.rowKeys = p0;
       this.columnKeys = p1;
       this.cellValues = p2;
       this.cellRowIndices = p3;
       this.cellColumnIndices = p4;
    }
    public static ImmutableTable$SerializedForm create(ImmutableTable p0,int[] p1,int[] p2){
       ImmutableTable$SerializedForm serializedFo = new ImmutableTable$SerializedForm(p0.rowKeySet().toArray(), p0.columnKeySet().toArray(), p0.values().toArray(), p1, p2);
       return v6;
    }
    public Object readResolve(){
       ImmutableTable$SerializedForm tcellValues = this.cellValues;
       if (!tcellValues.length) {
          return ImmutableTable.of();
       }
       int i = 0;
       if (tcellValues.length == 1) {
          return ImmutableTable.of(this.rowKeys[i], this.columnKeys[i], tcellValues[i]);
       }
       ImmutableList$a uoa = new ImmutableList$a(tcellValues.length);
       tcellValues = this.cellValues;
       while (i < tcellValues.length) {
          uoa.h(ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], tcellValues[i]));
          i = i + 1;
       }
       return RegularImmutableTable.forOrderedComponents(uoa.i(), ImmutableSet.copyOf(this.rowKeys), ImmutableSet.copyOf(this.columnKeys));
    }
}
