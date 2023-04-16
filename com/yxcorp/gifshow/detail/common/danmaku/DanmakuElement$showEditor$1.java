package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$showEditor$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DanmakuElement$showEditor$1 extends Lambda implements a	// class@0013ed
{
    public final MilanoContainerEventBus$b $defaultTextModel;
    public final boolean $showEmojiFirst;
    public final DanmakuElement this$0;

    public void DanmakuElement$showEditor$1(DanmakuElement p0,boolean p1,MilanoContainerEventBus$b p2){
       this.this$0 = p0;
       this.$showEmojiFirst = p1;
       this.$defaultTextModel = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$showEditor$1.class, "1")) {
          return;
       }
       this.this$0.G0(this.$showEmojiFirst, this.$defaultTextModel);
       return;
    }
}
