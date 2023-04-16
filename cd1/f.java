package cd1.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class f implements Observer	// class@000499
{
    public final LiveIncreaseFansNoticeWidget b;

    public void f(LiveIncreaseFansNoticeWidget p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveIncreaseFansNoticeWidget.class, "11")) {
       }else {
          LiveIncreaseFansNoticeWidget b = tb.b;
          if (b != null) {
             b.setFirstLineContent(p0.mSubTitle);
             tb.b.setSecondLineContent(p0.mDescription);
             b = tb.b;
             LiveGenericCommentNoticeInfo mContentIcon = p0.mContentIconUrls;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(mContentIcon, b, LiveIncreaseFansNoticeView.class, "4") && !mContentIcon.isEmpty()) {
                b.c.P(mContentIcon);
             }
             tb.b.setButtonText(p0.mRightButtonText);
          }
       }
       return;
    }
}
