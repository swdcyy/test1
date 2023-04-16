package com.google.gson.internal.LinkedTreeMap$b;
import java.util.AbstractSet;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.gson.internal.LinkedTreeMap$e;
import java.util.Iterator;
import com.google.gson.internal.LinkedTreeMap$b$a;

public class LinkedTreeMap$b extends AbstractSet	// class@00056b
{
    public final LinkedTreeMap b;

    public void LinkedTreeMap$b(LinkedTreeMap p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       boolean b = (p0 instanceof Map$Entry && this.b.findByEntry(p0) != null)? true: false;
       return b;
    }
    public Iterator iterator(){
       return new LinkedTreeMap$b$a(this);
    }
    public boolean remove(Object p0){
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       p0 = this.b.findByEntry(p0);
       if (p0 == null) {
          return b;
       }
       this.b.removeInternal(p0, true);
       return true;
    }
    public int size(){
       return this.b.size;
    }
}
