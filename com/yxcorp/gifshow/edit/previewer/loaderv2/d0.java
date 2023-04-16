package com.yxcorp.gifshow.edit.previewer.loaderv2.d0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import wba.d0;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import taa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Preview$b;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import wba.e0;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.Preview;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class d0 extends a	// class@001b3b
{
    public g h;

    public void d0(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       this.h = p0.g;
    }
    public void d(){
       Size size;
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.a("load project");
       this.b = EditorSdk2UtilsV2.loadProjectWithSizeLimitation(this.b, d0.g(this.a.v()));
       a uoa = this.a.P0();
       StringBuilder str = 1;
       int i = (uoa != null && uoa.D())? 1: 0;
       if (uoa != null && !i) {
          uoa.c0();
       }
       if (this.a.T0() == Workspace$Source.CAPTURE && (this.b.trackAssetsSize() > 0 && (this.a.D() && (this.a.a1() != Workspace$Type.KUAISHAN && !DraftUtils.K(this.a))))) {
          Preview$b uob = this.a.P0().k();
          EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(this.b.trackAssets(0));
          if (probedStream != null) {
             int i1 = probedStream.height();
             int i2 = probedStream.width();
             if (e0.e(this.a)) {
                size = e0.c((float)i2, (float)i1);
                i2 = size.b;
                size = size.c;
             }
             if (b.g(this.a.d1()) == null) {
                str = null;
             }
             if (!(probedStream.rotation() % 180) || str) {
                uob.d(size);
                uob.g(i2);
             }else {
                uob.d(i2);
                uob.g(size);
             }
             uob.build();
          }
          this.a("load preview.width:"+uob.instance.getWidth()+",preview.height:"+uob.instance.getHeight());
       }
    label_00f5 :
       if (uoa != null) {
          uoa.k().build();
          if (!i) {
             uoa.g(0);
          }
       }
       this.a("load projectOutputWidth:"+this.b.projectOutputWidth()+",projectOutputHeight:"+this.b.projectOutputHeight()+",workspace type:"+this.a.a1());
       return;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a.a1() == Workspace$Type.KUAISHAN || (DraftUtils.l(this.a) && DraftUtils.T(this.a))) {
          return 1;
       }
       return 0;
    }
}
