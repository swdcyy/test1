package bx8.b;
import erd.g;
import bx8.j;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import f66.i;
import jq.a;
import q87.c;

public final class b implements g	// class@000470
{
    public final j b;
    public final boolean c;

    public void b(j p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("AuditInfoUploadManager", "upload file is ready", objArray);
       tb.e = p0;
       if (this.c != null) {
          Object[] objArray1 = new Object[i];
          a.b().s("AuditInfoUploadManager", "file is ready and need upload", objArray1);
          tb.c(p0, tb.d);
       }
       return;
    }
}
