package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import xjd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.os.Handler;
import android.os.Looper;
import crd.a;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import rf5.u;
import java.util.Map;
import java.lang.Object;
import trd.t0;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import d5a.s;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;
import android.os.SystemClock;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import vy6.a;
import xjd.a$a;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import d5a.p;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import cm5.e;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$c;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$d;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$e;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$g;
import io.reactivex.internal.functions.Functions;
import gz9.a;
import xl8.b;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$f;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$h;
import cm5.f;
import f5a.b;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import gm5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import bm5.a;
import tl5.b;
import bm5.b;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kwai.video.player.IKwaiMediaPlayer;
import androidx.fragment.app.FragmentActivity;
import sz9.w;
import sz9.w$b;
import rkd.b;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uc6.c;
import sd5.d;
import hn5.c;
import kn5.c;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import ro5.a;
import androidx.fragment.app.e;
import e5a.a;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.SerialOpLandscapeEntrance;
import fm5.a;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.framework.model.feed.BaseFeed;
import ul5.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import n8a.a;
import w85.a;
import io.reactivex.subjects.PublishSubject;
import ge5.d;
import java.lang.Number;
import brd.y;

public final class LandscapeEntranceVMPresenter extends PresenterV2 implements a	// class@0016e8
{
    public MilanoContainerEventBus A;
    public f B;
    public BaseFragment C;
    public PublishSubject D;
    public PublishSubject E;
    public PublishSubject F;
    public u G;
    public b H;
    public f I;
    public d J;
    public SwipeLayout K;
    public Handler L;
    public Runnable M;
    public d N;
    public boolean O;
    public boolean P;
    public a Q;
    public boolean R;
    public b S;
    public SlidePlayViewModel T;
    public a U;
    public t U0;
    public h V;
    public t V0;
    public boolean W;
    public final LandscapeEntranceVMPresenter$b W0;
    public long X;
    public a Y;
    public y Z;
    public int p;
    public f q;
    public f r;
    public a s;
    public QPhoto t;
    public a u;
    public PhotoDetailParam v;
    public NasaBizParam w;
    public a x;
    public PublishSubject y;
    public f z;
    public static final p X0;
    public static boolean Y0;
    public static final LandscapeEntranceVMPresenter$a Z0;

