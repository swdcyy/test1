package com.kuaishou.commercial.tach.component.player.controller.TKPlayerController;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import android.view.View$OnLayoutChangeListener;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import java.lang.Object;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$ScaleType;
import android.widget.FrameLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import px6.b;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import ux6.d;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import nx6.b;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$PlayerDataType;
import uz.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$b;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$a;
import java.lang.Enum;
import tz.c;
import tz.a;
import tz.b;
import tz.d;
import rx6.b;
import msd.l;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import sz.a;
import mx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.wayne.player.listeners.OnProgressChangeListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import xx6.f;
import xx6.f$b;
import java.lang.Number;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Throwable;
import zp8.a;
import java.lang.Float;
import android.view.View;
import com.kwai.video.player.IMediaPlayer;

public class TKPlayerController implements IMediaPlayer$OnPreparedListener, IMediaPlayer$OnVideoSizeChangedListener, View$OnLayoutChangeListener, OnStartListener	// class@001674
{
    public IMediaPlayer$OnPreparedListener A;
    public OnPauseListener B;
    public OnStartListener C;
    public IMediaPlayer$OnCompletionListener D;
    public OnWayneErrorListener E;
    public final KwaiPlayerKitView b;
    public TKPlayerController$PlayerDataType c;
    public TKPlayerController$b d;
    public Object e;
    public IWaynePlayer f;
    public l g;
    public b h;
    public int i;
    public String j;
    public a k;
    public long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public TKPlayerController$ScaleType u;
    public f$b v;
    public IMediaPlayer$OnVideoSizeChangedListener w;
    public OnProgressChangeListener x;
    public IMediaPlayer$OnInfoListener y;
    public OnPlayerLoadingChangedListener z;

