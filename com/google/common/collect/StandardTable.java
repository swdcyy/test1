package com.google.common.collect.StandardTable;
import java.io.Serializable;
import com.google.common.collect.d;
import java.util.Map;
import ok.x;
import java.util.Iterator;
import com.google.common.collect.StandardTable$b;
import java.util.Set;
import java.lang.Object;
import com.google.common.collect.StandardTable$c;
import com.google.common.collect.StandardTable$e;
import com.google.common.collect.StandardTable$f;
import java.util.Collection;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable$d;
import com.google.common.collect.StandardTable$h;
import ok.n;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import com.google.common.collect.StandardTable$g;

public class StandardTable extends d implements Serializable	// class@000521
{
    public final Map backingMap;
    public Set d;
    public Map e;
    public StandardTable$f f;
    public final x factory;
    public static final long serialVersionUID;

    public void StandardTable(Map p0,x p1){
       super();
       this.backingMap = p0;
       this.factory = p1;
    }
    public Iterator cellIterator(){
       return new StandardTable$b(this);
    }
    public Set cellSet(){
       return super.cellSet();
    }
    public void clear(){
       this.backingMap.clear();
    }
    public Map column(Object p0){
       return new StandardTable$c(this, p0);
    }
    public Set columnKeySet(){
       StandardTable td = this.d;
       if (td == null) {
          td = new StandardTable$e(this);
          this.d = td;
       }
       return td;
    }
    public Map columnMap(){
       StandardTable tf = this.f;
       if (tf == null) {
          tf = new StandardTable$f(this);
          this.f = tf;
       }
       return tf;
    }
    public boolean contains(Object p0,Object p1){
       boolean b = (p0 != null && (p1 != null && super.contains(p0, p1)))? true: false;
       return b;
    }
    public boolean containsColumn(Object p0){
       if (p0 == null) {
          return false;
       }
       Iterator iterator = this.backingMap.values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (Maps.x(iterator.next(), p0)) {
             break ;
          }
       }
       return true;
    }
    public boolean containsMapping(Object p0,Object p1,Object p2){
       boolean b = (p2 != null && p2.equals(this.get(p0, p1)))? true: false;
       return b;
    }
    public boolean containsRow(Object p0){
       boolean b = (p0 != null && Maps.x(this.backingMap, p0))? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       boolean b = (p0 != null && super.containsValue(p0))? true: false;
       return b;
    }
    public Iterator createColumnKeyIterator(){
       return new StandardTable$d(this);
    }
    public Map createRowMap(){
       return new StandardTable$h(this);
    }
    public Object get(Object p0,Object p1){
       p0 = (p0 == null || p1 == null)? null: super.get(p0, p1);
       return p0;
    }
    public boolean isEmpty(){
       return this.backingMap.isEmpty();
    }
    public Object put(Object p0,Object p1,Object p2){
       n.j(p0);
       n.j(p1);
       n.j(p2);
       Map map = this.backingMap.get(p0);
       if (map == null) {
          map = this.factory.get();
          this.backingMap.put(p0, map);
       }
       return map.put(p1, p2);
    }
    public Object remove(Object p0,Object p1){
       Object obj = null;
       if (p0 == null || p1 == null) {
          return obj;
       }
       Map map = Maps.y(this.backingMap, p0);
       if (map == null) {
          return obj;
       }
       p1 = map.remove(p1);
       if (map.isEmpty()) {
          this.backingMap.remove(p0);
       }
       return p1;
    }
    public Map removeColumn(Object p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.backingMap.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object obj = uEntry.getValue().remove(p0);
          if (obj != null) {
             linkedHashMa.put(uEntry.getKey(), obj);
             if (uEntry.getValue().isEmpty()) {
                iterator.remove();
             }
          }
       }
       return linkedHashMa;
    }
    public boolean removeMapping(Object p0,Object p1,Object p2){
       if (!this.containsMapping(p0, p1, p2)) {
          return false;
       }
       this.remove(p0, p1);
       return true;
    }
    public Map row(Object p0){
       return new StandardTable$g(this, p0);
    }
    public Set rowKeySet(){
       return this.rowMap().keySet();
    }
    public Map rowMap(){
       StandardTable te = this.e;
       if (te == null) {
          te = this.createRowMap();
          this.e = te;
       }
       return te;
    }
    public int size(){
       Iterator iterator = this.backingMap.values().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().size();
       }
       return i;
    }
    public Collection values(){
       return super.values();
    }
}
