package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameDeleteAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import u80.f;
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
import kotlin.Pair;
import lnc.g7;
import java.lang.Number;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import w46.b;
import vaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan$b;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.KuaishanAsset;
import com.google.protobuf.GeneratedMessageLite;
import maa.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Integer;
import qaa.a;
import wba.m;

public final class KeyFrameDeleteAction extends EditSdkAction	// class@00100a
{
    public final f toDeleteKeyFrame;

    public void KeyFrameDeleteAction(f p0){
       a.p(p0, "toDeleteKeyFrame");
       super();
       this.toDeleteKeyFrame = p0;
    }
    public final f getToDeleteKeyFrame(){
       return this.toDeleteKeyFrame;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameDeleteAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       String str = "KeyFrameDeleteAction";
       a.D().w(str, "deleting KSKeyFrame with id: "+this.toDeleteKeyFrame.l(), objArray);
       Pair pair = g7.f(p0, this.toDeleteKeyFrame);
       int i = pair.getFirst().intValue();
       KuaishanAsset$b second = pair.getSecond();
       if (second == null) {
          Object[] objArray1 = new Object[0];
          a.D().t(str, "toDeleteKSAsset cannot be found by KSKeyFrame with id: "+this.toDeleteKeyFrame.l(), objArray1);
          return;
       }else {
          GeneratedMessageLite$Builder uBuilder = a.m(p0).k();
          a.o(uBuilder, "DraftGetUtils.getKuaisha¡­aft\).ensureFirstBuilder\(\)");
          int assetsCount = uBuilder.getAssetsCount();
          if (i >= 0 && assetsCount > i) {
             uBuilder.c(i);
          }
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(second);
          List subAssetsLis = second.getSubAssetsList();
          if (subAssetsLis != null) {
             Iterator iterator = subAssetsLis.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().toBuilder());
             }
          }
          a uoa = a.c(p0);
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             Integer first = DraftUtils.n(p0, iterator1.next()).getFirst();
             assetsCount = uoa.p();
             a.o(first, "toDeleteAssetIndex");
             int i1 = first.intValue();
             if (i1 >= 0 && assetsCount > i1) {
                uoa.V(first.intValue());
             }
          }
          a uoa1 = a.f(p0);
          if (!uoa1.D()) {
             uoa1.c0();
          }
          m.b(uoa1, true, 0, 4, null);
          return;
       }
    }
}
