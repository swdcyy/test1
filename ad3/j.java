package ad3.j;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import or5.d;
import vq5.d;
import com.kuaishou.live.lite.sidebar.e;
import v51.a;
import tj3.e;
import oy.a;
import com.kuaishou.commercial.reporter.data.ApiResponseMessageData;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import com.yxcorp.utility.SystemUtil;
import ad3.f;
import ad3.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tj3.k;
import java.lang.System;
import java.lang.Integer;
import xp5.g;
import q51.a;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitButton;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import ad3.c;
import ok.x;
import brd.t;
import cjd.e;
import erd.o;
import ad3.h;
import ad3.g;
import erd.g;
import crd.b;
import z1.a;
import hf3.a;
import lf3.g;
import lnc.b9;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import ad3.j$a;
import ad3.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import java.util.Objects;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class j extends ViewController	// class@000091
{
    public final boolean A;
    public boolean B;
    public final g C;
    public b D;
    public final a E;
    public final LiveLiteBottomBarService j;
    public final d k;
    public final d l;
    public final e m;
    public final a n;
    public final e o;
    public a p;
    public long q;
    public boolean r;
    public a s;
    public final ApiResponseMessageData t;
    public final SignalMessageData u;
    public boolean v;
    public boolean w;
    public a x;
    public CommercialRecruitLiveShowClickReportMessageData y;
    public j$a z;

    public void j(LiveLiteBottomBarService p0,d p1,d p2,e p3,a p4,e p5){
       super();
       this.p = a.m();
       this.s = a.k();
       this.t = new ApiResponseMessageData();
       this.u = new SignalMessageData();
       this.x = a.o();
       this.y = new CommercialRecruitLiveShowClickReportMessageData();
       SystemUtil.I();
       this.A = false;
       this.B = false;
       this.C = new f(this);
       this.E = new d(this);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
    }
    public void F2(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "1")) {
          return;
       }
       j oj1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, oj, "3")) {
          this.p = a.m();
          this.s = a.k();
          LiveStreamFeed liveStreamFe1 = this.k.j0();
          if (liveStreamFe1 == null) {
             b.Z(LiveLiteLogTag.LITE_RECRUIT_BOTTOM, "initRecruitQualityReporter, liveStreamFeed == null, ignore");
          }else {
             long l = this.o.x().M();
             this.q = l;
             if (l - null <= 0) {
                this.q = System.currentTimeMillis();
             }
             j tp = this.p;
             tp.S(liveStreamFe1.mTypeViewList);
             tp.R(this.k.getLiveStreamId());
             tp.C(this.q);
             tp.H(oj1);
             tp = this.s;
             tp.y(this.k.d());
             tp.S(liveStreamFe1.mTypeViewList);
             tp.R(this.k.getLiveStreamId());
             tp.C(this.q);
             String str1 = "liteBottomIcon";
             tp.T(str1);
             tp.Z();
             this.x = a.o();
             CommercialRecruitLiveShowClickReportMessageData uCommercialR = new CommercialRecruitLiveShowClickReportMessageData();
             this.y = uCommercialR;
             uCommercialR.mLiveStreamId = this.k.getLiveStreamId();
             tp = this.y;
             tp.mTypeViewList = liveStreamFe1.mTypeViewList;
             tp.mMessageType = str1;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "5")) {
          LiveLiteLogTag lITE_RECRUIT = LiveLiteLogTag.LITE_RECRUIT_BOTTOM;
          b.Z(lITE_RECRUIT, "requestRecruitBottomBarIfNecessary");
          LiveStreamFeed liveStreamFe = this.k.j0();
          if (liveStreamFe == null) {
             b.Z(lITE_RECRUIT, "requestRecruitBottomBarIfNecessary, liveStreamFeed == null, ignore");
          }else if(this.A != null){
             Integer[] integerArray = new Integer[oj1];
             integerArray[0] = Integer.valueOf(31);
             liveStreamFe.mTypeViewList = integerArray;
          }
          if (!a.a(liveStreamFe)) {
             b.Z(lITE_RECRUIT, "requestRecruitBottomBarIfNecessary, not recruit live, ignore");
          }else {
             String liveStreamId = this.k.getLiveStreamId();
             String str = this.k.d();
             if (this.A != null) {
                b.Z(lITE_RECRUIT, "======= debug =======");
                LivePlusRecruitMessages$LivePlusRecruitButton livePlusRecr = new LivePlusRecruitMessages$LivePlusRecruitButton();
                livePlusRecr.liveStreamId = this.k.getLiveStreamId();
                livePlusRecr.audienceButtonJumpUrl = "kwailive://krndialog?bundleid=LiveRecruitGuest&componentname=LiveRecruitGuest&heightratio=0.49&place=1&radius=20&screen=HotWork&source=LITE_BOTTOM_ICON";
                livePlusRecr.canShow = oj1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[oj1];
                picUrlArray[0] = new UserInfos$PicUrl();
                livePlusRecr.recruitIcon = picUrlArray;
                this.V2(livePlusRecr);
             }else {
                this.D = c.a.get().a(liveStreamId, str, 2).map(new e()).subscribe(new h(this, System.currentTimeMillis()), new g(this));
             }
          }
       }
       this.m.e(this.E);
       this.n.u().u0(880, LivePlusRecruitMessages$LivePlusRecruitButton.class, this.C);
       return;
    }
    public void J2(){
       j oj = j.class;
       if (PatchProxy.applyVoid(null, this, oj, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oj, "4")) {
          oj = this.p;
          oj.P(System.currentTimeMillis());
          oj.O(((System.currentTimeMillis() - this.q) - this.o.x().K()));
          oj.v();
          oj = this.s;
          oj.Y(this.u);
          oj.X(this.t);
          oj.t();
       }
       this.B = false;
       this.v = false;
       this.w = false;
       this.r = false;
       this.q = 0;
       this.m.c(this.E);
       b9.a(this.D);
       this.n.u().o(880, this.C);
       this.z = null;
       return;
    }
    public final void V2(LivePlusRecruitMessages$LivePlusRecruitButton p0){
       boolean b;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "6")) {
          return;
       }
       if (p0 == null) {
          b.Z(LiveLiteLogTag.LITE_RECRUIT_BOTTOM, "handleBottomBarMessage, msg == null, ignore");
          return;
       }else if(!TextUtils.n(this.k.getLiveStreamId(), p0.liveStreamId)){
          b.Z(LiveLiteLogTag.LITE_RECRUIT_BOTTOM, "handleBottomBarMessage, liveStreamId is different, ignore");
          return;
       }else {
          b = true;
          this.B = b;
          int i = TextUtils.x(p0.audienceButtonJumpUrl) ^ b;
          boolean b1 = (p0.canShow != null && i)? true: false;
          if (b1 && this.v == null) {
             this.s.d0(2);
             this.v = b;
          }
          LiveLiteLogTag lITE_RECRUIT = LiveLiteLogTag.LITE_RECRUIT_BOTTOM;
          b.e0(lITE_RECRUIT, "handleBottomBarMessage, isJumpUrlAvailable", "isJumpUrlAvailable", Boolean.valueOf(i), "msg.canShow", Boolean.valueOf(p0.canShow), "visible", Boolean.valueOf(b1));
          if (b1) {
             CDNUrl[] uCDNUrlArray = e0.i(p0.recruitIcon);
             p0 = p0.audienceButtonJumpUrl;
             if (!PatchProxy.applyVoidTwoRefs(uCDNUrlArray, p0, this, oj, "8")) {
                if (this.z == null) {
                   b.d0(lITE_RECRUIT, "handleBottomBarMessage, addRecruitBottomBarItem, add", "iconUrl", uCDNUrlArray, "jumpUrl", p0);
                   j$a uoa = new j$a(this, uCDNUrlArray, p0, new e(this));
                   this.z = uoa;
                   this.j.a(uoa);
                }else {
                   b.d0(lITE_RECRUIT, "handleBottomBarMessage, addRecruitBottomBarItem, update", "iconUrl", uCDNUrlArray, "jumpUrl", p0);
                   oj = this.z;
                   Objects.requireNonNull(oj);
                   if (!PatchProxy.applyVoidOneRefs(uCDNUrlArray, oj, j$a.class, "3")) {
                      oj.d = uCDNUrlArray;
                      oj.c.a0(uCDNUrlArray, null);
                   }
                   this.z.e = p0;
                }
             }
          }else if(!PatchProxy.applyVoid(null, this, oj, "7") && this.z != null){
             b.Z(lITE_RECRUIT, "removeRecruitBottomBarItemIfNecessary, need");
             this.j.c(this.z);
             this.z = null;
          }
          return;
       }
    }
}
