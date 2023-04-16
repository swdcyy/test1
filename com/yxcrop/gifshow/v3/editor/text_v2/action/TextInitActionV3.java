package com.yxcrop.gifshow.v3.editor.text_v2.action.TextInitActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import android.graphics.RectF;
import nsd.u;
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

public final class TextInitActionV3 extends EditSdkAction	// class@000b1b
{
    public final RectF containerLimitRect;
    public final int decorationNumberLimit;

    public void TextInitActionV3(){
       super(0, null, 3, null);
    }
    public void TextInitActionV3(int p0,RectF p1){
       super();
       this.decorationNumberLimit = p0;
       this.containerLimitRect = p1;
    }
    public void TextInitActionV3(int p0,RectF p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = -1;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final RectF getContainerLimitRect(){
       return this.containerLimitRect;
    }
    public final int getDecorationNumberLimit(){
       return this.decorationNumberLimit;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextInitActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("DeleteTextActionV3", "performAction decorationNumberLimit:"+this.decorationNumberLimit+", containerLimitRect:"+this.containerLimitRect, objArray);
       return;
    }
}
