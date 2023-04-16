package df9.b$b;
import java.lang.Runnable;
import df9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import df9.a;
import oc9.w;
import com.kwai.robust.PatchProxyResult;
import se9.b;
import k2b.e0;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ui9.f;
import ui9.j;
import ui9.f$d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.prettify.beauty.h$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.prettify.beauty.h;
import q2b.h$b;
import k2b.u1;

public final class b$b implements Runnable	// class@001f26
{
    public final b b;
    public final int c;

    public void b$b(b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       b a;
       SimpleMagicFace mId;
       b uob = b.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, b$b.class, str)) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("MagicRecordingListener", "onReceiveRecordingControl", objArray1);
       b$b tc = this.c;
       if (tc != 1) {
          if (tc != 2) {
             return;
          }else {
             tc = this.b;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(objArray, tc, uob, "4")) {
                objArray = new Object[0];
                a.D().w("MagicRecordingListener", "finishCapture", objArray);
                uob = tc.a;
                if (uob != null && (uob.a2() && uob.h2())) {
                   objArray = new Object[0];
                   a.D().w("MagicRecordingListener", "finishCapture success", objArray);
                   uob.g2().e2();
                }
             }
          }
       }else {
          tc = this.b;
          Objects.requireNonNull(tc);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa = a.class;
          String str1 = "3";
          if (!PatchProxy.applyVoid(objArray, tc, uob, str1)) {
             Object[] objArray2 = new Object[0];
             a.D().w("MagicRecordingListener", "startCapture", objArray2);
             uob = tc.a;
             if (uob != null && (!uob.a2() && uob.h2())) {
                a = b.a;
                BaseFragment uBaseFragmen = PatchProxy.apply(objArray, uob, uoa, "2");
                if (uBaseFragmen != patchProxyRe) {
                }else {
                   d d = uob.d;
                   a.o(d, "mCallerContext");
                   uBaseFragmen = d.f();
                   a.o(uBaseFragmen, "mCallerContext.fragment");
                }
                Object[] objArray3 = PatchProxy.apply(objArray, uob, uoa, str1);
                if (objArray3 != patchProxyRe) {
                }else {
                   d g = uob.g;
                   if (g != null) {
                      f uof = g.O0();
                      if (uof != null) {
                         uof = uof.a;
                         if (uof != null) {
                            objArray = uof.a;
                         }
                      }
                   }
                   objArray3 = objArray;
                }
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, objArray3, a, b.class, str)) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   String str2 = "MAGIC_FACE_START_CAPTURE";
                   uElementPack.action2 = str2;
                   JsonObject jsonObject = new JsonObject();
                   if (objArray3 != null) {
                      mId = objArray3.mId;
                      if (mId != null) {
                      label_00ec :
                         jsonObject.c0("magic_face_id", mId);
                         uElementPack.params = jsonObject.toString();
                         h$a uoa1 = new h$a();
                         uoa1.e(objArray3);
                         h$b uob1 = h$b.e(1, str2);
                         uob1.k(uElementPack);
                         uob1.h(h.c(uoa1));
                         u1.p0("", uBaseFragmen, uob1);
                      }
                   }
                   mId = "";
                   goto label_00ec ;
                }
                objArray = new Object[0];
                a.D().w("MagicRecordingListener", "startCapture success", objArray);
                uob.g2().y();
             }
          }
       }
    label_0122 :
       return;
    }
}
