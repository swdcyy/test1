package com.kuaishou.commercial.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kuaishou.commercial.config.a;
import ok.x;
import java.lang.Object;
import pw.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qw.f;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import zy.c;
import com.kuaishou.commercial.config.StartupBirthdayInfo;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import zy.a;
import zy.b;
import erd.g;

public class b extends ConfigAutoParseJsonConsumer	// class@0014a7
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = f.a.edit();
          uEditor.putString("adConfig", b.e(p0.mAdConfig));
          uEditor.putInt("requestSplashAdInterval", p0.mRequestSplashAdInterval);
          uEditor.putString("startupBirthdayInfo", b.e(p0.mStartupBirthdayInfo));
          uEditor.putString("ksAdXPath", p0.mXPathJs);
          g.a(uEditor);
          if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
             p0 = f.p(StartupBirthdayInfo.class);
             if (p0 != null && !TextUtils.x(p0.mBirthdayPicUri)) {
                b9.a(c.a);
                c.a = a0.Y(10, TimeUnit.SECONDS).G(d.c).R(a.b, b.b);
             }
          }
       }
       return;
    }
}
