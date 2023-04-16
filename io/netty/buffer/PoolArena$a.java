package io.netty.buffer.PoolArena$a;
import io.netty.buffer.PoolArena$SizeClass;
import java.lang.Enum;

public class PoolArena$a	// class@00103e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PoolArena$SizeClass.values().length];
       try{
          PoolArena$a.a = ointArray;
          ointArray[PoolArena$SizeClass.Normal.ordinal()] = 1;
          try{
             PoolArena$a.a[PoolArena$SizeClass.Small.ordinal()] = 2;
             try{
                PoolArena$a.a[PoolArena$SizeClass.Tiny.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
