package m01.b$b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Enum;

public class b$b	// class@00309a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveGiftSortType.values().length];
       try{
          b$b.a = ointArray;
          ointArray[LiveGiftSortType.DEFAULT.ordinal()] = 1;
          try{
             b$b.a[LiveGiftSortType.DESC.ordinal()] = 2;
             try{
                b$b.a[LiveGiftSortType.ASC.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
