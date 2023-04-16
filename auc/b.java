package auc.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import auc.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import laa.e;
import mba.m0;
import java.util.Iterator;
import java.util.List;
import nba.a;
import eba.a;
import java.io.File;
import laa.m0;
import maa.a;
import com.kuaishou.edit.draft.Asset;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker;

public final class b implements g	// class@0002ce
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       Iterator iterator;
       Sticker sticker;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a a = a.a;
          a.o(p0, "draft");
          Objects.requireNonNull(a);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(p0, a, uoa, "2")) {
             Workspace workspace = p0.v();
             if (workspace != null) {
                a.o(workspace, "draft.firstMessage ?: return");
                if (a.g(workspace.getAppPlatform(), "iOS")) {
                   m0 om0 = p0.u();
                   a.m(om0);
                   Objects.requireNonNull(om0);
                   if (!PatchProxy.applyVoid(null, om0, m0.class, "15")) {
                      iterator = om0.d.iterator();
                      while (iterator.hasNext()) {
                         c uoc = iterator.next();
                         if (!uoc.E() && uoc instanceof a) {
                            uoc.c0();
                            uoc.a();
                            uoc.f();
                         }
                      }
                   }
                }
                if (!PatchProxy.applyVoidOneRefs(p0, a, uoa, "3")) {
                   a = p0.U0();
                   if (a != null) {
                      a.o(a, "draft.stickerDraft ?: return");
                      File uFile = new File(p0.f0(), "sticker/.template_correction");
                      if (!uFile.exists()) {
                         p0 = p0.o0();
                         if (p0 != null) {
                            p0 = p0.v();
                            if (p0 != null) {
                               a.o(p0, "draft.assetDraft?.firstMessage ?: return");
                               double d = (double)0;
                               if (p0.getOriginPicHeight() - d > 0 && p0.getOriginPicWidth() - d > 0) {
                                  List list = a.z();
                                  a.o(list, "stickerDraft.messages");
                                  iterator = list.iterator();
                                  while (iterator.hasNext()) {
                                     sticker = iterator.next();
                                     a.o(sticker, "it");
                                     a.a.b(a, sticker, (int)p0.getOriginPicWidth(), (int)p0.getOriginPicHeight());
                                  }
                               }
                            }
                         }
                         uFile.createNewFile();
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
