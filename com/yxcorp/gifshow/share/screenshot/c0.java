package com.yxcorp.gifshow.share.screenshot.c0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import n80.b;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import e17.i$b;
import e17.i;

public final class c0 implements g	// class@001c52
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       b.C().w("ScreenShotShare3", "downloadScreenSnapShotBmp"+p0.getMessage(), objArray);
       p0 = new i$b();
       p0.x(R.string.arg_RES_7f1043cb);
       p0.l(true);
       i.z(p0);
    }
}
