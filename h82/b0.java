package h82.b0;
import z61.b;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h82.a0;
import com.google.gson.JsonObject;

public class b0 extends b	// class@002cc7
{
    public String a;
    public r0 b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public View$OnClickListener l;
    public m m;

    public void b0(){
       super();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.j = false;
       this.k = false;
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.a;
    }
    public void update(JsonObject p0){
    }
}
