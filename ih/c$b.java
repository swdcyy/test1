package ih.c$b;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Path;

public final class c$b extends ThreadLocal	// class@0021eb
{

    public void c$b(){
       super();
    }
    public Object initialValue(){
       Path path = PatchProxy.apply(null, this, c$b.class, "1");
       if (path != PatchProxyResult.class) {
       }else {
          path = new Path();
       }
       return path;
    }
}
