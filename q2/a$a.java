package q2.a$a;
import android.os.Handler;
import q2.a;
import android.os.Looper;
import android.os.Message;

public class a$a extends Handler	// class@002954
{
    public final a a;

    public void a$a(a p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (p0.what != 1) {
          super.handleMessage(p0);
       }else {
          this.a.a();
       }
       return;
    }
}
