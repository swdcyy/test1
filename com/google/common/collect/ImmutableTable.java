package com.google.common.collect.ImmutableTable;
import java.io.Serializable;
import com.google.common.collect.d;
import com.google.common.collect.ImmutableTable$a;
import java.lang.Object;
import com.google.common.collect.s$a;
import ok.n;
import com.google.common.collect.Tables;
import com.google.common.collect.s;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Objects;
import com.google.common.collect.Tables$ImmutableCell;
import java.util.List;
import com.google.common.collect.SparseImmutableTable;
import com.google.common.collect.SingletonImmutableTable;
import qk.t0;
import java.lang.AssertionError;
import com.google.common.collect.ImmutableSet;
import java.lang.UnsupportedOperationException;
import com.google.common.collect.ImmutableMap;
import ok.j;
import java.util.Map;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableTable$SerializedForm;
import java.util.Collection;
import java.lang.String;

public abstract class ImmutableTable extends d implements Serializable	// class@00180c
{

    public void ImmutableTable(){
       super();
    }
    public static ImmutableTable$a builder(){
       return new ImmutableTable$a();
    }
    public static s$a cellOf(Object p0,Object p1,Object p2){
       n.j(p0);
       n.j(p1);
       n.j(p2);
       return Tables.a(p0, p1, p2);
    }
    public static ImmutableTable copyOf(s p0){
       if (p0 instanceof ImmutableTable) {
          return p0;
       }
       ImmutableTable$a uoa = ImmutableTable.builder();
       Iterator iterator = p0.cellSet().iterator();
       while (iterator.hasNext()) {
          s$a uoa1 = iterator.next();
          Objects.requireNonNull(uoa);
          if (uoa1 instanceof Tables$ImmutableCell) {
             n.j(uoa1.getRowKey());
             n.j(uoa1.getColumnKey());
             n.j(uoa1.getValue());
             uoa.a.add(uoa1);
          }else {
             uoa.b(uoa1.getRowKey(), uoa1.getColumnKey(), uoa1.getValue());
          }
       }
       return uoa.a();
    }
    public static ImmutableTable of(){
       return SparseImmutableTable.EMPTY;
    }
    public static ImmutableTable of(Object p0,Object p1,Object p2){
       return new SingletonImmutableTable(p0, p1, p2);
    }
    public Iterator cellIterator(){
       return this.cellIterator();
    }
    public final t0 cellIterator(){
       throw new AssertionError("should never be called");
    }
    public ImmutableSet cellSet(){
       return super.cellSet();
    }
    public Set cellSet(){
       return this.cellSet();
    }
    public final void clear(){
       throw new UnsupportedOperationException();
    }
    public ImmutableMap column(Object p0){
       n.j(p0);
       return j.a(this.columnMap().get(p0), ImmutableMap.of());
    }
    public Map column(Object p0){
       return this.column(p0);
    }
    public ImmutableSet columnKeySet(){
       return this.columnMap().keySet();
    }
    public Set columnKeySet(){
       return this.columnKeySet();
    }
    public abstract ImmutableMap columnMap();
    public Map columnMap(){
       return this.columnMap();
    }
    public boolean contains(Object p0,Object p1){
       boolean b = (this.get(p0, p1) != null)? true: false;
       return b;
    }
    public boolean containsColumn(Object p0){
       return super.containsColumn(p0);
    }
    public boolean containsRow(Object p0){
       return super.containsRow(p0);
    }
    public boolean containsValue(Object p0){
       return this.values().contains(p0);
    }
    public abstract ImmutableSet createCellSet();
    public Set createCellSet(){
       return this.createCellSet();
    }
    public abstract ImmutableTable$SerializedForm createSerializedForm();
    public abstract ImmutableCollection createValues();
    public Collection createValues(){
       return this.createValues();
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public Object get(Object p0,Object p1){
       return super.get(p0, p1);
    }
    public int hashCode(){
       return super.hashCode();
    }
    public boolean isEmpty(){
       return super.isEmpty();
    }
    public final Object put(Object p0,Object p1,Object p2){
       throw new UnsupportedOperationException();
    }
    public final void putAll(s p0){
       throw new UnsupportedOperationException();
    }
    public final Object remove(Object p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public ImmutableMap row(Object p0){
       n.j(p0);
       return j.a(this.rowMap().get(p0), ImmutableMap.of());
    }
    public Map row(Object p0){
       return this.row(p0);
    }
    public ImmutableSet rowKeySet(){
       return this.rowMap().keySet();
    }
    public Set rowKeySet(){
       return this.rowKeySet();
    }
    public abstract ImmutableMap rowMap();
    public Map rowMap(){
       return this.rowMap();
    }
    public String toString(){
       return super.toString();
    }
    public ImmutableCollection values(){
       return super.values();
    }
    public Collection values(){
       return this.values();
    }
    public final Iterator valuesIterator(){
       throw new AssertionError("should never be called");
    }
    public final Object writeReplace(){
       return this.createSerializedForm();
    }
}
