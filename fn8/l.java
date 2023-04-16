package fn8.l;
import fn8.l$a;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Math;
import java.lang.Double;

public class l	// class@00232e
{
    public long a;
    public long b;
    public double c;
    public double d;
    public float e;
    public float f;
    public boolean g;
    public int[] h;
    public l$a i;

    public void l(l$a p0){
       super();
       int[] ointArray = new int[2];
       this.h = ointArray;
       this.i = p0;
    }
    public final void a(){
       if (this.g != null) {
          this.g = false;
          l ti = this.i;
          if (ti != null) {
             ti.a(this);
          }
       }
       return;
    }
    public final void b(MotionEvent p0){
       this.b = this.a;
       this.a = p0.getEventTime();
       int i = p0.findPointerIndex(this.h[0]);
       int i1 = p0.findPointerIndex(this.h[1]);
       float x = p0.getX(i);
       float y = p0.getY(i);
       float x1 = p0.getX(i1);
       float y1 = p0.getY(i1);
       float f = x1 - x;
       float f1 = y1 - y;
       x = x + x1;
       this.e = x * 0x3f000000;
       this.f = (y + y1) * 0x3f000000;
       double d = - Math.atan2((double)f1, (double)f);
       this.d = (Double.isNaN(this.c))? 0: this.c - d;
       this.c = d;
       l td = this.d;
       if (td - 0x400921fb54442d18 > 0) {
          this.d = td - 0x400921fb54442d18;
       }else if(td - 0xc00921fb54442d18 < 0){
          this.d = td + 0x400921fb54442d18;
       }
       td = this.d;
       if (td - 0x3ff921fb54442d18 > 0) {
          this.d = td - 0x400921fb54442d18;
       }else if(td - 0xbff921fb54442d18 < 0){
          this.d = td + 0x400921fb54442d18;
       }
       return;
    }
}
