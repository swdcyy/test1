package e1.i$g;
import e1.i;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Class;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import java.lang.reflect.Method;

public class i$g extends i	// class@001e8d
{
    public boolean h;

    public void i$g(){
       super();
       this.h = false;
    }
    public void f(View p0,float p1){
       try{
          if (p0 instanceof MotionLayout) {
             p0.setProgress(this.a(p1));
          }else if(this.h != null){
             return;
          }else {
             int i = 1;
             try{
                Class[] uClassArray = new Class[i];
                uClassArray[0] = Float.TYPE;
                Method method = p0.getClass().getMethod("setProgress", uClassArray);
             }catch(java.lang.NoSuchMethodException e0){
                this.h = i;
             }
             if (e0 != null) {
                Object[] objArray = new Object[i];
                objArray[0] = Float.valueOf(this.a(p1));
                e0.invoke(p0, objArray);
             }
          }
          return;
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
}
