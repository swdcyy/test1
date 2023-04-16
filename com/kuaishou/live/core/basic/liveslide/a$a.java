package com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.b$a;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import wg3.b;
import b51.d;
import c51.d;
import c51.i;
import java.util.List;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;

public class a$a extends b$a	// class@00083a
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super(p0);
    }
    public QPhoto h(int p0){
       b$a obj;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = b$a.class;
       if (PatchProxy.isSupport(obj)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, obj, "5");
          if (obj1 != patchProxyRe) {
          }else if(p0 < 0 || this.a.e().p().f() <= p0){
             obj1 = null;
          }else {
             obj1 = this.a.e().p().l().get(p0);
          }
       }else {
          goto label_0031 ;
       }
       if (obj1 != null) {
          return new QPhoto(obj1);
       }else {
          return null;
       }
    }
}
