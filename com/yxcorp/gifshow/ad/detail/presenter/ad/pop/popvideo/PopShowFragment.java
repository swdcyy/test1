package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx8.l;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l09.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$b;
import androidx.fragment.app.FragmentActivity;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import brd.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$d;
import qy8.a;
import java.util.HashMap;

public final class PopShowFragment extends BaseFragment	// class@00160a
{
    public View j;
    public PresenterV2 k;
    public boolean l;
    public BaseFeed m;
    public DialogFragment n;
    public c o;
    public l p;
    public final Runnable q;
    public HashMap r;
    public static final PopShowFragment$a s;

    static {
       PopShowFragment.s = new PopShowFragment$a(null);
    }
    public void PopShowFragment(){
       super(null, null, null, null, 15, null);
       this.q = super(this);
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, PopShowFragment.class, "9")) {
          return;
       }
       if (this.l == null) {
          PopShowFragment tp = this.p;
          if (tp != null) {
             tp.c();
          }
          this.l = true;
       }
       return;
    }
    public final void dh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopShowFragment.class, "5")) {
          return;
       }
       a.p(p0, "reason");
       Object[] objArray = new Object[0];
       j0.f("PopShowFragment", "exitException "+p0, objArray);
       this.ch();
       PopShowFragment tn = this.n;
       if (tn != null) {
          tn.dismiss();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       PopShowFragment to;
       if (PatchProxy.applyVoidOneRefs(p0, this, PopShowFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       String str = "no data";
       if (this.m != null && (this.n == null || this.getView() == null)) {
          this.dh(str);
          return;
       }else {
          PhotoAdvertisement$PopPlayInfo popPlayInfo = null;
          if (!PatchProxy.applyVoid(null, this, PopShowFragment.class, "4")) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.k = presenterV2;
             PopShowFragment tm = this.m;
             if (tm == null) {
                this.dh(str);
             }else {
                presenterV2.U7(new d());
                to = this.k;
                if (to != null) {
                   View view = this.getView();
                   a.m(view);
                   to.f(view);
                }
                PopShowFragment$b uob = new PopShowFragment$b();
                uob.b = this;
                if (!PatchProxy.applyVoidOneRefs(tm, uob, PopShowFragment$b.class, "2")) {
                   a.p(tm, "<set-?>");
                   uob.c = tm;
                }
                PopShowFragment tk = this.k;
                if (tk != null) {
                   Object[] objArray = new Object[]{uob,this.getActivity()};
                   tk.i(objArray);
                }
             }
          }
          if (!PatchProxy.applyVoid(null, this, PopShowFragment.class, "8") && c.b(this.m)) {
             to = this.q;
             PhotoAdvertisement$PopPlayInfo popPlayInfo1 = c.E(this.m);
             if (popPlayInfo1 != null) {
                popPlayInfo = popPlayInfo1.mShowWebDelayTimeMs;
             }
             k1.r(to, (long)popPlayInfo);
          }
          to = this.o;
          if (to != null) {
             to.onNext(Boolean.TRUE);
          }
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       BaseFeed obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PopShowFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       p2 = this.getArguments();
       obj = null;
       Serializable serializable = (p2 != null)? SerializableHook.getSerializable(p2, "photo_id"): obj;
       if (serializable instanceof BaseFeed) {
          Serializable serializable1 = serializable;
       }
       this.m = obj;
       View view = a.g(p0, R.layout.arg_RES_7f0d117d, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­container,\n        false\)");
       this.j = view;
       if (view == null) {
          a.S("mContentView");
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PopShowFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       k1.m(new PopShowFragment$d(this));
       this.ch();
       PopShowFragment to = this.o;
       if (to != null) {
          to.onNext(Boolean.FALSE);
       }
       to = this.m;
       if (to != null) {
          new a(to).a();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PopShowFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       PopShowFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
       }
       this.k = null;
       if (!PatchProxy.applyVoid(null, this, PopShowFragment.class, "11")) {
          tk = this.r;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
}
