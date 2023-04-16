package com.kwai.component.photo.detail.slide.o;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class o implements x	// class@000a87
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = d.e();
       if (i != 1 && i != 2) {
          uBoolean = (i != 3)? Boolean.valueOf(a.t().d("newFeedbackSharingPathOpt", false)): Boolean.TRUE;
       }else {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
