package ce9.c;
import java.lang.Runnable;
import ce9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.magic.CameraMagicPlatformSchemeActivity;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class c implements Runnable	// class@0005ba
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "1")) {
          return;
       }
       CameraMagicPlatformSchemeActivity y = this.b.b.y;
       if (y != null) {
          y.dismiss();
       }
       this.b.b.finish();
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
