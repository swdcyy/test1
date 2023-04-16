package b99.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.plc.PlcPhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m9a.x;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jf5.j;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarWeakInfo;
import com.kuaishou.android.model.mix.PhotoMeta;
import tkd.b;
import tkd.d;
import u06.g;
import a16.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import ry4.c;
import android.view.View;
import p4a.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import u3a.e;
import brd.t;
import t45.d;
import brd.z;
import b99.r0;
import erd.g;
import crd.b;
import f4a.v;
import androidx.fragment.app.Fragment;
import f4a.b0;
import b99.o0;
import io.reactivex.internal.functions.Functions;
import b99.p0;
import java.lang.Integer;
import ekd.m1;
import android.view.ViewGroup;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import v3a.e;
import b99.s0;
import brd.y;
import f4a.g0;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import p4a.e;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import p4a.o;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import b99.c;
import b99.d;
import b99.f;
import b99.h;
import f4a.i;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import com.yxcorp.gifshow.detail.plc.helper.i;
import java.lang.CharSequence;
import f4a.n;
import f4a.s;
import f4a.j0;
import b99.t0$a;
import im8.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import de5.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import mrd.c;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Set;
import xl8.b;
import m99.f;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;

public class t0 extends PresenterV2	// class@0003bc
{
    public b0 A;
    public PublishSubject B;
    public PublishSubject C;
    public f D;
    public t E;
    public Set F;
    public b G;
    public y H;
    public c I;
    public f J;
    public f K;
    public f L;
    public PhotosViewPager M;
    public FragmentCompositeLifecycleState N;
    public PublishSubject O;
    public a P;
    public ViewGroup Q;
    public PresenterV2 R;
    public ViewGroup S;
    public i T;
    public c U;
    public a V;
    public boolean W;
    public Runnable X;
    public a Y;
    public t Z;
    public PlcPhotoType p;
    public PhotoDetailParam q;
    public PhotoMeta r;
    public a s;
    public PhotoDetailLogger t;
    public c u;
    public PublishSubject v;
    public QPhoto w;
    public BaseFragment x;
    public PublishSubject y;
    public PublishSubject z;

