package com.kuaishou.live.tuna.explain.view.TunaExplainTKRender;
import up3.a;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender$a;
import nsd.u;
import sp3.a;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import com.kuaishou.live.tuna.model.ExplainBundleInfo;
import android.app.Activity;
import android.widget.FrameLayout;
import android.content.Context;
import rx4.b;
import com.kuaishou.live.tuna.explain.view.bridge.TunaLiveExplainBridge;
import tx4.l;
import rx4.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import up3.b$a;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender$refresh$1;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import tx4.o;
import sx4.e$a;
import android.view.View;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender$render$1;

public final class TunaExplainTKRender extends a	// class@000fa2
{
    public a b;
    public ViewGroup c;
    public FrameLayout d;
    public e e;
    public TunaLiveExplainMessage f;
    public static final TunaExplainTKRender$a g;

    static {
       TunaExplainTKRender.g = new TunaExplainTKRender$a(null);
    }
    public void TunaExplainTKRender(){
       super();
    }
    public void c(a p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaExplainTKRender.class, "1")) {
          return;
       }
       a.p(p0, "tunaLiveExplainContext");
       a.p(p1, "viewGroup");
       this.f = p0.d();
       TunaLiveExplainMessage tunaLiveExpl = p0.d();
       if (tunaLiveExpl != null) {
          ExplainBundleInfo mBundleInfo = tunaLiveExpl.getMBundleInfo();
          if (mBundleInfo != null) {
             Activity activity = p0.getActivity();
             if (activity != null) {
                boolean b = true;
                try{
                   this.d = new FrameLayout(activity);
                   this.c = p1;
                   b uob = new b(activity, null, mBundleInfo.getMBundleId(), "EcologyTunaLive");
                   uob.e(mBundleInfo.getMMinBundleVersion());
                   uob.g(b);
                   p0 = uob.a(new TunaLiveExplainBridge(p0, this)).b();
                   this.b = p0;
                   if (p0 != null) {
                      p0.y(b);
                   }
                }catch(java.lang.Exception e7){
                   a ta = this.a;
                   if (ta != null) {
                      ta.f(b, new IllegalArgumentException("create tk error", e7), "PLC_0");
                   }
                }
             }
          }
       }
    }
    public void d(a p0){
       Gson a;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaExplainTKRender.class, "3")) {
          return;
       }
       a.p(p0, "tunaLiveExplainContext");
       TunaLiveExplainMessage tunaLiveExpl = p0.d();
       this.f = tunaLiveExpl;
       if (tunaLiveExpl != null) {
          ExplainBundleInfo mBundleInfo = tunaLiveExpl.getMBundleInfo();
          if (mBundleInfo != null) {
             Activity activity = p0.getActivity();
             if (activity != null) {
                TunaExplainTKRender tb = this.b;
                a uoa = null;
                if (tb != null && (tb != null && !tb.isDestroyed())) {
                   tb = this.b;
                   if (tb != null) {
                      tb.onDestroy();
                   }
                   this.b = uoa;
                }
             label_003a :
                TunaLiveExplainPerfLogger tunaLiveExpl1 = p0.c();
                if (tunaLiveExpl1 != null) {
                   tunaLiveExpl1.g(mBundleInfo.getMBundleId());
                }
                if (tunaLiveExpl1 != null) {
                   tunaLiveExpl1.e();
                }
                b uob = new b(activity, uoa, mBundleInfo.getMBundleId(), "EcologyTunaLive");
                uob.e(mBundleInfo.getMMinBundleVersion());
                b uob1 = uob.a(new TunaLiveExplainBridge(p0, this));
                uob1.g(true);
                uob1 = uob1.b();
                this.b = uob1;
                TunaExplainTKRender$refresh$1 orefresh$1 = new TunaExplainTKRender$refresh$1(this, tunaLiveExpl1);
                a = a.a;
                tb = this.f;
                if (tb != null) {
                   ExplainBundleInfo mBundleInfo1 = tb.getMBundleInfo();
                   if (mBundleInfo1 != null) {
                      uoa = mBundleInfo1.getMData();
                   }
                }
                String str = a.p(uoa);
                a.o(str, "Gsons.KWAI_GSON.toJson\(m\x20\x02odel?.mBundleInfo?.mData\)\x00");
                this.f(uob1, orefresh$1, str);
             }
          }
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, TunaExplainTKRender.class, "5")) {
          return;
       }
       super.destroy();
       TunaExplainTKRender tb = this.b;
       if (tb != null && (tb == null || tb.isDestroyed() != true)) {
          tb = this.b;
          if (tb != null) {
             tb.onDestroy();
          }
          this.b = null;
       }
       return;
    }
    public final b$a e(){
       return this.a;
    }
    public final void f(a p0,o p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TunaExplainTKRender.class, "4")) {
          return;
       }
       if (p0 != null) {
          Object[] objArray = new Object[]{p2};
          p0.n(0x4e20, null, p1, "tuna-explain-card", objArray);
       }
       return;
    }
    public View getContentView(){
       return this.d;
    }
    public void render(){
       ExplainBundleInfo mBundleInfo;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TunaExplainTKRender.class, "2")) {
          return;
       }
       TunaExplainTKRender tb = this.b;
       TunaExplainTKRender$render$1 orender$1 = new TunaExplainTKRender$render$1(this);
       Gson a = a.a;
       TunaExplainTKRender tf = this.f;
       if (tf != null) {
          mBundleInfo = tf.getMBundleInfo();
          if (mBundleInfo != null) {
             objArray = mBundleInfo.getMData();
          }
       }
       String str = a.p(objArray);
       a.o(str, "Gsons.KWAI_GSON.toJson\(m\x20\x02odel?.mBundleInfo?.mData\)\x00");
       this.f(tb, orender$1, str);
       return;
    }
}
