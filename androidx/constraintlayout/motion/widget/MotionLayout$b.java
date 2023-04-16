package androidx.constraintlayout.motion.widget.MotionLayout$b;
import androidx.constraintlayout.motion.widget.MotionLayout$TransitionState;
import java.lang.Enum;

public class MotionLayout$b	// class@000669
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MotionLayout$TransitionState.values().length];
       try{
          MotionLayout$b.a = ointArray;
          ointArray[MotionLayout$TransitionState.UNDEFINED.ordinal()] = 1;
          try{
             MotionLayout$b.a[MotionLayout$TransitionState.SETUP.ordinal()] = 2;
             try{
                MotionLayout$b.a[MotionLayout$TransitionState.MOVING.ordinal()] = 3;
                try{
                   MotionLayout$b.a[MotionLayout$TransitionState.FINISHED.ordinal()] = 4;
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
