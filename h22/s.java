package h22.s;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.o;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class s implements d$c	// class@002c0e
{
    public final o a;

    public void s(o p0){
       this.a = p0;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       this.a.y.setVisibility(0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       this.a.y.setVisibility(8);
       return;
    }
}
