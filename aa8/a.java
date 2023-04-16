package aa8.a;
import com.mini.ipc.a$c;
import com.mini.ipc.a$b;
import java.lang.String;
import com.mini.ipc.MiniIPCParams;
import java.lang.Object;
import com.mini.ipc.IPCResult;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.mini.channel.b;
import w78.d;
import android.os.Bundle;
import com.mini.ipc.a;

public final class a implements a$c	// class@000052
{
    public final a$b a;
    public final int b;
    public final String c;
    public final MiniIPCParams d;

    public void a(a$b p0,int p1,String p2,MiniIPCParams p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(IPCResult p0){
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       String str = this.c+this.d.a();
       if (!PatchProxy.isSupport(a$b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(tb), str, p0, ta, a$b.class, "3")) {
          ta.a.W3(tb).d(str, a.c(p0));
       }
       return;
    }
}
