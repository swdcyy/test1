package com.kwai.component.upgrade.i;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.google.gson.Gson;
import com.kwai.component.upgrade.UpgradeInstallHintHelper$UpgradeInstallHintClick;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import java.lang.String;
import k2b.u1;
import ai5.b;

public final class i implements View$OnClickListener	// class@000c06
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void onClick(View p0){
       u1.Q("ks://upgrade_install_hint_click", new Gson().q(new UpgradeInstallHintHelper$UpgradeInstallHintClick(UpgradeInstallHintHelper.h, "notification_bar_close")));
       b.d(false);
       UpgradeInstallHintHelper.b();
    }
}
