package c24.k0;
import ms3.c;
import java.lang.String;
import java.lang.Object;
import ms3.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Number;

public final class k0 implements c	// class@000485
{
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    public void k0(String p0,long p1,String p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public String a(){
       return this.c;
    }
    public c$a b(){
       Object obj = PatchProxy.apply(null, this, k0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public View c(){
       Object obj = PatchProxy.apply(null, this, k0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public String getContent(){
       return this.a;
    }
    public long getDuration(){
       return this.b;
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, k0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public String getIconUrl(){
       return this.d;
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, k0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
}
