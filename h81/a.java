package h81.a;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import h81.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionLiveRouterJump;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionWebViewJump;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionKwaiUrlJump;

public class a	// class@002654
{

    public void a(){
       super();
    }
    public static b a(LiveCommentAction$Action p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       int entryCase = p0.getEntryCase();
       if (entryCase == 4) {
          return new b(entryCase, p0.getKwaiUrlJump().link);
       }
       if (entryCase == 5) {
          return new b(entryCase, p0.getWebViewJump());
       }
       if (entryCase != 6) {
          return obj;
       }
       return new b(entryCase, p0.getLiveRouterJump().link);
    }
}
