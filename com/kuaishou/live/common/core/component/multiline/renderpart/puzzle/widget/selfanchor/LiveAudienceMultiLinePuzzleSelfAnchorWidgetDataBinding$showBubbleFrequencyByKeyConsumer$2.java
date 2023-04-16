package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showBubbleFrequencyByKeyConsumer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import java.lang.Object;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v91.h;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import v91.a;

public final class LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showBubbleFrequencyByKeyConsumer$2 extends Lambda implements a	// class@0015c1
{
    public final LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding this$0;

    public void LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showBubbleFrequencyByKeyConsumer$2(LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       QCurrentUser qCurrentUser;
       h[] obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showBubbleFrequencyByKeyConsumer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h[]{new h("Audience"+qCurrentUser.getId(), 3),new h("Audience"+this.this$0.m.invoke(), 1)};
       qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       return a.a(CollectionsKt__CollectionsKt.L(obj));
    }
}
