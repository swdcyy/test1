package d61.e0;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.g;

public class e0	// class@001f17
{

    public void e0(){
       super();
    }
    public static String a(LiveStreamFeedWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (p0 != null)? TextUtils.k(p0.getExpTag()): "";
       return str;
    }
    public static String b(){
       Object obj = PatchProxy.apply(null, null, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(b.a(0xe0ff4fb).d());
    }
    public static String c(LiveStreamFeedWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (p0 != null)? TextUtils.k(p0.getServerExpTag()): "";
       return str;
    }
}
