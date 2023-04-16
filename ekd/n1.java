package ekd.n1;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.lang.StringBuilder;
import java.lang.String;
import android.content.res.Resources;
import java.lang.Exception;
import android.content.Context;
import com.yxcorp.utility.Log;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.StateListDrawable;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Integer;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;

public class n1	// class@000d63
{
    public static final int[] a;

    static {
       n1.a = new int[7]{0x7f07042c,0x7f070426,0x7f070429,0x7f07042a,0x7f07042b,0x7f070420,0x7f070421};
    }
    public static void a(View p0,int p1){
       n1.c(p0, n1.d(p1));
    }
    public static Drawable b(View p0,Drawable p1,int p2){
       if (p1 == null || (p2 > 0 && p1 instanceof GradientDrawable)) {
          p1.setCornerRadius((float)p2);
          if (p2 > 0) {
             StringBuilder str = "configGradientRoundedDrawable\(\)";
             String str1 = "\n";
             try{
                str+str1;
                str1 = p0.getResources().getResourceEntryName(p0.getId());
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
                str1 = "";
             }
             Log.b("ViewUtilsRounded", str+"View id name => "+str1+", package => "+p0.getContext().getPackageName()+", radius => "+p2);
          }
       }
       return p1;
    }
    public static void c(View p0,int p1){
       if (p0 == null || (p0.getBackground() != null && p1 > 0)) {
          Drawable uDrawable = p0.getBackground().getConstantState().newDrawable().mutate();
          if (uDrawable instanceof StateListDrawable) {
             if (uDrawable != null && p1 > 0) {
                try{
                   Class[] uClassArray = new Class[0];
                   Class[] uClassArray1 = new Class[]{Integer.TYPE};
                   Method method = uDrawable.getClass().getMethod("getStateDrawable", uClassArray1);
                   Object[] objArray = new Object[0];
                   int i = uDrawable.getClass().getMethod("getStateCount", uClassArray).invoke(uDrawable, objArray).intValue();
                   if (i > 0) {
                      for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                         Object[] objArray1 = new Object[]{Integer.valueOf(i1)};
                         n1.b(p0, method.invoke(uDrawable, objArray1), p1);
                      }
                      p0.setBackgroundDrawable(uDrawable);
                   }
                }catch(java.lang.Exception e8){
                   e8.printStackTrace();
                }
             }
          }else {
             p0.setBackgroundDrawable(n1.b(p0, uDrawable, p1));
          }
       }
    }
    public static int d(int p0){
       return (p0 / 2);
    }
    public static int e(Context p0,AttributeSet p1,int p2){
       if (p0 != null && p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.b6);
          int intx = typedArray.getInt(2, -1);
          if (intx >= 0) {
             int[] a = n1.a;
             if (intx < a.length) {
                p2 = (int)p0.getResources().getDimension(a[intx]);
             }
          }
          typedArray.recycle();
       }
       return p2;
    }
}
