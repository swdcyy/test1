package com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder$PendantSettingPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder$PendantSettingPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PendantSettingEntryHolder$PendantSettingPresenter$1 implements LifecycleObserver	// class@000841
{
    public final PendantSettingEntryHolder$PendantSettingPresenter b;

    public void PendantSettingEntryHolder$PendantSettingPresenter$1(PendantSettingEntryHolder$PendantSettingPresenter p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, PendantSettingEntryHolder$PendantSettingPresenter$1.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
