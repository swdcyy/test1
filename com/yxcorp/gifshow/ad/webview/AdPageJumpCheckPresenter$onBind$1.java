package com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$onBind$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import o49.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import p49.f;
import k59.x0;
import p49.a;

public final class AdPageJumpCheckPresenter$onBind$1 implements DefaultLifecycleObserver	// class@001893
{
    public final AdPageJumpCheckPresenter b;

    public void AdPageJumpCheckPresenter$onBind$1(AdPageJumpCheckPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       g a;
       Object[] objArray;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPageJumpCheckPresenter$onBind$1.class, str)) {
          return;
       }
       a.p(p0, "owner");
       AdPageJumpCheckPresenter$onBind$1 tb = this.b;
       if (tb.s == null && tb.r == null) {
          tb.t = tb.t + 1;
          Objects.requireNonNull(tb);
          AdPageJumpCheckPresenter uAdPageJumpC = AdPageJumpCheckPresenter.class;
          if (!PatchProxy.applyVoid(null, tb, uAdPageJumpC, "5") && ((long)tb.t - tb.w >= 0 && !PatchProxy.applyVoid(null, tb, uAdPageJumpC, "6"))) {
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("page_pause_count", Integer.valueOf(tb.t));
             AdPageJumpCheckPresenter q = tb.q;
             if (q == null) {
                a.S("mFeed");
             }
             PhotoAdvertisement photoAdverti = q.get("AD");
             photoAdverti = (photoAdverti != null)? photoAdverti.mUrl: null;
             jsonObject.c0("url", photoAdverti);
             a = g.a;
             AdPageJumpCheckPresenter q1 = tb.q;
             if (q1 == null) {
                a.S("mFeed");
             }
             a.e(jsonObject, new QPhoto(q1));
             f uof = PatchProxy.apply(null, tb, uAdPageJumpC, str);
             if (uof == PatchProxyResult.class) {
                uof = tb.v.getValue();
             }
             uof.g(new x0(jsonObject));
          }
       }
    label_009a :
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPageJumpCheckPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.d(this, p0);
       AdPageJumpCheckPresenter$onBind$1 tb = this.b;
       tb.s = false;
       tb.r = false;
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
