package com.yxcorp.gifshow.v3.editor.frame_v2.action.FrameRatioAdjustAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import wqc.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import arc.d;
import java.util.Objects;
import yaa.c;
import prc.b;
import yaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EditLyric$b;
import com.google.protobuf.GeneratedMessageLite;
import taa.a;
import com.kuaishou.edit.draft.Preview$b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import com.kwai.robust.PatchProxyResult;
import wqc.d$a;
import qr4.m$k0;
import java.util.List;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class FrameRatioAdjustAction extends EditSdkAction	// class@000f96
{
    public final d info;

    public void FrameRatioAdjustAction(d p0){
       a.p(p0, "info");
       super();
       this.info = p0;
    }
    public final d getInfo(){
       return this.info;
    }
    public void performAction(c p0,c p1){
       d a;
       i b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrameRatioAdjustAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(p0, str);
       a.p(p1, "store");
       a = d.a;
       Objects.requireNonNull(a);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(p0, a, d.class, "2")) {
          a.p(p0, str);
          a = p0.J0();
          if (PatchProxy.applyVoidOneRefs(a, objArray, b.class, "2") || (a != null && a.f0() != null)) {
             a.c0();
             a uoa = a.f0();
             uoa.c0();
             uoa.k().clear().build();
             uoa.f();
             a.f();
          }
       }
       GeneratedMessageLite$Builder uBuilder = p0.P0().k();
       a.o(uBuilder, "workspaceDraft.previewDraft.ensureFirstBuilder\(\)");
       uBuilder.b(this.info.b());
       VideoContext videoContext = p0.d1();
       a.o(videoContext, "workspaceDraft.videoContext");
       b = videoContext.F().b;
       FrameRatioAdjustAction tinfo = this.info;
       Objects.requireNonNull(tinfo);
       str = PatchProxy.apply(objArray, tinfo, d.class, "2");
       if (str != PatchProxyResult.class) {
       }else {
          str = d.k.a(tinfo.b);
       }
       b.M = str;
       return;
    }
    public List targetLoader(){
       Loader[] obj = PatchProxy.apply(null, this, FrameRatioAdjustAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Loader[]{Loader.HeightAndWidth,Loader.Recreation,Loader.Kuaishan};
       return CollectionsKt__CollectionsKt.P(obj);
    }
}
