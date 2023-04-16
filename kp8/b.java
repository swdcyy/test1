package kp8.b;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import android.view.View;
import android.graphics.drawable.Drawable;

public class b	// class@002c09
{

    public void b(){
       super();
    }
    public static float[] a(int p0,Rect p1){
       float[] obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = ((p0 % 360) + 360) % 360;
       obj = new float[4];
       float f = (float)(p1.left + p1.right) / 2.00f;
       float f1 = (float)(p1.top + p1.bottom) / 2.00f;
       int i = p0 / 45;
       p0 = p0 % 45;
       float f2 = (float)Math.tan(Math.toRadians((double)p0));
       float f3 = (float)Math.tan(Math.toRadians((double)(p0 - 45)));
       switch (i){
           case 0:
             f2 = f2 * f;
             obj[0] = (float)p1.left;
             obj[1] = f1 + f2;
             obj[2] = (float)p1.right;
             obj[3] = f1 - f2;
             break;
           case 1:
             f = f - (f3 * f1);
             obj[0] = f;
             obj[1] = (float)p1.bottom;
             obj[2] = (float)p1.right - f;
             obj[3] = (float)p1.top;
             break;
           case 2:
             f2 = f2 * f1;
             obj[0] = f + f2;
             obj[1] = (float)p1.bottom;
             obj[2] = f - f2;
             obj[3] = (float)p1.top;
             break;
           case 3:
             f1 = f1 - (f3 * f);
             obj[0] = (float)p1.right;
             obj[1] = (float)p1.bottom - f1;
             obj[2] = (float)p1.left;
             obj[3] = f1;
             break;
           case 4:
             f2 = f2 * f;
             obj[2] = (float)p1.left;
             obj[3] = f1 + f2;
             obj[0] = (float)p1.right;
             obj[1] = f1 - f2;
             break;
           case 5:
             f = f - (f3 * f1);
             obj[2] = f;
             obj[3] = (float)p1.bottom;
             obj[0] = (float)p1.right - f;
             obj[1] = (float)p1.top;
             break;
           case 6:
             f2 = f2 * f1;
             obj[2] = f + f2;
             obj[3] = (float)p1.bottom;
             obj[0] = f - f2;
             obj[1] = (float)p1.top;
             break;
           case 7:
             f1 = f1 - (f3 * f);
             obj[2] = (float)p1.right;
             obj[3] = (float)p1.bottom - f1;
             obj[0] = (float)p1.left;
             obj[1] = f1;
             break;
           default:
       }
       return obj;
    }
    public static void b(View p0,Drawable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       p0.setBackground(p1);
       return;
    }
}
