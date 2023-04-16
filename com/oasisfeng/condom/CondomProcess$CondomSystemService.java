package com.oasisfeng.condom.CondomProcess$CondomSystemService;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import com.oasisfeng.condom.CondomProcess;
import java.util.Arrays;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;

public class CondomProcess$CondomSystemService implements InvocationHandler	// class@000a91
{
    public final Object b;
    public final String c;
    public final boolean d;

    public void CondomProcess$CondomSystemService(Object p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       if (this.d != null) {
          p1.getName();
          if (p2 != null) {
             Arrays.deepToString(p2);
          }
       }
       try{
          return p1.invoke(this.b, p2);
       }catch(java.lang.reflect.InvocationTargetException e1){
          throw e1.getTargetException();
       }
    }
}
