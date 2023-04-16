package unc.h;
import android.view.GestureDetector$SimpleOnGestureListener;
import lnc.a1;
import android.view.MotionEvent;
import java.lang.Math;

public abstract class h extends GestureDetector$SimpleOnGestureListener	// class@003df5
{
    public final int b;
    public int c;

    public void h(){
       super();
       this.b = 200;
       this.c = a1.e(60.00f);
    }
    public boolean a(){
       return false;
    }
    public abstract boolean b();
    public abstract boolean c();
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (p0 == null || p1 == null) {
          return false;
       }
       if (Math.abs((p0.getX() - p1.getX())) - (Math.abs((p0.getY() - p1.getY())) * 2.00f) < 0) {
          return this.a();
       }
       if ((p0.getX() - p1.getX()) - (float)this.c > 0 && Math.abs(p2) - 0x43480000 > 0) {
          return this.b();
       }
       if ((p1.getX() - p0.getX()) - (float)this.c > 0 && Math.abs(p2) - 0x43480000 > 0) {
          return this.c();
       }
       return this.a();
    }
}
