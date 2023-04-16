package com.yxcorp.gifshow.init.module.i0;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.MiniMediaPlayerInitModule;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class i0 implements x	// class@0019c4
{
    public static final i0 b;

    static {
       i0.b = new i0();
    }
    public void i0(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("mini_async_player_init", false));
    }
}
