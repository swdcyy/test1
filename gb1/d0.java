package gb1.d0;
import eb1.e;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import db1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import bb1.a;
import lnc.a1;
import gb1.b0;
import eb1.a;
import db1.b;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import p91.m;
import com.kwai.framework.model.user.QCurrentUser;
import bb1.n;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import gb1.c0;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import gb1.a0;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class d0 extends e	// class@002452
{

    public void d0(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       Object obj = PatchProxy.apply(null, this, uod0, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uod0, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.b.a().rg(103) != null){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return null;
       }else {
          a uoa = new a(this.c.mType);
          uoa.d(a1.p(R.string.arg_RES_7f101d2a));
          uoa.e(new b0(this));
          return uoa;
       }
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.d() != null && (this.b.getActivity() != null && (!TextUtils.x(obj.a()) && (obj.b() != null && this.b.a() != null))))? true: false;
       return b;
    }
    public final void j(boolean p0){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod0, "5")) {
          return;
       }
       b uob = this.b.b();
       n.c(1751, QCurrentUser.me().getId(), uob.a());
       DialogContainerFragment uDialogConta = new DialogContainerFragment();
       uDialogConta.Kh(a1.e(534.00f));
       uDialogConta.Lh(new c0(this, uob, uob.i, uob.j));
       if (p0) {
          uDialogConta.k0(new a0(this));
       }
       uDialogConta.show(this.b.getActivity().getSupportFragmentManager(), "manage_admins");
       return;
    }
}
