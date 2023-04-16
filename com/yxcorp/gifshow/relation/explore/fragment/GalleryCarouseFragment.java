package com.yxcorp.gifshow.relation.explore.fragment.GalleryCarouseFragment;
import qvb.q;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.kwai.robust.PatchProxyResult;
import dac.f0;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
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
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import com.yxcorp.gifshow.relation.explore.fragment.k;
import a7c.h;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.n;
import java.util.ArrayList;
import im8.c;
import f7c.d;
import dac.e0;
import erd.g;
import crd.b;
import qvb.p;

public class GalleryCarouseFragment extends BaseFragment implements q, g	// class@001806
{
    public f j;
    public PresenterV2 k;
    public PublishSubject l;
    public h m;
    public User n;
    public String o;
    public int p;
    public boolean q;
    public static final int r;

    public void GalleryCarouseFragment(){
       super();
       this.l = PublishSubject.g();
       this.q = false;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(GalleryCarouseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, GalleryCarouseFragment.class, "8")) {
          return;
       }
       if (this.q == null) {
          this.q = true;
          Rubas.c("pymk_redhat_style2_page_error");
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(GalleryCarouseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, GalleryCarouseFragment.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, GalleryCarouseFragment.class, "6") && this.q == null) {
          Rubas.c("pymk_redhat_style2_page_start");
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GalleryCarouseFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new f0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, GalleryCarouseFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(GalleryCarouseFragment.class, new f0());
       }else {
          obj.put(GalleryCarouseFragment.class, null);
       }
       return obj;
    }
    public String getUrl(){
       return "";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryCarouseFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.o = this.getArguments().getString("userIds");
          this.p = this.getArguments().getInt("recoPortal", 0);
       }
       if (!PatchProxy.applyVoid(null, this, GalleryCarouseFragment.class, "3") && this.q == null) {
          Rubas.c("pymk_redhat_style2_page_enter");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GalleryCarouseFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0405, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, GalleryCarouseFragment.class, "14")) {
          return;
       }
       super.onDestroyView();
       GalleryCarouseFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GalleryCarouseFragment.class, "9")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, this, GalleryCarouseFragment.class, "11");
       if (uob != patchProxyRe) {
       }else {
          boolean b = b.c().mq().a(this.getActivity());
          GalleryCarouseFragment tp = this.p;
          if (tp <= null) {
             tp = (b)? 73: 9;
          }
       label_003a :
          uob = new b(tp);
          if (!TextUtils.x(this.o)) {
             uob.s2(this.o);
          }
          uob.r2(2);
          uob.q2(c.g());
          uob.h(this);
       }
       this.j = uob;
       h$a uoa = PatchProxy.apply(objArray, this, GalleryCarouseFragment.class, "15");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new h$a(objArray, this.j, this.m());
          uoa.a(k.b);
          uoa = uoa.l(objArray);
       }
       this.m = uoa.b();
       if (!PatchProxy.applyVoidOneRefs(p0, this, GalleryCarouseFragment.class, "10")) {
          String str = "13";
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, GalleryCarouseFragment.class, str);
          if (presenterV2 != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             presenterV2.U7(new n());
             PatchProxy.onMethodExit(GalleryCarouseFragment.class, str);
          }
          this.k = presenterV2;
          presenterV2.f(p0);
          GalleryCarouseFragment tk = this.k;
          ArrayList uArrayList = PatchProxy.apply(objArray, this, GalleryCarouseFragment.class, "12");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(new c("FRAGMENT", this));
             uArrayList.add(new c("PAGE_LIST", this.j));
             uArrayList.add(new c("PYMK_ACCESS_IDSPYMK_PARAMS", this.m));
             uArrayList.add(new c("PYMK_ACCESS_IDScurrentUser", this.l));
             uArrayList.add(new c("PYMK_ACCESS_IDSITEM_CLICK_LISTENER", this.m.u()));
          }
          tk.i(uArrayList.toArray());
       }
       this.l.subscribe(new e0(this));
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(GalleryCarouseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, GalleryCarouseFragment.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, GalleryCarouseFragment.class, "4") && this.q == null) {
          this.q = true;
          Rubas.c("pymk_redhat_style2_page_end");
       }
       return;
    }
}
