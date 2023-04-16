package o11.a$a;
import l11.j$a;
import o11.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l11.i;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInfoUpdate;
import java.util.Objects;
import java.lang.Boolean;
import android.view.View;

public class a$a implements j$a	// class@003456
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void b(){
       i.d(this);
    }
    public void c(){
       i.a(this);
    }
    public void d(LiveLineChatMessages$SCLiveLineChatReady p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void e(LiveLineChatMessages$SCLiveLineChatInfoUpdate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       a$a ta = this.a;
       p0 = p0.mute;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, uoa, "5")) {
          a l = ta.L;
          int i = (p0 != null)? 0: 8;
          l.setVisibility(i);
       }
       return;
    }
}
