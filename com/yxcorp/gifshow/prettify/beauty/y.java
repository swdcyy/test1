package com.yxcorp.gifshow.prettify.beauty.y;
import oc9.b0;
import oh9.v;
import com.yxcorp.gifshow.prettify.beauty.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ng9.c;
import java.util.LinkedList;
import com.yxcorp.gifshow.camera.record.base.d;
import q0c.a2;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oc9.a0;
import w16.j;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.o5;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import u0c.a;
import k36.c;
import h36.d;
import k36.f;
import kaa.v;
import com.kuaishou.edit.draft.Beauty;
import wba.i;
import qr4.k$b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oh9.u;
import android.view.View;
import com.yxcorp.gifshow.prettify.beauty.x;
import erd.g;
import crd.b;
import eoc.f;
import com.kuaishou.edit.draft.Asset$b;
import java.lang.Integer;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.lang.Runnable;

public class y extends d implements b0, v	// class@00112a
{
    public final LinkedList G;
    public boolean H;
    public Runnable I;

    public void y(CameraPageType p0,b p1,c p2){
       super(p0, p1, p2);
       this.G = new LinkedList();
       this.I = null;
       this.d.n(v.class, new a2(this));
    }
    public void A0(){
       a0.j(this);
    }
    public final void C2(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "8")) {
          return;
       }
       int i = -1;
       BeautifyConfig uBeautifyCon = this.u.c(o5.b(p0.b, i));
       BeautifyConfig uBeautifyCon1 = this.o2();
       if (uBeautifyCon1 != null && (uBeautifyCon1.mId == i || p0.d != null)) {
          if (uBeautifyCon == null) {
             uBeautifyCon = new BeautifyConfig();
          }
          this.k2(uBeautifyCon);
          this.u.j(uBeautifyCon);
       }
       c.d().g(new d(uBeautifyCon, false));
       if (p0.c != null) {
          this.q.U(false);
       }
       return;
    }
    public void E0(){
       a0.n(this);
    }
    public void I7(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "1")) {
          return;
       }
       BeautifyConfig uBeautifyCon = this.o2();
       if (uBeautifyCon == null) {
          this.G.add(objArray);
       }else {
          int i = v.a(uBeautifyCon.mId);
          if (uBeautifyCon.mIsRecoConfig == null) {
             BeautifyConfig mId = uBeautifyCon.mId;
             if (mId != -1) {
                objArray = this.u.c(mId);
             }
          }
          this.G.add(i.b(i.c(uBeautifyCon, i, objArray), (this.G.size() + 1)));
       }
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, y.class, "2")) {
          return;
       }
       this.G.clear();
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
    public void Z0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "6")) {
          return;
       }
       super.Z0(p0);
       c.d().g(new d(p0));
       return;
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
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "5")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(j.class, new x(this)));
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
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, y.class, "9")) {
          return;
       }
       BeautifyConfig uBeautifyCon = p2.c(BeautifyConfig.class);
       if (uBeautifyCon != null) {
          BeautifyConfig uBeautifyCon1 = this.u.c(uBeautifyCon.mId);
          if (p1 != null) {
             Beauty uBeauty = i.c(uBeautifyCon, v.a(uBeautifyCon.mId), uBeautifyCon1);
             if (uBeauty != null) {
                Asset$ShootInfo$a shootInfo$a = p1.getShootInfo().toBuilder();
                shootInfo$a.copyOnWrite();
                shootInfo$a.instance.setBeauty(uBeauty);
                p1.t(shootInfo$a);
             }
          }
       }
       return;
    }
    public List r2(){
       Object obj = PatchProxy.apply(null, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.G);
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       if (!q.f(this.G)) {
          this.G.removeLast();
       }
       return;
    }
    public boolean w2(){
       return true;
    }
    public void z2(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "7")) {
          return;
       }
       super.z2(p0);
       c.d().g(new d(p0, true));
       this.H = true;
       y tI = this.I;
       if (tI != null) {
          tI.run();
          this.I = null;
       }
       return;
    }
}
