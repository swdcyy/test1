package knd.j$b;
import j85.e;
import knd.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import zt7.d;

public final class j$b implements e	// class@0017e7
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "onSignalReceive: uid: "+p0+" signal: "+p1+" extra: "+p2, objArray);
       this.a.f().j(p2);
       return;
    }
}
