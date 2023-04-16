package com.yxcorp.gifshow.profile.adapter.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.adapter.f;
import com.yxcorp.gifshow.profile.adapter.g$a;
import java.lang.Object;
import ha5.e;

public class b extends Accessor	// class@001207
{
    public final g$a c;
    public final f d;

    public void b(f p0,g$a p1){
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
