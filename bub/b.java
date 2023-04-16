package bub.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import bub.a;
import ok.x;
import java.lang.Object;
import bub.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.NotifyCount;
import dub.z;

public class b extends ConfigAutoParseJsonConsumer	// class@00047c
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          p0 = p0.mNotifyCount;
          if (p0 != null) {
             z.c("NotifyHeartbeatConsumer", -1, p0.mMomentFollowing);
          }
       }
       return;
    }
}
