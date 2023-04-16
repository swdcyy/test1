package com.yxcorp.gifshow.init.module.DesignWidgetInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.ui.popupmanager.PopupConfigInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kwai.library.widget.emptyview.KwaiEmptyStateInit;
import com.yxcorp.gifshow.init.module.q;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.init.module.r;
import com.yxcorp.gifshow.init.module.s;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.init.module.t;
import com.kwai.sdk.switchconfig.a;
import sz6.a;
import java.lang.reflect.Type;
import com.yxcorp.utility.Log;
import sz6.a$a;
import rz6.a;
import rz6.a$a;
import java.lang.StringBuilder;

public class DesignWidgetInitModule extends a	// class@001977
{
    public static final int q;

    public void DesignWidgetInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 23;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DesignWidgetInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{PopupConfigInitModule.class,ABTestInitModule.class};
       PatchProxy.onMethodExit(DesignWidgetInitModule.class, "2");
       return Lists.e(obj);
    }
    public void n(){
       t a;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, DesignWidgetInitModule.class, "1")) {
          return;
       }
       String str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, this, DesignWidgetInitModule.class, str)) {
          KwaiEmptyStateInit iNSTANCE = KwaiEmptyStateInit.INSTANCE;
          iNSTANCE.setNetworkResolveClickListener(q.b);
          iNSTANCE.setDarkNetworkResolveClickListener(r.b);
          iNSTANCE.setLightNetworkResolveClickListener(s.b);
          PatchProxy.onMethodExit(DesignWidgetInitModule.class, str);
       }
       if (SystemUtil.L(a.b())) {
          String str1 = "appGrayConfigInit";
          if (!PatchProxy.applyVoidWithListener(objArray, this, DesignWidgetInitModule.class, "3")) {
             a = t.a;
             a value = a.t().getValue("appGrayConfig", a.class, new a(false, false, objArray));
             try{
                Log.g(str1, value.toString());
                a$a uoa = new a$a(value.a());
                uoa.b = value.grayPageList;
                if (value.b("ALL")) {
                   uoa.a = true;
                }
                a uoa1 = a.e.a();
                uoa1.b = new a(uoa.c, uoa.a, uoa.b);
                uoa1.c = a;
             }catch(java.lang.Exception e0){
                Log.d(e0, "appGrayConfig fromJson Exception:"+value.toString());
             }
             PatchProxy.onMethodExit(DesignWidgetInitModule.class, "3");
          }
       }
       PatchProxy.onMethodExit(DesignWidgetInitModule.class, "1");
       return;
    }
}
