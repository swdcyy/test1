package b82.c;
import tp5.c$a;
import b82.d;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class c implements c$a	// class@000366
{
    public final View a;
    public final ViewGroup b;
    public final d c;

    public void c(d p0,View p1,ViewGroup p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tc = this.c;
       tc.b = false;
       if (tc.e == null) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, "enter room v2 task end");
       this.b.removeView(this.a);
       tc = this.c;
       tc.e = null;
       if (!tc.e()) {
          this.c.d(false);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       this.c.d(this.a.getMeasuredHeight());
       return;
    }
}
