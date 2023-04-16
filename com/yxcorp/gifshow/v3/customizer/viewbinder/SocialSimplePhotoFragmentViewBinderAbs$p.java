package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$p;
import oj0.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Double;
import java.lang.Number;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.Iterator;
import nsd.s0;
import com.kwai.feature.post.api.feature.bridge.GoToPostValue;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$p$a;
import java.lang.Runnable;
import ca7.v;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class SocialSimplePhotoFragmentViewBinderAbs$p implements a	// class@000d87
{
    public final SocialSimplePhotoFragmentViewBinderAbs b;

    public void SocialSimplePhotoFragmentViewBinderAbs$p(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$p.class, "1")) {
          return;
       }
       a uoa = a.D();
       String str = "onReceive data:"+p0;
       Object[] objArray = new Object[0];
       try{
          uoa.w("SocialSimplePhotoFragmentViewBinderAbs", str, objArray);
          Object obj = p0.get("visibleSize");
          if (obj instanceof Double) {
             this.b.V = obj.doubleValue();
          }
          p0 = p0.get("resultList");
          if (p0 instanceof List) {
             this.b.W.clear();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj instanceof Map) {
                   this.b.W.add(GoToPostValue.getFromMap(s0.k(obj)));
                }
             }
          }
          v.e(new SocialSimplePhotoFragmentViewBinderAbs$p$a(this));
       }catch(java.lang.Exception e8){
          PostUtils.D("SocialSimplePhotoFragmentViewBinderAbs", "onReceive", e8);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "onReceive visibleSize:"+this.b.V+", customParam:"+this.b.W, objArray1);
       return;
    }
}
