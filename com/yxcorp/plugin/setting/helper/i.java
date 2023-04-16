package com.yxcorp.plugin.setting.helper.i;
import u07.u;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.plugin.login.TencentPlatform;
import android.content.Context;
import pgd.e;
import n3d.a;

public final class i implements u	// class@0008bc
{
    public final j b;
    public final SlipSwitchButton c;

    public void i(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       i tb = this.b;
       new TencentPlatform(tb.b).login(tb.b, new e(tb, this.c));
    }
}
