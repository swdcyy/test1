package io.netty.buffer.i$b;
import io.netty.buffer.PoolArena$SizeClass;
import java.lang.Enum;

public class i$b	// class@00105d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PoolArena$SizeClass.values().length];
       try{
          i$b.a = ointArray;
          ointArray[PoolArena$SizeClass.Normal.ordinal()] = 1;
          try{
             i$b.a[PoolArena$SizeClass.Small.ordinal()] = 2;
             try{
                i$b.a[PoolArena$SizeClass.Tiny.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
