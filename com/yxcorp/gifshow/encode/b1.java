package com.yxcorp.gifshow.encode.b1;
import erd.o;
import java.lang.Object;
import java.lang.String;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.t;
import pr3.d;

public final class b1 implements o	// class@000d0f
{
    public static final b1 b;

    static {
       b1.b = new b1();
    }
    public void b1(){
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxExportTask: cache path ="+p0+";", objArray);
       p0 = (TextUtils.x(p0))? t.empty(): t.just(new d(p0));
       return p0;
    }
}
