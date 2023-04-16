package com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.library.widget.popup.bubble.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import k07.p;

public final class BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3 extends Lambda implements l	// class@001644
{
    public final a$c $builder;
    public final Ref$ObjectRef $mBubble$inlined;
    public final BlockTabLifecycleAwareness this$0;

    public void BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3(a$c p0,BlockTabLifecycleAwareness p1,Ref$ObjectRef p2){
       this.$builder = p0;
       this.this$0 = p1;
       this.$mBubble$inlined = p2;
       super(1);
    }
    public final a invoke(a$c p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3 t$builder = this.$builder;
       a.o(t$builder, "builder");
       a uoa = p.d(t$builder);
       this.$mBubble$inlined.element = uoa;
       PatchProxy.onMethodExit(BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3.class, "1");
       return uoa;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
