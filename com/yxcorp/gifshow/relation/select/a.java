package com.yxcorp.gifshow.relation.select.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.h;
import com.yxcorp.gifshow.relation.select.v$a;
import java.lang.Object;
import com.yxcorp.gifshow.relation.select.v;

public class a extends Accessor	// class@00198c
{
    public final v$a c;
    public final h d;

    public void a(h p0,v$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
