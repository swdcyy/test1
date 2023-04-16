package ig1.a;
import os5.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEntryCoverGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Number;
import java.lang.Integer;

public class a implements f	// class@0028c6
{

    public void a(){
       super();
    }
    public String Bz(){
       LiveConfigStartupResponse$LiveEntryCoverGuideConfig obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.m(LiveConfigStartupResponse$LiveEntryCoverGuideConfig.class);
       String str = (obj == null)? "": obj.mEntryCameraGuideText;
       b.c0(LiveLogTag.LIVE_ENTRY, "getLiveEntryCameraTakePictureGuideText", "text", str);
       return str;
    }
    public int g10(){
       LiveConfigStartupResponse$LiveEntryCoverGuideConfig obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.m(LiveConfigStartupResponse$LiveEntryCoverGuideConfig.class);
       int i = (obj == null)? -1: obj.mMaxShowEntryCameraGuideCount;
       b.c0(LiveLogTag.LIVE_ENTRY, "getLiveEntryCameraTakePictureGuideMaxShownCount", "count", Integer.valueOf(i));
       return i;
    }
    public boolean isAvailable(){
       return true;
    }
}
