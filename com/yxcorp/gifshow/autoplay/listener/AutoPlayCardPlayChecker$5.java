package com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$5;
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
import android.content.Context;
import com.yxcorp.utility.n;

public final class AutoPlayCardPlayChecker$5 extends AutoPlayCardPlayChecker	// class@001bed
{

    public void AutoPlayCardPlayChecker$5(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checkPlay(ViewGroup p0,View p1,View p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AutoPlayCardPlayChecker$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (p2.getLeft() >= 0)? 1: 0;
       int i = (p2.getTop() >= 0)? 1: 0;
       int i1 = (p2.getRight() < n.z(p2.getContext()))? 1: 0;
       if (p0 != null && p1 != null) {
          i = ((p0.getTop() + p1.getTop()) >= 0)? 1: 0;
       }
    label_004e :
       if (!obj || (!i || !i1)) {
          b = false;
       }
       return b;
    }
}
