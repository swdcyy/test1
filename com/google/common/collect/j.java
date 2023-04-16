package com.google.common.collect.j;
import com.google.common.collect.Multisets$a;
import com.google.common.collect.Multimaps$c$a;
import java.util.Map$Entry;
import java.lang.Object;
import java.util.Collection;

public class j extends Multisets$a	// class@0018bb
{
    public final Map$Entry b;
    public final Multimaps$c$a c;

    public void j(Multimaps$c$a p0,Map$Entry p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public int getCount(){
       return this.b.getValue().size();
    }
    public Object getElement(){
       return this.b.getKey();
    }
}
