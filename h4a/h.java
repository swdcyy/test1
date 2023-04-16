package h4a.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$c;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import com.kwai.framework.player.core.b;

public final class h implements Runnable	// class@002563
{
    public final PLCLogHelper$c b;

    public void h(PLCLogHelper$c p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       PLCLogHelper$c b = tb.b;
       long l = 0;
       if (!b.x - l) {
          PLCLogHelper b1 = b.b;
          if (b1 != null) {
             l = b1.getDuration();
          }
          b.x = l;
       }
       PLCLogHelper$c b2 = tb.b;
       long l1 = b2.w + 1000;
       b2.w = l1;
       if (b2.v == null && l1 - b2.x >= 0) {
          b2.v = true;
          b2.a();
       }
       return;
    }
}
