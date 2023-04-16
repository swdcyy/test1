package d6a.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout;
import uy6.h;
import uy6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import uy6.d;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;

public final class r	// class@001eac
{

    public void r(){
       super();
    }
    public static void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, r.class, "4")) {
          return;
       }
       if (p0 instanceof SlidePlayVerticalRelativeLayout) {
          p0.setNormalRelativeMode((h.a.e ^ 0x01));
       }
       return;
    }
    public static int b(){
       int i;
       Object obj = PatchProxy.apply(null, null, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (h.a.c != null) {
          i = (SlidePerformanceExp.a().a())? 0x7f0d1698: 0x7f0d1697;
          return i;
       }else if(SlidePerformanceExp.a().a()){
          i = 0x7f0d1696;
       }else {
          i = 0x7f0d1691;
       }
       return i;
    }
    public static int c(){
       int i;
       Object obj = PatchProxy.apply(null, null, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (h.a.c != null) {
          i = (SlidePerformanceExp.a().a())? 0x7f0d1695: 0x7f0d1694;
          return i;
       }else if(SlidePerformanceExp.a().a()){
          i = 0x7f0d1693;
       }else {
          i = 0x7f0d1692;
       }
       return i;
    }
    public static int d(){
       int i;
       Object obj = PatchProxy.apply(null, null, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (h.a.c != null) {
          i = (SlidePerformanceExp.a().a())? 0x7f0d169c: 0x7f0d169b;
          return i;
       }else if(SlidePerformanceExp.a().a()){
          i = 0x7f0d169a;
       }else {
          i = 0x7f0d1699;
       }
       return i;
    }
}
