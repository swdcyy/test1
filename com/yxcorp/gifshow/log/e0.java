package com.yxcorp.gifshow.log.e0;
import java.lang.Object;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import com.yxcorp.gifshow.log.e0$a;

public class e0	// class@0011de
{
    public Queue a;

    public void e0(){
       super();
       this.a = new ConcurrentLinkedQueue();
    }
    public synchronized List a(){
       LinkedList obj = PatchProxy.apply(null, this, e0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       e0 ta = this.a;
       if (ta != null && ta.size() > 0) {
          Log.b("RetryLogBuffer", "initSubProcessReportLogBinderHook mPendingMessageQueue for-s size"+this.a.size());
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             e0$a uoa = iterator.next();
             if (uoa != null) {
                obj.add(uoa);
             }
          }
       }
       return obj;
    }
}
