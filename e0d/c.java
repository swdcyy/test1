package e0d.c;
import e0d.e;
import android.content.ComponentCallbacks;
import java.lang.Object;
import android.content.Context;
import e0d.d;
import vc.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r0d.a;
import vc.i$a;
import com.yxcorp.image.common.log.a;
import cb.a;
import o0d.a;
import java.util.HashSet;
import dd.e;
import p0d.i;
import p0d.c;
import vc.h;
import pb.b$a;
import n0d.i;
import java.lang.Boolean;
import ab.h;
import ab.i;
import ab.e;
import pb.b;
import com.facebook.drawee.backends.pipeline.Fresco;
import cb.c;
import e0d.a;
import com.yxcorp.image.fresco.wrapper.a;
import e0d.b;
import n0d.h;
import i0d.c;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.Throwable;
import com.yxcorp.image.common.log.Log;
import com.yxcorp.image.common.exception.ImageInitializeThrowable;
import g0d.a;
import android.content.res.Configuration;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.lang.StringBuilder;

public class c implements e, ComponentCallbacks	// class@001500
{
    public int b;

    public void c(){
       super();
       this.b = 0;
    }
    public void a(Context p0,d p1,h$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "2")) {
          a uoa = new a();
          p2.C.n = uoa;
          a.a = new a();
          a uoa1 = new a(p1.w, p1.x);
          p2.p = uoa1;
          p0.registerComponentCallbacks(uoa1);
          HashSet hashSet = new HashSet();
          hashSet.add(new e());
          hashSet.add(new i());
          p2.v = hashSet;
          if (p1.C != null) {
             hashSet = new HashSet();
             hashSet.add(new c());
             p2.w = hashSet;
          }
          b$a uoa2 = new b$a();
          uoa2.c = new i(p1.d);
          h oh = i.a(Boolean.valueOf(p1.u));
          e.d(oh);
          uoa2.b = oh;
          b uob = new b(uoa2);
          Fresco.initialize(p0, p2.a(), uob);
          a.a.e(p1.g);
          a.b = new a(uoa);
          a.c = new b(uoa);
          if (!PatchProxy.applyVoidTwoRefs(p0, uob, this, c.class, "3")) {
             try{
                h oh1 = new h(p0, uob);
                c.b(Fresco.class, "sDraweeControllerBuilderSupplier", oh1);
                SimpleDraweeView.s(oh1);
             }catch(java.lang.Exception e10){
                Log.b("DefaultImageInitializer", "hookAndReplacePipelineDraweeControllerBuilderSupplierImagePipeline, setStaticField sDraweeControllerBuilderSupplier error: ", e10);
             }
          }
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       int i = p0.uiMode & 0x30;
       if (i != this.b) {
          Fresco.getImagePipeline().clearMemoryCaches();
          this.b = i;
          StringBuilder str = "onConfigurationChanged callback triggered by night mode ";
          String str1 = (this.b == 32)? "enabled": "disabled";
          Log.c("DefaultImageInitializer", str+str1+", clear image memory caches.");
       }
       return;
    }
    public void onLowMemory(){
    }
}
