package wc9.t;
import oc9.b0;
import wc9.e;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.a0;
import oa0.a;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.Iterator;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import android.view.ViewGroup;
import qxc.b;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.n;
import java.lang.Integer;
import zb9.p0;
import zb9.p0$a;
import hf9.b;
import hf9.b$a;
import com.yxcorp.utility.n;
import wd9.a;
import vf9.c;
import j8c.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import android.content.Intent;
import wc9.s;
import wc9.e$b;

public class t extends e implements b0	// class@004304
{
    public View A;
    public View B;
    public View C;
    public View D;
    public View E;
    public ViewGroup F;
    public ViewStubInflater2 G;
    public List H;
    public j I;
    public View z;

    public void t(CameraPageType p0,b p1){
       super(p0, p1);
       this.H = new ArrayList();
       if (p1.f() instanceof c) {
          this.I = p1.f().E6();
       }
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       this.n2();
       return;
    }
    public void E0(){
       a0.n(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       this.H.add(Boolean.valueOf(a.f0()));
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          if (iterator.next().booleanValue()) {
             p0.e.B0(true);
             break ;
          }
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, t.class, "7")) {
          return;
       }
       this.H.clear();
       return;
    }
    public boolean R0(){
       Object obj = PatchProxy.apply(null, this, t.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.f0()) {
          return true;
       }
       if (this.o2()) {
          return true;
       }
       return false;
    }
    public void T1(boolean p0){
       a0.l(this, p0);
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
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       super.k(p0);
       this.z = p0.findViewById(0x7f0a0612);
       int i = 0x7f0a0eb6;
       if (p0.findViewById(i) != null) {
          ViewStubInflater2 viewStubInfl = new ViewStubInflater2(i, 0x7f0a0eb5);
          this.G = viewStubInfl;
          viewStubInfl.d(p0);
       }
       this.A = p0.findViewById(0x7f0a0a89);
       this.B = p0.findViewById(0x7f0a01d0);
       e ty = this.y;
       if (ty != null) {
          this.C = ty.G();
       }
       this.D = p0.findViewById(0x7f0a05da);
       t tI = this.I;
       View view = null;
       SideBarViewBinder sideBarViewB = (tI != null && tI.r2() != null)? this.I.r2(): view;
       if (sideBarViewB != null) {
          view = sideBarViewB.C();
       }
       this.F = b.a(view, p0, 0x7f0a0635);
       return;
    }
    public boolean o2(){
       Object obj = PatchProxy.apply(null, this, t.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.d(n.j).a;
    }
    public void p2(int p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ot, "10")) {
          return;
       }
       boolean b = this.d.d(p0.j.a()).c();
       boolean b1 = this.d.d(b.c.a()).a();
       if (!b && !b1) {
          n.Y(this.x, p0, true);
          n.Y(this.w, p0, true);
       }
       if (this.c == CameraPageType.TIE_TIE) {
          n.Y(this.B, p0, true);
       }
       n.Y(this.D, p0, true);
       n.Y(this.F, p0, true);
       n.Y(this.z, p0, true);
       t tG = this.G;
       View view = (tG != null)? tG.b(R.id.finish_record_layout): null;
       if (this.d.d(a.i).a == null) {
          boolean b2 = false;
          if (!p0) {
             if (this.a2()) {
                n.Y(view, p0, true);
                n.Y(this.A, p0, b2);
             }else if(this.d.d(c.c).a == null && (!b && !b1)){
                n.Y(this.C, p0, true);
             }
          }else if(view != null && !view.getVisibility()){
             n.Y(view, p0, true);
          }
          n.Y(this.A, p0, b2);
          if (!b && !b1) {
             if (this.d.d(n.j).a == null) {
                ot = this.B;
                if (ot != null && !ot.getVisibility()) {
                   n.Y(this.B, p0, true);
                label_00e0 :
                   if (this.d.d(c.c).a == null) {
                      n.Y(this.C, p0, true);
                   }
                }
             }
             n.Y(this.B, 8, b2);
             goto label_00e0 ;
          }
       }
    label_00f3 :
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("CountDownController", "onCaptureInterrupted", objArray);
       Object[] objArray1 = new Object[0];
       a.D().s("CountDownController", "startTicker", objArray1);
       this.m2();
       return;
    }
    public boolean q2(){
       return a0.d(this);
    }
    public void qb(){
       a0.e(this);
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, t.class, "6")) {
          return;
       }
       if (!q.f(this.H)) {
          t tH = this.H;
          tH.remove((tH.size() - 1));
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       super.w1(p0);
       if (!PatchProxy.applyVoid(null, this, t.class, "11")) {
          this.l2(new s(this));
       }
       return;
    }
}
