package com.google.common.collect.i;
import qk.s;
import com.google.common.collect.Maps$i$a$a;
import java.util.Map$Entry;
import java.lang.Object;
import com.google.common.collect.Maps$i$a;
import com.google.common.collect.Maps$d;
import ok.n;

public class i extends s	// class@0018ba
{
    public final Map$Entry b;
    public final Maps$i$a$a c;

    public void i(Maps$i$a$a p0,Map$Entry p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object delegate(){
       return this.q();
    }
    public Map$Entry q(){
       return this.b;
    }
    public Object setValue(Object p0){
       n.b(this.c.c.b.f(this.getKey(), p0));
       return super.setValue(p0);
    }
}
