package com.kuaishou.live.common.core.component.gift.f;
import ok.x;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import java.lang.String;
import java.io.File;
import ug1.d0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.drawee.controller.AbstractDraweeController;

public final class f implements x	// class@001280
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object get(){
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       uod.w(ImageRequest.a(d0.a("live_gift_slot_naming_animation.webp")));
       return uod.e();
    }
}
