package b3d.k0;
import ov5.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import androidx.fragment.app.FragmentActivity;
import ou5.a;
import brd.v;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.login.userlogin.fragment.h$a;
import android.content.Context;
import android.os.Bundle;
import n3d.a;
import com.yxcorp.login.userlogin.fragment.h;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import kzc.d;
import brd.g;
import com.yxcorp.login.userlogin.fragment.f$a;
import com.yxcorp.login.userlogin.fragment.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class k0 implements c	// class@000332
{
    public final LoginParams a;
    public final FragmentActivity b;
    public final int c;
    public final a d;
    public final v e;

    public void k0(LoginParams p0,FragmentActivity p1,int p2,a p3,v p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void a(boolean p0,Object p1,String p2){
       k0 ta = this.a;
       k0 tb = this.b;
       k0 tc = this.c;
       k0 td = this.d;
       k0 te = this.e;
       p1 = (ta != null)? TextUtils.I(ta.mExtraInfoParams): "";
       if (p0) {
          p1 = new c(tb);
          p1.L(h.f(tb, new h$a(tc, p1).a, td, null));
          p1.b1(KwaiDialogOption.e);
          p1.Z0(169);
          p1.B(true);
          te.onNext(p1);
       }else {
          Bundle uBundle = new f$a(tc, p1).a();
          p1 = PatchProxy.applyFourRefs(tb, uBundle, td, null, null, f.class, "1");
          if (p1 != PatchProxyResult.class) {
          }else {
             p1 = new f(tb, uBundle, td, null);
          }
          c uoc = new c(tb);
          uoc.L(p1);
          te.onNext(uoc);
       }
       te.onComplete();
       return;
    }
}
