package com.yxcorp.gifshow.init.module.a;
import t45.f;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import pxa.e;
import java.lang.StringBuilder;
import q87.c;

public final class a implements f	// class@0019b1
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void log(String p0,String p1){
       b.a(0x4b316083).logCustomEvent(p0, p1);
       Object[] objArray = new Object[0];
       e.C().t("AsyncLog", " key: "+p0+" ,value: "+p1, objArray);
    }
}
