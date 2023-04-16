package dw2.f;
import com.kuaishou.live.viewcontroller.ViewController;
import dw2.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.theater.TheaterAudienceFullScreenTipController$bindViews$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import dw2.e;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class f extends ViewController	// class@0025b3
{
    public final j j;

    public void f(j p0){
       a.p(p0, "viewModel");
       super();
       this.j = p0;
    }
    public void F2(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16e2);
       if (!PatchProxy.applyVoid(objArray, this, uof, "2")) {
          LiveDataOperators.b(this.j.u0(), this.j.v0(), TheaterAudienceFullScreenTipController$bindViews$1.INSTANCE).observe(this, new e(this.A2(R.id.voice_party_theater_audience_full_tip_container), this.A2(R.id.voice_party_theater_audience_full_tip_title_view), this.A2(R.id.voice_party_theater_audience_full_tip_icon_view)));
       }
       return;
    }
}
