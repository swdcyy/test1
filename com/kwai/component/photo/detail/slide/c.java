package com.kwai.component.photo.detail.slide.c;
import ok.x;
import java.lang.Object;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class c implements x	// class@000a43
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableSlideDownPreloadPlayer", false));
    }
}
