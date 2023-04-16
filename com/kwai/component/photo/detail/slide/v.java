package com.kwai.component.photo.detail.slide.v;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import java.lang.String;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class v implements x	// class@000aaa
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final Object get(){
       boolean b = false;
       if (l.c("KEY_ENABLE_FIRST_FRAME_OPT", b) || a.t().d("enableFirstFrameOpt", b)) {
          b = true;
       }
       return Boolean.valueOf(b);
    }
}
