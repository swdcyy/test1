package lld.e$d;
import erd.a;
import lld.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Integer;
import oba.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import kotlin.jvm.internal.a;
import java.io.File;
import oba.b;
import com.kuaishou.edit.draft.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import lld.e$d$a;
import t36.f$a;
import t36.f;

public final class e$d implements a	// class@001c4b
{
    public final e b;
    public final c c;
    public final String d;

    public void e$d(e p0,c p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CropPicTemplateProcessor", "clear: ", objArray);
       a uoa = a.c(this.c);
       if (!uoa.D()) {
          return;
       }
       Integer integer = a.a(uoa, this.d);
       if (integer == null) {
          PostUtils.F("CropPicTemplateProcessor", "clear: asset not found: "+this.d);
          return;
       }else {
          GeneratedMessageLite generatedMes = uoa.y(integer.intValue());
          a.o(generatedMes, "asset");
          String file = generatedMes.getFile();
          a.o(file, "asset.file");
          File uFile = b.a(uoa, file);
          if (uFile == null) {
             PostUtils.F("CropPicTemplateProcessor", "clear: asset origin file invalid");
             return;
          }else {
             Size size = this.b.k(generatedMes);
             if (size == null) {
                PostUtils.F("CropPicTemplateProcessor", "clear: asset origin size invalid");
                return;
             }else {
                Size size1 = this.b.j(generatedMes);
                if (size1 == null) {
                   PostUtils.F("CropPicTemplateProcessor", "clear: asset current size invalid");
                   return;
                }else {
                   GeneratedMessageLite$Builder uBuilder = uoa.n(integer.intValue());
                   uBuilder.copyOnWrite();
                   uBuilder.instance.clearPictureCropFile();
                   uBuilder.copyOnWrite();
                   uBuilder.instance.clearCropOptions();
                   e$d$a uod$a = new e$d$a(this, integer, generatedMes, uBuilder, uFile, uoa, size1, size);
                   this.b.c.s0(objArray);
                   return;
                }
             }
          }
       }
    }
}
