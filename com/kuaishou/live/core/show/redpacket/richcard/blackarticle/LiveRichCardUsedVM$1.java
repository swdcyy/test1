package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveRichCardUsedVM$1 implements Model$a	// class@000f60
{
    public final LiveRichCardUsedVM b;

    public void LiveRichCardUsedVM$1(LiveRichCardUsedVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardUsedVM$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardUsedVM$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             LiveRichCardUsedVM$1 tb = this.b;
             tb.r0(tb.x0()).setValue(p2);
          }
       }
       return;
    }
}
