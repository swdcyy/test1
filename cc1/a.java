package cc1.a;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;

public class a	// class@000493
{

    public void a(){
       super();
    }
    public static ViewGroup a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m1.f(p0, 0x7f0a220a);
    }
}
