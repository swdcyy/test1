package ci3.a;
import mf5.v0$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import msd.a;
import java.lang.String;
import o63.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mf5.w0;
import di3.a;
import k2b.e0;
import com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem;
import android.app.Activity;
import di3.b;
import di3.c;
import di3.d;
import di3.e;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class a extends v0$a	// class@000567
{
    public final GifshowActivity a;
    public final BaseFragment b;
    public final QPhoto c;
    public final FollowHelper$a d;
    public final int e;
    public final a f;
    public final String g;
    public final a h;

    public void a(GifshowActivity p0,BaseFragment p1,QPhoto p2,FollowHelper$a p3,int p4,a p5,String p6,a p7){
       a.p(p0, "activity");
       a.p(p1, "fragment");
       a.p(p2, "photo");
       a.p(p5, "liveStreamPackageProvider");
       a.p(p7, "bridgeService");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public List a(){
       w0[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w0[6];
       String url = this.a.getUrl();
       String str = "activity.url";
       a.o(url, str);
       a uoa = new a(this.b, this.c, url, this.e, this.f);
       obj[0] = v8;
       LiveFeedbackOperationRecoItem liveFeedback = new LiveFeedbackOperationRecoItem(this.a, this.b, this.c, this.e, this.f);
       obj[1] = v8;
       int i = 2;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       uoa = this.g;
       if (uoa == null) {
          String str1 = this.a.Q2();
       }
       b uob = new b(tb, tc, td, uoa, this.e, this.f);
       obj[i] = v10;
       url = this.a.getUrl();
       a.o(url, str);
       c uoc = new c(this.b, this.c, url, this.e, this.f);
       obj[3] = v8;
       url = this.a.getUrl();
       a.o(url, str);
       d uod = new d(this.b, this.c, url, this.e, this.f);
       obj[4] = v8;
       QPhoto mEntity = this.c.mEntity;
       a.o(mEntity, "photo.mEntity");
       e uoe = new e(this.a, this.b, mEntity, this.e, this.f, this.h);
       obj[5] = str;
       return CollectionsKt__CollectionsKt.L(obj);
    }
}
