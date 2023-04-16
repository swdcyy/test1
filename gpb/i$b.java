package gpb.i$b;
import hka.a;
import gpb.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import kob.k;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.animation.ObjectAnimator;
import dpb.b;
import android.view.View;
import android.util.Property;
import b46.b;
import gpb.j;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.utility.n;

public final class i$b implements a	// class@002b5e
{
    public final i b;

    public void i$b(i p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       Activity activity;
       Object[] objArray = null;
       i$b obj = PatchProxy.apply(objArray, this, i$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       int i = 0;
       if (obj.u == null) {
          return i;
       }
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(objArray, obj, i.class, "5")) {
          Object[] objArray1 = new Object[i];
          String str = "music_search_panel";
          k.D().w(str, "hide panel", objArray1);
          if (obj.getActivity() == null) {
             objArray = new Object[i];
             k.D().w(str, "hidePanel activity is null", objArray);
          }else {
             i v = obj.v;
             if (v != null) {
                a.m(v);
                if (v.isRunning()) {
                   objArray = new Object[i];
                   k.D().w(str, "objectAnimator is null or objectAnimator is running", objArray);
                }
             }
             v = obj.s;
             if (v == null) {
                a.S("searchHandler");
             }
             v.k();
             Property tRANSLATION_ = View.TRANSLATION_Y;
             a.o(tRANSLATION_, "View.TRANSLATION_Y");
             float[] uofloatArray = new float[true];
             activity = obj.getActivity();
             a.m(activity);
             a.o(activity, "activity!!");
             uofloatArray[i] = (float)b.a.a(activity);
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj.m8(), tRANSLATION_.getName(), uofloatArray);
             obj.v = objectAnimat;
             a.m(objectAnimat);
             objectAnimat.setDuration(250);
             v = obj.v;
             a.m(v);
             v.addListener(new j(obj));
             i v1 = obj.v;
             a.m(v1);
             v1.start();
          }
       }
       n.C(this.b.getActivity());
       return true;
    }
}
