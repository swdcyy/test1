package la.a;
import java.util.TimerTask;
import com.contrarywind.view.WheelView;
import java.lang.Math;
import android.os.Handler;

public final class a extends TimerTask	// class@00253a
{
    public float b;
    public final float c;
    public final WheelView d;

    public void a(WheelView p0,float p1){
       super();
       this.d = p0;
       this.c = p1;
       this.b = 0x4f000000;
    }
    public final void run(){
       int i = 0;
       if (!this.b - 0x4f000000) {
          float f = 0x44fa0000;
          if (Math.abs(this.c) - f > 0) {
             if (this.c - i <= 0) {
                f = 0xc4fa0000;
             }
             this.b = f;
          }else {
             this.b = this.c;
          }
       }
       if (Math.abs(this.b) - i >= 0 && Math.abs(this.b) - 20.00f <= 0) {
          this.d.a();
          this.d.getHandler().sendEmptyMessage(2000);
          return;
       }else {
          a td = this.d;
          float f1 = (float)(int)(this.b / 100.00f);
          td.setTotalScrollY((td.getTotalScrollY() - f1));
          if (!this.d.f()) {
             float itemHeight = this.d.getItemHeight();
             float f2 = (float)(- this.d.getInitPosition()) * itemHeight;
             float f3 = (float)((this.d.getItemsCount() - 1) - this.d.getInitPosition()) * itemHeight;
             double d = (double)itemHeight * 0x3fd0000000000000;
             if (((double)this.d.getTotalScrollY() - d) - (double)f2 < 0) {
                f2 = this.d.getTotalScrollY() + f1;
             }else if(((double)this.d.getTotalScrollY() + d) - (double)f3 > 0){
                f3 = this.d.getTotalScrollY() + f1;
             }
             if (this.d.getTotalScrollY() - f2 <= 0) {
                this.b = 40.00f;
                this.d.setTotalScrollY((float)(int)f2);
             }else if(this.d.getTotalScrollY() - f3 >= 0){
                this.d.setTotalScrollY((float)(int)f3);
                this.b = -40.00f;
             }
          }
          a tb = this.b;
          this.b = (tb - i < 0)? tb + 20.00f: tb - 20.00f;
          this.d.getHandler().sendEmptyMessage(1000);
          return;
       }
    }
}
