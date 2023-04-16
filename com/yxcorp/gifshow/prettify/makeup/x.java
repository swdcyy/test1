package com.yxcorp.gifshow.prettify.makeup.x;
import erd.g;
import com.yxcorp.gifshow.prettify.makeup.y;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import f1c.e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import n1c.l;
import android.view.ViewGroup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.prettify.makeup.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import f1c.f0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import f1c.u0;
import java.lang.Runnable;
import android.widget.LinearLayout;

public final class x implements g	// class@00119f
{
    public final y b;

    public void x(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       tb.T = p0.booleanValue();
       tb.I.g(p0.booleanValue());
       tb.B.k(p0.booleanValue());
       int i = 0;
       PrettifyConfigView.n = i;
       if (!p0.booleanValue()) {
          if (tb.G.b()) {
             tb.G.e();
          }
          y r = tb.R;
          if (r != null && tb.K != null) {
             r.setVisibility(i);
          }
          r = tb.D;
          if (r != null) {
             tb.d9(r.m1());
          }
       }
       if (p0.booleanValue()) {
          if (!PatchProxy.applyVoid(null, tb, y.class, "10")) {
             p0 = tb.S;
             if (p0 != null) {
                MakeupSuite recoSuite = p0.getRecoSuite();
                y p = tb.p;
                boolean b = (tb.S.getRecoIndex() >= 0)? true: false;
                if (!PatchProxy.isSupport(f0.class) || !PatchProxy.applyVoidFourRefs(p0, recoSuite, p, Boolean.valueOf(b), null, f0.class, "20")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   String str = "AI_MAKEUP";
                   uElementPack.action2 = str;
                   JsonObject jsonObject = new JsonObject();
                   if (b) {
                      str = "CHANGE";
                   }
                   jsonObject.c0("button_action", str);
                   f0.e(jsonObject, recoSuite);
                   f0.d(jsonObject, p0);
                   uElementPack.params = jsonObject.toString();
                   u1.D0("", p, 3, uElementPack, new ClientContent$ContentPackage(), null);
                }
             }
             tb.S = null;
          }
          tb.D.h1(i);
       }else {
          p0 = tb.A;
          if (p0 != null) {
             p0.postDelayed(new u0(tb), 100);
          }
       }
       return;
    }
}
