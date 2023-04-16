package com.yxcorp.plugin.setting.entries.holder.a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.yxcorp.plugin.setting.entries.holder.r0;
import com.yxcorp.gifshow.model.SwitchItem;
import brd.t;
import cjd.e;
import erd.o;
import kgd.n;
import sfc.a;
import erd.g;
import crd.b;

public final class a implements SlipSwitchButton$b	// class@000845
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       a ta = this.a;
       Objects.requireNonNull(ta);
       KwaiApiService kwaiApiServi = b.a(0x330163e);
       SwitchItem mId = ta.c.mId;
       long l = (p1)? 2: 1;
       kwaiApiServi.updatePushSwitchStatus(mId, l).map(new e()).subscribe(new n(ta, p0), new a());
       b.c(ta.c, p1);
       return;
    }
}
