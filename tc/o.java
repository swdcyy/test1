package tc.o;
import ab.h;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Runtime;
import java.lang.Math;
import tc.w;

public class o implements h	// class@0024c1
{
    public static final long a;

    static {
       o.a = TimeUnit.MINUTES.toMillis(5);
    }
    public void o(){
       super();
    }
    public Object get(){
       int i1;
       int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 0x7fffffff);
       if (i < 0x1000000) {
          i1 = 0x100000;
       }else if(i < 0x2000000){
          i1 = 0x200000;
       }else {
          i1 = 0x400000;
       }
       w ow = new w(i1, Integer.MAX_VALUE, i1, Integer.MAX_VALUE, (i1 / 8), o.a);
       return v0;
    }
}
