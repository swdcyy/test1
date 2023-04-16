package c1d.o;
import c1d.n;
import q3d.a;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
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

public class o extends a implements n	// class@0004d2
{

    public void o(){
       super();
    }
    public final n i(BindPhoneParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SerializableHook.putExtra(this.b.e, "bind_phone_params", p0);
       return this;
    }
    public final n init(Context p0){
       a obj = PatchProxy.applyOneRefs(p0, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       obj.a = p0;
       obj.e = new Intent();
       this.b.e.setClassName(p0, "com.yxcorp.login.bind.OriginPhoneOneKeyBindActivity");
       this.h0();
       return this;
    }
}
