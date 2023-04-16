package b5a.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import b5a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import uw9.b0;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import java.lang.Number;
import android.content.Context;
import uw9.m3;
import e0a.j;
import j2a.b;
import io.reactivex.subjects.PublishSubject;

public class j implements ViewTreeObserver$OnGlobalLayoutListener	// class@00036f
{
    public final h b;

    public void j(h p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       double d1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "1")) {
          return;
       }
       j tb = this.b;
       boolean b = true;
       tb.u = b;
       tb.m8().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       tb = this.b;
       h v = tb.v;
       Activity activity = tb.getActivity();
       h w = this.b.w;
       Object obj = PatchProxy.applyTwoRefs(activity, w, objArray, b0.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(w.isLongPhoto()){
          double d = (double)w.getCoverAspectRatio();
          Object obj1 = PatchProxy.applyTwoRefs(activity, w, objArray, b0.class, "4");
          if (obj1 != PatchProxyResult.class) {
             d1 = obj1.doubleValue();
          }else if(m3.c(activity) && (!j.i() && !b.d(w))){
             d1 = 0x3fe2000000000000;
          }else {
             d1 = 0x3fe8000000000000;
          }
          if (d - d1 > 0) {
             b = false;
          }
       }
       v.onNext(Boolean.valueOf(b));
       return;
    }
}
