package bvc.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.graphics.Paint$Align;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;

public final class c	// class@00049f
{

    public static final int a(String p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "alignment");
       switch (p0.hashCode()){
           case 0xaeb2cc55:
             if (p0.equals("center")) {
                i = 1;
             }else {
             label_005d :
                i = -1;
             }
             break;
           case 0xbdb1afcb:
             if (p0.equals("vertical_down")) {
                i = 5;
             }else {
                goto label_005d ;
             }
             break;
           case 0xfddcad0c:
             if (p0.equals("vertical_top")) {
                i = 3;
             }else {
                goto label_005d ;
             }
             break;
           case 0x32a007:
             if (p0.equals("left")) {
                i = 0;
             }else {
                goto label_005d ;
             }
             break;
           case 0x677c21c:
             if (p0.equals("right")) {
                i = 2;
             }else {
                goto label_005d ;
             }
             break;
           case 0x15bf313e:
             if (p0.equals("vertical_center")) {
                i = 4;
             }else {
                goto label_005d ;
             }
             break;
           default:
             goto label_005d ;
       }
       return i;
    }
    public static final Paint$Align b(int p0){
       Paint$Align lEFT;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                i1.c(new RuntimeException("error text align "+p0));
                lEFT = Paint$Align.LEFT;
             }else {
                lEFT = Paint$Align.RIGHT;
             }
          }else {
             lEFT = Paint$Align.CENTER;
          }
       }else {
          lEFT = Paint$Align.LEFT;
       }
       return lEFT;
    }
}
