package com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$1;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;

public final class AutoPlayCardPlayChecker$1 extends AutoPlayCardPlayChecker	// class@001be9
{

    public void AutoPlayCardPlayChecker$1(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(ViewGroup p0,View p1,View p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AutoPlayCardPlayChecker$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = true;
       if (p2.getTop() < 0) {
          if ((p2.getTop() + (p2.getHeight() / 2)) < 0) {
             b = false;
          }
          return b;
       }else {
          p2.getLocalVisibleRect(this.mRect);
          if ((((float)this.mRect.height() * 0x3f800000) / (float)p2.getHeight()) - 0x3f000000 < 0) {
             b = false;
          }
          return b;
       }
    }
}
