package k02.g;
import w4.b;
import java.lang.String;
import android.graphics.Typeface;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import lnc.a1;
import ekd.d0;
import kotlin.jvm.internal.a;

public final class g extends b	// class@002c58
{

    public void g(){
       super();
    }
    public Typeface a(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Typeface typeface = d0.a("fonts/Alibaba-PuHuiTi-Bold.ttf", a1.c());
       if (typeface == null) {
          typeface = Typeface.DEFAULT;
          a.o(typeface, "Typeface.DEFAULT");
       }
       return typeface;
    }
    public String b(String p0){
       return "fonts/";
    }
}
