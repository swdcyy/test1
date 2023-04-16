package com.yxcorp.gifshow.ad.util.c;
import ok.x;
import java.lang.Object;
import g59.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class c implements x	// class@00187b
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("nebula_splash_loss_user_protect_switch", false));
    }
}
