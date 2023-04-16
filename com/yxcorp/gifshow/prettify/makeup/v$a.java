package com.yxcorp.gifshow.prettify.makeup.v$a;
import hka.h;
import com.yxcorp.gifshow.prettify.makeup.v;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.makeup.b0;
import f1c.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import g9c.a;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.yxcorp.gifshow.prettify.makeup.l;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import f1c.f0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.prettify.makeup.d;
import p0c.f;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Objects;
import xyb.a;
import java.lang.StringBuilder;
import w46.b;
import android.animation.Animator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.prettify.makeup.e0;

public class v$a implements h	// class@001199
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
       }else {
          MakeupSuite makeupSuite = this.b.f.i().m1();
          if (makeupSuite == null || p0 == null) {
             Object[] objArray = new Object[0];
             a.D().t("MakeupPartsTabController", "onItemSelectError", objArray);
          }else {
             v$a tb = this.b;
             tb.a.x(tb.d.P0(p0));
             this.b.f.h().i1(p0);
             this.b.f.n().m(this.b.f.h().h1());
             v f = this.b.f;
             f.f(f.h().g1());
             MakeupPart makeupPart = this.b.c();
             MakeupGroup$a uoa = this.b.f.p();
             if (!PatchProxy.applyVoidThreeRefs(makeupSuite, makeupPart, uoa, null, f0.class, "6") && makeupPart != null) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SELECT_MAKEUP_PART";
                JsonObject jsonObject = new JsonObject();
                f0.f(jsonObject, makeupSuite);
                f0.c(jsonObject, makeupPart);
                if (uoa != null) {
                   f0.a(jsonObject, uoa.a, uoa.b);
                }
                uElementPack.params = jsonObject.toString();
                u1.u(1, uElementPack, null);
             }
             m om = d.a().b(this.b.f.b().h());
             SimpleMagicFace mId = makeupSuite.mId;
             MakeupPart mId1 = p0.mId;
             Objects.requireNonNull(om);
             if (!PatchProxy.applyVoidTwoRefs(mId, mId1, om, m.class, "16")) {
                MakeupSuite makeupSuite1 = om.h(mId);
                if (makeupSuite1 != null) {
                   MakeupPart part = makeupSuite1.getPart(mId1);
                   if (part == null) {
                      Object[] objArray1 = new Object[0];
                      a.D().t("MakeupModel", "MakeUpPartError:"+mId1, objArray1);
                   }else {
                      makeupSuite1.setSelectedPart(part.mId);
                   }
                }
             }
             f = this.b.j;
             if (f != null && f.isRunning()) {
                this.b.j.cancel();
             }
             if (!this.b.f.g().getVisibility()) {
                f = this.b.j;
                if (f != null && f.isRunning()) {
                   this.b.j.cancel();
                }
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                uArrayList.add(this.b.f.c());
                uArrayList1.add(this.b.f.n().getFilterItemList());
                uArrayList1.add(this.b.f.n().getGoBackBtn());
                v$a tb1 = this.b;
                tb1.j = e0.e(uArrayList, tb1.f.g(), this.b.f.n().f, this.b.f.n(), uArrayList1);
             }
             f0.g(makeupSuite, p0, this.b.f.p());
          }
       }
       return;
    }
}
