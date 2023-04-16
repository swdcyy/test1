package cc5.a$b;
import com.kwai.component.kwailink.http.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import bc5.a;

public final class a$b extends a	// class@000690
{
    public final long b;

    public void a$b(long p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       a.b((System.currentTimeMillis() - this.b), p0);
       return;
    }
}
