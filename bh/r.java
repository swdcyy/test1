package bh.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class r	// class@000b40
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public void r(){
       super();
    }
    public static r a(View p0){
       Object obj = null;
       r obj1 = PatchProxy.applyOneRefs(p0, obj, r.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new r();
       obj1.a = p0.getScaleX();
       obj1.b = p0.getScaleY();
       obj1.e = p0.getAlpha();
       obj1.f = p0.getRotation();
       obj1.c = p0.getTranslationX();
       obj1.d = p0.getTranslationY();
       return obj1;
    }
}
