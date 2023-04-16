package zu8.g;
import java.lang.Runnable;
import com.yxcorp.experiment.logger.a;
import java.lang.Object;
import java.util.Objects;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import yb7.n;
import com.yxcorp.experiment.logger.LogEventHelper$1;
import android.content.IntentFilter;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class g implements Runnable	// class@00297c
{
    public final a b;

    public void g(a p0){
       this.b = p0;
    }
    public final void run(){
       try{
          g tb = this.b;
          Objects.requireNonNull(tb);
          Context uContext = Azeroth2.B.d();
          if (!n.c(uContext)) {
          }else {
             UniversalReceiver.e(uContext, new LogEventHelper$1(tb), new IntentFilter("com.yxcorp.experiment.logger.LogEventHelper.logUsage"));
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
