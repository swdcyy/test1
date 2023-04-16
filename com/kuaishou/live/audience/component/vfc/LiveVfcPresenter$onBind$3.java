package com.kuaishou.live.audience.component.vfc.LiveVfcPresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.audience.component.vfc.LiveVfcPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import android.net.Uri;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.util.Locale;
import tkd.b;
import tkd.d;
import ayb.i;

public final class LiveVfcPresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@000bf1
{

    public void LiveVfcPresenter$onBind$3(LiveVfcPresenter p0){
       super(1, p0, LiveVfcPresenter.class, "showVfcDialog", "showVfcDialog\(Landroid/net/Uri;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVfcPresenter$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LiveVfcPresenter.class, "6")) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("vUserId", p0.getQueryParameter("v_userid"));
          String queryParamet = p0.getQueryParameter("subbiz");
          if (queryParamet != null) {
             Locale rOOT = Locale.ROOT;
             a.o(rOOT, "Locale.ROOT");
             queryParamet = queryParamet.toUpperCase(rOOT);
             a.o(queryParamet, "\(this as java.lang.String\).toUpperCase\(locale\)");
          }else {
             queryParamet = null;
          }
          jsonObject.c0("subBiz", queryParamet);
          jsonObject.c0("activityCoupon", p0.getQueryParameter("activity_coupon"));
          d.a(0x4f878389).IW(jsonObject);
       }
       return;
    }
}
