package com.kuaishou.commercial.n;
import msd.l;
import java.lang.String;
import java.lang.Object;
import mxb.j0;
import cw.r;
import erd.g;
import com.yxcorp.utility.TextUtils;

public final class n implements l	// class@00150d
{
    public final int b;
    public final String c;

    public void n(int p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       p0.d(new r(this.b));
       p0.q("apiExtData", TextUtils.i(this.c, ""));
       return null;
    }
}
