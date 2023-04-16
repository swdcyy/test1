package e3.s;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import e3.r;
import e3.q;
import e3.t;

public class s	// class@001ef1
{
    public static Method a;
    public static boolean b;

    public static int a(ViewGroup p0,int p1){
       Object[] objArray;
       int i = 0;
       int i1 = 2;
       if (!s.b) {
          try{
             Class[] uClassArray = new Class[i1];
             Class tYPE = Integer.TYPE;
             uClassArray[i] = tYPE;
             uClassArray[1] = tYPE;
             Method declaredMeth = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", uClassArray);
             s.a = declaredMeth;
             declaredMeth.setAccessible(1);
             s.b = true;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static r b(ViewGroup p0){
       return new q(p0);
    }
    public static void c(ViewGroup p0,boolean p1){
       t.b(p0, p1);
    }
}
