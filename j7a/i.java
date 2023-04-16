package j7a.i;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sc6.c;
import j7a.i$a;
import j7a.e;
import j7a.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j7a.d;
import im8.f;
import xl8.b;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import uc6.c;
import sd5.d;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import sc6.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import j7a.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import brd.t;
import erd.g;
import java.util.List;
import j7a.f;
import j7a.h;
import com.kwai.framework.player.core.b$b;
import uw9.o;
import java.lang.StringBuilder;
import android.app.Activity;
import q87.c;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import j7a.l;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends PresenterV2 implements g	// class@002931
{
    public final b A;
    public final b$b B;
    public final a C;
    public d p;
    public c q;
    public f r;
    public PhotoDetailParam s;
    public a t;
    public List u;
    public BaseFragment v;
    public b w;
    public QPhoto x;
    public SlidePlayViewModel y;
    public boolean z;

    public void i(){
       super();
       this.q = new c();
       this.A = new i$a(this);
       this.B = new e(this);
       this.C = new i$b(this);
    }
    public void E8(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i tr = this.r;
       if (tr != null) {
          tr.set(new d(this));
       }
       i = this.w.a().intValue();
       int i1 = 2;
       if (i == i1 || i == 3) {
          this.P8("page is about finish abort init ");
          return;
       }else if(this.x.isVideoType()){
          this.p.N().setVisibility(0);
       }else {
          this.p.N().setVisibility(8);
       }
       if (this.s.getDetailPlayConfig().isUseSurfaceView()) {
          this.p.N().l(i1);
       }else {
          this.p.N().l(0);
       }
       this.R8(i);
       this.p.N().k(this.t.getPlayer());
       this.p.N().c(this.A);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.v.getParentFragment());
       this.y = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.v, this.C);
          tr = this.y;
          g og = new g(this);
          Objects.requireNonNull(tr);
          b uob = PatchProxy.applyOneRefs(og, tr, SlidePlayViewModel.class, "2");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = tr.e.b().subscribe(og);
          }
          this.X7(uob);
       }else {
          this.u.add(this.C);
       }
       this.X7(this.w.b().subscribe(new f(this), h.b));
       this.p.N().b(0);
       if (this.t.getPlayer() != null) {
          this.t.getPlayer().w(this.B);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.p.N().release();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "4")) {
          return;
       }
       if (this.t.getPlayer() != null) {
          this.t.getPlayer().O(this.B);
       }
       this.p.N().f(this.A);
       this.p.N().k(objArray);
       i ty = this.y;
       if (ty != null) {
          ty.q0(this.v, this.C);
       }else {
          this.u.remove(this.C);
       }
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "8")) {
          return;
       }
       i tx = this.x;
       String userName = (tx != null)? tx.getUserName(): "";
       Object[] objArray = new Object[0];
       o.C().w("SlideSurfaceFramePresen", userName+" "+this.getActivity()+" "+p0, objArray);
       return;
    }
    public void R8(int p0){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "7")) {
          return;
       }
       this.P8("NonAttachSwipe "+p0);
       i = 1;
       if (p0 == i) {
          this.p.N().e();
          this.p.N().i(i);
       }else if(p0 == 5){
          this.p.N().i(false);
          this.p.N().g();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.p = uod;
       this.W7(uod);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new l());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.s = this.q8(PhotoDetailParam.class);
       this.t = this.q8(a.class);
       this.u = this.r8("DETAIL_ATTACH_LISTENERS");
       this.v = this.r8("DETAIL_FRAGMENT");
       this.w = this.r8("SLIDE_SWIPE_EXIT_STATE");
       this.x = this.q8(QPhoto.class);
       this.r = this.w8("DETAIL_FOLLOW_CARD_BITMAP");
       return;
    }
}
