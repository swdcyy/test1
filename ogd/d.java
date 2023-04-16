package ogd.d;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.fragment.UpdatesSettingPrivacyFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class d implements View$OnClickListener	// class@001f1c
{
    public final UpdatesSettingPrivacyFragment b;

    public void d(UpdatesSettingPrivacyFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, UpdatesSettingPrivacyFragment.class, "5")) {
       }else if(tb.getActivity() == null){
          tb.getActivity().finish();
       }
       return;
    }
}
