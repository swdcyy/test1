package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecSuccessActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import ood.d;
import bod.a;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo$SubtitleInfo;
import tvc.e;
import java.util.Objects;
import zmd.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import xld.a;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import wnd.e;
import ood.e;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import xod.d;
import ood.b;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel$a;
import java.lang.Number;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;
import java.lang.CharSequence;
import wba.l0;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.edit.draft.Text$b;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame$a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform$a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame;

public final class SubtitleRecSuccessActionV3 extends EditSdkAction	// class@000ae5
{
    public final Integer lastUsedAlignType;
    public final Integer lastUsedColor;
    public final a lastUsedFontItem;
    public final d lastUsedTextTemplate;
    public final List list;

    public void SubtitleRecSuccessActionV3(List p0,d p1,a p2,Integer p3,Integer p4){
       a.p(p0, "list");
       super();
       this.list = p0;
       this.lastUsedTextTemplate = p1;
       this.lastUsedFontItem = p2;
       this.lastUsedColor = p3;
       this.lastUsedAlignType = p4;
    }
    public void SubtitleRecSuccessActionV3(List p0,d p1,a p2,Integer p3,Integer p4,int p5,u p6){
       d uod = (p5 & 0x02)? null: p1;
       a uoa = (p5 & 0x04)? null: p2;
       Integer integer = (p5 & 0x08)? null: p3;
       Integer integer1 = (p5 & 0x10)? null: p4;
       super(p0, uod, uoa, integer, integer1);
       return;
    }
    public final List getList(){
       return this.list;
    }
    public void performAction(c p0,c p1){
       int i2;
       String str2;
       SubtitleRecSuccessActionV3 subtitleRecS;
       int i4;
       String str3;
       Object obj = this;
       a obj1 = p0;
       e obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, SubtitleRecSuccessActionV3.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       obj1 = p0.W0();
       if (obj1 != null) {
          a.o(obj1, "workspaceDraft.textDraft ?: return");
          if (!obj1.D()) {
             obj1.c0();
          }
          int i = (obj.list.get(0).getType() != 4 && (obj.list.get(0).getType() == 2 || obj.list.get(0).getType() == 3))? 1: 0;
          obj2 = p1.f();
          Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleRootState");
          Object[] objArray = new Object[0];
          String str = "SubtitleRecSuccessActionV3";
          a.D().w(str, "performAction list:"+obj.list+", lastUsedTextTemplate:"+obj.lastUsedTextTemplate+", "+"lastUsedFontItem:"+obj.lastUsedFontItem+", lastUsedColor:"+obj.lastUsedColor+", lastUsedAlignType:"+obj.lastUsedAlignType, objArray);
          Iterator iterator = obj.list.iterator();
          while (iterator.hasNext()) {
             Object obj3 = iterator.next();
             double d = (double)obj3.getStartTime();
             float f = obj3.getEndTime() - obj3.getStartTime();
             double d1 = (double)f;
             if (i) {
                double d2 = obj2.m() / obj2.n();
                d = d * d2;
                d1 = d1 * d2;
             }
             TimeRange$b uob = TimeRange.newBuilder();
             uob.b(d);
             uob.a(d1);
             TimeRange timeRange = uob.build();
             int i1 = e.a();
             SubtitleRecSuccessActionV3 lastUsedText = obj.lastUsedTextTemplate;
             String str1 = "timeRange";
             if (lastUsedText == null) {
                a.o(timeRange, str1);
                i2 = i1;
                str2 = str;
                d.j(i1, e.a(), obj1, timeRange.getStart(), timeRange.getDuration(), null, 1, e.a().q());
             }else {
                i2 = i1;
                str2 = str;
                if (lastUsedText.n() == null) {
                   a.o(timeRange, str1);
                   d.j(i2, e.a(), obj1, timeRange.getStart(), timeRange.getDuration(), null, true, e.a().q());
                   subtitleRecS = 1;
                label_0177 :
                   int i3 = i2;
                   CommonDraftTextAssetModel$TextInfoModel$a textInfoMode = d.f(i3, obj1, 0, 4, null);
                   if (!subtitleRecS) {
                      subtitleRecS = obj.lastUsedFontItem;
                      if (subtitleRecS != null) {
                         d.l(subtitleRecS, i3, obj1);
                      }
                      subtitleRecS = obj.lastUsedColor;
                      if (subtitleRecS != null) {
                         i4 = subtitleRecS.intValue();
                         if (textInfoMode != null) {
                            textInfoMode.k(i4);
                         }
                      }
                      subtitleRecS = obj.lastUsedAlignType;
                      if (subtitleRecS != null) {
                         i4 = subtitleRecS.intValue();
                         if (textInfoMode != null) {
                            textInfoMode.a(i4);
                         }
                      }
                   }
                label_01a1 :
                   if (textInfoMode != null) {
                      CommonDraftTextAssetModel$TextInfoModel textInfoMode1 = textInfoMode.build();
                      if (textInfoMode1 != null) {
                         d.m(textInfoMode1, i3, obj1, 0, 8, null);
                      }
                   }
                   l0 ol0 = (obj3.getText().length() > 0)? 1: null;
                   if (ol0) {
                      i4 = l0.a.a(i3, obj1);
                      if (i4 < 0) {
                         PostUtils.D(str2, "performAction", new RuntimeException("draft is empty"));
                         return;
                      }else {
                         str3 = str2;
                         GeneratedMessageLite$Builder uBuilder = obj1.n(i4);
                         a.o(uBuilder, "textDraft.getBuilder\(draftPosition\)");
                         uBuilder.m(obj3.getText());
                      }
                   }else {
                      str3 = str2;
                   }
                   CommonDraftBaseAssetModel$PropertyKeyFrame$a propertyKeyF = d.g(i3, obj1);
                   if (propertyKeyF != null) {
                      CommonDraftBaseAssetModel$AssetTransform$a uAssetTransf = propertyKeyF.getAssetTransform().toBuilder();
                      uAssetTransf.b(75.00f);
                      propertyKeyF.a(uAssetTransf);
                      GeneratedMessageLite generatedMes = propertyKeyF.build();
                      a.o(generatedMes, "transformBuilder.build\(\)");
                      d.n(generatedMes, i3, obj1);
                      d.a.i(i3, obj1);
                      str = str3;
                   }
                }else {
                   a.o(timeRange, str1);
                   d.j(i2, obj.lastUsedTextTemplate, obj1, timeRange.getStart(), timeRange.getDuration(), null, true, obj.lastUsedTextTemplate.q());
                }
             }
             subtitleRecS = null;
             goto label_0177 ;
          }
       }
       return;
    }
}
