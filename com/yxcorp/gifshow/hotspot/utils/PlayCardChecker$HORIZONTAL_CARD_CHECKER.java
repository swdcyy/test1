package com.yxcorp.gifshow.hotspot.utils.PlayCardChecker$HORIZONTAL_CARD_CHECKER;
import com.yxcorp.gifshow.hotspot.utils.PlayCardChecker;
import java.lang.String;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.graphics.Rect;

public final class PlayCardChecker$HORIZONTAL_CARD_CHECKER extends PlayCardChecker	// class@0018ec
{

    public void PlayCardChecker$HORIZONTAL_CARD_CHECKER(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayCardChecker$HORIZONTAL_CARD_CHECKER.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "playerView");
       boolean b = false;
       if (!this.checkViewState(p0)) {
          return b;
       }
       if (p0.getLocalVisibleRect(this.getMRect()) && this.getMRect().width() == p0.getWidth()) {
          b = true;
       }
       return b;
    }
}
