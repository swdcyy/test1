package com.yxcorp.gifshow.camera.record.permission.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import kd9.s;
import com.yxcorp.gifshow.camera.record.base.b;
import kd9.l0;
import gg9.n;
import java.lang.Class;
import erd.g;
import crd.b;

public final class a implements Runnable	// class@000e9c
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       if (tb.d.d(s.g).f != null) {
          tb.g2();
       }else {
          b uob = tb.d.l(l0.class, new n(tb));
          tb.B = uob;
          tb.Y1(uob);
       }
       return;
    }
}
