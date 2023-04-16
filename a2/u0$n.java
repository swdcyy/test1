package a2.u0$n;
import android.view.WindowInsets$Type;

public final class u0$n	// class@0000b8
{

    public static int a(int p0){
       int i = 0;
       int i1 = 1;
       while (i1 <= 256) {
          int i2 = p0 & i1;
          if (i2) {
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 != 4) {
                      if (i1 != 8) {
                         if (i1 != 16) {
                            if (i1 != 32) {
                               if (i1 != 64) {
                                  if (i1 == 128) {
                                     i2 = WindowInsets$Type.displayCutout();
                                  }
                               }else {
                                  i2 = WindowInsets$Type.tappableElement();
                               }
                            }else {
                               i2 = WindowInsets$Type.mandatorySystemGestures();
                            }
                         }else {
                            i2 = WindowInsets$Type.systemGestures();
                         }
                      }else {
                         i2 = WindowInsets$Type.ime();
                      }
                   }else {
                      i2 = WindowInsets$Type.captionBar();
                   }
                }else {
                   i2 = WindowInsets$Type.navigationBars();
                }
             }else {
                i2 = WindowInsets$Type.statusBars();
             }
             i = i | i2;
          }
          i1 = i1 << 1;
       }
       return i;
    }
}
