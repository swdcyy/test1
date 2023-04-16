package fu2.d;
import fu2.f;
import java.lang.Object;
import fu2.e;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public class d implements f	// class@0029e6
{

    public void d(){
       super();
    }
    public void a(){
       e.a(this);
    }
    public void b(LivePlayerController p0,LivePlayTextureView p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "1")) {
          return;
       }
       a.p(p0, "controller");
       p0.setTextureView(p1, p2);
       p0.setEnableAutoUpdateViewSize(true);
       return;
    }
    public void d(){
       e.c(this);
    }
    public void onRelease(){
       e.b(this);
    }
}
