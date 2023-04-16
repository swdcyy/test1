package com.google.common.collect.SparseImmutableTable;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import qk.t0;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map;
import java.util.AbstractCollection;
import java.util.List;
import com.google.common.collect.s$a;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.common.collect.ImmutableMap$b;
import java.util.Set;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableTable$SerializedForm;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableCollection;

public final class SparseImmutableTable extends RegularImmutableTable	// class@00187e
{
    public final int[] cellColumnInRowIndices;
    public final int[] cellRowIndices;
    public final ImmutableMap columnMap;
    public final ImmutableMap rowMap;
    public static final ImmutableTable EMPTY;

    static {
       SparseImmutableTable.EMPTY = new SparseImmutableTable(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());
    }
    public void SparseImmutableTable(ImmutableList p0,ImmutableSet p1,ImmutableSet p2){
       Object rowKey;
       Object columnKey;
       Object value;
       Object obj;
       super();
       ImmutableMap immutableMap = Maps.l(p1);
       LinkedHashMap linkedHashMa = Maps.u();
       t0 ot0 = p1.iterator();
       while (ot0.hasNext()) {
          linkedHashMa.put(ot0.next(), new LinkedHashMap());
       }
       LinkedHashMap linkedHashMa1 = Maps.u();
       t0 ot01 = p2.iterator();
       while (ot01.hasNext()) {
          linkedHashMa1.put(ot01.next(), new LinkedHashMap());
       }
       int[] ointArray = new int[p0.size()];
       int[] ointArray1 = new int[p0.size()];
       int i = 0;
       while (true) {
          if (i < p0.size()) {
             s$a uoa = p0.get(i);
             rowKey = uoa.getRowKey();
             columnKey = uoa.getColumnKey();
             value = uoa.getValue();
             ointArray[i] = immutableMap.get(rowKey).intValue();
             Map map = linkedHashMa.get(rowKey);
             ointArray1[i] = map.size();
             obj = map.put(columnKey, value);
             if (obj == null) {
                linkedHashMa1.get(columnKey).put(rowKey, value);
                i = i + 1;
             }else {
                break ;
             }
          }else {
             this.cellRowIndices = ointArray;
             this.cellColumnInRowIndices = ointArray1;
             ImmutableMap$b uob = new ImmutableMap$b(linkedHashMa.size());
             Iterator iterator = linkedHashMa.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Object key = uEntry.getKey();
                uob.c(key, ImmutableMap.copyOf(uEntry.getValue()));
             }
             this.rowMap = uob.a();
             uob = new ImmutableMap$b(linkedHashMa1.size());
             Iterator iterator1 = linkedHashMa1.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                Object key1 = uEntry1.getKey();
                uob.c(key1, ImmutableMap.copyOf(uEntry1.getValue()));
             }
             this.columnMap = uob.a();
             return;
          }
       }
       throw new IllegalArgumentException("Duplicate value for row="+rowKey+", column="+columnKey+": "+value+", "+obj);
    }
    public ImmutableMap columnMap(){
       return ImmutableMap.copyOf(this.columnMap);
    }
    public Map columnMap(){
       return this.columnMap();
    }
    public ImmutableTable$SerializedForm createSerializedForm(){
       ImmutableMap immutableMap = Maps.l(this.columnKeySet());
       int[] ointArray = new int[this.cellSet().size()];
       t0 ot0 = this.cellSet().iterator();
       int i = 0;
       while (ot0.hasNext()) {
          int i1 = i + 1;
          ointArray[i] = immutableMap.get(ot0.next().getColumnKey()).intValue();
          i = i1;
       }
       return ImmutableTable$SerializedForm.create(this, this.cellRowIndices, ointArray);
    }
    public s$a getCell(int p0){
       Map$Entry uEntry = this.rowMap.entrySet().asList().get(this.cellRowIndices[p0]);
       Map$Entry uEntry1 = uEntry.getValue().entrySet().asList().get(this.cellColumnInRowIndices[p0]);
       Object key = uEntry1.getKey();
       return ImmutableTable.cellOf(uEntry.getKey(), key, uEntry1.getValue());
    }
    public Object getValue(int p0){
       return this.rowMap.values().asList().get(this.cellRowIndices[p0]).values().asList().get(this.cellColumnInRowIndices[p0]);
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
