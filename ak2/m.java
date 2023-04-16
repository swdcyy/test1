package ak2.m;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import lnc.i3;

public class m	// class@0000f4
{

    public void m(){
       super();
    }
    public static ClientEvent$ElementPackage a(LiveStreamFeedWrapper p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "LIVE_TITLE_AREA";
       i3 oi3 = i3.f();
       oi3.d("title_concat", TextUtils.i(r1.p0(p0.mEntity), p0.getUserName()));
       obj.params = oi3.e();
       return obj;
    }
}
