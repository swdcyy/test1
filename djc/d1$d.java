package djc.d1$d;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.widget.ImageView;

public final class d1$d implements View$OnTouchListener	// class@0021de
{
    public final KwaiImageView b;

    public void d1$d(KwaiImageView p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d1$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "view");
       a.p(p1, "event");
       if (!p1.getAction()) {
          this.b.setColorFilter(p0.getResources().getColor(R.color.arg_RES_7f0601aa));
       }else if(p1.getAction() == 1 || p1.getAction() == 3){
          this.b.clearColorFilter();
       }
       return false;
    }
}
