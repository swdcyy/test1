package k81.e;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;

public class e	// class@002cd6
{
    public final List a;

    public void e(){
       super();
       this.a = new ArrayList();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       b.c0(LiveLogTag.COMMENT, "log showed msg", "messageIds", this.a);
       this.a.clear();
       return;
    }
}
