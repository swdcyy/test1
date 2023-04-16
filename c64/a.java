package c64.a;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import aq5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq5.a;
import aq5.d;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ks3.f0;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import js6.a;
import java.lang.Boolean;
import java.util.HashMap;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Integer;

public class a extends PresenterV2 implements IMediaPlayer$OnVideoSizeChangedListener, b	// class@0004c4
{
    public LivePlayerController p;
    public d q;
    public f0 r;
    public b s;
    public String t;

    public void a(){
       super();
       this.t = "";
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q.u5(this, this.P8());
       a tp = this.p;
       if (tp != null) {
          tp.addOnVideoSizeChangedListener(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q.G5(this, this.P8());
       a tp = this.p;
       if (tp != null) {
          tp.removeOnVideoSizeChangedListener(this);
       }
       return;
    }
    public final a[] P8(){
       a[] obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       int i3 = 4;
       if (this.s.e()) {
          obj = new a[i3];
          obj[i2] = AnchorBizRelation.PK;
          obj[i1] = AnchorBizRelation.LIVE_MULTI_PK;
          obj[i] = AnchorBizRelation.LIVE_LINE;
          obj[3] = AnchorBizRelation.LIVE_MULTI_LINE;
          return obj;
       }else {
          obj = new a[i3];
          obj[i2] = AudienceBizRelation.PK;
          obj[i1] = AudienceBizRelation.LIVE_MULTI_PK;
          obj[i] = AudienceBizRelation.LIVE_LINE;
          obj[3] = AudienceBizRelation.LIVE_MULTI_LINE;
          return obj;
       }
    }
    public final void R8(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       if (this.r != null && TextUtils.x(this.t)) {
          this.t = this.r.J4();
       }
       p1.put("liveId", this.t);
       String str = a.a.q(p1);
       a.u(MerchantCommonLogBiz.RN, "LiveMerchantStatusEventPresenter", "send changed status to js", "action", p0, "json", str);
       a.b.GO(p0, str);
       return;
    }
    public void e6(a p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "6")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("enable", Boolean.valueOf(p1));
       int i = 0;
       AnchorBizRelation uAnchorBizRe = (p0 != AnchorBizRelation.PK && (p0 != AnchorBizRelation.LIVE_MULTI_PK && (p0 == AudienceBizRelation.PK || p0 == AudienceBizRelation.LIVE_MULTI_PK)))? 1: null;
       if (uAnchorBizRe) {
          this.R8("KSMerchantLivePkStatusChanged", hashMap);
       }else if(p0 != AnchorBizRelation.LIVE_LINE && (p0 != AnchorBizRelation.LIVE_MULTI_LINE && (p0 == AudienceBizRelation.LIVE_LINE || p0 == AudienceBizRelation.LIVE_MULTI_LINE))){
          i = 1;
       }
       if (i) {
          this.R8("KSMerchantLiveLineStatusChanged", hashMap);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.t8("LIVE_PLAYER_CONTROLLER");
       this.r = this.t8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.q = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       int i = 1;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
             return;
          }
       }
       if (this.p != null) {
          HashMap hashMap = new HashMap();
          if (this.p.getVideoSizeRatio() - 0x3f800000 <= 0) {
             i = false;
          }
          hashMap.put("isLandscape", Boolean.valueOf(i));
          this.R8("KSMerchantLiveStreamOrientationChanged", hashMap);
       }
       return;
    }
}
