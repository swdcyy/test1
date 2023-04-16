package com.yxcorp.gifshow.relation.explore.fragment.GalleryBigCardFragment;
import qvb.q;
import dac.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.yxcorp.gifshow.util.rx.RxBus;
import dac.a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.pymk.f;
import vt5.e;
import au5.b;
import yt5.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import gac.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n7c.c;
import qvb.a;
import a7c.h$a;
import mw4.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import dac.c0;
import f7c.d;
import dac.d0;
import a7c.h;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import java.util.ArrayList;
import im8.c;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import qrd.l1;
import com.yxcorp.gifshow.relation.explore.fragment.GalleryBigCardFragment$a;
import erd.g;
import crd.b;
import qvb.p;

public final class GalleryBigCardFragment extends BaseFragment implements q, e	// class@001805
{
    public f j;
    public PresenterV2 k;
    public PublishSubject l;
    public PublishSubject m;
    public h n;
    public User o;
    public String p;
    public int q;
    public boolean r;

    public void GalleryBigCardFragment(){
       super(null, null, null, null, 15, null);
       PublishSubject this = PublishSubject.g();
       a.o(this, "PublishSubject.create<User>\(\)");
       this.l = this;
       this = PublishSubject.g();
       a.o(this, "PublishSubject.create<Int>\(\)");
       this.m = this;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(GalleryBigCardFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, GalleryBigCardFragment.class, "8")) {
          return;
       }
       a.p(p1, "error");
       if (this.r == null) {
          this.r = true;
          Rubas.f("pymk_redhat_style2_page_error", null, null, null, 14, null);
       }
       return;
    }
    public void O8(){
       PatchProxy.applyVoid(null, this, GalleryBigCardFragment.class, "17");
    }
    public void Td(boolean p0){
       if (PatchProxy.isSupport(GalleryBigCardFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GalleryBigCardFragment.class, "16")) {
          return;
       }
       RxBus.f.b(new a(p0));
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(GalleryBigCardFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, GalleryBigCardFragment.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, GalleryBigCardFragment.class, "6") && this.r == null) {
          Rubas.f("pymk_redhat_style2_page_start", null, null, null, 14, null);
       }
       return;
    }
    public String getUrl(){
       return "";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryBigCardFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       Object[] objArray = null;
       String str = (p0 != null)? p0.getString("userIds"): objArray;
       this.p = str;
       str = this.getArguments();
       Integer integer = (str != null)? Integer.valueOf(str.getInt("recoPortal")): objArray;
       a.m(integer);
       this.q = integer.intValue();
       if (!PatchProxy.applyVoid(objArray, this, GalleryBigCardFragment.class, "3") && this.r == null) {
          Rubas.f("pymk_redhat_style2_page_enter", null, null, null, 14, null);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GalleryBigCardFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0406, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, GalleryBigCardFragment.class, "14")) {
          return;
       }
       super.onDestroyView();
       GalleryBigCardFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       GalleryBigCardFragment tn;
       boolean i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GalleryBigCardFragment.class, "9")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, this, GalleryBigCardFragment.class, "11");
       if (uob != patchProxyRe) {
       }else {
          i = b.c().mq().a(this.getActivity());
          tn = this.q;
          if (tn <= null) {
             int i1 = (i)? 73: 9;
          }
       label_003f :
          uob = new b(tn);
          if (!TextUtils.x(this.p)) {
             uob.s2(this.p);
          }
          uob.r2(2);
          uob.q2(c.g());
          uob.h(this);
       }
       this.j = uob;
       h$a uoa = PatchProxy.apply(objArray, this, GalleryBigCardFragment.class, "15");
       if (uoa != patchProxyRe) {
       }else {
          i = a.r();
          h$a uoa1 = new h$a(objArray, this.j, this.m());
          uoa1.m(new c0(i));
          uoa1.a(new d0(i));
          uoa = uoa1.l(objArray);
          a.o(uoa, "PymkParams.Builder\(null,бн     }.setPymkLabel\(null\)");
       }
       this.n = uoa.b();
       if (!PatchProxy.applyVoidOneRefs(p0, this, GalleryBigCardFragment.class, "10")) {
          String str = "13";
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, GalleryBigCardFragment.class, str);
          if (presenterV2 != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             presenterV2.U7(new GalleryPageBigCardPresenter());
             PatchProxy.onMethodExit(GalleryBigCardFragment.class, str);
          }
          presenterV2.f(p0);
          ArrayList uArrayList = PatchProxy.apply(objArray, this, GalleryBigCardFragment.class, "12");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(new c("FRAGMENT", this));
             uArrayList.add(new c("PAGE_LIST", this.j));
             uArrayList.add(new c("PYMK_ACCESS_IDSPYMK_PARAMS", this.n));
             uArrayList.add(new c("PYMK_ACCESS_IDScurrentUser", this.l));
             tn = this.n;
             if (tn != null) {
                objArray = tn.u();
             }
             uArrayList.add(new c("PYMK_ACCESS_IDSITEM_CLICK_LISTENER", objArray));
             uArrayList.add(new c("PYMK_ACCESS_IDSbigcard_btn", this.m));
          }
          Object[] objArray1 = new Object[0];
          Object[] objArray2 = uArrayList.toArray(objArray1);
          Objects.requireNonNull(objArray2, "null cannot be cast to non-null type kotlin.Array<T>");
          presenterV2.i(Arrays.copyOf(objArray2, objArray2.length));
          this.k = presenterV2;
       }
       this.l.subscribe(new GalleryBigCardFragment$a(this));
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(GalleryBigCardFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, GalleryBigCardFragment.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, GalleryBigCardFragment.class, "4") && this.r == null) {
          this.r = true;
          Rubas.f("pymk_redhat_style2_page_end", null, null, null, 14, null);
       }
       return;
    }
}
