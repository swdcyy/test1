package lg9.b;
import com.yxcorp.gifshow.dialog.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public class b extends c	// class@002de0
{

    public void b(){
       super();
    }
    public boolean Ku(Fragment p0,PostDialogPlugin$DialogScenario p1,Runnable p2,View p3){
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2.booleanValue();
       }
       a.p(p0, "fragment");
       a.p(p1, "dialogScenario");
       return false;
    }
}
