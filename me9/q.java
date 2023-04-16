package me9.q;
import le9.d;
import me9.q$a;
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
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicUploadFileRequestData;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.CharSequence;
import me9.q$b;
import e4b.a;
import e4b.c;
import me9.q$i;
import erd.o;
import me9.q$j;
import me9.q$k;
import me9.q$h;
import java.lang.Integer;
import brd.w;
import me9.q$c;
import me9.q$d;
import me9.q$e;
import me9.q$f;
import me9.q$g;
import java.lang.Number;
import java.lang.StringBuilder;

public final class q extends d	// class@003017
{
    public static final q$a c;

    static {
       q.c = new q$a(null);
    }
    public void q(h p0){
       a.p(p0, "callback");
       super(p0);
    }
    public String b(){
       return "MagicRequestUploadHandler";
    }
    public t c(MagicRequest p0,b p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MagicRequestUploadHandler", "handle upload request", objArray);
       MagicUploadFileRequestData magicUploadF = a.a.c(p0.getRequestData(), MagicUploadFileRequestData.class);
       if (magicUploadF != null) {
          obj = magicUploadF.getPath();
          int i1 = 1;
          q$b uob = (obj == null || !obj.length())? 1: null;
          if (!uob) {
             uob = new q$b();
             t ot = c.a().a().map(new q$i(uob));
             t ot1 = t.just(uob).flatMap(new q$j(this, magicUploadF, uob)).map(q$k.b);
             t ot2 = (magicUploadF.getSaveToCDN())? t.just(uob).flatMap(new q$h(p1, uob, magicUploadF)): t.just(Integer.valueOf(100));
             w[] owArray = new w[]{ot.map(q$c.b),ot1.map(q$d.b),ot2.map(q$e.b)};
             return t.concatArray(owArray).map(new q$f(uob)).onErrorReturn(q$g.b);
          }
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("progress", Integer.valueOf(-1));
       jsonObject.c0("errorMsg", "upload params is null : "+magicUploadF);
       return t.just(jsonObject);
    }
    public boolean g(int p0){
       boolean b = (p0 == 5400)? true: false;
       return b;
    }
}
