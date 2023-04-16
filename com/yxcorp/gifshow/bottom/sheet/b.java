package com.yxcorp.gifshow.bottom.sheet.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.a0;
import qa9.g;
import qa9.h;
import erd.g;
import crd.b;

public final class b implements Runnable	// class@001c63
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Object[] objArray = new Object[]{tb.c};
       f.d("Content[%1$s] is destroyed and container is to be removed", objArray);
       tb.a(a0.Z(50, TimeUnit.MILLISECONDS, d.c).G(d.a).R(new g(tb), new h(tb)));
    }
}
