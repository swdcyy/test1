package com.kuaishou.live.lite.tempplay.a;
import ok.h;
import com.kuaishou.live.lite.tempplay.c;
import java.lang.Object;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import java.util.Map;
import com.kuaishou.live.lite.util.viewupdater.LiteTouchEventConsumeAwareLayout;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$TempPlayBizId;
import android.widget.FrameLayout;
import pd3.d;
import z1.a;
import java.lang.Integer;

public final class a implements h	// class@000b88
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       LiteTouchEventConsumeAwareLayout liteTouchEve = PatchProxy.applyOneRefs(p0, tb, c.class, "6");
       if (liteTouchEve != PatchProxyResult.class) {
       }else {
          liteTouchEve = LiteTouchEventConsumeAwareLayout.a(tb.n, p0.a(tb.D2()));
          if (p0.getId() == LiveLiteTempPlayService$TempPlayBizId.PROFIT_INFO) {
             liteTouchEve.setClipChildren(false);
          }
          liteTouchEve.setTouchEventConsumedListener(new d(tb, p0));
          liteTouchEve.setTag(R.id.lite_temp_play_view_bind_item, p0);
          liteTouchEve.setTag(R.id.lite_temp_play_view_biz_priority, Integer.valueOf(p0.getId().mBizPriority));
       }
       return liteTouchEve;
    }
}
