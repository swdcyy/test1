package fu2.b;
import fu2.f;
import mw1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fu2.e;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class b implements f	// class@0029e4
{
    public final c b;

    public void b(c p0){
       a.p(p0, "playerViewService");
       super();
       this.b = p0;
    }
    public void a(){
       e.a(this);
    }
    public void b(LivePlayerController p0,LivePlayTextureView p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "1")) {
          return;
       }
       a.p(p0, "controller");
       b tb = this.b;
       tb.c(null);
       tb.c(p1);
       tb.p();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tb = this.b;
       tb.c(null);
       tb.p();
       return;
    }
    public void onRelease(){
       e.b(this);
    }
}
