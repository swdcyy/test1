package a88.g;
import com.mini.ipc.a$f;
import com.mini.codescan.CodeScanManagerImpl;
import java.lang.Object;
import com.mini.ipc.IPCParams;
import com.mini.ipc.a$c;
import aa8.d;
import com.mini.codescan.ipc.QRIPCParams;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zi8.b1;
import brd.g;

public final class g implements a$f	// class@00004e
{
    public final CodeScanManagerImpl a;

    public void g(CodeScanManagerImpl p0){
       this.a = p0;
    }
    public void a(IPCParams p0,a$c p1){
       d.a(this, p0, p1);
    }
    public final void b(IPCParams p0){
       g ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, CodeScanManagerImpl.class, "3")) {
       }else {
          CodeScanManagerImpl b = ta.b;
          if (b != null) {
             b.onNext(b1.a(p0.g));
             ta.b.onComplete();
          }
       }
       return;
    }
}
