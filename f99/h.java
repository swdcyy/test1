package f99.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f99.h$a;
import f99.h$b;
import f99.d;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import mxb.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import wh5.c;
import java.util.List;
import f99.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import lnc.a1;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.ShadowedFrameLayout;
import android.content.Context;
import androidx.fragment.app.Fragment;
import joc.i;
import joc.o;
import joc.p;
import joc.l;
import hka.a;
import java.util.Set;
import joc.d;
import java.util.HashSet;
import joc.e;
import java.lang.Integer;
import j1b.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import ge5.b;
import ge5.d;
import java.util.Collection;
import joc.c;
import joc.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.u;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import androidx.lifecycle.Lifecycle$State;
import i9a.a;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import k2b.e0;
import androidx.fragment.app.c;
import java.lang.StringBuilder;
import androidx.lifecycle.Lifecycle;
import k2b.u1;
import androidx.fragment.app.e;
import zf6.k;
import ekd.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mrd.a;
import im8.f;
import com.yxcorp.gifshow.entity.QPreInfo;

public class h extends PresenterV2	// class@0022ea
{
    public View A;
    public BaseFragment B;
    public a C;
    public Set D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public i I;
    public l J;
    public o K;
    public o L;
    public final a M;
    public final a N;
    public final a O;
    public int P;
    public View p;
    public b q;
    public c r;
    public BaseFragment s;
    public a t;
    public f u;
    public PhotosViewPager v;
    public QPhoto w;
    public QPreInfo x;
    public List y;
    public PhotoDetailLogger z;

