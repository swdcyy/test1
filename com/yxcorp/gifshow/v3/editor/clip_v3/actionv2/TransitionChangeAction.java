package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.TransitionChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import bpc.e;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import fpc.a;
import cpc.c;
import apc.b;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import maa.a;
import haa.a;
import yoc.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.AssetTransition$b;
import com.kuaishou.edit.draft.AssetTransition;
import com.google.protobuf.GeneratedMessageLite;

public final class TransitionChangeAction extends EditSdkAction	// class@000dc2
{
    public final boolean applyAll;
    public final TransitionEffect effect;
    public final boolean isClickApplyAll;
    public final boolean isReset;
    public final List segmentList;
    public final e transitionState;

    public void TransitionChangeAction(List p0,e p1,TransitionEffect p2,boolean p3,boolean p4,boolean p5){
       a.p(p0, "segmentList");
       a.p(p1, "transitionState");
       a.p(p2, "effect");
       super();
       this.segmentList = p0;
       this.transitionState = p1;
       this.effect = p2;
       this.applyAll = p3;
       this.isReset = p4;
       this.isClickApplyAll = p5;
    }
    public final boolean getApplyAll(){
       return this.applyAll;
    }
    public final TransitionEffect getEffect(){
       return this.effect;
    }
    public final List getSegmentList(){
       return this.segmentList;
    }
    public final e getTransitionState(){
       return this.transitionState;
    }
    public final boolean isClickApplyAll(){
       return this.isClickApplyAll;
    }
    public final boolean isReset(){
       return this.isReset;
    }
    public void performAction(c p0,c p1){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TransitionChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TransitionChangeAction", "performAction segmentList:"+this.segmentList+", transitionState:"+this.transitionState+", "+"effect:"+this.effect+", applyAll:"+this.applyAll+", isReset:"+this.isReset+", isClickApplyAll:"+this.isClickApplyAll, objArray);
       int i1 = 1;
       if (this.applyAll == null) {
          if (c.a(this.segmentList.get(this.transitionState.d()))) {
             b[] uobArray = new b[i1];
             uobArray[i] = new b(this.effect.getMSdkId(), this.transitionState.d(), this.effect.getMAnimationTime());
             uArrayList = CollectionsKt__CollectionsKt.r(uobArray);
          }else {
             return;
          }
       }else {
          uArrayList = new ArrayList();
          Iterator iterator1 = this.segmentList.iterator();
          while (iterator1.hasNext()) {
             Object obj = iterator1.next();
             int i3 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (c.a(obj)) {
                int i4 = this.segmentList.size() - i1;
                if (i < i4 && c.a(this.segmentList.get(i3))) {
                   uArrayList.add(new b(this.effect.getMSdkId(), i, this.effect.getMAnimationTime()));
                }
             }
             i = i3;
          }
          if (uArrayList.isEmpty()) {
             return;
          }
       }
       a uoa = a.c(p0);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          int i2 = uob.b();
          f.a.k(i2);
          GeneratedMessageLite$Builder uBuilder = uoa.n(i2);
          a.o(uBuilder, "assetDraft.getBuilder\(ma¡­aftIndex\(it.mTrackIndex\)\)");
          AssetTransition$b uob1 = AssetTransition.newBuilder();
          uob1.b(uob.c());
          uob1.a(uob.a());
          uBuilder.v(uob1.build());
       }
       return;
    }
}
