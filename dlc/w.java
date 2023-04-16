package dlc.w;
import java.lang.Runnable;
import dlc.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.View;

public class w implements Runnable	// class@002278
{
    public final s b;

    public void w(s p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       if (this.b.J.isAdded()) {
          this.b.s.setVisibility(0);
       }
       this.b.r.setVisibility(8);
       return;
    }
}
