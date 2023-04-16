package com.yxcorp.gifshow.activity.e$b$a;
import vxc.z;
import com.yxcorp.gifshow.activity.e$b;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.activity.web.JsActivityTabActiveParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import hsa.g;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.ActivityTabActiveResult;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;
import tra.b;
import java.lang.StringBuilder;
import q87.c;

public class e$b$a extends z	// class@001343
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final e$b o;

    public void e$b$a(e$b p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
       this.o = p0;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       super(p1);
    }
    public void i(Serializable p0){
       DynamicTabConfig$ActivityTabConfig mActive;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b$a.class, "1")) {
       }else {
          List list = b.a(0x430040f9).b();
          int i = 0;
          if (p0 != null && !q.f(list)) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   DynamicTabConfig uDynamicTabC = iterator.next();
                   DynamicTabConfig mActivityTab = uDynamicTabC.mActivityTabConfig;
                   if (mActivityTab != null && TextUtils.n(mActivityTab.mActivityId, p0.mActivityId)) {
                      mActive = uDynamicTabC.mActivityTabConfig.mActive;
                   label_0048 :
                      ActivityTabActiveResult uActivityTab = new ActivityTabActiveResult();
                      int i1 = -1;
                      int i2 = (mActive != null)? 1: -1;
                      uActivityTab.mResult = i2;
                      if (mActive != null) {
                         i1 = 1;
                      }
                      uActivityTab.mState = i1;
                      this.o.l(this.k, uActivityTab, this.l, this.m, null, this.n);
                      Object[] objArray = new Object[i];
                      b.C().w("ActivityTabActiveFunction", "active:"+mActive, objArray);
                      break ;
                   }
                }
             }
          }
          mActive = null;
          goto label_0048 ;
       }
       return;
    }
}
