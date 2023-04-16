package com.kwai.component.photo.detail.slide.b;
import ok.x;
import java.lang.Object;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class b implements x	// class@000a42
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableImageEmitterPreloadPlayer", false));
    }
}
