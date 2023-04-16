package d0b.d;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.graphics.Typeface;

public final class d	// class@00240d
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void a(String p0,TextView[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "2")) {
          return;
       }
       a.p(p1, "textViews");
       int len = p1.length;
       int i = 0;
       while (i < len) {
          try{
             object oobject = p1[i];
             if (!PatchProxy.isSupport(d.class) || (!PatchProxy.applyVoidThreeRefs(oobject, p0, Integer.valueOf(0), null, d.class, "1") && oobject != null)) {
                oobject.setTypeface(Typeface.create(p0, 0));
             }
          label_003a :
             i = i + 1;
          }catch(java.lang.IndexOutOfBoundsException e0){
          }
       }
       return;
    }
}
