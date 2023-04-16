package ck.e;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.Class;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;

public class e	// class@000d1a
{
    public static Method a;
    public static boolean b;

    public static boolean a(DrawableContainer p0,Drawable$ConstantState p1){
       return e.b(p0, p1);
    }
    public static boolean b(DrawableContainer p0,Drawable$ConstantState p1){
       Object[] objArray;
       if (!e.b) {
          try{
             Class[] uClassArray = new Class[]{DrawableContainer$DrawableContainerState.class};
             Method declaredMeth = DrawableContainer.class.getDeclaredMethod("setConstantState", uClassArray);
             e.a = declaredMeth;
             declaredMeth.setAccessible(1);
             e.b = true;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
