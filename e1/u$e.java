package e1.u$e;
import e1.u;
import android.view.View;
import e1.g;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Class;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import java.lang.reflect.Method;

public class u$e extends u	// class@001eba
{
    public boolean l;

    public void u$e(){
       super();
       this.l = false;
    }
    public boolean f(View p0,float p1,long p2,g p3){
       try{
          if (p0 instanceof MotionLayout) {
             p0.setProgress(this.b(p1, p2, p0, p3));
          }else if(this.l != null){
             return false;
          }else {
             int i = 1;
             try{
                Class[] uClassArray = new Class[i];
                uClassArray[0] = Float.TYPE;
                Method method = p0.getClass().getMethod("setProgress", uClassArray);
             }catch(java.lang.NoSuchMethodException e0){
                this.l = i;
             }
             if (e0 != null) {
                Object[] objArray = new Object[i];
                objArray[0] = Float.valueOf(this.b(p1, p2, p0, p3));
                e0.invoke(p0, objArray);
             }
          }
          return this.h;
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
}
