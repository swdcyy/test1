package f11.w$d;
import android.view.View$OnTouchListener;
import f11.w;
import java.lang.Object;
import android.view.GestureDetector;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f11.w$c;
import f11.w$a;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pp.a;
import java.lang.StringBuilder;
import q87.c;

public class w$d implements View$OnTouchListener	// class@002289
{
    public final GestureDetector b;
    public final w c;

    public void w$d(w p0){
       this.c = p0;
       super();
       this.b = new GestureDetector(p0.getActivity(), new w$c(p0, null));
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveAudienceLikePresenter", "onTouch:"+p0.toString(), objArray);
       return this.b.onTouchEvent(p1);
    }
}
