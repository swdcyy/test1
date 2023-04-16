package me9.m$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import me9.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import me9.s;
import me9.m$c;
import com.google.gson.JsonObject;
import java.util.concurrent.ConcurrentHashMap;

public final class m$a implements b$a	// class@003001
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       s os = PatchProxy.apply(null, this, m$a.class, "1");
       if (os != PatchProxyResult.class) {
       }else {
          boolean b = false;
          m$a uoa = ((this.a.d.a()).length() > 0)? 1: null;
          if (uoa) {
             if (this.a.d.b() == null) {
                uoa = this.a;
                if (uoa.c.get(uoa.d.a()) == null) {
                label_0042 :
                   os = new s(b);
                }
             }
             b = true;
             goto label_0042 ;
          }else {
             goto label_0042 ;
          }
       }
       return os;
    }
}
