package lz9.b0$a;
import java.lang.Runnable;
import lz9.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;

public class b0$a implements Runnable	// class@002ecb
{
    public final b0 b;

    public void b0$a(b0 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "1")) {
          return;
       }
       b0 d1 = this.b.d1;
       if (d1 != null) {
          d1.e();
       }
       return;
    }
}
