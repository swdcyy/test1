package com.yxcorp.gifshow.relation.select.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.h;
import com.yxcorp.gifshow.relation.select.v$a;
import java.lang.Object;
import java.lang.Integer;

public class d extends Accessor	// class@00198f
{
    public final v$a c;
    public final h d;

    public void d(h p0,v$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
