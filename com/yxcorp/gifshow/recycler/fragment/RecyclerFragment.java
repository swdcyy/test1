package com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hka.l;
import hka.k;
import hka.m;
import gka.o;
import y8c.q;
import d9c.b;
import im8.g;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import c9c.a;
import io.reactivex.subjects.PublishSubject;
import s2b.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.kwai.robust.PatchProxyResult;
import b9c.v;
import qvb.i;
import e9c.k;
import e9c.f;
import e9c.h;
import e9c.h$b;
import e9c.d;
import e9c.a;
import b9c.u;
import y8c.t;
import com.yxcorp.gifshow.fragment.f;
import g9c.d;
import lnc.a1;
import com.yxcorp.gifshow.fragment.e;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;
import brd.t;
import java.lang.Throwable;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment;
import hka.j;
import y8c.p;
import android.app.Activity;
import y8c.c;
import b9c.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import qvb.q;
import qvb.j;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import b9c.t;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import com.yxcorp.utility.Log;
import k2b.u1;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment;
import android.content.Intent;
import java.lang.Integer;
import androidx.recyclerview.widget.f;
import qvb.p;
import hka.i;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import b9c.m;
import androidx.recyclerview.widget.f$a;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;

public abstract class RecyclerFragment extends LazyInitSupportedFragment implements l, k, m, o, q, b, g	// class@0017aa
{
    public PublishSubject A;
    public k B;
    public final d C;
    public f D;
    public RefreshLayout s;
    public RecyclerView t;
    public g u;
    public d v;
    public i w;
    public t x;
    public PresenterV2 y;
    public final a z;
    public static boolean E;

