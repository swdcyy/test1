package mq9.a$a;
import cm5.d;
import msd.l;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import cm5.c;

public final class a$a implements d	// class@003069
{
    public final l a;

    public void a$a(l p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.invoke(new ArrayList());
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       d.a(-241623919).yk(this.a);
       return;
    }
}
