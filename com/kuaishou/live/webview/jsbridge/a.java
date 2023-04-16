package com.kuaishou.live.webview.jsbridge.a;
import lq3.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import o63.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.util.ArrayList;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import androidx.fragment.app.Fragment;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.utility.n;
import java.lang.Exception;
import lq3.h;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.yoda.function.c;

public class a extends d	// class@001009
{
    public final a g;

    public void a(YodaBaseWebView p0,a p1){
       super(p0);
       this.g = p1;
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object[] objArray;
       Activity uActivity1;
       a uoa = a.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       objArray = null;
       String str = "2";
       Object[] objArray1 = PatchProxy.applyWithListener(objArray, objArray, uoa, str);
       if (objArray1 != PatchProxyResult.class) {
       }else {
          Activity uActivity = ActivityContext.g().e();
          if (uActivity instanceof GifshowActivity) {
             uActivity1 = uActivity;
          }
          PatchProxy.onMethodExit(uoa, str);
          objArray1 = uActivity1;
       }
       if (objArray1 == null || objArray1.isFinishing()) {
          this.o(p0, p1, p2, 0x1e84a, "current page is finished", p4);
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.addAll(objArray1.getSupportFragmentManager().getFragments());
          if (!objArray1 instanceof KwaiYodaWebViewActivity && this.g.t() != null) {
             uArrayList.addAll(this.g.t().getChildFragmentManager().getFragments());
          }
          if (q.f(uArrayList)) {
             return;
          }else {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof WebViewFragment) {
                   i1 = 1;
                }
                if (uFragment instanceof DialogContainerFragment) {
                   try{
                      uFragment.dismissAllowingStateLoss();
                      n.C(objArray1);
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                      goto label_0085 ;
                   }
                }
             }
             if (i1) {
                return;
             }else {
                k1.o(new h(this, objArray1));
                return;
             }
          }
       }
    }
    public String c(){
       return "popBack";
    }
    public String d(){
       return "Kwai";
    }
}
