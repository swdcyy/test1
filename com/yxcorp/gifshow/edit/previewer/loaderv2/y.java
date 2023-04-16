package com.yxcorp.gifshow.edit.previewer.loaderv2.y;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.y$a;
import nsd.u;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import vaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.OriginalVoice;
import com.kuaishou.edit.draft.Kuaishan$TemplateType;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kuaishou.edit.draft.Workspace$Type;
import wba.n0;

public final class y extends a	// class@001b57
{
    public a h;
    public a i;
    public static final y$a j;

    static {
       y.j = new y$a(null);
    }
    public void y(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "payload");
       a ta = this.a;
       a.o(ta, "mWorkspaceDraft");
       this.h = ta.g1();
       ta = this.a;
       a.o(ta, "mWorkspaceDraft");
       this.i = ta.F0();
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "2")) {
          return;
       }
       y ti = this.i;
       Kuaishan kuaishan = (ti != null)? ti.v(): objArray;
       y th = this.h;
       if (th != null) {
          objArray = th.v();
       }
       if (objArray != null && (kuaishan != null && kuaishan.getTemplateType() == Kuaishan$TemplateType.KUAISHAN)) {
          return;
       }else {
          ImmutableArray immutableArr = this.b.trackAssets();
          a.o(immutableArr, "mProject.trackAssets\(\)");
          Iterator iterator = immutableArr.iterator();
          while (iterator.hasNext()) {
             a ta = this.a;
             a.o(ta, "mWorkspaceDraft");
             n0.j(iterator.next(), objArray, ta.a1());
          }
          return;
       }
    }
    public int g(){
       return 1;
    }
}
