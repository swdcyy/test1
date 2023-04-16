package a2.g;
import android.graphics.Rect;
import android.view.Gravity;

public final class g	// class@00005c
{

    public static void a(int p0,int p1,int p2,Rect p3,Rect p4,int p5){
       Gravity.apply(p0, p1, p2, p3, p4, p5);
    }
    public static int b(int p0,int p1){
       return Gravity.getAbsoluteGravity(p0, p1);
    }
}
