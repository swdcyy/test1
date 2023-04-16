package io.netty.util.internal.f$a;
import java.security.PrivilegedAction;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import io.netty.util.internal.f;
import java.lang.Throwable;
import ard.b;

public final class f$a implements PrivilegedAction	// class@001182
{

    public void f$a(){
       super();
    }
    public Object run(){
       Field declaredFiel;
       try{
          declaredFiel = String.class.getDeclaredField("value");
          declaredFiel.setAccessible(true);
       label_001f :
          return declaredFiel;
       }catch(java.lang.NoSuchFieldException e0){
          f.a.info("Failed to find String value array \(please report an issue\).String hash code optimizations are disabled.", e0);
       }catch(java.lang.SecurityException e0){
          f.a.debug("No permissions to get String value array.String hash code optimizations are disabled.", e0);
       }
       declaredFiel = null;
       goto label_001f ;
    }
}
