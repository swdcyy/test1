package androidx.constraintlayout.solver.widgets.ConstraintAnchor$a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.lang.Enum;

public class ConstraintAnchor$a	// class@00068b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ConstraintAnchor$Type.values().length];
       try{
          ConstraintAnchor$a.a = ointArray;
          ointArray[ConstraintAnchor$Type.CENTER.ordinal()] = 1;
          try{
             ConstraintAnchor$a.a[ConstraintAnchor$Type.LEFT.ordinal()] = 2;
             try{
                ConstraintAnchor$a.a[ConstraintAnchor$Type.RIGHT.ordinal()] = 3;
                try{
                   ConstraintAnchor$a.a[ConstraintAnchor$Type.TOP.ordinal()] = 4;
                   try{
                      ConstraintAnchor$a.a[ConstraintAnchor$Type.BOTTOM.ordinal()] = 5;
                      try{
                         ConstraintAnchor$a.a[ConstraintAnchor$Type.BASELINE.ordinal()] = 6;
                         try{
                            ConstraintAnchor$a.a[ConstraintAnchor$Type.CENTER_X.ordinal()] = 7;
                            try{
                               ConstraintAnchor$a.a[ConstraintAnchor$Type.CENTER_Y.ordinal()] = 8;
                               try{
                                  ConstraintAnchor$a.a[ConstraintAnchor$Type.NONE.ordinal()] = 9;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
