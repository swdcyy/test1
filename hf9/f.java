package hf9.f;
import oc9.e0;
import hf9.f$b;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import hf9.a;
import oc9.t;
import com.yxcorp.gifshow.camera.record.base.d;
import hf9.b;
import hf9.f$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import lf9.q;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import android.content.Context;
import j8c.a;
import q87.c;
import androidx.lifecycle.MutableLiveData;
import com.kwai.framework.mvs.BaseViewModel;
import hf9.f$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import kf9.g;
import hf9.f$d;
import kf9.b;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import qc9.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import qxc.b;
import android.app.Activity;
import ekd.m1;
import if9.b;
import com.yxcorp.gifshow.magic.data.repo.response.MagicFaceResponse;
import java.util.Iterator;
import java.lang.Iterable;
import if9.c;
import kf9.d;
import java.util.List;
import sa6.a;
import com.yxcorp.gifshow.camerasdk.q;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import sa6.d;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModel;

public final class f extends e0	// class@002645
{
    public View A;
    public View B;
    public ViewGroup C;
    public View D;
    public View E;
    public View F;
    public View G;
    public View H;
    public ViewStubInflater2 I;
    public int J;
    public ImageView K;
    public AbsRecordBottomBarViewBinder L;
    public long M;
    public e q;
    public f r;
    public MagicFaceResponse s;
    public List t;
    public e u;
    public q v;
    public RecyclerView w;
    public View x;
    public ImageView y;
    public View z;
    public static final f$b N;

    static {
       f.N = new f$b(null);
    }
    public void f(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.t = new ArrayList();
       this.J = -1;
       this.L0(new a(p0, p1));
       this.d.n(b.class, f$a.a);
    }
    public static final q g2(f p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("slipViewModel");
       }
       return p0;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.A0();
       if (this.a2()) {
          return;
       }
       n.W(this.C, 0, this.M);
       n.W(this.A, 4, this.M);
       n.W(this.z, 4, this.M);
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       super.I7();
       n.W(this.C, 4, this.M);
       n.W(this.A, 0, this.M);
       n.W(this.z, 0, this.M);
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       super.P1();
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       long l = this.h2(uBaseFragmen);
       n.W(this.C, 0, l);
       n.W(this.A, 4, l);
       n.W(this.z, 4, l);
       return;
    }
    public final long h2(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0.isResumed()) {
          return (long)300;
       }
       return 0;
    }
    public final void i2(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "9")) {
          return;
       }
       MagicEmoji$MagicFace magicFace = null;
       if (p0) {
          RxBus.f.b(new f(magicFace, this.e));
       }
       this.q = magicFace;
       Object[] objArray = new Object[0];
       a.D().w("SliMode", "onMagicItemUnselected", objArray);
       return;
    }
    public void k(View p0){
       View view;
       Object[] objArray1;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       a.p(p0, "view");
       super.k(p0);
       f tv = this.v;
       if (tv == null) {
          a.S("slipViewModel");
       }
       d td = this.d;
       String str = "mCallerContext";
       a.o(td, str);
       tv.r0().observe(td.f(), new f$c(this));
       tv = this.v;
       if (tv == null) {
          a.S("slipViewModel");
       }
       tv.u0().a(new f$d(this));
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0607, 0x7f0a025f);
       this.I = viewStubInfl;
       viewStubInfl.d(p0);
       tv = this.I;
       if (tv == null) {
          a.S("panelViewStubInflater");
       }
       tv.e(R.layout.arg_RES_7f0d0167);
       d td1 = this.d;
       a.o(td1, str);
       Object[] objArray = null;
       if (td1.f() instanceof a) {
          td1 = this.d;
          a.o(td1, str);
          BaseFragment uBaseFragmen = td1.f();
          Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.bottombar.IRecordBottomBarOwner");
          AbsRecordBottomBarViewBinder uAbsRecordBo = uBaseFragmen.zb();
          this.L = uAbsRecordBo;
          view = (uAbsRecordBo != null)? uAbsRecordBo.G(): objArray;
          this.E = b.a(view, p0, 0x7f0a05de);
          tv = this.L;
          view = (tv != null)? tv.D(): objArray;
          this.F = b.a(view, p0, 0x7f0a0622);
          tv = this.L;
          view = (tv != null)? tv.I(): objArray;
          this.G = b.a(view, p0, 0x7f0a05c9);
          tv = this.L;
          uAbsRecordBo = (tv != null)? tv.z: objArray;
          this.H = b.a(uAbsRecordBo, p0, 0x7f0a01d0);
       }
       this.x = this.e.findViewById(0x7f0a063d);
       this.z = m1.f(p0, 0x7f0a13f7);
       this.A = m1.f(p0, 0x7f0a34a7);
       this.D = m1.f(p0, 0x7f0a0602);
       this.B = m1.f(p0, 0x7f0a3d49);
       if (!PatchProxy.applyVoid(objArray, this, uof, "14")) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new b());
          uof = this.s;
          if (uof != null) {
             MagicFaceResponse mMagicFaces = uof.mMagicFaces;
             if (mMagicFaces != null) {
                Iterator iterator = mMagicFaces.iterator();
                while (iterator.hasNext()) {
                   MagicEmoji$MagicFace magicFace = iterator.next();
                   a.o(magicFace, "it");
                   uArrayList.add(new c(magicFace));
                }
             }
          }
          uof = this.s;
          if (uof != null && uof.mSelectedIndex >= null) {
             tv = this.v;
             if (tv == null) {
                a.S("slipViewModel");
             }
             tv.l = uof.mSelectedIndex + 1;
          }
          uof = this.v;
          if (uof == null) {
             a.S("slipViewModel");
          }
          uof.v0(new d(uArrayList));
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       Object[] objArray = new Object[0];
       a.D().w("SlipModeMagicController", "setCameraHelper", objArray);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SlipModeMagicController", "onDestroyView", objArray);
       if (this.q != null) {
          this.i2(0);
       }
       super.onDestroyView();
       this.r = null;
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       super.q1();
       n.W(this.C, 4, this.M);
       n.W(this.A, 0, this.M);
       n.W(this.z, 0, this.M);
       n.W(this.F, 4, this.M);
       n.W(this.E, 4, this.M);
       n.W(this.G, 4, this.M);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       super.w1(p0);
       this.s = j0.e(p0, "magic_face_response");
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       ViewModelProvider viewModelPro = d.a.a(uBaseFragmen);
       ViewModel viewModel = viewModelPro.get(q.class);
       a.o(viewModel, "KSViewModelProviders.of\(¡­odeViewModel::class.java\)");
       this.v = viewModel;
       d td1 = this.d;
       a.o(td1, "mCallerContext");
       BaseFragment uBaseFragmen1 = td1.f();
       a.o(uBaseFragmen1, "mCallerContext.fragment");
       this.M = this.h2(uBaseFragmen1);
       return;
    }
}
