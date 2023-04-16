package com.google.common.collect.Maps$m;
import com.google.common.collect.o$e;
import java.util.Map;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Maps;

public class Maps$m extends o$e	// class@00184e
{
    public final Map b;

    public void Maps$m(Map p0){
       super();
       n.j(p0);
       this.b = p0;
    }
    public Map b(){
       return this.b;
    }
    public void clear(){
       this.b().clear();
    }
    public boolean contains(Object p0){
       return this.b().containsKey(p0);
    }
    public boolean isEmpty(){
       return this.b().isEmpty();
    }
    public Iterator iterator(){
       return Maps.n(this.b().entrySet().iterator());
    }
    public boolean remove(Object p0){
       if (!this.contains(p0)) {
          return false;
       }
       this.b().remove(p0);
       return true;
    }
    public int size(){
       return this.b().size();
    }
}
