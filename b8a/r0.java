package b8a.r0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.l;
import java.lang.Object;
import d0a.o;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView$a;
import android.widget.RelativeLayout;

public final class r0 implements g	// class@0003df
{
    public final l b;

    public void r0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0.a == 1) {
          NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.f();
          int i1 = NasaFeatureGuideManager.f().k() + 1;
          Objects.requireNonNull(nasaFeatureG);
          NasaFeatureGuideManager nasaFeatureG1 = NasaFeatureGuideManager.class;
          if (!PatchProxy.isSupport(nasaFeatureG1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), nasaFeatureG, nasaFeatureG1, "37")) {
             SharedPreferences$Editor uEditor = c.a.edit();
             uEditor.putInt("slideScaleCleanEnterCount", i1);
             g.a(uEditor);
          }
          if (!PatchProxy.applyVoid(null, tb, l.class, "7")) {
             Activity activity = tb.getActivity();
             if (activity != null && (!activity.isFinishing() && activity instanceof GifshowActivity)) {
                activity.F2(tb.A);
             }
          }
          if (tb.p == null) {
             ScaleCleanControllerView scaleCleanCo = tb.q.inflate();
             tb.p = scaleCleanCo;
             scaleCleanCo.setControllerListener(tb.B);
          }
          tb.p.setVisibility(i);
          tb.p.setImageScale(p0.d);
          tb.p.setDisableDownload((p0.e ^ 1));
          tb.p.setSpeed(p0.b);
          tb.p.setPauseStatus(p0.c);
          tb.p.setSmallWindowEnable(p0.f);
       }else {
          tb.S8();
          l p = tb.p;
          if (p != null) {
             p.setVisibility(8);
          }
       }
       if (p0.a != 1) {
          i = true;
       }
       tb.P8(i);
       return;
    }
}
