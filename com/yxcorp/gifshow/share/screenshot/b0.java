package com.yxcorp.gifshow.share.screenshot.b0;
import erd.g;
import java.lang.Object;
import java.io.File;
import o56.c;
import o56.a;
import android.content.Context;
import jxb.a;
import e17.i$b;
import e17.i;

public final class b0 implements g	// class@001c50
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
       super();
    }
    public final void accept(Object p0){
       if (p0.exists()) {
          a.c(a.a().f(), p0);
          p0 = new i$b();
          p0.x(R.string.arg_RES_7f104456);
          p0.l(true);
          i.z(p0);
       }else {
          p0 = new i$b();
          p0.x(R.string.arg_RES_7f1043cb);
          p0.l(true);
          i.z(p0);
       }
       return;
    }
}
