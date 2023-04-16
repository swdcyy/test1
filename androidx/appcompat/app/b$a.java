package androidx.appcompat.app.b$a;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.reflect.Method;
import android.content.ContextWrapper;
import java.lang.StringBuilder;
import android.content.res.Resources;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public class b$a implements View$OnClickListener	// class@000586
{
    public final View b;
    public final String c;
    public Method d;
    public Context e;

    public void b$a(View p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(Context p0){
       Method method;
       String str;
       while (true) {
          if (p0 != null) {
             try{
                if (!p0.isRestricted()) {
                   Class[] uClassArray = new Class[]{View.class};
                   method = p0.getClass().getMethod(this.c, uClassArray);
                   if (method != null) {
                      this.d = method;
                      this.e = p0;
                      return;
                   }
                }
             }catch(java.lang.NoSuchMethodException e0){
             }
             if (p0 instanceof ContextWrapper) {
                p0 = p0.getBaseContext();
             }else {
                p0 = null;
             }
          }else {
             int id = this.b.getId();
             str = (id == -1)? "": " with id \'"+this.b.getContext().getResources().getResourceEntryName(id)+"\'";
             break ;
          }
       }
       throw new IllegalStateException("Could not find method "+this.c+"\(View\) in a parent or ancestor Context for android:onClick attribute defined on view "+this.b.getClass()+str);
    }
    public void onClick(View p0){
       if (this.d == null) {
          this.a(this.b.getContext());
       }
       try{
          Object[] objArray = new Object[]{p0};
          this.d.invoke(this.e, objArray);
          return;
       }catch(java.lang.IllegalAccessException e5){
          throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new IllegalStateException("Could not execute method for android:onClick", e5);
       }
    }
}
