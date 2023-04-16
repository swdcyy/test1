package bx8.a;
import erd.g;
import bx8.j;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import f66.i;
import jq.a;
import java.lang.String;
import q87.c;
import bx8.f;
import java.lang.Runnable;
import t45.c;
import crd.b;
import lnc.b9;

public final class a implements g	// class@00046f
{
    public final j b;

    public void a(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.b().s("AuditInfoUploadManager", "success", objArray);
       c.a(f.b);
       b9.a(tb.g);
    }
}
