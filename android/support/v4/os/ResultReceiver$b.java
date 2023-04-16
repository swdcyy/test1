package android.support.v4.os.ResultReceiver$b;
import android.support.v4.os.a$a;
import android.support.v4.os.ResultReceiver;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver$c;
import java.lang.Runnable;
import android.os.Handler;

public class ResultReceiver$b extends a$a	// class@000409
{
    public final ResultReceiver a;

    public void ResultReceiver$b(ResultReceiver p0){
       this.a = p0;
       super();
    }
    public void W0(int p0,Bundle p1){
       ResultReceiver$b ta = this.a;
       ResultReceiver c = ta.c;
       if (c != null) {
          c.post(new ResultReceiver$c(ta, p0, p1));
       }else {
          ta.a(p0, p1);
       }
       return;
    }
}
