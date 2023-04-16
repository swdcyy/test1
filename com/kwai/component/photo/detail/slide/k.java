package com.kwai.component.photo.detail.slide.k;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class k implements x	// class@000a58
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object get(){
       int i = d.e();
       Boolean uBoolean = (i != 1 && (i != 2 && i != 3))? Boolean.valueOf(a.t().d("newFeedbackWeChatMoveDown", false)): Boolean.FALSE;
       return uBoolean;
    }
}
