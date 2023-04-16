package androidx.room.n;
import a3.c;
import v2.o;
import androidx.room.a;
import java.lang.Object;
import androidx.room.n$a;
import java.lang.Exception;
import x2.e;
import a3.b;
import java.lang.String;

public final class n implements c, o	// class@000273
{
    public final c b;
    public final n$a c;
    public final a d;

    public void n(c p0,a p1){
       super();
       this.b = p0;
       this.d = p1;
       p1.f(p0);
       this.c = new n$a(p1);
    }
    public a a(){
       return this.d;
    }
    public void close(){
       try{
          this.c.close();
          return;
       }catch(java.io.IOException e0){
          e.a(e0);
          throw null;
       }
    }
    public b e0(){
       this.c.K();
       return this.c;
    }
    public String getDatabaseName(){
       return this.b.getDatabaseName();
    }
    public c getDelegate(){
       return this.b;
    }
    public void setWriteAheadLoggingEnabled(boolean p0){
       this.b.setWriteAheadLoggingEnabled(p0);
    }
    public b z3(){
       this.c.K();
       return this.c;
    }
}
