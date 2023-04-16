package pg.c;
import java.lang.Runnable;
import java.io.ByteArrayOutputStream;
import java.lang.Object;
import com.frog.engine.download.DownloadAndroidManager$a;

public final class c implements Runnable	// class@002925
{
    public final int b;
    public final int c;
    public final ByteArrayOutputStream d;

    public void c(int p0,int p1,ByteArrayOutputStream p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       DownloadAndroidManager$a.a(this.b, this.c, this.d);
    }
}
