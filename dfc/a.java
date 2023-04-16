package dfc.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public final class a	// class@00219c
{
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public List e;
    public String f;
    public int g;
    public boolean h;

    public void a(){
       super();
       this.f = "";
       this.g = 0;
    }
    public static a a(String p0,int p1,boolean p2){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.a = true;
       obj.f = p0;
       obj.g = p1;
       obj.h = p2;
       return obj;
    }
}
