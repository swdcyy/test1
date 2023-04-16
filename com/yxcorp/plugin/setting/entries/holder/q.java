package com.yxcorp.plugin.setting.entries.holder.q;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.s$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kgd.n0;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.plugin.setting.entries.holder.s;
import pgd.y;
import k2b.e0;
import sgd.b;

public class q implements SlipSwitchButton$b	// class@000886
{
    public j a;
    public final s$a b;

    public void q(s$a p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oq, "1")) {
          return;
       }
       this.a.l(p0, "missu_deny", (p1 ^ 0x01), new n0(this, p1));
       b.k(this.b.q.a, "POKE_BUCTION", y.a(p0.getSwitch()));
       return;
    }
}
