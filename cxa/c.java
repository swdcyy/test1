package cxa.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.a;
import java.lang.Object;
import java.lang.String;
import dc5.c;
import java.util.Iterator;
import java.util.List;
import cxa.m;

public final class c implements Runnable	// class@0023f5
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       if (tb.b == null) {
       }else {
          c.g("IMRTCMedia", "onStopRequestedNotify");
          Iterator iterator = tb.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().d();
          }
          tb.b = false;
       }
       return;
    }
}
