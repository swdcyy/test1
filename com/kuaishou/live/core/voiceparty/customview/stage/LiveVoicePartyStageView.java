package com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$b;
import wa1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ClassLoader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedList;
import fs2.x;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import tr2.f;
import android.view.View$OnClickListener;
import tr2.d;
import tr2.e;
import com.kuaishou.live.core.voiceparty.customview.stage.a;
import tr2.c;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import tr2.h;
import erd.g;
import crd.b;
import tr2.g;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Point;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$a;
import java.util.List;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g9c.a;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.a;
import com.kuaishou.live.core.voiceparty.d0;
import com.yxcorp.gifshow.model.Lyrics;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsCountDownView;
import java.util.Iterator;
import com.yxcorp.gifshow.model.Lyrics$Line;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView$b;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView$a;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveKtvControlView;
import ekd.m1;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kuaishou.live.common.core.basic.widget.LiveRedDotLayout;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import d61.h;
import u71.a;
import qu2.a;
import tt2.w;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import co2.f2;
import z12.e;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$MyState;
import android.animation.ObjectAnimator;
import android.util.Property;
import th0.j;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import android.widget.LinearLayout;
import java.lang.Exception;
import java.lang.Throwable;
import fs2.w;
import gs2.c;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;
import gs2.e;
import gs2.d;
import tr2.i;
import android.animation.Animator$AnimatorListener;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import com.yxcorp.utility.TextUtils;
import d61.f0;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.opengl.GLSurfaceView;

public class LiveVoicePartyStageView extends RelativeLayout implements d	// class@0014cf
{
    public View A;
    public View B;
    public LiveVoicePartyStageView$b C;
    public LiveVoicePartyStageView$MyState D;
    public ObjectAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final List I;
    public final x J;
    public KwaiImageView b;
    public View c;
    public View d;
    public View e;
    public View f;
    public ViewGroup g;
    public LiveUserView h;
    public TextView i;
    public TextView j;
    public ViewGroup k;
    public LiveVoicePartyEmptyRecommendView l;
    public TextView m;
    public View n;
    public LiveKtvControlView o;
    public LiveVoicePartyKtvLyricsView p;
    public LivePlayGLSurfaceView q;
    public LivePlayTextureView r;
    public LiveCameraView s;
    public a t;
    public boolean u;
    public View v;
    public View w;
    public LiveVoicePartyApplaudAnimationView x;
    public View y;
    public LiveRedDotLayout z;