    static {
       LandscapeEntranceVMPresenter.Z0 = new LandscapeEntranceVMPresenter$a(null);
       LandscapeEntranceVMPresenter.X0 = s.c(LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2.INSTANCE);
    }
    public void LandscapeEntranceVMPresenter(){
       super();
       this.p = -1;
       this.L = new Handler(Looper.getMainLooper());
       this.U = new a();
       this.W0 = new LandscapeEntranceVMPresenter$b(this);
    }
    public static final BaseFragment P8(LandscapeEntranceVMPresenter p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final QPhoto R8(LandscapeEntranceVMPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final u S8(LandscapeEntranceVMPresenter p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public static void c9(LandscapeEntranceVMPresenter p0,String p1,boolean p2,long p3,String p4,String p5,int p6,Map p7,int p8,Object p9){
       Map$Entry uEntry;
       LandscapeEntranceVMPresenter obj = p0;
       object oobject = p1;
       object oobject1 = p4;
       String str = (p8 & 0x10)? "": p5;
       Map map = (p8 & 0x40)? t0.z(): p7;
       Objects.requireNonNull(p0);
       LandscapeEntranceVMPresenter landscapeEnt = LandscapeEntranceVMPresenter.class;
       if (PatchProxy.isSupport(landscapeEnt)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p2),Long.valueOf(p3),oobject1,str,Integer.valueOf(p6),map};
          if (!PatchProxy.applyVoid(objArray, obj, landscapeEnt, "6")) {
          label_0053 :
             LandscapeEntranceVMPresenter$a z0 = LandscapeEntranceVMPresenter.Z0;
             Objects.requireNonNull(z0);
             Boolean uBoolean = PatchProxy.apply(null, z0, LandscapeEntranceVMPresenter$a.class, "1");
             if (uBoolean == PatchProxyResult.class) {
                uBoolean = LandscapeEntranceVMPresenter.X0.getValue();
             }
             if (uBoolean.booleanValue()) {
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                linkedHashMa.put("callBackName", oobject);
                linkedHashMa.put("event", oobject1);
                linkedHashMa.put("expData", str);
                linkedHashMa.put("enablePreload", "true");
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   str = uEntry.getKey();
                   linkedHashMa.put(str, uEntry.getValue());
                }
                Map a = s.a;
                a.o(a, "LandscapePluginHelper.getLogParameter\(\)");
                iterator = a.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   str = uEntry.getKey();
                   String value = uEntry.getValue();
                   a.o(str, "key");
                   a.o(value, "value");
                   linkedHashMa.put(str, value);
                }
                CoronaMonitorUtils$a c = CoronaMonitorUtils.c;
                long l = SystemClock.elapsedRealtime();
                obj = obj.C;
                if (obj == null) {
                   a.S("mFragment");
                }
                c.e("landscape", p2, p3, l, p6, obj.getClass().getSimpleName(), PluginDownloadExtension.k.e("landscape"), linkedHashMa);
             }
          }
       }else {
          goto label_0053 ;
       }
       return;
    }
    public void E8(){
       LandscapeEntranceVMPresenter landscapeEnt = LandscapeEntranceVMPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, landscapeEnt, "4")) {
          return;
       }
       LandscapeEntranceVMPresenter tC = this.C;
       String str = "mFragment";
       if (tC == null) {
          a.S(str);
       }
       this.T = SlidePlayViewModel.B0(tC.getParentFragment());
       tC = this.A;
       MilanoContainerEventBus n = (tC != null)? tC.n: objArray;
       this.H = n;
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       LandscapeEntranceVMPresenter tT = this.T;
       LandscapeEntranceVMPresenter tW0 = this.W0;
       if (!PatchProxy.applyVoidThreeRefs(tC, tT, tW0, this, LandscapeEntranceVMPresenter.class, "30")) {
          a.p(tC, "fragment");
          a.p(tW0, "listener");
          a$a.a(this, tC, tT, tW0);
       }
       tC = this.t;
       str = "mPhoto";
       if (tC == null) {
          a.S(str);
       }
       if (!LandscapeUtil.a(tC)) {
          return;
       }else if(this.W8()){
          if (!PatchProxy.applyVoid(objArray, this, landscapeEnt, "5")) {
             if (!LandscapeEntranceVMPresenter.Y0 && !s.a()) {
                LandscapeEntranceVMPresenter.Y0 = true;
                long l = SystemClock.elapsedRealtime();
                s.b("preLoadStartTime", String.valueOf(l));
                c.k(new p(this, l));
             }else {
                Activity activity = this.getActivity();
                if (activity instanceof GifshowActivity) {
                   objArray = activity;
                }
                if (objArray != null) {
                   e uoe = d.a(-2032246691);
                   tC = this.t;
                   if (tC == null) {
                      a.S(str);
                   }
                   uoe.Q9(objArray, tC);
                }
             }
          }
          landscapeEnt = this.V0;
          if (landscapeEnt != null) {
             this.X7(landscapeEnt.subscribe(new LandscapeEntranceVMPresenter$c(this)));
          }
       }
       landscapeEnt = this.U0;
       if (landscapeEnt != null) {
          this.X7(landscapeEnt.subscribe(new LandscapeEntranceVMPresenter$d(this)));
       }
       landscapeEnt = this.F;
       if (landscapeEnt != null) {
          this.X7(landscapeEnt.subscribe(new LandscapeEntranceVMPresenter$e(this)));
       }
       landscapeEnt = this.s;
       if (landscapeEnt == null) {
          a.S("mPayCourseEventCombination");
       }
       g e = Functions.e;
       a.o(e, "Functions.ERROR_CONSUMER");
       this.X7(landscapeEnt.b(new LandscapeEntranceVMPresenter$g(this), e));
       landscapeEnt = this.H;
       if (landscapeEnt != null) {
          this.X7(landscapeEnt.b().subscribe(new LandscapeEntranceVMPresenter$f(this), LandscapeEntranceVMPresenter$h.b));
       }
       return;
    }
    public boolean G(){
       return false;
    }
    public void J7(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LandscapeEntranceVMPresenter.class, "31")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.b(this, p0, p1, p2);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LandscapeEntranceVMPresenter.class, "9")) {
          return;
       }
       LandscapeEntranceVMPresenter tM = this.M;
       if (tM != null) {
          this.L.removeCallbacks(tM);
       }
       tM = this.C;
       if (tM == null) {
          a.S("mFragment");
       }
       LandscapeEntranceVMPresenter tT = this.T;
       LandscapeEntranceVMPresenter tW0 = this.W0;
       if (!PatchProxy.applyVoidThreeRefs(tM, tT, tW0, this, LandscapeEntranceVMPresenter.class, "31")) {
          a.p(tM, "fragment");
          a.p(tW0, "listener");
          a$a.b(this, tM, tT, tW0);
       }
       if (s.a()) {
          d.a(0xec566ed).XW();
       }
       return;
    }
    public final void V8(b p0){
       LandscapeEntranceVMPresenter tt;
       RxBus f;
       boolean b;
       e player;
       IKwaiMediaPlayer iKwaiMediaPl;
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeEntranceVMPresenter.class, "23")) {
          return;
       }
       String str = "mPhoto";
       if (p0.e == null && !p0.b()) {
          a uoa = a.d();
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          PlayEvent$Status rESUME = (p0.d())? PlayEvent$Status.RESUME: PlayEvent$Status.PAUSE;
          uoa.k(new PlayEvent(tt, rESUME, p0.b, "LandscapeShareState"));
       }
       LandscapeEntranceVMPresenter tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       if (b.t(tt1)) {
          f = RxBus.f;
          b = p0.b();
          b h = p0.h;
          LandscapeEntranceVMPresenter tt2 = this.t;
          if (tt2 == null) {
             a.S(str);
          }
          f.b(new a(b, h, tt2));
       }
       tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       if (b.e(tt1)) {
          f = RxBus.f;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          f.b(new b(tt, p0.i));
       }
       if (!p0.d()) {
          tt1 = this.u;
          if (tt1 == null) {
             a.S("mPlayModule");
          }
          player = tt1.getPlayer();
          if (player != null) {
             LandscapeEntranceVMPresenter tu = this.u;
             if (tu == null) {
                a.S("mPlayModule");
             }
             e player1 = tu.getPlayer();
             long currentPosit = (player1 != null)? player1.getCurrentPosition(): 0;
             player.seekTo(currentPosit);
          }
       }
       tt1 = this.C;
       String str1 = "mFragment";
       if (tt1 == null) {
          a.S(str1);
       }
       if (tt1 instanceof SlidePlayFragment) {
          tt1 = this.C;
          if (tt1 == null) {
             a.S(str1);
          }
          if (tt1 != null) {
             tt1.q = p0.a().logExtraName;
          }
       }else {
          tt1 = this.C;
          if (tt1 == null) {
             a.S(str1);
          }
          if (tt1 instanceof GrootBaseFragment) {
             tt1 = this.C;
             if (tt1 == null) {
                a.S(str1);
             }
             if (tt1 != null) {
                tt1.u = p0.a().logExtraName;
             }
          }
       }
    label_00e8 :
       tt1 = this.u;
       if (tt1 == null) {
          a.S("mPlayModule");
       }
       player = tt1.getPlayer();
       if (player != null) {
          iKwaiMediaPl = player.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             iKwaiMediaPl.setSpeed(p0.c());
          }
       }
       Activity activity = this.getActivity();
       if (!activity instanceof FragmentActivity) {
          activity = null;
       }
       if (activity != null) {
          w.i.a(activity).updateSpeed(p0.c());
       }
       tt1 = this.u;
       if (tt1 == null) {
          a.S("mPlayModule");
       }
       player = tt1.getPlayer();
       if (player != null) {
          iKwaiMediaPl = player.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             iKwaiMediaPl.setAPJoySoundSwitchStatus(p0.f);
          }
       }
       return;
    }
    public final boolean W8(){
       NasaSlideParam nasaSlidePar;
       Object[] objArray = null;
       LandscapeEntranceVMPresenter obj = PatchProxy.apply(objArray, this, LandscapeEntranceVMPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.g()) {
          return false;
       }
       obj = this.w;
       if (obj != null) {
          nasaSlidePar = obj.getNasaSlideParam();
          if (nasaSlidePar != null) {
             objArray = nasaSlidePar.mSourcePage;
          }
       }
       obj = this.w;
       if (obj != null) {
          nasaSlidePar = obj.getNasaSlideParam();
          if (nasaSlidePar != null && (!nasaSlidePar.isHomeFeatureStyle() && (!LandscapeUtil.b() && (a.g("profile", objArray) ^ 1)))) {
             obj = this.w;
             if (obj != null) {
                nasaSlidePar = obj.getNasaSlideParam();
                if (nasaSlidePar != null && nasaSlidePar.mIsPayCourseDetail == null) {
                label_007b :
                   return false;
                }
             }
          }
       }
       obj = this.w;
       if (obj != null) {
          nasaSlidePar = obj.getNasaSlideParam();
          if (nasaSlidePar != null && nasaSlidePar.mIsMusicRadio == 1) {
          }
       }
       if (!VisitorModeManager.f()) {
          obj = this.t;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (!LandscapeUtil.d(obj)) {
             goto label_007b ;
          }else {
             return 1;
          }
       }else {
          goto label_007b ;
       }
    }
    public final boolean X8(){
       LandscapeEntranceVMPresenter obj = PatchProxy.apply(null, this, LandscapeEntranceVMPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mPhotoDetailParam");
       }
       return obj.getDetailPlayConfig().usePlayerKitPlayer();
    }
    public final c Y8(){
       Object[] objArray = null;
       LandscapeEntranceVMPresenter obj = PatchProxy.apply(objArray, this, LandscapeEntranceVMPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj != null) {
          objArray = obj.N();
       }
       return objArray;
    }
    public final void Z8(boolean p0){
       LandscapeEntranceVMPresenter landscapeEnt = LandscapeEntranceVMPresenter.class;
       if (PatchProxy.isSupport(landscapeEnt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, landscapeEnt, "24")) {
          return;
       }
       Activity activity = this.getActivity();
       Fragment uFragment = null;
       if (!activity instanceof GifshowActivity) {
          activity = uFragment;
       }
       if (activity != null) {
          if (v2 = activity instanceof c) {
             if (!PatchProxy.isSupport(landscapeEnt) || !PatchProxy.applyVoidTwoRefs(activity, Boolean.valueOf(p0), this, landscapeEnt, "25")) {
                c uoc = activity.I();
                if (uoc instanceof Fragment) {
                   uFragment = uoc;
                }
                if (uFragment != null) {
                   uoc = activity.getSupportFragmentManager();
                   a.o(uoc, "\(activity as GifshowActi¡­y\).supportFragmentManager");
                   this.a9(uoc, uFragment, p0);
                }
             }
          }else if(!activity instanceof PhotoDetailActivity || (PatchProxy.isSupport(landscapeEnt) && PatchProxy.applyVoidTwoRefs(activity, Boolean.valueOf(p0), this, landscapeEnt, "26"))){
             PhotoDetailActivity e = activity.E;
             if (e != null) {
                c supportFragm = activity.getSupportFragmentManager();
                a.o(supportFragm, "activity.supportFragmentManager");
                this.a9(supportFragm, e, p0);
             }
          }
          landscapeEnt = this.T;
          if (landscapeEnt != null) {
             landscapeEnt.d((p0 ^ 0x01), 11);
          }
          landscapeEnt = this.v;
          if (landscapeEnt == null) {
             a.S("mPhotoDetailParam");
          }
          if (landscapeEnt.isThanos() && v2) {
             landscapeEnt = this.C;
             if (landscapeEnt == null) {
                a.S("mFragment");
             }
             a.o(landscapeEnt, (p0 ^ 0x01), 12);
          }
       }
    label_00ae :
       return;
    }
    public final void a9(c p0,Fragment p1,boolean p2){
       if (PatchProxy.isSupport(LandscapeEntranceVMPresenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LandscapeEntranceVMPresenter.class, "27")) {
          return;
       }
       e uoe = p0.beginTransaction();
       a.o(uoe, "fragmentManager.beginTransaction\(\)");
       if (p2) {
          uoe.s(p1).m();
       }else {
          uoe.E(p1).o();
       }
       return;
    }
    public final boolean b9(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LandscapeEntranceVMPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.c != null && p0.d == SerialOpLandscapeEntrance.COLLECTION_DETAIL_PAGE) {
          LandscapeEntranceVMPresenter tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          if (a.A(tt)) {
             b = true;
          }
       }
    label_0031 :
       return b;
    }
    public final void d9(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeEntranceVMPresenter.class, "22")) {
          return;
       }
       if (p0 != null) {
          LandscapeEntranceVMPresenter tB = this.B;
          if (tB == null) {
             a.S("mPhotoDetailLogger");
          }
          PhotoDetailLogger photoDetailL = tB.get();
          if (photoDetailL != null) {
             String str = c.p(p0.mEntity);
             if (!TextUtils.x(str)) {
                if (str == null) {
                   str = "";
                }
                photoDetailL.putBizParam("start_play_pos", str);
             }
          }
       }
    label_0034 :
       return;
    }
    public void doBindView(View p0){
       d uod;
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeEntranceVMPresenter.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       ViewGroup viewGroup = m1.f(p0, R.id.texture_view_frame);
       if (viewGroup != null) {
          uod = c.a(viewGroup);
          this.W7(uod);
       }else {
          uod = null;
       }
       this.N = uod;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LandscapeEntranceVMPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.u = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.v = obj;
       this.Q = this.t8("SERIAL_EPISODE_SHARE_DATA");
       this.w = this.s8(NasaBizParam.class);
       this.x = this.s8(a.class);
       obj = this.x8("disableLandscapeClick");
       a.o(obj, "injectRef\(DetailAccessIds.DISABLE_LANDSCAPE_CLICK\)");
       this.z = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.B = obj;
       Object obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.C = obj1;
       obj1 = this.r8("DETAIL_POSTER_EVENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_POSTER_EVENT\)");
       this.D = obj1;
       this.F = this.t8("LANDSCAPE_ENTRANCE_CLICK_OBSERVER");
       this.E = this.t8("LANDSCAPE_EXIT_OBSERVER");
       this.I = this.w8("SLIDE_PLAY_REQUEST_CLEAR_SCREEN_PHOTO");
       this.J = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       obj1 = this.r8("DETAIL_FEED_POSITION");
       a.o(obj1, "inject\(AccessIds.DETAIL_FEED_POSITION\)");
       this.p = obj1.intValue();
       obj = this.x8("AGGREGATE_ACTIVITY_OPACITY_HAS_CHANGED");
       a.o(obj, "injectRef\(AccessIds.AGGR¡­VITY_OPACITY_HAS_CHANGED\)");
       this.q = obj;
       obj = this.x8("LANDSCAPE_CHANGE_PHOTO");
       a.o(obj, "injectRef\(AccessIds.LANDSCAPE_CHANGE_PHOTO\)");
       this.r = obj;
       obj1 = this.q8(a.class);
       a.o(obj1, "inject\(PayCourseEventCombination::class.java\)");
       this.s = obj1;
       this.A = this.s8(MilanoContainerEventBus.class);
       this.y = this.t8("LAND_SCAPE_PLC_CLICK");
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.G = obj1;
       this.Z = this.r8("LANDSCAPE_CENTER_ENTRANCE_SHOW_OBSERVER");
       this.U0 = this.r8("LANDSCAPE_CENTER_ENTRANCE_CLICK_OBSERVABLE");
       this.V0 = this.r8("LANDSCAPE_CENTER_ENTRANCE_BIND_OBSERVABLE");
       return;
    }
    public void s5(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LandscapeEntranceVMPresenter.class, "30")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.a(this, p0, p1, p2);
       return;
    }
}
