package com.yxcorp.plugin.setting.helper.h;
import u07.u;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import android.content.Intent;
import java.lang.String;
import com.yxcorp.plugin.setting.helper.c;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class h implements u	// class@0008bb
{
    public final j b;
    public final SlipSwitchButton c;

    public void h(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       h tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = new c(tb, this.c);
       tb.b.t1(new Intent("android.settings.SETTINGS"), 1001, uoc);
    }
}
