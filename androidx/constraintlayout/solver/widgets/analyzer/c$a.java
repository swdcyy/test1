package androidx.constraintlayout.solver.widgets.analyzer.c$a;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType;
import java.lang.Enum;

public class c$a	// class@000698
{
    public static final int[] a;

    static {
       int[] ointArray = new int[WidgetRun$RunType.values().length];
       try{
          c$a.a = ointArray;
          ointArray[WidgetRun$RunType.START.ordinal()] = 1;
          try{
             c$a.a[WidgetRun$RunType.END.ordinal()] = 2;
             try{
                c$a.a[WidgetRun$RunType.CENTER.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
