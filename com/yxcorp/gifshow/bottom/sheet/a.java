package com.yxcorp.gifshow.bottom.sheet.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.a0;
import qa9.e;
import qa9.f;
import erd.g;
import crd.b;

public final class a implements Runnable	// class@001c62
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Object[] objArray = new Object[]{tb.c};
       f.d("Content[%1$s] is created.", objArray);
       tb.a(a0.Z(50, TimeUnit.MILLISECONDS, d.c).G(d.a).R(new e(tb), new f(tb)));
    }
}