    public void LiveVoicePartyStageView(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartyStageView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveVoicePartyStageView(Context p0,AttributeSet p1,int p2){
       boolean b;
       super(p0, p1, p2);
       LiveVoicePartyStageView$b uob = LiveVoicePartyStageView$b.class;
       LiveVoicePartyStageView$b uob1 = PatchProxy.applyOneRefs(uob, null, b.class, "1");
       b = true;
       if (uob1 != PatchProxyResult.class) {
       }else {
          Class[] uClassArray = new Class[b];
          uClassArray[0] = uob;
          uob1 = Proxy.newProxyInstance(uob.getClassLoader(), uClassArray, b.a);
       }
       this.C = uob1;
       this.G = b;
       this.H = b;
       this.I = new LinkedList();
       this.J = new x();
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "2")) {
          View view = a.c(p0, R.layout.arg_RES_7f0d0e78, this);
          this.setFontFamilyRecursively(view);
          this.doBindView(view);
          this.b.L(c0.a.b("udata/pkg/kwai-client-image/chat_room/live_background_ktv.png"));
          this.d.setOnClickListener(new f(this));
          this.e.setOnClickListener(new d(this));
          this.n.setOnClickListener(new e(this));
          this.f.setOnClickListener(new a(this));
          this.w.setOnClickListener(new c(this));
          TimeUnit sECONDS = TimeUnit.SECONDS;
          a.b(this.c).throttleFirst(1, sECONDS).subscribe(new h(this));
          t ot = a.b(this.z).throttleFirst(1, sECONDS);
          ot.subscribe(new g(this));
          this.h.setBorderColor(0);
          ot.height = VoicePartySurfaceUtil.f(this.getContext()).y / 2;
          ViewGroup$LayoutParams layoutParams = this.y.getLayoutParams();
          Point point = VoicePartySurfaceUtil.f(this.getContext());
          layoutParams.width = point.x;
          layoutParams.height = point.y;
          this.y.setLayoutParams(layoutParams);
       }
       return;
    }
    public static void setupStageViewSize(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveVoicePartyStageView.class, "34")) {
          return;
       }
       Point point = VoicePartySurfaceUtil.f(p0.getContext());
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = point.x;
       layoutParams.height = point.y + a1.e(33.00f);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void a(LiveVoicePartyStageView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "22")) {
          return;
       }
       this.I.add(p0);
       return;
    }
    public void b(){
       LiveVoicePartyEmptyRecommendView b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyStageView.class, "35")) {
          return;
       }
       LiveVoicePartyStageView tl = this.l;
       if (tl != null) {
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(objArray, tl, LiveVoicePartyEmptyRecommendView.class, "9")) {
             b.Z(LiveVoicePartyLogTag.KTV, "adjustRecommendItemWidth");
             b = tl.b;
             if (b == null || (b.getLayoutManager() != null && tl.e != null)) {
                RecyclerView$LayoutManager layoutManage = tl.b.getLayoutManager();
                int itemCount = tl.e.getItemCount();
                int i = 0;
                while (i < itemCount) {
                   View view = layoutManage.findViewByPosition(i);
                   if (view != null && view.getLayoutParams() != null) {
                      ViewGroup$LayoutParams layoutParams1 = view.getLayoutParams();
                      layoutParams1.width = tl.e.X0(view.getContext());
                      view.setLayoutParams(layoutParams1);
                   }
                   i = i + 1;
                }
             }
          }
       }
       if (d0.n(this.getContext())) {
          b.Z(LiveVoicePartyLogTag.KTV, "LiveVoicePartyStageView adjustToLayoutChange wide");
          ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
          layoutParams.width = VoicePartySurfaceUtil.f(this.getContext()).x;
          layoutParams.height = (a1.d(0x7f070a0c) + (a1.d(0x7f070a0b) * 3)) + a1.d(0x7f070a0a);
          this.setLayoutParams(layoutParams);
       }else {
          LiveVoicePartyStageView.setupStageViewSize(this);
       }
       return;
    }
    public void c(Lyrics p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "28")) {
          return;
       }
       LiveVoicePartyStageView tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidOneRefs(p0, tp, LiveVoicePartyKtvLyricsView.class, "2") && p0.mLines != null) {
          if (!PatchProxy.applyVoid(null, tp, LiveVoicePartyKtvLyricsView.class, "11")) {
             tp.b.clear();
             tp.g = false;
             LiveVoicePartyKtvLyricsView f = tp.f;
             if (f != null) {
                f.a();
             }
          }
          Iterator iterator = p0.mLines.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Lyrics$Line mStart = obj.mStart;
             int i = mStart + obj.mDuration;
             LiveVoicePartyKtvLyricsView$b uob = new LiveVoicePartyKtvLyricsView$b(obj, mStart, i, false, null);
             tp.b.add(v9);
          }
          tp.d(0);
          tp.d(1);
       }
       return;
    }
    public final void d(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyStageView.class, "5")) {
          return;
       }
       this.o.b(p0);
       this.C.L1();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "1")) {
          return;
       }
       this.g = m1.f(p0, 0x7f0a27b7);
       this.x = m1.f(p0, 0x7f0a2068);
       this.b = m1.f(p0, 0x7f0a207a);
       this.y = m1.f(p0, 0x7f0a27b9);
       this.e = m1.f(p0, 0x7f0a2740);
       this.h = m1.f(p0, 0x7f0a27bf);
       this.w = m1.f(p0, 0x7f0a27ad);
       this.k = m1.f(p0, 0x7f0a27b3);
       this.l = m1.f(p0, 0x7f0a27b5);
       this.i = m1.f(p0, 0x7f0a27c0);
       this.m = m1.f(p0, 0x7f0a27b4);
       this.o = m1.f(p0, 0x7f0a27bc);
       this.j = m1.f(p0, 0x7f0a27b8);
       this.n = m1.f(p0, 0x7f0a27b2);
       this.q = m1.f(p0, 0x7f0a44d3);
       this.f = m1.f(p0, 0x7f0a27bb);
       this.c = m1.f(p0, 0x7f0a2067);
       this.r = m1.f(p0, 0x7f0a44d4);
       this.v = m1.f(p0, 0x7f0a206c);
       this.d = m1.f(p0, 0x7f0a27bd);
       this.p = m1.f(p0, 0x7f0a278e);
       this.z = m1.f(p0, 0x7f0a278c);
       this.A = m1.f(p0, 0x7f0a278b);
       this.B = m1.f(p0, 0x7f0a2782);
       return;
    }
    public boolean e(){
       return this.u;
    }
    public void f(LiveVoicePartyStageView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "23")) {
          return;
       }
       this.I.remove(p0);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyStageView.class, "13")) {
          return;
       }
       this.G = false;
       this.H = false;
       this.d.setSelected(true);
       this.f.setSelected(true);
       if (this.F == null) {
          this.d(true);
       }
       return;
    }
    public LivePlayTextureView getAudienceMvTextureView(){
       return this.r;
    }
    public LiveCameraView getCameraView(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyStageView.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s == null) {
          this.s = h.f(this, 0x7f0a0a3c, 0x7f0a0a3b);
       }
       return this.s;
    }
    public View getEmptyChooseButton(){
       return this.n;
    }
    public View getEmptyRecommendView(){
       return this.l;
    }
    public a getLiveCamera(){
       return this.t;
    }
    public KwaiImageView getStageBackground(){
       return this.b;
    }
    public LivePlayGLSurfaceView getVoicePartyMvView(){
       return this.q;
    }
    public void h(a p0,w p1,LiveVoicePartyKtvMusicDownloadHelper p2,f2 p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveVoicePartyStageView.class, "7")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveVoicePartyOfflinePresenter", "stage setEmptySongView", stringArray);
       this.k(LiveVoicePartyStageView$MyState.EMPTY, p1, p2, p0, p3);
       if (!PatchProxy.applyVoid(null, this, LiveVoicePartyStageView.class, "27")) {
          LiveVoicePartyStageView tE = this.E;
          if (tE != null) {
             tE.cancel();
          }
          float[] uofloatArray = new float[]{(float)a1.e(45.00f),0};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.o, RelativeLayout.TRANSLATION_Y, uofloatArray);
          this.E = objectAnimat;
          objectAnimat.setDuration(300);
          this.E.setInterpolator(new j());
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyStageView.class, "9")) {
          return;
       }
       this.setViewVisibilityState(LiveVoicePartyStageView$MyState.LOADING);
       this.setLoadingText(this.getResources().getString(R.string.arg_RES_7f102544));
       return;
    }
    public void j(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveVoicePartyStageView.class, "11")) {
          return;
       }
       LiveVoicePartyStageView$MyState plAY = LiveVoicePartyStageView$MyState.PlAY;
       if (this.D != plAY) {
          this.setViewVisibilityState(plAY);
       }
       if (!PatchProxy.isSupport(LiveVoicePartyStageView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveVoicePartyStageView.class, "12")) {
          LiveVoicePartyStageView tG = this.G;
          LiveVoicePartyStageView tH = this.H;
          p1 = (p1 || p0)? true: false;
          this.G = p1;
          this.H = p0;
          if (tG != p1 || tH != p0) {
             this.f.setSelected((p1 ^ 1));
             this.d.setSelected((this.H ^ 1));
             if (this.G != null) {
                this.o.a((this.F ^ 1));
             }else if(this.F == null){
                this.d(1);
             }
          }
       }
    label_0077 :
       return;
    }
    public final void k(LiveVoicePartyStageView$MyState p0,w p1,LiveVoicePartyKtvMusicDownloadHelper p2,a p3,f2 p4){
       LiveVoicePartyStageView j;
       LiveVoicePartyStageView l;
       w ow;
       b uob;
       LiveVoicePartyEmptyRecommendView e;
       LiveVoicePartyStageView$MyState myState = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       x ox = x.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       int i4 = 0;
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class)) {
          Object[] objArray = new Object[i3];
          objArray[i4] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = oobject4;
          if (PatchProxy.applyVoid(objArray, myState, LiveVoicePartyStageView.class, "18")) {
             return;
          }
       }
       myState.D = oobject;
       int i5 = 8;
       if (oobject != LiveVoicePartyStageView$MyState.EMPTY) {
          b.Z(LiveVoicePartyLogTag.KTV, "LiveVoicePartyStageView hideEmptyView "+myState.l);
          j = myState.J;
          LiveVoicePartyStageView k = myState.k;
          l = myState.l;
          Objects.requireNonNull(j);
          if (!PatchProxy.applyVoidTwoRefs(k, l, j, ox, "2")) {
             j.a();
             k.setVisibility(i5);
             l.setVisibility(i5);
          }
       }else {
          b.g0(LiveVoicePartyLogTag.KTV, "LiveVoicePartyStageView showEmptyView "+myState.l, new Exception());
          j = myState.J;
          LiveVoicePartyStageView k1 = myState.k;
          LiveVoicePartyStageView l1 = myState.l;
          LiveVoicePartyStageView c = myState.C;
          Objects.requireNonNull(j);
          if (PatchProxy.isSupport(ox)) {
             Object[] objArray2 = new Object[]{k1,l1,oobject3,oobject1,oobject2,oobject4,c};
             if (!PatchProxy.applyVoid(objArray2, j, ox, "1")) {
             }
          }else {
          }
       }
       ox = 8;
    label_0139 :
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, myState, LiveVoicePartyStageView.class, "21")) {
          int i7 = (myState.D == LiveVoicePartyStageView$MyState.PlAY)? 0: 8;
          if (myState.p.getVisibility() != i7) {
             myState.p.setVisibility(i7);
             myState.v.setVisibility(i7);
             Iterator iterator = myState.I.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(i7);
             }
          }
       }
       j = myState.g;
       l = myState.D;
       int i6 = (l == LiveVoicePartyStageView$MyState.PlAY || l == LiveVoicePartyStageView$MyState.EMPTY)? 8: 0;
       j.setVisibility(i6);
       j = myState.j;
       l = myState.D;
       i6 = (l == LiveVoicePartyStageView$MyState.LOADING || l == LiveVoicePartyStageView$MyState.PREPARE)? 0: 8;
       j.setVisibility(i6);
       j = myState.o;
       if (myState.D == LiveVoicePartyStageView$MyState.EMPTY) {
          i4 = 8;
       }
       j.setVisibility(i4);
       if (PatchProxy.applyVoid(objArray1, myState, LiveVoicePartyStageView.class, "26") || (myState.E != null && !myState.o.getVisibility())) {
          myState.E.addListener(new i(myState));
          myState.E.start();
       }
    label_01d3 :
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyStageView.class, "19")) {
          return;
       }
       super.onDetachedFromWindow();
       this.J.a();
       b.Z(LiveVoicePartyLogTag.KTV, "VoicePartyKtvStageViewUtils.disposeLastRefresh "+this.l);
       return;
    }
    public void setActorAvatar(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.h.setBorderColor(0);
       g.d(this.h, p0, HeadImageSize.MIDDLE);
       return;
    }
    public void setActorName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "15")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.i.setText("");
          return;
       }else {
          int i = 5;
          if (p0.length() > i) {
             p0 = TextUtils.A(p0, i)+"...";
          }
          Object[] objArray = new Object[]{p0};
          this.i.setText(this.getResources().getString(R.string.arg_RES_7f102541, objArray));
          return;
       }
    }
    public void setAnchor(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyStageView.class, "4")) {
          return;
       }
       this.F = p0;
       if (p0) {
          this.o.a(false);
       }else {
          this.o.b(false);
       }
       return;
    }
    public void setEmptyText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "16")) {
          return;
       }
       this.m.setText(p0);
       return;
    }
    public final void setFontFamilyRecursively(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "3")) {
          return;
       }
       f0.f(p0.findViewById(R.id.live_ktv_applaud_text_view), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_stage_play_next_button), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_stage_setting_button), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_sing_refrain_button), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_choose_song_button), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_stage_empty_text), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_stage_user_name_text), "sans-serif-medium");
       f0.f(p0.findViewById(R.id.live_voice_party_stage_empty_choose_button), "sans-serif-medium");
       return;
    }
    public void setLiveCamera(a p0){
       this.t = p0;
    }
    public void setLoadingText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "17")) {
          return;
       }
       this.j.setText(p0);
       return;
    }
    public void setOnStageViewClickListener(LiveVoicePartyStageView$b p0){
       this.C = p0;
    }
    public void setPrepareSongView(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyStageView.class, "8")) {
          return;
       }
       this.setViewVisibilityState(LiveVoicePartyStageView$MyState.PREPARE);
       if (!p0) {
          this.setLoadingText(this.getResources().getString(R.string.arg_RES_7f10254b));
       }
       return;
    }
    public void setSingModeButtonBackground(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyStageView.class, "32")) {
          return;
       }
       if (p0) {
          this.A.setBackgroundResource(R.drawable.arg_RES_7f081504);
       }else {
          this.A.setBackground(null);
       }
       return;
    }
    public void setSingRefrainButtonEnable(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyStageView.class, "24")) {
          return;
       }
       this.w.setEnabled(p0);
       return;
    }
    public void setUseFrontCamera(boolean p0){
       this.u = p0;
    }
    public final void setViewVisibilityState(LiveVoicePartyStageView$MyState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyStageView.class, "20")) {
          return;
       }
       this.k(p0, null, null, null, null);
       return;
    }
    public void setVoicePartyMvViewVisibility(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyStageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyStageView.class, "30")) {
          return;
       }
       if (this.q.getVisibility() != p0) {
          this.q.setVisibility(p0);
       }
       return;
    }
}
