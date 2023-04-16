package androidx.room.MultiInstanceInvalidationService$a;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.u;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import android.os.IInterface;

public class MultiInstanceInvalidationService$a extends RemoteCallbackList	// class@000943
{
    public final MultiInstanceInvalidationService a;

    public void MultiInstanceInvalidationService$a(MultiInstanceInvalidationService p0){
       this.a = p0;
       super();
    }
    public void a(u p0,Object p1){
       this.a.c.remove(Integer.valueOf(p1.intValue()));
    }
    public void onCallbackDied(IInterface p0,Object p1){
       this.a(p0, p1);
    }
}
