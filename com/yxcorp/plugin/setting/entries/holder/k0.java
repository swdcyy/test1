package com.yxcorp.plugin.setting.entries.holder.k0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.j0$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.setting.entries.holder.j0;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import pgd.y;
import k2b.e0;
import sgd.b;

public class k0 implements SlipSwitchButton$b	// class@00086e
{
    public j a;
    public final j0$a b;

    public void k0(j0$a p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok0, "1")) {
          return;
       }
       this.a.m(this.b.r.e, p0, "programmatic_ad", p1);
       b.k(this.b.r.a, "PERSONAL_RECOM_ADVERTISE", y.a(p0.getSwitch()));
       return;
    }
}
