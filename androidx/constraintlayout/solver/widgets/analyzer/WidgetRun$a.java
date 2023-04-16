package androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.lang.Enum;

public class WidgetRun$a	// class@000694
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ConstraintAnchor$Type.values().length];
       try{
          WidgetRun$a.a = ointArray;
          ointArray[ConstraintAnchor$Type.LEFT.ordinal()] = 1;
          try{
             WidgetRun$a.a[ConstraintAnchor$Type.RIGHT.ordinal()] = 2;
             try{
                WidgetRun$a.a[ConstraintAnchor$Type.TOP.ordinal()] = 3;
                try{
                   WidgetRun$a.a[ConstraintAnchor$Type.BASELINE.ordinal()] = 4;
                   try{
                      WidgetRun$a.a[ConstraintAnchor$Type.BOTTOM.ordinal()] = 5;
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
