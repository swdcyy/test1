package c1d.j;
import android.content.Intent;
import java.lang.Object;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class j	// class@0004cd
{
    public Intent a;

    public void j(Intent p0){
       super();
       this.a = p0;
    }
    public final BindPhoneParams a(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SerializableHook.getSerializableExtra(this.a, "bind_phone_params");
    }
}
