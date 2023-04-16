package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameAddClipAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import vaa.a;
import haa.a;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.regex.Pattern;
import lnc.v5;
import java.util.regex.Matcher;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$Type;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import com.kuaishou.edit.draft.KuaishanAsset;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Math;
import ssd.e;
import ssd.e$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Kuaishan$b;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.Asset$b;
import wba.n0;
import com.kuaishou.edit.draft.Asset$Type;
import w46.b;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;

public final class KeyFrameAddClipAction extends EditSdkAction	// class@001008
{
    public final int insertIndex;
    public final double mDefaultAddedPicClipDuration;
    public final double mDefaultAddedVideoClipDuration;
    public final List mediaList;

    public void KeyFrameAddClipAction(List p0,int p1){
       a.p(p0, "mediaList");
       super();
       this.mediaList = p0;
       this.insertIndex = p1;
       this.mDefaultAddedVideoClipDuration = 4.00f;
       this.mDefaultAddedPicClipDuration = 2.00f;
    }
    public final void addMediaToKuaishanAsset(int p0,QMedia p1,c p2){
       KeyFrameAddClipAction keyFrameAddC;
       if (PatchProxy.isSupport(KeyFrameAddClipAction.class)) {
          keyFrameAddC = KeyFrameAddClipAction.class;
          if (PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, keyFrameAddC, "2")) {
             return;
          }
       }
       String str = "KeyFrameAddClipAction";
       if (!TextUtils.x(p1.mExportFilePath) && (p1.mExportWidth <= null || p1.mExportHeight <= null)) {
          Object[] objArray = new Object[0];
          a.D().t(str, "addMediaToKuaishanAsset: qmedia path = "+p1.path+" is invalid, "+"skip adding this media", objArray);
          return;
       }else {
          Object[] StickerResult$b objArray1 = new Object[0];
          a.D().w(str, "addMediaToKuaishanAsset: adding qmedia path = "+p1.path+" to "+"KuaishanAsset", objArray1);
          a uoa = a.m(p2);
          a uoa1 = a.c(p2);
          if (!uoa.D()) {
             uoa.c0();
          }
          if (!uoa1.D()) {
             uoa1.c0();
          }
          boolean b = keyFrameAddC.c().matcher(p1.mExportFilePath).matches();
          String str1 = uoa.Q(p1.mExportFilePath);
          objArray1 = StickerResult.newBuilder();
          StickerResult$Type vIDEO = (b)? StickerResult$Type.VIDEO: StickerResult$Type.PICTURE;
          objArray1.u(vIDEO);
          objArray1.m(str1);
          int i = 1000;
          if (b) {
             TimeRange$b uob = TimeRange.newBuilder();
             double d = (double)i;
             uob.b(((double)p1.mClipStart / d));
             uob.a(((double)p1.mClipDuration / d));
             objArray1.h(uob);
          }
          KuaishanAsset$b uob1 = KuaishanAsset.newBuilder();
          uob1.e(DraftUtils.i());
          uob1.n(objArray1);
          uob1.c(TextUtils.k(p1.path));
          double d1 = (b)? Math.min(((double)p1.getClipDuration() / (double)i), this.mDefaultAddedVideoClipDuration): this.mDefaultAddedPicClipDuration;
          uob1.f(d1);
          uob1.g(String.valueOf(e.b.k()));
          uob1.l((double)p1.mExportWidth);
          uob1.k((double)p1.mExportHeight);
          Kuaishan$b uob2 = uoa.k();
          uob2.copyOnWrite();
          uob2.instance.addAssets(p0, uob1);
          Asset$b uob3 = uoa1.b();
          uob3.m(n0.e(p1.path));
          Asset$Type vIDEO1 = (b)? Asset$Type.VIDEO: Asset$Type.PICTURE;
          uob3.w(vIDEO1);
          uob3.i(((double)p1.duration / (double)i));
          uob3.k(uoa1.R(p1.path, 0));
          uob3.d(p1.path);
          return;
       }
    }
    public final int getInsertIndex(){
       return this.insertIndex;
    }
    public final List getMediaList(){
       return this.mediaList;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameAddClipAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Iterator iterator = CollectionsKt___CollectionsKt.G4(this.mediaList).iterator();
       while (iterator.hasNext()) {
          this.addMediaToKuaishanAsset(this.insertIndex, iterator.next(), p0);
       }
       return;
    }
}
