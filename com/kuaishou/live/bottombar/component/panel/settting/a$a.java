package com.kuaishou.live.bottombar.component.panel.settting.a$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.kuaishou.live.bottombar.component.panel.settting.a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import k61.c;
import androidx.lifecycle.LiveData;
import z61.b;
import k61.f;

public class a$a implements SlipSwitchButton$a	// class@000d3e
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       if (!p2) {
          return;
       }
       c a = this.b.a;
       if (a != null && a.getValue() != null) {
          a$a tb = this.b;
          tb.h.a(tb.a.getValue(), p1);
       }
       return;
    }
}
