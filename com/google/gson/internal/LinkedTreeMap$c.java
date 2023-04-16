package com.google.gson.internal.LinkedTreeMap$c;
import java.util.AbstractSet;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.Object;
import java.util.Iterator;
import com.google.gson.internal.LinkedTreeMap$c$a;
import com.google.gson.internal.LinkedTreeMap$e;

public final class LinkedTreeMap$c extends AbstractSet	// class@00194e
{
    public final LinkedTreeMap b;

    public void LinkedTreeMap$c(LinkedTreeMap p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       return this.b.containsKey(p0);
    }
    public Iterator iterator(){
       return new LinkedTreeMap$c$a(this);
    }
    public boolean remove(Object p0){
       boolean b = (this.b.removeInternalByKey(p0) != null)? true: false;
       return b;
    }
    public int size(){
       return this.b.size;
    }
}
