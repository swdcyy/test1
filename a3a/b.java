package a3a.b;
import java.util.concurrent.Callable;
import a3a.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import psb.c;
import psb.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.n0;
import com.yxcorp.gifshow.network.feed.RecommendFeedResponse;
import e50.m;
import com.kuaishou.eve.kit.rerank.config.RankApiParams;
import e50.g;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import cjd.e;
import erd.o;

public final class b implements Callable	// class@000023
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final Object call(){
       b b = this.b;
       Objects.requireNonNull(b);
       Object[] objArray = null;
       t ot = PatchProxy.apply(objArray, b, c.class, "2");
       if (ot != PatchProxyResult.class) {
       }else {
          c uoc = a.a();
          String photoId = b.p.getPhotoId();
          if (!b.K() && b.L0() != null) {
             objArray = b.L0().mCursor;
          }
          ot = uoc.r(photoId, objArray, 20, b.l2(), 0, b.j2(), b.p.getUserId(), b.p.getExpTag(), b.k2(), b.i2(), b.h2(), RankApiParams.a(b.q.isEnabled()), b.q.v2(), b.a(0x4b316083).getSessionId()).map(new e());
       }
       return ot;
    }
}
