package bwd.a;
import bwd.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.String;
import org.greenrobot.eventbus.ThreadMode;
import awd.i;
import java.lang.reflect.Method;
import org.greenrobot.eventbus.EventBusException;
import java.lang.StringBuilder;

public abstract class a implements c	// class@00036a
{
    public final Class a;
    public final Class b;
    public final boolean c;

    public void a(Class p0,Class p1,boolean p2){
       super();
       this.a = p0;
       this.b = null;
       this.c = p2;
    }
    public Class a(){
       return this.a;
    }
    public boolean c(){
       return this.c;
    }
    public c d(){
       a tb = this.b;
       if (tb == null) {
          return null;
       }
       try{
          return tb.newInstance();
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
       throw new RuntimeException(e0);
    }
    public i e(String p0,Class p1,ThreadMode p2,int p3,boolean p4){
       try{
          Class[] uClassArray = new Class[]{p1};
          i oi = new i(this.a.getDeclaredMethod(p0, uClassArray), p1, p2, p3, p4);
          return p0;
       }catch(java.lang.NoSuchMethodException e10){
          throw new EventBusException("Could not find subscriber method in "+this.a+". Maybe a missing ProGuard rule?", e10);
       }
    }
}
