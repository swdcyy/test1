package com.yxcorp.gifshow.activity.e$c$a;
import vxc.z;
import com.yxcorp.gifshow.activity.e$c;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.activity.web.JsActivityTabParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wkd.b;
import hsa.g;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ResourceConfig;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import oe6.g;
import org.greenrobot.eventbus.a;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;

public class e$c$a extends z	// class@001345
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final e$c o;

    public void e$c$a(e$c p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
       this.o = p0;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       super(p1);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c$a.class, "1")) {
       }else {
          e$c$a to = this.o;
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoidOneRefs(p0, to, e$c.class, "2")) {
             List list = b.a(0x430040f9).b();
             if (p0 != null && !TextUtils.x(p0.mActivityId)) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   DynamicTabConfig uDynamicTabC = iterator.next();
                   DynamicTabConfig mActivityTab = uDynamicTabC.mActivityTabConfig;
                   if (mActivityTab != null && (uDynamicTabC.mResourceConfig != null && TextUtils.n(p0.mActivityId, mActivityTab.mActivityId))) {
                      uDynamicTabC.mResourceConfig.mResourceName = p0.mResourceName;
                      g.a(n.b().edit().putString("home_activity_tab_template_"+p0.mActivityId, TextUtils.I(p0.mResourceName)));
                      a.d().k(p0);
                   }
                }
             }
          }
          FunctionResultParams uFunctionRes = new FunctionResultParams();
          uFunctionRes.mResult = 1;
          this.o.l(this.k, uFunctionRes, this.l, this.m, null, this.n);
       }
       return;
    }
}
