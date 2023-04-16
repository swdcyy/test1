package com.yxcorp.plugin.setting.presenter.g;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.presenter.h;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tgd.n;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import lnc.y6;
import z26.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import com.yxcorp.plugin.setting.presenter.f;
import crd.b;
import pgd.y;
import k2b.e0;
import sgd.b;

public class g implements SlipSwitchButton$b	// class@0008dc
{
    public j a;
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "1")) {
          return;
       }
       this.a.l(p0, "enable_local_intelligence_album", p1, new n(this, p1));
       if (p1) {
          y6.s(c.class, LoadPolicy.DIALOG).Q(f.b);
       }
       b.j(this.b.p, "TIME_ALBUM", y.a(p0.getSwitch()));
       return;
    }
}
