package a1d.j;
import erd.g;
import a1d.k;
import java.lang.Object;
import com.yxcorp.login.http.response.AddCustomPhoneNumResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class j implements g	// class@000031
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mNewPhoneNum;
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "10")) {
       }else if(p0 != null){
          Intent intent = new Intent();
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "key_result_new_phone_num", p0);
          intent.putExtras(uBundle);
          p0 = tb.getActivity();
          Objects.requireNonNull(p0);
          p0.setResult(-1, intent);
       }else {
          p0 = tb.getActivity();
          Objects.requireNonNull(p0);
          p0.setResult(0);
       }
       tb.R8();
       tb.getActivity().finish();
       return;
    }
}
