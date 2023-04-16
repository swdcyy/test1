package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$b;

public class LiveIncreaseFansNoticeWidget$a extends m	// class@000fdc
{
    public final LiveIncreaseFansNoticeWidget c;

    public void LiveIncreaseFansNoticeWidget$a(LiveIncreaseFansNoticeWidget p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveIncreaseFansNoticeWidget$a.class, "1")) {
          return;
       }
       LiveIncreaseFansNoticeWidget$a tc = this.c;
       tc.c.S4(tc.h.getValue());
       return;
    }
}
