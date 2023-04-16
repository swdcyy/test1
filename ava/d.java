package ava.d;
import erd.c;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import com.yxcorp.gifshow.hot.spot.model.HotSpotTrendingInfo;

public final class d implements c	// class@000325
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "response1");
          a.p(p1, "response2");
          p0.a().mHotsData = p1.a().mHotData;
       }
       return p0;
    }
}
