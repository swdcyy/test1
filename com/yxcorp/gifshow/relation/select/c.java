package com.yxcorp.gifshow.relation.select.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.h;
import com.yxcorp.gifshow.relation.select.v$a;
import java.lang.Object;
import java.lang.String;

public class c extends Accessor	// class@00198e
{
    public final v$a c;
    public final h d;

    public void c(h p0,v$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g;
    }
    public void set(Object p0){
       this.c.g = p0;
    }
}
