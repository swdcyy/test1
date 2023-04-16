package c00.c;
import okhttp3.Callback;
import c00.d;
import tx4.i;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import c00.b;
import java.lang.Runnable;
import ekd.k1;
import okhttp3.Response;

public class c implements Callback	// class@0002de
{
    public final i a;
    public final d b;

    public void c(d p0,i p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       if (this.a != null) {
          String str = "tachikoma";
          if (this.b.k != null) {
             Log.g(str, "get onFailure callback2JS");
             k1.o(new b(p1, this.a));
          }else {
             Log.g(str, "get onFailure disable callback2JS");
          }
       }
       return;
    }
    public void onResponse(Call p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       this.b.k(p1, this.a);
       return;
    }
}
