package com.google.common.collect.SingletonImmutableTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.s$a;
import java.lang.Object;
import ok.n;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.ImmutableTable$SerializedForm;
import com.google.common.collect.ImmutableCollection;
import java.util.Collection;

public class SingletonImmutableTable extends ImmutableTable	// class@00187d
{
    public final Object singleColumnKey;
    public final Object singleRowKey;
    public final Object singleValue;

    public void SingletonImmutableTable(s$a p0){
       super(p0.getRowKey(), p0.getColumnKey(), p0.getValue());
    }
    public void SingletonImmutableTable(Object p0,Object p1,Object p2){
       super();
       n.j(p0);
       this.singleRowKey = p0;
       n.j(p1);
       this.singleColumnKey = p1;
       n.j(p2);
       this.singleValue = p2;
    }
    public ImmutableMap column(Object p0){
       n.j(p0);
       p0 = (this.containsColumn(p0))? ImmutableMap.of(this.singleRowKey, this.singleValue): ImmutableMap.of();
       return p0;
    }
    public Map column(Object p0){
       return this.column(p0);
    }
    public ImmutableMap columnMap(){
       return ImmutableMap.of(this.singleColumnKey, ImmutableMap.of(this.singleRowKey, this.singleValue));
    }
    public Map columnMap(){
       return this.columnMap();
    }
    public ImmutableSet createCellSet(){
       return ImmutableSet.of(ImmutableTable.cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }
    public Set createCellSet(){
       return this.createCellSet();
    }
    public ImmutableTable$SerializedForm createSerializedForm(){
       int[] ointArray = new int[]{0};
       int[] ointArray1 = new int[]{0};
       return ImmutableTable$SerializedForm.create(this, ointArray, ointArray1);
    }
    public ImmutableCollection createValues(){
       return ImmutableSet.of(this.singleValue);
    }
    public Collection createValues(){
       return this.createValues();
    }
    public ImmutableMap rowMap(){
       return ImmutableMap.of(this.singleRowKey, ImmutableMap.of(this.singleColumnKey, this.singleValue));
    }
    public Map rowMap(){
       return this.rowMap();
    }
    public int size(){
       return 1;
    }
}
