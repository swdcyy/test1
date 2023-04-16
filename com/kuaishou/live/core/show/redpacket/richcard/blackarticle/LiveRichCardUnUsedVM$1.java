package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUnUsedVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUnUsedVM;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import java.lang.String;
import bi2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;

public final class LiveRichCardUnUsedVM$1 implements Model$a	// class@000f5c
{
    public final LiveRichCardUnUsedVM b;
    public final BottomBarInfo c;

    public void LiveRichCardUnUsedVM$1(LiveRichCardUnUsedVM p0,BottomBarInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardUnUsedVM$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardUnUsedVM$1.class, "1")) {
       }else {
          a.p(p0, "source");
          LiveRichCardUnUsedVM$1 tb = this.b;
          MutableLiveData mutableLiveD = tb.r0(tb.v0());
          if (p2 != null) {
             p1 = p2.a();
             if (p1 != null) {
                p1 = p1.getFreeCardCanUseText();
             label_0030 :
                mutableLiveD.setValue(p1);
                tb = this.b;
                tb.r0(tb.u0()).setValue(this.c);
             }
          }
          p1 = null;
          goto label_0030 ;
       }
       return;
    }
}
