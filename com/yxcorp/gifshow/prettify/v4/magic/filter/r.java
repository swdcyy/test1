package com.yxcorp.gifshow.prettify.v4.magic.filter.r;
import erd.g;
import com.yxcorp.gifshow.prettify.v4.magic.filter.z;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import d1c.c;
import androidx.fragment.app.Fragment;
import o1c.w0;
import n1c.l;
import android.view.View;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import java.util.List;
import o1c.x0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o1c.f1;
import java.lang.Runnable;
import android.widget.LinearLayout;

public final class r implements g	// class@0011cf
{
    public final z b;

    public void r(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       z oz = z.class;
       if (!PatchProxy.isSupport(oz) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oz, "6")) {
          tb.O = b;
          tb.z.k(b);
          if (b) {
             tb.N = tb.M.f();
          }
          Object[] objArray = null;
          boolean b1 = false;
          int i = 1;
          if (!b && (!tb.p.isDetached() && (!tb.p.isVisible() || (!PatchProxy.applyVoid(objArray, tb, oz, "14") && tb.M.w())))) {
             w0 ow0 = tb.M.a();
             FilterConfig uFilterConfi1 = (ow0 != null)? ow0.a(): objArray;
             FilterConfig uFilterConfi2 = (uFilterConfi1 == null && tb.N != null)? 1: null;
             if (uFilterConfi1 != null && tb.N == null) {
                uFilterConfi2 = 1;
             }
             if (uFilterConfi1 != null) {
                z n = tb.N;
                if (n != null) {
                   uFilterConfi2 = (uFilterConfi1.mFilterId != n.mFilterId)? 1: null;
                }
             }
             if (uFilterConfi2 != null && (!tb.V8(uFilterConfi1) && !tb.D.b())) {
                if (ow0 == null) {
                   ow0 = new w0(FilterConfig.getEmpty());
                }
                tb.d9(ow0);
             }
          }
       label_00a4 :
          if (!b) {
             z k = tb.K;
             if (k != null && !k.getVisibility()) {
                tb.Z8();
             label_00b7 :
                if (b) {
                   tb.F.Z0(b1);
                   if (!PatchProxy.applyVoid(objArray, tb, oz, "45")) {
                      b = tb.u;
                      if (b != null) {
                         b = b.g();
                         FilterConfig uFilterConfi = tb.u.f();
                         if (tb.u.h() >= 0) {
                            b1 = true;
                         }
                         if (!PatchProxy.isSupport(x0.class) || !PatchProxy.applyVoidThreeRefs(b, uFilterConfi, Boolean.valueOf(b1), null, x0.class, "10")) {
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            String str = "AI_FILTER";
                            uElementPack.action2 = str;
                            uElementPack.type = i;
                            JsonObject jsonObject = new JsonObject();
                            if (b1) {
                               str = "CHANGE";
                            }
                            jsonObject.c0("button_action", str);
                            x0.a(jsonObject, uFilterConfi);
                            x0.b(jsonObject, b);
                            uElementPack.params = jsonObject.toString();
                            u1.u0(3, uElementPack, objArray);
                         }
                      }
                      tb.u = objArray;
                   }
                }else {
                   b = tb.z;
                   if (b != null) {
                      b.postDelayed(new f1(tb), 100);
                   }
                }
             }
          }
          tb.k9();
          goto label_00b7 ;
       }
    label_0132 :
       return;
    }
}
