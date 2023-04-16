package com.yxcorp.gifshow.init.h;
import java.lang.Runnable;
import java.lang.Object;
import o56.d;
import al0.a;
import pxa.d;
import java.lang.String;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import com.kuaishou.android.security.KSecurity;
import com.kuaishou.android.security.internal.common.KSecurityContext$Feature;
import com.kwai.framework.deviceid.h;
import h30.a;
import qe6.b;
import android.app.Application;
import o56.a;
import android.content.Context;

public final class h implements Runnable	// class@0011c8
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       if (d.i && !a.c()) {
          d.c();
          if (TextUtils.x(a.j())) {
             KSecurity.getkSecurityParameterContext().setWithFeature(KSecurityContext$Feature.ALL);
             if (h.h()) {
                a.h();
             }
             a.Y(a.c(a.b(), b.a()));
          }else if(a.f(a.b())){
             a.V("");
             a.Y("");
          }
       }
       return;
    }
}
