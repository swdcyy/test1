package bk8.b$a;
import android.os.IBinder$DeathRecipient;
import bk8.b;
import java.lang.Object;
import java.lang.String;
import android.util.Slog;
import android.os.IBinder;

public class b$a implements IBinder$DeathRecipient	// class@000426
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void binderDied(){
       Slog.w("OMediaManager", "omedia server die.");
       b$a ta = this.a;
       b a = ta.a;
       if (a != null) {
          a.unlinkToDeath(ta.b, 0);
          this.a.a = null;
       }
       b.d = null;
       return;
    }
}
