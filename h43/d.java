package h43.d;
import z61.b;
import h43.e;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h43.c;
import com.google.gson.JsonObject;

public class d extends b	// class@002c3c
{
    public e a;

    public void d(){
       super();
       this.a = new e();
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public void update(JsonObject p0){
    }
}
