package com.kwai.component.photo.detail.slide.n;
import ok.x;
import java.lang.Object;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class n implements x	// class@000a6e
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("merchantShortVideoDataInsightWhiteList", false));
    }
}
