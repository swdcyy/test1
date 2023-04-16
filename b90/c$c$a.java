package b90.c$c$a;
import java.lang.Runnable;
import b90.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import b90.c;
import android.app.Activity;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;

public final class c$c$a implements Runnable	// class@000aed
{
    public final c$c b;

    public void c$c$a(c$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$c$a.class, "1")) {
          return;
       }
       this.b.a.dismissAllowingStateLoss();
       c$c$a tb = this.b;
       c.b.b(tb.b, tb.c, tb.d);
       return;
    }
}
