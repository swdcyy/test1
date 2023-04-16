package com.yxcorp.gifshow.plugin.impl.setting.initmodule.FontScaleInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Application;
import o56.a;
import cw9.f$a;
import xf6.c;
import oe6.e;
import cw9.f;
import cw9.e;

public class FontScaleInitModule extends a	// class@000fe9
{

    public void FontScaleInitModule(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, FontScaleInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 23;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, FontScaleInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void n(){
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FontScaleInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       f$a uoa = new f$a();
       Object obj = PatchProxy.apply(objArray, this, FontScaleInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = c.a();
          b = (b && b != 1)? false: true;
       }
       uoa.b(b);
       uoa.c(e.e());
       uoa.d(e.Q());
       f uof = uoa.a();
       if (!PatchProxy.applyVoidTwoRefs(uApplication, uof, objArray, e.class, "1")) {
          e.f(uApplication, uof);
       }
       return;
    }
}
