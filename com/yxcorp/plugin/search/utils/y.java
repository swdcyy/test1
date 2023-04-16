package com.yxcorp.plugin.search.utils.y;
import com.yxcorp.gifshow.entity.QPhoto$c;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import nfd.r2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.plugin.impl.search.SearchMeta;
import myb.a;
import java.lang.StringBuilder;
import kp.r1;

public final class y implements QPhoto$c	// class@0007b8
{
    public static final y a;

    static {
       y.a = new y();
    }
    public void y(){
       super();
    }
    public final String a(BaseFeed p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r2 or2 = r2.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, or2, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(a.a(p0) != null){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, or2, "2");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             SearchMeta searchMeta = a.a(p0);
             String str = (searchMeta == null || searchMeta.noOverridePhotoId != null)? r1.t1(p0): searchMeta.getId()+r1.t1(p0);
             obj = str;
          }
       }
       return obj;
    }
}
