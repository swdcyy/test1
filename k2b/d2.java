package k2b.d2;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.NetworkChangeReceiver;
import android.content.Context;
import java.lang.Object;
import java.util.Objects;
import android.net.NetworkInfo;
import ekd.p0;

public final class d2 implements Runnable	// class@001b92
{
    public final NetworkChangeReceiver b;
    public final Context c;

    public void d2(NetworkChangeReceiver p0,Context p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d2 tb = this.b;
       Objects.requireNonNull(tb);
       NetworkInfo networkInfo = p0.e(this.c);
       if (networkInfo != null) {
          if (networkInfo.isConnected()) {
             int type = networkInfo.getType();
             if (type) {
                tb.a = (type != 1)? 0: 2;
             }else {
                tb.a = 6;
             }
          }else {
             tb.a = 1;
          }
       }else {
          tb.a = 0;
       }
       return;
    }
}
