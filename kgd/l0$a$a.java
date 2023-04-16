package kgd.l0$a$a;
import android.view.View$OnClickListener;
import kgd.l0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kgd.l0;
import com.yxcorp.plugin.setting.activity.AtMeTabPrivateWorksSettingActivity;
import java.util.Objects;
import com.yxcorp.plugin.setting.activity.AtMeTabPrivateWorksSettingActivity$a;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import java.lang.Boolean;
import sgd.b;

public class l0$a$a implements View$OnClickListener	// class@00179e
{
    public final l0$a b;

    public void l0$a$a(l0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$a$a.class, str)) {
          return;
       }
       l0 a = this.b.q.a;
       AtMeTabPrivateWorksSettingActivity uAtMeTabPriv = AtMeTabPrivateWorksSettingActivity.class;
       if (!PatchProxy.applyVoidOneRefs(a, null, uAtMeTabPriv, "5")) {
          AtMeTabPrivateWorksSettingActivity$a z = AtMeTabPrivateWorksSettingActivity.z;
          Objects.requireNonNull(z);
          if (!PatchProxy.applyVoidOneRefs(a, z, AtMeTabPrivateWorksSettingActivity$a.class, str)) {
             a.p(a, "context");
             a.startActivity(new Intent(a, uAtMeTabPriv));
          }
       }
       l0$a q = this.b.q;
       b.e(q.a, q.e, null);
       return;
    }
}
