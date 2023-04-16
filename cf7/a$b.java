package cf7.a$b;
import android.view.Choreographer$FrameCallback;
import java.lang.Object;
import android.os.Build$VERSION;
import cf7.a$a;
import android.os.Handler;
import cf7.a;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class a$b implements Choreographer$FrameCallback	// class@000541
{
    public static final a$b b;

    static {
       a$b.b = new a$b();
    }
    public void a$b(){
       super();
    }
    public void doFrame(long p0){
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       a$a.a.removeMessages(0);
       a.a.c();
       Log.g("BarrierJankFixer", "FrameCallback - removeAllSyncBarriers");
       return;
    }
}
