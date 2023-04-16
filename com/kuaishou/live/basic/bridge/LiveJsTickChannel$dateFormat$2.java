package com.kuaishou.live.basic.bridge.LiveJsTickChannel$dateFormat$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveJsTickChannel$dateFormat$2 extends Lambda implements a	// class@000cac
{
    public static final LiveJsTickChannel$dateFormat$2 INSTANCE;

    static {
       LiveJsTickChannel$dateFormat$2.INSTANCE = new LiveJsTickChannel$dateFormat$2();
    }
    public void LiveJsTickChannel$dateFormat$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final SimpleDateFormat invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsTickChannel$dateFormat$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleDateFormat("yyyy/M/dd hh:mm:ss");
    }
}
