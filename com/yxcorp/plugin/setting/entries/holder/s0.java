package com.yxcorp.plugin.setting.entries.holder.s0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.u0$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kgd.a2;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.plugin.setting.entries.holder.u0;
import pgd.y;
import k2b.e0;
import sgd.b;

public class s0 implements SlipSwitchButton$b	// class@00088b
{
    public j a;
    public final u0$a b;

    public void s0(u0$a p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, os0, "1")) {
          return;
       }
       this.a.l(p0, "show_same_follow_deny", (p1 ^ 0x01), new a2(this, p1));
       b.k(this.b.q.a, "COMMON_FOLLOW", y.a(p0.getSwitch()));
       return;
    }
}
