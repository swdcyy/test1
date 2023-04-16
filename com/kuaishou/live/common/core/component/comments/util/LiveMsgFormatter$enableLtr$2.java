package com.kuaishou.live.common.core.component.comments.util.LiveMsgFormatter$enableLtr$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class LiveMsgFormatter$enableLtr$2 extends Lambda implements a	// class@0010d1
{
    public static final LiveMsgFormatter$enableLtr$2 INSTANCE;

    static {
       LiveMsgFormatter$enableLtr$2.INSTANCE = new LiveMsgFormatter$enableLtr$2();
    }
    public void LiveMsgFormatter$enableLtr$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMsgFormatter$enableLtr$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableCommentListForceLTRStrategy", false);
    }
}
