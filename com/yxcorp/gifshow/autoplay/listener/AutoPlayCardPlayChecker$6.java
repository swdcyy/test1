package com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$6;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker;
import java.lang.String;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$1;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;

public final class AutoPlayCardPlayChecker$6 extends AutoPlayCardPlayChecker	// class@001bee
{

    public void AutoPlayCardPlayChecker$6(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(View p0,float p1){
       AutoPlayCardPlayChecker$6 u6 = AutoPlayCardPlayChecker$6.class;
       if (PatchProxy.isSupport(u6)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, u6, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0.getTop() < 0) {
          if ((((float)(p0.getHeight() + p0.getTop()) * 0x3f800000) / (float)p0.getHeight()) - p1 < 0) {
             b = false;
          }
          return b;
       }else {
          p0.getLocalVisibleRect(this.mRect);
          if ((((float)this.mRect.height() * 0x3f800000) / (float)p0.getHeight()) - p1 < 0) {
             b = false;
          }
          return b;
       }
    }
}
