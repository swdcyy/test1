package a3d.i;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.feature.api.social.login.model.LoginParams;
import ou5.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k2d.o;
import im8.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LoginSourcePackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public class i implements PopupInterface$f	// class@00007e
{
    public a b;
    public PresenterV2 c;
    public boolean d;
    public LoginParams e;
    public int f;

    public void i(boolean p0,LoginParams p1,a p2){
       super();
       this.f = 0;
       this.b = p2;
       this.d = p0;
       this.e = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d0eb2, p2, false);
       boolean b = true;
       view.setClickable(b);
       PresenterV2 presenterV2 = new PresenterV2();
       this.c = presenterV2;
       presenterV2.U7(new o(this.d, this.f, this.e));
       this.c.f(view);
       Object[] objArray = new Object[]{this,new c("POPUP", p0)};
       this.c.i(objArray);
       i tb = this.b;
       if (tb != null) {
          tb.onShow();
       }
       if (!PatchProxy.applyVoid(null, this, i.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AGREE_PRIVACY_POLICY_POPUP";
          i3 oi3 = i3.f();
          String str = (this.f == b)? "mid": "bottom";
          oi3.d("show_pos", str);
          oi3.d("start_login_session_id", this.e.mSourcePageSessionId);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$LoginSourcePackage loginSourceP = new ClientContent$LoginSourcePackage();
          loginSourceP.source = this.e.mLoginSource;
          uContentPack.loginSourcePackage = loginSourceP;
          u1.B0(new ShowMetaData().setType(4).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       i tb = this.b;
       if (tb != null) {
          tb.onDismiss();
       }
       return;
    }
}
