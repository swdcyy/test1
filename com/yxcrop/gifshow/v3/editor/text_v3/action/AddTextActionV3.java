package com.yxcrop.gifshow.v3.editor.text_v3.action.AddTextActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import ood.d;
import bod.a;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import hba.a;
import wnd.e;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import ood.e;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import xod.d;
import ood.b;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel$a;
import java.lang.Number;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;

public final class AddTextActionV3 extends EditSdkAction	// class@000bf8
{
    public final double currentTime;
    public final String defaultText;
    public final double duration;
    public final boolean isCommit;
    public final boolean isFirstAdd;
    public final Integer lastUsedAlignType;
    public final Integer lastUsedColor;
    public final a lastUsedFontItem;
    public final d lastUsedTextTemplate;
    public int layerIndex;

    public void AddTextActionV3(double p0,double p1,String p2,boolean p3,boolean p4,d p5,a p6,Integer p7,Integer p8){
       a.p(p2, "defaultText");
       super();
       this.currentTime = p0;
       this.duration = p1;
       this.defaultText = p2;
       this.isFirstAdd = p3;
       this.isCommit = p4;
       this.lastUsedTextTemplate = p5;
       this.lastUsedFontItem = p6;
       this.lastUsedColor = p7;
       this.lastUsedAlignType = p8;
       this.layerIndex = -1;
    }
    public void AddTextActionV3(double p0,double p1,String p2,boolean p3,boolean p4,d p5,a p6,Integer p7,Integer p8,int p9,u p10){
       int i = p9;
       String str = (i & 0x04)? "": p2;
       boolean b = (i & 0x08)? false: p3;
       boolean b1 = (i & 0x10)? true: p4;
       int i1 = 0;
       d uod = (i & 0x20)? i1: p5;
       a uoa = (i & 0x40)? i1: p6;
       Integer integer = (i & 0x0080)? i1: p7;
       Integer integer1 = (i & 0x0100)? i1: p8;
       super(p0, p1, str, b, b1, uod, uoa, integer, integer1);
       return;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final d getLastUsedTextTemplate(){
       return this.lastUsedTextTemplate;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
    public final TimeRange getTimeRange(){
       GeneratedMessageLite generatedMes;
       TimeRange$b obj = PatchProxy.apply(null, this, AddTextActionV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isFirstAdd != null) {
          obj = TimeRange.newBuilder();
          obj.b(0);
          obj.a(this.duration);
          generatedMes = obj.build();
          a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­uration\(duration\).build\(\)");
       }else if((this.duration - this.currentTime) - 0x3fe0000000000000 < 0){
          obj = TimeRange.newBuilder();
          obj.b((this.duration - 0x3fe0000000000000));
          obj.a(0x3fe0000000000000);
          generatedMes = obj.build();
       }else {
          obj = TimeRange.newBuilder();
          obj.b(this.currentTime);
          obj.a((this.duration - this.currentTime));
          generatedMes = obj.build();
       }
       a.o(generatedMes, "if \(duration - currentTi¡­rentTime\).build\(\)\n      }");
       return generatedMes;
    }
    public void performAction(c p0,c p1){
       int i1;
       int i2;
       int i = this;
       a obj = p0;
       TimeRange obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, i, AddTextActionV3.class, "1")) {
          return;
       }
       a.p(obj, "workspaceDraft");
       a.p(obj1, "store");
       super.performAction(p0, p1);
       obj = p0.W0();
       if (obj != null) {
          a.o(obj, "workspaceDraft.textDraft ?: return");
          i.layerIndex = e.a();
          obj1 = this.getTimeRange();
          Object[] objArray = new Object[0];
          a.D().w("AddTextActionV3", "timeRange start="+obj1.getStart()+" duration="+obj1.getDuration()+", layerIndex:"+i.layerIndex+", "+"currentTime:"+i.currentTime+", duration:"+i.duration+", defaultText"+i.defaultText+", isFirstAdd"+i.isFirstAdd+", isCommit:"+i.isCommit+", lastUsedTextTemplate:"+i.lastUsedTextTemplate+','+"lastUsedFontItem:"+i.lastUsedFontItem+", lastUsedColor:"+i.lastUsedColor+", lastUsedAlignType:"+i.lastUsedAlignType, objArray);
          if (!obj.D()) {
             obj.c0();
          }
          AddTextActionV3 lastUsedText = i.lastUsedTextTemplate;
          if (lastUsedText == null) {
             i1 = 0;
             d.k(i.layerIndex, e.a(), obj, obj1.getStart(), obj1.getDuration(), null, false, e.a().q(), 96, null);
          }else if(lastUsedText.n() == null){
             i1 = 0;
             d.k(i.layerIndex, e.a(), obj, obj1.getStart(), obj1.getDuration(), null, false, e.a().q(), 96, null);
             i2 = 1;
          label_0143 :
             CommonDraftTextAssetModel$TextInfoModel$a textInfoMode = d.f(i.layerIndex, obj, i1, 4, null);
             if (!i2) {
                lastUsedText = i.lastUsedFontItem;
                if (lastUsedText != null) {
                   d.l(lastUsedText, i.layerIndex, obj);
                }
                lastUsedText = i.lastUsedColor;
                if (lastUsedText != null) {
                   i1 = lastUsedText.intValue();
                   if (textInfoMode != null) {
                      textInfoMode.k(i1);
                   }
                }
                lastUsedText = i.lastUsedAlignType;
                if (lastUsedText != null) {
                   i1 = lastUsedText.intValue();
                   if (textInfoMode != null) {
                      textInfoMode.a(i1);
                   }
                }
             }
          label_0170 :
             if (textInfoMode != null) {
                GeneratedMessageLite generatedMes = textInfoMode.build();
                if (generatedMes != null) {
                   d.m(generatedMes, i.layerIndex, obj, 0, 8, null);
                }
             }
             d.a.i(i.layerIndex, obj);
             if (i.isCommit != null) {
                obj.f();
             }
          }else {
             i1 = 0;
             d.k(i.layerIndex, i.lastUsedTextTemplate, obj, obj1.getStart(), obj1.getDuration(), null, false, i.lastUsedTextTemplate.q(), 96, null);
          }
          i2 = 0;
          goto label_0143 ;
       }
       return;
    }
    public final void setLayerIndex(int p0){
       this.layerIndex = p0;
    }
}
