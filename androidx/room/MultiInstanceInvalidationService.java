package androidx.room.MultiInstanceInvalidationService;
import android.app.Service;
import java.util.HashMap;
import androidx.room.MultiInstanceInvalidationService$a;
import androidx.room.MultiInstanceInvalidationService$b;
import android.content.Intent;
import android.os.IBinder;

public class MultiInstanceInvalidationService extends Service	// class@000945
{
    public int b;
    public final HashMap c;
    public final RemoteCallbackList d;
    public final v$a e;

    public void MultiInstanceInvalidationService(){
       super();
       this.b = 0;
       this.c = new HashMap();
       this.d = new MultiInstanceInvalidationService$a(this);
       this.e = new MultiInstanceInvalidationService$b(this);
    }
    public IBinder onBind(Intent p0){
       return this.e;
    }
}
