package a1d.p;
import erd.g;
import a1d.r;
import java.lang.Object;
import com.yxcorp.login.http.response.AddCustomUserInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;

public final class p implements g	// class@000049
{
    public final r b;

    public void p(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       tb.R8();
       p0 = p0.mNewUserInfo;
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "7")) {
       }else if(p0 != null){
          Intent intent = new Intent();
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "key_result_new_user_info", p0);
          intent.putExtras(uBundle);
          p0 = tb.getActivity();
          Objects.requireNonNull(p0);
          p0.setResult(-1, intent);
       }else {
          p0 = tb.getActivity();
          Objects.requireNonNull(p0);
          p0.setResult(0);
       }
       tb.getActivity().finish();
       return;
    }
}
