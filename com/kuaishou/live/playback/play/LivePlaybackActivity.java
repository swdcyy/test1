package com.kuaishou.live.playback.play.LivePlaybackActivity;
import ej3.c;
import jga.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import wca.b;
import java.lang.Number;
import com.kuaishou.live.playback.play.LivePlaybackFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import kp.r1;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Integer;
import ki3.q0;
import java.util.Locale;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.content.res.Configuration;
import ki3.f;
import java.lang.Boolean;
import brd.y;
import android.os.Bundle;
import ekd.i;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.log.q;
import com.kwai.framework.model.user.QCurrentUser;
import d61.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Long;
import fi3.c;
import fi3.b;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import cjd.e;
import erd.o;
import ki3.c;
import ki3.b;
import erd.g;
import crd.b;
import ki3.d;
import sfc.a;
import java.util.List;
import ki3.e0;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import androidx.lifecycle.MutableLiveData;
import ri3.m2;
import ri3.k2;
import ri3.r0;
import ri3.i0;
import ri3.o2;
import ri3.y1;
import ri3.f2;
import ri3.m0;

public class LivePlaybackActivity extends GifshowActivity implements c, e	// class@000d2a
{
    public LivePlaybackParam A;
    public e0 B;
    public f C;
    public PresenterV2 D;
    public List E;
    public SwipeLayout F;
    public String G;
    public LivePlaybackFragment y;
    public ClientEvent$UrlPackage z;
    public static final int H;

