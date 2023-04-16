package ce9.a;
import java.lang.Runnable;
import ce9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements Runnable	// class@0005b6
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, a.class, "1")) {
          return;
       }
       this.b.d.finish();
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
