package ih.c$a;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.PathMeasure;

public final class c$a extends ThreadLocal	// class@0021ea
{

    public void c$a(){
       super();
    }
    public Object initialValue(){
       PathMeasure pathMeasure = PatchProxy.apply(null, this, c$a.class, "1");
       if (pathMeasure != PatchProxyResult.class) {
       }else {
          pathMeasure = new PathMeasure();
       }
       return pathMeasure;
    }
}
