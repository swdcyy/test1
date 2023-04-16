package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameReorderAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import maa.a;
import haa.a;
import vaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.KuaishanAsset;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Kuaishan$b;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Asset;
import java.lang.Integer;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import u80.f;
import kotlin.Pair;
import frc.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class KeyFrameReorderAction extends EditSdkAction	// class@001015
{
    public final int endPosition;
    public final List oldKeyFrameList;
    public final int startPosition;

    public void KeyFrameReorderAction(List p0,int p1,int p2){
       a.p(p0, "oldKeyFrameList");
       super();
       this.oldKeyFrameList = p0;
       this.startPosition = p1;
       this.endPosition = p2;
    }
    public final int getEndPosition(){
       return this.endPosition;
    }
    public final List getOldKeyFrameList(){
       return this.oldKeyFrameList;
    }
    public final int getStartPosition(){
       return this.startPosition;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameReorderAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.c(p0);
       a uoa1 = a.m(p0);
       Kuaishan kuaishan = uoa1.v();
       if (kuaishan != null) {
          KuaishanAsset assets = kuaishan.getAssets(this.startPosition);
          if (assets != null) {
             Kuaishan$b uob = uoa1.k();
             uob.c(this.startPosition);
             uob.copyOnWrite();
             uob.instance.addAssets(this.endPosition, assets);
             if (DraftUtils.P(p0)) {
                return;
             }else {
                KeyFrameReorderAction tendPosition = this.endPosition;
                KeyFrameReorderAction tstartPositi = this.startPosition;
                if (tendPosition > tstartPositi) {
                   if (tstartPositi <= tendPosition) {
                      this.updateDraft(p0, uoa1, tstartPositi);
                      while (tstartPositi != tendPosition) {
                         tstartPositi = tstartPositi + 1;
                      }
                   }
                }else if(tendPosition < tstartPositi && tstartPositi >= tendPosition){
                   this.updateDraft(p0, uoa1, tstartPositi);
                   while (tstartPositi != tendPosition) {
                      tstartPositi = tstartPositi - 1;
                   }
                }
                uoa.W(this.startPosition, false);
                uoa.C(this.endPosition, uoa.y(this.startPosition));
             }
          }
       }
       return;
    }
    public final void updateDraft(c p0,a p1,int p2){
       if (PatchProxy.isSupport(KeyFrameReorderAction.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KeyFrameReorderAction.class, "2")) {
          return;
       }
       GeneratedMessageLite$Builder uBuilder = p1.k();
       a.o(uBuilder, "kuaishanDraft.ensureFirstBuilder\(\)");
       KuaishanAsset$b uob = uBuilder.getAssets(p2).toBuilder();
       f uof = this.oldKeyFrameList.get(p2);
       Pair pair = DraftUtils.n(p0, uob);
       a.o(pair, "DraftUtils.findAssetFrom¡­aceDraft, ksAssetBuilder\)");
       a.o(uob, "ksAssetBuilder");
       c.d(uof, uob, pair.getSecond());
       List subAssetsLis = uob.getSubAssetsList();
       a.o(subAssetsLis, "ksAssetBuilder.subAssetsList");
       int i = 0;
       Iterator iterator = subAssetsLis.iterator();
       while (iterator.hasNext()) {
          KuaishanAsset$b obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj = obj.toBuilder();
          Pair pair1 = DraftUtils.n(p0, obj);
          a.o(pair1, "DraftUtils.findAssetFrom¡­\(workspaceDraft, builder\)");
          a.o(obj, "builder");
          c.d(uof, obj, pair1.getSecond());
          uob.o(i, obj);
          i = i1;
       }
       uBuilder.d(p2, uob);
       return;
    }
}
