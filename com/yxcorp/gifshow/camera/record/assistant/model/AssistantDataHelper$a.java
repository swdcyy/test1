package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$a;
import erd.o;
import e4b.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import lnc.o5;
import brd.t;

public final class AssistantDataHelper$a implements o	// class@001cf8
{
    public final boolean b;
    public final a c;

    public void AssistantDataHelper$a(boolean p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, AssistantDataHelper$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "magicFace");
          p0 = (this.b != null)? this.c.i(o5.c(p0.mId)): this.c.j(o5.c(p0.mId));
          ot = p0;
       }
       return ot;
    }
}
