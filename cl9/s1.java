package cl9.s1;
import crd.b;
import cl9.r1;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class s1 implements b	// class@000667
{
    public final WeakReference b;
    public final r1 c;

    public void s1(r1 p0,WeakReference p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, s1.class, "1")) {
          return;
       }
       ProgressFragment progressFrag = this.b.get();
       if (progressFrag != null && progressFrag.isAdded()) {
          progressFrag.dismissAllowingStateLoss();
       }
       return;
    }
    public boolean isDisposed(){
       ProgressFragment obj = PatchProxy.apply(null, this, s1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.get();
       boolean b = (obj == null || !obj.isAdded())? true: false;
       return b;
    }
}
