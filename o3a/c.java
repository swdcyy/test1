package o3a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o3a.c$a;
import nsd.u;
import o3a.c$c;
import o3a.c$b;
import m3a.t;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import uw9.o;
import java.lang.StringBuilder;
import m3a.a;
import m3a.s;
import q87.c;
import k2b.e0;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.rx.RxBus;
import rd5.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import o3a.c$d;
import erd.g;
import crd.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import mx6.c;
import tx6.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import android.view.View;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import mx6.a;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession;
import m3a.r;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e1a.p;
import v5a.a;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import java.lang.Throwable;
import msd.l;
import rx6.b;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.lang.System;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import xx6.f;
import wd5.l;
import wd5.b;
import n3a.a;
import xx6.f$b;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Boolean;
import android.app.Activity;
import android.app.PictureInPictureParams$Builder;
import android.util.Rational;
import m3a.c;
import android.app.PictureInPictureParams;
import gi5.d;
import wx6.d;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment;
import m3a.o;

public final class c extends PresenterV2	// class@00327c
{
    public KwaiPlayerKitView p;
    public ConstraintLayout q;
    public t r;
    public SmallWindowFragment s;
    public o t;
    public s u;
    public SmallWindowPlaySession v;
    public int w;
    public String x;
    public final c$c y;
    public final c$b z;
    public static final c$a A;

