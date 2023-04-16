package com.yxcorp.plugin.setting.presenter.i;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.yxcorp.plugin.setting.presenter.j;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tgd.q;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import pgd.y;
import k2b.e0;
import sgd.b;

public class i implements SlipSwitchButton$a	// class@0008df
{
    public j b;
    public final j c;

    public void i(j p0){
       this.c = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, i.class, "1")) {
          return;
       }
       this.b.l(p0, "disable_smart_album_tabs", (p1 ^ 0x01), new q(this, p1));
       b.j(this.c.p, "ALBUM_TABS", y.a(p0.getSwitch()));
       return;
    }
}
