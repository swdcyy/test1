package dw2.h;
import com.kuaishou.live.viewcontroller.ViewController;
import dw2.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.theater.TheaterAudienceHalfScreenTipController$bindViews$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import dw2.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class h extends ViewController	// class@0025b5
{
    public final j j;

    public void h(j p0){
       a.p(p0, "viewModel");
       super();
       this.j = p0;
    }
    public void F2(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16e4);
       if (!PatchProxy.applyVoid(objArray, this, oh, "2")) {
          LiveDataOperators.b(this.j.u0(), this.j.v0(), TheaterAudienceHalfScreenTipController$bindViews$1.INSTANCE).observe(this, new g(this.A2(R.id.voice_party_theater_audience_half_screen_tip_title_view)));
       }
       return;
    }
}
