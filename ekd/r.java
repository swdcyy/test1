package ekd.r;
import android.graphics.Color;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.animation.ValueAnimator;
import ekd.r$a;
import android.animation.TypeEvaluator;

public class r	// class@000d75
{

    public static int a(int p0,int p1,float p2){
       int i = Color.alpha(p0);
       int i1 = Color.red(p0);
       int i2 = Color.green(p0);
       p0 = Color.blue(p0);
       float f = (float)i;
       float f1 = (float)i1;
       f1 = (float)i2;
       f1 = (float)p0;
       return Color.argb((int)(f + ((float)(Color.alpha(p1) - i) * p2)), (int)(f1 + ((float)(Color.red(p1) - i1) * p2)), (int)(f1 + ((float)(Color.green(p1) - i2) * p2)), (int)(f1 + ((float)(Color.blue(p1) - p0) * p2)));
    }
    public static int b(Context p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getColor(p1);
       }
       return p0.getResources().getColor(p1);
    }
    public static ValueAnimator c(int[] p0){
       ValueAnimator valueAnimato = new ValueAnimator();
       valueAnimato.setIntValues(p0);
       valueAnimato.setEvaluator(r$a.a());
       return valueAnimato;
    }
    public static int d(int p0,int p1){
       return ((p0 << 24) | (p1 & 0xffffff));
    }
}
