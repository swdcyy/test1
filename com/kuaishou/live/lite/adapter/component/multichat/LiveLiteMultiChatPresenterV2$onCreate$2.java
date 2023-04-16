package com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2$onCreate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2;
import java.lang.Object;
import ip1.a;
import lp1.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import f83.d;

public final class LiveLiteMultiChatPresenterV2$onCreate$2 extends Lambda implements l	// class@001df6
{
    public final LiveLiteMultiChatPresenterV2 this$0;

    public void LiveLiteMultiChatPresenterV2$onCreate$2(LiveLiteMultiChatPresenterV2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final d invoke(a p0){
       LiveLiteMultiChatPresenterV2$onCreate$2 obj = PatchProxy.applyOneRefs(p0, this, LiveLiteMultiChatPresenterV2$onCreate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0;
       Objects.requireNonNull(obj);
       d uod = PatchProxy.applyOneRefs(p0, obj, LiveLiteMultiChatPresenterV2.class, "6");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(obj, p0);
       }
       return uod;
    }
}
