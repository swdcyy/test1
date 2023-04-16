package dh9.a$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import dh9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kd9.s;

public final class a$a implements b$a	// class@001f34
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       s os = PatchProxy.apply(null, this, a$a.class, "1");
       if (os != PatchProxyResult.class) {
       }else {
          a$a ta = this.a;
          os = new s(false, ta.r, ta.s, ta.t);
       }
       return os;
    }
}
