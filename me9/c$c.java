package me9.c$c;
import erd.g;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicExtraDependentDataResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import i4b.g;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import fg6.a;
import com.google.gson.Gson;
import java.lang.CharSequence;
import qkd.b;
import java.lang.Throwable;
import w46.b;

public final class c$c implements g	// class@002fe3
{
    public final MagicEmoji$MagicFace b;

    public void c$c(MagicEmoji$MagicFace p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MagicRequestDependencyHandler", "save server response "+p0, objArray);
          File uFile = g.f();
          String str = g.e(this.b);
          try{
             b.q0(new File(uFile, str), a.a.q(p0));
          }catch(java.lang.Exception e5){
             a.D().e("MagicRequestDependencyHandler", "onMagicResourceRequest file write error", e5);
          }
       }
    }
}
