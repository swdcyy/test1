package g22.e;
import o63.c;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialog;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import zj0.x;
import androidx.lifecycle.Lifecycle;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public class e implements c	// class@002a47
{
    public final LiveActivityBottomDialog b;

    public void e(LiveActivityBottomDialog p0){
       this.b = p0;
       super();
    }
    public Integer I2(){
       return null;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
    public x ea(){
       return null;
    }
    public Lifecycle getLifecycle(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLifecycle();
    }
    public void l0(boolean p0){
    }
    public void n0(){
    }
}
