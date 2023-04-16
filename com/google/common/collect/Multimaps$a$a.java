package com.google.common.collect.Multimaps$a$a;
import com.google.common.collect.Maps$g;
import com.google.common.collect.Multimaps$a;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import qk.g0;
import com.google.common.collect.Multimaps$a$a$a;
import ok.h;
import com.google.common.collect.Maps;
import java.lang.Object;
import java.util.Map$Entry;

public class Multimaps$a$a extends Maps$g	// class@00050d
{
    public final Multimaps$a b;

    public void Multimaps$a$a(Multimaps$a p0){
       this.b = p0;
       super();
    }
    public Map b(){
       return this.b;
    }
    public Iterator iterator(){
       return Maps.b(this.b.e.keySet(), new Multimaps$a$a$a(this));
    }
    public boolean remove(Object p0){
       if (!this.contains(p0)) {
          return false;
       }
       this.b.e.keySet().remove(p0.getKey());
       return true;
    }
}
