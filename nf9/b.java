package nf9.b;
import erd.a;
import com.kwai.video.westeros.models.ServerMediaRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class b implements a	// class@003177
{
    public final ServerMediaRequest b;

    public void b(ServerMediaRequest p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ServerSwapController", "cancel request "+this.b.getKey(), objArray);
       return;
    }
}
