package io.reactivex.internal.schedulers.i$b;
import java.lang.Runnable;
import java.lang.Object;
import java.util.ArrayList;
import io.reactivex.internal.schedulers.i;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class i$b implements Runnable	// class@001944
{

    public void i$b(){
       super();
    }
    public void run(){
       Iterator iterator = new ArrayList(i.d.keySet()).iterator();
       while (iterator.hasNext()) {
          ScheduledThreadPoolExecutor scheduledThr = iterator.next();
          if (scheduledThr.isShutdown()) {
             i.d.remove(scheduledThr);
          }else {
             scheduledThr.purge();
          }
       }
       return;
    }
}
