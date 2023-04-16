package c1d.i;
import c1d.h;
import q3d.a;
import android.content.Context;
import com.yxcorp.login.http.response.ChangePhoneRiskResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n3d.b;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class i extends a implements h	// class@0004cc
{

    public void i(){
       super();
    }
    public final h v(Context p0,ChangePhoneRiskResponse p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       obj.a = p0;
       obj.e = new Intent();
       this.b.e.setClassName(p0, "com.yxcorp.login.bind.ChangePhoneVerifyMethodsActivity");
       SerializableHook.putExtra(this.b.e, "check_methods_list", p1);
       this.h0();
       return this;
    }
}
