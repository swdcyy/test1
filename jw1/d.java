package jw1.d;
import lnc.a1;
import java.lang.Object;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import va1.l0;

public class d	// class@002c19
{
    public static final int a;

    static {
       d.a = a1.e(0x3f800000);
    }
    public void d(){
       super();
    }
    public static void a(TextView p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uod, "1")) {
          return;
       }
       int a = d.a;
       float f = (float)a;
       float f1 = (float)a;
       p0.setShadowLayer(f, f1, (float)a, l0.c(a1.a(p1), 0x3f000000));
       return;
    }
}
