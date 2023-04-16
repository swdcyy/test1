package com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$2;
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

public final class AutoPlayCardPlayChecker$2 extends AutoPlayCardPlayChecker	// class@001bea
{

    public void AutoPlayCardPlayChecker$2(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(ViewGroup p0,View p1,View p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AutoPlayCardPlayChecker$2.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = true;
       if (p2.getLeft() < 0) {
          if ((p2.getLeft() + (p2.getWidth() / 2)) < 0) {
             b = false;
          }
          return b;
       }else {
          p2.getLocalVisibleRect(this.mRect);
          if ((((float)this.mRect.width() * 0x3f800000) / (float)p2.getWidth()) - 0x3f000000 < 0) {
             b = false;
          }
          return b;
       }
    }
}
