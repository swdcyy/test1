package com.yxcorp.gifshow.map.map.PhotoMapFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.map.map.PhotoMapFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j6b.m;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import j6b.d0;
import com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter;
import com.yxcorp.gifshow.map.map.presenter.a;
import j6b.b0;
import u5b.d;
import android.os.Bundle;
import android.content.Context;
import androidx.fragment.app.Fragment;
import yz6.i;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import zf6.l;
import android.app.Activity;
import ekd.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import k6b.g;
import i2b.a;
import ekd.m1;
import yz6.u;
import tkd.b;
import tkd.d;
import g07.a;
import u5b.a;
import q87.c;
import com.yxcorp.gifshow.map.map.utils.MapUtils;
import k6b.f;
import java.util.Objects;
import java.io.File;
import qrd.l1;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import rvb.k;
import rvb.k$a;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import rvb.b;
import rvb.n;
import b6b.r;
import rvb.f;
import rvb.c;
import rvb.g$b;
import zf6.k;
import java.util.Map;
import b6b.a;
import com.yxcorp.gifshow.map.map.PhotoMapFragment$b;
import g6b.c;
import lnc.g2;

public final class PhotoMapFragment extends BaseFragment implements g2$a	// class@001c80
{
    public g2 j;
    public a k;
    public i l;
    public PhotoMapFragment$b m;
    public static final PhotoMapFragment$a n;

    static {
       PhotoMapFragment.n = new PhotoMapFragment$a(null);
    }
    public void PhotoMapFragment(){
       super(null, null, null, null, 15, null);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhotoMapFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new m());
       obj.U7(new MapRolePresenter());
       obj.U7(new MyLocationPresenter());
       obj.U7(new d0());
       obj.U7(new MapRefreshBtnPresenter());
       obj.U7(new a());
       obj.U7(new b0());
       PatchProxy.onMethodExit(PhotoMapFragment.class, "4");
       return obj;
    }
    public int f(){
       return 297;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PhotoMapFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d();
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, PhotoMapFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.c();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMapFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoMapFragment tl = this.l;
       if (tl != null) {
          tl.c(this.getContext(), p0);
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       i.h(activity, 0, l.r());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       MapUtils a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoMapFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       a.p(p0, "inflater");
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d04fa, p1, b);
       View view1 = m1.f(view, R.id.map_view);
       a.o(view1, "ViewBindUtils.bindWidget\(view, R.id.map_view\)");
       if (u.d()) {
          i oi = d.a(-115370941).Lj(this.getContext());
          Object[] objArray = new Object[b];
          a.c.w("PhotoMapFragment", "custom exit init with mapCustom", objArray);
          a = MapUtils.a;
          a.o(oi, "this");
          f h = f.h;
          Objects.requireNonNull(h);
          File uFile = PatchProxy.apply(null, h, f.class, "11");
          if (uFile != patchProxyRe) {
          }else {
             String str = h.c();
             uFile = (h.e(str))? new File(str): null;
          }
          a.a(oi, uFile);
          this.l = oi;
          Objects.requireNonNull(oi, "null cannot be cast to non-null type android.view.View");
          view1.addView(oi);
       }
       int i = 6;
       if (!PatchProxy.applyVoid(null, null, g.class, "3") && LocalConfigKeyHelper.b()) {
          n.f(k.f, null, null, i, null).f(r.a);
       }
       if (!PatchProxy.applyVoid(null, null, g.class, "16") && LocalConfigKeyHelper.b()) {
          n.f(k.f, null, null, i, null).f(g$b.c);
       }
       if (!PatchProxy.applyVoid(null, null, g.class, "14") && LocalConfigKeyHelper.b()) {
          n.f(k.f, null, null, i, null).f(g$b.b);
       }
       return view;
    }
    public void onDestroyView(){
       PhotoMapFragment tl;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoMapFragment.class, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, PhotoMapFragment.class, "11") && this.l != null) {
          if (k.d()) {
             tl = this.l;
             if (tl != null) {
                tl.setMapCustomStyleEnable(false);
             }
          }
          tl = this.l;
          if (tl != null) {
             tl.onDestroy();
          }
       }
    label_0030 :
       if (!PatchProxy.applyVoid(objArray, objArray, g.class, "2") && LocalConfigKeyHelper.b()) {
          g.a.clear();
          n.f(k.f, objArray, objArray, 6, objArray).b(g$b.a);
       }
       super.onDestroyView();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, PhotoMapFragment.class, "6")) {
          return;
       }
       super.onResume();
       this.S2(this);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMapFragment.class, "7")) {
          return;
       }
       a.p(p0, "outState");
       super.onSaveInstanceState(p0);
       PhotoMapFragment tl = this.l;
       if (tl != null) {
          tl.onSaveInstanceState(p0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoMapFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       a uoa = new a();
       this.k = uoa;
       uoa.f = this;
       PhotoMapFragment tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       PhotoMapFragment tm = this.m;
       String str = "mPhotoMapParams";
       if (tm == null) {
          a.S(str);
       }
       tk.b = tm.a;
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.i = tm.f;
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.j = tm.g;
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.k = tm.h;
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.c = tm.b;
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.e = tm.c;
       tk = this.m;
       if (tk == null) {
          a.S(str);
       }
       c uoc = tk.a();
       if (uoc != null) {
          uoc.a = this.l;
       }
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.d = tm.a();
       tk = this.k;
       if (tk == null) {
          a.S("mCallerContext");
       }
       tm = this.m;
       if (tm == null) {
          a.S(str);
       }
       tk.g = tm.e;
       Object[] objArray = null;
       PhotoMapFragment photoMapFrag = 6;
       if (!PatchProxy.applyVoid(objArray, objArray, og, "15") && LocalConfigKeyHelper.b()) {
          n.f(k.f, objArray, objArray, photoMapFrag, objArray).b(g$b.b);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, og, "17") && LocalConfigKeyHelper.b()) {
          n.f(k.f, objArray, objArray, photoMapFrag, objArray).b(g$b.c);
       }
       if (!PatchProxy.applyVoid(objArray, this, PhotoMapFragment.class, "3")) {
          if (this.j == null) {
             this.j = new g2(this, this);
          }
          tk = this.j;
          if (tk != null) {
             Object[] objArray1 = new Object[2];
             objArray1[0] = this;
             photoMapFrag = this.k;
             if (photoMapFrag == null) {
                a.S("mCallerContext");
             }
             objArray1[1] = photoMapFrag;
             tk.b(objArray1);
          }
       }
       return;
    }
}
