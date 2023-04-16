package com.google.common.collect.d;
import com.google.common.collect.s;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Iterators;
import java.util.Map;
import com.google.common.collect.Maps;
import java.util.Collection;
import com.google.common.collect.d$b;
import com.google.common.collect.d$c;
import com.google.common.collect.s$a;
import java.lang.String;
import com.google.common.collect.d$a;

public abstract class d implements s	// class@000529
{
    public Set b;
    public Collection c;

    public void d(){
       super();
    }
    public abstract Iterator cellIterator();
    public Set cellSet(){
       d tb = this.b;
       if (tb == null) {
          tb = this.createCellSet();
          this.b = tb;
       }
       return tb;
    }
    public void clear(){
       Iterators.d(this.cellSet().iterator());
    }
    public Set columnKeySet(){
       return this.columnMap().keySet();
    }
    public boolean contains(Object p0,Object p1){
       p0 = Maps.y(this.rowMap(), p0);
       boolean b = (p0 != null && Maps.x(p0, p1))? true: false;
       return b;
    }
    public boolean containsColumn(Object p0){
       return Maps.x(this.columnMap(), p0);
    }
    public boolean containsRow(Object p0){
       return Maps.x(this.rowMap(), p0);
    }
    public boolean containsValue(Object p0){
       Iterator iterator = this.rowMap().values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().containsValue(p0)) {
             break ;
          }
       }
       return true;
    }
    public Set createCellSet(){
       return new d$b(this);
    }
    public Collection createValues(){
       return new d$c(this);
    }
    public boolean equals(Object p0){
       boolean b;
       if (p0 == this) {
          b = true;
       }else if(p0 instanceof s){
          b = this.cellSet().equals(p0.cellSet());
       }else {
          b = false;
       }
       return b;
    }
    public Object get(Object p0,Object p1){
       p0 = Maps.y(this.rowMap(), p0);
       p0 = (p0 == null)? null: Maps.y(p0, p1);
       return p0;
    }
    public int hashCode(){
       return this.cellSet().hashCode();
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public Object put(Object p0,Object p1,Object p2){
       return this.row(p0).put(p1, p2);
    }
    public void putAll(s p0){
       Iterator iterator = p0.cellSet().iterator();
       while (iterator.hasNext()) {
          s$a uoa = iterator.next();
          Object rowKey = uoa.getRowKey();
          Object columnKey = uoa.getColumnKey();
          this.put(rowKey, columnKey, uoa.getValue());
       }
       return;
    }
    public Object remove(Object p0,Object p1){
       p0 = Maps.y(this.rowMap(), p0);
       p0 = (p0 == null)? null: Maps.z(p0, p1);
       return p0;
    }
    public Set rowKeySet(){
       return this.rowMap().keySet();
    }
    public String toString(){
       return this.rowMap().toString();
    }
    public Collection values(){
       d tc = this.c;
       if (tc == null) {
          tc = this.createValues();
          this.c = tc;
       }
       return tc;
    }
    public Iterator valuesIterator(){
       return new d$a(this, this.cellSet().iterator());
    }
}
