package com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import rsd.a;
import rsd.f;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import android.app.Activity;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import uc6.e;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import id5.u;
import ge5.d;
import joc.a0;
import joc.z;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import b8a.w;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;
import java.util.Map;
import wx6.d;
import p5a.e;
import k2b.e0;
import k2b.u1;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import android.content.Context;
import m9a.m;
import ekd.c;
import f6a.g;
import f6a.h;
import im8.c;

public final class NasaPanoramaDetailFragment extends BaseFragment	// class@001722
{
    public QPhoto j;
    public String k;
    public w l;
    public e m;
    public d n;
    public PresenterV2 o;
    public final f p;
    public c q;
    public SwipeLayout r;
    public a0 s;
    public static final n[] t;
    public static final NasaPanoramaDetailFragment$a u;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(NasaPanoramaDetailFragment.class, "mUsePlayerKit", "getMUsePlayerKit\(\)Z", 0))};
       NasaPanoramaDetailFragment.t = onArray;
       NasaPanoramaDetailFragment.u = new NasaPanoramaDetailFragment$a(null);
    }
    public void NasaPanoramaDetailFragment(){
       super(null, null, null, null, 15, null);
       this.p = a.a.a();
    }
    public int M(){
       return 1;
    }
    public final boolean ch(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaPanoramaDetailFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "3");
       return this.p.a(this, NasaPanoramaDetailFragment.t[0]).booleanValue();
    }
    public final boolean dh(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaPanoramaDetailFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.ch()) {
          if (this.n != null) {
          label_0026 :
             b = false;
          }
       }else if(this.m == null){
       }
       PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "12");
       return b;
    }
    public String h5(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaPanoramaDetailFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "10");
       return String.valueOf(this.hashCode());
    }
    public String o(){
       return "PANORAMIC_SUB_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaPanoramaDetailFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.dh()) {
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "7");
          return;
       }else {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             KwaiContentFrame kwaiContentF = activity.findViewById(R.id.panorama_detail_content_frame);
             if (kwaiContentF != null) {
                this.q = new e(kwaiContentF);
             }
          }
          this.r = w9.c(this.getActivity());
          activity = this.getActivity();
          a0 uoa0 = null;
          if (!activity instanceof u) {
             activity = uoa0;
          }
          if (activity != null) {
             d uod = activity.p();
             if (uod != null) {
                uoa0 = uod.b();
             }
          }
          this.s = uoa0;
          NasaPanoramaDetailFragment tr = this.r;
          if (tr != null) {
             tr.n(false, 17);
          }
          tr = this.s;
          if (tr != null) {
             tr.a(12);
          }
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "7");
          return;
       }
    }
    public void onCreate(Bundle p0){
       NasaPanoramaDetailFragment tl;
       Map map;
       NasaPanoramaDetailFragment tk;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaPanoramaDetailFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       String str = null;
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "ARG_PHOTO"): str;
       if (!serializable instanceof QPhoto) {
          serializable = str;
       }
       String str1 = "Required value was null.";
       if (serializable != null) {
          this.j = serializable;
          serializable = this.getArguments();
          String str2 = (serializable != null)? serializable.getString("ARG_MEDIA_PLAYER_CACHED_KEY"): str;
          if (str2 != null) {
             this.k = str2;
             str2 = this.getArguments();
             if (str2 != null) {
                str = Boolean.valueOf(str2.getBoolean("ARG_USE_PLAYER_KIT"));
             }
             if (str != null) {
                boolean b = str.booleanValue();
                str1 = "4";
                if (!PatchProxy.isSupport2(NasaPanoramaDetailFragment.class, str1) || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(b), this, NasaPanoramaDetailFragment.class, str1)) {
                   this.p.b(this, NasaPanoramaDetailFragment.t[0], Boolean.valueOf(b));
                   PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, str1);
                }
                FragmentActivity activity = this.getActivity();
                if (activity != null) {
                   ViewModel viewModel = ViewModelProviders.of(activity).get(w.class);
                   a.o(viewModel, "ViewModelProviders.of\(ac¡­amaViewModel::class.java\)");
                   this.l = viewModel;
                   str1 = "mPanoramaViewModel";
                   if (this.ch()) {
                      tl = this.l;
                      if (tl == null) {
                         a.S(str1);
                      }
                      map = tl.o0();
                      tk = this.k;
                      if (tk == null) {
                         a.S("mFragmentKey");
                      }
                      this.n = map.get(tk);
                   }else {
                      tl = this.l;
                      if (tl == null) {
                         a.S(str1);
                      }
                      map = tl.p0();
                      tk = this.k;
                      if (tk == null) {
                         a.S("mFragmentKey");
                      }
                      this.m = map.get(tk);
                   }
                   if (this.dh()) {
                      PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "5");
                      return;
                   }else {
                      u1.L0(this);
                      PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "5");
                      return;
                   }
                }else {
                   PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "5");
                   throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                }
             }else {
                PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "5");
                throw new IllegalArgumentException(str1.toString());
             }
          }else {
             PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "5");
             throw new IllegalArgumentException(str1.toString());
          }
       }else {
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "5");
          throw new IllegalArgumentException(str1.toString());
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       p2 = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, NasaPanoramaDetailFragment.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (this.dh()) {
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "6");
          return null;
       }else if(this.ch()){
          i = 0x7f0d0848;
       }else {
          i = 0x7f0d0847;
       }
       PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "6");
       return a.g(p0, i, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaPanoramaDetailFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       if (this.dh()) {
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "9");
          return;
       }else {
          NasaPanoramaDetailFragment to = this.o;
          if (to != null) {
             to.destroy();
          }
          to = this.r;
          if (to != null) {
             to.n(true, 17);
          }
          to = this.s;
          if (to != null) {
             to.g(12);
          }
          GifshowActivity activity = this.getActivity();
          if (activity != null) {
             x ox = activity.N2();
             if (ox != null) {
                ox.i(true);
             }
          }
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "9");
          return;
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       NasaPanoramaDetailFragment to;
       Object[] objArray;
       NasaPanoramaDetailFragment tj;
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, NasaPanoramaDetailFragment.class, "8")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (this.dh()) {
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "8");
          return;
       }else {
          m.a(p0.getContext());
          c.c(p0, "panorama");
          String str = "11";
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, NasaPanoramaDetailFragment.class, str);
          if (presenterV2 != PatchProxyResult.class) {
          }else {
             presenterV2 = new PresenterV2();
             if (this.ch()) {
                presenterV2.U7(new g());
             }else {
                presenterV2.U7(new h());
             }
             PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, str);
          }
          this.o = presenterV2;
          if (presenterV2 != null) {
             presenterV2.f(p0);
          }
          String str1 = "mPhoto";
          int i = 3;
          if (this.ch()) {
             to = this.o;
             if (to != null) {
                objArray = new Object[i];
                tj = this.j;
                if (tj == null) {
                   a.S(str1);
                }
                objArray[0] = tj;
                objArray[1] = new c("INJECT_KEY_SESSION_GEN", this.n);
                objArray[2] = this;
                to.i(objArray);
             }
          }else {
             to = this.o;
             if (to != null) {
                objArray = new Object[i];
                tj = this.j;
                if (tj == null) {
                   a.S(str1);
                }
                objArray[0] = tj;
                objArray[1] = new c("MEDIA_PLAYER_ACCESS_ID", this.m);
                objArray[2] = this;
                to.i(objArray);
             }
          }
          GifshowActivity activity = this.getActivity();
          if (activity != null) {
             x ox = activity.N2();
             if (ox != null) {
                ox.i(0);
             }
          }
          PatchProxy.onMethodExit(NasaPanoramaDetailFragment.class, "8");
          return;
       }
    }
}
