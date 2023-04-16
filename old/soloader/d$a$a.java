package old.soloader.d$a$a;
import old.soloader.i$e;
import old.soloader.d$a;
import old.soloader.i$d;
import java.io.FileInputStream;
import old.soloader.d$b;
import java.io.File;
import old.soloader.i$b;
import java.io.InputStream;

public final class d$a$a extends i$e	// class@00200c
{
    public int b;
    public final d$a c;

    public void d$a$a(d$a p0){
       this.c = p0;
       super();
    }
    public boolean a(){
       boolean b = (this.b < this.c.b.length)? true: false;
       return b;
    }
    public i$d c(){
       d$a$a tb = this.b;
       this.b = tb + 1;
       object oobject = this.c.b[tb];
       return new i$d(oobject, new FileInputStream(oobject.d));
    }
}
