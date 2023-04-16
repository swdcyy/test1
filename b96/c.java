package b96.c;
import z1.a;
import b96.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import p5.f;
import java.lang.Runtime;
import java.lang.System;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import java.lang.StringBuilder;
import ukd.a;

public final class c implements a	// class@000444
{
    public final d a;

    public void c(d p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, d.class, "7")) {
       }else if(p0.equals("CLEAR_CACHE")){
          Fresco.getImagePipeline().clearMemoryCaches();
          f.c().a();
          Runtime.getRuntime().gc();
          System.runFinalization();
          i.d(R.style.arg_RES_7f11066a, "内存清理完成");
       }
       if (p0.equals("CLEAR_INSTANCE")) {
          KrnInternalManager.c.b().a();
          i.d(R.style.arg_RES_7f11066a, "清理前:"+ta.b()+", 清理后:"+ta.b());
       }
       if (p0.equals("CLEAR_CANVAS")) {
          try{
             Object[] objArray = new Object[0];
             a.b("android.graphics.Canvas", "freeCaches", objArray);
             i.d(R.style.arg_RES_7f11066a, "清理Canvas缓存成功");
          }catch(java.lang.Exception e0){
             i.d(R.style.arg_RES_7f11066a, "清理Canvas反射失败");
          }
       }
    }
}
