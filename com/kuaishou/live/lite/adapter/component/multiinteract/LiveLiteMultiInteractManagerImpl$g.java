package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$g;
import sa1.b$a;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import sz1.m;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;

public final class LiveLiteMultiInteractManagerImpl$g implements b$a	// class@001dfe
{
    public final LiveLiteMultiInteractManagerImpl a;

    public void LiveLiteMultiInteractManagerImpl$g(LiveLiteMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public void a(int p0,MessageNano p1,byte[] p2,boolean p3){
       if (!PatchProxy.isSupport(LiveLiteMultiInteractManagerImpl$g.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, LiveLiteMultiInteractManagerImpl$g.class, "1")) {
          a.p(p1, "layoutConfig");
          a.p(p2, "originData");
          this.a.h.U(p1);
       }
       return;
    }
}
