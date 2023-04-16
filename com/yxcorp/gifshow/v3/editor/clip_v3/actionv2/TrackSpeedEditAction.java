package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.TrackSpeedEditAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Asset$b;
import kotlin.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import q87.c;
import yoc.m;
import java.util.HashMap;
import android.util.Pair;
import lnc.v6;
import k2b.s;
import maa.a;
import haa.a;
import kba.a;
import java.util.ArrayList;
import yoc.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.kuaishou.edit.draft.AssetTransition;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Number;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.AssetSpeedAction$b;
import com.kuaishou.edit.draft.AssetSpeedAction;
import java.lang.Iterable;
import java.util.List;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.Asset;
import yaa.c;
import wba.u;

public final class TrackSpeedEditAction extends EditSdkAction	// class@000dc0
{
    public final double mNewSpeed;
    public final double mOriginSpeed;
    public final int mTargetIndex;
    public final TransitionEffect mTransitionToAdd;
    public final double totalDuration;

    public void TrackSpeedEditAction(int p0,double p1,double p2,TransitionEffect p3,double p4){
       a.p(p3, "mTransitionToAdd");
       super();
       this.mTargetIndex = p0;
       this.mNewSpeed = p1;
       this.mOriginSpeed = p2;
       this.mTransitionToAdd = p3;
       this.totalDuration = p4;
    }
    public final Pair canChangeSpeed(Asset$b p0,double p1){
       TrackSpeedEditAction trackSpeedEd = TrackSpeedEditAction.class;
       if (PatchProxy.isSupport(trackSpeedEd)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, trackSpeedEd, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          Pair pair = new Pair(Boolean.FALSE, Integer.valueOf(5));
       }
       TimeRange selectedRang = p0.getSelectedRange();
       a.o(selectedRang, "currAssetBuilder.selectedRange");
       TimeRange selectedRang1 = p0.getSelectedRange();
       a.o(selectedRang1, "currAssetBuilder.selectedRange");
       p1 = (p1 - (selectedRang.getDuration() / this.mOriginSpeed)) + (selectedRang1.getDuration() / this.mNewSpeed);
       Objects.requireNonNull(ClipUtils.c);
       if (p1 - ClipUtils.a > 0) {
          return new Pair(Boolean.FALSE, Integer.valueOf(1));
       }else if(p1 - 0x3ff0000000000000 < 0){
          return new Pair(Boolean.FALSE, Integer.valueOf(3));
       }else {
          return new Pair(Boolean.TRUE, Integer.valueOf(5));
       }
    }
    public final double getMNewSpeed(){
       return this.mNewSpeed;
    }
    public final double getMOriginSpeed(){
       return this.mOriginSpeed;
    }
    public final int getMTargetIndex(){
       return this.mTargetIndex;
    }
    public final TransitionEffect getMTransitionToAdd(){
       return this.mTransitionToAdd;
    }
    public void performAction(c p0,c p1){
       GeneratedMessageLite$Builder uBuilder;
       AssetTransitionActionData$b uob;
       GeneratedMessageLite$Builder uBuilder2;
       ArrayList uArrayList1;
       TransitionEffect transitionEf;
       TrackSpeedEditAction trackSpeedEd1;
       double d1;
       TimeRange selectedRang1;
       double d2;
       Object obj = this;
       Object obj1 = p0;
       m obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, TrackSpeedEditAction.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "TrackSpeedEditActionV2";
       a.D().w(str, "change speed action", objArray);
       TrackSpeedEditAction mNewSpeed = obj.mNewSpeed;
       obj2 = m.class;
       String obj3 = null;
       int i1 = 1;
       if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Double.valueOf(mNewSpeed), obj3, obj2, "15")) {
          if (!PatchProxy.applyVoid(obj3, obj3, obj2, "17")) {
             if (m.a == null) {
                m.a = new HashMap();
             }
             m.a.put(Double.valueOf(0x3ff0000000000000), "标准");
             m.a.put(Double.valueOf(0x3fe0000000000000), "慢");
             m.a.put(Double.valueOf(0x3fd51eb851eb851f), "极慢");
             m.a.put(Double.valueOf(2.00f), "快");
             m.a.put(Double.valueOf(3.00f), "极快");
          }
          Pair[] pairArray = new Pair[i1];
          Object obj5 = m.a.get(Double.valueOf(mNewSpeed));
          pairArray[i] = new Pair("type_name", obj5);
          s.i("SPEED_TYPE", obj5.a(pairArray));
       }
       a uoa = a.c(p0);
       a uoa1 = a.a.u(obj1);
       ArrayList uArrayList = new ArrayList();
       TrackSpeedEditAction mTargetIndex = obj.mTargetIndex;
       f.a.k(mTargetIndex);
       if (mTargetIndex > null) {
          int i2 = mTargetIndex - 1;
          uBuilder = uoa.n(i2);
          a.o(uBuilder, "assetDraft.getBuilder\(assetDraftIndex - 1\)");
          uob = AssetTransitionActionData.newBuilder();
          uob.b(i2);
          uob.a(uBuilder.getTransition());
          uArrayList.add(uob.build());
       }else {
          uBuilder = obj3;
       }
       GeneratedMessageLite$Builder uBuilder1 = uoa.n(mTargetIndex);
       a.o(uBuilder1, "assetDraft.getBuilder\(assetDraftIndex\)");
       uob = AssetTransitionActionData.newBuilder();
       uob.b(mTargetIndex);
       uob.a(uBuilder1.getTransition());
       uArrayList.add(uob.build());
       if (mTargetIndex < (uoa.p() - i1)) {
          int i3 = mTargetIndex + 1;
          uBuilder2 = uoa.n(i3);
          a.o(uBuilder2, "assetDraft.getBuilder\(assetDraftIndex + 1\)");
          AssetTransitionActionData$b uob1 = AssetTransitionActionData.newBuilder();
          uob1.b(i3);
          uob1.a(uBuilder2.getTransition());
          uArrayList.add(uob1.build());
       }else {
          uBuilder2 = obj3;
       }
       Pair pair = obj.canChangeSpeed(uBuilder1, obj.totalDuration);
       if (!pair.getFirst().booleanValue()) {
          if (pair.getSecond().intValue() != i1) {
             obj.setActionCode(6);
          }else {
             obj.setActionCode(5);
          }
          return;
       }else {
          uBuilder1.u(obj.mNewSpeed);
          TimeRange selectedRang = uBuilder1.getSelectedRange();
          a.o(selectedRang, "currAssetBuilder.selectedRange");
          double duration = selectedRang.getDuration();
          a uoa2 = uoa1;
          TrackSpeedEditAction mNewSpeed1 = obj.mNewSpeed;
          TrackSpeedEditAction trackSpeedEd = mTargetIndex;
          double d = (double)0x3f800000;
          if ((duration / mNewSpeed1) - d <= 0) {
             obj3 = str;
             uArrayList1 = uArrayList;
             if ((duration / obj.mOriginSpeed) - d > 0) {
                transitionEf = TransitionEffect.Companion.b();
             }else if((duration / mNewSpeed1) - d > 0 && (duration / obj.mOriginSpeed) - d <= 0){
                if (uBuilder2 != null) {
                   TimeRange selectedRang2 = uBuilder2.getSelectedRange();
                   if (selectedRang2 != null) {
                      d1 = selectedRang2.getDuration();
                   label_01be :
                      if (d1 - d > 0) {
                         transitionEf = obj.mTransitionToAdd;
                      }
                   }
                }
                mNewSpeed1 = Double.MAX_VALUE;
                goto label_01be ;
             }
          label_01c5 :
             transitionEf = null;
          }else {
             obj3 = str;
             uArrayList1 = uArrayList;
             goto label_019f ;
          }
          if (transitionEf != null) {
             trackSpeedEd1 = trackSpeedEd;
             if (trackSpeedEd1 < (uoa.p() - 1)) {
                uBuilder1.v(transitionEf.toAssetTransition());
             }
             if (trackSpeedEd1 > null && uBuilder != null) {
                TransitionEffect$a companion = TransitionEffect.Companion;
                uBuilder.v(companion.b().toAssetTransition());
                uBuilder1.v(companion.b().toAssetTransition());
             }
          }else {
             trackSpeedEd1 = trackSpeedEd;
          }
          GeneratedMessageLite$Builder uBuilder3 = uoa2.b();
          a.o(uBuilder3, "undoDraft.append\(\)");
          AssetSpeedAction$b uob2 = AssetSpeedAction.newBuilder();
          uob2.a(trackSpeedEd1);
          uob2.copyOnWrite();
          uob2.instance.setSpeed(obj.mOriginSpeed);
          uob2.copyOnWrite();
          uob2.instance.addAllOriginalAssetTransitions(uArrayList1);
          uBuilder3.c(uob2.build());
          d1 = 0;
          List list = uoa.z();
          a.o(list, "assetDraft.messages");
          Iterator iterator = list.iterator();
          int i4 = 0;
          while (iterator.hasNext()) {
             Object obj4 = iterator.next();
             i1 = i4 + 1;
             if (i4 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             String str1 = "asset.selectedRange";
             if (i4 == trackSpeedEd1) {
                a.o(obj4, "asset");
                selectedRang1 = obj4.getSelectedRange();
                a.o(selectedRang1, str1);
                d2 = selectedRang1.getDuration() / obj.mNewSpeed;
             }else {
                a.o(obj4, "asset");
                selectedRang1 = obj4.getSelectedRange();
                a.o(selectedRang1, str1);
                d2 = selectedRang1.getDuration();
             }
             d1 = d1 + d2;
             i4 = i1;
          }
          u.s(p0.J0(), d1);
          Object[] objArray1 = new Object[0];
          a.D().w(obj3, "\n change speed finish\n", objArray1);
          return;
       }
    }
}
