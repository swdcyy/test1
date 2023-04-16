package io.netty.util.internal.a;
import java.lang.Class;
import ard.b;
import ard.c;
import java.nio.ByteBuffer;
import io.netty.util.internal.f;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import sun.misc.Cleaner;

public final class a	// class@001122
{
    public static final long a;
    public static final b b;

    static {
       long l;
       a.b = c.a(a.class);
       int i = 1;
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(i);
       String str = -1;
       if (f.n()) {
          Field declaredFiel = uByteBuffer.getClass().getDeclaredField("cleaner");
          declaredFiel.setAccessible(i);
          declaredFiel.get(uByteBuffer).clean();
          l = f.o(declaredFiel);
       }else {
          l = str;
       }
       b b = a.b;
       String str1 = (l - str)? "available": "unavailable";
       b.debug("java.nio.ByteBuffer.cleaner\(\): {}", str1);
       a.a = l;
       a.a(uByteBuffer);
    }
    public void a(){
       super();
    }
    public static void a(ByteBuffer p0){
       long a = a.a;
       if (a - -1 && p0.isDirect()) {
          Cleaner uCleaner = f.k(p0, a);
          if (uCleaner != null) {
             uCleaner.clean();
          }
       }
       return;
    }
}
