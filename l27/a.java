package l27.a;
import java.io.Closeable;
import java.lang.Object;
import l27.a$a;
import com.kwai.library.wolverine.utility.ThreadUtils;
import java.lang.Runnable;

public abstract class a implements Closeable	// class@002c8d
{
    public boolean b;
    public f c;
    public final Runnable d;

    public void a(){
       super();
       this.d = new a$a(this);
    }
    public final void a(){
       if (this.b != null) {
          return;
       }
       ThreadUtils c = ThreadUtils.c;
       c.b(this.d);
       c.c(this.d, 0);
       return;
    }
    public void c(){
    }
    public final void close(){
       if (this.b != null) {
          return;
       }
       ThreadUtils.c.b(this.d);
       this.e();
       this.b = true;
       return;
    }
    public void e(){
    }
}
