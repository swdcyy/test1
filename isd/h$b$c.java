package isd.h$b$c;
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
import qrd.l1;
import kotlin.io.AccessDeniedException;
import nsd.u;
import msd.p;

public final class h$b$c extends h$a	// class@00150a
{
    public boolean b;
    public File[] c;
    public int d;
    public final h$b e;

    public void h$b$c(h$b p0,File p1){
       a.p(p1, "rootDir");
       this.e = p0;
       super(p1);
    }
    public File b(){
       h c;
       File uFile = null;
       if (this.b == null) {
          c = this.e.e.c;
          if (c != null && !c.invoke(this.a()).booleanValue()) {
             return uFile;
          }else {
             this.b = true;
             return this.a();
          }
       }else {
          h$b$c tc = this.c;
          if (tc != null) {
             a.m(tc);
             if (this.d >= tc.length) {
                c = this.e.e.d;
                if (c != null) {
                   c.invoke(this.a());
                }
                return uFile;
             }
          }
          if (this.c == null) {
             File[] uFileArray = this.a().listFiles();
             this.c = uFileArray;
             if (uFileArray == null) {
                c = this.e.e.e;
                if (c != null) {
                   AccessDeniedException uAccessDenie = new AccessDeniedException(this.a(), null, "Cannot list files in a directory", 2, null);
                   l1 ol1 = c.invoke(this.a(), v9);
                }
             }
             tc = this.c;
             if (tc != null) {
                a.m(tc);
                if (tc.length) {
                label_0094 :
                   tc = this.c;
                   a.m(tc);
                   h$b$c td = this.d;
                   this.d = td + 1;
                   return tc[td];
                }
             }
             c = this.e.e.d;
             if (c != null) {
                c.invoke(this.a());
             }
             return uFile;
          }else {
             goto label_0094 ;
          }
       }
    }
}
