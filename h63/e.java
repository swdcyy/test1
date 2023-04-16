package h63.e;
import h63.g$b;
import h63.g;
import h63.b;
import h63.g$a;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public class e extends g$b	// class@002c77
{
    public final g b;

    public void e(g p0){
       this.b = p0;
       super(p0, null);
    }
    public int b(){
       return this.b.f.d;
    }
    public Drawable c(){
       e obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       return g.b(obj.a, 0x7f081254, obj.f.b);
    }
    public Drawable d(){
       return null;
    }
    public int e(){
       return this.b.f.b;
    }
}
