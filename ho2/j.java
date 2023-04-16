package ho2.j;
import android.graphics.drawable.Animatable;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class j implements Animatable	// class@002de7
{
    public final LottieAnimationView b;

    public void j(LottieAnimationView p0){
       this.b = p0;
       super();
    }
    public boolean isRunning(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.p();
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.b.y();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.b.r();
       return;
    }
}
