package eub.r;
import eub.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import eub.r$a;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import gaa.c;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import eub.o;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import eub.r$b;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;

public final class r extends a	// class@002836
{
    public final String m;

    public void r(String p0,String p1,int p2){
       a.p(p0, "commentId");
       a.p(p1, "workspaceDraftDirName");
       super(p1, Integer.valueOf(p2), true);
       this.m = p0;
    }
    public t i(){
       t obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("MerchantRecreationDraftNoUiPublishStageImpl", "buildWorkspaceDraft commentId:"+this.m, objArray);
       obj = super.i().doOnNext(new r$a(this));
       a.o(obj, "super.buildWorkspaceDraf¡­ommentId, null\)\n        }");
       return obj;
    }
    public void n(c p0,b$a p1){
       EditCoverConfiguration a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "2")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "loaderResult");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MerchantRecreationDraftNoUiPublishStageImpl", "onLoadProject", objArray);
       EditorSdk2V2$VideoEditorProject project = p1.getProject();
       if (project != null) {
          ImmutableArray immutableArr = project.animatedSubAssets();
          if (immutableArr != null) {
             Iterator iterator = immutableArr.iterator();
             while (iterator.hasNext()) {
                iterator.next().setNotRenderInThumbnail(i);
             }
          }
       }
       a = c.a;
       a.o(a, "MERCHANT_COVER_CONFIG");
       double absTimePoint = a.getAbsTimePoint();
       File uFile = PostUtils.f();
       a.o(uFile, "PostUtils.getCacheDir\(\)");
       String str = o.a.a(p1, uFile, absTimePoint);
       Object[] objArray1 = new Object[i];
       a.D().w("MerchantRecreationDraftNoUiPublishStageImpl", "fillCover coverTime:"+absTimePoint+", coverPath:"+str, objArray1);
       a uoa = p0.s0();
       a.m(uoa);
       a.o(uoa, "workspaceDraft.coverDraft!!");
       uoa.c0();
       GeneratedMessageLite$Builder uBuilder = uoa.l(new r$b(absTimePoint));
       a.o(uBuilder, "coverDraft.ensureFirstBu¡­ePoints\(coverTime\)\)\n    }");
       uBuilder.d(uoa.Q(str));
       uBuilder.e(uoa.Q(str));
       uoa.f();
       return;
    }
}
