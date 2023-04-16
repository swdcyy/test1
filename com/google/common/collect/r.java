package com.google.common.collect.r;
import qk.s;
import com.google.common.collect.StandardTable$g;
import java.util.Map$Entry;
import java.lang.Object;
import ok.k;
import ok.n;

public class r extends s	// class@0018cf
{
    public final Map$Entry b;
    public final StandardTable$g c;

    public void r(StandardTable$g p0,Map$Entry p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object delegate(){
       return this.q();
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (k.a(this.getKey(), p0.getKey()) && k.a(this.getValue(), p0.getValue()))) {
          b = true;
       }
    label_0024 :
       return b;
    }
    public Map$Entry q(){
       return this.b;
    }
    public Object setValue(Object p0){
       n.j(p0);
       return super.setValue(p0);
    }
}
