package com.kwai.live.gzone.promotion.LiveGzoneAudienceGamePromotionPopupPageAdapter$1;
import androidx.appcompat.widget.AppCompatTextView;
import com.kwai.live.gzone.promotion.k;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;

public class LiveGzoneAudienceGamePromotionPopupPageAdapter$1 extends AppCompatTextView	// class@000da8
{
    public final k f;

    public void LiveGzoneAudienceGamePromotionPopupPageAdapter$1(k p0,Context p1){
       this.f = p0;
       super(p1);
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneAudienceGamePromotionPopupPageAdapter$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneAudienceGamePromotionPopupPageAdapter$1.class, "1")) {
          return;
       }
       super.setSelected(p0);
       if (p0) {
          this.setAlpha(0x3f800000);
       }else {
          this.setAlpha(0x3f000000);
       }
       return;
    }
}
