package ard.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.System;
import java.lang.IllegalStateException;

public class a	// class@000226
{
    public final String a;
    public final Throwable b;
    public final Object[] c;
    public static final a d;

    static {
       a.d = new a(null);
    }
    public void a(String p0){
       super(p0, null, null);
    }
    public void a(String p0,Object[] p1,Throwable p2){
       super();
       this.a = p0;
       this.b = p2;
       if (p2 == null) {
          this.c = p1;
       }else if(p1 != null && p1.length){
          int i = p1.length - 1;
          Object[] objArray = new Object[i];
          System.arraycopy(p1, 0, objArray, 0, i);
          this.c = objArray;
       }else {
          throw new IllegalStateException("non-sensical empty or null argument array");
       }
       return;
    }
    public String a(){
       return this.a;
    }
    public Throwable b(){
       return this.b;
    }
}
