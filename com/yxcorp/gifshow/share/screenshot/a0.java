package com.yxcorp.gifshow.share.screenshot.a0;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import e06.b;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import wh5.c;
import com.yxcorp.gifshow.share.screenshot.z;
import java.lang.Runnable;
import ekd.k1;

public class a0	// class@001c4e
{

    public void a0(){
       super();
    }
    public static void a(GifshowActivity p0,b p1,String p2,int p3,String p4,String p5,BaseFeed p6){
       Object[] objArray;
       if (PatchProxy.isSupport2(a0.class, "1")) {
          objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, a0.class, "1")) {
             return;
          }
       }
       if (!c.h()) {
          PatchProxy.onMethodExit(a0.class, "1");
          return;
       }else {
          z oz = new z(p0, p6, p1, p2, p3, p4, p5);
          k1.o(objArray);
          PatchProxy.onMethodExit(a0.class, "1");
          return;
       }
    }
}
