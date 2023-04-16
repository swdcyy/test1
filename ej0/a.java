package ej0.a;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.Window;

public final class a	// class@002171
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final View a(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "activity");
       Window window = p0.getWindow();
       a.o(window, "activity.window");
       View view = PatchProxy.applyOneRefs(window, null, uoa, "2");
       if (view != patchProxyRe) {
       }else {
          a.p(window, "window");
          view = window.getDecorView().findViewById(0x1020002);
       }
       return view;
    }
}
