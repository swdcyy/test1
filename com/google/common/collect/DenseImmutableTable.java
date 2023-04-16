package com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.AbstractCollection;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Array;
import java.util.Collection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.List;
import com.google.common.collect.s$a;
import java.lang.Integer;
import java.lang.String;
import ok.n;
import com.google.common.collect.DenseImmutableTable$RowMap;
import com.google.common.collect.DenseImmutableTable$a;
import com.google.common.collect.DenseImmutableTable$ColumnMap;
import com.google.common.collect.ImmutableTable$SerializedForm;
import com.google.common.collect.ImmutableTable;

public final class DenseImmutableTable extends RegularImmutableTable	// class@0017c4
{
    public final int[] cellColumnIndices;
    public final int[] cellRowIndices;
    public final int[] columnCounts;
    public final ImmutableMap columnKeyToIndex;
    public final ImmutableMap columnMap;
    public final int[] rowCounts;
    public final ImmutableMap rowKeyToIndex;
    public final ImmutableMap rowMap;
    public final Object[][] values;

    public void DenseImmutableTable(ImmutableList p0,ImmutableSet p1,ImmutableSet p2){
       super();
       int[] ointArray = new int[]{p1.size(),p2.size()};
       this.values = Array.newInstance(Object.class, ointArray);
       ImmutableMap immutableMap = Maps.l(p1);
       this.rowKeyToIndex = immutableMap;
       ImmutableMap immutableMap1 = Maps.l(p2);
       this.columnKeyToIndex = immutableMap1;
       int[] ointArray1 = new int[immutableMap.size()];
       this.rowCounts = ointArray1;
       ointArray1 = new int[immutableMap1.size()];
       this.columnCounts = ointArray1;
       ointArray1 = new int[p0.size()];
       int[] ointArray2 = new int[p0.size()];
       for (int i = 0; i < p0.size(); i = i + 1) {
          s$a uoa = p0.get(i);
          Object rowKey = uoa.getRowKey();
          Object columnKey = uoa.getColumnKey();
          int i1 = this.rowKeyToIndex.get(rowKey).intValue();
          int i2 = this.columnKeyToIndex.get(columnKey).intValue();
          boolean b = (this.values[i1][i2] == null)? true: false;
          n.h(b, "duplicate key: \(%s, %s\)", rowKey, columnKey);
          this.values[i1][i2] = uoa.getValue();
          DenseImmutableTable trowCounts = this.rowCounts;
          int i3 = trowCounts[i1] + 1;
          trowCounts[i1] = i3;
          trowCounts = this.columnCounts;
          i3 = trowCounts[i2] + 1;
          trowCounts[i2] = i3;
          ointArray1[i] = i1;
          ointArray2[i] = i2;
       }
       this.cellRowIndices = ointArray1;
       this.cellColumnIndices = ointArray2;
       this.rowMap = new DenseImmutableTable$RowMap(this, null);
       this.columnMap = new DenseImmutableTable$ColumnMap(this, null);
       return;
    }
    public ImmutableMap columnMap(){
       return ImmutableMap.copyOf(this.columnMap);
    }
    public Map columnMap(){
       return this.columnMap();
    }
    public ImmutableTable$SerializedForm createSerializedForm(){
       return ImmutableTable$SerializedForm.create(this, this.cellRowIndices, this.cellColumnIndices);
    }
    public Object get(Object p0,Object p1){
       p0 = this.rowKeyToIndex.get(p0);
       p1 = this.columnKeyToIndex.get(p1);
       p0 = (p0 == null || p1 == null)? null: this.values[p0.intValue()][p1.intValue()];
       return p0;
    }
    public s$a getCell(int p0){
       int i = this.cellRowIndices[p0];
       p0 = this.cellColumnIndices[p0];
       Object obj = this.rowKeySet().asList().get(i);
       Object obj1 = this.columnKeySet().asList().get(p0);
       return ImmutableTable.cellOf(obj, obj1, this.values[i][p0]);
    }
    public Object getValue(int p0){
       return this.values[this.cellRowIndices[p0]][this.cellColumnIndices[p0]];
    }
    public ImmutableMap rowMap(){
       return ImmutableMap.copyOf(this.rowMap);
    }
    public Map rowMap(){
       return this.rowMap();
    }
    public int size(){
       return this.cellRowIndices.length;
    }
}
