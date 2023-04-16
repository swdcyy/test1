package com.kwai.feature.api.feed.home.wrapper.kcube.util.d;
import ok.x;
import java.lang.Object;
import so5.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class d implements x	// class@000f39
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("openTopNavigationbarQuickLocation", false));
    }
}
