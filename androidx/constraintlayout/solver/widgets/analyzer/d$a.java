package androidx.constraintlayout.solver.widgets.analyzer.d$a;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType;
import java.lang.Enum;

public class d$a	// class@00069a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[WidgetRun$RunType.values().length];
       try{
          d$a.a = ointArray;
          ointArray[WidgetRun$RunType.START.ordinal()] = 1;
          try{
             d$a.a[WidgetRun$RunType.END.ordinal()] = 2;
             try{
                d$a.a[WidgetRun$RunType.CENTER.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
