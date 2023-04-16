package h63.c;
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

public class c extends g$b	// class@002c73
{
    public final g b;

    public void c(g p0){
       this.b = p0;
       super(p0, null);
    }
    public int b(){
       return this.b.f.e;
    }
    public Drawable c(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       return g.b(obj.a, 0x7f081254, obj.f.a);
    }
    public Drawable d(){
       return null;
    }
    public int e(){
       return this.b.f.a;
    }
}
