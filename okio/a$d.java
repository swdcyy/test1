package okio.a$d;
import okio.n;
import okio.a;
import java.lang.Object;
import java.io.IOException;
import okio.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.o;
import java.lang.StringBuilder;

public final class a$d implements n	// class@0020eb
{
    public final a b;
    public final n c;

    public void a$d(a p0,n p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void close(){
       a$d tb = this.b;
       try{
          tb.enter();
          this.c.close();
          this.b.exit$jvm(true);
          return;
       }catch(java.io.IOException e0){
          throw this.b.exit$jvm(e0);
       }
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       a$d tb = this.b;
       try{
          tb.enter();
          this.b.exit$jvm(true);
          return this.c.read(p0, p1);
       }catch(java.io.IOException e2){
          throw this.b.exit$jvm(e2);
       }
    }
    public o timeout(){
       return this.b;
    }
    public String toString(){
       return "AsyncTimeout.source\("+this.c+')';
    }
}
