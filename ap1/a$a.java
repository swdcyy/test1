package ap1.a$a;
import ol1.p;
import ap1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ol1.n;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import ug1.x0;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintDisplayInfo;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintPictureInfo;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;
import com.kuaishou.live.external.invoke.deserializer.gift.LiveGiftItemHintActionInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ap1.a$a$a;
import lnc.a1;
import android.view.View;
import com.yxcorp.gifshow.models.Gift;
import java.util.Collection;
import ekd.q;

public class a$a implements p	// class@00026c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "3")) {
          return;
       }
       if (this.a.p.getVisibility() == 8) {
          return;
       }
       this.a.p.setOnClickListener(objArray);
       this.a.p.animate().setListener(objArray);
       this.a.p.animate().cancel();
       this.a.p.setVisibility(8);
       this.a.p.setTranslationY(0);
       return;
    }
    public n b(GiftTab p0,GiftPanelItem p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "2");
       if (p0 != patchProxyRe) {
          return p0;
       }
       n on = null;
       if (!this.c(p1)) {
          this.a();
          return on;
       }else {
          LiveGiftItemHintItem liveGiftItem = x0.a(p1);
          this.a.p.animate().setListener(on);
          this.a.p.animate().cancel();
          int i = 0;
          this.a.p.setVisibility(i);
          this.a.p.animate().alpha(0x3f800000).setDuration(300).start();
          this.a.R8();
          this.a.p.P(liveGiftItem.mDisplayInfo.mPictureInfo.mPictureUrls);
          p1 = PatchProxy.applyOneRefs(liveGiftItem, on, x0.class, "3");
          if (p1 != patchProxyRe) {
             b = p1.booleanValue();
          }else {
             LiveGiftItemHintItem mActionInfo = liveGiftItem.mActionInfo;
             if (mActionInfo != null && (mActionInfo.mActionType == 5 && !TextUtils.x(mActionInfo.mLink))) {
                i = 1;
             }
          label_0088 :
             b = i;
          }
          if (b) {
             this.a.p.setOnClickListener(new a$a$a(this, liveGiftItem));
          }
          on = new n(this.a.p, a1.e(12.00f), 0, a1.e(12.00f), 0);
          return liveGiftItem;
       }
    }
    public boolean c(GiftPanelItem p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.getGift() != null) {
          LiveGiftItemHintItem liveGiftItem = x0.a(p0);
          if (p0.getGift().isMagicBoxGift()) {
             p0 = PatchProxy.applyOneRefs(liveGiftItem, null, x0.class, "2");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             }else if(liveGiftItem != null){
                LiveGiftItemHintItem mDisplayInfo = liveGiftItem.mDisplayInfo;
                if (mDisplayInfo != null) {
                   LiveGiftItemHintDisplayInfo mPictureInfo = mDisplayInfo.mPictureInfo;
                   if (mPictureInfo != null && !q.f(mPictureInfo.mPictureUrls)) {
                      b = true;
                   }
                }
             }
             b = false;
             if (b) {
                return true;
             }
          }
       }
       return false;
    }
}
