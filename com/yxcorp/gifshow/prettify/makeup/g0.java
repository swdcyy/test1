package com.yxcorp.gifshow.prettify.makeup.g0;
import oc9.b0;
import oh9.v;
import com.yxcorp.gifshow.prettify.makeup.h;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ng9.c;
import java.util.ArrayList;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.prettify.makeup.c;
import oc9.t;
import oc9.q;
import com.yxcorp.gifshow.camera.record.base.d;
import f1c.j2;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oc9.a0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import k36.c;
import h36.g;
import k36.f;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oh9.u;
import i1c.c;
import i1c.b;
import android.view.View;
import w16.j;
import com.yxcorp.gifshow.prettify.makeup.f0;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.camerasdk.q;
import com.kuaishou.edit.draft.Asset$b;
import java.lang.Integer;
import com.kuaishou.edit.draft.RecordMakeup$b;
import com.kuaishou.edit.draft.RecordMakeup;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import com.kuaishou.edit.draft.RecordMakeup$SubFeatures$a;
import com.kuaishou.edit.draft.RecordMakeup$SubFeatures;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g0 extends h implements b0, v	// class@00117a
{
    public Runnable A;
    public List y;
    public boolean z;

    public void g0(CameraPageType p0,b p1,c p2){
       super(p0, p1, p2);
       this.y = new ArrayList();
       if (a.a().c()) {
          this.L0(new c(p0, p1, this));
       }
       this.d.n(v.class, new j2(this));
       return;
    }
    public void A0(){
       a0.j(this);
    }
    public void E0(){
       a0.n(this);
    }
    public void I1(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, g0.class, "6")) {
          return;
       }
       super.I1(p0, p1, p2, p3);
       if (!this.C() && (p2 == null && p1 == null)) {
          c.d().g(new g(p0));
       }
    label_0034 :
       return;
    }
    public void I7(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g0.class, "2")) {
          return;
       }
       g0 ty = this.y;
       if (!this.C()) {
          objArray = this.i2();
       }
       ty.add(objArray);
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, g0.class, "3")) {
          return;
       }
       this.y.clear();
       return;
    }
    public boolean R0(){
       return a0.b(this);
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public void W(c p0){
       u.a(this, p0);
    }
    public void X7(int p0,float p1){
       a0.k(this, p0, p1);
    }
    public void d5(int p0){
       a0.o(this, p0);
    }
    public void e2(){
       a0.f(this);
    }
    public long ie(){
       return a0.a(this);
    }
    public void j0(){
       if (PatchProxy.applyVoid(null, this, g0.class, "7")) {
          return;
       }
       b.b(this);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(j.class, new f0(this)));
       return;
    }
    public List k2(){
       return this.y;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "5")) {
          return;
       }
       super.nb(p0);
       return;
    }
    public void q1(){
       a0.g(this);
    }
    public boolean q2(){
       return a0.d(this);
    }
    public void qb(){
       a0.e(this);
    }
    public void r0(int p0,Asset$b p1,b p2){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, g0.class, "10")) {
          return;
       }
       a uoa = p2.c(a.class);
       if (uoa != null && p1 != null) {
          RecordMakeup$b uob = RecordMakeup.newBuilder();
          uob.copyOnWrite();
          uob.instance.setAttributes(DraftUtils.i());
          uob.copyOnWrite();
          uob.instance.setPrimaryIndex(uoa.b);
          uob.copyOnWrite();
          uob.instance.setPrimaryTypeNew(uoa.a);
          Iterator iterator = uoa.c.iterator();
          while (iterator.hasNext()) {
             a$a uoa1 = iterator.next();
             RecordMakeup$SubFeatures$a subFeatures$ = RecordMakeup$SubFeatures.newBuilder();
             subFeatures$.copyOnWrite();
             subFeatures$.instance.setIdentify(uoa1.e);
             subFeatures$.copyOnWrite();
             subFeatures$.instance.setThirdType(uoa1.c);
             subFeatures$.copyOnWrite();
             subFeatures$.instance.setThirdIndex(uoa1.d);
             subFeatures$.copyOnWrite();
             subFeatures$.instance.setSecodaryTypeNew(uoa1.a);
             subFeatures$.copyOnWrite();
             subFeatures$.instance.setSecodaryIndex(uoa1.b);
             RecordMakeup$SubFeatures subFeatures = subFeatures$.build();
             uob.copyOnWrite();
             uob.instance.addSubFeatures(subFeatures);
          }
          Asset$ShootInfo$a shootInfo$a = p1.getShootInfo().toBuilder();
          shootInfo$a.copyOnWrite();
          shootInfo$a.instance.setRecordMakeup(uob.build());
          p1.t(shootInfo$a);
       }
       return;
    }
    public void r2(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "8")) {
          return;
       }
       super.r2(p0);
       if (!this.C()) {
          c.d().g(new g(p0, true));
       }
       this.z = true;
       g0 tA = this.A;
       if (tA != null) {
          tA.run();
          this.A = null;
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, g0.class, "4")) {
          return;
       }
       if (!this.y.isEmpty()) {
          g0 ty = this.y;
          ty.remove((ty.size() - 1));
       }
       return;
    }
    public final void w2(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "9")) {
          return;
       }
       MakeupSuite makeupSuite = d.a().b(this.q).h(p0.b);
       if (!this.C() && (TextUtils.n(this.i2().a, "-10") || p0.d != null)) {
          this.v2(makeupSuite, null, null, false, 2);
          c.d().g(super(makeupSuite));
       }
       if (p0.c != null) {
          this.p.U(1);
       }
       return;
    }
}
