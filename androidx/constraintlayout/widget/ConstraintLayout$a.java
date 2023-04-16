package androidx.constraintlayout.widget.ConstraintLayout$a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.lang.Enum;

public class ConstraintLayout$a	// class@0006b5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ConstraintWidget$DimensionBehaviour.values().length];
       try{
          ConstraintLayout$a.a = ointArray;
          ointArray[ConstraintWidget$DimensionBehaviour.FIXED.ordinal()] = 1;
          try{
             ConstraintLayout$a.a[ConstraintWidget$DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
             try{
                ConstraintLayout$a.a[ConstraintWidget$DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
                try{
                   ConstraintLayout$a.a[ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
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
