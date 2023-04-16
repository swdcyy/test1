package o11.a;
import c12.f;
import o11.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import l11.j$a;
import l11.j;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends f	// class@003457
{
    public j K;
    public View L;
    public final j$a M;
    public static String sLivePresenterClassName = "LiveLineAudienceMutePeerPresenter";

    public void a(){
       super();
       this.M = new a$a(this);
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.K.b(this.M);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.L.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.L = m1.f(p0, 0x7f0a20a4);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(j.class);
       return;
    }
    public void x(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.K.c(this.M);
       return;
    }
}
