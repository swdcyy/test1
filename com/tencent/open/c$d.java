package com.tencent.open.c$d;
import android.os.Handler;
import com.tencent.open.c;
import com.tencent.open.c$c;
import android.os.Looper;
import android.os.Message;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.content.Context;

public class c$d extends Handler	// class@000f57
{
    public final c a;
    public c$c b;

    public void c$d(c p0,c$c p1,Looper p2){
       this.a = p0;
       super(p2);
       this.b = p1;
    }
    public void handleMessage(Message p0){
       SLog.d("openSDK_LOG.PKDialog", "msg = "+p0.what);
       Message what = p0.what;
       if (what != 1) {
          if (what != 2) {
             if (what != 3) {
                if (what == 5 && (c.a(this.a) != null && c.a(this.a).get() != null)) {
                   c.b(c.a(this.a).get(), p0.obj);
                }
             }else if(c.a(this.a) != null && c.a(this.a).get() != null){
                c.a(c.a(this.a).get(), p0.obj);
             }
          }else {
             this.b.onCancel();
          }
       }else {
          c$c.a(this.b, p0.obj);
       }
       return;
    }
}
