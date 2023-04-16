package com.kuaishou.bowl.event.LaunchEvent$a;
import com.kuaishou.bowl.event.LaunchEvent$DynamicType;
import java.lang.Enum;

public class LaunchEvent$a	// class@0011fe
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LaunchEvent$DynamicType.values().length];
       try{
          LaunchEvent$a.a = ointArray;
          ointArray[LaunchEvent$DynamicType.ERA.ordinal()] = 1;
          try{
             LaunchEvent$a.a[LaunchEvent$DynamicType.LINK.ordinal()] = 2;
             try{
                LaunchEvent$a.a[LaunchEvent$DynamicType.LIVE_DY.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
