package m11.i;
import l11.j$a;
import m11.l;
import java.lang.Object;
import l11.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import no1.j;
import m11.h;
import java.lang.Iterable;
import z1.a;
import qo1.a;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import m11.g;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInfoUpdate;

public class i implements j$a	// class@003102
{
    public final l a;

    public void i(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       i.b(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_LINE, "onLineEnd");
       i ta = this.a;
       ta.c.c = false;
       a.b(ta.a, h.a);
       this.a.d("AUTHOR_END_ONLINE");
       return;
    }
    public void c(){
       i.a(this);
    }
    public void d(LiveLineChatMessages$SCLiveLineChatReady p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_LINE, "onLineReady");
       i ta = this.a;
       ta.c.c = true;
       a.b(ta.a, new g(p0));
       p0.g = false;
       return;
    }
    public void e(LiveLineChatMessages$SCLiveLineChatInfoUpdate p0){
       i.c(this, p0);
    }
}
