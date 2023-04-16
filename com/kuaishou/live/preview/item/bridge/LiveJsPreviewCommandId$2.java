package com.kuaishou.live.preview.item.bridge.LiveJsPreviewCommandId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n41.b;

public final class LiveJsPreviewCommandId$2 extends Lambda implements a	// class@000ddb
{
    public static final LiveJsPreviewCommandId$2 INSTANCE;

    static {
       LiveJsPreviewCommandId$2.INSTANCE = new LiveJsPreviewCommandId$2();
    }
    public void LiveJsPreviewCommandId$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsPreviewCommandId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
