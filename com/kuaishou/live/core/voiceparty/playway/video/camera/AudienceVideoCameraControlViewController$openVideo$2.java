package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$openVideo$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import yx2.d;
import yx2.h;
import lnc.i3;
import co2.f2;
import yx2.n;
import qrd.l1;

public final class AudienceVideoCameraControlViewController$openVideo$2 extends Lambda implements l	// class@0018c5
{
    public final AudienceVideoCameraControlViewController this$0;

    public void AudienceVideoCameraControlViewController$openVideo$2(AudienceVideoCameraControlViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Void invoke(Boolean p0){
       d obj = PatchProxy.applyOneRefs(p0, this, AudienceVideoCameraControlViewController$openVideo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.m(p0);
       String str = (!p0.booleanValue())? "CANCEL": "CONFIRM";
       obj = this.this$0.A.e("LIVE_VOICE_PARTY_VERIFIED_PUPUP");
       i3 oi3 = i3.f();
       oi3.d("btn_type", str);
       n.b(this.this$0.q, oi3);
       str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
       obj.a(str);
       obj.f();
       return null;
    }
}
