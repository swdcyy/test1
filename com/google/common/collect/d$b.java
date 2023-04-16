package com.google.common.collect.d$b;
import java.util.AbstractSet;
import com.google.common.collect.d;
import java.lang.Object;
import com.google.common.collect.s$a;
import java.util.Map;
import com.google.common.collect.s;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Collection;
import com.google.common.collect.e;
import java.util.Iterator;
import ok.n;

public class d$b extends AbstractSet	// class@0018b0
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof s$a) {
          Map map = Maps.y(this.b.rowMap(), p0.getRowKey());
          if (map != null && e.e(map.entrySet(), Maps.k(p0.getColumnKey(), p0.getValue()))) {
             b = true;
          }
       }
       return b;
    }
    public Iterator iterator(){
       return this.b.cellIterator();
    }
    public boolean remove(Object p0){
       boolean b1;
       boolean b = false;
       if (p0 instanceof s$a) {
          Map map = Maps.y(this.b.rowMap(), p0.getRowKey());
          if (map != null) {
             Set set = map.entrySet();
             p0 = Maps.k(p0.getColumnKey(), p0.getValue());
             try{
                n.j(set);
                b1 = set.remove(p0);
             }catch(java.lang.ClassCastException e0){
                b1 = false;
             }catch(java.lang.NullPointerException e0){
             }
             if (b1) {
                b = true;
             }
          }
       }
       return b;
    }
    public int size(){
       return this.b.size();
    }
}
