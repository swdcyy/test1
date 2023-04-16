package bt6.b;
import java.lang.Object;
import android.view.View;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.graphics.Color;
import js6.b;
import fi0.c;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;

public final class b	// class@000600
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(View p0,LaunchModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       if (p0 != null) {
          String str = (p1 != null)? p1.e(): null;
          int i = 1;
          int i1 = (str == null || !str.length())? 1: 0;
          if (i1 != i) {
             try{
                p0.setBackgroundColor(Color.parseColor(str));
             }catch(java.lang.Exception e5){
                b.c.e(c.a, "parse color error ,the error color is "+str, e5);
             }
          }
       }
    }
}
