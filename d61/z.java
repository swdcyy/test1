package d61.z;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wh5.c;
import oe6.e;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public class z	// class@001f46
{

    public void z(){
       super();
    }
    public static LiveStreamStatus a(){
       Object obj = PatchProxy.apply(null, null, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.b()) {
          return LiveStreamStatus.HIDDEN;
       }
       return LiveStreamStatus.parseFrom(e.a.getString(b.d("user")+"live_stream_status", ""));
    }
}
