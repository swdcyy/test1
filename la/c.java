package la.c;
import java.util.TimerTask;
import com.contrarywind.view.WheelView;
import java.lang.Math;
import android.os.Handler;

public final class c extends TimerTask	// class@00253c
{
    public int b;
    public int c;
    public int d;
    public final WheelView e;

    public void c(WheelView p0,int p1){
       super();
       this.e = p0;
       this.d = p1;
       this.b = Integer.MAX_VALUE;
       this.c = 0;
    }
    public final void run(){
       if (this.b == Integer.MAX_VALUE) {
          this.b = this.d;
       }
       c tb = this.b;
       int i = (int)((float)tb * 0.10f);
       this.c = i;
       int i1 = 1;
       if (!i) {
          this.c = (tb < null)? -1: i1;
       }
    label_0021 :
       i = 3000;
       if (Math.abs(tb) <= i1) {
          this.e.a();
          this.e.getHandler().sendEmptyMessage(i);
       }else {
          tb = this.e;
          tb.setTotalScrollY((tb.getTotalScrollY() + (float)this.c));
          if (!this.e.f()) {
             float itemHeight = this.e.getItemHeight();
             float f = (float)(- this.e.getInitPosition()) * itemHeight;
             float f1 = (float)((this.e.getItemsCount() - i1) - this.e.getInitPosition()) * itemHeight;
             if (this.e.getTotalScrollY() - f <= 0 || this.e.getTotalScrollY() - f1 >= 0) {
                tb = this.e;
                tb.setTotalScrollY((tb.getTotalScrollY() - (float)this.c));
                this.e.a();
                this.e.getHandler().sendEmptyMessage(i);
                return;
             }
          }
          this.e.getHandler().sendEmptyMessage(1000);
          this.b = this.b - this.c;
       }
       return;
    }
}
