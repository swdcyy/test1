package com.yxcorp.gifshow.init.module.b;
import em8.a$a;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule;
import pkd.a;
import pxa.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class b implements a$a	// class@0019b4
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void logCustomEvent(String p0,String p1){
       if (a.a) {
          Object[] objArray = new Object[0];
          e.C().s("AsyncInit", "elastic log : "+p0+" ## "+p1, objArray);
       }
       if (!TextUtils.isEmpty(p1)) {
          b.a(0x4b316083).logCustomEvent(p0, p1);
       }
       return;
    }
}
