package ai2.c;
import erd.g;
import ai2.b;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponseData;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;

public final class c implements g	// class@0000d9
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          c tb = this.b;
          p0 = p0.getData();
          if (p0 != null) {
             p0 = p0.getRedPackList();
             if (p0 != null) {
                p0 = ArraysKt___ArraysKt.Ey(p0);
             label_0021 :
                tb.a = p0;
             }
          }
          p0 = null;
          goto label_0021 ;
       }
       return;
    }
}
