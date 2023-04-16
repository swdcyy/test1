package com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.ImmutableTable;
import java.lang.Iterable;
import java.util.Comparator;
import java.util.LinkedHashSet;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.lang.Object;
import com.google.common.collect.s$a;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import ok.n;
import com.google.common.collect.RegularImmutableTable$a;
import java.util.Collections;
import java.util.AbstractCollection;
import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.SparseImmutableTable;
import com.google.common.collect.RegularImmutableTable$CellSet;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.RegularImmutableTable$Values;

public abstract class RegularImmutableTable extends ImmutableTable	// class@00187a
{

    public void RegularImmutableTable(){
       super();
    }
    public static RegularImmutableTable a(Iterable p0,Comparator p1,Comparator p2){
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       LinkedHashSet linkedHashSe1 = new LinkedHashSet();
       ImmutableList immutableLis = ImmutableList.copyOf(p0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          s$a uoa = iterator.next();
          linkedHashSe.add(uoa.getRowKey());
          linkedHashSe1.add(uoa.getColumnKey());
       }
       ImmutableSet immutableSet = (p1 == null)? ImmutableSet.copyOf(linkedHashSe): ImmutableSet.copyOf(ImmutableList.sortedCopyOf(p1, linkedHashSe));
       ImmutableSet immutableSet1 = (p2 == null)? ImmutableSet.copyOf(linkedHashSe1): ImmutableSet.copyOf(ImmutableList.sortedCopyOf(p2, linkedHashSe1));
       return RegularImmutableTable.forOrderedComponents(immutableLis, immutableSet, immutableSet1);
    }
    public static RegularImmutableTable forCells(Iterable p0){
       return RegularImmutableTable.a(p0, null, null);
    }
    public static RegularImmutableTable forCells(List p0,Comparator p1,Comparator p2){
       n.j(p0);
       if (p1 != null || p2 != null) {
          Collections.sort(p0, new RegularImmutableTable$a(p1, p2));
       }
       return RegularImmutableTable.a(p0, p1, p2);
    }
    public static RegularImmutableTable forOrderedComponents(ImmutableList p0,ImmutableSet p1,ImmutableSet p2){
       DenseImmutableTable uDenseImmuta = ((long)p0.size() - (((long)p1.size() * (long)p2.size()) / 2) > 0)? new DenseImmutableTable(p0, p1, p2): new SparseImmutableTable(p0, p1, p2);
       return uDenseImmuta;
    }
    public final ImmutableSet createCellSet(){
       ImmutableSet immutableSet = (this.isEmpty())? ImmutableSet.of(): new RegularImmutableTable$CellSet(this, null);
       return immutableSet;
    }
    public Set createCellSet(){
       return this.createCellSet();
    }
    public final ImmutableCollection createValues(){
       ImmutableList immutableLis = (this.isEmpty())? ImmutableList.of(): new RegularImmutableTable$Values(this, null);
       return immutableLis;
    }
    public Collection createValues(){
       return this.createValues();
    }
    public abstract s$a getCell(int p0);
    public abstract Object getValue(int p0);
}