    public void LivePlaybackActivity(){
       super();
    }
    public c G9(){
       LivePlaybackActivity obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj != null) {
          LivePlaybackParam mPhoto = obj.mPhoto;
          if (mPhoto != null) {
             return b.c(mPhoto.mEntity);
          }
       }
       return null;
    }
    public int getPage(){
       LivePlaybackActivity obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj != null) {
          return obj.getPage();
       }
       return 0x7656;
    }
    public String getPageParams(){
       LivePlaybackActivity obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj.getPageParams();
       }
       return "";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       LivePlaybackActivity obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "ks://live_playback";
       if (!this.y3()) {
          return str;
       }
       obj = this.A;
       if (obj != null) {
          LivePlaybackParam mPhoto = obj.mPhoto;
          if (mPhoto != null) {
             Object[] objArray = new Object[]{mPhoto.getUserId(),r1.t1(this.A.mPhoto.mEntity),Integer.valueOf(r1.S1(this.A.mPhoto.mEntity).toInt()),r1.M0(this.A.mPhoto.mEntity)};
             return String.format("ks://live_playback/%s/%s/%s/%s", objArray);
          }
       }
       return str;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String j2(BaseFeed p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackActivity.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, q0.class, "32");
       if (obj != patchProxyRe) {
       }else {
          Object[] objArray = new Object[]{r1.U1(p0),r1.t1(p0),Integer.valueOf(r1.S1(p0).toInt()),r1.M0(p0)};
          obj = String.format(Locale.US, "ks://gamezone/playback/%s/%s/%d/%s", objArray);
       }
       return obj;
    }
    public ClientEvent$UrlPackage k1(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null) {
          this.z = u1.p();
       }
       return this.z;
    }
    public String o(){
       LivePlaybackActivity obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj.o();
       }
       return "LIVE_PLAYBACK";
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackActivity.class, "11")) {
          return;
       }
       super.onConfigurationChanged(p0);
       LivePlaybackActivity tC = this.C;
       if (tC != null) {
          f b = tC.b;
          if (b != null) {
             boolean b1 = (p0.orientation == 2)? true: false;
             b.onNext(Boolean.valueOf(b1));
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       LivePlaybackActivity livePlayback = LivePlaybackActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, livePlayback, "1")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       i.a(this, i, i);
       this.F = w9.a(this);
       this.getWindow().addFlags(128);
       this.setContentView(R.layout.arg_RES_7f0d0d2a);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, livePlayback, "19")) {
          View view = this.findViewById(R.id.status_bar_padding_view);
          view.getLayoutParams().height = n.A(this);
          view.setVisibility(i);
       }
       Uri data = this.getIntent().getData();
       if (data != null && ("liveplaybackdetail").equals(data.getHost())) {
          this.G = x0.a(data, "selecthighlightid");
          this.v3(x0.a(data, "productId"), x0.a(data, "commodityId"), x0.a(data, "exp_tag"), x0.a(data, "serverExpTag"));
       }else if(this.y3()){
          LivePlaybackParam livePlayback1 = b.a(this.getIntent().getExtras().getParcelable("LIVE_PLAYBACK_PHOTO_PARAM"));
          this.A = livePlayback1;
          if (!PatchProxy.applyVoidOneRefs(livePlayback1, objArray, q0.class, "12") && livePlayback1 != null) {
             ClientEvent$ExpTagTrans uExpTagTrans = new ClientEvent$ExpTagTrans();
             uExpTagTrans.serverExpTag = livePlayback1.mPhoto.getServerExpTag();
             uExpTagTrans.clientExpTag = String.valueOf(1);
             q oq = q.m();
             LivePlaybackParam mPhoto = livePlayback1.mPhoto;
             Object[] objArray1 = new Object[2];
             String str = "_";
             String str1 = (livePlayback1.getPreUserId() == null)? str: livePlayback1.getPreUserId();
             objArray1[i] = str1;
             if (livePlayback1.getPrePhotoId() != null) {
                str = livePlayback1.getPrePhotoId();
             }
             objArray1[1] = str;
             oq.k(mPhoto, uExpTagTrans, objArray, String.format("%s/%s", objArray1));
          }
          this.u3(v.f(QCurrentUser.ME.getId(), 0), this.A.mPhoto.getLiveStreamIdStr(), this.A.mPhoto);
       }else {
          this.finish();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       LivePlaybackActivity tD = this.D;
       if (tD != null) {
          tD.destroy();
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackActivity.class, "20")) {
          return;
       }
       p0.clear();
       return;
    }
    public final void u3(long p0,String p1,QPhoto p2){
       if (PatchProxy.isSupport(LivePlaybackActivity.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, LivePlaybackActivity.class, "4")) {
          return;
       }
       b.b().a(p0, p1).compose(this.E2(ActivityEvent.DESTROY)).map(new e()).subscribe(new c(this, p2), new b(this, p2));
       return;
    }
    public final void v3(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LivePlaybackActivity.class, "3")) {
          return;
       }
       b.b().f(p0).compose(this.E2(ActivityEvent.DESTROY)).map(new e()).subscribe(new d(this, p1, p2, p3), new a());
       return;
    }
    public SwipeLayout w3(){
       return this.F;
    }
    public final void x3(QPhoto p0,List p1,int p2){
       LivePlaybackActivity livePlayback = LivePlaybackActivity.class;
       if (PatchProxy.isSupport(livePlayback) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LivePlaybackActivity.class, "6")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, livePlayback, "7")) {
          this.C = new f();
       }
       if (!PatchProxy.applyVoid(objArray, this, livePlayback, "8")) {
          e0 uoe0 = new e0();
          this.B = uoe0;
          uoe0.b = this.E;
          LivePlaybackActivity tA = this.A;
          uoe0.c = tA.mPhoto;
          uoe0.d = tA;
       }
       if (q.f(p1)) {
          this.E = new ArrayList();
          this.B.g.setValue(Boolean.FALSE);
       }else {
          this.E = p1;
          this.B.g.setValue(Boolean.TRUE);
       }
       this.E.add(0, p0);
       p0.b = this.E;
       if (!PatchProxy.applyVoid(objArray, this, livePlayback, "9")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.D = presenterV2;
          presenterV2.U7(new m2());
          this.D.U7(new k2());
          this.D.U7(new r0());
          this.D.U7(new i0());
          this.D.U7(new o2());
          this.D.U7(new y1());
          this.D.U7(new f2());
          this.D.U7(new m0());
          this.D.f(this.findViewById(R.id.play_back_root));
          Object[] objArray1 = new Object[]{this.B,this.A,this.C};
          this.D.i(objArray1);
       }
       this.B.f.setValue(Integer.valueOf(p2));
       return;
    }
    public final boolean y3(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getIntent() != null && (this.getIntent().getExtras() != null && this.getIntent().getExtras().getParcelable("LIVE_PLAYBACK_PHOTO_PARAM") != null))? true: false;
       return b;
    }
}
