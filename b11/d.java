package b11.d;
import erd.g;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeCurrentResponse;
import t02.a0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hm2.a$b;
import java.lang.String;
import java.util.Objects;
import b11.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeCurrentMessageInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@0002f9
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       tb.b.i2.ek(p0.mLiveWealthGradeInfo);
       tb.b.i2.Id(p0.mPrivilegeInfoH5Url);
       tb.h("on_fetch_grade_info");
       e a = tb.A;
       p0 = p0.mWealthGradeCurrentMessageInfo;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidOneRefs(p0, a, j.class, "1")) {
       }else if(p0 == null){
          p0 = p0.mBeforeLightOffMessage;
          if (!TextUtils.x(p0)) {
             TextView textView = a.b.get();
             if (textView == null) {
                b.Z(LiveLogTag.WEALTH_GRADE, "[LiveGiftBoxWealthGradeTipLogic][showTipsMessageIfNeeded]: tipTv is null");
             }else {
                textView.setText(p0);
             }
          }
       }
       return;
    }
}
