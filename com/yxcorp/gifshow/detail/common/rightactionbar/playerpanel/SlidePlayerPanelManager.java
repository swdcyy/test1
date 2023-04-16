package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$b;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import sz9.u;
import de5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sz9.a;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sz9.w;
import sz9.w$b;
import crd.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$mSaveTrafficViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import xy5.j;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import i3a.b;
import java.lang.Boolean;
import uw9.c;
import i3a.a;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import com.airbnb.lottie.RenderMode;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import sz9.m;
import android.animation.Animator$AnimatorListener;
import e17.s$a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$c;
import ok.h;
import lnc.b9;
import androidx.fragment.app.Fragment;
import ro5.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.HashMap;
import sz9.t;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import sz9.i;
import java.lang.Enum;
import p5a.e;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import com.kwai.player.KwaiRepresentation;
import le5.f;
import sz9.x;
import java.util.HashSet;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1;
import i3a.c;
import msd.l;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1;
import qrd.l1;
import java.lang.CharSequence;
import e17.i;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import sz9.v;

public final class SlidePlayerPanelManager	// class@0014ef
{
    public SwipeLayout a;
    public LottieAnimationView b;
    public b c;
    public b d;
    public b e;
    public a f;
    public a g;
    public SmallWindowSwitchFragment h;
    public PhotoSaveTrafficControlFragment i;
    public final w j;
    public final a k;
    public final p l;
    public final j m;
    public d n;
    public final FragmentActivity o;
    public final e0 p;
    public final SlidePageConfig q;
    public final u r;
    public final a s;
    public final BaseFragment t;
    public final a u;
    public final t v;
    public static final SlidePlayerPanelManager$b w;

