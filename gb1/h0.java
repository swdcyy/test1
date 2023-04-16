package gb1.h0;
import eb1.e;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import db1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import db1.b;
import lnc.a1;
import gb1.f0;
import eb1.a;
import java.lang.Boolean;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import gb1.g0;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import gb1.e0;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class h0 extends e	// class@002462
{

    public void h0(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, h0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.b();
       if (!this.g()) {
          return objArray;
       }
       obj = new a(this.c.mType);
       obj.d(a1.p(R.string.arg_RES_7f1003c6));
       obj.e(new f0(this));
       return obj;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.d() != null && (this.b.getActivity() != null && !TextUtils.x(obj.a())))? true: false;
       return b;
    }
    public final void j(boolean p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "4")) {
          return;
       }
       Activity activity = this.b.getActivity();
       DialogContainerFragment uDialogConta = new DialogContainerFragment();
       uDialogConta.Lh(new g0(this.b.b()));
       if (p0) {
          uDialogConta.k0(new e0(activity));
       }
       uDialogConta.wh(false);
       uDialogConta.zh(false);
       uDialogConta.uh(R.style.arg_RES_7f11035d);
       uDialogConta.Kh(a1.e(534.00f));
       uDialogConta.show(activity.getSupportFragmentManager(), "sensitive_words");
       return;
    }
}
