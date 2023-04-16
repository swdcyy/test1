package com.kuaishou.live.lite.recommendsidebar.panel.p;
import ok.x;
import java.lang.Object;
import yc3.x;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Boolean;

public final class p implements x	// class@000b0b
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().u("SOURCE_LIVE").d("live_lite_recommend_disable_replace", false));
    }
}
