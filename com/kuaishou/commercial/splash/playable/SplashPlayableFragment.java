package com.kuaishou.commercial.splash.playable.SplashPlayableFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import wkd.b;
import tjc.c;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import ez.b;
import tjc.b;
import com.kuaishou.commercial.splash.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.playable.g;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.splash.SplashUtils;
import java.lang.StringBuilder;
import i2b.a;
import java.util.HashMap;

public final class SplashPlayableFragment extends BaseFragment	// class@0015b8
{
    public View j;
    public PresenterV2 k;
    public b l;
    public b m;
    public SplashInfo$PlayablePopupInfo n;
    public HashMap o;

    public void SplashPlayableFragment(){
       super(null, null, null, null, 15, null);
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, SplashPlayableFragment.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPlayableFragment", "exitException", objArray);
       c uoc = b.a(-1608526086);
       a.o(uoc, "manager");
       if (uoc.getState() == 3) {
          uoc.a0();
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       SplashPlayableFragment tn;
       SplashPlayableFragment tk;
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashPlayableFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       String str = "mSplashPlayableCallerContext";
       if (!PatchProxy.applyVoid(objArray, this, SplashPlayableFragment.class, "3")) {
          b uob = new b();
          this.l = uob;
          tn = this.m;
          if (tn == null) {
             a.S("mSplashAdData");
          }
          uob.b = tn.b;
          tk = this.l;
          if (tk == null) {
             a.S(str);
          }
          tk.c = this;
          tk = this.l;
          if (tk == null) {
             a.S(str);
          }
          tk.e = true;
          tk = this.l;
          if (tk == null) {
             a.S(str);
          }
          tk.f = new h(this.getActivity());
       }
       if (!PatchProxy.applyVoid(objArray, this, SplashPlayableFragment.class, "4")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.k = presenterV2;
          tn = this.n;
          if (tn == null) {
             a.S("mPlayablePopInfo");
          }
          presenterV2.U7(new g(tn.mPopupShowType, true));
          View view = this.getView();
          String str1 = "mPresenter";
          if (view == null) {
             this.ch();
          }else {
             tn = this.k;
             if (tn == null) {
                a.S(str1);
             }
             tn.f(view);
          }
          tk = this.k;
          if (tk == null) {
             a.S(str1);
          }
          objArray = new Object[2];
          SplashPlayableFragment tl = this.l;
          if (tl == null) {
             a.S(str);
          }
          objArray[0] = tl;
          objArray[1] = this.getActivity();
          tk.i(objArray);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object[] objArray;
       SplashPlayableFragment this;
       View view;
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SplashPlayableFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       obj = b.a(-1608526086);
       a.o(obj, "Singleton.get\(SplashDataManager::class.java\)");
       obj = obj.a();
       int i = 0;
       if (obj == null) {
          objArray = new Object[i];
          j0.c("SplashPlayableFragment", "no splashAdData", objArray);
          this.ch();
          return super.onCreateView(p0, p1, p2);
       }else {
          this.m = obj;
          h0 oh0 = d.a(-536296199);
          this = this.m;
          if (this == null) {
             a.S("mSplashAdData");
          }
          if (!oh0.bY(this.b)) {
             objArray = new Object[i];
             j0.c("SplashPlayableFragment", "can not ShowPlayablePopup", objArray);
             this.ch();
             return super.onCreateView(p0, p1, p2);
          }else {
             SplashPlayableFragment tm = this.m;
             if (tm == null) {
                a.S("mSplashAdData");
             }
             SplashInfo$PlayablePopupInfo playablePopu = SplashUtils.t(tm);
             if (playablePopu == null) {
                objArray = new Object[i];
                j0.c("SplashPlayableFragment", " no PlayablePopInfo", objArray);
                this.ch();
                return super.onCreateView(p0, p1, p2);
             }else {
                this.n = playablePopu;
                StringBuilder str = " mPlayablePopInfo.mPopupShowType : ";
                tm = this.n;
                if (tm == null) {
                   a.S("mPlayablePopInfo");
                }
                objArray = new Object[i];
                j0.f("SplashPlayableFragment", str+tm.mPopupShowType, objArray);
                SplashPlayableFragment tn = this.n;
                if (tn == null) {
                   a.S("mPlayablePopInfo");
                }
                if (tn.mPopupShowType == 2) {
                   view = a.g(p0, R.layout.arg_RES_7f0d08bb, p1, i);
                   a.o(view, "KwaiLayoutInflater.infla¡­container,\n        false\)");
                   this.j = view;
                }else {
                   view = a.g(p0, R.layout.arg_RES_7f0d08ba, p1, i);
                   a.o(view, "KwaiLayoutInflater.infla¡­_popup, container, false\)");
                   this.j = view;
                }
                SplashPlayableFragment tj = this.j;
                if (tj == null) {
                   a.S("mContentView");
                }
                tj.setAlpha(0);
                tj = this.j;
                if (tj == null) {
                   a.S("mContentView");
                }
                return tj;
             }
          }
       }
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, SplashPlayableFragment.class, "7")) {
       }else {
          SplashPlayableFragment to = this.o;
          if (to != null) {
             to.clear();
          }
       }
       return;
    }
}
