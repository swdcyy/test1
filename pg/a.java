package pg.a;
import java.lang.Runnable;
import java.lang.Object;
import com.frog.engine.download.DownloadAndroidManager;

public final class a implements Runnable	// class@002923
{
    public final int b;
    public final int c;

    public void a(int p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       DownloadAndroidManager.lambda$createCoTask$0(this.b, this.c);
    }
}
