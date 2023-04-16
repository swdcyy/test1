package baa.f;
import baa.h;
import java.lang.Object;
import android.content.Context;
import rfa.a;
import daa.f;
import vfa.a;
import daa.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ufa.a;
import java.util.Objects;
import ufa.b;
import sfa.g;
import java.lang.Number;
import android.graphics.PointF;
import com.yxcorp.gifshow.easteregg.model.PokePosition;
import java.lang.Boolean;
import tfa.l;
import com.yxcorp.gifshow.easteregg.model.PokeSize;

public final class f implements h	// class@000432
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public a a(Context p0,a p1,f p2){
       return this.b(p0, p1, p2);
    }
    public a b(Context p0,a p1,i p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "factory");
       a.p(p2, "poke");
       Objects.requireNonNull(p1);
       a uoa = PatchProxy.applyOneRefs(a.class, p1, a.class, "1");
       if (uoa != patchProxyRe) {
       }else if(a.class.isAssignableFrom(p1.a.getClass())){
          uoa = p1.a;
       }else {
          uoa = null;
       }
       if (uoa != null) {
          a.o(uoa, "factory.findActorScriptF¡­deActorScript\(\).fit\(poke\)");
          a uoa1 = uoa.create(p0);
          a.o(uoa1, "actorScriptFactory.create\(context\)");
          return this.c(uoa1, p2);
       }else {
          return this.c(new g(), p2);
       }
    }
    public final g c(g p0,i p1){
       i obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.startTime;
       if (obj != null) {
          p0.a = obj.longValue();
       }
       obj = p1.position;
       if (obj != null) {
          p0.b = new PointF(obj.x, obj.y);
       }
       obj = p1.enableVibrate;
       if (obj != null) {
          p0.c = obj.booleanValue();
       }
       String str = p1.b();
       if (str != null) {
          p0.d = str;
       }
       obj = p1.lottieSize;
       if (obj != null) {
          p0.e = new l(obj.b(), obj.a());
       }
       str = p1.a();
       if (str != null) {
          p0.f = str;
       }
       p1 = p1.imageSize;
       if (p1 != null) {
          p0.g = new l(p1.b(), p1.a());
       }
       return p0;
    }
}
