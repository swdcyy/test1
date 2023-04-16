package com.kwai.video.ksheifdec.HeifImageFormatConfigurator;
import java.lang.Object;
import ed.v;
import yc.c$a;
import yc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc.a;
import com.kwai.video.ksheifdec.HeifImageDecoder;
import com.facebook.imageformat.a;
import yc.b;
import com.kwai.video.ksheifdec.KpgImageFormat;
import com.kwai.video.ksheifdec.KpgImageFormatChecker;
import com.facebook.imageformat.a$a;

public class HeifImageFormatConfigurator	// class@0008db
{

    public void HeifImageFormatConfigurator(){
       super();
    }
    public static c createImageDecoderConfig(v p0,c$a p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, null, HeifImageFormatConfigurator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          p1 = c.a();
       }
       obj = a.k;
       p1.c(obj, new HeifImageDecoder(p0, obj));
       obj = KpgImageFormat.KPG;
       p1.a(obj, new KpgImageFormatChecker(), new HeifImageDecoder(p0, obj));
       return p1.b();
    }
}
