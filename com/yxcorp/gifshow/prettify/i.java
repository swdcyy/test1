package com.yxcorp.gifshow.prettify.i;
import oc9.b0;
import oh9.v;
import com.yxcorp.gifshow.prettify.e;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.LinkedList;
import com.yxcorp.gifshow.camera.record.base.d;
import l0c.i0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import oc9.q;
import java.util.Iterator;
import oc9.t;
import n1c.m;
import qg9.a;
import android.view.View;
import com.yxcorp.utility.n;
import lnc.r7;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zb9.p0;
import zb9.p0$a;
import hf9.b;
import hf9.b$a;
import oc9.a0;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.yxcorp.gifshow.prettify.beauty.h$a;
import l0c.j0;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.app.Activity;
import lnc.n4;
import r5b.e;
import lnc.i3;
import l0c.k0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import oh9.a3;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import z0c.m;
import qb9.d0;
import com.yxcorp.gifshow.prettify.makeup.h;
import com.yxcorp.gifshow.prettify.beauty.d;
import java.util.Objects;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import lnc.p7;
import w0c.q;
import qr4.k$c;
import com.kuaishou.edit.draft.RecordSlimming;
import w0c.m;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.Beauty;
import kaa.v;
import java.lang.Number;
import com.kuaishou.edit.draft.FeatureId;
import wba.i;
import com.kuaishou.edit.draft.RecordFilter;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.RecordMakeup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.util.ArrayList;
import com.kuaishou.edit.draft.RecordMakeup$SubFeatures;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import java.util.Collection;
import qr4.k$b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oh9.u;
import java.lang.Integer;
import java.lang.Float;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.prettify.h;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import q0c.i2;
import h16.n;
import ge9.c;
import com.yxcorp.gifshow.prettify.beauty.z;
import h16.o;
import wc9.v;
import com.kuaishou.edit.draft.Asset$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.prettify.beauty.y;
import ng9.c;
import com.yxcorp.gifshow.prettify.makeup.g0;
import z0c.z;
import ce9.l;

public class i extends e implements b0, v	// class@001158
{
    public final LinkedList O;
    public PostBubbleManager P;
    public boolean Q;

