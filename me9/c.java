package me9.c;
import le9.d;
import me9.c$a;
import nsd.u;
import le9.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import q87.c;
import fg6.a;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicResourceRequestData;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import me9.c$b;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import e4b.a;
import e4b.c;
import lnc.o5;
import me9.c$c;
import erd.g;
import me9.c$d;
import erd.o;

public final class c extends d	// class@002fe5
{
    public static final c$a c;

    static {
       c.c = new c$a(null);
    }
    public void c(h p0){
       a.p(p0, "callback");
       super(p0);
    }
    public String b(){
       return "MagicRequestDependencyHandler";
    }
    public t c(MagicRequest p0,b p1){
       t ot;
       z c;
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "MagicRequestDependencyHandler";
       a.D().w(str, "handle dependency request", objArray);
       MagicResourceRequestData magicResourc = a.a.c(p0.getRequestData(), MagicResourceRequestData.class);
       if (!magicResourc.getReadLocalResource()) {
          obj = magicResourc.getResourceDependencies();
          StringBuilder str1 = (obj == null || obj.isEmpty())? 1: null;
          if (str1) {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "params is null"+magicResourc, objArray1);
             return null;
          }
       }
       MagicEmoji$MagicFace magicFace = p1.b();
       SimpleMagicFace mId = magicFace.mId;
       if (mId == null) {
          mId = "";
       }
       if (magicResourc.getReadLocalResource()) {
          ot = t.fromCallable(new c$b(magicFace)).subscribeOn(d.c);
       }else {
          c = d.c;
          ot = c.a().f(o5.c(mId), magicResourc.getResourceDependencies(), null).subscribeOn(c).observeOn(c);
          ot = ot.doOnNext(new c$c(magicFace));
       }
       return ot.map(new c$d(magicFace));
    }
    public boolean g(int p0){
       boolean b = (p0 == 5100)? true: false;
       return b;
    }
}
