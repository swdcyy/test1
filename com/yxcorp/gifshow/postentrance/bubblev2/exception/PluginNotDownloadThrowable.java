package com.yxcorp.gifshow.postentrance.bubblev2.exception.PluginNotDownloadThrowable;
import com.yxcorp.gifshow.postentrance.bubblev2.exception.BubbleThrowable;
import java.lang.String;
import java.lang.Integer;
import hzb.a;
import qrd.l1;
import java.lang.Throwable;
import nsd.u;

public final class PluginNotDownloadThrowable extends BubbleThrowable	// class@001009
{

    public void PluginNotDownloadThrowable(String p0,Integer p1){
       a uoa = new a();
       uoa.f(20);
       uoa.g("plugin not download");
       if (p0 != null) {
          uoa.d(p0);
       }
       if (p1 != null) {
          uoa.e(p1.intValue());
       }
       super(uoa, null, true, 2, null);
       return;
    }
}
