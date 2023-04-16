package com.google.common.collect.HashBasedTable;
import com.google.common.collect.StandardTable;
import java.util.Map;
import com.google.common.collect.HashBasedTable$Factory;
import ok.x;
import java.util.LinkedHashMap;
import java.lang.String;
import qk.g;
import com.google.common.collect.Maps;
import com.google.common.collect.s;
import java.util.Set;
import java.lang.Object;
import com.google.common.collect.d;
import java.util.Collection;

public class HashBasedTable extends StandardTable	// class@0004d0
{
    public static final long serialVersionUID;

    public void HashBasedTable(Map p0,HashBasedTable$Factory p1){
       super(p0, p1);
    }
    public static HashBasedTable create(){
       return new HashBasedTable(new LinkedHashMap(), new HashBasedTable$Factory(0));
    }
    public static HashBasedTable create(int p0,int p1){
       g.b(p1, "expectedCellsPerRow");
       return new HashBasedTable(Maps.v(p0), new HashBasedTable$Factory(p1));
    }
    public static HashBasedTable create(s p0){
       HashBasedTable hashBasedTab = HashBasedTable.create();
       hashBasedTab.putAll(p0);
       return hashBasedTab;
    }
    public Set cellSet(){
       return super.cellSet();
    }
    public void clear(){
       super.clear();
    }
    public Map column(Object p0){
       return super.column(p0);
    }
    public Set columnKeySet(){
       return super.columnKeySet();
    }
    public Map columnMap(){
       return super.columnMap();
    }
    public boolean contains(Object p0,Object p1){
       return super.contains(p0, p1);
    }
    public boolean containsColumn(Object p0){
       return super.containsColumn(p0);
    }
    public boolean containsRow(Object p0){
       return super.containsRow(p0);
    }
    public boolean containsValue(Object p0){
       return super.containsValue(p0);
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
    public Object put(Object p0,Object p1,Object p2){
       return super.put(p0, p1, p2);
    }
    public void putAll(s p0){
       super.putAll(p0);
    }
    public Object remove(Object p0,Object p1){
       return super.remove(p0, p1);
    }
    public Map row(Object p0){
       return super.row(p0);
    }
    public Set rowKeySet(){
       return super.rowKeySet();
    }
    public Map rowMap(){
       return super.rowMap();
    }
    public int size(){
       return super.size();
    }
    public String toString(){
       return super.toString();
    }
    public Collection values(){
       return super.values();
    }
}
