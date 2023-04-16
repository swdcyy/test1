package h22.t;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.o;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class t implements d$c	// class@002c0f
{
    public final o a;

    public void t(o p0){
       this.a = p0;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.a.z.setVisibility(0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       this.a.z.setVisibility(8);
       return;
    }
}
