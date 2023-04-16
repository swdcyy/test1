package e3.g;
import android.widget.ImageView;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;
import java.lang.String;

public class g	// class@001ee4
{
    public static Method a;
    public static boolean b;
    public static Field c;
    public static boolean d;

    public static void a(ImageView p0,Matrix p1){
       if (p1 == null) {
          Drawable drawable = p0.getDrawable();
          if (drawable != null) {
             drawable.setBounds(0, 0, ((p0.getWidth() - p0.getPaddingLeft()) - p0.getPaddingRight()), ((p0.getHeight() - p0.getPaddingTop()) - p0.getPaddingBottom()));
             p0.invalidate();
          }
       }else {
          g.b();
          Method a = g.a;
          if (a != null) {
             int i = 1;
             try{
                Object[] objArray = new Object[i];
                objArray[0] = p1;
                a.invoke(p0, objArray);
             }catch(java.lang.IllegalAccessException e0){
             }catch(java.lang.reflect.InvocationTargetException e4){
                throw new RuntimeException(e4.getCause());
             }
          }
       }
       return;
    }
    public static void b(){
       if (!g.b) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Matrix.class;
             Method declaredMeth = ImageView.class.getDeclaredMethod("animateTransform", uClassArray);
             g.a = declaredMeth;
             declaredMeth.setAccessible(i);
             g.b = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
