package androidx.constraintlayout.solver.widgets.ConstraintWidget$a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.lang.Enum;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;

public class ConstraintWidget$a	// class@00068e
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ConstraintWidget$DimensionBehaviour.values().length];
       ConstraintWidget$a.b = ointArray;
       try{
          int i = 1;
          ointArray[ConstraintWidget$DimensionBehaviour.FIXED.ordinal()] = i;
          int i1 = 2;
          try{
             ConstraintWidget$a.b[ConstraintWidget$DimensionBehaviour.WRAP_CONTENT.ordinal()] = i1;
             int i2 = 3;
             try{
                ConstraintWidget$a.b[ConstraintWidget$DimensionBehaviour.MATCH_PARENT.ordinal()] = i2;
                int i3 = 4;
                try{
                   ConstraintWidget$a.b[ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = i3;
                   int[] ointArray1 = new int[ConstraintAnchor$Type.values().length];
                   try{
                      ConstraintWidget$a.a = ointArray1;
                      ointArray1[ConstraintAnchor$Type.LEFT.ordinal()] = i;
                      try{
                         ConstraintWidget$a.a[ConstraintAnchor$Type.TOP.ordinal()] = e0;
                         try{
                            ConstraintWidget$a.a[ConstraintAnchor$Type.RIGHT.ordinal()] = i2;
                            try{
                               ConstraintWidget$a.a[ConstraintAnchor$Type.BOTTOM.ordinal()] = i3;
                               try{
                                  ConstraintWidget$a.a[ConstraintAnchor$Type.BASELINE.ordinal()] = 5;
                                  try{
                                     ConstraintWidget$a.a[ConstraintAnchor$Type.CENTER.ordinal()] = 6;
                                     try{
                                        ConstraintWidget$a.a[ConstraintAnchor$Type.CENTER_X.ordinal()] = 7;
                                        try{
                                           ConstraintWidget$a.a[ConstraintAnchor$Type.CENTER_Y.ordinal()] = 8;
                                           try{
                                              ConstraintWidget$a.a[ConstraintAnchor$Type.NONE.ordinal()] = 9;
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
