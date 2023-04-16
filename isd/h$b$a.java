package isd.h$b$a;
import isd.h$a;
import isd.h$b;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import isd.h;
import isd.h$c;
import msd.l;
import java.lang.Boolean;
import kotlin.io.AccessDeniedException;
import nsd.u;
import msd.p;
import qrd.l1;

public final class h$b$a extends h$a	// class@001508
{
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final h$b f;

    public void h$b$a(h$b p0,File p1){
       a.p(p1, "rootDir");
       this.f = p0;
       super(p1);
    }
    public File b(){
       h c;
       File uFile = null;
       boolean b = true;
       if (this.e == null && this.c == null) {
          c = this.f.e.c;
          if (c != null && !c.invoke(this.a()).booleanValue()) {
             return uFile;
          }else {
             File[] uFileArray = this.a().listFiles();
             this.c = uFileArray;
             if (uFileArray == null) {
                c = this.f.e.e;
                if (c != null) {
                   AccessDeniedException uAccessDenie = new AccessDeniedException(this.a(), null, "Cannot list files in a directory", 2, null);
                   l1 ol1 = c.invoke(this.a(), v10);
                }
                this.e = b;
             }
          }
       }
       h$b$a tc = this.c;
       if (tc != null) {
          a.m(tc);
          if (this.d < tc.length) {
             tc = this.c;
             a.m(tc);
             h$b$a td = this.d;
             this.d = td + 1;
             return tc[td];
          }
       }
       if (this.b == null) {
          this.b = b;
          return this.a();
       }else {
          c = this.f.e.d;
          if (c != null) {
             c.invoke(this.a());
          }
          return uFile;
       }
    }
}
