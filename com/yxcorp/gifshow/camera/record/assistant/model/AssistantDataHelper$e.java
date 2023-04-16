package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$e;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import com.yxcorp.gifshow.music.utils.f;

public final class AssistantDataHelper$e implements o	// class@001cfc
{
    public final boolean b;

    public void AssistantDataHelper$e(boolean p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, AssistantDataHelper$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "music");
          p0 = (this.b != null)? f.b(p0): f.a(p0);
          ot = p0;
       }
       return ot;
    }
}
