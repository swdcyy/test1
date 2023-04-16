package a3a.e;
import erd.g;
import a3a.f;
import java.lang.Object;
import com.yxcorp.gifshow.network.feed.RecommendFeedResponse;
import sf6.a$a;
import sf6.a;
import h50.h;
import a3a.c;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import h50.f;
import java.lang.String;
import e50.g;
import qvb.n0;
import java.util.List;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;

public final class e implements g	// class@000026
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       tb.s.a(p0, tb.t);
       if (p0.mEnableItemFeature != null) {
          h.b.a(tb.q.b()).a(p0.mLlsid, tb.q.v2(), p0.mQPhotos, tb.K());
       }
       b.a(-129117978).d(tb.v, null);
       return;
    }
}
