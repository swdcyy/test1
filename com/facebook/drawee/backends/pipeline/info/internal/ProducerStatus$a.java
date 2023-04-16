package com.facebook.drawee.backends.pipeline.info.internal.ProducerStatus$a;
import com.facebook.drawee.backends.pipeline.info.internal.ProducerStatus;
import java.lang.Enum;

public class ProducerStatus$a	// class@00107e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ProducerStatus.values().length];
       try{
          ProducerStatus$a.a = ointArray;
          ointArray[ProducerStatus.SUCCESS.ordinal()] = 1;
          try{
             ProducerStatus$a.a[ProducerStatus.ERROR.ordinal()] = 2;
             try{
                ProducerStatus$a.a[ProducerStatus.CANCELED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
