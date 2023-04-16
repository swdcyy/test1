package com.kuaishou.live.playback.play.LivePlaybackFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.playback.play.LivePlaybackFragment$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.i;
import kp.r1;
import ki3.e0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import ki3.l;
import dj3.l;
import dj3.g;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.f;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.multisource.e;
import dj3.h;
import java.util.Objects;
import dj3.p;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import java.util.List;
import jv1.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ui3.n;
import n02.a;
import ec1.i;
import ui3.a;
import ri3.n2;
import com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter;
import ri3.t1;
import ri3.l1;
import ri3.e1;
import ri3.b0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.playback.play.progresspreview.b;
import ri3.k;
import go1.a;
import pi3.a;
import oi3.b;
import ri3.v0;
import ri3.c1;
import ri3.j0;
import bj3.g;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import ri3.d;
import ri3.f;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import ri3.s;
import zi3.a;
import bj3.e;
import ji3.t;
import mi3.h;
import mi3.q;
import ri3.o0;
import li3.d;
import qi3.d;
import ri3.j1;
import ri3.f1;
import ri3.i;
import yi3.d;
import u51.a;
import android.view.View;
import cj3.a;
import cj3.b;
import cj3.f;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.content.res.Configuration;
import com.yxcorp.utility.j;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import android.view.Window;
import ekd.i;
import brd.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackSlidePlayLogger;
import i2b.a;
import ei3.a;
import android.content.SharedPreferences;
import android.util.SparseArray;
import lnc.l1;

public class LivePlaybackFragment extends BaseFragment	// class@000d2d
{
    public LivePlaybackParam j;
    public QPhoto k;
    public e0 l;
    public LivePlaybackPhotoLogger m;
    public PresenterV2 n;
    public l o;
    public j p;
    public a q;
    public static final int r;

