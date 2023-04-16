package com.yxcorp.gifshow.v3.editor.music_v2.vm.MusicMiddleware$startGenerateRapMusic$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.vm.MusicMiddleware$startGenerateRapMusic$2;
import java.lang.Object;
import src.g;
import urc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lsc.w;
import msc.e;

public final class MusicMiddleware$startGenerateRapMusic$2$1 extends Lambda implements l	// class@001130
{
    public final MusicMiddleware$startGenerateRapMusic$2 this$0;

    public void MusicMiddleware$startGenerateRapMusic$2$1(MusicMiddleware$startGenerateRapMusic$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(g p0){
       b uob;
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicMiddleware$startGenerateRapMusic$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$mapToDraftInfo");
       if (p0.u()) {
          uob = w.a(p0);
       }else {
          this.this$0.b.d(p0);
          uob = null;
       }
       return uob;
    }
}
