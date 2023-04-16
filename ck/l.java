package ck.l;
import android.view.View;
import a2.i0;
import android.graphics.PorterDuff$Mode;

public class l	// class@000d2f
{

    public static boolean a(View p0){
       boolean b = true;
       if (i0.B(p0) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static PorterDuff$Mode b(int p0,PorterDuff$Mode p1){
       if (p0 == 3) {
          return PorterDuff$Mode.SRC_OVER;
       }
       if (p0 == 5) {
          return PorterDuff$Mode.SRC_IN;
       }
       if (p0 == 9) {
          return PorterDuff$Mode.SRC_ATOP;
       }
       switch (p0){
           case 14:
             return PorterDuff$Mode.MULTIPLY;
           case 15:
             return PorterDuff$Mode.SCREEN;
           case 16:
             return PorterDuff$Mode.ADD;
           default:
             return p1;
       }
    }
}
