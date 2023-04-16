package cva.f;
import cva.a;
import y8c.f$b;
import com.yxcorp.gifshow.log.e;
import com.kwai.component.photo.reduce.f;
import ha5.e;
import pa5.a;
import com.kwai.framework.model.feed.BaseFeed;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.live.e;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import tkd.b;
import tkd.d;
import os5.l;
import cva.k;
import java.util.Map;

public class f extends a	// class@0023d7
{
    public LiveAutoPlayModule r;
    public b s;
    public m t;

    public void f(f$b p0,e p1,f p2,e p3,a p4,BaseFeed p5){
       super(p0, p1, p2, p3, p4);
       this.s = new b(Boolean.FALSE);
       p1 = PatchProxy.applyOneRefs(p5, this, f.class, "1");
       if (p1 != PatchProxyResult.class) {
       }else {
          e$a uoa = new e$a(p5, this.f, 25, ":ks-features:ft-feed:hot-spot");
          uoa.d(true);
          uoa.e(true);
          uoa.m(true);
          uoa.i(14);
          uoa.h(5);
          uoa.a(3);
          uoa = uoa.f(d.a(-1492894991).l2()).b();
       }
       this.r = new LiveAutoPlayModule(p1);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(f.class, new k());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
}
