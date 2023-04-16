package com.kwai.component.photo.detail.slide.h;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class h implements x	// class@000a55
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = d.e();
       if (i != 1) {
          uBoolean = (i != 2 && i != 3)? Boolean.valueOf(a.t().d("newFeedbackPanelSameios3", false)): Boolean.TRUE;
       }else {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
