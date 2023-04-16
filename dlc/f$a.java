package dlc.f$a;
import android.view.View$OnClickListener;
import dlc.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import t45.d;
import brd.z;
import dlc.d;
import dlc.e;
import erd.g;
import java.util.Objects;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import alc.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class f$a implements View$OnClickListener	// class@002244
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       b9.a(this.b.y);
       p0.y = y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).G(d.a).R(new d(this), e.b);
       f$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, f.class, "10")) {
          TrendingInfo trendingInfo = tb.s.get();
          int i = tb.v + 1;
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(trendingInfo, Integer.valueOf(i), null, uoa, "15")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             oi3.d("wordId", trendingInfo.mWordId);
             oi3.d("trending_id", trendingInfo.mId);
             oi3.d("trending_name", trendingInfo.mDesc);
             oi3.c("trending_top", Integer.valueOf(trendingInfo.mTop));
             oi3.c("trending_feedcount", Integer.valueOf(trendingInfo.mFeedCount));
             oi3.d("popular_type", trendingInfo.mPopularType);
             oi3.d("trending_type", trendingInfo.mTrendingType);
             oi3.c("trending_index", Integer.valueOf(i));
             uElementPack.params = oi3.e();
             uElementPack.name = "POPULAR_PAGE";
             uElementPack.action2 = "HOT_SAMESTYLE";
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