    public void TKPlayerController(KwaiPlayerKitView p0){
       super();
       this.o = true;
       this.u = TKPlayerController$ScaleType.FIX_XY;
       this.b = p0;
       p0.addOnLayoutChangeListener(this);
    }
    public final void a(int p0,int p1){
       if (PatchProxy.isSupport(TKPlayerController.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKPlayerController.class, "41")) {
          return;
       }
       this.b(p0, p1, false);
       return;
    }
    public final void b(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(TKPlayerController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, TKPlayerController.class, "42")) {
          return;
       }
       int width = this.b.getWidth();
       int height = this.b.getHeight();
       if (!p0 || (!p1 || (width && height))) {
          if (!p2 && (this.q == p0 && (this.r == p1 && (this.s == width && this.t == height)))) {
             return;
          }else {
             this.q = p0;
             this.r = p1;
             this.s = width;
             this.t = height;
             DefaultFrameUiModule uDefaultFram = this.e().i(DefaultFrameUiModule.class);
             if (uDefaultFram == null) {
                return;
             }else {
                TKPlayerController tu = this.u;
                if (tu != TKPlayerController$ScaleType.FIX_XY) {
                   float f = (float)p0;
                   float f1 = f * 0x3f800000;
                   float f2 = (float)width;
                   float f3 = f1 / f2;
                   float f4 = (float)p1;
                   float f5 = 0x3f800000 * f4;
                   float f6 = (float)height;
                   float f7 = f5 / f6;
                   if (tu == TKPlayerController$ScaleType.CENTER_INSIDE) {
                      if (f3 - f7 > 0) {
                      label_007e :
                         height = (int)((f5 / f) * f2);
                      }
                   }else if(tu == TKPlayerController$ScaleType.CENTER_CROP){
                      if (f3 - f7 < 0) {
                         goto label_007e ;
                      }
                   }else {
                      width = -1;
                      height = -1;
                   }
                   width = (int)((f1 / f4) * f6);
                }
                if (width <= 0 || (height > 0 && uDefaultFram.l() instanceof b)) {
                   uDefaultFram.l().c(width, height);
                }
             }
          }
       }
    label_00a9 :
       return;
    }
    public void c(Object p0,TKPlayerController$PlayerDataType p1,int p2,long p3,a p4){
       TKPlayerController tf;
       TKPlayerController tKPlayerCont;
       JSONObject jSONObject;
       String str;
       String str1;
       int i = 4;
       if (PatchProxy.isSupport(TKPlayerController.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Long.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, TKPlayerController.class, "1")) {
             return;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, TKPlayerController.class, "2") && this.c != p1) {
          this.c = p1;
          c uoc = PatchProxy.applyOneRefs(p1, null, TKPlayerController.class, "45");
          if (uoc != PatchProxyResult.class) {
          }else {
             int i1 = TKPlayerController$a.a[p1.ordinal()];
             if (i1 != 2) {
                if (i1 != 3) {
                   uoc = (i1 != i)? new c(): new a();
                }else {
                   uoc = new b();
                }
             }else {
                uoc = new d();
             }
          }
          this.d = uoc;
       }
       if (this.l - p3) {
          this.m = false;
          this.l = p3;
       }
       if (this.k != p4) {
          this.m = false;
          this.k = p4;
       }
       if (this.i != p2) {
          this.m = false;
          this.i = p2;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, TKPlayerController.class, "5") && this.d != null) {
          tf = PatchProxy.applyOneRefs(p0, this, TKPlayerController.class, "16");
          if (tf != PatchProxyResult.class) {
          }else if(this.h == null || this.e != p0){
             this.e = p0;
             this.h = this.d.a(p0);
          }
          tf = this.h;
          if (tf != null) {
             try{
                p0 = this.b;
                tKPlayerCont = PatchProxy.apply(null, this, TKPlayerController.class, "17");
                if (tKPlayerCont != PatchProxyResult.class) {
                }else if(this.m != null){
                   tKPlayerCont = this.g;
                   if (tKPlayerCont == null) {
                   }
                }else {
                }
             }catch(java.lang.Exception e0){
                a uoa = new a(this, jSONObject);
                this.g = uoa;
                this.m = true;
                tKPlayerCont = uoa;
             }
             p0.g(tf, tKPlayerCont);
             this.o = false;
             this.p = false;
          }
       }
    label_010e :
       if (!PatchProxy.applyVoid(null, this, TKPlayerController.class, "3")) {
          p0 = this.e().e(a.class);
          if (p0 != null) {
             p0 = p0.getPlayer();
             tf = this.f;
             if (p0 != tf) {
                if (tf != null) {
                   this.h();
                }
                this.f = p0;
                if (!PatchProxy.applyVoid(null, this, TKPlayerController.class, "4")) {
                   p0 = this.f;
                   if (p0 != null) {
                      p0.addOnPreparedListener(this);
                      this.f.addOnStartListener(this);
                      this.f.addOnVideoSizeChangedListener(this);
                      p0 = this.w;
                      if (p0 != null) {
                         this.f.addOnVideoSizeChangedListener(p0);
                      }
                      p0 = this.x;
                      if (p0 != null) {
                         this.f.addOnProgressChangeListener(p0);
                      }
                      p0 = this.y;
                      if (p0 != null) {
                         this.f.addOnInfoListener(p0);
                      }
                      p0 = this.z;
                      if (p0 != null) {
                         this.f.addOnPlayerLoadingChangedListener(p0);
                      }
                      p0 = this.A;
                      if (p0 != null) {
                         this.f.addOnPreparedListener(p0);
                      }
                      p0 = this.B;
                      if (p0 != null) {
                         this.f.addOnPauseListener(p0);
                      }
                      p0 = this.C;
                      if (p0 != null) {
                         this.f.addOnStartListener(p0);
                      }
                      p0 = this.D;
                      if (p0 != null) {
                         this.f.addOnCompletionListener(p0);
                      }
                      p0 = this.E;
                      if (p0 != null) {
                         this.f.addOnWayneErrorListener(p0);
                      }
                      if (this.v != null) {
                         p0 = this.e().h();
                         if (p0 != null) {
                            p0.l(this.v);
                         }
                      }
                   }
                }
             }
          }
       }
    label_01b9 :
       return;
    }
    public long d(){
       TKPlayerController obj = PatchProxy.apply(null, this, TKPlayerController.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.f;
       if (obj == null) {
          return 0;
       }
       return obj.getDuration();
    }
    public b e(){
       Object obj = PatchProxy.apply(null, this, TKPlayerController.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getPlayerKitContext();
    }
    public PlayerState f(){
       TKPlayerController obj = PatchProxy.apply(null, this, TKPlayerController.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          return null;
       }
       return obj.getState();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, TKPlayerController.class, "26")) {
          return;
       }
       this.p = false;
       this.o = true;
       try{
          this.b.release();
       }catch(java.lang.Exception e0){
          a.g("TKPlayerController", e0);
       }
       this.h();
       this.h = null;
       this.g = null;
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, TKPlayerController.class, "43")) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf != null) {
          tf.removeOnStartListener(this);
          this.f.removeOnPreparedListener(this);
          this.f.removeOnVideoSizeChangedListener(this);
          tf = this.w;
          if (tf != null) {
             this.f.removeOnVideoSizeChangedListener(tf);
          }
          tf = this.x;
          if (tf != null) {
             this.f.removeOnProgressChangeListener(tf);
          }
          tf = this.y;
          if (tf != null) {
             this.f.removeOnInfoListener(tf);
          }
          tf = this.z;
          if (tf != null) {
             this.f.removeOnPlayerLoadingChangedListener(tf);
          }
          tf = this.A;
          if (tf != null) {
             this.f.removeOnPreparedListener(tf);
          }
          tf = this.B;
          if (tf != null) {
             this.f.removeOnPauseListener(tf);
          }
          tf = this.C;
          if (tf != null) {
             this.f.removeOnStartListener(tf);
          }
          tf = this.D;
          if (tf != null) {
             this.f.removeOnCompletionListener(tf);
          }
          tf = this.E;
          if (tf != null) {
             this.f.removeOnWayneErrorListener(tf);
          }
       }
       if (this.v != null) {
          f uof = this.e().h();
          if (uof != null) {
             uof.m(this.v);
          }
       }
       return;
    }
    public void i(boolean p0){
       if (PatchProxy.isSupport(TKPlayerController.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKPlayerController.class, "35")) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf == null) {
          return;
       }
       tf.setLooping(p0);
       return;
    }
    public void j(IMediaPlayer$OnInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPlayerController.class, "9")) {
          return;
       }
       TKPlayerController ty = this.y;
       if (ty == p0) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf != null) {
          if (ty != null) {
             tf.removeOnInfoListener(ty);
          }
          this.f.addOnInfoListener(p0);
       }
       this.y = p0;
       return;
    }
    public void k(boolean p0){
       if (PatchProxy.isSupport(TKPlayerController.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKPlayerController.class, "33")) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf == null) {
          return;
       }
       tf.setPlayerMute(p0);
       return;
    }
    public void l(float p0){
       if (PatchProxy.isSupport(TKPlayerController.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TKPlayerController.class, "32")) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf == null) {
          return;
       }
       tf.setSpeed(p0);
       return;
    }
    public void m(float p0){
       if (PatchProxy.isSupport(TKPlayerController.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TKPlayerController.class, "34")) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf != null && p0 >= 0) {
          tf.setVolume(p0, p0);
       }
       return;
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(TKPlayerController.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, TKPlayerController.class, "40")) {
             return;
          }
       }
       this.a(this.q, this.r);
       return;
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPlayerController.class, "38")) {
          return;
       }
       if (this.n != null) {
          return;
       }
       TKPlayerController tf = this.f;
       if (tf == null) {
          return;
       }
       try{
          if (this.p != null) {
             tf.start();
          }
       }catch(java.lang.Exception e3){
          a.g("TKPlayerController", e3);
       }
       return;
    }
    public void onStart(){
       this.p = false;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(TKPlayerController.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TKPlayerController.class, "39")) {
             return;
          }
       }
       this.a(p1, p2);
       return;
    }
}
