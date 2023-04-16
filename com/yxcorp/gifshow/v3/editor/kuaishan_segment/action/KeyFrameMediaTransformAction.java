package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameMediaTransformAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import u80.f;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.model.KeyFrameTransform;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import vaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan$b;
import kotlin.Pair;
import lnc.g7;
import java.lang.Number;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.KuaishanAsset;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.TimeRange$b;
import faa.a;
import q87.c;
import java.util.Collection;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.AuditFrame$b;
import com.kuaishou.edit.draft.AuditFrame;

public final class KeyFrameMediaTransformAction extends EditSdkAction	// class@00100c
{
    public final boolean disableCropArea;
    public final boolean forceUpdateVideoPath;
    public final QMedia media;
    public final f selectedKeyFrame;
    public final KeyFrameTransform transform;

    public void KeyFrameMediaTransformAction(f p0,KeyFrameTransform p1,QMedia p2,boolean p3,boolean p4){
       a.p(p0, "selectedKeyFrame");
       a.p(p1, "transform");
       super();
       this.selectedKeyFrame = p0;
       this.transform = p1;
       this.media = p2;
       this.disableCropArea = p3;
       this.forceUpdateVideoPath = p4;
    }
    public void KeyFrameMediaTransformAction(f p0,KeyFrameTransform p1,QMedia p2,boolean p3,boolean p4,int p5,u p6){
       if (p5 & 0x04) {
          p2 = null;
       }
       QMedia qMedia = p2;
       boolean b = (p5 & 0x08)? false: p3;
       boolean b1 = (p5 & 0x10)? false: p4;
       super(p0, p1, qMedia, b, b1);
       return;
    }
    public final void fillTransformInfo(StickerResult$b p0,KeyFrameTransform p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameMediaTransformAction.class, "2")) {
          return;
       }
       p0.f(p1.getCenterX());
       p0.g(p1.getCenterY());
       p0.t(p1.getScale());
       p0.s(p1.getRotate());
       return;
    }
    public final boolean getDisableCropArea(){
       return this.disableCropArea;
    }
    public final boolean getForceUpdateVideoPath(){
       return this.forceUpdateVideoPath;
    }
    public final QMedia getMedia(){
       return this.media;
    }
    public final KeyFrameTransform getTransform(){
       return this.transform;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameMediaTransformAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       GeneratedMessageLite$Builder uBuilder = a.m(p0).k();
       a.o(uBuilder, "DraftGetUtils.getKuaisha¡­aft\).ensureFirstBuilder\(\)");
       Pair pair = g7.f(p0, this.selectedKeyFrame);
       int i = pair.getFirst().intValue();
       KuaishanAsset$b second = pair.getSecond();
       if (i >= 0 && second != null) {
          StickerResult$b uob = second.getResult().toBuilder();
          String str = "resultBuilder";
          if (!TextUtils.x(this.transform.getTransformedVideoPath()) && (this.forceUpdateVideoPath != null || (this.selectedKeyFrame.t() && !TextUtils.n(this.transform.getTransformedVideoPath(), this.selectedKeyFrame.j())))) {
             a.o(uob, str);
             uob.m(a.m(p0).Q(this.transform.getTransformedVideoPath()));
             KeyFrameMediaTransformAction tselectedKey = this.selectedKeyFrame;
             String transformedV = this.transform.getTransformedVideoPath();
             a.m(transformedV);
             Objects.requireNonNull(tselectedKey);
             if (!PatchProxy.applyVoidOneRefs(transformedV, tselectedKey, f.class, "5")) {
                a.p(transformedV, "<set-?>");
                tselectedKey.e = transformedV;
             }
          }
          if (this.disableCropArea == null) {
             a.o(uob, str);
             this.fillTransformInfo(uob, this.transform);
             if (second.getSubAssetsCount() > 0) {
                List subAssetsLis = second.getSubAssetsList();
                a.o(subAssetsLis, "assetBuilder.subAssetsList");
                Iterator iterator = subAssetsLis.iterator();
                int i1 = 0;
                while (iterator.hasNext()) {
                   KuaishanAsset$b uob1 = iterator.next().toBuilder();
                   a.o(uob1, "subAssetBuilder");
                   StickerResult$b uob2 = uob1.getResult().toBuilder();
                   a.o(uob2, "subResultBuilder");
                   this.fillTransformInfo(uob2, this.transform);
                   uob1.n(uob2);
                   second.o(i1, uob1);
                   i1 = i1 + 1;
                }
             }
          }
          if (uob.instance.hasClippedRange() && this.transform.hasClipRange()) {
             a.o(uob, str);
             TimeRange$b uob3 = uob.getClippedRange().toBuilder();
             a.o(uob3, "clippedRangeBuilder");
             uob3.b(this.transform.getClipStartInSeconds());
             uob3.a(this.transform.getClipDurationInSeconds());
             uob.h(uob3);
          }
          second.n(uob);
          KeyFrameMediaTransformAction tmedia = this.media;
          QMedia mVideoFrameL = (tmedia != null)? tmedia.mVideoFrameList: null;
          if (mVideoFrameL != null) {
             Object[] objArray = new Object[0];
             a.D().s("KeyFrameMediaTransformAction", "media frames is not null", objArray);
             second.b();
             mVideoFrameL = this.media.mVideoFrameList;
             a.o(mVideoFrameL, "media.mVideoFrameList");
             int i2 = mVideoFrameL.size();
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                String str1 = this.media.mVideoFrameList.get(i3);
                Object[] objArray1 = new Object[0];
                a.D().s("KeyFrameMediaTransformAction", "add audit frame "+str1, objArray1);
                AuditFrame$b uob4 = AuditFrame.newBuilder();
                uob4.a(a.m(p0).Q(str1));
                second.a(uob4.build());
             }
          }
          uBuilder.d(i, second);
       }
       return;
    }
}
