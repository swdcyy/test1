package com.kwai.component.upgrade.h;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.google.gson.Gson;
import com.kwai.component.upgrade.UpgradeInstallHintHelper$UpgradeInstallHintClick;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import java.lang.String;
import k2b.u1;
import ai5.b;
import zjd.f;

public final class h implements View$OnClickListener	// class@000c05
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void onClick(View p0){
       u1.Q("ks://upgrade_install_hint_click", new Gson().q(new UpgradeInstallHintHelper$UpgradeInstallHintClick(UpgradeInstallHintHelper.h, "notification_bar_ok")));
       b.d(false);
       UpgradeInstallHintHelper.f.e();
       UpgradeInstallHintHelper.b();
    }
}
