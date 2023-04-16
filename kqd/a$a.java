package kqd.a$a;
import io.netty.util.ResourceLeakDetector$Level;
import java.lang.Enum;

public class a$a	// class@001b50
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ResourceLeakDetector$Level.values().length];
       try{
          a$a.a = ointArray;
          ointArray[ResourceLeakDetector$Level.SIMPLE.ordinal()] = 1;
          try{
             a$a.a[ResourceLeakDetector$Level.ADVANCED.ordinal()] = 2;
             try{
                a$a.a[ResourceLeakDetector$Level.PARANOID.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
