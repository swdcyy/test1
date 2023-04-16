package com.yxcorp.gifshow.hotspot.utils.PlayCardChecker$INVALID;
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

public final class PlayCardChecker$INVALID extends PlayCardChecker	// class@0018ed
{

    public void PlayCardChecker$INVALID(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayCardChecker$INVALID.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "playerView");
       return false;
    }
}