    public void i(CameraPageType p0,b p1){
       super(p0, p1);
       this.O = new LinkedList();
       this.Q = false;
       this.d.n(v.class, new i0(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.A0();
          }
       }
       boolean b = true;
       this.v2(b);
       this.B.a();
       if (!a.a(this.d) && !this.A2()) {
          n.Y(this.s, 0, b);
       }
       if (this.Q != null) {
          this.O.add(r7.a.a(this.h));
          this.Q = false;
       }
       return;
    }
    public final boolean A2(){
       Object obj = PatchProxy.apply(null, this, i.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.d(p0.j.a()).c() || this.d.d(b.c.a()).a())? true: false;
       return b;
    }
    public void E0(){
       if (PatchProxy.applyVoid(null, this, i.class, "10")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.E0();
          }
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.I7();
          }
       }
       this.v2(false);
       this.B.a();
       if (!this.A2()) {
          n.Y(this.s, 4, true);
       }
       this.Q = true;
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void L3(a p0){
       a3 c;
       d0 a;
       d0 e;
       int i;
       int i1;
       String str;
       String str1;
       k$b uob;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "17")) {
          return;
       }
       super.L3(p0);
       if (p0 == null) {
          c.a(new j0(this, this.z2(true, p0)));
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.params = (n4.e(this.e))? e.b(null): this.k2(i3.f()).e();
          c.a(new k0(this, this.z2(true, p0), uElementPack));
          p0.e.F1(this.O);
          if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "19")) {
             a3 uoa3 = this.d.d(a3.d);
             if (uoa3.a != null) {
                c = uoa3.c;
                if (c == null || (c.v() != null && !uoa3.c.v().getAssetsList().isEmpty())) {
                   Iterator iterator = this.getChildren().iterator();
                   e uoe = null;
                   while (iterator.hasNext()) {
                      t ot = iterator.next();
                      if (ot instanceof m) {
                         ot.v2(p0, this.q.c);
                      }else if(ot instanceof h){
                         ot.u2(p0, this.q.d);
                      }else if(ot instanceof d){
                         t ot1 = ot;
                         e tq = this.q;
                         a = tq.a;
                         d0 b = tq.b;
                         Objects.requireNonNull(ot1);
                         if (!PatchProxy.applyVoidThreeRefs(p0, a, b, ot1, d.class, "31")) {
                            p7.b(p0.e, a, p7.a(a), b);
                         }
                      }else if(ot instanceof q){
                         e = this.q.e;
                         Objects.requireNonNull(ot);
                         q oq = q.class;
                         if (!PatchProxy.applyVoidTwoRefs(p0, e, ot, oq, "8") && !PatchProxy.applyVoidTwoRefs(p0, e, ot, oq, "9")) {
                            i = e.size();
                            k$c[] uocArray = new k$c[i];
                            i1 = 0;
                            int i2 = 1;
                            while (i1 < i) {
                               RecordSlimming recordSlimmi = e.get(i1);
                               int i3 = i1 + 1;
                               uocArray[i1] = m.b(recordSlimmi, i3);
                               i2 = (i2 && recordSlimmi.getIsAllNoneValue())? 1: 0;
                               i1 = i3;
                            }
                            int i4 = i2 ^ 0x01;
                            p0.e.u0(uocArray, i4);
                         }
                      }
                      if (!this.q.f.isEmpty()) {
                         p0.e.F1(this.q.f);
                      }
                   }
                   List assetsList = uoa3.c.v().getAssetsList();
                   e tq1 = this.q;
                   Objects.requireNonNull(tq1);
                   if (!PatchProxy.applyVoid(null, tq1, d0.class, "1")) {
                      tq1.a = null;
                      tq1.b.clear();
                      tq1.c.clear();
                      tq1.d.clear();
                      tq1.e.clear();
                      tq1.f.clear();
                   }
                   int i5 = 0;
                   while (i5 < assetsList.size()) {
                      Asset uAsset = assetsList.get(i5);
                      int i6 = assetsList.size() - true;
                      if (i5 == i6) {
                         e tq2 = this.q;
                         if (uAsset != null && (!uAsset.hasShootInfo() || !uAsset.getShootInfo().hasBeauty())) {
                            str = null;
                         }else {
                            Beauty beauty = uAsset.getShootInfo().getBeauty();
                            Beauty beauty1 = uAsset.getShootInfo().getBeauty();
                            Object obj = PatchProxy.applyOneRefs(beauty1, null, v.class, "1");
                            if (obj != PatchProxyResult.class) {
                               i1 = obj.intValue();
                            }else {
                               switch (beauty1.getFeatureId().getInternalValue()){
                                   case 0x6979:
                                     i1 = 0;
                                     break;
                                   case 0x697a:
                                     i1 = 1;
                                     break;
                                   case 0x697b:
                                     i1 = 2;
                                     break;
                                   case 0x697c:
                                     i1 = 3;
                                     break;
                                   case 0x697d:
                                     i1 = 4;
                                     break;
                                   case 0x697e:
                                     i1 = 5;
                                     break;
                                   default:
                                     i1 = -1;
                               }
                            }
                            str = i.a(beauty, i1);
                         }
                         tq2.a = str;
                      }
                      e = this.q.c;
                      if (uAsset == null || !uAsset.getShootInfo().hasRecordFilter()) {
                         str1 = null;
                      }else {
                         RecordFilter recordFilter = uAsset.getShootInfo().getRecordFilter();
                         str1 = Filters.getFilterInfoFromFilterId(recordFilter.getLookupId(), FilterVideoPlugin$FilterEntranceType.VIDEO);
                         if (str1 == null) {
                            Object[] objArray = new Object[uoe];
                            a.D().w("getRecordFilter", "getConfig is null ,record LookUpId:"+recordFilter.getLookupId(), objArray);
                         }
                      }
                      e.add(str1);
                      e = this.q.d;
                      if (uAsset == null || !uAsset.getShootInfo().hasRecordMakeup()) {
                         str1 = null;
                      }else {
                         RecordMakeup recordMakeup = uAsset.getShootInfo().getRecordMakeup();
                         a uoa = new a();
                         uoa.a = recordMakeup.getPrimaryTypeNew();
                         uoa.b = recordMakeup.getPrimaryIndex();
                         ArrayList uArrayList = new ArrayList();
                         Iterator iterator1 = recordMakeup.getSubFeaturesList().iterator();
                         while (iterator1.hasNext()) {
                            RecordMakeup$SubFeatures subFeatures = iterator1.next();
                            a$a uoa1 = new a$a();
                            uoa1.e = subFeatures.getIdentify();
                            uoa1.a = subFeatures.getSecodaryTypeNew();
                            uoa1.b = subFeatures.getSecodaryIndex();
                            uoa1.c = subFeatures.getThirdType();
                            uoa1.d = subFeatures.getThirdIndex();
                            uArrayList.add(uoa1);
                         }
                         uoa.c.addAll(uArrayList);
                      }
                      e.add(str1);
                      e = this.q.b;
                      i5 = i5 + 1;
                      str = (uAsset != null && (!uAsset.hasShootInfo() || !uAsset.getShootInfo().hasBeauty()))? null: i.b(uAsset.getShootInfo().getBeauty(), i5);
                      e.add(str);
                      this.q.e.add(uAsset.getShootInfo().getRecordSlimming());
                      e = this.q.f;
                      String str2 = (uAsset.getShootInfo() == null)? null: uAsset.getShootInfo().getBeautifyExtend();
                      e.add(str2);
                   }
                }
             }
          }
       }
    label_02f9 :
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.P1();
          }
       }
       boolean b = true;
       this.v2(b);
       if (!this.A2()) {
          n.Y(this.s, 0, b);
       }
       this.O.clear();
       return;
    }
    public boolean R0(){
       Iterator obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getChildren().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          t ot = obj.next();
          if (ot instanceof b0 && ot.R0()) {
             break ;
          }
       }
       return true;
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public void W(c p0){
       u.a(this, p0);
    }
    public void X7(int p0,float p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, oi, "5")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.X7(p0, p1);
          }
       }
       return;
    }
    public void d5(int p0){
       a0.o(this, p0);
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.e2();
          }
       }
       return;
    }
    public long ie(){
       return a0.a(this);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "16")) {
          return;
       }
       super.k(p0);
       d te = this.e;
       if (te instanceof BasePostActivity) {
          te.E3(h.b);
       }
       return;
    }
    public PostBubbleManager n2(Fragment p0){
       i obj = PatchProxy.applyOneRefs(p0, this, i.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.P;
       if (obj != null) {
          return obj;
       }
       PostBubbleManager postBubbleMa = PostBubbleManager.d(p0);
       this.P = postBubbleMa;
       postBubbleMa.p(0);
       this.P.q(true);
       return this.P;
    }
    public void onDestroy(){
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "20")) {
          return;
       }
       super.onDestroy();
       c.a(new i2());
       if (!PatchProxy.applyVoid(null, this, oi, "21")) {
          o oo = new z().g();
          if (oo != null) {
             oo.b();
          }
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.B.a();
       this.v2(false);
       if (!this.A2() && this.d.d(v.e).c == null) {
          n.Y(this.s, 4, true);
       }
       return;
    }
    public boolean q2(){
       Iterator obj = PatchProxy.apply(null, this, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getChildren().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          t ot = obj.next();
          if (ot instanceof b0 && !ot.q2()) {
             break ;
          }
       }
       return false;
    }
    public void qb(){
       a0.e(this);
    }
    public void r0(int p0,Asset$b p1,b p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, i.class, "22")) {
          return;
       }
       if (p0 < this.O.size()) {
          String str = this.O.get(p0);
          if (p1 != null && str != null) {
             Asset$ShootInfo$a shootInfo$a = p1.getShootInfo().toBuilder();
             shootInfo$a.copyOnWrite();
             shootInfo$a.instance.setBeautifyExtend(str);
             p1.t(shootInfo$a);
          }
       }
       return;
    }
    public void r2(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       if (this.f != null) {
          if (d.u2()) {
             this.L0(new y(this.c, this.d, this));
          }
          if (m.d(this.c, this.d)) {
             this.L0(new q(this.c, this.d, this));
          }
          if (h.m2(p0, this.d)) {
             this.L0(new g0(this.c, this.d, this));
          }
          this.L0(new z(this.c, this.d, this));
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, i.class, "9")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.s0();
          }
       }
       if (!this.O.isEmpty()) {
          this.O.removeLast();
       }
       return;
    }
    public final h$a z2(boolean p0,a p1){
       Object[] obj;
       List list;
       q x;
       int i;
       Iterator iterator1;
       t ot;
       Object[] objArray;
       d0 c;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, oi, "18");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       p1 = (p1 != null)? p1.l: obj;
       h$a uoa = new h$a();
       if (!PatchProxy.applyVoidOneRefs(uoa, this, oi, "23")) {
          e tq = this.q;
          if (tq.a == null) {
             tq.a = this.d.c(BeautifyConfig.class);
          }
          uoa.b(this.q.a);
          if (this.q.b.isEmpty()) {
             list = PatchProxy.apply(obj, this, oi, "14");
             if (list != patchProxyRe) {
             }else {
                iterator1 = this.getChildren().iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      ot = iterator1.next();
                      if (ot instanceof y) {
                         list = ot.r2();
                      }
                   }else {
                      objArray = obj;
                   }
                }
             }
          }else {
             c = this.q.b;
          }
          uoa.l = list;
          uoa.i(true);
          if (this.q.c.isEmpty()) {
             list = PatchProxy.apply(obj, this, oi, "12");
             if (list != patchProxyRe) {
             }else {
                iterator1 = this.getChildren().iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      ot = iterator1.next();
                      if (ot instanceof m) {
                         list = ot.n2();
                      }else {
                         continue ;
                      }
                   }else {
                      objArray = obj;
                   }
                }
             }
          }else {
             c = this.q.c;
          }
          uoa.g = list;
          if (this.q.d.isEmpty()) {
             list = PatchProxy.apply(obj, this, oi, "13");
             if (list != patchProxyRe) {
             }else {
                iterator1 = this.getChildren().iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      ot = iterator1.next();
                      if (ot instanceof g0) {
                         list = ot.k2();
                      }else {
                         continue ;
                      }
                   }else {
                      objArray = obj;
                   }
                }
             }
          }else {
             objArray = this.q.d;
          }
          uoa.h = list;
          if (this.q.e.isEmpty()) {
             t obj1 = PatchProxy.apply(obj, this, oi, "15");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                Iterator iterator = this.getChildren().iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (obj1 instanceof q) {
                      x = obj1.x;
                   }else {
                      continue ;
                   }
                }
             }
          }else {
             d0 e = this.q.e;
             x = PatchProxy.applyOneRefs(e, obj, m.class, "4");
             if (x != patchProxyRe) {
             }else {
                i = e.size();
                x = new ArrayList();
                int i1 = 0;
                while (i1 < i) {
                   i1 = i1 + 1;
                   x.add(m.b(e.get(i1), i1));
                }
             }
          }
          uoa.m = obj;
       }
       uoa.f(p1);
       uoa.j(this.d.d(l.i).e);
       uoa.h(this.c);
       uoa.k(p0);
       return uoa;
    }
}
