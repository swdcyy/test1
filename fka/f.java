package fka.f;
import java.lang.String;
import java.lang.Object;
import jga.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;

public class f	// class@002961
{
    public final int a;
    public final String b;
    public int c;
    public JsonObject d;
    public c e;
    public f f;
    public f g;

    public void f(int p0,int p1,String p2){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
    }
    public c a(){
       return this.e;
    }
    public int b(){
       return this.c;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b() > 0)? true: false;
       return b;
    }
    public void d(JsonObject p0){
       this.d = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b+"-"+this.b();
    }
}
