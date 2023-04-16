package dlc.v0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dlc.u0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import android.view.View;
import io.reactivex.subjects.PublishSubject;

public class v0 extends PresenterV2	// class@002275
{
    public PublishSubject p;
    public View q;
    public View r;
    public View s;

    public void v0(){
       super();
    }
    public void E8(){
       boolean b = PatchProxy.applyVoid(null, this, v0.class, "3");
       if (b) {
          return;
       }
       this.X7(this.p.subscribe(new u0(this), Functions.e));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "2")) {
          return;
       }
       this.q = this.getActivity().findViewById(0x7f0a4079);
       this.r = this.getActivity().findViewById(0x7f0a406d);
       this.s = this.getActivity().findViewById(0x7f0a4067);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "1")) {
          return;
       }
       this.p = this.r8("TRENDING_INFO_SHOW_CHANGE_EVENT");
       return;
    }
}
