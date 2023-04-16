package com.yxcorp.plugin.setting.presenter.d;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.presenter.e;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tgd.i;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import pgd.y;
import k2b.e0;
import sgd.b;

public class d implements SlipSwitchButton$b	// class@0008d8
{
    public j a;
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       this.a.l(p0, "disable_latest_album_asset", (p1 ^ 0x01), new i(this, p1));
       b.j(this.b.p, "LATEST_ALBUM", y.a(p0.getSwitch()));
       return;
    }
}
