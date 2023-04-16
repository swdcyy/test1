package en9.b;
import jb5.e;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import qvb.a;
import qvb.n0;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bn9.b;
import bn9.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.action.RealActionBizType;
import yv8.c;
import yv8.a;
import cjd.e;
import erd.o;
import en9.a;
import erd.g;
import java.util.List;
import la6.b;
import java.util.Collection;

public final class b extends f implements e	// class@00221f
{
    public final int p;
    public List q;
    public final QPhoto r;
    public final String s;

    public void b(QPhoto p0,String p1){
       a.p(p0, "photo");
       super();
       this.s = p1;
       this.p = 20;
       this.r = p0;
       this.add(p0);
       this.R1(true);
    }
    public t I1(){
       HomeFeedResponse mCursor;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       t ot = PatchProxy.apply(objArray, this, uob, "2");
       if (ot != patchProxyRe) {
       }else {
          b uob1 = a.a();
          uob = this.s;
          obj = "";
          if (uob == null) {
             String str = obj;
          }
          String photoId = this.r.getPhotoId();
          if (!this.K() && this.L0() != null) {
             mCursor = this.L0().mCursor;
          }
          ot = uob1.a(uob, photoId, mCursor, this.p, 7, this.r.getUserId(), this.r.getExpTag(), "3", b.a(-129117978).g(RealActionBizType.UNIVERSAL_FEED_TAB, objArray, false)).map(new e()).doOnNext(a.b);
          a.o(ot, "HomeUniversalTabApi.getS¡­L_HOT, it.mLlsid\)\n      }");
       }
       return ot;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(HomeFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       super.d2(p0, p1);
       if (this.K()) {
          b tq = this.q;
          tq = (tq == null || tq.isEmpty())? 1: null;
          if (tq) {
             if (p1 != null) {
                p1.add(0, this.r);
             }
          }else if(p1 != null){
             tq = this.q;
             a.m(tq);
             p1.addAll(0, tq);
          }
          tq = this.q;
          if (tq != null) {
             tq.clear();
          }
       }
    label_003e :
       return;
    }
    public boolean i(){
       return false;
    }
    public void k(List p0){
       this.q = p0;
    }
}
