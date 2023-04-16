package androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.s;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Math;

public class w	// class@000939
{

    public static int a(RecyclerView$y p0,s p1,View p2,View p3,RecyclerView$LayoutManager p4,boolean p5){
       if (p4.getChildCount() && (p0.c() && (p2 == null || p3 == null))) {
          return 0;
       }
       if (!p5) {
          return (Math.abs((p4.getPosition(p2) - p4.getPosition(p3))) + 1);
       }
       return Math.min(p1.o(), (p1.d(p3) - p1.g(p2)));
    }
    public static int b(RecyclerView$y p0,s p1,View p2,View p3,RecyclerView$LayoutManager p4,boolean p5,boolean p6){
       if (p4.getChildCount() && (p0.c() && (p2 == null || p3 == null))) {
          return 0;
       }
       int i = Math.min(p4.getPosition(p2), p4.getPosition(p3));
       int i1 = Math.max(p4.getPosition(p2), p4.getPosition(p3));
       int i2 = (p6)? Math.max(0, ((p0.c() - i1) - 1)): Math.max(0, i);
       if (!p5) {
          return i2;
       }else {
          return Math.round((((float)i2 * ((float)Math.abs((p1.d(p3) - p1.g(p2))) / (float)(Math.abs((p4.getPosition(p2) - p4.getPosition(p3))) + 1))) + (float)(p1.n() - p1.g(p2))));
       }
    }
    public static int c(RecyclerView$y p0,s p1,View p2,View p3,RecyclerView$LayoutManager p4,boolean p5){
       if (p4.getChildCount() && (p0.c() && (p2 == null || p3 == null))) {
          return 0;
       }
       if (!p5) {
          return p0.c();
       }
       return (int)(((float)(p1.d(p3) - p1.g(p2)) / (float)(Math.abs((p4.getPosition(p2) - p4.getPosition(p3))) + 1)) * (float)p0.c());
    }
}
