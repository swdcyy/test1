package com.yxcorp.gifshow.detail.plc.presenter.b;
import o4a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import o4a.g;
import f4a.f;
import f4a.c0;
import o4a.n;
import o4a.m;
import o4a.h;
import o4a.e;
import o4a.f;
import com.yxcorp.gifshow.detail.plc.presenter.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p4a.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.tuna.plc.StartTunaDownloadEvent;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.plc.presenter.a;
import erd.g;
import crd.b;
import android.view.View;
import android.view.ViewParent;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import com.yxcorp.gifshow.detail.plc.adapter.WeakStyleDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import o4a.k;
import io.reactivex.internal.functions.Functions;
import o4a.i;
import o4a.j;
import o4a.l;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import f4a.v;
import a2.i0;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.detail.plc.presenter.b$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import n4a.a;
import java.lang.Runnable;
import ekd.k1;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import com.yxcorp.gifshow.detail.plc.helper.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f4a.g0;
import java.lang.Integer;
import f4a.j0;
import f4a.b0;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import brd.y;
import xl8.b;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import rd5.e;
import com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import java.lang.Long;
import java.lang.Double;
import u3a.f;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import f4a.e0;
import io.reactivex.subjects.PublishSubject;
import mrd.c;
import f4a.i;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;

public class b extends PresenterV2 implements c	// class@00169a
{
    public b A;
    public a B;
    public y C;
    public b0 D;
    public PhotosViewPager E;
    public j0 F;
    public float G;
    public final Observer H;
    public boolean I;
    public boolean J;
    public PlcEntryDataAdapter K;
    public View L;
    public View M;
    public ScaleHelpView N;
    public GestureDetector O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public a U;
    public final IMediaPlayer$OnInfoListener U0;
    public boolean V;
    public final Runnable V0;
    public final f W;
    public Runnable W0;
    public final c0 X;
    public ViewPager$i X0;
    public final Runnable Y;
    public final Runnable Z;
    public QPhoto p;
    public a q;
    public PublishSubject r;
    public PlcEntryStyleInfo s;
    public t t;
    public c u;
    public PublishSubject v;
    public b0 w;
    public PublishSubject x;
    public i y;
    public y z;
    public static final long Y0;

