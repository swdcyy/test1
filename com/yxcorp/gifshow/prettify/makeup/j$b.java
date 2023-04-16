package com.yxcorp.gifshow.prettify.makeup.j$b;
import o0c.e;
import com.yxcorp.gifshow.prettify.makeup.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import f1c.d0;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import g9c.a;
import java.util.Iterator;
import java.util.List;
import f1c.q1;
import ok.o;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import xyb.a;
import q87.c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import f1c.f0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class j$b implements e	// class@001187
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       MakeupGroup$a a;
       j$b uob = j$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, str)) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob, oj, str)) {
          uob.d.x(p0);
          MakeupGroup$a uoa = uob.e.X0(p0);
          oj = uob.c;
          Objects.requireNonNull(oj);
          JsonObject obj = PatchProxy.applyOneRefs(uoa, oj, b0.class, "24");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = Iterators.t(oj.e.iterator(), new q1(uoa)).orNull();
          }
          if (obj == null) {
             Object[] objArray = new Object[0];
             a.D().A("MakeupGroupCtr", "No Child should not happen!", objArray);
          }else {
             uob.b.j(obj.getPosition());
             j f = uob.f;
             a = uoa.a;
             uoa = uoa.b;
             if (!PatchProxy.isSupport(f0.class) || !PatchProxy.applyVoidThreeRefs(f, Integer.valueOf(a), uoa, null, f0.class, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MAKEUP_SWITCH_TAB";
                obj = new JsonObject();
                f0.a(obj, a, uoa);
                uElementPack.params = obj.toString();
                u1.M("", f, 1, uElementPack, null, null);
             }
          }
       }
       return;
    }
}
