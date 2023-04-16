package m11.a$b;
import w12.a$b;
import m11.a;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w12.a;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import l11.j$a;

public class a$b extends a$b	// class@0030f9
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public boolean d(Message p0){
       a$b obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != true) {
          return false;
       }
       obj = this.a;
       obj.t(obj.g);
       this.a.h.d(p0.obj);
       return true;
    }
}
