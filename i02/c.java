package i02.c;
import xp5.i;
import lp3.a;
import p91.m;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import or5.d;
import lp3.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.model.LiveStreamModel;
import by1.a;
import com.kuaishou.android.model.mix.CommonMeta;
import i02.b;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;
import f3b.u;
import z1.a;
import xp5.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import xp5.i$a;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;

public class c extends a implements i	// class@0027ea
{
    public final m d;
    public final x e;
    public final x f;
    public final x g;
    public final x h;
    public e i;
    public final x j;
    public final x k;

    public void c(m p0,x p1,x p2,x p3,x p4,x p5,x p6){
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.j = p5;
       this.k = p6;
    }
    public ClientContent$LiveStreamPackage Bb(){
       LiveStreamFeed obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.So(d.class).j0();
       if (obj == null) {
          return this.a();
       }
       User user = this.d.I();
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       liveStreamPa.anchorUserId = TextUtils.k(r1.U1(obj));
       liveStreamPa.liveStreamId = TextUtils.k(r1.n1(obj));
       LiveStreamFeed mLiveStreamM = obj.mLiveStreamModel;
       long l = (mLiveStreamM != null)? (long)mLiveStreamM.mAdminAuthorDutyType: 0;
       liveStreamPa.liveOperationType = l;
       liveStreamPa.serverExpTag = TextUtils.k(this.d.t());
       liveStreamPa.audienceNumberString = String.valueOf(this.So(a.class).ea());
       boolean b = false;
       boolean b1 = (user != null && user.isFollowingOrFollowRequesting())? true: false;
       liveStreamPa.myFollow = b1;
       if (e.c(obj, CommonMeta.class, b.b) == 1) {
          b = true;
       }
       liveStreamPa.friend = b;
       liveStreamPa.showIndexPlusOne = (long)(r1.y1(obj) + 1);
       liveStreamPa.sessionId = TextUtils.k(this.e.get());
       liveStreamPa.sourceUrl = TextUtils.k(this.f.get());
       liveStreamPa.sourceTypeNew = this.g.get().intValue();
       liveStreamPa.liveStyle = 2;
       liveStreamPa.feedLogCtx = u.f(r1.O0(obj));
       return liveStreamPa;
    }
    public void Bj(a p0){
       h.b(this, p0);
    }
    public ClientContent$ContentPackage El(){
       return h.d(this);
    }
    public void In(a p0){
       h.i(this, p0);
    }
    public void Nb(i$a p0){
       h.j(this, p0);
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.i = this.Po();
       return;
    }
    public final c So(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.a(p0);
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a();
    }
    public ClientContent$LiveVoicePartyPackageV2 b4(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.y();
    }
    public FeedLogCtx c0(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.get();
    }
    public e0 getPage(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.b();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.b().getUrl();
    }
    public ClientEvent$ElementPackage im(String p0,a p1){
       return h.e(this, p0, p1);
    }
    public ClientContent$LiveVoicePartyPackageV2 l3(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.g();
    }
    public ClientContent$PhotoPackage mj(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.get();
    }
    public String ul(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.get();
    }
    public void wm(a p0){
       h.a(this, p0);
    }
    public void xl(a p0){
       h.h(this, p0);
    }
}
