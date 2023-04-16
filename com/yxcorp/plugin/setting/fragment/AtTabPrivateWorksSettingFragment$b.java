package com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class AtTabPrivateWorksSettingFragment$b implements View$OnClickListener	// class@0008a9
{
    public final AtTabPrivateWorksSettingFragment b;

    public void AtTabPrivateWorksSettingFragment$b(AtTabPrivateWorksSettingFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtTabPrivateWorksSettingFragment$b.class, "1")) {
          return;
       }
       AtTabPrivateWorksSettingFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, AtTabPrivateWorksSettingFragment.class, "5") && tb.getActivity() != null) {
          FragmentActivity activity = tb.getActivity();
          a.m(activity);
          activity.finish();
       }
       return;
    }
}
