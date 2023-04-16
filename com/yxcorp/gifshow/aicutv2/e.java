package com.yxcorp.gifshow.aicutv2.e;
import erd.o;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i69.a;
import kotlin.jvm.internal.a;

public final class e implements o	// class@0019a6
{
    public final AICutMusicInfo b;

    public void e(AICutMusicInfo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa = new a(this.b);
       }
       return uoa;
    }
}
