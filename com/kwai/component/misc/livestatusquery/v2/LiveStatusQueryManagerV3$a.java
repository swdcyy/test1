package com.kwai.component.misc.livestatusquery.v2.LiveStatusQueryManagerV3$a;
import com.kwai.component.misc.livestatusquery.v2.LiveStatusQueryManagerV3$QueryStrategy;
import java.lang.Enum;

public class LiveStatusQueryManagerV3$a	// class@0009d1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveStatusQueryManagerV3$QueryStrategy.values().length];
       try{
          LiveStatusQueryManagerV3$a.a = ointArray;
          ointArray[LiveStatusQueryManagerV3$QueryStrategy.FOREGROUND_ACTIVE.ordinal()] = 1;
          try{
             LiveStatusQueryManagerV3$a.a[LiveStatusQueryManagerV3$QueryStrategy.FOREGROUND_NON_ACTIVE.ordinal()] = 2;
             try{
                LiveStatusQueryManagerV3$a.a[LiveStatusQueryManagerV3$QueryStrategy.BACKGROUND_ACTIVE.ordinal()] = 3;
                try{
                   LiveStatusQueryManagerV3$a.a[LiveStatusQueryManagerV3$QueryStrategy.BACKGROUND_NON_ACTIVE.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
