package b9c.z;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class z	// class@0003f4
{

    public void z(){
       super();
    }
    public static void a(Fragment p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, z.class, "1")) {
          return;
       }
       if (p0 instanceof BaseFragment) {
          p0.bh(false);
       }
       if (p1 instanceof BaseFragment) {
          p1.bh(true);
       }
       return;
    }
}
