package c1d.l;
import c1d.k;
import q3d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import n3d.b;
import android.content.Intent;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.Context;

public class l extends a implements k	// class@0004cf
{

    public void l(){
       super();
    }
    public final k b0(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b.e.putExtra("close_bind_btn", p0);
       return this;
    }
    public final k i(BindPhoneParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SerializableHook.putExtra(this.b.e, "bind_phone_params", p0);
       return this;
    }
    public final k init(Context p0){
       a obj = PatchProxy.applyOneRefs(p0, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       obj.a = p0;
       obj.e = new Intent();
       this.b.e.setClassName(p0, "com.yxcorp.login.bind.OriginBindPhoneActivity");
       this.h0();
       return this;
    }
}
