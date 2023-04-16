package c68.c$a;
import java.lang.Runnable;
import c68.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.d;
import java.lang.Integer;
import yd8.b;
import h88.c;

public class c$a implements Runnable	// class@0003ba
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, c$a.class, "1")) {
          d.c("#PageLoading#", "showErrorInTimeout: ");
          this.b.c(Integer.valueOf(0x49f9f), this.b.f, b.a(0x49f9f, ""));
          this.b.h = true;
       }
       return;
    }
}
