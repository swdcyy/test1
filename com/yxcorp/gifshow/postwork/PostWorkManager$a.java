package com.yxcorp.gifshow.postwork.PostWorkManager$a;
import com.kwai.framework.cache.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.postwork.a;
import com.yxcorp.gifshow.postwork.PostWorkManager;
import java.lang.Number;
import java.util.List;
import v56.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;

public class PostWorkManager$a implements a$a	// class@0010b3
{

    public void PostWorkManager$a(){
       super();
    }
    public boolean a(boolean p0,boolean p1){
       PostWorkManager$a uoa = PostWorkManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "registerCacheHandler clear cache, isDiskUnSufficient="+p0+", isManual="+p1, objArray);
       PostWorkManager.g().k4(p0, p1);
       return true;
    }
    public long b(boolean p0){
       PostWorkManager$a uoa = PostWorkManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = PostWorkManager.g().a();
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "registerCacheHandler\(\) cacheSize="+l, objArray);
       return l;
    }
    public List c(boolean p0){
       return f.b(this, p0);
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, PostWorkManager$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b(false);
    }
    public long e(boolean p0){
       return f.h(this, p0);
    }
    public List f(boolean p0){
       return f.f(this, p0);
    }
    public void g(boolean p0){
       f.a(this, p0);
    }
    public void h(boolean p0){
       f.j(this, p0);
    }
    public List i(boolean p0){
       return f.c(this, p0);
    }
    public int j(boolean p0){
       return f.e(this, p0);
    }
    public List k(boolean p0){
       a obj;
       PostWorkManager$a uoa = PostWorkManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       obj = (!PostExperimentUtils.u0())? 1: null;
       if (obj) {
          Object[] objArray = new Object[i];
          a.D().w("PostWorkManager", "do post period clean", objArray);
          PostWorkManager.g().k4(p0, i);
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("PostWorkManager", "skip post period clean", objArray1);
       }
       return null;
    }
    public String name(){
       return "PostWork_CacheHandler";
    }
}
