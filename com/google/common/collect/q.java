package com.google.common.collect.q;
import qk.b;
import com.google.common.collect.StandardTable$c$b;
import java.util.Map$Entry;
import java.lang.Object;
import java.util.Map;
import com.google.common.collect.StandardTable$c;
import ok.n;

public class q extends b	// class@0018ce
{
    public final Map$Entry b;
    public final StandardTable$c$b c;

    public void q(StandardTable$c$b p0,Map$Entry p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object getKey(){
       return this.b.getKey();
    }
    public Object getValue(){
       return this.b.getValue().get(this.c.e.e);
    }
    public Object setValue(Object p0){
       n.j(p0);
       return this.b.getValue().put(this.c.e.e, p0);
    }
}
