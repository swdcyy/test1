package com.yxcorp.gifshow.postentrance.bubblev2.exception.PluginLoadFailedThrowable;
import com.yxcorp.gifshow.postentrance.bubblev2.exception.BubbleThrowable;
import java.lang.String;
import java.lang.Integer;
import java.lang.Throwable;
import hzb.a;
import qrd.l1;

public final class PluginLoadFailedThrowable extends BubbleThrowable	// class@001008
{

    public void PluginLoadFailedThrowable(String p0,Integer p1,Throwable p2){
       a uoa = new a();
       uoa.f(21);
       if (p0 != null) {
          uoa.d(p0);
       }
       if (p1 != null) {
          uoa.e(p1.intValue());
       }
       super(uoa, p2, true);
       return;
    }
}
