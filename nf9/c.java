package nf9.c;
import erd.g;
import nf9.a;
import com.kwai.video.westeros.models.ServerMediaRequest;
import java.lang.Object;
import n46.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import s5b.b;
import java.util.Map;
import crd.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.base.d;
import ui9.j;
import com.yxcorp.gifshow.camerasdk.q;
import elb.v;
import xi9.n;
import java.lang.Exception;

public final class c implements g	// class@003178
{
    public final a b;
    public final ServerMediaRequest c;

    public void c(a p0,ServerMediaRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String key;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("ServerSwapController", "update status : "+p0.g()+"  "+p0.b(), objArray);
          String str = "request.key";
          if (p0.h()) {
             String str1 = p0.b();
             b uob = (str1 == null || !str1.length())? 1: null;
             if (!uob) {
                objArray = new Object[i];
                b.D().w("ServerSwapController", "doServerMediaRequest completed", objArray);
                uob = this.b.p.get(this.c.getKey());
                if (uob != null && !uob.isDisposed()) {
                   key = this.c.getKey();
                   a.o(key, str);
                   this.b.h2(key, 100);
                   c tb = this.b;
                   key = this.c.getKey();
                   a.o(key, str);
                   p0 = p0.b();
                   a.m(p0);
                   int typeValue = this.c.getTypeValue();
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(key, p0, Integer.valueOf(typeValue), tb, a.class, "5")) {
                      tb.p.remove(key);
                      d h = tb.h;
                      if (h != null) {
                         j oj = h.q();
                         if (oj != null) {
                            Object[] objArray1 = new Object[i];
                            a.D().w("ServerSwapController", "setPickedServerMediaResult : "+key+" , "+p0+" , "+typeValue, objArray1);
                            oj.i0(new v(p0, key, typeValue));
                         }
                      }
                   }
                }
             }else {
                throw new Exception("generationFilePath is empty");
             }
          }else {
             String key1 = this.c.getKey();
             a.o(key1, str);
             this.b.h2(key1, p0.g());
          }
       }
    label_0117 :
       return;
    }
}
