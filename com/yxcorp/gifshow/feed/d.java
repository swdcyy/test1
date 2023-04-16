package com.yxcorp.gifshow.feed.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.VideoFeed;
import kp.l;
import tl8.d;
import ok.h;
import tl8.e;
import kfa.a;
import wkd.b;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.feed.b;
import com.yxcorp.gifshow.feed.c;

public class d	// class@000ff3
{

    public void d(){
       super();
    }
    public static t a(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uod, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!e.a(p0.getEntity(), VideoFeed.class, l.b)) {
          return t.just(p0);
       }
       Object obj1 = PatchProxy.apply(null, null, uod, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = b.a(0xc9b4e3a);
       }
       return obj1.a(p0.getPhotoId()).map(new e()).map(new b(p0));
    }
    public static o b(){
       Object obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b;
    }
}
