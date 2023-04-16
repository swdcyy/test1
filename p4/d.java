package p4.d;
import android.os.IBinder$DeathRecipient;
import p4.c;
import java.lang.Object;
import android.os.IBinder;
import android.os.IInterface;

public class d implements IBinder$DeathRecipient	// class@0028b4
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void binderDied(){
       if (this.a.a != null) {
          this.a.a.asBinder().unlinkToDeath(this.a.i, 0);
          this.a.a = null;
       }
       return;
    }
}
