package b58.l;
import java.lang.Object;
import java.util.ArrayList;
import b58.w;
import b58.o;
import crd.a;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import com.mini.filemanager.b;
import n88.b;
import com.mini.d;

public class l	// class@000306
{
    public final List a;
    public final q b;
    public final o c;
    public final a d;
    public boolean e;

    public void l(){
       super();
       this.a = new ArrayList();
       this.b = new w(this);
       this.c = new o();
       this.d = new a();
    }
    public File a(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(a.d.b().a.a0().b0(d.n()));
    }
}
