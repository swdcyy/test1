package jx0.i;
import c12.f;
import java.util.HashSet;
import rq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import jx0.e;
import jx0.c;
import jx0.d;
import jx0.b;
import jx0.a;
import jx0.i$a;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant;
import java.lang.String;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import oh3.j;
import h91.d;
import h91.c;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import jx0.h;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.Boolean;
import aq5.d;
import fq5.b;
import aq5.b;
import aq5.a;
import le1.a;
import lp3.c;
import lp3.i;
import le1.a$a;
import lf3.g;
import hf3.a;
import pq5.c;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import k2b.e0;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant;
import vb1.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import v51.a;
import android.content.Context;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBlindDateStyleARightPendantView;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBlindDateStyleBRightPendantView;
import jx0.i$b;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView$b;
import yb1.g;
import yb1.h;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$BlindDateReplacedPendantConfig;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$BlindDatePendantInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant;
import ry1.b;
import jx0.g;
import jx0.f;

public class i extends f	// class@002c2b
{
    public c K;
    public d L;
    public i M;
    public i N;
    public a O;
    public m P;
    public LiveBaseBlindDateRightPendantView Q;
    public final HashSet R;
    public String S;
    public String T;
    public LiveTimeConsumingUserStatusResponse$BlindDateReplacedPendantConfig U;
    public boolean U0;
    public LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant V;
    public boolean V0;
    public int W;
    public int W0;
    public int X;
    public b X0;
    public int Y;
    public final AudienceBizRelation[] Y0;
    public boolean Z;
    public final b Z0;
    public final g a1;
    public final g b1;
    public final g c1;
    public final a$a d1;
    public final a e1;
    public static String sLivePresenterClassName = "LiveAudienceBlindDateRightPendantPresenter";

