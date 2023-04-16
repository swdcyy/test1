package k99.f$a;
import vd5.c;
import k99.f;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k99.c;
import mhc.l2;
import brd.a0;
import k99.d;
import erd.r;
import brd.m;
import k99.e;
import java.lang.Runnable;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import vd5.b;

public final class f$a implements c	// class@002b76
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0){
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.applyVoid(null, ta, uof, "4")) {
          GifshowActivity activity = ta.getActivity();
          if (activity != null) {
             c uoc = new c(ta, activity);
             if (!PatchProxy.applyVoidOneRefs(uoc, ta, uof, "5")) {
                l2.a.a().t(d.b).y(new e(uoc), Functions.d());
             }
          }
       }
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       return b.b(this, p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
}
