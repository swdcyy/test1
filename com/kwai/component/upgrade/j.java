package com.kwai.component.upgrade.j;
import zjd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.kwai.component.upgrade.UpgradeInstallHintHelper$UpgradeInstallHintClick;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import k2b.u1;

public class j implements b	// class@000c07
{

    public void j(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       u1.Q("ks://upgrade_install_hint_click", new Gson().q(new UpgradeInstallHintHelper$UpgradeInstallHintClick(UpgradeInstallHintHelper.h, "dialog_close")));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       u1.Q("ks://upgrade_install_hint_click", new Gson().q(new UpgradeInstallHintHelper$UpgradeInstallHintClick(UpgradeInstallHintHelper.h, "dialog_ok")));
       return;
    }
}
