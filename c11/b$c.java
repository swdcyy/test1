package c11.b$c;
import erd.g;
import c11.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveAudienceGiftRewardManageInfo;
import c11.b$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.lang.Boolean;
import z61.b;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class b$c implements g	// class@00044e
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          b$c tb = this.b;
          p0 = p0.mLiveAudienceGiftRewardManageInfo;
          LiveTimeConsumingUserStatusResponse$LiveAudienceGiftRewardManageInfo mUrl = (p0 != null)? p0.mUrl: null;
          tb.N = mUrl;
          boolean b = false;
          b$a uoa = 1;
          boolean b1 = (p0 != null && p0.mEnableConsumeRemind == uoa)? true: false;
          b$a uoa1 = tb.a9();
          if (b1 && !TextUtils.x(this.b.N)) {
             b = true;
          }
          Objects.requireNonNull(uoa1);
          uoa = b$a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoa1, uoa, "4")) {
             uoa1.c.mIsVisible = Boolean.valueOf(b);
             uoa1.b.setValue(uoa1.c);
          }
          b.T(this.b.K, "userIoStatus return !!!", "isItemVisible", Boolean.valueOf(b1), "url", this.b.N);
       }
       return;
    }
}