    static {
       c.A = new c$a(null);
    }
    public void c(){
       super();
       this.x = "";
       this.y = new c$c(this);
       this.z = new c$b(this);
    }
    public static final t P8(c p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPlayController");
       }
       return p0;
    }
    public static void W8(c p0,QPhoto p1,int p2,Integer p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 2;
       }
       p3 = (p4 & 0x04)? Integer.valueOf(2): null;
       p0.V8(p1, p2, p3);
       return;
    }
    public void E8(){
       a c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "4")) {
          return;
       }
       c tr = this.r;
       String str = "mPlayController";
       if (tr == null) {
          a.S(str);
       }
       c tz = this.z;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(tz, tr, t.class, "2")) {
          a.p(tz, "l");
          tr.c.add(tz);
       }
       o oo = o.C();
       StringBuilder str1 = "onBind: ";
       c tu = this.u;
       String str2 = "mSmallWindowParam";
       if (tu == null) {
          a.S(str2);
       }
       Object[] objArray1 = new Object[0];
       oo.w("SmallWindowPlayPresenter", str1+tu.a().a(), objArray1);
       tr = this.u;
       if (tr == null) {
          a.S(str2);
       }
       this.w = tr.b().getPage();
       tr = this.u;
       if (tr == null) {
          a.S(str2);
       }
       String str3 = tr.b().o();
       a.o(str3, "mSmallWindowParam.mLogPage.page2");
       this.x = str3;
       tr = this.u;
       if (tr == null) {
          a.S(str2);
       }
       if (tr.a().a()) {
          objArray = Integer.valueOf(2);
       }
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       this.V8(tr.a(), 1, objArray);
       tr = this.u;
       if (tr == null) {
          a.S(str2);
       }
       c = tr.a().c;
       if (c != null) {
          Object[] objArray2 = new Object[0];
          o.C().w("SmallWindowPlayPresenter", "get cover from featured", objArray2);
          PlayerKitContentFrame playerKitCon = this.R8();
          if (playerKitCon != null) {
             playerKitCon.I(c);
          }
       }
       PlayerKitContentFrame playerKitCon1 = this.R8();
       if (playerKitCon1 != null) {
          playerKitCon1.setEnableUseCoverWhenPause(0);
       }
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       QPhoto qPhoto = tr.a();
       if (qPhoto != null) {
          qPhoto.setIsBackgroundPlayPhoto(0);
       }
       this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new c$d(this)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mKwaiPlayerKitView");
       }
       tp.release();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mKwaiPlayerKitView");
       }
       a uoa = tp.getPlayerKitContext().d(c.class);
       if (uoa != null) {
          uoa.c(this.y);
       }
       tp = this.r;
       if (tp == null) {
          a.S("mPlayController");
       }
       c tz = this.z;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidOneRefs(tz, tp, t.class, "3")) {
          a.p(tz, "l");
          tp.c.remove(tz);
       }
       return;
    }
    public final PlayerKitContentFrame R8(){
       c obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mKwaiPlayerKitView");
       }
       DefaultFrameUiModule uDefaultFram = obj.getPlayerKitContext().i(DefaultFrameUiModule.class);
       View view = (uDefaultFram != null)? uDefaultFram.k(): null;
       if (view instanceof PlayerKitContentFrame) {
          return view;
       }else {
          return null;
       }
    }
    public final IWaynePlayer S8(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mKwaiPlayerKitView");
       }
       a uoa = obj.getPlayerKitContext().e(a.class);
       if (uoa != null) {
          objArray = uoa.getPlayer();
       }
       return objArray;
    }
    public final void V8(QPhoto p0,int p1,Integer p2){
       Object[] this;
       SmallWindowPlaySession c;
       QPhotoPlayerKitDataSource qPhotoPlayer;
       c uoc = this;
       SmallWindowPlaySession smallWindowP = SmallWindowPlaySession.class;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "6")) {
          return;
       }
       o oo = o.C();
       String str = "playPhoto: ";
       Object[] objArray = null;
       String str1 = (p0 != null)? r.a(p0): objArray;
       int i = 0;
       this = new Object[i];
       oo.w("SmallWindowPlayPresenter", str+str1, this);
       c v = uoc.v;
       str = "SmallWindowPlaySession";
       if (v != null && !PatchProxy.applyVoid(objArray, v, smallWindowP, "2")) {
          Log.g(str, "release: "+r.a(v.c));
          v.d.reset();
       }
       if (p0 != null) {
          c s = uoc.s;
          if (s == null) {
             a.S("mSmallWindowFragment");
          }
          c p = uoc.p;
          String str2 = "mKwaiPlayerKitView";
          if (p == null) {
             a.S(str2);
          }
          c w = uoc.w;
          c x = uoc.x;
          c u = uoc.u;
          if (u == null) {
             a.S("mSmallWindowParam");
          }
          SmallWindowPlaySession smallWindowP1 = smallWindowP;
          SmallWindowPlaySession smallWindowP2 = new SmallWindowPlaySession(s, p0, p, p2, w, x, u.e, p1);
          u = uoc.p;
          if (u == null) {
             a.S(str2);
          }
          a uoa = u.getPlayerKitContext().d(c.class);
          if (uoa != null) {
             uoa.d(uoc.y);
          }
          if (!PatchProxy.applyVoid(objArray, v4, smallWindowP1, "1")) {
             try{
                c = v4.c;
                qPhotoPlayer = QPhotoPlayerKitDataSource.g(v4.a(c, p.c(c, v4.i), 0, v4.e));
             }catch(com.kwai.components.playerkit.QPhotoPlayerKitDataSource$IllegalDataSourceException e0){
                Log.e(str, "", e0);
                qPhotoPlayer = objArray;
             }
             if (qPhotoPlayer != null) {
                a uoa1 = qPhotoPlayer.j();
                a.o(uoa1, "qPhotoPlayerKitDataSource.buildData");
                v4.d.g(qPhotoPlayer, uoa1.a());
                Object[] objArray1 = PatchProxy.apply(objArray, v4, smallWindowP1, "4");
                if (objArray1 != PatchProxyResult.class) {
                }else {
                   uoa = v4.d.getPlayerKitContext().e(a.class);
                   if (uoa != null) {
                      objArray = uoa.getPlayer();
                   }
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   objArray1.setLooping(i);
                }
                v4.a.setEnterTime(System.currentTimeMillis());
                f uof = v4.d.getPlayerKitContext().h();
                if (uof != null) {
                   v4.a.bindDataSaver(new l(uof));
                }
                uof = v4.d.getPlayerKitContext().h();
                if (uof != null) {
                   uof.l(new a(v4));
                }
             }
          }
          uoc.v = v4;
          uoa = new a();
          c q = uoc.q;
          if (q == null) {
             a.S("mFrameLayout");
          }
          uoa.i(q);
          if (((float)p0.getHeight() / (float)p0.getWidth()) - 0x3fe38e39 > 0) {
             uoa.J(R.id.kwai_player_kit_view, "w,"+p0.getWidth()+':'+p0.getHeight());
          }else {
             uoa.J(R.id.kwai_player_kit_view, "h,"+p0.getWidth()+':'+p0.getHeight());
          }
          q = uoc.q;
          if (q == null) {
             a.S("mFrameLayout");
          }
          uoa.b(q);
       }
       return;
    }
    public final void X8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("SmallWindowPlayPresenter", "updateActions: "+p0, objArray);
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          activity.setPictureInPictureParams(new PictureInPictureParams$Builder().setAspectRatio(new Rational(1080, 1920)).setActions(c.a.b(activity, p0)).build());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.kwai_player_kit_view);
       a.o(view, "rootView.findViewById\(R.id.kwai_player_kit_view\)");
       this.p = view;
       p0 = p0.findViewById(R.id.texture_view_frame);
       a.o(p0, "rootView.findViewById\(R.id.texture_view_frame\)");
       this.q = p0;
       c tp = this.p;
       if (tp == null) {
          a.S("mKwaiPlayerKitView");
       }
       tp.c();
       tp.setSessionKeyGenerator(new d());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.r8("play_controller");
       a.o(obj, "inject\(SmallWindowAccessIds.PLAY_CONTROLLER\)");
       this.r = obj;
       obj = this.q8(SmallWindowFragment.class);
       a.o(obj, "inject\(SmallWindowFragment::class.java\)");
       this.s = obj;
       obj = this.r8("small_window_dismiss_listener");
       a.o(obj, "inject\(SmallWindowAccess¡­_WINDOW_DISMISS_LISTENER\)");
       this.t = obj;
       obj = this.r8("small_window_param");
       a.o(obj, "inject\(SmallWindowAccessIds.SMALL_WINDOW_PARAM\)");
       this.u = obj;
       return;
    }
}
