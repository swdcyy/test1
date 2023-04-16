package bg.b;
import java.lang.Object;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View$MeasureSpec;

public class b	// class@000b28
{

    public void b(){
       super();
    }
    public static int a(float p0,YogaMeasureMode p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), p1, null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 == YogaMeasureMode.EXACTLY) {
          return View$MeasureSpec.makeMeasureSpec((int)p0, 0x40000000);
       }else if(p1 == YogaMeasureMode.AT_MOST){
          return View$MeasureSpec.makeMeasureSpec((int)p0, Integer.MIN_VALUE);
       }else {
          return View$MeasureSpec.makeMeasureSpec(0, 0);
       }
    }
}
