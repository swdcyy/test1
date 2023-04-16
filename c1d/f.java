package c1d.f;
import c1d.e;
import q3d.a;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n3d.b;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.Context;

public class f extends a implements e	// class@0004c9
{

    public void f(){
       super();
    }
    public final e d(PhoneVerifyParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SerializableHook.putExtra(this.b.e, "phone_verify_params", p0);
       return this;
    }
    public final e init(Context p0){
       a obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       obj.a = p0;
       obj.e = new Intent();
       this.b.e.setClassName(p0, "com.yxcorp.login.bind.ChangePhoneVerifyActivity");
       this.h0();
       return this;
    }
}
