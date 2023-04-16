package uv8.d;
import z1.k;
import com.yxcorp.gifshow.App;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.lang.String;
import android.os.Handler;
import java.lang.Object;
import android.content.Intent;

public final class d implements k	// class@00262a
{
    public final App b;
    public final BroadcastReceiver c;
    public final IntentFilter d;
    public final String e;
    public final Handler f;

    public void d(App p0,BroadcastReceiver p1,IntentFilter p2,String p3,Handler p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object get(){
       return App.a(this.b, this.c, this.d, this.e, this.f);
    }
}
