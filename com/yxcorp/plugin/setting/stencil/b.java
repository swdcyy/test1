package com.yxcorp.plugin.setting.stencil.b;
import erd.g;
import com.yxcorp.plugin.setting.stencil.d;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.lang.Object;
import com.yxcorp.gifshow.settings.stencil.entity.SettingPageStencil;
import java.util.Objects;
import vgd.p;
import java.lang.Runnable;
import t45.c;

public final class b implements g	// class@0008f6
{
    public final d b;
    public final SettingPage c;

    public void b(d p0,SettingPage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       c.a(new p(tb, this.c, p0));
    }
}
