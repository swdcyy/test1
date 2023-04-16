package com.yxcorp.gifshow.profile.adapter.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.adapter.f;
import com.yxcorp.gifshow.profile.adapter.g$a;
import java.lang.Object;
import vm5.o;

public class d extends Accessor	// class@001209
{
    public final g$a c;
    public final f d;

    public void d(f p0,g$a p1){
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
