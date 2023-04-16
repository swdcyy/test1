package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$showEditor$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AdDanmakuElement$showEditor$1 extends Lambda implements a	// class@001709
{
    public final MilanoContainerEventBus$b $defaultTextModel;
    public final boolean $showEmojiFirst;
    public final AdDanmakuElement this$0;

    public void AdDanmakuElement$showEditor$1(AdDanmakuElement p0,boolean p1,MilanoContainerEventBus$b p2){
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
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement$showEditor$1.class, "1")) {
          return;
       }
       this.this$0.E0(this.$showEmojiFirst, this.$defaultTextModel);
       return;
    }
}
