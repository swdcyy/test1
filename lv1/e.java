package lv1.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;

public class e	// class@003063
{

    public void e(){
       super();
    }
    public static void a(View p0){
       PatchProxy.applyVoidOneRefs(p0, null, e.class, "3");
    }
    public static int b(View p0,boolean p1){
       int i1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }else if(p0.getVisibility() == 8){
          return i;
       }else {
          e.a(p0);
          if (p1 || (!p0.getMeasuredWidth() && !p0.getMeasuredHeight())) {
             ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
             if (layoutParams != null) {
                ViewGroup$LayoutParams width = layoutParams.width;
                if (width != -2 && width != -1) {
                   i1 = 0;
                label_0056 :
                   if (layoutParams != null) {
                      layoutParams = layoutParams.height;
                      if (layoutParams != -2 && layoutParams != -1) {
                      label_0062 :
                         p0.measure(i1, i);
                      }
                   }
                   i = View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE);
                   goto label_0062 ;
                }
             }
             i1 = View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE);
             goto label_0056 ;
          }
          return p0.getMeasuredHeight();
       }
    }
    public static int c(View p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0.getVisibility() == 8) {
          return 0;
       }else {
          e.a(p0);
          if (p1 || (!p0.getMeasuredWidth() && !p0.getMeasuredHeight())) {
             p0.measure(0, 0);
          }
          return p0.getMeasuredWidth();
       }
    }
}
