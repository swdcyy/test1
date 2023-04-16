package old.soloader.e$b$a;
import old.soloader.i$e;
import old.soloader.e$b;
import old.soloader.e$a;
import old.soloader.i$d;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.util.zip.ZipFile;
import old.soloader.i$b;

public final class e$b$a extends i$e	// class@002011
{
    public int b;
    public final e$b c;

    public void e$b$a(e$b p0){
       this.c = p0;
       super();
    }
    public boolean a(){
       this.c.e();
       boolean b = (this.b < this.c.b.length)? true: false;
       return b;
    }
    public i$d c(){
       this.c.e();
       e$b$a tc = this.c;
       e$b$a tb = this.b;
       this.b = tb + 1;
       object oobject = tc.b[tb];
       return new i$d(oobject, tc.c.getInputStream(oobject.d));
    }
}
