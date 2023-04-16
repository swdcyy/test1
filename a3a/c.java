package a3a.c;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import e50.g;
import com.kuaishou.eve.kit.rerank.BizPage;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a3a.b;
import java.util.concurrent.Callable;
import java.util.List;
import com.yxcorp.gifshow.network.feed.RecommendFeedResponse;
import la6.b;
import kp.y1;
import tkd.b;
import tkd.d;
import uxb.m;
import qk.g0;
import b06.d;
import java.util.Collection;
import lnc.c2;
import a3a.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import ekd.q;
import java.util.Iterator;

public abstract class c extends f	// class@000024
{
    public final QPhoto p;
    public final g q;
    public static final int r;

    public void c(QPhoto p0){
       super();
       this.p = p0;
       this.q = new g(BizPage.FOUNTAIN);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.defer(new b(this));
    }
    public void M1(Object p0,List p1){
       this.m2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.m2(p0, p1);
    }
    public String h2(){
       return "";
    }
    public String i2(){
       return null;
    }
    public String j2(){
       return null;
    }
    public String k2(){
       return "";
    }
    public abstract int l2();
    public final void m2(RecommendFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       super.d2(p0, p1);
       this.n2(p0, p1);
       return;
    }
    public void n2(RecommendFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       y1.c(p0.getItems(), p0.mLlsid);
       d.a(0x214156f5).aD(p0.mIsNewRefluxUser);
       this.o2(p0.getItems(), this.p.getSource());
       d.f(p1);
       d.g(p1);
       c2[] uoc2Array = new c2[]{a.a};
       d.e(p1, uoc2Array);
       if (!this.i()) {
          d.c(p1);
       }
       y1.e(0, p1);
       y1.f(p1, r1.D1(this.p.mEntity));
       return;
    }
    public final void o2(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             iterator.next().setSource(p1);
          }
       }
       return;
    }
}
