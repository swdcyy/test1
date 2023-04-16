package ix8.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;

public final class b implements Runnable	// class@002731
{
    public final RandomCoinDialog b;

    public void b(RandomCoinDialog p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       RandomCoinDialog z = this.b.z;
       if (z == null) {
          a.S("mLottieFirework");
       }
       z.s();
       return;
    }
}