    public void i(){
       super();
       this.R = new HashSet();
       this.Y = a.g;
       this.W0 = -1;
       this.X0 = null;
       AudienceBizRelation[] uAudienceBiz = new AudienceBizRelation[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW};
       this.Y0 = uAudienceBiz;
       this.Z0 = new e(this);
       this.a1 = new c(this);
       this.b1 = new d(this);
       this.c1 = new b(this);
       this.d1 = new a(this);
       this.e1 = new i$a(this);
    }
    public static void a9(i p0,LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant p1){
       p0.d9(p1);
    }
    private void d9(LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant p0){
       if (p0 == null || (TextUtils.n(p0.liveStreamId, this.P.getLiveStreamId()) && this.V0 != null)) {
          if (TextUtils.x(this.S) || (!TextUtils.n(this.S, p0.bizId) || this.W0 >= p0.version)) {
             return;
          }else {
             i tQ = this.Q;
             if (tQ != null) {
                if (p0.delayRefresh != null) {
                   j.a(this.X0);
                   this.X0 = c.b().j(p0.liveStreamId, p0.bizId, p0.extraInfo).map(new e()).delaySubscription(p0.maxDelayMillis, TimeUnit.MILLISECONDS).subscribe(new h(this, p0), e.b);
                }else {
                   p0 = p0.highlightDescription;
                   Objects.requireNonNull(tQ);
                   if (!PatchProxy.applyVoidOneRefs(p0, tQ, LiveBaseBlindDateRightPendantView.class, "14")) {
                      a.p(p0, "highLightText");
                      LiveBaseBlindDateRightPendantView g = tQ.g;
                      if (g == null) {
                         a.S("highLightTextView");
                      }
                      g.setText(p0);
                   }
                }
             }
          }
       }
       return;
    }
    public void Q(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "3")) {
          return;
       }
       this.P.A0().G5(this.Z0, this.Y0);
       this.M.a(a.class).Nm(this.d1);
       this.O.o(1011, this.a1);
       this.O.o(1012, this.b1);
       this.O.o(1013, this.c1);
       j.a(this.X0);
       this.X0 = null;
       this.b9();
       this.R.clear();
       this.Z = false;
       return;
    }
    public void b9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       this.S = objArray;
       this.V0 = false;
       this.K.g9(this.e1);
       b.Z(LiveCommonLogTag.BLIND_DATE, "BlindPendant hide  bizId = "+this.S);
       return;
    }
    public final boolean c9(){
       int i;
       d obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.P.A0();
       i tY0 = this.Y0;
       int len = tY0.length;
       boolean b = false;
       i = 0;
       boolean b1 = false;
       while (i < len) {
          object oobject = tY0[i];
          b1 = (b1 || obj.r2(oobject))? true: false;
          i = i + 1;
       }
       if (!obj.r2(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW)) {
          b = b1;
       }
       return b;
    }
    public void e9(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "12")) {
          return;
       }
       oi = this.N;
       if (oi == null || (this.S == null || (this.T != null && this.V != null))) {
          c.c(p0, oi.getPage(), this.N.a(), TextUtils.k(this.S), (int)this.V.pendantStyle, (this.Z ^ 0x01), this.T);
       }
    label_0045 :
       return;
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       i tN = this.N;
       if (tN == null || (this.S == null || (this.T != null && this.V != null))) {
          c.f(tN.getPage(), this.N.a(), this.S, (int)this.V.pendantStyle, (this.Z ^ 0x01), this.T);
       }
    label_0037 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       super.j8();
       this.P = this.r8("LIVE_BASIC_CONTEXT");
       this.L = this.r8("LIVE_ROUTER_SERVICE");
       this.K = this.q8(c.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.M = oi;
       this.N = oi.a(i.class);
       this.O = this.M.a(a.class).u();
       return;
    }
    public final void j9(LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant p0){
       int i;
       LiveTimeConsumingUserStatusResponse$BlindDateReplacedPendantConfig mbuttonLinkU;
       LiveTimeConsumingUserStatusResponse$BlindDatePendantInfo mButtonImgUr;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "7")) {
          return;
       }
       if (this.getContext() == null || this.R.contains(p0.bizId)) {
          b.Z(LiveCommonLogTag.BLIND_DATE, "invalid id or context");
          return;
       }else if(this.Q != null){
          this.b9();
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant pendantStyle = p0.pendantStyle;
       if (!pendantStyle - 1) {
          this.Q = new LiveBlindDateStyleARightPendantView(this.getContext());
       }else if(!pendantStyle - 2){
          this.Q = new LiveBlindDateStyleBRightPendantView(this.getContext());
       }
       i tQ = this.Q;
       if (tQ == null) {
          b.Z(LiveCommonLogTag.BLIND_DATE, "LiveAudienceBaseBlindDateRightPendantView = null,msg style = "+p0.pendantStyle);
          return;
       }else {
          this.S = p0.bizId;
          tQ.setPendantCallback(new i$b(this));
          tQ = this.Q;
          g og = PatchProxy.applyOneRefs(p0, this, oi, "8");
          if (og != PatchProxyResult.class) {
          }else {
             oi = this.U;
             i = (oi == null)? 1: 0;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant largeImgInfo = p0.largeImgInfo;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo backgroundIm = largeImgInfo.backgroundImgUrl;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo topImgUrl = largeImgInfo.topImgUrl;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo buttonImgUrl = (i)? largeImgInfo.buttonImgUrl: oi.mLargeImgInfo.mButtonImgUrl;
             h oh = new h(backgroundIm, topImgUrl, buttonImgUrl);
             largeImgInfo = p0.smallImgInfo;
             topImgUrl = largeImgInfo.backgroundImgUrl;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo topImgUrl1 = largeImgInfo.topImgUrl;
             buttonImgUrl = (i)? largeImgInfo.buttonImgUrl: oi.mSmallImgInfo.mButtonImgUrl;
             h oh1 = new h(topImgUrl, topImgUrl1, buttonImgUrl);
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant pendantLinkU = p0.pendantLinkUrl;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant topImgLinkUr = p0.topImgLinkUrl;
             largeImgInfo = (i)? p0.buttonLinkUrl: oi.mbuttonLinkUrl;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant sCLiveBlindD = largeImgInfo;
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant guideDescrip = (i)? p0.guideDescription: oi.mGuideDescription;
             g og1 = new g(oh, oh1, pendantLinkU, topImgLinkUr, sCLiveBlindD, guideDescrip, p0.highlightDescription, p0.bizId);
             og = v13;
          }
          tQ.b(og, (this.Z ^ 1));
          this.k9(this.Z);
          this.K.eo(this.e1);
          b.Z(LiveCommonLogTag.BLIND_DATE, "BlindPendant show  bizId = "+this.S);
          return;
       }
    }
    public final void k9(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "5")) {
          return;
       }
       if (p0) {
          this.Y = this.X;
          i tQ = this.Q;
          if (tQ != null) {
             tQ.f(this.W);
          }
       }else {
          this.Y = a.g;
       }
       return;
    }
    public void x(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
          return;
       }
       this.P.A0().u5(this.Z0, this.Y0);
       this.M.a(a.class).Jc(this.d1);
       this.O.u0(1011, LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant.class, this.a1);
       this.O.u0(1012, LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant.class, this.b1);
       this.O.u0(1013, LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant.class, this.c1);
       this.Z = this.c9();
       this.X7(this.M.a(b.class).W().subscribe(new g(this), new f(this)));
       return;
    }
}
