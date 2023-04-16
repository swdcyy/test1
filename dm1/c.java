package dm1.c;
import java.lang.Runnable;
import dm1.d;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.System;
import java.lang.StringBuilder;
import dm1.i;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import java.util.Iterator;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements Runnable	// class@001fc2
{
    public final d b;
    public final List c;
    public final boolean d;
    public final String e;

    public void c(d p0,List p1,boolean p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       Gift gift;
       c tb = this.b;
       c td = this.d;
       c te = this.e;
       Objects.requireNonNull(tb);
       long l = System.currentTimeMillis();
       String str = "Live_GiftCache_NewStrategy_"+i.c();
       BatteryMonitor.startSection(str, true);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          gift = iterator.next();
          tb.a(gift, gift.mImageUrl, td, te);
       }
       BatteryMonitor.stopSection(str, true);
       b.P(LiveLogTag.GIFT_STORE.appendTag("LiveGiftIconCacheManager"), " start download all gift icon time is "+(System.currentTimeMillis() - l));
       return;
    }
}
