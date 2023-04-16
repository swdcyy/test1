package pg.d;
import java.lang.Runnable;
import java.io.IOException;
import java.lang.Object;
import com.frog.engine.download.DownloadAndroidManager$a;

public final class d implements Runnable	// class@002926
{
    public final int b;
    public final int c;
    public final IOException d;

    public void d(int p0,int p1,IOException p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       DownloadAndroidManager$a.a(this.b, this.c, this.d);
    }
}
