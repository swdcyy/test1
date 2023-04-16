package com.kuaishou.live.lite.recommendsidebar.panel.m;
import qvb.f;
import z1.k;
import z1.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.live.lite.recommendsidebar.panel.model.LiveLiteRecommendPanelFeedResponse;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import yc3.b;
import ok.x;
import cjd.e;
import erd.o;
import com.kuaishou.live.lite.recommendsidebar.panel.m$a;
import com.kuaishou.gifshow.kuaishan.logic.s0;
import yc3.t;
import yc3.s;
import t45.d;
import brd.z;

public class m extends f	// class@000b05
{
    public int A;
    public final k p;
    public int q;
    public final a r;
    public final a s;
    public final a t;
    public int u;
    public int v;
    public String w;
    public String x;
    public String y;
    public String z;

    public void m(k p0,int p1,a p2,a p3,a p4){
       super();
       this.v = 0;
       this.A = 0;
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
    }
    public t I1(){
       String str;
       String str1;
       Object[] objArray1;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.K() && this.L0() != null)? this.L0().getCursor(): objArray;
       this.w = obj;
       QPhoto qPhoto = this.p.get();
       if (this.K() && qPhoto != null) {
          str = r1.n1(qPhoto.getEntity());
          str1 = r1.U1(qPhoto.getEntity());
          this.y = str;
          this.z = str1;
          this.v = 0;
          this.u = this.q;
          this.w = objArray;
       }else {
          str = this.y;
          str1 = this.z;
       }
       this.x = str;
       b.e0(LiveLiteLogTag.LITE_RECOMMEND_PANEL, "LiveLiteRecommendPanelPageList, onCreateRequest", "liveStreamId", str, "cursor", this.w, "liteSlideBarType", Integer.valueOf(this.u));
       return b.a.get().a(str, str1, "76", this.w, this.u).map(new e()).map(new m$a(this)).flatMap(s0.b).flatMap(new t(this, qPhoto)).onErrorReturn(new s(this)).subscribeOn(d.b).observeOn(d.a);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.A = 0;
       super.a();
       return;
    }
    public String h2(){
       return this.x;
    }
    public boolean i(){
       return false;
    }
}
