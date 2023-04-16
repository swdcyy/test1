package com.google.common.collect.Multimaps$a;
import com.google.common.collect.Maps$t;
import qk.g0;
import java.lang.Object;
import ok.n;
import java.util.Set;
import com.google.common.collect.Multimaps$a$a;
import java.util.Collection;

public final class Multimaps$a extends Maps$t	// class@00050e
{
    public final g0 e;

    public void Multimaps$a(g0 p0){
       super();
       n.j(p0);
       this.e = p0;
    }
    public Set a(){
       return new Multimaps$a$a(this);
    }
    public void clear(){
       this.e.clear();
    }
    public boolean containsKey(Object p0){
       return this.e.containsKey(p0);
    }
    public Object get(Object p0){
       p0 = (this.containsKey(p0))? this.e.get(p0): null;
       return p0;
    }
    public boolean isEmpty(){
       return this.e.isEmpty();
    }
    public Set keySet(){
       return this.e.keySet();
    }
    public Object remove(Object p0){
       p0 = (this.containsKey(p0))? this.e.removeAll(p0): null;
       return p0;
    }
    public int size(){
       return this.e.keySet().size();
    }
}
