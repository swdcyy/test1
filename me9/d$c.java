package me9.d$c;
import erd.o;
import me9.d;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicLocalResourceRequestData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import brd.t;
import java.io.File;
import i4b.g;
import lnc.e0;
import ekd.a0;
import j8c.a;
import q87.c;
import android.util.Pair;
import java.lang.Integer;
import z3b.i0;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import me9.h;
import io.reactivex.g;
import java.lang.RuntimeException;
import fg6.a;
import com.google.gson.JsonObject;
import me9.i;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.util.Map;
import java.lang.StringBuilder;
import java.util.HashMap;
import e4b.a;
import e4b.c;
import me9.g;
import me9.e;
import erd.g;
import me9.f;
import java.lang.IllegalArgumentException;

public final class d$c implements o	// class@002fe8
{
    public final d b;
    public final MagicRequest c;

    public void d$c(d p0,MagicRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       File obj;
       t ot1;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, d$c.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "data");
          String str = "";
          String str1 = 1;
          if (!p0.getType()) {
             List cdnUrls = p0.getCdnUrls();
             d$c uoc = (cdnUrls == null || cdnUrls.isEmpty())? 1: null;
             if (!uoc) {
                uoc = this.b;
                p0 = p0.getCdnUrls();
                Objects.requireNonNull(uoc);
                obj = PatchProxy.applyOneRefs(p0, uoc, uod, "2");
                if (obj != patchProxyRe) {
                label_0101 :
                   ot = obj;
                }else {
                   obj = g.g();
                   a.o(obj, "MagicFaceResourceHelper.¡­DependentResourceFolder\(\)");
                   p0 = e0.a(p0, str);
                   String str2 = a0.c(p0[0]);
                   a.o(str2, "DigestUtils.md5Hex\(urlArray[0]\)");
                   File uFile = new File(obj.getAbsolutePath(), str2);
                   if (uFile.exists()) {
                      Object[] objArray = new Object[0];
                      a.D().w("MagicRequestDownloadHandler", "file exits", objArray);
                      p0 = t.just(new Pair(Integer.valueOf(100), uFile.getAbsolutePath()));
                      a.o(p0, "Observable.just\(Pair\(100, file.absolutePath\)\)");
                   }else {
                      p0 = i0.b().a(p0[0]);
                      if (p0 != null) {
                         p0 = t.create(new h(p0, uFile));
                         a.o(p0, "Observable.create {\n    ¡­      }\n        \)\n      }");
                      }else {
                         throw new RuntimeException("generate download requet failed");
                      }
                   }
                }
             }else if(p0.getType() == str1){
                String fileKey = p0.getFileKey();
                if (fileKey != null && fileKey.length()) {
                   str1 = null;
                }
                if (str1 == null) {
                   Object[] obj1 = a.a.d(this.c.getRequestData(), new i().getType());
                   a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­Any>>\(\) {}.type\n        \)");
                   d$c tb = this.b;
                   p0 = p0.getFileKey();
                   Objects.requireNonNull(tb);
                   obj = PatchProxy.applyTwoRefs(p0, obj1, tb, uod, "3");
                   if (obj != patchProxyRe) {
                      goto label_0101 ;
                   }else {
                      Object[] objArray1 = new Object[0];
                      a.D().w("MagicRequestDownloadHandler", "downloadByFileKey:"+p0, objArray1);
                      String str3 = tb.c.get(p0);
                      if (str3 != null) {
                         str = str3;
                      }
                      a.o(str, "fileKeyCacheMap[fileKey] ?: \"\"");
                      if (new File(str).exists()) {
                         obj1 = new Object[0];
                         a.D().w("MagicRequestDownloadHandler", "downloadByFileKey use cache file:"+str, obj1);
                         ot1 = t.just(new Pair(Integer.valueOf(100), str));
                      }else {
                         ot1 = c.a().e(p0, obj1).flatMap(new g(p0));
                      }
                      p0 = ot1.doOnNext(new e(tb, p0)).doOnError(new f(tb, p0));
                      a.o(p0, "observable\n      .doOnNe¡­p.remove\(fileKey\)\n      }");
                   }
                }
             }
             throw new IllegalArgumentException("params error : "+p0);
          }else {
             goto label_00bc ;
          }
          ot = p0;
       }
       return ot;
    }
}
