package com.yxcorp.gifshow.init.module.x0;
import com.yxcorp.gifshow.util.resource.n$c;
import java.lang.Object;
import boc.b;
import com.yxcorp.gifshow.init.module.UpdateConfigModule;
import com.yxcorp.gifshow.util.resource.Category;
import ak5.j;
import boc.z;
import java.lang.Throwable;

public final class x0 implements n$c	// class@0019e2
{
    public static final x0 a;

    static {
       x0.a = new x0();
    }
    public void x0(){
       super();
    }
    public final void a(b p0){
       if (p0 == Category.MESSAGE_EMOJI) {
          j.o().x(false);
       }
       return;
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       z.a(this, p0);
    }
    public void d(b p0,Throwable p1){
       z.b(this, p0, p1);
    }
}
