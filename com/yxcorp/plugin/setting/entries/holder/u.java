package com.yxcorp.plugin.setting.entries.holder.u;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.t$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kgd.p0;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.plugin.setting.entries.holder.t;
import pgd.y;
import k2b.e0;
import sgd.b;

public class u implements SlipSwitchButton$b	// class@000897
{
    public j a;
    public final t$a b;

    public void u(t$a p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ou, "1")) {
          return;
       }
       this.a.l(p0, "not_allow_find_me_by_mobile", (p1 ^ 0x01), new p0(this, p1));
       b.k(this.b.r.a, "FINDME_BY_NUMBER", y.a(p0.getSwitch()));
       return;
    }
}
