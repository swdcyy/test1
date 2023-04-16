package kv8.b;
import java.lang.Runnable;
import kv8.c;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import android.os.Message;
import com.alipay.sdk.app.PayTask;
import kv8.a;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.Map;
import android.os.Handler;

public final class b implements Runnable	// class@002c20
{
    public final c b;
    public final String c;

    public void b(c p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Message message = Message.obtain();
       message.what = 1;
       message.obj = new PayTask(tb.a.get()).payV2(this.c, 1);
       tb.c.sendMessage(message);
    }
}
