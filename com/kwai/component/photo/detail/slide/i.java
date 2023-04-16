package com.kwai.component.photo.detail.slide.i;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class i implements x	// class@000a56
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object get(){
       int i = d.e();
       Boolean uBoolean = (i != 1 && (i != 2 && i != 3))? Boolean.valueOf(a.t().d("newFeedbackPanelHeightHalfScreen", false)): Boolean.FALSE;
       return uBoolean;
    }
}
