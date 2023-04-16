package com.yxcorp.gifshow.camera.record.music.n;
import com.yxcorp.gifshow.camera.record.h$b;
import ui9.b;
import in6.b;
import oh9.v;
import oc9.e0;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.feature.post.api.music.data.MusicSource;
import ed9.f;
import com.yxcorp.gifshow.camera.record.music.n$a;
import com.yxcorp.gifshow.camera.record.music.f;
import oc9.t;
import com.yxcorp.gifshow.camera.record.music.i;
import com.yxcorp.gifshow.camera.record.music.d;
import com.yxcorp.gifshow.camera.record.music.e;
import com.yxcorp.gifshow.camera.record.base.d;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import vf9.f0;
import vf9.o0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oh9.o0;
import vf9.q0;
import oh9.a;
import vf9.r0;
import vf9.p0;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import vf9.f;
import j8c.a;
import q87.c;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Long;
import java.util.List;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import ekd.y0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import oc9.d0;
import com.kuaishou.android.model.music.Music;
import androidx.fragment.app.Fragment;
import k36.c;
import h36.h;
import k36.f;
import vf9.h1;
import t16.a;
import brd.t;
import t45.d;
import brd.z;
import vf9.v0;
import erd.g;
import com.yxcorp.gifshow.camera.record.music.l;
import vf9.d1;
import crd.b;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.sidebar.a;
import vf9.l0;
import android.view.View$OnClickListener;
import yb9.b;
import yb9.b$a;
import com.kuaishou.android.model.music.MusicType;
import com.kwai.library.widget.specific.lyrics.LyricsView;
import pi9.j;
import vf9.i1;
import java.lang.Runnable;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.camerasdk.j;
import ui9.f;
import ce9.l;
import xi9.n;
import tkd.b;
import tkd.d;
import om6.r;
import java.lang.Math;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.bubble.b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import vf9.f1;
import com.yxcorp.gifshow.bubble.b$c;
import java.util.concurrent.TimeUnit;
import vf9.p1;
import com.yxcorp.gifshow.camera.bubble.b$b;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import oh9.a3;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Asset;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.RecordMusic;
import fg6.a;
import com.google.gson.Gson;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.e;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.camera.record.music.n$c;
import java.lang.Enum;
import vi9.a;
import pm6.m;
import znc.a;
import tg9.b;
import lnc.a7;
import vf9.u1;
import android.view.View$OnLayoutChangeListener;
import in6.a;
import java.lang.Number;
import com.kwai.library.widget.specific.lyrics.LyricsView$a;
import lnc.b9;
import pi9.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.f5;
import lnc.s6;
import xb.s;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import xb.t$b;
import android.graphics.drawable.Drawable;
import vf9.j1;
import java.util.concurrent.Callable;
import t45.c;
import vf9.t0;
import erd.a;
import vf9.c1;
import vf9.x0;
import qxc.b;
import pi9.i;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import vf9.r1;
import android.animation.Animator$AnimatorListener;
import th0.a;
import hq.a;
import k2b.e0;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.System;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import aj9.b;
import vf9.y1;
import hf9.b;
import hf9.b$a;
import vf9.g0;
import th0.d;
import th0.n;
import android.view.animation.Interpolator;
import q16.a$a;
import java.io.File;
import org.json.JSONObject;
import e16.b;
import pi9.p;
import com.yxcorp.gifshow.media.util.c;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import android.net.Uri;
import ekd.j0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.music.utils.m;
import kqb.y;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.main.WaynePlayerFactory;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w46.b;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.a;
import vf9.d;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.yxcorp.gifshow.camera.record.music.b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.camera.record.music.a;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import vf9.e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.KsMediaPlayer$Builder;
import android.content.Context;
import com.kwai.video.player.KsMediaPlayer;
import com.yxcorp.gifshow.camera.record.music.h;
import com.kwai.video.player.AbstractMediaPlayer;
import vf9.k1;
import com.yxcorp.gifshow.camera.record.music.j;
import com.yxcorp.gifshow.camera.bubble.b$c;
import android.app.Activity;
import vf9.n1;
import qh9.c;
import rc9.f;
import vf9.y;
import vf9.u;
import vf9.t;
import be9.a;
import com.yxcorp.gifshow.util.PostUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.view.SimpleDraweeView;
import vf9.s0;
import pi9.j$a;
import gg9.p;
import nc9.b;
import wkd.b;
import rfc.a;
import com.yxcorp.gifshow.camera.record.music.m;
import erd.o;
import e17.i;
import vf9.s;
import vf9.w0;
import rd9.a;
import vf9.b1;
import uc9.b;
import vf9.a1;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import vf9.g1;
import eoc.f;
import vf9.g;
import vf9.e1;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import vf9.z0;
import zb9.j;
import vf9.y0;
import hd9.n;
import pm6.l;
import com.yxcorp.gifshow.activity.GifshowActivity;
import oa0.a;
import android.content.SharedPreferences;
import vf9.l1;
import vf9.n0;
import com.yxcorp.gifshow.camera.bubble.b$d;
import com.yxcorp.gifshow.camera.record.music.k;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.h;
import lm6.i;
import com.kuaishou.edit.draft.Asset$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import com.kuaishou.edit.draft.RecordMusic$b;
import com.yxcorp.gifshow.camera.record.music.n$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.utility.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import c35.p;

public class n extends e0 implements h$b, b, b, v	// class@000e8a
{
    public View A;
    public boolean B;
    public j C;
    public boolean D;
    public Music E;
    public boolean F;
    public Lyrics G;
    public Lyrics H;
    public File I;
    public Intent J;
    public boolean K;
    public MusicSource L;
    public Bitmap M;
    public f N;
    public y0 O;
    public final i P;
    public final e Q;
    public final f R;
    public final f S;
    public long T;
    public long U;
    public long U0;
    public b V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public boolean X;
    public View X0;
    public AbsRecordBottomBarViewBinder Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public long d1;
    public boolean e1;
    public boolean f1;
    public final LyricsView$a g1;
    public boolean h1;
    public boolean i1;
    public Runnable j1;
    public String k1;
    public View q;
    public KwaiImageView r;
    public View s;
    public KwaiImageView t;
    public View u;
    public KwaiImageView v;
    public TextView w;
    public ImageView x;
    public b y;
    public View z;
    public static final int l1;
    public static final int m1;

