package com.yxcorp.gifshow.v3.editor.frame_v2.action.BackgroundSelectedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import wqc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import taa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Preview$b;
import java.lang.Integer;
import com.kuaishou.edit.draft.Preview;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.e$h;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class BackgroundSelectedAction extends EditSdkAction	// class@000f92
{
    public final b bgData;

    public void BackgroundSelectedAction(b p0){
       a.p(p0, "bgData");
       super();
       this.bgData = p0;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BackgroundSelectedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       GeneratedMessageLite$Builder uBuilder = p0.P0().k();
       a.o(uBuilder, "workspaceDraft.previewDraft.ensureFirstBuilder\(\)");
       uBuilder.e(Integer.parseInt(this.bgData.e()));
       uBuilder.f(this.bgData.f());
       int i = this.bgData.f();
       if (i != 3) {
          if (i == 4) {
             uBuilder.copyOnWrite();
             uBuilder.instance.setPaddingAreaImagePath(p0.P0().Q(this.bgData.d()));
          }
       }else {
          uBuilder.copyOnWrite();
          uBuilder.instance.setPaddingAreaColor("#"+TextUtils.g(this.bgData.a()));
       }
       VideoContext videoContext = p0.d1();
       a.o(videoContext, "workspaceDraft.videoContext");
       videoContext.N = this.bgData.e();
       return;
    }
    public List targetLoader(){
       Loader[] obj = PatchProxy.apply(null, this, BackgroundSelectedAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Loader[]{Loader.HeightAndWidth,Loader.Recreation,Loader.Kuaishan};
       return CollectionsKt__CollectionsKt.P(obj);
    }
}
