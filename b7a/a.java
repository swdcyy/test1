package b7a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;

public final class a extends PresenterV2	// class@000382
{

    public void a(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       ViewStub viewStub = m1.f(p0, R.id.slide_vertical_atlas_view_stub);
       if (viewStub != null) {
          int i = (NasaExperimentUtils.b())? 0x7f0d08d5: 0x7f0d08d3;
          viewStub.setLayoutResource(i);
          viewStub.inflate();
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
