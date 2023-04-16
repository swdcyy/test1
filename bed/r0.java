package bed.r0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import ded.h;
import com.yxcorp.plugin.search.result.hashtag.presenters.g0;
import ced.e0;
import com.yxcorp.plugin.search.result.hashtag.presenters.f;
import ced.o1;
import ced.p1;
import oyb.b;
import com.yxcorp.plugin.search.result.hashtag.presenters.v;
import com.yxcorp.plugin.search.result.hashtag.presenters.m;
import ced.u;
import com.yxcorp.plugin.search.result.hashtag.presenters.f0;
import com.yxcorp.plugin.search.result.hashtag.presenters.r;
import com.yxcorp.plugin.search.result.hashtag.presenters.d0;
import com.yxcorp.plugin.search.result.hashtag.presenters.PostRecommendForMusicTagPresenter;
import com.yxcorp.plugin.search.result.hashtag.presenters.PostRecommendForMagicTagPresenter;
import ded.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import ced.v1;
import com.yxcorp.plugin.search.result.hashtag.presenters.h0;
import ced.u1;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import ced.m1;
import com.yxcorp.plugin.search.result.hashtag.presenters.e0;
import com.yxcorp.plugin.search.result.hashtag.presenters.o;
import com.yxcorp.plugin.search.result.hashtag.presenters.p;
import com.yxcorp.plugin.search.result.hashtag.presenters.t;
import com.yxcorp.plugin.search.result.hashtag.presenters.w;
import ced.d0;

public final class r0 extends PresenterV2	// class@00041f
{

    public void r0(TagInfo p0){
       super();
       boolean b = h.b(p0);
       this.U7(new g0());
       this.U7(new e0());
       this.U7(new f());
       this.U7(new o1());
       this.U7(new p1());
       int i = 0x7f0a3d1e;
       this.U7(b.a(i));
       this.U7(new v());
       this.U7(new m());
       this.U7(new u());
       this.U7(new f0());
       this.U7(new r());
       this.U7(new d0());
       this.U7(new PostRecommendForMusicTagPresenter());
       this.U7(new PostRecommendForMagicTagPresenter());
       Object obj = PatchProxy.apply(null, null, g.class, "9");
       boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d(g.b, true);
       if (b1) {
          this.U7(new v1());
          this.U7(new h0());
       }
       this.U7(new u1());
       this.U7(new h());
       this.U7(new m1());
       this.U7(new e0(b));
       this.U7(new o());
       this.U7(new p());
       this.U7(new t());
       this.U7(new r());
       this.U7(b.a(i));
       this.U7(new w(b));
       this.U7(new d0());
       return;
    }
}
