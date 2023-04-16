package com.kuaishou.live.preview.item.bridge.LiveJsPreviewCommandId$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n41.c;

public final class LiveJsPreviewCommandId$1 extends Lambda implements a	// class@000dda
{
    public static final LiveJsPreviewCommandId$1 INSTANCE;

    static {
       LiveJsPreviewCommandId$1.INSTANCE = new LiveJsPreviewCommandId$1();
    }
    public void LiveJsPreviewCommandId$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsPreviewCommandId$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
