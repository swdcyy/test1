package com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$4;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker;
import java.lang.String;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$1;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;

public final class AutoPlayCardPlayChecker$4 extends AutoPlayCardPlayChecker	// class@001bec
{

    public void AutoPlayCardPlayChecker$4(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(ViewGroup p0,View p1,View p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AutoPlayCardPlayChecker$4.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (p2.getTop() >= 0) {
          p2.getLocalVisibleRect(this.mRect);
          if (this.mRect.bottom == p2.getHeight()) {
             b = true;
          }
       }
       return b;
    }
}
