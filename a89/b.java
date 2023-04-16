package a89.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b implements Runnable	// class@000058
{
    public final KpMidPlayerController b;

    public void b(KpMidPlayerController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.r();
       return;
    }
}