    public void h(){
       super();
       this.M = new h$a(this);
       this.N = new h$b(this);
       this.O = new d(this);
    }
    public static void V8(BaseFeed p0){
       i0.a().c(i0.a().g(p0));
    }
    public void E8(){
       boolean b;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "13")) {
          h tA = this.A;
          if (tA != null) {
             tA.setVisibility(8);
             this.A.setTranslationX((float)this.P);
          }
       }
       Activity obj = PatchProxy.apply(objArray, this, oh, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.getActivity();
          d uod = d.a(-1188553266);
          b = (obj instanceof GifshowActivity && uod != null)? uod.VA(obj.U2(), this.w.getUserId()): false;
          b = (this.A != null && (!b && c.f()))? true: false;
          this.E = b;
       }
       if (b) {
          this.y.add(this.M);
          oh = this.t;
          if (oh != null) {
             this.X7(oh.subscribe(new g(this), Functions.e));
          }
       }
       return;
    }
    public void F8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          this.P = a1.h();
          Activity activity = this.getActivity();
          if (this.P == null) {
             this.P = n.x(activity);
          }
          this.E = false;
          if (activity != null) {
             int i = 0x7f0a3281;
             View view = activity.findViewById(i);
             this.A = view;
             if (view == null) {
                ViewGroup viewGroup = activity.findViewById(0x1020002);
                if (viewGroup != null) {
                   ShadowedFrameLayout shadowedFram = new ShadowedFrameLayout(activity);
                   this.A = shadowedFram;
                   shadowedFram.setId(i);
                   this.A.setClickable(true);
                   viewGroup.addView(this.A, -1, -1);
                }
             }
          }
       }
    label_005a :
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "12")) {
          return;
       }
       this.R8();
       return;
    }
    public final void P8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "10")) {
          return;
       }
       View view = this.s.getView();
       if (view == null) {
          return;
       }
       float f = (p0)? 0: (float)(- this.P);
       view.setTranslationX(f);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       this.H = true;
       h tI = this.I;
       if (tI != null) {
          tI.h.h(this.K);
       }
       tI = this.J;
       if (tI != null) {
          tI.l(this.L);
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          activity.l3(this.O);
       }
       return;
    }
    public final Set S8(){
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.D == null) {
          obj = this.B;
          if (obj instanceof d) {
             objArray = new HashSet();
             objArray.add(obj);
          }else if(obj instanceof e){
             objArray = obj.t7();
          }
          this.D = objArray;
       }
       return this.D;
    }
    public void W8(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "16")) {
          return;
       }
       oh = this.C;
       if (oh != null) {
          oh.q(p0);
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, h.class, "22")) {
          return;
       }
       if (this.d9()) {
          this.A.setVisibility(4);
          this.b9(this.F);
          this.z.exitEnterProfileFragment();
          this.q.J2();
          this.getActivity().l3(this.O);
          this.q.Rc().b.s(this.S8());
          boolean b = false;
          this.I.f(b);
          RxBus.f.b(new u(b));
          h tv = this.v;
          if (tv != null) {
             tv.setIsShown(true);
          }
          this.a9(this.B, Lifecycle$State.STARTED);
          this.a9(this.s, Lifecycle$State.RESUMED);
       }
       return;
    }
    public void Y8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "21")) {
          return;
       }
       if (this.d9()) {
          int i = 0;
          this.A.setVisibility(i);
          this.b9(this.G);
          this.z.enterEnterProfileFragment();
          this.q.k2();
          this.getActivity().F2(this.O);
          this.q.Rc().b.j(this.S8());
          this.P8(i);
          this.J.f(i);
          RxBus.f.b(new u(true));
          this.c9(i);
          h tv = this.v;
          if (tv != null) {
             tv.setIsShown(i);
          }
          tv = this.B;
          h ts = this.s;
          if (!PatchProxy.applyVoidTwoRefs(tv, ts, objArray, a.class, "2")) {
             a uoa = a.o0(tv);
             if (uoa == null) {
                Log.d("ProfileSwipeExpTagTransViewModel", "updateDetailExpTagTrans error, viewModel is null");
             }else {
                uoa.a = ts.I1();
             }
          }
          this.a9(this.B, Lifecycle$State.RESUMED);
          this.a9(this.s, Lifecycle$State.STARTED);
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, h.class, "25")) {
          return;
       }
       if (this.d9()) {
          h tp = this.p;
          if (tp != null) {
             tp.setVisibility(0);
             this.c9(true);
          }
          this.P8(true);
          this.I.f(true);
       }
       return;
    }
    public final void a9(Fragment p0,Lifecycle$State p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "23")) {
          return;
       }
       c fragmentMana = p0.getFragmentManager();
       if (fragmentMana == null) {
          u1.R("UserProfileSwipePresenter", "fragment is detach "+p0.isDetached()+", fragment\'s lifeCycle  is "+p0.getLifecycle().getCurrentState(), 5);
          return;
       }else {
          fragmentMana.beginTransaction().A(p0, p1).o();
          return;
       }
    }
    public final void b9(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "19")) {
          return;
       }
       Activity activity = this.getActivity();
       p0 = (p0 && !k.d())? true: false;
       i.h(activity, 0, p0);
       return;
    }
    public final void c9(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "27")) {
          return;
       }
       View view = this.getActivity().findViewById(R.id.photo_detail_back_btn);
       if (view != null) {
          int i = (p0)? 0: 8;
          view.setVisibility(i);
       }
       return;
    }
    public final boolean d9(){
       return this.E;
    }
    public void e9(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "20")) {
          return;
       }
       if (p0) {
          this.q.Rc().d();
       }else {
          this.q.Rc().c();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.t8("DETAIL_PHOTO_VIEW");
       this.q = this.q8(b.class);
       this.r = this.q8(c.class);
       this.s = this.r8("DETAIL_SWIPE_PROFILE_HOST_FRAGMENT");
       this.t = this.t8("DETAIL_SWIPE_PROFILE_IS_MANUAL_DISABLED");
       this.u = this.x8("IMMERSIVE_MODE_HELPER");
       this.v = this.t8("ATLAS_VIEW_PAGER");
       this.w = this.q8(QPhoto.class);
       this.x = this.s8(QPreInfo.class);
       this.y = this.r8("DETAIL_ATTACH_LISTENERS");
       this.z = this.r8("DETAIL_LOGGER");
       return;
    }
}