    public void t0(PlcPhotoType p0){
       super();
       this.p = p0;
    }
    public void E8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t0.class, "3")) {
          return;
       }
       t0 tw = this.w;
       Object obj = PatchProxy.applyOneRefs(tw, objArray, x.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(j.a.b(tw.getEntity()) == null){
          PhotoMeta photoMeta = tw.getPhotoMeta();
          if (photoMeta != null) {
             photoMeta = photoMeta.mPlcHighPriorityThanBottomEntry;
          }
       }
       b = true;
       if (b == null) {
          return;
       }else {
          a uoa = d.a(0x565dccdc).aF();
          this.Y = uoa;
          if (uoa != null) {
             uoa.c();
          }
          if (!c.e(1, this.w, this.r.mPlcEntryStyleInfo)) {
             tw = this.Y;
             if (tw != null) {
                tw.e(this.w.getPlcEntryStyleInfo(), 1, 1);
             }
             return;
          }else {
             tw = this.Y;
             if (tw != null) {
                tw.e(this.w.getPlcEntryStyleInfo(), false, false);
             }
             this.P8(this.m8(), R.id.root, 0x7f0a30f6);
             this.P = new a();
             this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new r0(this)));
             if (this.r.mPlcEntryStyleInfo != null) {
                PlcEntryStyleInfo plcEntryStyl = v.b().c(this.w);
                if (plcEntryStyl != null) {
                   this.r.mPlcEntryStyleInfo = plcEntryStyl;
                }
             }
             this.S8(this.r.mPlcEntryStyleInfo);
             if (this.x.isResumed()) {
                this.A.H();
             }else {
                this.X7(this.E.subscribe(new o0(this), Functions.d()));
             }
             this.X7(this.C.subscribe(new p0(this), Functions.e));
             return;
          }
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "21")) {
          return;
       }
       t0 tR = this.R;
       if (tR != null) {
          tR.destroy();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "5")) {
          return;
       }
       this.P = null;
       this.X = null;
       return;
    }
    public final void P8(View p0,int p1,int p2){
       if (PatchProxy.isSupport(t0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, t0.class, "4")) {
          return;
       }
       t0 tp = this.p;
       if (tp == PlcPhotoType.ATLAS) {
          this.Q = m1.f(p0, 0x7f0a3057);
       }else if(tp == PlcPhotoType.LONG_ATLAS){
          this.Q = m1.f(p0, p1);
       }else {
          this.Q = m1.f(p0, p2);
       }
       return;
    }
    public String R8(PlcEntryStyleInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.a(p0, PlcEntryStyleInfo$PageType.COUPLE);
    }
    public final void S8(PlcEntryStyleInfo p0){
       t0 tR;
       FrameLayout$LayoutParams layoutParams;
       t0 ot0 = t0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ot0, "9")) {
          return;
       }
       if (this.W != null) {
          this.X = new s0(this, p0);
          return;
       }else if(p0 != null){
          this.I.onNext(p0);
          Object[] objArray = null;
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, this, ot0, "10")) {
             t0 ot01 = (g0.a(this.w) && !this.w.isLongPhotos())? 1: null;
             this.S = (ot01)? new FrameLayout(this.Q.getContext()): new RelativeLayout(this.Q.getContext());
             this.S.setId(R.id.plc_entry_container);
             tR = this.p;
             int i1 = -2;
             int i2 = -1;
             if (tR == PlcPhotoType.ATLAS) {
                this.Q.addView(this.S, new ViewGroup$LayoutParams(i2, i1));
             }else if(tR == PlcPhotoType.LONG_ATLAS){
                if (ot01 != null && this.Q instanceof FrameLayout) {
                   layoutParams = new FrameLayout$LayoutParams(i2, i1);
                   layoutParams.gravity = 83;
                }else {
                   layoutParams = new RelativeLayout$LayoutParams(i2, i1);
                   layoutParams.addRule(12, i2);
                }
                this.Q.addView(this.S, layoutParams);
             }else {
                this.Q.addView(this.S, new ViewGroup$LayoutParams(i2, i2));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, ot0, "12") && p0.mStyleInfo != null) {
             this.R = new PresenterV2();
             if (p0.isStrongValid()) {
                this.R.U7(new e(p0.mStyleInfo.mStrongStyleTemplateInfo.mStyleType, this.p));
             }
             if (p0.isWeakValid()) {
                this.R.U7(new o(p0.mStyleInfo.mWeakStyleTemplateInfo.mStyleType, this.p));
             }
             b uob = new b();
             this.U = uob;
             this.R.U7(uob);
             tR = this.R;
             String str = "15";
             c uoc = PatchProxy.applyWithListener(objArray, this, ot0, str);
             if (uoc != PatchProxyResult.class) {
             }else {
                t0 tp = this.p;
                if (tp == PlcPhotoType.ATLAS) {
                   uoc = new c();
                   PatchProxy.onMethodExit(ot0, str);
                }else if(tp == PlcPhotoType.LONG_ATLAS){
                   uoc = new d();
                   PatchProxy.onMethodExit(ot0, str);
                }else {
                   uoc = new f();
                   PatchProxy.onMethodExit(ot0, str);
                }
             }
             tR.U7(uoc);
             this.R.f(this.S);
             tR = this.R;
             Object[] objArray1 = new Object[i];
             h oh = PatchProxy.applyOneRefs(p0, this, ot0, "14");
             if (oh != PatchProxyResult.class) {
             }else {
                oh = new h();
                oh.k = p0;
                oh.l = this.A;
                oh.m = this.s;
                oh.n = this.v;
                oh.p = this.t;
                oh.o = this.w;
                oh.q = this.x;
                oh.r = this.y;
                oh.s = this.u;
                oh.j = this.z;
                oh.t = this.C;
                oh.u = this.F;
                oh.v = this.Q;
                oh.w = this.H;
                oh.x = this.G;
                oh.y = this.V;
                n on = PatchProxy.applyOneRefs(p0, this, ot0, "16");
                if (on != PatchProxyResult.class) {
                }else {
                   GameCenterPlugin gameCenterPl = d.a(-1986139969);
                   String str1 = this.R8(p0);
                   PlcEntryStyleInfo obj = PatchProxy.applyOneRefs(p0, this, ot0, "18");
                   String str2 = "";
                   if (obj != PatchProxyResult.class) {
                   }else {
                      obj = PatchProxy.applyOneRefs(p0, objArray, e.class, "3");
                      if (obj != PatchProxyResult.class) {
                      }else {
                         obj = p0.mStyleInfo;
                         obj = (obj != null)? TextUtils.I(obj.mPackageName): str2;
                      }
                   }
                   PlcEntryStyleInfo obj1 = PatchProxy.applyOneRefs(p0, this, ot0, "19");
                   if (obj1 != PatchProxyResult.class) {
                   }else {
                      obj1 = PatchProxy.applyOneRefs(p0, objArray, e.class, "5");
                      if (obj1 != PatchProxyResult.class) {
                      }else {
                         obj1 = p0.mStyleInfo;
                         obj1 = (obj1 != null)? TextUtils.I(obj1.mAppIconUrl): str2;
                      }
                   }
                   GameCenterDownloadParams obj2 = PatchProxy.applyOneRefs(p0, this, ot0, "20");
                   if (obj2 != PatchProxyResult.class) {
                   }else {
                      obj2 = PatchProxy.applyOneRefs(p0, objArray, e.class, "4");
                      if (obj2 != PatchProxyResult.class) {
                      }else {
                         PlcEntryStyleInfo mStyleInfo = p0.mStyleInfo;
                         if (mStyleInfo != null) {
                            str2 = TextUtils.I(mStyleInfo.mAppName);
                         }
                         obj2 = str2;
                      }
                   }
                   obj2 = i.m(str1, obj, obj1, obj2);
                   if (gameCenterPl.isAvailable() && !TextUtils.x(obj2.mDownloadId)) {
                      on = new n(obj2);
                   }else {
                      on = new s();
                   }
                }
                this.T = on;
                oh.i = on;
                oh.z = this.J;
                oh.A = this.K;
                oh.B = this.L;
                oh.C = this.M;
                oh.D = this.P;
                oh.E = new j0(this.S);
                oh.F = this.Y;
                oh.G = this.Z;
             }
             objArray1[0] = oh;
             tR.i(objArray1);
          }
          this.D.set(new t0$a(this, p0));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "2")) {
          return;
       }
       this.P8(p0, R.id.root, 0x7f0a30f6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.q8(PhotoMeta.class);
       this.s = this.q8(a.class);
       this.t = this.r8("DETAIL_LOGGER");
       this.u = this.t8("PLC_SEEK_BAR_PUBLISHER");
       this.v = this.t8("DETAIL_PROCESS_EVENT");
       this.w = this.q8(QPhoto.class);
       this.x = this.r8("DETAIL_FRAGMENT");
       this.y = this.r8("PHOTO_DETAIL_ACTIVITY_FINISH_EVENT");
       this.z = this.t8("DETAIL_BOTTOM_BAR_CONTROLLER");
       this.A = this.q8(b0.class);
       this.B = this.r8("KWAI_SHARE_REQUEST_CONTROLLER");
       this.C = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.D = this.x8("PLC_ENTRY_LOG_INTERFACE");
       this.E = this.r8("FRAGMENT_PAUSE_LOG_EVENT");
       this.F = this.r8("DETAIL_SCROLL_LISTENERS");
       this.G = this.r8("DETAIL_PLC_STATE_GETTER");
       this.H = this.r8("DETAIL_PLC_STATE_OBSERVER");
       this.I = this.r8("PLC_DATA_FETCHED");
       this.J = this.w8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.K = this.w8("DETAIL_HEADER_RECYCLER_VIEW");
       this.L = this.s8(f.class);
       this.M = this.t8("ATLAS_VIEW_PAGER");
       this.N = this.t8("DETAIL_CONTAINER_FRAGMENT_LIFECYCLE");
       this.Z = this.r8("DETAIL_ATLAS_SEEKBAR_POSITION_OBSERVABLE");
       return;
    }
}
