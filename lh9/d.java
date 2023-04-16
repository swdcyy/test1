package lh9.d;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import ekd.j0;

public class d	// class@002dea
{

    public void d(){
       super();
    }
    public static String a(Activity p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return str;
       }
       Intent intent = p0.getIntent();
       if (intent != null) {
          str = j0.f(intent, "toolboxJumpToKuaishanGroupId");
          intent.removeExtra("toolboxJumpToKuaishanGroupId");
       }
       return str;
    }
}
