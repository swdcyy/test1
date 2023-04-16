package pb.d$a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel;
import java.lang.Enum;

public class d$a	// class@002907
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbstractDraweeControllerBuilder$CacheLevel.values().length];
       try{
          d$a.a = ointArray;
          ointArray[AbstractDraweeControllerBuilder$CacheLevel.FULL_FETCH.ordinal()] = 1;
          try{
             d$a.a[AbstractDraweeControllerBuilder$CacheLevel.DISK_CACHE.ordinal()] = 2;
             try{
                d$a.a[AbstractDraweeControllerBuilder$CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
