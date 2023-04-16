package h71.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sz1.e;
import lp3.c;
import hh3.d;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatInfoUpdate;
import h71.c$a;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;

public final class c extends AbstractLiveJsCommand	// class@00262f
{

    public void c(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       c$a uoa;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.g(e.class).Sj();
       a.o(p0, "getService\(LiveMultiInte¡­iveInteractMediaProcessor");
       p0 = p0.q();
       if (p0 != null) {
          try{
             uoa = new c$a(Base64.encodeToString(MessageNano.toByteArray(p0), 0));
          label_0047 :
             return m$a.g(m.g, uoa, 0, 2, null);
          }catch(java.lang.Exception e7){
             b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsCmdGetInteractChatMediaInfo"), "getPbBase64String", e7);
          }
          uoa = null;
          goto label_0047 ;
       }else {
          goto label_0046 ;
       }
    }
}
