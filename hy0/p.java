package hy0.p;
import im8.g;
import k51.c;
import hy0.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import hy0.f;
import erd.o;
import hy0.n;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import hy0.d;
import ok.x;
import fq5.b;
import z12.x;
import d61.e0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import p91.m;
import lp3.e;
import xp5.i;
import lp3.c;
import k2b.e0;
import hy0.m;
import cjd.e;
import hy0.o;
import hy0.p$a;
import com.kwai.robust.PatchProxyResult;
import hy0.s;
import java.util.Map;
import java.util.HashMap;
import im2.f;
import n81.e;

public class p extends c implements g	// class@0027b2
{
    public a0 p;
    public f q;
    public e r;
    public b s;
    public boolean t;
    public JsonElement u;
    public boolean v;
    public LivePayBulletResponse w;
    public p$b x;
    public static String sLivePresenterClassName = "LiveAudienceSendBulletCommentsPresenter";

    public void p(){
       super();
       this.t = false;
       this.x = new g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "9")) {
          return;
       }
       a0 b3 = this.p.b3;
       this.s = b3;
       this.X7(b3.T3().map(f.b).subscribe(new n(this)));
       return;
    }
    public final void P8(String p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "5")) {
          return;
       }
       this.X7(d.a.get().a(this.p.b().getLiveStreamId(), p0, p1, x.q(this.p), e0.b(), e0.a(this.p.c), r1.Q1(this.p.c.mEntity), b.a(0x4b316083).i(this.p.b().t5().a(i.class).getPage().o(), null)).doOnNext(new m(this)).map(new e()).subscribe(new o(this, p0, p1), new p$a(this, p1)));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new s());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_WEALTH_GRADE_BARRAGE_NEW_STYLE_ENTER_ROOM");
       this.r = this.q8(e.class);
       this.p = this.q8(a0.class);
       return;
    }
}
