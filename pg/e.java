package pg.e;
import java.lang.Runnable;
import java.lang.Exception;
import java.lang.Object;
import com.frog.engine.download.DownloadAndroidManager$a;

public final class e implements Runnable	// class@002927
{
    public final int b;
    public final int c;
    public final Exception d;

    public void e(int p0,int p1,Exception p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       DownloadAndroidManager$a.a(this.b, this.c, this.d);
    }
}
