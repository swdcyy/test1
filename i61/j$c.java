package i61.j$c;
import com.kuaishou.live.bottombar.component.widget.LiveBottomBarWidgetStyle;
import java.lang.Enum;

public class j$c	// class@00283f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveBottomBarWidgetStyle.values().length];
       try{
          j$c.a = ointArray;
          ointArray[LiveBottomBarWidgetStyle.Grid.ordinal()] = 1;
          try{
             j$c.a[LiveBottomBarWidgetStyle.Audience.ordinal()] = 2;
             try{
                j$c.a[LiveBottomBarWidgetStyle.Normal.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
