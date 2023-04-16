package com.kwai.component.photo.detail.slide.d;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import java.lang.String;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class d implements x	// class@000a4f
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = 0;
       int i1 = l.e("KEY_PROFILE_SIDE_BAR_OPT", i);
       if (i1 != 1) {
          uBoolean = (i1 != 2)? Boolean.valueOf(a.t().d("enableProfileSideOpt", i)): Boolean.FALSE;
       }else {
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
