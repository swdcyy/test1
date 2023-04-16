package isd.h$b$b;
import isd.h$c;
import isd.h$b;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class h$b$b extends h$c	// class@001509
{
    public boolean b;
    public final h$b c;

    public void h$b$b(h$b p0,File p1){
       a.p(p1, "rootFile");
       this.c = p0;
       super(p1);
    }
    public File b(){
       if (this.b != null) {
          return null;
       }
       this.b = true;
       return this.a();
    }
}
