package com.kuaishou.live.core.show.pk.a;
import im8.g;
import k51.c;
import hd2.b;
import hd2.c;
import hd2.d;
import hd2.a;
import com.kuaishou.live.core.show.pk.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p51.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import android.view.View;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import p51.d;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.video.waynelive.listeners.LivePlayerKwaivppListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import org.json.JSONObject;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import s82.r0;
import hd2.l0;
import ic3.a$a;
import ic3.a;
import java.util.Objects;
import java.util.Set;
import java.lang.Boolean;
import java.lang.Integer;
import android.os.Build$VERSION;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.live.log.LiveLogTag;
import org.json.JSONException;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Float;
import ekd.m1;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kuaishou.live.core.show.pk.c;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.pk.a$b;
import mw1.c;
import rs1.b;

public class a extends c implements g	// class@000d78
{
    public b A;
    public final r0 B;
    public final a$a C;
    public a$b p;
    public a0 q;
    public c r;
    public LivePlayerController s;
    public c t;
    public final b u;
    public final LivePlayerKwaivppListener v;
    public int w;
    public LivePlayTextureView x;
    public View y;
    public LiveBizParam z;
    public static String sLivePresenterClassName = "LiveAudiencePlayViewCropPresenter";

    public void a(){
       super();
       this.p = new b(this);
       this.u = new c(this);
       this.v = new d(this);
       this.B = new a(this);
       this.C = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       c uoc = PatchProxy.apply(objArray, this, uoa, "13");
       if (uoc != PatchProxyResult.class) {
       }else if(this.getActivity() != null){
          uoc = c.d(this.getActivity(), this.x, this.y, this.q.r);
       }else {
          uoc = objArray;
       }
       this.t = uoc;
       this.w = d.a(this.q.c.isGRPRCustomizedLive()) + e.k(this.getActivity(), this.z.mIsStatusBarSolid);
       this.s.addKwaivppListener(this.v);
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.q.N().u5(this.u, uoaArray);
       if (this.R8() && !this.P8()) {
          this.S8(0x186ac, objArray);
       }
       b.a(0x432c5e03).a(this.B);
       if (l0.a()) {
          uoa = this.A;
          if (uoa != null) {
             uoa.I8(this.C);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.s.removeKwaivppListener(this.v);
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.q.N().G5(this.u, uoaArray);
       LiveFloatingWindowManager liveFloating = b.a(0x432c5e03);
       a tB = this.B;
       Objects.requireNonNull(liveFloating);
       if (!PatchProxy.applyVoidOneRefs(tB, liveFloating, LiveFloatingWindowManager.class, "15")) {
          liveFloating.R.remove(tB);
       }
       if (l0.a()) {
          a tA = this.A;
          if (tA != null) {
             tA.Fe(this.C);
          }
       }
       return;
    }
    public final boolean P8(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       boolean b = (obj != null && obj.Aa())? true: false;
       return b;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q.N().r2(AudienceBizRelation.PK);
    }
    public final void S8(int p0,JSONObject p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23 || (this.s.getLiveMediaPlayer() != null && l0.g(this.q))) {
          switch (p0){
              case 0x186aa:
                this.X8();
                break;
              case 0x186ab:
                this.V8(p0, p1);
                break;
              case 0x186ac:
                this.W8();
                break;
              default:
          }
       }
    label_003b :
       return;
    }
    public final void V8(int p0,JSONObject p1){
       String str = "crop";
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "7")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       try{
          if (!p1.has(str)) {
             JSONObject jSONObject = new JSONObject();
             jSONObject.putOpt("mode", Integer.valueOf(0));
             p1.putOpt(str, jSONObject);
          }
       }catch(org.json.JSONException e0){
          b.d0(LiveLogTag.LIVE_PLAYER_CROP, "tryCropVideoJSONException", "requestCode", Integer.valueOf(p0), "msg", e0.getMessage());
       }
       this.s.setKwaivppExtJson(p0, p1.toString());
       b.d0(LiveLogTag.LIVE_PLAYER_CROP, "tryUpdateToMajorMinor", "requestCode", Integer.valueOf(p0), "params", p1);
       return;
    }
    public final void W8(){
       JSONObject jSONObject1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          return;
       }
       if (l0.d((float)this.m8().getWidth(), (float)this.m8().getHeight()) && (this.R8() && !this.P8())) {
          String str = "mode";
          JSONObject jSONObject = PatchProxy.apply(objArray, this, uoa, "14");
          if (jSONObject != PatchProxyResult.class) {
          }else {
             float f = -0.17f;
             LiveConfigStartupResponse$LivePkConfig livePkConfig = a.B(LiveConfigStartupResponse$LivePkConfig.class);
             if (livePkConfig != null) {
                f = f + livePkConfig.mStartClippingPosition;
             }
             try{
                jSONObject1 = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str, Integer.valueOf(1));
                jSONObject2.putOpt("target_ratio_x", Integer.valueOf(6));
                jSONObject2.putOpt("target_ratio_y", Integer.valueOf(4));
                jSONObject2.putOpt("offset_x", Float.valueOf(0));
                jSONObject2.putOpt("offset_y", Float.valueOf(f));
                jSONObject1.putOpt("crop", jSONObject2);
                jSONObject = new JSONObject();
                jSONObject.putOpt(str, Integer.valueOf(0));
                jSONObject1.putOpt("live_pk", jSONObject);
             }catch(org.json.JSONException e0){
                b.c0(LiveLogTag.LIVE_PLAYER_CROP, "switchPkMode exception", "msg", e0.getMessage());
             }
             jSONObject = jSONObject1;
          }
          String str1 = jSONObject.toString();
          this.s.setKwaivppExtJson(0x186ac, str1);
          b.c0(LiveLogTag.LIVE_PLAYER_CROP, "tryUpdateToSideBySide", "params", str1);
       }else {
          this.X8();
       }
       return;
    }
    public void X8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "9")) {
          return;
       }
       String str = "mode";
       String obj = PatchProxy.apply(objArray, this, uoa, "15");
       if (obj != PatchProxyResult.class) {
       }else {
          try{
             JSONObject jSONObject = new JSONObject();
             JSONObject jSONObject1 = new JSONObject();
             jSONObject1.putOpt(str, Integer.valueOf(0));
             jSONObject.putOpt("crop", jSONObject1);
             jSONObject1 = new JSONObject();
             jSONObject1.putOpt(str, Integer.valueOf(0));
             jSONObject.putOpt("live_pk", jSONObject1);
          }catch(org.json.JSONException e1){
             b.c0(LiveLogTag.LIVE_PLAYER_CROP, "switchPkMode exception", "msg", e1.getMessage());
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a30e0);
       this.y = m1.f(p0, 0x7f0a30e6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new c());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a$b.class);
       this.q = this.q8(a0.class);
       this.r = this.q8(c.class);
       this.s = this.r8("LIVE_PLAYER_CONTROLLER");
       this.z = this.q8(LiveBizParam.class);
       this.A = this.s8(b.class);
       return;
    }
}
