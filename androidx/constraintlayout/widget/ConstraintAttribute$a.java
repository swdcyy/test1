package androidx.constraintlayout.widget.ConstraintAttribute$a;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.lang.Enum;

public class ConstraintAttribute$a	// class@0006b0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ConstraintAttribute$AttributeType.values().length];
       try{
          ConstraintAttribute$a.a = ointArray;
          ointArray[ConstraintAttribute$AttributeType.COLOR_TYPE.ordinal()] = 1;
          try{
             ConstraintAttribute$a.a[ConstraintAttribute$AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
             try{
                ConstraintAttribute$a.a[ConstraintAttribute$AttributeType.INT_TYPE.ordinal()] = 3;
                try{
                   ConstraintAttribute$a.a[ConstraintAttribute$AttributeType.FLOAT_TYPE.ordinal()] = 4;
                   try{
                      ConstraintAttribute$a.a[ConstraintAttribute$AttributeType.STRING_TYPE.ordinal()] = 5;
                      try{
                         ConstraintAttribute$a.a[ConstraintAttribute$AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
                         try{
                            ConstraintAttribute$a.a[ConstraintAttribute$AttributeType.DIMENSION_TYPE.ordinal()] = 7;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