    public void LivePlaybackFragment(){
       super();
       this.q = new LivePlaybackFragment$a(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       LivePlaybackFragment obj = PatchProxy.apply(null, this, LivePlaybackFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          return null;
       }
       return obj.buildExpTagTrans();
    }
    public int M(){
       return 1;
    }
    public int getPage(){
       return 0x7656;
    }
    public String getPageParams(){
       QPhoto obj = PatchProxy.apply(null, this, LivePlaybackFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j.mPhoto.mEntity;
       StringBuilder str = "game_id="+i.n(obj)+"&title="+r1.p0(obj)+"&live_stream_id="+i.p(obj)+"&author_id="+r1.U1(obj)+"&author_name="+r1.V1(obj)+"&playback_duration="+r1.L0(obj)+"&from_h5_page="+this.j.mFromH5Page+"&utm_source="+this.j.mFromUtmSource+"&full_photo_id="+this.l.c.getPhotoId();
       LivePlaybackFragment tk = this.k;
       if (tk != null) {
          obj = tk.mEntity;
          if (obj != null) {
             String str1 = i.o(obj);
             if (!TextUtils.x(str1)) {
                str = str+"&highlight_id="+str1;
             }
          }
       }
       return str;
    }
    public String o(){
       return "LIVE_PLAYBACK";
    }
    public void onActivityCreated(Bundle p0){
       boolean b;
       l e;
       g og;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       String str = "2";
       if (!PatchProxy.applyVoid(objArray, this, LivePlaybackFragment.class, "7")) {
          l ol = new l();
          this.o = ol;
          ol.b = this;
          LivePlaybackFragment tk = this.k;
          ol.d = tk;
          ol.c = this.l;
          ol.e = this.m;
          ol = new l(this, tk);
          tk = this.m;
          String str1 = "1";
          if (!PatchProxy.applyVoidOneRefs(tk, ol, l.class, str1)) {
             ol.b = tk;
             e = ol.e;
             if (e != null && !PatchProxy.applyVoid(objArray, e, g.class, str)) {
                e.b.removeOnPreparedListener(e.e);
                e.b.removeOnInfoListener(e.f);
                e.b.e(e.d);
                og = e.g;
                Objects.requireNonNull(og);
                if (!PatchProxy.applyVoid(objArray, og, p.class, str1)) {
                   og.b.O(og.f);
                   og.b.removeOnInfoListener(og.g);
                }
             }
             og = new g(ol.b, ol.d);
             ol.e = og;
             og.c(ol.h);
          }
          this.o.h.add(ol);
          tk = this.o;
          tk.f = ol;
          tk.g = new b(this.getActivity());
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, LivePlaybackFragment.class, "8")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.n = presenterV2;
          presenterV2.U7(new n());
          this.n.U7(new a());
          this.n.U7(new i());
          this.n.U7(new a());
          this.n.U7(new n2());
          this.n.U7(new LivePlaybackQuitPresenter());
          this.n.U7(new t1());
          this.n.U7(new l1());
          this.n.U7(new e1());
          this.n.U7(new b0());
          b.Z(LiveLogTag.LIVE_PLAYBACK_PREVIEW, "enable progress preview");
          this.n.U7(new b());
          this.n.U7(new k());
          this.n.U7(new a());
          this.n.U7(new a());
          this.n.U7(new b());
          this.n.U7(new v0());
          this.n.U7(new c1());
          this.n.U7(new j0());
          String userId = this.l.d.mPhoto.getUserId();
          Object obj = PatchProxy.applyOneRefs(userId, objArray, g.class, str);
          b = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.n(QCurrentUser.me().getId(), userId);
          if (b) {
             this.n.U7(new d());
          }else {
             Object obj1 = PatchProxy.apply(objArray, objArray, f.class, "5");
             boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLivePlaybackReport", 0);
             if (b1) {
                this.n.U7(new f());
             }
          }
          this.n.U7(new s());
          this.n.U7(new a());
          if (!e.b(this.k)) {
             this.n.U7(new t());
             this.n.U7(new h());
             this.n.U7(new q());
          }
          this.n.U7(new o0());
          this.n.U7(new d());
          this.n.U7(new d());
          this.n.U7(new j1());
          this.n.U7(new f1());
          this.n.U7(new i());
          this.n.U7(new d());
          this.n.U7(new a());
          this.n.f(this.getView());
       }
       objArray = new Object[]{this.l,this.j,this.o};
       this.n.i(objArray);
       this.q.i2();
       this.m.startLog().logEnterTime();
       this.o.f.getPlayer().setLooping(0);
       this.k.startSyncWithFragment(this.m());
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       l i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackFragment.class, "10")) {
          return;
       }
       super.onConfigurationChanged(p0);
       Configuration uConfigurati = 2048;
       boolean b = false;
       if (p0.orientation == 2) {
          this.p.a();
          if (l1.a(a.a().a()) && !PatchProxy.applyVoid(null, this, LivePlaybackFragment.class, "14")) {
             this.getActivity().getWindow().clearFlags(uConfigurati);
             this.getActivity().getWindow().addFlags(1024);
          }
       }else {
          this.p.b();
          i.a(this.getActivity(), b, b);
          if (l1.a(a.a().a()) && !PatchProxy.applyVoid(null, this, LivePlaybackFragment.class, "13")) {
             this.getActivity().getWindow().clearFlags(1024);
             this.getActivity().getWindow().addFlags(uConfigurati);
          }
       }
       i = this.o.i;
       if (p0.orientation == 2) {
          b = true;
       }
       i.onNext(Boolean.valueOf(b));
       this.o.j.onNext(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LivePlaybackFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.p = new j(this.getActivity().getWindow());
       LivePlaybackPhotoLogger livePlayback = LivePlaybackPhotoLogger.buildFromParams(this.j);
       this.m = livePlayback;
       livePlayback.logEnterTime();
       LivePlaybackFragment tj = this.j;
       this.m.setFromH5Info(tj.mFromH5Page, tj.mFromUtmSource);
       this.m.setReferUrlPackage(u1.p()).setPhoto(this.k).setPlaybackPhotoParam(this.j).buildUrlPackage(this);
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d0d2c, p1, b);
       if (!PatchProxy.applyVoid(null, this, LivePlaybackFragment.class, "9")) {
          int intx = a.a.getInt("playback_quality", b);
          SparseArray sparseArray = i.u(this.j.mPhoto.mEntity);
          if (sparseArray != null && (sparseArray.indexOfKey(intx) < 0 && sparseArray.size() > 0)) {
             intx = sparseArray.keyAt((sparseArray.size() - 1));
          }
       label_008f :
          i.K(this.j.mPhoto.mEntity, intx);
       }
       return view;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlaybackFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       LivePlaybackFragment tn = this.n;
       if (tn != null) {
          tn.destroy();
       }
       if (this.o != null) {
          if (!PatchProxy.applyVoid(objArray, this, LivePlaybackFragment.class, "15")) {
             l f = this.o.f;
             if (f != null) {
                f.release();
             }
          }
          this.o.f.c(this.getUrl());
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackFragment.class, "5")) {
          return;
       }
       super.onPause();
       if (this.m.hasStartLog()) {
          this.m.enterBackground();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackFragment.class, "4")) {
          return;
       }
       super.onResume();
       if (l1.a()) {
          this.p.a();
       }
       if (this.m.hasStartLog()) {
          this.m.exitBackground();
       }
       return;
    }
}
