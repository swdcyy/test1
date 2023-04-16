package com.yxcrop.gifshow.v3.editor.text_v2.action.DeleteTextActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import hba.a;
import jba.a;
import wnd.g;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import wba.l0;
import com.yxcorp.gifshow.edit.draft.model.c;
import w46.b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import wnd.h;

public final class DeleteTextActionV3 extends EditSdkAction	// class@000b04
{
    public final boolean commit;
    public final int layerIndex;
    public int nextLayerIndex;

    public void DeleteTextActionV3(int p0,int p1,boolean p2){
       super();
       this.layerIndex = p0;
       this.nextLayerIndex = p1;
       this.commit = p2;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
    public final int getNextLayerIndex(){
       return this.nextLayerIndex;
    }
    public void performAction(c p0,c p1){
       g a;
       int i1;
       Object[] objArray2;
       GeneratedMessageLite generatedMes;
       StickerResult result;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DeleteTextActionV3.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(p0, str);
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("DeleteTextActionV3", "performAction layerIndex:"+this.layerIndex+", nextLayerIndex:"+this.nextLayerIndex+", commit:"+this.commit, objArray);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          a uoa1 = p0.Z0();
          if (uoa1 != null) {
             a = g.a;
             DeleteTextActionV3 tlayerIndex = this.layerIndex;
             Objects.requireNonNull(a);
             g og = g.class;
             if (PatchProxy.isSupport(og)) {
                Object[] objArray1 = new Object[]{uoa1,uoa,Integer.valueOf(tlayerIndex),p0,Boolean.TRUE};
                if (!PatchProxy.applyVoid(objArray1, a, og, "11")) {
                }
             }else {
             }
          }
       label_00da :
          if (!uoa.D()) {
             uoa.c0();
          }
          h.d(this.layerIndex, uoa);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
    public final void setNextLayerIndex(int p0){
       this.nextLayerIndex = p0;
    }
}
