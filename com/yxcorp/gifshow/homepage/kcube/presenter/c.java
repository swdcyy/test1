package com.yxcorp.gifshow.homepage.kcube.presenter.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.kcube.presenter.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class c implements x	// class@001754
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("skin_config_hide_status_bar_block", false));
    }
}
