package com.kuaishou.live.preview.item.bottomcard.handler.LivePreviewMerchantBottomCardHandler$addCommonBottomCardItem$$inlined$let$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import hk3.r;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rl3.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gk3.b;
import kk3.f$b;
import com.yxcorp.gifshow.entity.QPhoto;
import jk3.b;

public final class LivePreviewMerchantBottomCardHandler$addCommonBottomCardItem$$inlined$let$lambda$2 extends Lambda implements l	// class@000d7e
{
    public final LivePreviewBottomCardModel $it$inlined;
    public final LivePreviewBottomCardModel $livePreviewBottomCardModel$inlined;
    public final r this$0;

    public void LivePreviewMerchantBottomCardHandler$addCommonBottomCardItem$$inlined$let$lambda$2(LivePreviewBottomCardModel p0,r p1,LivePreviewBottomCardModel p2){
       this.$it$inlined = p0;
       this.this$0 = p1;
       this.$livePreviewBottomCardModel$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LivePreviewMerchantBottomCardHandler$addCommonBottomCardItem$$inlined$let$lambda$2.class, "1")) {
          return;
       }
       c.a(p0);
       if (TextUtils.x(p0)) {
          this.this$0.d(this.$livePreviewBottomCardModel$inlined);
       }else {
          this.this$0.a.e(p0);
       }
       this.this$0.a.c().e();
       b.n(this.this$0.a.d(), "CUSTOMER_COMMENT_MORE", this.this$0.c(this.$livePreviewBottomCardModel$inlined));
       PatchProxy.onMethodExit(LivePreviewMerchantBottomCardHandler$addCommonBottomCardItem$$inlined$let$lambda$2.class, "1");
       return;
    }
}
