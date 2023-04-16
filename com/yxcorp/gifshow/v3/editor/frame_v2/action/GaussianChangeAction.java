package com.yxcorp.gifshow.v3.editor.frame_v2.action.GaussianChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import taa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Preview$b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class GaussianChangeAction extends EditSdkAction	// class@000f97
{
    public final double gaussianBlurRadius;

    public void GaussianChangeAction(double p0){
       super();
       this.gaussianBlurRadius = p0;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GaussianChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       GeneratedMessageLite$Builder uBuilder = p0.P0().k();
       a.o(uBuilder, "workspaceDraft.previewDraft.ensureFirstBuilder\(\)");
       uBuilder.c(this.gaussianBlurRadius);
       return;
    }
    public List targetLoader(){
       Loader[] obj = PatchProxy.apply(null, this, GaussianChangeAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Loader[]{Loader.HeightAndWidth};
       return CollectionsKt__CollectionsKt.P(obj);
    }
}
