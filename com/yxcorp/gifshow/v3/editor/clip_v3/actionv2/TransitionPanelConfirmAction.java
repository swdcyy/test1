package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.TransitionPanelConfirmAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import haa.a;
import kba.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import apc.b;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.kuaishou.edit.draft.AssetTransition$b;
import com.kuaishou.edit.draft.AssetTransition;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.AssetTransitionAction$b;
import com.kuaishou.edit.draft.AssetTransitionAction;
import com.kuaishou.edit.draft.UndoAction;

public final class TransitionPanelConfirmAction extends EditSdkAction	// class@000dc3
{
    public boolean curApplyAll;
    public int curType;
    public final ArrayList oldTransitionActionDataList;
    public boolean preApplyAll;

    public void TransitionPanelConfirmAction(boolean p0,boolean p1,int p2,ArrayList p3){
       a.p(p3, "oldTransitionActionDataList");
       super();
       this.curApplyAll = p0;
       this.preApplyAll = p1;
       this.curType = p2;
       this.oldTransitionActionDataList = p3;
    }
    public void TransitionPanelConfirmAction(boolean p0,boolean p1,int p2,ArrayList p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = false;
       }
       if (p4 & 0x02) {
          p1 = false;
       }
       if (p4 & 0x08) {
          p3 = new ArrayList();
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final boolean getCurApplyAll(){
       return this.curApplyAll;
    }
    public final int getCurType(){
       return this.curType;
    }
    public final ArrayList getOldTransitionActionDataList(){
       return this.oldTransitionActionDataList;
    }
    public final boolean getPreApplyAll(){
       return this.preApplyAll;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TransitionPanelConfirmAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.a.u(p0);
       ArrayList uArrayList = new ArrayList();
       Object[] objArray = new Object[0];
       a.D().w("TransitionPanelConfirmAction", "performAction curApplyAll:"+this.curApplyAll+", preApplyAll:"+this.preApplyAll+", curType:"+this.curType, objArray);
       Iterator iterator = this.oldTransitionActionDataList.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          AssetTransitionActionData$b uob1 = AssetTransitionActionData.newBuilder();
          uob1.b(uob.b());
          AssetTransition$b uob2 = AssetTransition.newBuilder();
          uob2.b(uob.c());
          uob2.a(uob.a());
          uob1.copyOnWrite();
          uob1.instance.setAssetTransition(uob2);
          uArrayList.add(uob1.build());
       }
       GeneratedMessageLite$Builder uBuilder = uoa.b();
       a.o(uBuilder, "undoDraft.append\(\)");
       AssetTransitionAction$b uob3 = AssetTransitionAction.newBuilder();
       uob3.copyOnWrite();
       uob3.instance.addAllOriginalAssetTransitions(uArrayList);
       uob3.copyOnWrite();
       uob3.instance.setPreApplyToAll(this.preApplyAll);
       uob3.copyOnWrite();
       uob3.instance.setCurApplyToAll(this.curApplyAll);
       uob3.copyOnWrite();
       uob3.instance.setCurType(this.curType);
       uBuilder.copyOnWrite();
       uBuilder.instance.setAssetTransitionAction(uob3.build());
       return;
    }
    public final void setCurApplyAll(boolean p0){
       this.curApplyAll = p0;
    }
    public final void setCurType(int p0){
       this.curType = p0;
    }
    public final void setPreApplyAll(boolean p0){
       this.preApplyAll = p0;
    }
}
