package com.yxcorp.plugin.setting.helper.b;
import u07.u;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import pgd.f;
import android.content.Context;
import java.util.Map;
import java.lang.String;
import n3d.a;

public final class b implements u	// class@0008b5
{
    public final j b;
    public final SlipSwitchButton c;

    public void b(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       Objects.requireNonNull(tb);
       BindPhoneParams$b uob = new BindPhoneParams$b();
       uob.j(201);
       d.a(-1712118428).ew(tb.b, uob.a(), null, "private_option", new f(tb, this.c));
    }
}
