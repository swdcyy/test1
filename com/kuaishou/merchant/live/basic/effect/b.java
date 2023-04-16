package com.kuaishou.merchant.live.basic.effect.b;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n14.a;
import io.reactivex.g;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import tc.h;
import com.facebook.cache.common.CacheKey;
import vc.j;
import com.facebook.cache.disk.f;
import sa.a;
import sa.b;
import java.io.File;

public class b	// class@00188f
{

    public void b(){
       super();
    }
    public static t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return t.just("");
       }
       return t.create(new a(p0));
    }
    public static String b(ImagePipeline p0,ImageRequest p1){
       String absolutePath;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CacheKey uCacheKey = p0.getCacheKeyFactory().b(p1, null);
       if (uCacheKey != null) {
          a uoa = j.j().l().c(uCacheKey);
          if (uoa instanceof b) {
             File uFile = uoa.c();
             if (uFile != null && uFile.exists()) {
                absolutePath = uFile.getAbsolutePath();
             label_003f :
                return absolutePath;
             }
          }
       }
       absolutePath = "";
       goto label_003f ;
    }
}
