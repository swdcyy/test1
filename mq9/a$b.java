package mq9.a$b;
import cm5.d;
import android.content.Context;
import erd.g;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import cm5.c;

public final class a$b implements d	// class@00306a
{
    public final Context a;
    public final g b;
    public final g c;

    public void a$b(Context p0,g p1,g p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       this.c.accept(p0);
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       d.a(-241623919).Tg(this.a, this.b, this.c);
       return;
    }
}
