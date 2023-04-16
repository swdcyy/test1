package com.yxcorp.gifshow.profile.presenter.profile.header.operation.g;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class g implements x	// class@001505
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableGravityEffectButton", false));
    }
}
