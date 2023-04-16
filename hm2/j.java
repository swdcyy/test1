package hm2.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class j	// class@002dd6
{

    public void j(){
       super();
    }
    public static void a(View p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj, "1")) {
          return;
       }
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.leftMargin = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
}
