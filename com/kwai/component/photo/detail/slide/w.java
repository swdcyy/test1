package com.kwai.component.photo.detail.slide.w;
import ok.x;
import java.lang.Object;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class w implements x	// class@000aab
{
    public static final w b;

    static {
       w.b = new w();
    }
    public void w(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("needReportBecomesAttached", false));
    }
}
