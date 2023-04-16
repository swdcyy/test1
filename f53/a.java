package f53.a;
import h47.b;
import f53.b;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import wh5.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import wb5.d;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Iterable;
import s0d.b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;

public final class a implements b	// class@0028a0
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, b.class, "5")) {
       }else {
          LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem uBottomBarGi = ta.p.b();
          if (c.b()) {
             uBottomBarGi.o(R.drawable.arg_RES_7f0812cc);
          }else if(!TextUtils.isEmpty(p0.mGiftPanelEntranceButtonPictureUrl)){
             p0 = p0.mGiftPanelEntranceButtonPictureUrl;
             ta.s = p0;
             List list = Collections.singletonList(p0);
             ImageRequest[] imageRequest = PatchProxy.applyOneRefs(list, null, d.class, "22");
             if (imageRequest != PatchProxyResult.class) {
             }else {
                imageRequest = b.a(list);
             }
             d uod = Fresco.newDraweeControllerBuilder();
             uod.u(imageRequest);
             uod.q(true);
             uBottomBarGi.x(uod.e());
          }
       }
       return;
    }
}
