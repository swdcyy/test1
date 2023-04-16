package com.kwai.feature.api.feed.home.wrapper.kcube.util.b;
import ok.x;
import java.lang.Object;
import so5.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class b implements x	// class@000f37
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("kCubeHomeInitActionBarDelay", false));
    }
}