    static {
       n.l1 = a1.e(9.50f);
       n.m1 = a1.e(0);
    }
    public void n(CameraPageType p0,b p1){
       super(p0, p1);
       this.B = true;
       this.L = MusicSource.UNKNOWN;
       this.S = new f(CameraPageType.VIDEO);
       this.Z = 0x3f800000;
       this.V0 = false;
       this.W0 = false;
       this.Y0 = false;
       this.Z0 = false;
       this.a1 = false;
       this.b1 = false;
       this.c1 = false;
       this.e1 = true;
       this.f1 = true;
       this.g1 = new n$a(this);
       this.k1 = "";
       f uof = new f(p0, p1, this);
       this.R = uof;
       this.L0(uof);
       i oi = new i(p0, p1, this);
       this.P = oi;
       this.L0(oi);
       this.L0(new d(p0, p1));
       e uoe = new e(p0, p1);
       this.Q = uoe;
       this.L0(uoe);
       d tf = this.f;
       if (tf instanceof a) {
          this.Y = tf.zb();
       }
       this.d.n(f0.class, new o0(this));
       this.d.n(o0.class, new q0(this));
       this.d.n(a.class, new r0(this));
       this.d.n(b.class, new p0(this));
       this.d.n(v.class, new p0(this));
       return;
    }
    public void A0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "8")) {
          return;
       }
       super.A0();
       if (!this.B2()) {
          return;
       }
       n tN = this.N;
       Objects.requireNonNull(tN);
       f uof = f.class;
       if (!PatchProxy.applyVoid(objArray, tN, uof, "4")) {
          Object[] objArray1 = new Object[0];
          a.D().w("Record_KwaiAudioPlayer", "pause", objArray1);
          f e = tN.e;
          if (e != null && e.isPlaying()) {
             if (!PatchProxy.applyVoid(objArray, tN, uof, "11")) {
                long l = tN.b();
                tN.f.add(Long.valueOf(l));
                StringBuilder str = "add segment "+l;
                Object[] objArray2 = new Object[0];
                a.D().w("Record_KwaiAudioPlayer", str+" segment size is "+tN.f.size(), objArray2);
             }
             tN.e.pause();
             tN.c = true;
          }
       }
       tN = this.O;
       if (tN != null) {
          tN.e();
       }
       return;
    }
    public final boolean A2(){
       n obj = PatchProxy.apply(null, this, n.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public boolean B2(){
       Object obj = PatchProxy.apply(null, this, n.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.E != null && (this.N != null && (this.f2() || this.F != null)))? true: false;
       return b;
    }
    public final void C2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "55")) {
          return;
       }
       if (this.f.isResumed() && this.f.isVisible()) {
          c.d().g(new h(p0));
       }else {
          this.j1 = new h1(p0);
       }
       return;
    }
    public final void D2(a p0,t p1,MusicSource p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, n.class, "30")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("MusicView", "process music fromMusicId="+p3, objArray);
       this.F2(true);
       this.W = false;
       z c = d.c;
       this.V = p1.observeOn(c).doOnNext(new v0(p0)).subscribeOn(c).observeOn(d.a).subscribe(new l(this, p3, p2), new d1(this));
       return;
    }
    public final void E2(){
       if (PatchProxy.applyVoid(null, this, n.class, "83")) {
          return;
       }
       n tN = this.N;
       if (tN != null) {
          tN.c();
          this.N = null;
       }
       this.P.h2();
       this.Q.p = null;
       return;
    }
    public void F2(boolean p0){
       this.D = p0;
    }
    public final void H2(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "77")) {
          return;
       }
       if (this.z == null && p0 == 8) {
          return;
       }
       on = PatchProxy.apply(null, this, on, "78");
       if (on != PatchProxyResult.class) {
       }else if(this.z == null){
          View view = a.d(this.d);
          this.z = view;
          if (view != null) {
             view.setOnClickListener(new l0(this));
          }
       }
       on = this.z;
       if (on != null) {
          this.d.h().e(this.z, p0, null);
       }
       return;
    }
    public void I2(long p0){
       this.U = p0;
    }
    public void I7(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "7")) {
          return;
       }
       super.I7();
       if (this.B2()) {
          Music mType = this.E.mType;
          if (mType != MusicType.LIP && mType != MusicType.KARA) {
             this.C.b().setEnableHighlight(true);
             this.C.b().setLrcColor(-1);
          }
          n tN = this.N;
          Objects.requireNonNull(tN);
          if (!PatchProxy.applyVoid(objArray, tN, f.class, "3")) {
             int i = 0;
             Object[] objArray1 = new Object[i];
             a.D().w("Record_KwaiAudioPlayer", "start", objArray1);
             f e = tN.e;
             if (e != null) {
                e.start();
                tN.c = i;
             }else {
                Object[] objArray2 = new Object[i];
                a.D().w("Record_KwaiAudioPlayer", "player is null", objArray2);
             }
          }
          if (this.O == null) {
             this.O = new y0(100, new i1(this));
          }
          this.O.d();
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "68")) {
          c uoc = this.d.b().V7();
          if (uoc != null) {
             objArray = uoc.h();
          }
          if (objArray != null && objArray.d() == RecordBubbleItem.USED_ORIGINAL_MUSIC) {
             objArray.dismiss();
          }
       }
    label_00a5 :
       return;
    }
    public final void J2(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "85")) {
          return;
       }
       if (p0 && this.x == null) {
          return;
       }
       if (this.x == null) {
          this.v2();
       }
       n.Y(this.x, p0, false);
       return;
    }
    public final void K2(LyricsView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "42")) {
          return;
       }
       p0.setEnabled(true);
       p0.setEnableKara(false);
       p0.setLrcTextSize(c.b(p0.getResources(), R.dimen.arg_RES_7f070f72));
       p0.setMaxLine(this.G.mLines.size());
       p0.setLayoutType(false);
       p0.setTopPaddingLine(true);
       p0.setEnableGradient(false);
       p0.setEnableFadingEdge(false);
       p0.setEnableHighlight(false);
       p0.setLrcPadding(c.b(p0.getResources(), R.dimen.arg_RES_7f070582));
       return;
    }
    public boolean Kc(){
       Object obj = PatchProxy.apply(null, this, n.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.d(f0.k).b != null)? true: false;
       return b;
    }
    public final void L2(){
       int b1;
       boolean b2;
       Object[] objArray1;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "66")) {
          return;
       }
       if (this.B2()) {
          d obj = PatchProxy.apply(objArray, this, on, "65");
          boolean b = true;
          int i = 0;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = this.h;
             b1 = (obj == null || (obj.isRecording() || this.a2()))? true: false;
          }
          if (b1 || (this.f2() && this.f1 != null)) {
             obj = PatchProxy.apply(objArray, this, on, "64");
             String str = "MusicView";
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else {
                obj = this.h;
                if (obj instanceof j && this.g != null) {
                   f uof = obj.v();
                   if (uof == null || uof.a == null) {
                      Object obj1 = PatchProxy.apply(objArray, this, on, "91");
                      if (obj1 != patchProxyRe) {
                         b2 = obj1.booleanValue();
                      }else if(this.d.d(l.i).a != null){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (b2 && !this.g.r()) {
                         objArray = new Object[i];
                         a.D().w(str, "magic not loaded", objArray);
                      }
                   }
                   b2 = true;
                }
             label_00a6 :
                b2 = false;
             }
             if (b2) {
                objArray1 = new Object[i];
                a.D().w(str, "music limit magic is restore ing", objArray1);
                this.W0 = b;
                return;
             }else {
                this.W0 = i;
                objArray = new Object[i];
                a.D().s(str, "showIfMusicLimitRecordDuration ", objArray);
                l = this.o2();
                b1 = this.d.b().getRecordDuration();
                if (!l || l - (long)b1) {
                   objArray1 = new Object[i];
                   a.D().w(str, "music do not affect on duration", objArray1);
                }else {
                   b2 = d.a(-831446984).uK(this.n);
                   if (b1 >= b2 || Math.abs((b2 - b1)) <= 1000) {
                      objArray1 = new Object[i];
                      a.D().w(str, "music limit can be ignore", objArray1);
                      return;
                   }else if(this.d.d(l.i).c != null){
                      objArray1 = new Object[i];
                      a.D().w(str, "music limit magic panel show", objArray1);
                      return;
                   }else {
                      p0 op0 = this.d.d(p0.j.a());
                      if (op0.c() && (op0.b() || op0.e())) {
                         objArray1 = new Object[i];
                         a.D().w(str, "music limit magic plc mode or topic reco mode", objArray1);
                         return;
                      }else {
                         c uoc = this.d.b().V7();
                         if (uoc == null) {
                            objArray1 = new Object[i];
                            a.D().w(str, "cannot get manager", objArray1);
                            return;
                         }else {
                            b uob = new b(RecordBubbleItem.MUSIC_DURATION).n(this.w);
                            uob.t(this.n2());
                            uob.q = PopupInterface$Excluded.NOT_AGAINST;
                            uob = uob.z(new f1(this));
                            int i1 = (int)TimeUnit.MILLISECONDS.toSeconds((long)(b1 + 500));
                            Music mCopyrightTi = this.E.mCopyrightTimeLimitInSecond;
                            if (mCopyrightTi != null && mCopyrightTi < i1) {
                               i1 = mCopyrightTi;
                            }
                            if (i1 != null) {
                               b = i1;
                            }
                            Objects.requireNonNull(uob);
                            b uob1 = b.class;
                            if (PatchProxy.isSupport(uob1)) {
                               uob1 = PatchProxy.applyTwoRefs(Integer.valueOf(R.string.arg_RES_7f10375a), Integer.valueOf(b), uob, uob1, "4");
                               if (uob1 != patchProxyRe) {
                               label_01ba :
                                  uob1.u(new p1(this, b2, b1));
                                  if (this.A2()) {
                                     uoc.n(uob);
                                  }
                                  return;
                               }
                            }
                            uob.l = a1.q(0x7f10375a, b);
                            uob1 = uob;
                            goto label_01ba ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_01e3 :
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "88")) {
          return;
       }
       super.L3(p0);
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          a.D().w("MusicView", "record info is null", objArray);
          return;
       }else {
          a3 uoa3 = this.d.d(a3.d);
          if (uoa3.a != null) {
             a3 c = uoa3.c;
             if (c != null && (c.v() != null && !uoa3.c.v().getAssetsList().isEmpty())) {
                List assetsList = uoa3.c.v().getAssetsList();
                String str = "";
                String str1 = str;
                while (i < assetsList.size()) {
                   Asset uAsset = assetsList.get(i);
                   if (TextUtils.x(str1)) {
                      str1 = (uAsset == null)? str: uAsset.getShootInfo().getRecordMusic().getRecordMusicInfo();
                   }
                label_007a :
                   i = i + 1;
                }
                if (!TextUtils.x(str1)) {
                   Music music = a.a.h(str1, Music.class);
                   a e = p0.e;
                   str = (music.mType == MusicType.LOCAL)? a.a().a().getString(R.string.arg_RES_7f10371d): a.a().a().getString(R.string.arg_RES_7f103726);
                   e.v1(str);
                   p0.e.K1(music);
                }
             }
          }
          return;
       }
    }
    public final void M2(boolean p0){
       n tz;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "73")) {
          return;
       }
       if (this.Z0 != null) {
          e.b(this.C.a(), this.C.f());
       }
       a.a(this.C.d(), this.C.e(), this.C.c(), this.E, this.z2());
       LyricsView lyricsView = this.C.b();
       lyricsView.b();
       if (this.E != null) {
          n tG = this.G;
          if (tG != null && !q.f(tG.mLines)) {
             this.H2(0);
             boolean i = n$c.a[this.E.mType.ordinal()];
             String str = 0x7f070c23;
             if (i != 1) {
                if (i != 2) {
                   if (!PatchProxy.applyVoidOneRefs(lyricsView, this, on, "45")) {
                      lyricsView.setEnableKara(0);
                      lyricsView.setMaxLine(3);
                      lyricsView.setLayoutType(0);
                      lyricsView.setLrcTextSize(c.b(lyricsView.getResources(), R.dimen.arg_RES_7f070f74));
                      lyricsView.setTopPaddingLine(0);
                      lyricsView.setEnableGradient(0);
                      lyricsView.setEnableFadingEdge(true);
                      lyricsView.setFadingEdgeLength(a1.e(20.00f));
                      lyricsView.setEnableHighlight(0);
                      lyricsView.setHighlightSameTimeLine(true);
                      lyricsView.setFirstLineFading(0);
                      lyricsView.setFirstLinePaddingForTopStyle(a1.e(0));
                      lyricsView.setSplitLinePadding(a1.e(6.00f));
                      lyricsView.setLrcPadding(c.b(lyricsView.getResources(), str));
                      lyricsView.setIsNeedBoldText(true);
                      lyricsView.setIsNormalRecord(true);
                      lyricsView.setOFFSET_Y(13.00f);
                   }
                }else {
                   this.K2(lyricsView);
                }
             }else if(PatchProxy.applyVoidOneRefs(lyricsView, this, on, "44")){
                lyricsView.setEnableKara(true);
                lyricsView.setMaxLine(4);
                lyricsView.setLayoutType(0);
                lyricsView.setLrcTextSize(c.b(lyricsView.getResources(), R.dimen.arg_RES_7f070f72));
                lyricsView.setTopPaddingLine(0);
                lyricsView.setEnableGradient(0);
                lyricsView.setEnableFadingEdge(0);
                lyricsView.setEnableHighlight(0);
                lyricsView.setLrcPadding(c.b(lyricsView.getResources(), str));
             }
             List obj = PatchProxy.apply(null, this, on, "75");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else if(this.n != null){
                tG = this.H;
                if (tG != null && !q.f(tG.mLines)) {
                   d tg = this.g;
                   if (tg == null || (tg.getVideoLength().a() <= m.b(0) || this.g.getVideoLength().a() != this.d.b().getRecordDuration())) {
                      tG = this.E;
                      if (tG != null) {
                         Music mType1 = tG.mType;
                         if (mType1 != MusicType.LIP && mType1 != MusicType.SOUNDTRACK) {
                            i = true;
                         }
                      }
                   }
                }
             }
             i = false;
             obj = (i)? a.a(this.H): a.a(this.G);
             lyricsView.setLyrics(obj);
             Music mType = this.E.mType;
             if (mType == MusicType.LIP && p0) {
                this.N2(0);
                this.d.j().U1(this.C.a());
                a7.c(true, this.E.mType);
                a.e(this.z, true);
             }else if(a7.b(mType) && (!p0 || this.L != MusicSource.MAGIC_FACE)){
                if (this.z2()) {
                   this.N2(0);
                }
                this.d.j().U1(this.C.a());
                a7.c(true, this.E.mType);
                a.e(this.z, true);
             }else {
                this.N2(8);
                a7.c(0, this.E.mType);
                a.e(this.z, 0);
             }
             tz = this.z;
             if (tz != null) {
                tz.setEnabled(true);
             }
             if (!PatchProxy.applyVoidTwoRefs(lyricsView, obj, this, on, "74")) {
                if (lyricsView.getHeight() > 0) {
                   lyricsView.h(this.U0, true);
                }else {
                   lyricsView.addOnLayoutChangeListener(new u1(this, lyricsView, obj));
                   lyricsView.requestLayout();
                }
             }
             tz = this.q;
             if (tz != null) {
                tz.setEnabled(true);
             }
          }else {
          label_0222 :
             this.N2(8);
             this.H2(8);
          }
       }else {
          goto label_0222 ;
       }
       if (!this.z2()) {
          this.N2(8);
       }
       if (!this.B2()) {
          this.N2(8);
          tz = this.z;
          if (tz != null) {
             tz.setVisibility(8);
          }
          if (this.n == 5) {
             this.C.a().setVisibility(8);
          }
       }else {
          this.C.a().setVisibility(0);
       }
       return;
    }
    public final void N2(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "92")) {
          return;
       }
       n.Y(this.C.b(), p0, false);
       if (this.A != null) {
          n.Y(this.C.d(), p0, false);
       }
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public final void O2(){
       long l;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "36")) {
          return;
       }
       if (this.N == null) {
          return;
       }
       LyricsView lyricsView = this.C.b();
       Object obj = PatchProxy.apply(objArray, this, on, "38");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          l = this.N.b();
          if (this.K == null) {
             l = l + this.U0;
          }
       }
       lyricsView.h((long)(int)l, true);
       return;
    }
    public void P1(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "9")) {
          return;
       }
       super.P1();
       if (!this.B2()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "79") && this.E != null) {
          on = this.N;
          long l = this.r2();
          Objects.requireNonNull(on);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), on, uof, "5")) {
             Object[] objArray1 = new Object[false];
             a.D().w("Record_KwaiAudioPlayer", "stop", objArray1);
             uof = on.e;
             if (uof != null) {
                uof.pause();
                on.c = true;
                on.d(l);
             }
             on.f.clear();
          }
          on = this.O;
          if (on != null) {
             on.e();
          }
          on = this.G;
          if (on != null && (!q.f(on.mLines) && this.E.mType == MusicType.LIP)) {
             this.K2(this.C.b());
          }
       label_0088 :
          this.C.b().setEnableHighlight(false);
          this.C.b().setLrcColor(-1);
          this.C.b().setListener(this.g1);
          this.C.b().h(this.U0, true);
       }
       return;
    }
    public final void P2(){
       if (PatchProxy.applyVoid(null, this, n.class, "71")) {
          return;
       }
       this.Q2(false, false);
       return;
    }
    public final void Q2(boolean p0,boolean p1){
       n r;
       float scaleX;
       b uob = this;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), uob, on, "72")) {
          return;
       }
       b9.a(uob.y);
       n on1 = null;
       int i = (this.B2())? 0: 8;
       uob.J2(i);
       Object[] objArray = null;
       if (this.B2() && uob.f1 != null) {
          if (e.e()) {
             f5.c(uob.r, uob.t, uob.u, true, this.y2());
          }else if(s6.m()){
             n.Y(uob.t, on1, true);
          }
          uob.r.setPadding(n.l1, n.l1, n.l1, n.l1);
          if (uob.M != null) {
             r = uob.r;
             BitmapDrawable uBitmapDrawa = new BitmapDrawable(a.a().a().getResources(), uob.M);
             t$b h = (s6.m())? t$b.h: t$b.g;
             r.setImageDrawable(new s(uBitmapDrawa, h));
          }else {
             r = uob.E;
             if (r != null) {
                uob.y = c.j(new j1(r)).doFinally(new t0(uob)).subscribe(new c1(uob), new x0(uob));
             }
          }
          if (p1 && !PatchProxy.applyVoid(objArray, uob, on, "46")) {
             if (uob.v == null) {
                on = uob.Y;
                Object[] objArray1 = (on == null)? objArray: on.K();
                uob.v = b.a(objArray1, uob.X0, 0x7f0a05dc);
             }
             on = uob.v;
             if (on != null) {
                View[] viewArray = new View[true];
                viewArray[on1] = on;
                i.a(objArray, viewArray);
                if (e.e()) {
                   uob.v.setImageDrawable(a1.f(this.m2()));
                   scaleX = uob.r.getScaleX();
                }else {
                   scaleX = 0x3f800000;
                }
                i = 2;
                float[] uofloatArray = new float[i];
                uofloatArray[on1] = scaleX;
                uofloatArray[1] = 0x3fcccccd;
                String str1 = "scaleX";
                float[] uofloatArray1 = new float[i];
                uofloatArray1[on1] = scaleX;
                uofloatArray1[1] = 0x3fcccccd;
                String str2 = "scaleY";
                String str3 = "alpha";
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str1, uofloatArray),PropertyValuesHolder.ofFloat(str2, uofloatArray1),PropertyValuesHolder.ofFloat(str3, new float[i]{0x3f800000,0})};
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(uob.v, propertyValu);
                objectAnimat.setDuration(300);
                objectAnimat.setInterpolator(new e());
                float[] uofloatArray2 = new float[i];
                uofloatArray2[on1] = 0;
                uofloatArray2[1] = scaleX;
                float[] uofloatArray3 = new float[i];
                uofloatArray3[on1] = 0;
                uofloatArray3[1] = scaleX;
                PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str1, uofloatArray2),PropertyValuesHolder.ofFloat(str2, uofloatArray3),PropertyValuesHolder.ofFloat(str3, new float[i]{0,0x3f800000})};
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(uob.r, propertyValu1);
                objectAnimat1.setDuration(300);
                objectAnimat1.addListener(new r1(uob, scaleX));
                objectAnimat1.setInterpolator(new a(2.00f));
                if (uob.x == null) {
                   this.v2();
                }
                if (uob.x != null) {
                   PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str1, new float[i]{0,0x3f800000}),PropertyValuesHolder.ofFloat(str2, new float[i]{0,0x3f800000}),PropertyValuesHolder.ofFloat(str3, new float[i]{0,0x3f800000})};
                   ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(uob.x, propertyValu2);
                   objectAnimat2.setDuration(300);
                   objectAnimat2.setInterpolator(new a(2.00f));
                   objectAnimat2.start();
                }
                objectAnimat.start();
                objectAnimat1.start();
             }
          }
       label_01d3 :
          a.a.a(uob.e, uob.E);
       }else {
          uob.r.setImageDrawable(a1.f(this.m2()));
          uob.r.setForegroundDrawable(objArray);
          uob.r.setPadding(n.m1, n.m1, n.m1, n.m1);
          if (s6.m()) {
             n.Y(uob.t, 4, on1);
          }
          f5.c(uob.r, uob.t, uob.u, on1, this.y2());
       }
       uob.r.setSelected(this.B2());
       on = uob.w;
       if (on != null) {
          r = uob.E;
          String str = (r == null || TextUtils.x(r.getDisplayName()))? a1.p(R.string.arg_RES_7f103703): uob.E.getDisplayName();
          on.setText(str);
       }
       this.M2(p0);
       on = uob.E;
       if (on != null) {
          Music mType = on.mType;
          if (mType == MusicType.LIP || (mType == MusicType.KARA && !uob.h.isFrontCamera())) {
             uob.h.d1();
          }
       }
       uob.r.setSelected(this.B2());
       on = uob.r;
       on.setEnabled(on.isEnabled());
       return;
    }
    public int R(){
       return 0x7f0d0175;
    }
    public boolean R0(){
       Object obj = PatchProxy.apply(null, this, n.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.R0()) {
          return b;
       }
       if (this.d.d(f0.k).b == null || this.a2()) {
          b = false;
       }
       return b;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void T1(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "60")) {
          return;
       }
       super.T1(p0);
       int i = 0;
       if (p0 || this.d.b().H5()) {
          if (this.B == null) {
             Object[] objArray = new Object[i];
             a.D().w("MusicView", "Come from music tag, show magic bubble first", objArray);
             this.B = true;
             return;
          }else if(this.c1 == null || (System.currentTimeMillis() - this.d1) - 200 > 0){
             this.L2();
             this.c1 = i;
          }
       }
       if (this.B2() && p0) {
          this.M2(i);
       }
       return;
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "20")) {
          return;
       }
       this.I7();
       return;
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, n.class, "24")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MusicView", "magic updated", objArray);
       d tg = this.g;
       objArray = true;
       c uoc = (tg != null && tg.y())? 1: null;
       d th = this.h;
       String str = (th == null || !th.B())? 1: null;
       if (p0 != null && this.d.d(y1.c).b == null) {
          objArray = false;
       }
       this.f1 = objArray;
       if (uoc && (str && (this.E != null && this.N != null))) {
          Object[] objArray1 = new Object[i];
          a.D().w("MusicView", "magic disable music, exit music mode", objArray1);
          this.k2();
       }
    label_0073 :
       this.h2(p0);
       c uoc1 = this.d.b().V7();
       if (uoc && (uoc1 != null && uoc1.i() == RecordBubbleItem.USED_ORIGINAL_MUSIC)) {
          uoc1.c();
       }
    label_008f :
       return;
    }
    public int Y0(){
       return 100;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "16")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       on = (this.n != p0)? 1: null;
       super.d5(p0);
       n tC = this.C;
       int i2 = 8;
       int i3 = 5;
       if (tC != null) {
          int i4 = (p0 != i3 || (this.F == null || this.E == null))? 8: 0;
          View[] viewArray = new View[i];
          viewArray[i1] = tC.g;
          n.Z(i4, viewArray);
       }
       b$a uoa = null;
       if (this.d.d(p0.j.a()).c() || this.d.d(b.c.a()).a()) {
          if (p0 == i3 && this.F == null) {
             this.d.h().e(this.z, i2, uoa);
          }
          if (on && (this.E != null && this.f2())) {
             this.P2();
          }
       label_00f9 :
          return;
       }else if(this.E != null){
          this.d.m(new g0(this.B2()));
       }
       if (p0 == i3 || f5.a(this.d)) {
          this.d.h().e(this.z, i2, uoa);
          this.d.h().d(this.A, 8, new d(), new n(), null);
          return;
       }else {
          this.d.h().d(this.A, 0, new d(), new n(), null);
          if (on != null && this.E != null) {
             this.P2();
          }
          if (on == null || this.f.isResumed()) {
             i = false;
          }
          this.V0 = i;
          return;
       }
    }
    public void de(a$a p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "22")) {
          return;
       }
       super.de(p0, p1);
       n tI = this.I;
       if (tI != null && this.E != null) {
          if (p1 != null) {
             p1.i = tI.getAbsolutePath();
             p1.j = this.K;
             str = b.a(this.E, this.U0, Math.min(this.p2(), (long)p1.c), true).toString();
          }else if(this.F != null || p.f(this.d)){
             p0.h(this.I.getAbsolutePath());
             p0.i(this.K);
             p0.L(c.i(this.I.getAbsolutePath()));
             str = b.a(this.E, this.U0, this.p2(), false).toString();
          }else {
             return;
          }
          p0.K(this.E).N(b.c(this.E)).P(this.L).M(str).Q((int)this.T).L((int)this.U);
          Object[] objArray = new Object[0];
          a.D().s("ks://MusicViewController", "prepareIntentForPreviewActivityInWorkThread musicPhotoId:"+this.E.mPhotoId+",musicType:"+this.E.mType+",mixAudioFile:,musicFile:"+this.I+",musicMeta:"+str+",mLyricStart:"+this.U0, objArray);
       }
       return;
    }
    public final f0 g2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       n tL = this.L;
       n tE = this.E;
       n tI = this.I;
       if (tI != null) {
          objArray = tI.getAbsolutePath();
       }
       Object[] objArray1 = objArray;
       n tT = this.T;
       n tU = this.U;
       n tD = this.D;
       n tG = this.G;
       n tU0 = this.U0;
       boolean b = (this.I != null && this.K != null)? true: false;
       f0 uof0 = new f0(tL, tE, objArray1, tT, tU, tD, tG, tU0, b, this.J);
       return obj;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "25")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MusicView", "magic restored", objArray);
       this.h2(p0);
       return;
    }
    public final void h2(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "26")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          if (this.W0 != null) {
             Object[] objArray = new Object[i];
             a.D().w("MusicView", "check music limit magic is null", objArray);
          }
          return;
       }else if(this.W0 != null){
          this.L2();
       }
       this.W0 = i;
       return;
    }
    public void i2(Intent p0,boolean p1,boolean p2){
       Object[] objArray1;
       Intent intent;
       String this;
       String str5;
       Music music;
       Lyrics lyrics;
       n n;
       d d;
       long l;
       n q;
       n on = this;
       Object obj = p0;
       boolean b = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, n.class, "54")) {
          return;
       }
       int b1 = false;
       if (on.W != null) {
          on.h1 = b1;
          return;
       }else {
          String str = "MusicView";
          if (on.f1 == null) {
             Object[] objArray = new Object[b1];
             a.D().w(str, "enterMusicMode, but switchable is false", objArray);
             on.d.m(new g0(this.B2()));
             on.h1 = b1;
             return;
          }else if(!obj || p0.getData() == null){
             objArray1 = new Object[b1];
             a.D().w(str, "intent data  is null", objArray1);
             return;
          }else {
             on.I = new File(p0.getData().getPath());
             intent = PatchProxy.applyOneRefs(obj, on, n.class, "89");
             String str1 = "lyric_start";
             this = "lyrics";
             String str2 = "start_time";
             String str3 = "musicOriginFile";
             RecordBubbleItem recordBubble = null;
             String str4 = "music_source";
             if (intent != patchProxyRe) {
                str5 = str;
             }else {
                intent = new Intent();
                intent.setData(p0.getData());
                intent.putExtra(str3, j0.f(obj, str3));
                SerializableHook.putExtra(intent, "music", j0.e(obj, "music"));
                SerializableHook.putExtra(intent, str4, j0.e(obj, str4));
                str5 = str;
                long l4 = j0.c(obj, str2, recordBubble);
                intent.putExtra(str2, l4);
                SerializableHook.putExtra(intent, this, j0.e(obj, this));
                intent.putExtra(str1, j0.c(obj, str1, l4));
                q = on.U;
                if (q - null) {
                   intent.putExtra("duration", q);
                }
             }
             on.J = intent;
             on.K = TextUtils.n(p0.getData().getPath(), j0.f(obj, str3));
             music = j0.e(obj, "music");
             on.E = music;
             on.F = b;
             if (music != null) {
                m.i(music);
                if (!on.d.d(p0.j.a()).c()) {
                   on.E.mImageUrl = on.k1;
                }
                on.L = j0.e(obj, str4);
                on.T = j0.c(obj, str2, 0);
                on.G = j0.e(obj, this);
                on.U0 = j0.c(obj, str1, on.T);
                lyrics = PatchProxy.apply(null, on, n.class, "53");
                if (lyrics != patchProxyRe) {
                }else {
                   int i2 = d.a(-831446984).uK(0);
                   n u = (on.X != null)? on.U: y.b(on.G, on.U, on.U0, (long)i2);
                   q = on.G;
                   n u0 = on.U0;
                   l = (long)i2;
                   if (u - l > 0) {
                      l = u - 1;
                   }
                   lyrics = y.c(q, u0, l);
                }
                on.H = lyrics;
                LyricsView lyricsView = on.C.b();
                if (lyricsView != null) {
                   lyricsView.setListener(on.g1);
                }
                on.r.setSelected(true);
                n = on.N;
                if (n != null) {
                   n.c();
                }
                f uof = new f();
                on.N = uof;
                d = on.d;
                String absolutePath = on.I.getAbsolutePath();
                l = this.r2();
                Objects.requireNonNull(uof);
                if (!PatchProxy.isSupport(f.class) || (!PatchProxy.applyVoidThreeRefs(d, absolutePath, Long.valueOf(l), uof, f.class, "1") && (!TextUtils.n(uof.a, absolutePath) || uof.b - l))) {
                   objArray1 = new Object[0];
                   a.D().w("Record_KwaiAudioPlayer", "setFilePath "+absolutePath, objArray1);
                   uof.c();
                   uof.a = absolutePath;
                   try{
                      uof.b = l;
                      uof.e = WaynePlayerFactory.createPlayer(new WayneBuildData("KwaiAudioPlayer").setBizFt(":ks-features:ft-post:record").setNormalUrl(uof.a, 1).setStartPosition(uof.b));
                   }catch(java.lang.Exception e0){
                      ExceptionHandler.handleCaughtException(e0);
                      a.D().e("Record_KwaiAudioPlayer", "setDataSource \n", e0);
                   }
                   a.a(uof.e.getKernelPlayer());
                   uof.e.setLooping(false);
                   uof.e.addOnCompletionListener(new d(uof));
                   uof.e.addOnPreparedListener(b.b);
                   uof.e.addOnErrorListener(a.b);
                   uof.e.addOnInfoListener(new e(uof, d));
                   uof.e.prepareAsync();
                }
                try{
                   on.N.e((0x3f800000 / on.Z));
                   n = on.P;
                   Objects.requireNonNull(n);
                   int i = 3;
                   int i1 = 4;
                   if (!PatchProxy.applyVoid(null, n, i.class, "5")) {
                      n.h2();
                      i o = n.o;
                      if (o.E != null) {
                         q = o.I;
                         if (q != null && q.exists()) {
                            KsMediaPlayer ksMediaPlaye = new KsMediaPlayer$Builder(a1.c()).seekAtStart(n.K1()).build();
                            n.p = ksMediaPlaye;
                            ksMediaPlaye.setBizFt("MusicPreviewController");
                            n.p.setDataSource(n.o.I.getAbsolutePath());
                            n.p.setOption(i1, "enable-accurate-seek", 1);
                            n.p.setVolume(0, 0);
                            n.p.setAudioStreamType(i);
                            n.p.setOnPreparedListener(h.b);
                            n.p.prepareAsync();
                            n.q = n.g2();
                         }
                      }
                   }
                   c uoc = on.d.b().V7();
                   if (uoc != null && (this.f2() && !on.S.a())) {
                      b uob = new b(RecordBubbleItem.MUSIC_SWITCH).n(on.w).A(R.string.arg_RES_7f1037d3);
                      uob.t(this.n2());
                      uob = uob.z(new k1(on));
                      uob.v(j.a);
                      uoc.n(uob);
                      if (on.L == MusicSource.SEARCH_FEED && !on.d.d(p0.j.a()).b()) {
                         uob = (on.E.mType == MusicType.SOUNDTRACK)? 1: 0;
                         Intent boolean l1 = on.e.getIntent();
                         boolean b2 = j0.g(l1, "magic_face");
                         l1 = j0.g(l1, "music");
                         b uob1 = new b(RecordBubbleItem.USED_ORIGINAL_MUSIC).n(on.w);
                         b1 = (uob)? 0x7f104fc3: 0x7f104fc2;
                         uob = uob1.A(b1).z(new n1(on, b2, l1));
                         uob.t(this.n2());
                         uoc.n(uob);
                      }
                   }
                label_037d :
                   on.d.m(new c(true));
                   intent = on.e.getIntent();
                   intent.putExtra("INTENT_EXTRA_BGM_AUDIO_FILE", on.I.getAbsolutePath());
                   intent.putExtra("INTENT_EXTRA_BGM_AUDIO_IS_WHOLE_FILE", on.K);
                   SerializableHook.putExtra(intent, "music", on.E);
                   intent.putExtra("INTENT_EXTRA_BGM_AUDIO_START_MILLS", on.U0);
                   SerializableHook.putExtra(intent, str4, on.L);
                   intent.putExtra("isMusicNeedBringToEditByAlbum", j0.a(obj, "isMusicNeedBringToEditByAlbum", true));
                   on.Q2(true, p1);
                   on.d.m(new g0(this.B2()));
                   d d1 = on.d;
                   KsMediaPlayer n l11 = PatchProxy.apply(null, on, n.class, "86");
                   if (l11 != patchProxyRe) {
                      l = l11.longValue();
                   }else {
                      l11 = on.E;
                      long l3 = (l11 != null)? TimeUnit.SECONDS.toMillis((long)l11.mCopyrightTimeLimitInSecond): null;
                      l = l3;
                   }
                   d1.m(new f(l));
                   f0 uof0 = this.g2();
                   if (uof0 != null) {
                      on.d.m(uof0);
                   }
                   on.Q.h2();
                   e uoe = e.class;
                   if (PatchProxy.isSupport(n.class) && (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p2), obj, on, n.class, "61") && on.E != null)) {
                      q = on.Q;
                      l11 = on.P.h1();
                      n t = on.T;
                      long l2 = this.p2();
                      boolean b3 = false;
                      boolean b4 = j0.a(obj, "originPathAndRanges", b3);
                      Objects.requireNonNull(q);
                      if (PatchProxy.isSupport(uoe)) {
                         Object[] objArray2 = new Object[]{l11,Long.valueOf(t),Long.valueOf(l2),Boolean.valueOf(p2),Boolean.valueOf(b4)};
                         if (PatchProxy.applyVoid(objArray2, q, uoe, "1")) {
                         label_0481 :
                            q = on.Q;
                            Objects.requireNonNull(q);
                            if (!PatchProxy.applyVoid(null, q, uoe, "3")) {
                               uoe = q.p;
                               if (uoe != null) {
                                  uoe.setOnPreparedListener(new u(q));
                                  uoe = q.p;
                                  if (uoe != null) {
                                     uoe.setOnCompletionListener(new t(q));
                                  }
                               }
                            }
                         }
                      }
                      q.p = l11;
                      q.s = new y0(1000, new y(q));
                      q.t = t;
                      q.u = l2;
                      q.w = b;
                      q.y = b4;
                      goto label_0481 ;
                   }
                label_04a8 :
                   Objects.requireNonNull(a.a);
                   on.C2(on.E);
                   return;
                }catch(java.io.IOException e0){
                }
             }else {
                objArray1 = new Object[0];
                a.D().w(str5, "music is null in enterMusicMode", objArray1);
                PostUtils.x("MusicViewController", "music NPE");
                return;
             }
          }
       }
    }
    public long ie(){
       Object obj = PatchProxy.apply(null, this, n.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.l2();
    }
    public void k(View p0){
       Intent intent;
       int i;
       ConstraintLayout uConstraintL;
       TextView textView;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "4")) {
          return;
       }
       super.k(p0);
       this.X0 = p0;
       boolean b = false;
       this.Y0 = b;
       this.q = p0.findViewById(0x7f0a29e1);
       n tY = this.Y;
       ImageView imageView = null;
       View view = (tY == null)? imageView: tY.H();
       this.r = b.a(view, p0, 0x7f0a05db);
       tY = this.Y;
       view = (tY == null)? imageView: tY.G();
       this.A = b.a(view, p0, 0x7f0a05de);
       tY = this.Y;
       view = (tY == null)? imageView: tY.J();
       this.w = b.a(view, p0, 0x7f0a2c9c);
       this.s = p0.findViewById(0x7f0a05c4);
       this.t = p0.findViewById(0x7f0a2ca9);
       this.u = p0.findViewById(0x7f0a2c7d);
       if (e.e()) {
          f5.b(this.r, this.s, this.w, this.t, this.u);
          tY = this.Y;
          view = (tY == null)? imageView: tY.y();
          e.i(this.A, b.a(view, p0, R.id.action_bar_layout));
       }else if(s6.m()){
          View[] viewArray = new View[]{this.r,this.t};
          i.a(this.w, viewArray);
          this.r.setPlaceHolderImage(R.drawable.arg_RES_7f081c00);
          this.t.getHierarchy().u(t$b.g);
          this.t.setActualImageResource(R.drawable.arg_RES_7f081c27);
       }
       this.x = imageView;
       j oj = new j();
       this.C = oj;
       oj.h(p0);
       this.C.i(new s0(this));
       this.e1 = this.e.getIntent().getBooleanExtra("musicNotShowProgress", b) ^ 1;
       if (this.d.d(p.c).a != null) {
          this.e1 = b;
       }
       if (this.E != null) {
          this.P2();
       }else if(!b.a(this.d) && j0.g(this.e.getIntent(), "music")){
          this.t2(this.e.getIntent(), b);
       }else if(!b.a(this.d) && this.u2()){
          if (!PatchProxy.applyVoid(imageView, this, on, "28")) {
             intent = this.e.getIntent();
             if (intent != null) {
                String str = j0.f(intent, "musicId");
                boolean b1 = j0.a(this.e.getIntent(), "needMusicDownloadIndicator", b);
                i = j0.b(intent, "musicType", -1);
                if (i == -1) {
                   Object[] objArray = new Object[b];
                   a.D().t("MusicView", "musicType is invalid", objArray);
                }else if(b1){
                   this.D2(new a("record", "taken_in_resource"), b.a(0x4a533fa).h(str, i).map(m.b), MusicSource.SEARCH_FEED, 1);
                }
             }
          }
       }else if(b.a(this.d) || PatchProxy.applyVoid(imageView, this, on, "29")){
          intent = this.e.getIntent();
          if (intent != null && j0.b(intent, "camera_page_source", b) == 18) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103d7a));
          }
       }
       this.Y1(this.d.l(s.class, new w0(this)));
       this.Y1(this.d.l(a.class, new b1(this)));
       this.Y1(this.d.l(b.class, new a1(this)));
       this.Y1(f.a(PanelShowEvent.class, new g1(this)));
       this.Y1(f.a(g.class, new e1(this)));
       this.Y1(f.a(ControlSpeedLayout$c.class, new z0(this)));
       this.Y1(this.d.l(j.class, new y0(this)));
       this.X = this.d.d(n.j).a;
       return;
    }
    public void k2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "80")) {
          return;
       }
       this.E = objArray;
       boolean b = false;
       this.F = b;
       this.K = b;
       this.e.getIntent().removeExtra("music");
       this.e.getIntent().removeExtra("music_source");
       this.e.getIntent().removeExtra("isMusicNeedBringToEditByAlbum");
       this.M = objArray;
       this.I = objArray;
       this.J = objArray;
       this.G = objArray;
       long l = 0;
       this.T = l;
       this.U = l;
       this.h1 = b;
       this.L = MusicSource.UNKNOWN;
       this.Q.h2();
       this.E2();
       b9.a(this.y);
       this.r.i0();
       this.r.setForegroundDrawable(objArray);
       this.r.setPadding(n.m1, n.m1, n.m1, n.m1);
       this.r.setImageDrawable(a1.f(this.m2()));
       n tr = this.r;
       tr.setEnabled(tr.isEnabled());
       this.r.setSelected(b);
       f5.c(this.r, this.t, this.u, b, this.y2());
       if (s6.m()) {
          n.Y(this.t, 4, b);
       }
       if (this.a1 != null) {
          e.b(this.C.a(), this.C.f());
       }
       int i = 8;
       this.C.a().setVisibility(i);
       this.C.b().setEnableHighlight(b);
       this.H2(i);
       tr = this.w;
       if (tr != null) {
          tr.setText(R.string.arg_RES_7f103703);
       }
       this.J2(i);
       f0 uof0 = this.g2();
       if (uof0 != null) {
          this.d.m(uof0);
       }
       this.d.m(new c(true));
       this.d.m(new g0(b));
       this.d.m(new f(l));
       this.a1 = b;
       Object[] objArray1 = new Object[b];
       a.D().w("MusicView", "exitMusicMode", objArray1);
       this.C2(this.E);
       return;
    }
    public long l2(){
       n obj = PatchProxy.apply(null, this, n.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.N;
       if (obj == null) {
          return 0;
       }
       return (obj.a() - this.r2());
    }
    public final int m2(){
       int i;
       Object obj = PatchProxy.apply(null, this, n.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.e()) {
          i = 0x7f081ca6;
       }else if(s6.m()){
          i = 0x7f081c00;
       }else {
          i = 0x7f081c25;
       }
       return i;
    }
    public final int n2(){
       Object obj = PatchProxy.apply(null, this, n.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (e.e())? (e.a + l.a()) * -1: - a1.d(0x7f07011d);
       return i;
    }
    public final long o2(){
       n obj = PatchProxy.apply(null, this, n.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.E;
       if (obj != null) {
          Music mType = obj.mType;
          if (mType != null && (mType == MusicType.LIP || mType == MusicType.SOUNDTRACK)) {
             return this.p2();
          }
       }
       return 0;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       Music music;
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, n.class, "19")) {
          return;
       }
       super.onActivityCallback(p0, p1, p2);
       if (p2 != null) {
          this.b1 = j0.a(p2, "isMusicActivityLaunchFromTemplate", false);
       }
       if (p1 == -1) {
          if (p0 == 553) {
             Serializable serializable = null;
             String str = "music";
             music = (p2 == null)? serializable: j0.e(p2, str);
             if (music != null) {
                Intent intent = this.e.getIntent();
                Object[] objArray = new Object[false];
                a.D().w("MusicView", "try to clear music in activityIntent with extraId="+music.mId, objArray);
                if (intent != null) {
                   SerializableHook.putExtra(intent, str, serializable);
                }
                this.d.m(new g0(true));
                this.Q.h2();
             }
             this.t2(p2, false);
          }
       }else if(!p1 && (p2 != null && j0.a(p2, "finish_record", false))){
          Object[] objArray1 = new Object[false];
          a.D().w("MusicView", "finish activity", objArray1);
          this.e.setResult(false);
          this.e.finish();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       super.onDestroy();
       this.E2();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       super.onDestroyView();
       n tV = this.V;
       if (tV != null && !tV.isDisposed()) {
          this.V.dispose();
       }
       this.z = null;
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onResume(){
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "17")) {
          return;
       }
       super.onResume();
       if (this.V0 != null) {
          this.L2();
       }
       if (!PatchProxy.applyVoid(null, this, on, "59")) {
          Object[] objArray = new Object[false];
          String str = "MusicView";
          a.D().w(str, "showKtvGuideBubble, try show bubble", objArray);
          if (this.b1 == null) {
             objArray = new Object[false];
             a.D().w(str, "showKtvGuideBubble, not launch from Template", objArray);
          }else {
             this.b1 = false;
             if (a.a.getBoolean("is_need_show_ktv_guide_bubble", true)) {
                c uoc = this.d.b().V7();
                if (uoc != null && this.f2()) {
                   b uob = new b(RecordBubbleItem.KTV_GUIDE_BUBBLE).n(this.w).A(R.string.arg_RES_7f101b33);
                   uob.q(3000);
                   uob.t(this.n2());
                   uob = uob.z(new l1(this));
                   uob.w(new n0(this));
                   uob.v(k.a);
                   uoc.n(uob);
                }
             }
          }
       }
       this.V0 = false;
       on = this.j1;
       if (on != null) {
          on.run();
          this.j1 = null;
       }
       return;
    }
    public final long p2(){
       Object obj = PatchProxy.apply(null, this, n.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.K != null)? this.U - this.T: this.U;
       Music mCopyrightTi = this.E.mCopyrightTimeLimitInSecond;
       if (mCopyrightTi != null) {
          l = Math.min(l, TimeUnit.SECONDS.toMillis((long)mCopyrightTi));
       }
       return l;
    }
    public void q1(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "12")) {
          return;
       }
       super.q1();
       if (this.X == null && !PatchProxy.applyVoid(objArray, this, on, "34")) {
          if (a.f0() || !this.a2()) {
             if (!PatchProxy.applyVoid(objArray, this, on, "40")) {
                if (this.B2() && (this.G != null && this.E.mType == MusicType.LIP)) {
                   LyricsView lyricsView = this.C.b();
                   if (!PatchProxy.applyVoidOneRefs(lyricsView, this, on, "43")) {
                      lyricsView.setEnabled(false);
                      lyricsView.setEnableKara(false);
                      lyricsView.setMaxLine(4);
                      lyricsView.setLayoutType(false);
                      lyricsView.setLrcTextSize(c.b(lyricsView.getResources(), R.dimen.arg_RES_7f070f72));
                      lyricsView.setTopPaddingLine(1);
                      lyricsView.setEnableGradient(false);
                      lyricsView.setEnableFadingEdge(false);
                      lyricsView.setEnableHighlight(1);
                      lyricsView.setLrcPadding(c.b(lyricsView.getResources(), R.dimen.arg_RES_7f070582));
                   }
                }
                this.O2();
                RxBus.f.b(new i());
             }
          }else if(this.B2()){
             on = this.G;
             if (on != null && (!q.f(on.mLines) && this.E.mType == MusicType.LIP)) {
                this.K2(this.C.b());
                this.C.b().h(this.U0, 1);
             }
          }
          RxBus.f.b(new h());
       }
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, n.class, "21")) {
          return;
       }
       f0 uof0 = p2.d(f0.k);
       if (uof0.b != null) {
          String str = PatchProxy.apply(null, uof0, f0.class, "1");
          if (str != PatchProxyResult.class) {
          }else {
             f0 b = uof0.b;
             String str1 = (b == null)? "": b.a(b, uof0.h, uof0.e, true).toString();
             str = str1;
          }
          if (p1 != null) {
             Asset$ShootInfo$a shootInfo$a = p1.getShootInfo().toBuilder();
             RecordMusic$b uob = RecordMusic.newBuilder();
             uob.copyOnWrite();
             uob.instance.setRecordMusicInfo(str);
             RecordMusic recordMusic = uob.build();
             shootInfo$a.copyOnWrite();
             shootInfo$a.instance.setRecordMusic(recordMusic);
             p1.t(shootInfo$a);
          }
       }
       return;
    }
    public long r2(){
       n tT = (this.K != null)? this.T: 0;
       return tT;
    }
    public void s0(){
       f f;
       Object[] objArray = null;
       String str = "10";
       if (PatchProxy.applyVoid(objArray, this, n.class, str)) {
          return;
       }
       super.s0();
       n tN = this.N;
       if (tN != null) {
          Objects.requireNonNull(tN);
          if (!PatchProxy.applyVoid(objArray, tN, f.class, str) && !tN.f.isEmpty()) {
             Object[] objArray1 = new Object[0];
             a.D().w("Record_KwaiAudioPlayer", "removeSegment", objArray1);
             f = tN.f;
             f.remove((f.size() - 1));
             tN.d(tN.a());
          }
          this.C.b().h((this.U0 + this.l2()), true);
       }
       return;
    }
    public void s2(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "47")) {
          return;
       }
       b9.a(this.V);
       boolean b = false;
       this.F2(b);
       if (p0.a() == null || j0.e(p0.a(), "music") == null) {
          Object[] objArray = new Object[b];
          a.D().w("MusicView", "handle assistant musicDataApplyEvent, music is null", objArray);
          this.k2();
          return;
       }else {
          this.Z0 = p0.d;
          this.a1 = p0.c;
          long l = 0;
          long l1 = j0.c(p0.a(), "duration", l);
          if (l1 - l > 0) {
             this.I2(l1);
          }else {
             l1 = j0.c(p0.a(), "musicOriginLength", l);
             if (l1 - l > 0) {
                this.I2(l1);
             }
          }
          this.W = b;
          this.M = null;
          this.k1 = "";
          Object[] objArray1 = new Object[b];
          a.D().w("MusicView", "handle assistant musicDataApplyEvent, enterMusicMode", objArray1);
          this.i2(p0.a(), b, p0.e);
          return;
       }
    }
    public void t2(Intent p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, on, "52")) {
          return;
       }
       boolean b = false;
       if (p0 == null) {
          this.F2(b);
          return;
       }else if(j0.a(this.e.getIntent(), "needMusicDownloadIndicator", b)){
          Object[] objArray = new Object[b];
          a.D().w("MusicView", "handleMusicIntent...needShowMusicDownloadIndicator", objArray);
          return;
       }else {
          this.F2(true);
          n$b uob = new n$b(this, this.e, this.e1, j0.e(p0, "music"), p0, p1);
          Void[] voidArray = new Void[b];
          v1.e(AsyncTask.l, voidArray);
          return;
       }
    }
    public final boolean u2(){
       Intent obj = PatchProxy.apply(null, this, n.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e.getIntent();
       boolean b = (obj != null && (!TextUtils.x(j0.f(obj, "musicId")) && j0.b(obj, "musicType", -1) != -1))? true: false;
       return b;
    }
    public final void v2(){
       if (PatchProxy.applyVoid(null, this, n.class, "84")) {
          return;
       }
       if (!e.e() && !s6.m()) {
          n tY = this.Y;
          this.x = (tY != null)? tY.L(): p.c(this.l, 0x7f0a05c6, 0x7f0a05c5);
       }
    label_0034 :
       return;
    }
    public void w1(Intent p0){
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "1")) {
          return;
       }
       super.w1(p0);
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(p0, this, on, "3")) {
          String str = "key_record_music_origin_path";
          if (j0.g(p0, str)) {
             str = j0.e(p0, str);
             if (!TextUtils.x(str)) {
                p0.setData(Uri.parse(str));
                if (j0.a(p0, "key_record_music_path_is_whole_music", b)) {
                   p0.putExtra("musicOriginFile", p0.getData().getPath());
                }
             }
          }
       }
       boolean b1 = (j0.e(this.e.getIntent(), "music_source") != MusicSource.TAG || j0.e(this.e.getIntent(), "magic_face") == null)? true: false;
       this.B = b1;
       if (this.u2() && j0.a(this.e.getIntent(), "isMultiMusic", b)) {
          b = true;
       }
       this.h1 = b;
       return;
    }
    public final boolean w2(){
       boolean b;
       n obj = PatchProxy.apply(null, this, n.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       if (obj != null && (!obj.getVisibility() && this.w.isEnabled())) {
          obj = this.A;
          if (obj != null && (!obj.getVisibility() && this.A.isEnabled())) {
             b = true;
          label_003b :
             return b;
          }
       }
    label_003a :
       b = false;
       goto label_003b ;
    }
    public void x(View p0,boolean p1,int p2,int p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, n.class, "27")) {
          return;
       }
       if (p0.getId() == 0x7f0a29d7) {
          this.C.j(p0, p2, p3);
       }
       return;
    }
    public final boolean y2(){
       Object obj = PatchProxy.apply(null, this, n.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.d(p0.j.a()).c();
    }
    public final boolean z2(){
       return (this.Y0 ^ 0x01);
    }
}
