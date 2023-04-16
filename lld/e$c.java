package lld.e$c;
import io.reactivex.a;
import lld.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import brd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import maa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import haa.a;
import java.lang.Integer;
import oba.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Transform;
import brd.a;
import java.io.File;
import oba.b;
import lnc.d1$a;
import java.util.Objects;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.graphics.RectF;
import android.graphics.Bitmap;
import nsd.u;
import lnc.d1;
import brd.a0;
import t45.d;
import brd.z;
import lld.e$c$a;
import erd.a;
import brd.e;

public final class e$c implements a	// class@001c49
{
    public final e a;
    public final c b;
    public final c c;
    public final String d;

    public void e$c(e p0,c p1,c p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(c p0){
       Size size;
       Object[] objArray1;
       e$c a;
       RectF rectF;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e$c.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "CropPicTemplateProcessor";
       a.D().w(str, "apply: ", objArray);
       a uoa = obj.b.o0();
       if (uoa != null) {
          Asset uAsset = uoa.v();
          if (uAsset != null) {
             size = obj.a.j(uAsset);
          label_003a :
             if (size == null) {
                objArray1 = new Object[i];
                a.D().A(str, "apply: template asset size invalid", objArray1);
                p0.onComplete();
                return;
             }else {
                a uoa1 = a.c(obj.c);
                if (!uoa1.D()) {
                   p0.onComplete();
                   return;
                }else {
                   Integer integer = a.a(uoa1, obj.d);
                   if (integer == null) {
                      PostUtils.F(str, "apply: asset is null: "+obj.d);
                      p0.onComplete();
                      return;
                   }else {
                      GeneratedMessageLite generatedMes = uoa1.y(integer.intValue());
                      a.o(generatedMes, "asset");
                      Size size1 = obj.a.k(generatedMes);
                      if (size1 == null) {
                         PostUtils.F(str, "apply: asset origin size invalid");
                         p0.onComplete();
                         return;
                      }else {
                         Size size2 = obj.a.j(generatedMes);
                         if (size2 == null) {
                            PostUtils.F(str, "apply: asset current size invalid");
                            p0.onComplete();
                            return;
                         }else if(!obj.a.l(size) - obj.a.l(size2)){
                            CropOptions cropOptions = generatedMes.getCropOptions();
                            a.o(cropOptions, "asset.cropOptions");
                            Transform transform = cropOptions.getTransform();
                            a.o(transform, "asset.cropOptions.transform");
                            if (!transform.getRotate() - null) {
                               objArray1 = new Object[i];
                               a.D().w(str, "apply: skip", objArray1);
                               p0.onComplete();
                               return;
                            }
                         }
                         if (!obj.a.l(size) - obj.a.l(size1)) {
                            objArray1 = new Object[i];
                            a.D().w(str, "apply: clear", objArray1);
                            a = obj.a;
                            a.m(a.a(obj.c, obj.d), obj1);
                            return;
                         }else {
                            String file = generatedMes.getFile();
                            a.o(file, "asset.file");
                            File uFile = b.a(uoa1, file);
                            if (uFile == null) {
                               PostUtils.F(str, "apply: asset origin file invalid");
                               p0.onComplete();
                               return;
                            }else {
                               objArray1 = new Object[i];
                               a.D().w(str, "apply: crop: "+"origin = ["+size1+"], "+"ratio = ["+obj.a.l(size)+']', objArray1);
                               String absolutePath = uFile.getAbsolutePath();
                               a.o(absolutePath, "assetOriginFile.absolutePath");
                               e$c a1 = obj.a;
                               float f = a1.l(size);
                               Objects.requireNonNull(a1);
                               e uoe = e.class;
                               if (PatchProxy.isSupport(uoe)) {
                                  d1 obj2 = PatchProxy.applyTwoRefs(size1, Float.valueOf(f), a1, uoe, "10");
                                  if (obj2 != PatchProxyResult.class) {
                                     rectF = obj2;
                                  label_01c1 :
                                     d1$a uoa2 = new d1$a(absolutePath, rectF, 0, size1, integer.intValue(), null, 32, null);
                                     obj2 = new d1();
                                     obj2.a(file);
                                     e$c$a uoc$a = new e$c$a(this, uoa1, obj2, file, integer, generatedMes, size2, uFile);
                                     uoa = obj2.h().A().s(d.a).b(a.q(rectF));
                                     a.o(uoa, "cropImageTaskManager.wai¡­oppedFilePath\)\n        }\)");
                                     obj.a.m(uoa, obj1);
                                     return;
                                  }
                               }
                               float f1 = (float)size1.b;
                               float f2 = (float)size1.c;
                               if (f - a1.l(size1) > 0) {
                                  f2 = (float)size1.b / f;
                               }else {
                                  f1 = (float)size1.c * f;
                               }
                               f1 = f1 / (float)size1.b;
                               f2 = f2 / (float)size1.c;
                               f = (float)1;
                               float f3 = (f - f1) / 2.00f;
                               f = (f - f2) / 2.00f;
                               rectF = new RectF(f3, f, (f1 + f3), (f2 + f));
                               goto label_01c1 ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       size = null;
       goto label_003a ;
    }
}
