package uv8.b;
import z1.k;
import com.yxcorp.gifshow.App;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.lang.Object;
import android.content.Intent;

public final class b implements k	// class@002626
{
    public final App b;
    public final BroadcastReceiver c;
    public final IntentFilter d;

    public void b(App p0,BroadcastReceiver p1,IntentFilter p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object get(){
       return App.b(this.b, this.c, this.d);
    }
}
