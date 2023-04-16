package com.yxcorp.gifshow.webview.yoda.utils.m;
import ub7.f;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public final class m implements f	// class@0017d5
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       Object obj = PatchProxy.apply(null, null, q.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("yoda_cookie_clear_history", true);
       return Boolean.valueOf(b);
    }
}
