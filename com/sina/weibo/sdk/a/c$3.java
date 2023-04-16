package com.sina.weibo.sdk.a.c$3;
import com.sina.weibo.sdk.a.c$c;
import com.sina.weibo.sdk.a.c;
import com.sina.weibo.sdk.a.c$d;
import java.lang.Object;
import java.util.concurrent.FutureTask;
import com.sina.weibo.sdk.a.c$a;
import android.os.Message;
import android.os.Handler;
import java.lang.RuntimeException;
import java.lang.String;

public final class c$3 extends c$c	// class@000b91
{
    public final c Q;

    public void c$3(c p0,c$d p1){
       this.Q = p0;
       super(p0, p1);
    }
    public final int compareTo(Object p0){
       return 0;
    }
    public final void done(){
       String str = "An error occur while execute doInBackground\(\).";
       try{
          c$3 tQ = this.Q;
          Object[] objArray = new Object[]{this.get()};
          tQ.x.obtainMessage(1, new c$a(tQ, objArray)).sendToTarget();
          return;
       }catch(java.lang.InterruptedException e0){
          throw new RuntimeException(e0);
       }catch(java.util.concurrent.ExecutionException e0){
          throw new RuntimeException(e0);
       }catch(java.util.concurrent.CancellationException e0){
          this.Q.x.obtainMessage(3, new c$a(this.Q, null)).sendToTarget();
          return;
       }
    }
}