    static {
       SlidePlayerPanelManager.w = new SlidePlayerPanelManager$b(null);
    }
    public void SlidePlayerPanelManager(FragmentActivity p0,e0 p1,SlidePageConfig p2,u p3,a p4,BaseFragment p5,a p6,t p7){
       a.p(p0, "activity");
       a.p(p1, "logPage");
       a.p(p2, "pageConfig");
       a.p(p3, "playerPanelPhotoConfig");
       a.p(p4, "playModule");
       a.p(p5, "fragment");
       a.p(p6, "externalChangeConfig");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
       this.u = p6;
       this.v = p7;
       this.j = w.i.a(p0);
       this.k = new a();
       this.l = s.c(new SlidePlayerPanelManager$mSaveTrafficViewModel$2(this));
       this.m = new j(p3.a());
       this.a = w9.c(p0);
       if (p0 instanceof GifshowActivity) {
          this.n = new d(p3.a(), p0);
       }
       if (p7 != null) {
          b uob = p7.subscribe(new SlidePlayerPanelManager$a(this), Functions.e);
          a.o(uob, "it.subscribe\({\n        m¡­Functions.ERROR_CONSUMER\)");
          this.b(uob);
       }
       return;
    }
    public final String a(){
       String obj = PatchProxy.apply(null, this, SlidePlayerPanelManager.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.r.b()) {
          obj = a1.p(R.string.arg_RES_7f103ca7);
          a.o(obj, "CommonUtil.string\(R.stri¡­ayer_panel_accessibility\)");
          return obj;
       }else {
          obj = b.d();
          if (obj != null) {
             int i = obj.hashCode();
             if (i != -1990637964) {
                if (i != 0x55635842) {
                   if (i == 0x570086c9 && obj.equals("ysopsia_blue")) {
                      obj = a1.p(R.string.arg_RES_7f103ca8);
                      a.o(obj, "CommonUtil.string\(R.stri¡­ccessibility_blue_yellow\)");
                   label_008b :
                      return obj;
                   }
                }else if(obj.equals("ysopsia_red")){
                   obj = a1.p(R.string.arg_RES_7f103cab);
                   a.o(obj, "CommonUtil.string\(R.stri¡­_panel_accessibility_red\)");
                   goto label_008b ;
                }
             }else if(obj.equals("ysopsia_green")){
                obj = a1.p(R.string.arg_RES_7f103ca9);
                a.o(obj, "CommonUtil.string\(R.stri¡­anel_accessibility_green\)");
                goto label_008b ;
             }
          }
          obj = a1.p(R.string.arg_RES_7f103caa);
          a.o(obj, "CommonUtil.string\(R.stri¡­l_accessibility_original\)");
          goto label_008b ;
       }
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager.class, "46")) {
          return;
       }
       this.k.c(p0);
       return;
    }
    public final void c(boolean p0){
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       if (PatchProxy.isSupport(slidePlayerP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayerP, "31")) {
          return;
       }
       c.C(p0);
       if (p0) {
          SlidePlayerPanelManager tf = this.f;
          if (tf != null) {
             tf.c();
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, slidePlayerP, "32")) {
             if (!PatchProxy.applyVoid(objArray, this, slidePlayerP, "47") && this.b == null) {
                LottieAnimationView lottieAnimat = new LottieAnimationView(this.o);
                this.b = lottieAnimat;
                boolean b = true;
                lottieAnimat.k(b);
                slidePlayerP = this.b;
                if (slidePlayerP != null) {
                   slidePlayerP.setRenderMode(RenderMode.HARDWARE);
                }
                slidePlayerP = this.b;
                if (slidePlayerP != null) {
                   slidePlayerP.setVisibility(8);
                }
                slidePlayerP = this.b;
                if (slidePlayerP != null) {
                   slidePlayerP.setClickable(b);
                }
                slidePlayerP = this.b;
                if (slidePlayerP != null) {
                   slidePlayerP.setScaleType(ImageView$ScaleType.CENTER_CROP);
                }
                FrameLayout uFrameLayout = this.o.findViewById(0x1020002);
                if (uFrameLayout instanceof ViewGroup) {
                   uFrameLayout.addView(this.b, -1, -1);
                   slidePlayerP = this.b;
                   if (slidePlayerP != null) {
                      slidePlayerP.setAnimationFromUrl("https://static.yximgs.com/udata/pkg/kwai-client-image/thanos/player_panel_sound_effect_new.json");
                   }
                   slidePlayerP = this.b;
                   if (slidePlayerP != null) {
                      slidePlayerP.a(new m(this));
                   }
                }
             }
          label_0092 :
             slidePlayerP = this.b;
             if (slidePlayerP != null) {
                slidePlayerP.s();
             }
          }
       }else {
          String str = a1.p(R.string.arg_RES_7f103cdb);
          a.o(str, "CommonUtil.string\(R.stri¡­panel_sound_effect_close\)");
          this.l(str);
       }
       this.j.r0(p0);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, SlidePlayerPanelManager.class, "15")) {
          return;
       }
       SlidePlayerPanelManager to = this.o;
       if (to instanceof GifshowActivity) {
          s$a uoa = new s$a();
          uoa.g(true);
          b9.c(this.d, new SlidePlayerPanelManager$c(this, to, uoa));
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, SlidePlayerPanelManager.class, "6")) {
          return;
       }
       SlidePlayerPanelManager tf = this.f;
       if (tf != null) {
          tf.c();
       }
       tf = this.g;
       if (tf != null) {
          tf.c();
       }
       this.h();
       FrameLayout uFrameLayout = this.o.findViewById(0x1020002);
       if (uFrameLayout instanceof ViewGroup) {
          SlidePlayerPanelManager tb = this.b;
          if (tb != null) {
             uFrameLayout.removeView(tb);
             this.b = null;
          }
       }
       b9.a(this.c);
       b9.a(this.d);
       b9.a(this.e);
       b9.a(this.k);
       return;
    }
    public final void f(boolean p0){
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       if (PatchProxy.isSupport(slidePlayerP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayerP, "45")) {
          return;
       }
       a.o(this.t, p0, 14);
       slidePlayerP = this.a;
       if (slidePlayerP != null) {
          slidePlayerP.n(p0, 20);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.t.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.d(p0, 20);
       }
       return;
    }
    public final HashMap g(){
       boolean b;
       boolean b1;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       HashMap obj = PatchProxy.apply(null, this, slidePlayerP, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       if (this.r.g()) {
          obj.put("mirror", t.d(this.i()));
       }
       obj.put("source", b.d.c());
       b = false;
       if (this.r.i()) {
          Object obj1 = PatchProxy.apply(null, this, slidePlayerP, "25");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.r.i() && b.i()){
             b1 = true;
          }else {
             b1 = false;
          }
          obj.put("video_saveflow_icon_button", t.d(b1));
       }
       if (this.r.h()) {
          if (this.r.e()) {
             b1 = (b.e() == QualityMode.higher)? true: false;
             obj.put("video_fhd_button", t.d(b1));
          }
          if (this.r.f()) {
             b1 = (b.e() == QualityMode.lower)? true: false;
             obj.put("video_saveflow_button", t.d(b1));
          }
          b1 = i.a[b.e().ordinal()];
          if (b1 != 1) {
             if (b1 != 2 || !this.r.f()) {
             label_00b9 :
                b = true;
             }
          }else if(!this.r.e()){
             goto label_00b9 ;
          }
          obj.put("video_auto_button", t.d(b));
          if (b.e() == QualityMode.higher) {
             e player = this.s.getPlayer();
             if (player != null) {
                IKwaiMediaPlayer iKwaiMediaPl = player.getIKwaiMediaPlayer();
                if (iKwaiMediaPl != null) {
                   KwaiRepresentation currentRepre = iKwaiMediaPl.getCurrentRepresentation();
                   if (currentRepre != null) {
                      obj.put("video_clarity", currentRepre.qualityType);
                   }
                }
             }
          }
       }
    label_00f9 :
       obj.put("assist_function_button", this.a());
       if (this.r.k() || f.s()) {
          obj.put("sound_effect", "PANORAMIC_SOUND");
          obj.put("sound_effect_status", t.d(c.g()));
       }
       if (this.r.d()) {
          str = (this.r.c())? "YES": "NO";
          obj.put("add_to_collection", str);
       }
       if (this.r.j()) {
          str = (b.j())? "OPEN": "CLOSE";
          obj.put("small_window_play", str);
       }
       return obj;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, SlidePlayerPanelManager.class, "33")) {
          return;
       }
       this.f(true);
       SlidePlayerPanelManager tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       return;
    }
    public final boolean i(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       x obj = PatchProxy.apply(objArray, this, SlidePlayerPanelManager.class, "28");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.j.q0(this.r.a());
       Object obj1 = PatchProxy.applyTwoRefs(obj, "mirror", objArray, t.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj != null){
          obj1 = PatchProxy.applyOneRefs("mirror", obj, x.class, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a.p("mirror", "filter");
             b = obj.a.contains("mirror");
          }
       }else {
          b = false;
       }
       return b;
    }
    public final void j(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager.class, "41")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_FUNCTION_BUTTON";
       p0.put("source", b.d.c());
       uElementPack.params = a.a.q(p0);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.r.a().getEntity());
       u1.L("", this.p, 1, uElementPack, uContentPack);
       return;
    }
    public final void k(){
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayerP, "8")) {
          return;
       }
       SlidePlayerPanelManager tf = this.f;
       if (tf != null) {
          tf.c();
       }
       Object obj = PatchProxy.apply(objArray, this, slidePlayerP, "16");
       if (obj != PatchProxyResult.class) {
       }else {
          slidePlayerP = this.o;
          SlidePlayerPanelManager$createAccessibilityPanel$1 uocreateAcce = new SlidePlayerPanelManager$createAccessibilityPanel$1(this);
          a uoa = PatchProxy.applyTwoRefs(slidePlayerP, uocreateAcce, objArray, c.class, "2");
          if (uoa != PatchProxyResult.class) {
          }else {
             a.p(slidePlayerP, "activity");
             a.p(uocreateAcce, "init");
             uoa = new a(slidePlayerP);
             uocreateAcce.invoke(uoa);
          }
          obj = uoa;
       }
       obj.d(new SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1(this));
       this.g = obj;
       return;
    }
    public final void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager.class, "17")) {
          return;
       }
       i.g(R.style.arg_RES_7f11066a, p0, true, true);
       return;
    }
    public final void m(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager.class, "21")) {
          return;
       }
       this.j.x(t.a(p0));
       return;
    }
    public final void n(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager.class, "22")) {
          return;
       }
       Log.b("SlidePlayerPanelManager", "updateVppFilters by NoSubscribe = "+t.a(p0));
       e player = this.s.getPlayer();
       if (player != null) {
          player.setKwaivppFilters(1001, t.a(p0));
       }
       return;
    }
    public final v o(){
       return this.j;
    }
}
