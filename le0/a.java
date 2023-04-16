package le0.a;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.debugtool.entry.DebugToolEntryView;
import ne0.a;
import android.view.View;
import android.view.WindowManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import lnc.i9;
import android.app.Application;
import o56.a;
import android.util.AttributeSet;
import nsd.u;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class a	// class@002ed5
{
    public static DebugToolEntryView a;
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void a(Activity p0){
       DebugToolEntryView a;
       DebugToolEntryView j;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       a.p(p0, "activity");
       a = a.a;
       boolean b = false;
       a uoa1 = 1;
       if (a != null && a.k == uoa1) {
          if (!PatchProxy.applyVoid(null, this, uoa, "3")) {
             DebugToolEntryView a1 = a.a;
             if (a1 != null) {
                String str = "7";
                if (!PatchProxy.applyVoid(null, a1, DebugToolEntryView.class, str)) {
                   j = a1.j;
                   if (j == null || (!PatchProxy.applyVoid(null, j, a.class, str) && j.h != null)) {
                      j.h = b;
                      a g = j.g;
                      uoa = j.b;
                      if (uoa == null) {
                         a.S("mDTPageView");
                      }
                      g.removeView(uoa);
                   }
                label_0055 :
                   a1.j = null;
                   a1.k = b;
                   a1.c.removeView(a1);
                }
             }
             a.a = null;
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")){
          Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(i9.a(p0.getApplicationContext())){
             b = true;
          }else {
             i9.d(p0);
          }
          if (b && a.a == null) {
             Application uApplication = a.b();
             a.o(uApplication, "context");
             j = new DebugToolEntryView(uApplication, null, 2, null);
             a.a = j;
             a.m(j);
             if (!PatchProxy.applyVoid(null, j, DebugToolEntryView.class, "6")) {
                j.c.addView(j, j.a());
                j.k = uoa1;
             }
          }
       }
    label_00bc :
       return;
    }
}
