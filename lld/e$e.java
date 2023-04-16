package lld.e$e;
import erd.a;
import lld.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import qsc.a;
import java.util.Objects;
import haa.a;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.Asset;
import qr4.e$g;
import com.kuaishou.edit.draft.CropOptions;
import rld.d;
import com.yxcrop.gifshow.v3.editor.crop.data.ratio.CropRatioType;
import com.kuaishou.edit.draft.Transform;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.e$h;
import km6.f;

public final class e$e implements a	// class@001c4c
{
    public final e b;
    public final c c;

    public void e$e(e p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$e.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CropPicTemplateProcessor", "commit: ", objArray);
       this.b.g(this.c.o0());
       e$e tb = this.b;
       e$e tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, e.class, "9")) {
          List list = a.c(tc).z();
          a.o(list, "DraftGetUtils.getAssetDraft\(draft\).messages");
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             CropOptions obj = iterator.next();
             int i2 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             e$g og = new e$g();
             a.o(obj, "asset");
             obj = obj.getCropOptions();
             if (obj == null) {
                obj = CropOptions.getDefaultInstance();
             }
             int i3 = 1;
             int i4 = a.g(obj, CropOptions.getDefaultInstance()) ^ i3;
             og.d = i4;
             og.b = d.a.c(CropRatioType.FREE);
             a.o(obj, "cropOptions");
             Transform transform = obj.getTransform();
             a.o(transform, "cropOptions.transform");
             if (!transform.getRotate()) {
                i3 = false;
             }
             og.c = i3;
             og.f = obj.getHeight();
             og.e = obj.getWidth();
             og.a = i1;
             uArrayList.add(og);
             i1 = i2;
          }
          e$g[] ogArray = new e$g[i];
          Object[] objArray1 = uArrayList.toArray(ogArray);
          Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          VideoContext videoContext = tc.d1();
          a.o(videoContext, "draft.videoContext");
          f.d(videoContext).A = objArray1;
       }
       return;
    }
}
