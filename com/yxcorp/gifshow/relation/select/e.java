package com.yxcorp.gifshow.relation.select.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.h;
import com.yxcorp.gifshow.relation.select.v$a;
import java.lang.Object;
import xl8.b;

public class e extends Accessor	// class@001990
{
    public final v$a c;
    public final h d;

    public void e(h p0,v$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
