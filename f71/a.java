package f71.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class a	// class@0022c6
{

    public static final String a(SCInteractiveChatRoomInfo p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "scInteractiveChatRoomInfo";
       try{
          a.p(p0, obj);
          if (p0.extraInfoPb == null) {
             p0.extraInfoPb = "";
          }
          String str = Base64.encodeToString(MessageNano.toByteArray(p0), 0);
          a.o(str, "Base64.encodeToString\(\n ¡­o\),\n      Base64.DEFAULT\)");
          return str;
       }catch(java.lang.Exception e4){
          b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsInteractRoomInfoUpdate"), "getRoomInfoPbBase64String", e4);
          return "";
       }
    }
}
