package com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationHandlerAdjustAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import java.util.List;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.ArrayList;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.util.Collection;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import hba.a;

public final class DecorationHandlerAdjustAction extends EditDraftAction	// class@000a29
{
    public final List assetList;
    public final boolean commit;
    public final List dataList;
    public final boolean isSticker;
    public final boolean isSubtitle;
    public final double pendingLengthChanged;
    public final double pendingStartChanged;
    public final boolean photoMovie;
    public final ITimelineView$IRangeView$a rangeView;
    public StickerResult stickerResult;
    public final UpdateTo updateTo;
    public final double videoDuration;

    public void DecorationHandlerAdjustAction(double p0,double p1,ITimelineView$IRangeView$a p2,List p3,double p4,boolean p5,List p6,UpdateTo p7,boolean p8,boolean p9,boolean p10){
       int i = this;
       Object obj = p6;
       Object obj1 = p7;
       a.p(p2, "rangeView");
       a.p(p3, "dataList");
       a.p(obj, "assetList");
       a.p(obj1, "updateTo");
       super(false, 1, null);
       i.pendingStartChanged = p0;
       i.pendingLengthChanged = p1;
       i.rangeView = p2;
       i.dataList = p3;
       i.videoDuration = p4;
       i.photoMovie = p5;
       i.assetList = obj;
       i.updateTo = obj1;
       i.isSubtitle = p8;
       i.isSticker = p9;
       i.commit = p10;
    }
    public void DecorationHandlerAdjustAction(double p0,double p1,ITimelineView$IRangeView$a p2,List p3,double p4,boolean p5,List p6,UpdateTo p7,boolean p8,boolean p9,boolean p10,int p11,u p12){
       int i = p11;
       boolean b = (i & 0x20)? false: p5;
       ArrayList uArrayList = (i & 0x40)? new ArrayList(): p6;
       boolean b1 = (i & 0x0200)? false: p9;
       super(p0, p1, p2, p3, p4, b, uArrayList, p7, p8, b1, p10);
       return;
    }
    public final List getAssetList(){
       return this.assetList;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final List getDataList(){
       return this.dataList;
    }
    public final double getPendingLengthChanged(){
       return this.pendingLengthChanged;
    }
    public final double getPendingStartChanged(){
       return this.pendingStartChanged;
    }
    public final boolean getPhotoMovie(){
       return this.photoMovie;
    }
    public final ITimelineView$IRangeView$a getRangeView(){
       return this.rangeView;
    }
    public final StickerResult getStickerResult(){
       return this.stickerResult;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
    public final double getVideoDuration(){
       return this.videoDuration;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public final boolean isSubtitle(){
       return this.isSubtitle;
    }
    public void performAction(c p0,c p1){
       double d3;
       StickerResult stickerResul = this;
       a obj = p0;
       DecorationHandlerAdjustAction obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, stickerResul, DecorationHandlerAdjustAction.class, "1")) {
          return;
       }
       a.p(obj, "workspaceDraft");
       a.p(obj1, "store");
       super.performAction(p0, p1);
       obj1 = stickerResul.rangeView;
       double d = 0x3fb999999999999a;
       double d1 = 0x3fe0000000000000;
       double d2 = 0;
       if (stickerResul.pendingStartChanged - d2) {
          d3 = Math.max(d2, Math.min((obj1.h() + stickerResul.pendingStartChanged), (obj1.g() - d1)));
          if (stickerResul.isSubtitle != null) {
             Iterator iterator = stickerResul.dataList.iterator();
             int i = 0;
             int i1 = 0;
             while (iterator.hasNext()) {
                Object obj2 = iterator.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (obj2.e() == obj1.e()) {
                   i = i1;
                }
                i1 = i2;
             }
             if (i > 0) {
                d3 = Math.max(d3, (stickerResul.dataList.get((i - 1)).g() + d));
             }
          }
          obj1.C(d3);
          obj1.E((obj1.j() - (d3 - obj1.h())));
       }
       if (stickerResul.pendingLengthChanged - d2) {
          d3 = Math.max((obj1.h() + d1), (obj1.g() + stickerResul.pendingLengthChanged));
          d3 = (stickerResul.photoMovie != null && (stickerResul.assetList.isEmpty() ^ 0x01))? Math.min(((double)stickerResul.assetList.size() * 2.00f), d3): Math.min(stickerResul.videoDuration, d3);
          if (stickerResul.isSubtitle != null) {
             Iterator iterator1 = stickerResul.dataList.iterator();
             int i3 = 0;
             int i4 = 0;
             while (iterator1.hasNext()) {
                Object obj3 = iterator1.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (obj3.e() == obj1.e()) {
                   i3 = i4;
                }
                i4 = i5;
             }
             i3 = i3 + 1;
             if (i3 < stickerResul.dataList.size()) {
                d3 = Math.min(d3, (stickerResul.dataList.get(i3).h() - d));
             }
          }
          obj1.E((obj1.j() + (d3 - obj1.g())));
       }
       Object[] objArray = new Object[0];
       a.D().s("textrange", "start: "+obj1.h()+" duration:"+obj1.j(), objArray);
       if (stickerResul.isSticker != null) {
          obj = p0.U0();
          if (obj != null) {
             a.o(obj, "workspaceDraft.stickerDraft ?: return");
             if (stickerResul.commit != null && !obj.D()) {
                obj.c0();
             }
             h.p(obj, obj1.e(), obj1.h(), obj1.j());
             if (stickerResul.commit != null) {
                obj.f();
             }
          }else {
             return;
          }
       }else {
          obj = p0.W0();
          if (obj != null) {
             a.o(obj, "workspaceDraft.textDraft ?: return");
             if (stickerResul.commit != null && !obj.D()) {
                obj.c0();
             }
             stickerResul.stickerResult = h.q(obj, obj1.e(), obj1.h(), obj1.j());
             if (stickerResul.commit != null) {
                obj.f();
             }
          }
       }
       return;
    }
    public final void setStickerResult(StickerResult p0){
       this.stickerResult = p0;
    }
}