    public void RecyclerFragment(){
       super();
       this.z = new a();
       this.A = PublishSubject.g();
       this.C = new d();
    }
    private void nh(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "21")) {
          return;
       }
       RecyclerFragment tB = this.B;
       if (tB != null) {
          tB.v(false);
          return;
       }else if(this.y != null && this.getView() != null){
          this.y.i(this.fg().toArray());
       }
       return;
    }
    public final RefreshLayout Ac(){
       return this.s;
    }
    public k Ah(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RecyclerFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Eh()) {
          return new v(this, this.w);
       }
       return objArray;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, RecyclerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B != null) {
          obj = new PresenterV2();
          obj.U7(new k());
          obj.U7(new f(this));
          if (this.s != null) {
             h oh = new h(this.B, this.S1(), this.S0());
             oh.P8(this.ph());
             obj.U7(oh);
          }
          if (this.mh()) {
             obj.U7(new d(this.q()));
          }
          obj.U7(new a());
          PatchProxy.onMethodExit(RecyclerFragment.class, "11");
          return obj;
       }else {
          PatchProxy.onMethodExit(RecyclerFragment.class, "11");
          return u.b(this, this.mh());
       }
    }
    public t Bh(){
       RecyclerFragment obj = PatchProxy.apply(null, this, RecyclerFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          return new e(this.h0(), this.S1(), this.ia());
       }
       f uof = new f(obj, this.ia(), this.q(), this.S1());
       uof.u((float)a1.e(0xc1f00000));
       return uof;
    }
    public void Ch(){
    }
    public boolean Dh(){
       return (this instanceof LiveGzoneAudienceAccompanyTicketFragment ^ 0x01);
    }
    public boolean Eh(){
       return this instanceof LiveExploreFragment;
    }
    public boolean Fh(){
       return false;
    }
    public final t I5(){
       return this.A;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(RecyclerFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, RecyclerFragment.class, "27")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (p0 && (this.N5() && activity instanceof GifshowActivity)) {
          this.b2(2);
       }
    label_002b :
       return;
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "16")) {
          return;
       }
       if (this.h0() != null) {
          this.h0().scrollToPosition(0);
       }
       return;
    }
    public boolean N5(){
       return (this instanceof LiveSquareSideBarFragment ^ 0x01);
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return j.b(this);
    }
    public i Y7(){
       return p.a(this);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(RecyclerFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecyclerFragment.class, "25")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          this.A.onNext(new c(6, this, p0));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "14")) {
          return;
       }
       this.nh();
       return;
    }
    public boolean b6(){
       return true;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "24")) {
          return;
       }
       this.A.onNext(new c(2, this));
       return;
    }
    public boolean c1(){
       Object obj = PatchProxy.apply(null, this, RecyclerFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getParentFragment() instanceof y && this.getParentFragment().t() != this) {
          b = false;
       }
       return b;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecyclerFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.getLayoutResId(), p1, false);
    }
    public int f(){
       return 0;
    }
    public List fg(){
       Object obj = PatchProxy.apply(null, this, RecyclerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.a(this);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecyclerFragment.class, "10")) {
          return;
       }
       this.t = p0.findViewById(this.qh());
       this.s = p0.findViewById(0x7f0a3537);
       this.th();
       this.w = this.yh();
       this.B = this.Ah();
       this.x = this.Bh();
       this.w.h(this);
       if (!PatchProxy.applyVoid(null, this, RecyclerFragment.class, "7")) {
          this.u.o1(this);
          RecyclerFragment tu = this.u;
          if (tu.f != null) {
             tu.W0(this.w.getItems());
          }
          this.u.q1(this.w);
          RecyclerView recyclerView = this.h0();
          if (recyclerView != null) {
             if (this.Fh()) {
                recyclerView.swapAdapter(this.v, 1);
             }else {
                recyclerView.setAdapter(this.v);
             }
          }
       }
       this.C.d(this);
       PresenterV2 presenterV2 = this.B2();
       this.y = presenterV2;
       presenterV2.f(p0);
       if (this.B != null) {
          this.y.i(this.fg().toArray());
       }
       if (this instanceof LiveLiteRecommendPanelFragment ^ 1) {
          this.Ch();
          this.a();
       }
       return;
    }
    public g g7(){
       return this.u;
    }
    public int getLayoutResId(){
       return 0x7f0d00f4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, RecyclerFragment.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(RecyclerFragment.class, new t());
       }else {
          obj.put(RecyclerFragment.class, null);
       }
       return obj;
    }
    public final RecyclerView h0(){
       String obj = PatchProxy.apply(null, this, RecyclerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t == null && this.getView() != null) {
          this.t = this.getView().findViewById(this.qh());
          if (SystemUtil.I()) {
             obj = this.getClass().getName();
             String str = (this.t == null)? " null ": " notnull ";
             obj = obj+str+Log.f(new RuntimeException("调用栈"));
             Log.g("RecyclerFragmentChecker", obj);
             u1.R("RecyclerFragmentChecker", obj, 14);
          }
       }
       return this.t;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, RecyclerFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c1();
    }
    public d ia(){
       return this.v;
    }
    public boolean kb(){
       return true;
    }
    public boolean mh(){
       return this instanceof TemplateSearchFeedListFragment;
    }
    public boolean n5(){
       return j.e(this);
    }
    public final void oh(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "20")) {
          return;
       }
       if (this.B != null) {
          return;
       }
       throw new RuntimeException("使用 refreshController 来使用 refresh2 协议");
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(RecyclerFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, RecyclerFragment.class, "9")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       this.z.a(this, p0, p1, p2);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "32")) {
          return;
       }
       this.A.onNext(new c(5, this));
       this.A.onComplete();
       super.onDestroy();
       RecyclerView recyclerView = this.h0();
       if (recyclerView != null) {
          if (this.Fh()) {
             recyclerView.swapAdapter(null, true);
          }else {
             recyclerView.setAdapter(null);
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "28")) {
          return;
       }
       super.onDestroyView();
       RecyclerFragment tD = this.D;
       if (tD != null) {
          tD.o();
       }
       RecyclerView recyclerView = this.h0();
       if (recyclerView != null) {
          recyclerView.clearOnChildAttachStateChangeListeners();
       }
       tD = this.w;
       if (tD != null) {
          tD.f(this);
       }
       tD = this.y;
       if (tD != null) {
          tD.destroy();
          this.y = null;
       }
       this.C.j();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "30")) {
          return;
       }
       this.A.onNext(new c(4, this));
       super.onPause();
       this.C.e();
       return;
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(RecyclerFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, RecyclerFragment.class, "8")) {
          return;
       }
       super.onRequestPermissionsResult(p0, p1, p2);
       this.z.b(this, p0, p1, p2);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "31")) {
          return;
       }
       this.A.onNext(new c(1, this));
       super.onResume();
       return;
    }
    public h$b ph(){
       return null;
    }
    public i q(){
       return this.w;
    }
    public int qh(){
       return 0x7f0a34da;
    }
    public final d r9(){
       return this.C;
    }
    public boolean rg(){
       return p.e(this);
    }
    public final k rh(){
       return this.B;
    }
    public final void s6(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerFragment.class, "17")) {
          return;
       }
       this.oh();
       this.B.s6(p0);
       return;
    }
    public t sh(){
       return this.x;
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecyclerFragment.class, "4")) {
          return;
       }
       this.h0().setItemAnimator(objArray);
       this.h0().setLayoutManager(this.xh());
       if (!PatchProxy.applyVoid(objArray, this, RecyclerFragment.class, "6")) {
          RecyclerFragment tu = this.u;
          if (tu != null) {
             tu.Z0();
          }
          tu = this.v;
          if (tu != null) {
             RecyclerView$Adapter uAdapter = tu.a1();
             RecyclerView$Adapter uAdapter1 = this.v.Y0();
             RecyclerView$Adapter uAdapter2 = this.v.W0();
             if (uAdapter instanceof g) {
                uAdapter.Z0();
             }
             if (uAdapter1 instanceof g) {
                uAdapter1.Z0();
             }
             if (uAdapter2 instanceof g) {
                uAdapter2.Z0();
             }
          }
          g og = this.vh();
          this.u = og;
          this.v = new d(og, this.wh(), objArray);
       }
       f uof = this.zh();
       this.D = uof;
       if (RecyclerFragment.E) {
          uof.n(new m(this));
       }
       this.t.setRecycledViewPool(this.D);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragment.class, "23")) {
          return;
       }
       if (this.Dh()) {
          RecyclerFragment tu = this.u;
          if (tu != null && (tu.R0() && this.i0())) {
             this.nh();
          }
       }
       this.A.onNext(new c(3, this));
       return;
    }
    public boolean u2(){
       return j.f(this);
    }
    public boolean uh(){
       RecyclerFragment obj = PatchProxy.apply(null, this, RecyclerFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && obj.R0())? true: false;
       return b;
    }
    public final boolean v(boolean p0){
       if (PatchProxy.isSupport(RecyclerFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, RecyclerFragment.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.oh();
       return this.B.v(p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(RecyclerFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecyclerFragment.class, "26")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          this.C.c(p0);
          if (p0 && (this.N5() && (this.b6() && activity instanceof GifshowActivity))) {
             this.b2(1);
          }
       label_0042 :
          this.C.b();
       }
       return;
    }
    public abstract g vh();
    public final void w8(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerFragment.class, "18")) {
          return;
       }
       this.oh();
       this.B.w8(p0);
       return;
    }
    public List wh(){
       return null;
    }
    public boolean x0(){
       return j.a(this);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, RecyclerFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getContext());
    }
    public abstract i yh();
    public f zh(){
       Object obj = PatchProxy.apply(null, this, RecyclerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
}
