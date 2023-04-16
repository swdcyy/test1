package com.yxcorp.gifshow.profile.adapter.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.adapter.f;
import com.yxcorp.gifshow.profile.adapter.g$a;
import java.lang.Object;
import k2b.t2$a;

public class a extends Accessor	// class@001206
{
    public final g$a c;
    public final f d;

    public void a(f p0,g$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
