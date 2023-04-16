package dy2.c;
import c12.f;
import dy2.a;
import dy2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import t02.a0;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveCommonPopup;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import com.kwai.library.widget.popup.common.c;
import va1.m;
import u07.t$a;
import java.lang.CharSequence;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.livestream.message.nano.SCActionSignal;

public class c extends f	// class@0025e5
{
    public a0 K;
    public c L;
    public final g M;
    public final g N;
    public static String sLivePresenterClassName = "VoicePartyAudienceViolationPresenter";

    public void c(){
       super();
       this.M = new a(this);
       this.N = new b(this);
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       this.K.C.o(814, this.M);
       this.K.C.o(510, this.N);
       return;
    }
    public final void a9(LiveCommonNoticeMessages$LiveCommonPopup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       if (g.h(this.getActivity())) {
          return;
       }
       m.c(this.L);
       t$a uoa = new t$a(this.getActivity());
       uoa.X0(p0.title);
       uoa.z0(p0.detail);
       uoa.T0(p0.buttonContent);
       t$a uoa1 = f.e(uoa);
       uoa1.w0(true);
       this.L = uoa1.Y(PopupInterface.a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       m.c(this.L);
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.K.C.u0(814, LiveCommonNoticeMessages$LiveCommonPopup.class, this.M);
       this.K.C.u0(510, SCActionSignal.class, this.N);
       return;
    }
}
