package f3b.s$a;
import com.yxcorp.gifshow.log.utils.DeviceSampleEnum;
import java.lang.Enum;

public class s$a	// class@002890
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DeviceSampleEnum.values().length];
       try{
          s$a.a = ointArray;
          ointArray[DeviceSampleEnum.DEVICE_SAMPLE_TENTH.ordinal()] = 1;
          try{
             s$a.a[DeviceSampleEnum.DEVICE_SAMPLE_HALF.ordinal()] = 2;
             try{
                s$a.a[DeviceSampleEnum.DEVICE_SAMPLE_HUNDREDTH.ordinal()] = 3;
                try{
                   s$a.a[DeviceSampleEnum.DEVICE_SAMPLE_THOUSANDTH.ordinal()] = 4;
                   try{
                      s$a.a[DeviceSampleEnum.DEVICE_SAMPLE_TEN_THOUSANDTH.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
