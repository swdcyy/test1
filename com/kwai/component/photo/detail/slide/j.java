package com.kwai.component.photo.detail.slide.j;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class j implements x	// class@000a57
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = d.e();
       if (i != 1 && i != 2) {
          uBoolean = (i != 3)? Boolean.valueOf(a.t().d("newFeedbackInfringementResponse", false)): Boolean.TRUE;
       }else {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
