package com.kwai.performance.stability.crash.monitor.anr.async.b$c;
import android.os.Handler$Callback;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import java.lang.Object;
import android.os.Message;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils$MessageParsed;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import yf7.h;
import com.kwai.performance.stability.crash.monitor.anr.async.b$e;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import java.lang.Throwable;
import android.util.Log;

public class b$c implements Handler$Callback	// class@0011a8
{
    public Handler$Callback b;
    public final b c;

    public void b$c(b p0,Handler$Callback p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public final void a(Message p0){
       MessageUtils$MessageParsed messageParse = MessageUtils.p(p0, false);
       Message message = Message.obtain(p0);
       h.d("AsyncSchedule", "handleMessage\(Callback\) | Message "+p0+", "+messageParse+", origin hash = "+Integer.toHexString(p0.hashCode())+", new hash = "+Integer.toHexString(message.hashCode()));
       p0.what = p0.what * -1;
       message.arg2 = 0x666666;
       this.c.d.b(message, messageParse);
    }
    public final boolean b(Message p0){
       b$c tb = this.b;
       if (tb != null) {
          return tb.handleMessage(p0);
       }
       return false;
    }
    public boolean handleMessage(Message p0){
       String str = String.valueOf(p0);
       h.d("AsyncSchedule", "handleMessage\(Log\) | Message = "+str);
       if (p0.arg2 == 0x666666) {
          return this.b(p0);
       }
       if (this.c.b.enableServiceSchedule == null || (MessageUtils.n(p0) || MessageUtils.m(p0))) {
          this.a(p0);
          return true;
       }else if(this.c.b.enableReceiverSchedule != null && MessageUtils.j(p0)){
          this.a(p0);
          return true;
       }else {
          return this.b(p0);
       }
    }
}
