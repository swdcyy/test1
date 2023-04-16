package k2b.x;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import k2b.d;

public abstract class x	// class@001bc5
{

    public void x(){
       super();
    }
    public static x b(ImmutableList p0,String p1,String p2,String p3,boolean p4,JsonElement p5,String p6,String p7){
       Object obj;
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5,p6,p7};
          obj = PatchProxy.apply(objArray, null, ox, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       d uod = new d(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public abstract String a();
    public abstract JsonElement c();
    public abstract ImmutableList d();
    public abstract String e();
    public abstract int f();
    public abstract String g();
    public abstract String h();
    public abstract String i();
}
