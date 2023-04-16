package com.yxcorp.gifshow.v3.editor.music_v2.action.LyricSelectedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import mn9.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import yaa.c;
import yaa.a;
import src.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Objects;
import src.g;
import urc.b;
import lsc.w;

public final class LyricSelectedAction extends EditSdkAction	// class@001072
{
    public final boolean fromPanel;
    public final a item;
    public final double sdkPlayerDuration;

    public void LyricSelectedAction(a p0,double p1,boolean p2){
       a.p(p0, "item");
       super();
       this.item = p0;
       this.sdkPlayerDuration = p1;
       this.fromPanel = p2;
    }
    public void LyricSelectedAction(a p0,double p1,boolean p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean getFromPanel(){
       return this.fromPanel;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LyricSelectedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (f.E(p0.a1())) {
          return;
       }
       p1 = p0.J0();
       if (p1 != null) {
          a uoa = p1.f0();
          if (uoa != null) {
             if (this.item instanceof c) {
                uoa.d();
                return;
             }else if(p0.a1() == Workspace$Type.PHOTO_MOVIE){
                return;
             }else {
                LyricSelectedAction titem = this.item;
                Objects.requireNonNull(titem, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.music_v2.model.LyricItem");
                w.c(p0, this.sdkPlayerDuration, w.a(titem));
             }
          }
       }
       return;
    }
}
