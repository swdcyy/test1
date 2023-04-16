package me9.m;
import le9.d;
import me9.m$b;
import nsd.u;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import le9.h;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import me9.m$c;
import com.yxcorp.gifshow.camera.record.base.b;
import me9.s;
import me9.m$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import brd.t;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import j8c.a;
import q87.c;
import fg6.a;
import ne9.e;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import t45.d;
import brd.z;
import java.util.concurrent.Executor;
import lrd.b;
import me9.m$d;
import erd.g;
import me9.m$e;
import erd.o;
import java.lang.StringBuilder;
import java.util.Map;
import crd.b;
import java.util.concurrent.TimeUnit;
import me9.n;
import me9.o;
import me9.p;
import j4b.n;
import me9.m$f;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import me9.m$g;
import java.lang.Runnable;
import java.io.File;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import java.lang.Iterable;
import qkd.b;
import java.lang.CharSequence;

public final class m extends d	// class@003008
{
    public final ConcurrentHashMap c;
    public m$c d;
    public final ConcurrentHashMap e;
    public static final ExecutorService f;
    public static final m$b g;

    static {
       m.g = new m$b(null);
       m.f = c.f("MagicRequestStatusHandler");
    }
    public void m(h p0){
       a.p(p0, "callback");
       super(p0);
       this.c = new ConcurrentHashMap();
       this.d = new m$c();
       this.e = new ConcurrentHashMap();
       p0.h().n(s.class, new m$a(this));
    }
    public String b(){
       return "MagicRequestStatusHandler";
    }
    public t c(MagicRequest p0,b p1){
       SimpleMagicFace mId;
       Gson a;
       m om = m.class;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, om, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       t ot = null;
       MagicEmoji$MagicFace magicFace = 5720;
       int i = 0;
       if (p0.getRequestType() == 5710 || p0.getRequestType() == magicFace) {
          obj = a.a.c(p0.getRequestData(), e.class);
          if (obj.b() == null && obj.a() == null) {
             Object[] objArray = new Object[i];
             a.D().A("MagicRequestStatusHandler", "all data is null", objArray);
             return ot;
          }else if(obj.b() != null && (this.d.a()).equals(p1.b().mId)){
             m td = this.d;
             JsonObject jsonObject = (p0.getRequestType() == magicFace)? this.i(this.d.b(), obj.b()): obj.b();
             td.c(jsonObject);
             Object[] objArray1 = new Object[i];
             a.D().w("MagicRequestStatusHandler", "save transientData success : "+this.d.b(), objArray1);
          }
          if (obj.a() != null) {
             String str = "extra.magicFace.mId";
             if (p0.getRequestType() == magicFace) {
                mId = p1.b().mId;
                a.o(mId, str);
                this.c.put(mId, this.i(this.c.get(p1.b().mId), obj.a()));
             }else {
                mId = p1.b().mId;
                a.o(mId, str);
                this.c.put(mId, obj.a());
             }
             Object[] objArray2 = new Object[i];
             a.D().w("MagicRequestStatusHandler", "save persistentData success : "+this.c.get(p1.b().mId), objArray2);
             MagicEmoji$MagicFace magicFace1 = p1.b();
             JsonObject jsonObject1 = obj.a();
             if (!PatchProxy.applyVoidTwoRefs(magicFace1, jsonObject1, this, om, "5")) {
                Object[] objArray3 = new Object[i];
                a.D().w("MagicRequestStatusHandler", "scheduleSavePersistentFile £º "+magicFace1.mId, objArray3);
                b uob = this.e.get(magicFace1);
                if (uob != null) {
                   uob.dispose();
                }
                jsonObject1 = t.timer(5000, TimeUnit.MILLISECONDS, b.b(m.f)).doOnNext(new n(this, magicFace1, jsonObject1)).subscribe(o.b, new p(magicFace1));
                a.o(jsonObject1, "Observable.timer\(5000, T¡­\", it\)\n                }\)");
                this.e.put(magicFace1, jsonObject1);
             }
          }
          return ot;
       }else if(this.c.containsKey(p1.b().mId)){
          Object[] objArray4 = new Object[i];
          a.D().w("MagicRequestStatusHandler", "get data from memory", objArray4);
          a = a.a;
          JsonObject jsonObject2 = this.c.get(p1.b().mId);
          if ((this.d.a()).equals(p1.b().mId)) {
             ot = this.d.b();
          }
          if (ot == null) {
             ot = new JsonObject();
          }
          JsonElement jsonElement = a.x(new e(jsonObject2, ot));
          a.o(jsonElement, "Gsons.KWAI_GSON.toJsonTr¡­  \)\n                    \)");
          return t.just(jsonElement.r()).subscribeOn(d.c);
       }else {
          return t.just(p1.b()).observeOn(b.b(m.f)).doOnNext(new m$d(this)).map(new m$e(this, p1));
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.a().h().l(n.class, new m$f(this));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       Iterator iterator = this.e.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!uEntry.getValue().isDisposed()) {
             uEntry.getValue().dispose();
             JsonObject jsonObject = this.c.get(uEntry.getKey().mId);
             if (jsonObject != null) {
                Object[] objArray = new Object[0];
                a.D().w("MagicRequestStatusHandler", "save data immediately : "+uEntry.getKey().mId, objArray);
                m.f.execute(new m$g(uEntry, jsonObject, this));
             }
          }
       }
       return;
    }
    public boolean g(int p0){
       boolean b = (p0 != 5700 && (p0 == 5710 || p0 == 5720))? true: false;
       return b;
    }
    public final File h(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(g.j(p0), "persistent.json");
    }
    public final JsonObject i(JsonObject p0,JsonObject p1){
       Set obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.size()) {
          return p1;
       }
       obj = p1.w0();
       a.o(obj, "diffData.keySet\(\)");
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          p0.G(str, p1.e0(str));
       }
       return p0;
    }
    public final void j(MagicEmoji$MagicFace p0,JsonObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "6")) {
          return;
       }
       File uFile = this.h(p0);
       if (!p1.size()) {
          if (uFile.exists()) {
             b.x(uFile);
             Object[] objArray = new Object[0];
             a.D().w("MagicRequestStatusHandler", "deleteFile success", objArray);
          }
       }else {
          b.r0(uFile, p1.toString(), "utf-8", 0);
          Object[] objArray1 = new Object[0];
          a.D().w("MagicRequestStatusHandler", "writeData success : "+p0.mId, objArray1);
       }
       return;
    }
}
