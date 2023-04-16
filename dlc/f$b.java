package dlc.f$b;
import com.yxcorp.gifshow.widget.m;
import dlc.f;
import android.view.View;
import java.lang.Object;
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
import dlc.g;
import dlc.h;
import erd.g;
import java.util.Objects;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import alc.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class f$b extends m	// class@002245
{
    public final f c;

    public void f$b(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       b9.a(this.c.y);
       p0.y = y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).G(d.a).R(new g(this), h.b);
       f$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, f.class, "11")) {
          TrendingInfo trendingInfo = tc.s.get();
          if (trendingInfo != null) {
             int i = tc.v + 1;
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(trendingInfo, Integer.valueOf(i), null, null, a.class, "16")) {
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
                if (!TextUtils.isEmpty(null)) {
                   oi3.d("bamboo_entry_source", null);
                }
                uElementPack.params = oi3.e();
                uElementPack.name = "POPULAR_PAGE";
                uElementPack.action2 = "SUBMIT_BUTTON";
                u1.u(1, uElementPack, null);
             }
          }
       }
       return;
    }
}
