package com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import qm9.x;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$d;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$mMusicNotificationHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$mPipedMusicController$2;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$c;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$b;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView$e;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper;
import rm9.a;
import qm9.f;
import q87.c;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import qm9.q;
import android.view.View$OnClickListener;
import qm9.r;
import android.widget.RelativeLayout;
import qm9.s;
import qm9.t;
import com.yxcorp.gifshow.common_music_player.a;
import androidx.recyclerview.widget.RecyclerView;
import qm9.h;
import androidx.recyclerview.widget.RecyclerView$l;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import qm9.g;
import com.google.android.material.bottomsheet.a;
import qm9.y;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import kob.r;
import lnc.u1;
import brd.t;
import qm9.j;
import erd.g;
import crd.b;
import qm9.k;
import qm9.l;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import com.kwai.framework.activitycontext.ActivityContext;
import java.util.Map;
import e3a.a;
import com.kuaishou.android.model.music.Music;
import qm9.e0;
import java.lang.StringBuilder;
import m56.f;
import npb.c;
import lnc.b9;
import qm9.a;
import qm9.a0;
import qm9.c0;
import qm9.d0;
import java.lang.Integer;
import qm9.i;

public final class MusicListPlayerView extends FrameLayout implements x	// class@00118b
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public final p I;
    public final p J;
    public e0 K;
    public Map L;
    public String M;
    public int N;
    public final Application$ActivityLifecycleCallbacks O;
    public boolean P;
    public final RecyclerViewPager$c Q;
    public View b;
    public RecyclerViewPager c;
    public CollectAnimationView d;
    public ProgressBar e;
    public View f;
    public View g;
    public boolean h;
    public a i;
    public g j;
    public Music k;
    public y l;
    public r m;
    public b n;
    public b o;
    public b p;
    public b q;
    public b r;
    public b s;
    public final long t;
    public b u;
    public b v;
    public a0 w;
    public c0 x;
    public c0 y;
    public d0 z;
    public static final MusicListPlayerView$a R;

    static {
       MusicListPlayerView.R = new MusicListPlayerView$a(null);
    }
    public void MusicListPlayerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.h = true;
       this.t = 500;
       this.x = new MusicListPlayerView$d(this);
       this.I = s.c(MusicListPlayerView$mMusicNotificationHelper$2.INSTANCE);
       this.J = s.c(MusicListPlayerView$mPipedMusicController$2.INSTANCE);
       this.K = new MusicListPlayerView$c(this);
       this.O = new MusicListPlayerView$b(this);
       this.P = true;
       this.Q = new MusicListPlayerView$e(this);
       this.c();
    }
    public void MusicListPlayerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.h = true;
       this.t = 500;
       this.x = new MusicListPlayerView$d(this);
       this.I = s.c(MusicListPlayerView$mMusicNotificationHelper$2.INSTANCE);
       this.J = s.c(MusicListPlayerView$mPipedMusicController$2.INSTANCE);
       this.K = new MusicListPlayerView$c(this);
       this.O = new MusicListPlayerView$b(this);
       this.P = true;
       this.Q = new MusicListPlayerView$e(this);
       this.c();
    }
    public void MusicListPlayerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.h = true;
       this.t = 500;
       this.x = new MusicListPlayerView$d(this);
       this.I = s.c(MusicListPlayerView$mMusicNotificationHelper$2.INSTANCE);
       this.J = s.c(MusicListPlayerView$mPipedMusicController$2.INSTANCE);
       this.K = new MusicListPlayerView$c(this);
       this.O = new MusicListPlayerView$b(this);
       this.P = true;
       this.Q = new MusicListPlayerView$e(this);
       this.c();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView.class, "22")) {
          return;
       }
       a.p(p0, "list");
       MusicListPlayerView ti = this.i;
       if (ti != null) {
          ti.M0();
       }
       ti = this.i;
       if (ti != null) {
          ti.W0(p0);
       }
       ti = this.i;
       if (ti != null) {
          ti.k0();
       }
       ti = this.j;
       if (ti != null) {
          ti.M0();
       }
       ti = this.j;
       if (ti != null) {
          ti.W0(p0);
       }
       MusicListPlayerView tj = this.j;
       if (tj != null) {
          tj.k0();
       }
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, "28")) {
          return;
       }
       boolean b = false;
       if (this.H == null && this.G != null) {
          a.d(this.getMMusicNotificationHelper(), b, 1, objArray);
          this.G = b;
       }
       objArray = new Object[b];
       f.C().w("MusicListPlayerViewTag", "hideNotification---", objArray);
       return;
    }
    public final void c(){
       MusicListPlayerView tm;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, "3")) {
          return;
       }
       String str = "4";
       if (!PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, str)) {
          View view = a.c(this.getContext(), R.layout.arg_RES_7f0d1015, this);
          this.c = view.findViewById(0x7f0a2c95);
          this.e = view.findViewById(0x7f0a2c94);
          this.b = view.findViewById(0x7f0a2c8f);
          this.d = view.findViewById(0x7f0a2c90);
          this.f = view.findViewById(0x7f0a2c8c);
          this.g = view.findViewById(0x7f0a2c8a);
          tm = this.b;
          if (tm != null) {
             tm.setOnClickListener(new q(this));
          }
          tm = this.d;
          if (tm != null) {
             tm.j(13, false);
          }
          tm = this.d;
          if (tm != null) {
             tm.setOnClickListener(new r(this));
          }
          tm = this.f;
          if (tm != null) {
             tm.setOnClickListener(new s(this));
          }
          tm = this.g;
          if (tm != null) {
             tm.setOnClickListener(new t(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, "20")) {
          a uoa = new a();
          this.i = uoa;
          MusicListPlayerView tc = this.c;
          if (tc != null) {
             tc.setAdapter(uoa);
          }
          tm = this.i;
          if (tm != null) {
             a g = tm.g;
             if (g != null) {
                g.a = this.K;
             }
          }
          if (tm != null) {
             uoa = tm.g;
             if (uoa != null) {
                uoa.b = this.x;
             }
          }
          tm = this.c;
          if (tm != null) {
             tm.setItemAnimator(objArray);
          }
          tm = this.c;
          if (tm != null) {
             tm.x(this.Q);
          }
          if (this.l == null) {
             this.j = new g();
             uoa = new a(this.getContext(), 0x7f110130);
             Context context = this.getContext();
             a.o(context, "context");
             MusicListPlayerView tj = this.j;
             a.m(tj);
             a.p(context, "context");
             a.p(tj, "musicDialogAdapter");
             y oy = new y(context);
             oy.r = tj;
             this.l = oy;
          }
       }
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, MusicExperienceUtils.class, str);
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = MusicExperienceUtils.d.getValue();
       }
       this.H = uBoolean.booleanValue();
       if (!PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, "6")) {
          r or = d.a(-1687636538);
          this.m = or;
          int i = 1;
          if (or != null) {
             or.BZ((MusicExperienceUtils.a() ^ i));
          }
          tm = this.m;
          if (tm != null) {
             tm.qj(i);
          }
          tm = this.m;
          if (tm != null) {
             tm.DD(i);
          }
          if (!PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, "7")) {
             u1.a(this);
             tm = this.m;
             if (tm != null) {
                t ot = tm.Lk();
                if (ot != null) {
                   b uob = ot.subscribe(new j(this));
                label_017c :
                   this.o = uob;
                   tm = this.m;
                   if (tm != null) {
                      ot = tm.rx();
                      if (ot != null) {
                         uob = ot.subscribe(new k(this));
                      label_0193 :
                         this.q = uob;
                         tm = this.m;
                         if (tm != null) {
                            ot = tm.Pp();
                            if (ot != null) {
                               objArray = ot.subscribe(new l(this));
                            }
                         }
                         this.p = objArray;
                      }
                   }
                   objArray1 = objArray;
                   goto label_0193 ;
                }
             }
             objArray1 = objArray;
             goto label_017c ;
          }
       }
       a.b().registerActivityLifecycleCallbacks(this.O);
       return;
    }
    public final boolean d(){
       Activity obj = PatchProxy.apply(null, this, MusicListPlayerView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getCurrentActivity();
       boolean b = false;
       if (obj != null) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          if (a.g(uActivityCon.e(), obj) && this.P != null) {
             b = true;
          }
       }
       return b;
    }
    public final void e(){
       this.w = null;
    }
    public final void f(Map p0,String p1){
       this.L = p0;
       this.M = p1;
    }
    public final void g(boolean p0){
       if (PatchProxy.isSupport(MusicListPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicListPlayerView.class, "5")) {
          return;
       }
       this.h = p0;
       MusicListPlayerView td = this.d;
       int i = 0;
       if (td != null) {
          int i1 = (p0)? 0: 8;
          td.setVisibility(i1);
       }
       td = this.b;
       if (td != null) {
          if (p0) {
             i = 8;
          }
          td.setVisibility(i);
       }
       return;
    }
    public final Activity getCurrentActivity(){
       Object obj = PatchProxy.apply(null, this, MusicListPlayerView.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(this.getContext());
    }
    public final String getCurrentId(){
       String uniqueCode;
       MusicListPlayerView obj = PatchProxy.apply(null, this, MusicListPlayerView.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj != null) {
          uniqueCode = obj.getUniqueCode();
          if (uniqueCode != null) {
          label_001d :
             return uniqueCode;
          }
       }
       uniqueCode = "";
       goto label_001d ;
    }
    public final int getCurrentTabId(){
       return this.F;
    }
    public final Music getMCurrentMusic(){
       return this.k;
    }
    public final int getMCurrentTabId(){
       return this.F;
    }
    public final String getMExtPageName(){
       return this.M;
    }
    public final Map getMExtraLogParams(){
       return this.L;
    }
    public final r getMMusicListPlayerController(){
       return this.m;
    }
    public final g getMMusicListPlayerDialogAdapter(){
       return this.j;
    }
    public final e0 getMMusicListPlayerItemListener(){
       return this.K;
    }
    public final MusicNotificationHelper getMMusicNotificationHelper(){
       Object obj = PatchProxy.apply(null, this, MusicListPlayerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.getValue();
    }
    public final y getMMusicPanelBottomDialog(){
       return this.l;
    }
    public final r getMPipedMusicController(){
       Object obj = PatchProxy.apply(null, this, MusicListPlayerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.J.getValue();
    }
    public final void h(Music p0,boolean p1){
       MusicListPlayerView td1;
       if (PatchProxy.isSupport(MusicListPlayerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, MusicListPlayerView.class, "15")) {
          return;
       }
       MusicListPlayerView td = this.d;
       if (td != null && td.getVisibility() == 8) {
          return;
       }
       if (a.g(this.k, p0)) {
          if (p0.isOffline()) {
             td1 = this.d;
             if (td1 != null) {
                td1.h();
             }
          }else {
             td1 = this.d;
             if (td1 != null) {
                td1.setFavoriteState(p1);
             }
          }
       }
       return;
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, MusicListPlayerView.class, "24")) {
          return;
       }
       this.setVisibility(8);
       return;
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicListPlayerView.class, "27")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       if (this.H == null && this.d()) {
          MusicListPlayerView tk = this.k;
          if (tk == null || (tk.isCopyrightRiskMusic() != i1 && !this.getVisibility())) {
             a.u(this.getMMusicNotificationHelper(), 0, i1, objArray);
             this.G = i1;
          }else if(this.E != null){
             tk = this.k;
             if (tk != null && tk.isCopyrightRiskMusic() == i1) {
                a.d(this.getMMusicNotificationHelper(), i, i1, objArray);
                this.G = i;
             }
          }
       }
       f uof = f.C();
       StringBuilder str = "updateNotification---";
       if (this.getVisibility()) {
          i1 = false;
       }
       Object[] objArray1 = new Object[i];
       uof.w("MusicListPlayerViewTag", str+i1, objArray1);
       return;
    }
    public final void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView.class, "34")) {
          return;
       }
       a.p(p0, "event");
       MusicListPlayerView tm = this.m;
       if (tm != null) {
          c current = tm.getCurrent();
          if (current != null && current.a() == true) {
             tm = this.m;
             if (tm != null && tm.isPlaying() == true) {
                tm = this.m;
                if (tm != null) {
                   tm.pause();
                }
             }
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MusicListPlayerView.class, "30")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, MusicListPlayerView.class, "29")) {
          int i = 1;
          b[] uobArray = new b[i];
          uobArray[0] = this.n;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.o;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.q;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.p;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.r;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.u;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.v;
          b9.b(uobArray);
          uobArray = new b[i];
          uobArray[0] = this.s;
          b9.b(uobArray);
          if (this.H == null) {
             this.getMMusicNotificationHelper().c(i);
             this.getMMusicNotificationHelper().v();
          }
          u1.b(this);
          MusicListPlayerView tl = this.l;
          if (tl != null) {
             tl.dismiss();
          }
          tl = this.c;
          if (tl != null) {
             tl.y(this.Q);
          }
          a.b().unregisterActivityLifecycleCallbacks(this.O);
          this.m = null;
          this.e();
          this.x = null;
       }
       super.onDetachedFromWindow();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, MusicListPlayerView.class, "29")) {
          return;
       }
       int i = 1;
       b[] uobArray = new b[i];
       uobArray[0] = this.n;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.o;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.q;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.p;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.r;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.u;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.v;
       b9.b(uobArray);
       uobArray = new b[i];
       uobArray[0] = this.s;
       b9.b(uobArray);
       if (this.H == null) {
          this.getMMusicNotificationHelper().c(i);
          this.getMMusicNotificationHelper().v();
       }
       u1.b(this);
       MusicListPlayerView tl = this.l;
       if (tl != null) {
          tl.dismiss();
       }
       tl = this.c;
       if (tl != null) {
          tl.y(this.Q);
       }
       a.b().unregisterActivityLifecycleCallbacks(this.O);
       this.m = null;
       this.e();
       this.x = null;
       return;
    }
    public final void setCurrentRnTabId(int p0){
       this.F = p0;
    }
    public final void setEnableMusicRadioGuide(boolean p0){
       this.C = p0;
    }
    public final void setIsRnStyle(boolean p0){
       this.E = p0;
    }
    public final void setMCurrentMusic(Music p0){
       this.k = p0;
    }
    public final void setMCurrentTabId(int p0){
       this.F = p0;
    }
    public final void setMExtPageName(String p0){
       this.M = p0;
    }
    public final void setMExtraLogParams(Map p0){
       this.L = p0;
    }
    public final void setMMusicListPlayerController(r p0){
       this.m = p0;
    }
    public final void setMMusicListPlayerDialogAdapter(g p0){
       this.j = p0;
    }
    public final void setMMusicListPlayerItemListener(e0 p0){
       this.K = p0;
    }
    public final void setMMusicPanelBottomDialog(y p0){
       this.l = p0;
    }
    public final void setMusicPanelEventListener(a0 p0){
       this.w = p0;
    }
    public final void setMusicPlayItemClickListener(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView.class, "37")) {
          return;
       }
       a.p(p0, "musicPlayerItemClickCallBack");
       this.y = p0;
       return;
    }
    public final void setNeedAutoLogPanelShow(boolean p0){
       this.B = p0;
    }
    public final void setPageSelected(boolean p0){
       if (PatchProxy.isSupport(MusicListPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicListPlayerView.class, "33")) {
          return;
       }
       this.P = p0;
       if (!p0) {
          this.getMMusicNotificationHelper().c(true);
          this.G = false;
       }
       return;
    }
    public final void setPipedMusicMemorizer(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView.class, "26")) {
          return;
       }
       a.p(p0, "pipedMusicMemorizer");
       this.z = p0;
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(MusicListPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MusicListPlayerView.class, "25")) {
          return;
       }
       if (this.D == null && (this.E != null && (this.getVisibility() == 8 && !p0))) {
          i.c(this.k, null, "");
       }
    label_0031 :
       super.setVisibility(p0);
       Object[] objArray = new Object[0];
       f.C().w("MusicListPlayerViewTag", String.valueOf(p0), objArray);
       if (p0 == 8) {
          this.b();
       }else {
          this.i();
       }
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, MusicListPlayerView.class, "23")) {
          return;
       }
       this.setVisibility(0);
       return;
    }
}
