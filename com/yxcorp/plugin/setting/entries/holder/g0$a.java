package com.yxcorp.plugin.setting.entries.holder.g0$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.yxcorp.plugin.setting.entries.holder.g0;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import kgd.d1;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import k2b.h;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;

public class g0$a implements SlipSwitchButton$a	// class@000858
{
    public final g0 b;

    public void g0$a(g0 p0){
       this.b = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(g0$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, g0$a.class, "1")) {
          return;
       }
       if (p2) {
          this.b.c.q.l(p0, "enable_photo_viewer", p1, new d1(this, p1));
          h oh = h.m("3312897", "VIEW_RECORD_POPUP");
          i3 oi3 = i3.f();
          int i = (p1)? 1: 2;
          oi3.c("click_area", Integer.valueOf(i));
          oh.n(oi3.e());
          oh.i(this.b.c.p);
       }
       return;
    }
}