    static {
       b.Y0 = (long)a1.e(-34.00f);
    }
    public void b(){
       super();
       this.G = 0x3f800000;
       this.H = new g(this);
       this.I = true;
       this.J = false;
       this.W = new f();
       this.X = new c0();
       this.Y = new n(this);
       this.Z = new m(this);
       this.U0 = new h(this);
       this.V0 = new e(this);
       this.W0 = new f(this);
       this.X0 = new b$a(this);
    }
    public void E8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, uob, str)) {
          return;
       }
       b tU = this.U;
       if (tU != null) {
          b tH = this.H;
          Objects.requireNonNull(tU);
          if (!PatchProxy.applyVoidOneRefs(tH, tU, a.class, str) && !tU.a.contains(tH)) {
             tU.a.add(tH);
          }
       }
       this.X7(RxBus.f.f(StartTunaDownloadEvent.class).observeOn(d.a).subscribe(new a(this)));
       this.L = this.m8().findViewById(0x7f0a3125);
       this.M = this.m8().findViewById(0x7f0a3126);
       this.N = this.m8().getParent().findViewById(0x7f0a2a96);
       this.K = new WeakStyleDataAdapter(this.p, this.s);
       this.q.getPlayer().addOnInfoListener(this.U0);
       b tr = this.r;
       if (tr != null) {
          this.X7(tr.subscribe(new k(this), Functions.e));
       }
       g e = Functions.e;
       this.X7(this.t.subscribe(new i(this), e));
       this.X7(this.x.subscribe(new j(this), e));
       b = this.W8();
       int i = 4;
       this.Y8(this.M, i);
       this.Y8(this.L, i);
       this.m8().setVisibility(i);
       if (this.W8() && !PatchProxy.applyVoid(objArray, this, uob, "8")) {
          uob = this.u;
          if (uob != null) {
             this.X7(uob.subscribe(new l(this, false)));
          }
       }
       b = true;
       uob = (!this.s.mStyleInfo.mWeakToStrongVideoMillis - 1 && !v.b().e(this.p.getPhotoId()))? 1: null;
       PlcEntryStyleInfo mStyleInfo = this.s.mStyleInfo;
       if (!mStyleInfo.mShowWeakVideoMillis && (!mStyleInfo.mShowWeakVideoCountdownMillis && (!mStyleInfo.mShowWeakVideoPercent && (!uob && this.M != null)))) {
          this.Q = b;
          if (i0.Y(this.m8())) {
             this.Z8();
          }else {
             this.m8().getViewTreeObserver().addOnGlobalLayoutListener(new b$b(this));
          }
          uob = this.B;
          if (uob != null) {
             if (uob.a != null) {
                this.R8(3);
             }else if(uob.b != null){
                this.R8(i);
             }else {
                this.R8(b);
             }
          }else {
             PlcEntryStyleInfo$StyleInfo mShowWeakMil = this.s.mStyleInfo.mShowWeakMillis;
             if (mShowWeakMil > 0) {
                k1.r(this.W0, mShowWeakMil);
             }else if(this.P8()){
                this.R8(b);
                this.J = false;
             }else {
                this.J = b;
             }
          }
       }
    label_0188 :
       if (this.E != null && this.p.isAtlasPhotos()) {
          this.E.addOnPageChangeListener(this.X0);
       }
       return;
    }
    public void J8(){
       boolean b;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, b.class, str)) {
          return;
       }
       this.q.getPlayer().removeOnInfoListener(this.U0);
       l.d(this.M);
       l.d(this.L);
       l.d(this.m8());
       k1.m(this.Y);
       k1.m(this.Z);
       k1.m(this.V0);
       k1.m(this.W0);
       b = this.W8();
       b tE = this.E;
       if (tE != null) {
          tE.removeOnPageChangeListener(this.X0);
       }
       tE = this.U;
       if (tE != null) {
          b tH = this.H;
          Objects.requireNonNull(tE);
          if (!PatchProxy.applyVoidOneRefs(tH, tE, a.class, str)) {
             tE.a.remove(tH);
          }
       }
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (g0.a(this.p)) {
          return this.I;
       }
       return true;
    }
    public void R8(int p0){
       boolean b;
       b tW;
       boolean b2;
       boolean i1;
       Object obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "6")) {
          return;
       }
       if (this.W.e == null && 11 != p0) {
          View view = this.m8();
          b uob1 = null;
          b = 300;
          int i = 4;
          boolean b1 = false;
          switch (p0){
              case 1:
                k1.m(this.W0);
                tW = this.W;
                uob1 = this.M;
                b2 = (uob1 != null)? true: false;
                tW.a = b2;
                tW.b = b1;
                l.b(uob1, 250, this.G);
                this.X.b(i);
                this.X.a(2);
                break;
              case 3:
                tW = this.W;
                tW.a = b1;
                i1 = (this.L != null)? true: false;
                tW.b = i1;
                l.a(this.M, 250);
                l.b(this.L, 250, this.G);
                this.X.b(2);
                this.X.a(i);
                PlcEntryStyleInfo$StyleInfo mStrongToDis = this.s.mStyleInfo.mStrongToDisappearMillis;
                if (mStrongToDis - false > 0) {
                   k1.r(this.V0, mStrongToDis);
                }
                TunaPlcLogger.d(TunaPlcLogger$Event.WEAK_TO_STRONG, this.p);
                break;
              case 4:
                this.R = true;
                tW = this.W;
                uob1 = this.M;
                b2 = (uob1 != null)? true: false;
                tW.a = b2;
                tW.b = b1;
                l.b(uob1, 250, this.G);
                l.a(this.L, 250);
                this.X.b(i);
                this.X.a(2);
                TunaPlcLogger.d(TunaPlcLogger$Event.STRONG_TO_WEAK, this.p);
                break;
              case 5:
                p0.d = true;
                l.d(view);
                view.setVisibility(b1);
                view.setAlpha(this.G);
                view.setScaleX(0x3f800000);
                view.setScaleY(0x3f800000);
                this.X.a(true);
                break;
              case 6:
                p0.d = b1;
                l.d(view);
                view.setVisibility(i);
                this.X.b(true);
                break;
              case 7:
                p0.d = true;
                l.c(view, 300, 0, this.G);
                this.X.a(true);
                break;
              case 8:
                p0.d = b1;
                l.a(view, b);
                this.X.b(true);
                break;
              case 9:
                tW = this.W;
                tW.d = b1;
                tW.e = true;
                this.w.K();
                l.a(view, b);
                this.X.b(true);
                break;
              case 12:
                this.F.b(2, (float)b.Y0);
                break;
              case 13:
                this.F.c(2, (float)b.Y0, true);
                break;
              case 14:
                this.F.b(2, uob1);
                break;
              case 15:
                this.F.c(2, uob1, true);
                break;
              default:
          }
          this.z.onNext(Integer.valueOf(this.X.c()));
          tW = this.A;
          i1 = this.X.c();
          c0 uoc0 = c0.class;
          if (PatchProxy.isSupport(uoc0)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), null, uoc0, "1");
             if (obj != PatchProxyResult.class) {
                i1 = obj.booleanValue();
             label_018a :
                tW.d(Boolean.valueOf(i1));
                if (!PatchProxy.applyVoid(null, this, uob, "7")) {
                   tW = this.W;
                   if (tW.d != null) {
                      if (tW.b != null) {
                         this.w.k(this.K.getActionType());
                      }
                      if (this.W.a != null) {
                         this.w.m(this.K.getActionType());
                      }
                   }
                }
             }
          }
          obj = ((i1 & 0x03) == 3)? 1: 0;
          if (obj || c0.d(i1)) {
             b1 = 1;
          }
          i1 = b1;
          goto label_018a ;
       }
    label_01c0 :
       return;
    }
    public boolean S6(){
       Object obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c0.d(this.X.c());
    }
    public final PlcStyleChangeType S8(long p0,long p1,double p2,e p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Double.valueOf(p2), p3, this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.p.isVideoType()) {
          return null;
       }else if(p0 && p3.a - p0 >= 0){
          return PlcStyleChangeType.DURATION;
       }else if(p2 - null && (double)((((float)p3.a * 0x3f800000) / (float)p3.b) + (float)this.S) - p2 >= 0){
          return PlcStyleChangeType.PROGRESS;
       }else if(p1 && p1 - (p3.b - p3.a) >= 0){
          return PlcStyleChangeType.COUNTDOWN;
       }else {
          return null;
       }
    }
    public final int V8(f p0,boolean p1){
       int i;
       if (p1) {
          i = (p0.b != null)? 7: 5;
          return i;
       }else if(p0.b != null){
          i = 8;
       }else {
          i = 6;
       }
       return i;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.X8();
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.t5(this.p.mEntity);
    }
    public final void Y8(View p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "13")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(p1);
       }
       return;
    }
    public boolean Z6(){
       return this.R;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       if (this.W.d != null) {
          return;
       }
       if (!this.X8()) {
          this.R8(7);
       }else if(this.X8() && (this.V == null && !e0.a("showSeekbarAtFirst"))){
          this.R8(7);
       }
       return;
    }
    public void j8(){
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       this.r = this.t8("DETAIL_PROCESS_EVENT");
       this.s = this.q8(PlcEntryStyleInfo.class);
       this.t = this.r8("PLC_ENTRY_STATE_CHANGE_OBSERVABLE");
       this.u = this.t8("PLC_SEEK_BAR_PUBLISHER");
       this.v = this.t8("DETAIL_BOTTOM_BAR_CONTROLLER");
       this.w = this.q8(uob0);
       this.x = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.y = this.r8("PLC_DOWNLOAD_CHECK_INTERFACE");
       this.z = this.r8("DETAIL_PLC_STATE_OBSERVER");
       this.A = this.r8("DETAIL_PLC_STATE_GETTER");
       this.B = this.s8(a.class);
       this.C = this.r8("PLC_ENTRY_DOWNLOAD_ACTION_OBSERVER");
       this.D = this.q8(uob0);
       this.E = this.t8("ATLAS_VIEW_PAGER");
       this.U = this.t8("PLC_WEAK_EVENT_BUS");
       this.F = this.q8(j0.class);
       return;
    }
}
