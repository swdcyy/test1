package pg.b;
import java.lang.Runnable;
import java.lang.Object;
import com.frog.engine.download.DownloadAndroidManager$a;

public final class b implements Runnable	// class@002924
{
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    public void b(int p0,int p1,long p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       DownloadAndroidManager$a.a(this.b, this.c, this.d, this.e);
    }
}
