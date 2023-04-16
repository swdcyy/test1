package com.kuaishou.live.common.core.basic.tools.m;
import ok.x;
import java.lang.Object;
import va1.a0;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Boolean;

public final class m implements x	// class@000eff
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf((a.t().u("SOURCE_LIVE").d("disableFilterCommentOnlyByDeviceHash", false) ^ 0x01));
    }
}
