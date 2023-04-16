package dnd.a$a$a;
import java.lang.Runnable;
import dnd.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import wvc.a;

public final class a$a$a implements Runnable	// class@000ce0
{
    public final a$a b;

    public void a$a$a(a$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a$a.class, "1")) {
          return;
       }
       this.b.a.E().play();
       return;
    }
}
