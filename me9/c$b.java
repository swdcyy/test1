package me9.c$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.magic.data.repo.response.MagicExtraDependentDataResponse;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import i4b.g;
import java.util.List;
import qkd.c;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import w46.b;

public final class c$b implements Callable	// class@002fe2
{
    public final MagicEmoji$MagicFace b;

    public void c$b(MagicEmoji$MagicFace p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray1 = new Object[i];
          String str = "MagicRequestDependencyHandler";
          a.D().w(str, "get local resource ", objArray1);
          obj = g.d(this.b);
          MagicExtraDependentDataResponse magicExtraDe = new MagicExtraDependentDataResponse(objArray);
          if (obj.exists()) {
             a uoa = a.D();
             Object[] objArray2 = new Object[i];
             try{
                uoa.w(str, "data file exits", objArray2);
                obj = a.a.h(c.j(obj), MagicExtraDependentDataResponse.class);
                a.o(obj, "Gsons.KWAI_GSON.fromJson¡­DataResponse::class.java\)");
             }catch(java.lang.Exception e0){
                a.D().e("MagicDataConveyController", "conveyMagicResourceToSdk parse json file error", e0);
             }
             obj = magicExtraDe;
          }else {
             goto label_005a ;
          }
       }
       return obj;
    }
}
