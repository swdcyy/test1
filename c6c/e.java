package c6c.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.protector.ProtectorDialogActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import o56.a;
import android.content.Context;
import o56.f;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class e implements Runnable	// class@00053a
{
    public final ProtectorDialogActivity b;

    public void e(ProtectorDialogActivity p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.z.dismiss();
       f.d(a.B);
       this.b.finish();
       return;
    }
}
