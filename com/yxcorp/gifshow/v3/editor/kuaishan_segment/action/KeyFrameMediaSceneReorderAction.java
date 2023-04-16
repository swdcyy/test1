package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameMediaSceneReorderAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.edit.draft.KuaishanAsset;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import vaa.a;
import haa.a;
import frc.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.Pair;
import haa.f;
import w46.b;
import trd.u;
import java.lang.StringBuilder;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Kuaishan$b;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import u80.f;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Asset;

public final class KeyFrameMediaSceneReorderAction extends EditSdkAction	// class@00100b
{
    public final int endPosition;
    public final List oldKeyFrameList;
    public final int startPosition;

    public void KeyFrameMediaSceneReorderAction(List p0,int p1,int p2){
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
    public final List getReorderedAlbumAssetList(List p0,int p1,int p2){
       if (PatchProxy.isSupport(KeyFrameMediaSceneReorderAction.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KeyFrameMediaSceneReorderAction.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 > p0.size() || p2 > p0.size()) {
          return new ArrayList();
       }else {
          p0 = CollectionsKt___CollectionsKt.J5(p0);
          p0.add(p2, p0.remove(p1));
          return p0;
       }
    }
    public final int getStartPosition(){
       return this.startPosition;
    }
    public void performAction(c p0,c p1){
       int i1;
       Iterator iterator1;
       Object obj1;
       int i2;
       ArrayList uArrayList2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameMediaSceneReorderAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.m(p0);
       ArrayList obj = null;
       ArrayList uArrayList = PatchProxy.applyOneRefs(uoa, obj, c.class, "11");
       int i = 0;
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(uoa, "kuaishanDraft");
          uArrayList = new ArrayList();
          Kuaishan kuaishan = uoa.v();
          if (kuaishan != null) {
             List assetsList = kuaishan.getAssetsList();
             if (assetsList != null) {
                iterator1 = assetsList.iterator();
                i1 = 0;
                while (iterator1.hasNext()) {
                   obj1 = iterator1.next();
                   i2 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   a.o(obj1, "kuaishanAsset");
                   if (obj1.getAssetTag() != null) {
                      String assetTag = obj1.getAssetTag();
                      a.o(assetTag, "kuaishanAsset.assetTag");
                      if (StringsKt__StringsKt.O2(assetTag, "ms_album", i, 2, obj)) {
                         uArrayList.add(new Pair(Integer.valueOf(i1), obj1));
                      }
                   }
                   i1 = i2;
                }
             }
          }
       }
       String str = "KeyFrameMediaSceneReorderAction";
       if (uArrayList.isEmpty()) {
          Object[] objArray = new Object[i];
          f.D().t(str, "performAction\(\) no ksAsset contains ms_album", objArray);
          return;
       }else {
          i1 = 10;
          obj = new ArrayList(u.Y(uArrayList, i1));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().getSecond());
          }
          List reorderedAlb = this.getReorderedAlbumAssetList(obj, this.startPosition, this.endPosition);
          if (reorderedAlb.size() != uArrayList.size()) {
             Object[] objArray1 = new Object[i];
             f.D().t(str, "performAction\(\) reordered size="+reorderedAlb.size()+"before size="+uArrayList.size(), objArray1);
             return;
          }else {
             ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, i1));
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                uArrayList1.add(Integer.valueOf(iterator.next().getFirst().intValue()));
             }
             iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                obj1 = iterator1.next();
                i2 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                Kuaishan$b uob = uoa.k();
                uob.copyOnWrite();
                uob.instance.setAssets(obj1.intValue(), reorderedAlb.get(i));
                i = i2;
             }
             KeyFrameMediaSceneReorderAction tendPosition = this.endPosition;
             KeyFrameMediaSceneReorderAction tstartPositi = this.startPosition;
             if (tendPosition > tstartPositi) {
                if (tstartPositi <= tendPosition) {
                   while (true) {
                      uArrayList2 = new ArrayList(u.Y(uArrayList, i1));
                      iterator = uArrayList.iterator();
                      break ;
                   }
                   while (iterator.hasNext()) {
                      uArrayList2.add(Integer.valueOf(iterator.next().getFirst().intValue()));
                   }
                   this.updateDraft(p0, uoa, tstartPositi, uArrayList2.get(tstartPositi).intValue());
                   if (tstartPositi != tendPosition) {
                      tstartPositi = tstartPositi + 1;
                   }
                }
             }else if(tendPosition < tstartPositi && tstartPositi >= tendPosition){
                while (true) {
                   uArrayList2 = new ArrayList(u.Y(uArrayList, i1));
                   iterator = uArrayList.iterator();
                   break ;
                }
                while (iterator.hasNext()) {
                   uArrayList2.add(Integer.valueOf(iterator.next().getFirst().intValue()));
                }
                this.updateDraft(p0, uoa, tstartPositi, uArrayList2.get(tstartPositi).intValue());
                if (tstartPositi != tendPosition) {
                   tstartPositi = tstartPositi - 1;
                }
             }
             return;
          }
       }
    }
    public final void updateDraft(c p0,a p1,int p2,int p3){
       Pair this;
       if (PatchProxy.isSupport(KeyFrameMediaSceneReorderAction.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, KeyFrameMediaSceneReorderAction.class, "2")) {
          return;
       }
       GeneratedMessageLite$Builder uBuilder = p1.k();
       a.o(uBuilder, "kuaishanDraft.ensureFirstBuilder\(\)");
       KuaishanAsset$b uob = uBuilder.getAssets(p3).toBuilder();
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
          this = DraftUtils.n(p0, obj);
          a.o(this, "DraftUtils.findAssetFrom¡­\(workspaceDraft, builder\)");
          a.o(obj, "builder");
          c.d(uof, obj, this.getSecond());
          uob.o(i, obj);
          i = i1;
       }
       uBuilder.d(p3, uob);
       return;
    }
}
