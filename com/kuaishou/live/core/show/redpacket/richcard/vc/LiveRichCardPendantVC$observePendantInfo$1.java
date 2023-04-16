package com.kuaishou.live.core.show.redpacket.richcard.vc.LiveRichCardPendantVC$observePendantInfo$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import ei2.b;
import java.lang.Object;
import java.lang.String;
import bi2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wu1.a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData;
import java.util.Objects;
import wu1.g;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveRichCardPendantVC$observePendantInfo$1 implements Model$a	// class@000f9e
{
    public final b b;

    public void LiveRichCardPendantVC$observePendantInfo$1(b p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       f b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardPendantVC$observePendantInfo$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             a g = p2.a().g;
             if (p1 != null) {
                p1 = p1.a();
                if (p1 != null) {
                   p1 = p1.g;
                label_002d :
                   if (a.g(g, p1)) {
                      b.P(LiveRichCardStateManager.h.f().appendTag(this.b.a), "observePendantInfo, data数据相同，不更新");
                   }
                }
             }
             p1 = null;
             goto label_002d ;
          }
          if (p2 != null) {
             b = p2.b;
             if (b != null && b.a() == -1) {
                b.P(LiveRichCardStateManager.h.f().appendTag(this.b.a), "autoGrabStatus= UNKONW");
                this.b.a();
             }
          }
          if (p2 != null && p2.c == 10) {
             c uoc = LiveRichCardStateManager.h.f();
             uoc.appendTag(this.b.a);
             c uoc1 = uoc;
             b.V(uoc1, "更新挂件信息", "bizId", p2.a().i, "activityId", p2.a().j, "mId", p2.a().k, "data", p2.a().g);
             LiveRichCardPendantVC$observePendantInfo$1 tb = this.b;
             p1 = p2.a();
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p1, tb, b.class, "3")) {
                tb.b = p1;
                b d = tb.d;
                if (d != null) {
                   d.b(p1);
                }
             }
          }else {
             b.P(LiveRichCardStateManager.h.f().appendTag(this.b.a), "移除挂件");
             this.b.a();
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardPendantVC$observePendantInfo$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
