package b3.b;
import a3.c;
import android.content.Context;
import java.lang.String;
import a3.c$a;
import java.lang.Object;
import b3.b$a;
import b3.a;
import android.os.Build$VERSION;
import java.io.File;
import android.database.sqlite.SQLiteOpenHelper;
import a3.b;

public class b implements c	// class@0002b5
{
    public final Context b;
    public final String c;
    public final c$a d;
    public final boolean e;
    public final Object f;
    public b$a g;
    public boolean h;

    public void b(Context p0,String p1,c$a p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = new Object();
    }
    public final b$a a(){
       b tf = this.f;
       _monitor_enter(tf);
       if (this.g == null) {
          a[] uoaArray = new a[1];
          this.g = (Build$VERSION.SDK_INT >= 23 && (this.c != null && this.e != null))? new b$a(this.b, new File(this.b.getNoBackupFilesDir(), this.c).getAbsolutePath(), uoaArray, this.d): new b$a(this.b, this.c, uoaArray, this.d);
          this.g.setWriteAheadLoggingEnabled(this.h);
       }
       _monitor_exit(tf);
       return this.g;
    }
    public void close(){
       this.a().close();
    }
    public b e0(){
       return this.a().e();
    }
    public String getDatabaseName(){
       return this.c;
    }
    public void setWriteAheadLoggingEnabled(boolean p0){
       b tf = this.f;
       _monitor_enter(tf);
       b tg = this.g;
       if (tg != null) {
          tg.setWriteAheadLoggingEnabled(p0);
       }
       this.h = p0;
       _monitor_exit(tf);
       return;
    }
    public b z3(){
       return this.a().a();
    }
}
