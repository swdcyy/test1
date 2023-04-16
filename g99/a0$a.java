package g99.a0$a;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ImmersiveStatus;
import java.lang.Enum;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarScrollStatus;

public class a0$a	// class@002438
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ImmersiveStatus.values().length];
       a0$a.b = ointArray;
       try{
          int i = 1;
          ointArray[ImmersiveStatus.DISABLED.ordinal()] = i;
          int i1 = 2;
          try{
             a0$a.b[ImmersiveStatus.DARK_TEXT.ordinal()] = i1;
             int i2 = 3;
             try{
                a0$a.b[ImmersiveStatus.LIGHT_TEXT.ordinal()] = i2;
                int[] ointArray1 = new int[ToolbarScrollStatus.values().length];
                try{
                   a0$a.a = ointArray1;
                   ointArray1[ToolbarScrollStatus.FULLY_SOLID.ordinal()] = i;
                   try{
                      a0$a.a[ToolbarScrollStatus.FULLY_TRANSPARENT.ordinal()] = e0;
                      try{
                         a0$a.a[ToolbarScrollStatus.IN_TRANSITION.ordinal()] = i2;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
