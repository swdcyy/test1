package aa8.c;
import com.mini.ipc.a$c;
import com.mini.ipc.a$d;
import java.lang.String;
import java.lang.Object;
import com.mini.ipc.IPCResult;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.mini.channel.b;
import w78.b;
import android.os.Bundle;
import com.mini.ipc.a;

public final class c implements a$c	// class@000054
{
    public final a$d a;
    public final String b;

    public void c(a$d p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(IPCResult p0){
       c ta = this.a;
       c tb = this.b;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(tb, p0, ta, a$d.class, "6")) {
       }else {
          ta.b.getChannel().d(tb, a.c(p0));
       }
       return;
    }
}
