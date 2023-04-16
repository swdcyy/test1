package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$mTextElementUiDataList$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import tuc.b;
import tuc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.FeatureId;
import huc.d;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import uuc.e;
import java.lang.Boolean;
import java.lang.Float;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.kuaishou.edit.draft.CustomTextStyle;
import com.yxcorp.gifshow.postfont.repo.FontLineSpaceManager;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import android.graphics.RectF;
import java.util.List;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import huc.t;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.AssetSegment;
import com.kuaishou.edit.draft.Transform;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.kuaishou.edit.draft.Text$ParameterCase;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextElementViewModel$mTextElementUiDataList$1 extends Lambda implements p	// class@001424
{
    public final TextElementViewModel this$0;

    public void TextElementViewModel$mTextElementUiDataList$1(TextElementViewModel p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final c invoke(b p0,c p1){
       TextStyleValue textStyleVal;
       c a;
       int i4;
       String obj = this;
       Object obj1 = p0;
       EditTextBaseElementData obj2 = p1;
       String obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, TextElementViewModel$mTextElementUiDataList$1.class, "1");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a.p(obj1, "x");
       obj3 = d.f(p0.a().getFeatureId());
       boolean i = 0;
       int i1 = 1;
       boolean b = (PostExperimentUtils.t1() && obj.this$0.M0())? true: false;
       TextConfigParam textConfigPa = d.i(obj3, b);
       obj2 = (obj2 != null)? p1.a(): null;
       c uoc = new c(obj2, obj1.b);
       StickerResult result = p0.a().getResult();
       a.o(result, "x.draftText.result");
       String identifier = result.getIdentifier();
       a.o(identifier, "x.draftText.result.identifier");
       uoc.a().p0(identifier);
       obj2 = uoc.a();
       int i2 = 3;
       int i3 = (p0.a().hasSubtitleExtraParam())? 3: 1;
       obj2.T(i3);
       String str = (textConfigPa.i().i())? obj.this$0.G0().s0(): "SourceHanSansCN-Bold.otf";
       TextElementViewModel$mTextElementUiDataList$1 this$0 = obj.this$0;
       TextElementViewModel h = this$0.H;
       TextElementViewModel textElementV = (this$0.F.k())? obj.this$0.f: 0x3f800000;
       boolean b1 = obj.this$0.O0();
       boolean b2 = (PostExperimentUtils.t1() && obj.this$0.M0())? true: false;
       TextElementViewModel k = obj.this$0.K;
       c uoc1 = c.class;
       if (PatchProxy.isSupport(uoc1)) {
          Object[] objArray = new Object[]{obj1,Boolean.valueOf(h),str,Float.valueOf(textElementV),Boolean.valueOf(b1),Boolean.valueOf(b2),k};
          if (PatchProxy.applyVoid(objArray, uoc, uoc1, "3")) {
          label_03b6 :
             return uoc;
          }
       }
       a.p(obj1, "editTextDraftData");
       a.p(str, "lastSelectFont");
       StickerResult result1 = p0.a().getResult();
       a.o(result1, "stickerResult");
       TimeRange range = result1.getRange();
       TextConfigParam textConfigPa1 = d.i(d.f(p0.a().getFeatureId()), b2);
       String authorText = p0.a().getAuthorText();
       a.o(authorText, "editTextDraftData.draftText.authorText");
       Text text = (authorText.length() > 0)? 1: null;
       String str1 = "";
       authorText = (text)? p0.a().getAuthorText(): str1;
       String timeText = p0.a().getTimeText();
       a.o(timeText, "editTextDraftData.draftText.timeText");
       Text text1 = (timeText.length() > 0)? 1: null;
       timeText = (text1)? p0.a().getTimeText(): str1;
       String locationText = p0.a().getLocationText();
       a.o(locationText, "editTextDraftData.draftText.locationText");
       Text text2 = (locationText.length() > 0)? 1: null;
       if (text2) {
          str1 = p0.a().getLocationText();
       }
       if (p0.a().hasCustomTextStyle()) {
          CustomTextStyle customTextSt = p0.a().getCustomTextStyle();
          a.o(customTextSt, "editTextDraftData.draftText.customTextStyle");
          textStyleVal = new TextStyleValue(customTextSt);
          i = (!textConfigPa1.g())? true: false;
          textStyleVal.i = i;
       }else {
          textStyleVal = TextStyleValue.a(textConfigPa1.i().l(), 0, null, null, null, null, 0, null, false, 255, null);
       }
       uoc.a.D0(textStyleVal);
       String contentFontN = p0.a().getContentFontName();
       a.o(contentFontN, "editTextDraftData.draftText.contentFontName");
       contentFontN = (contentFontN.length() > 0)? 1: null;
       if (contentFontN) {
          str = p0.a().getContentFontName();
       }
       a.o(str, "fontName");
       a.o(authorText, "authorText");
       a.o(timeText, "timeText");
       a.o(str1, "locationText");
       uoc.a.G0(TextConfigParam.c(textConfigPa1, null, 0, null, 0, 0, 0, 0, 0, 0, 0, TextDrawConfigParam.b(textConfigPa1.i(), 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, FontLineSpaceManager.a(str), 0, 0, timeText, authorText, str1, str, false, 0, 0, 0, 0, 0, null, null, 0x3fc37ff, null), 1023, 0));
       StickerResult result2 = p0.a().getResult();
       a.o(result2, "editTextDraftData.draftText.result");
       float viewScale = result2.getViewScale();
       obj = result1.getIdentifier();
       a.o(obj, "stickerResult.identifier");
       TextElementViewModel textElementV1 = h;
       TimeRange timeRange = range;
       StickerResult stickerResul = result1;
       TextElementViewModel textElementV2 = k;
       h0 oh0 = new h0(result1.getCenterX(), result1.getCenterY(), result1.getScale(), result1.getRotate(), StickerTextValueType.Draft, textElementV, viewScale, obj);
       h0 oh01 = str.b(StickerTextValueType.EditElement);
       if (t.a()) {
          CropOptions cropOptions = obj1.c.getCropOptions();
          a.o(cropOptions, "editTextDraftData.assetSegment.cropOptions");
          Transform transform = cropOptions.getTransform();
          a.o(transform, "editTextDraftData.assetS¡­ent.cropOptions.transform");
          oh01.l((- (float)transform.getRotate()));
       }
       uoc.a.Y(oh01.g());
       uoc.a.Z(oh01.h());
       uoc.a.b0(oh01.j());
       uoc.a.U(oh01.d());
       uoc.a.K(oh01.c());
       uoc.a.a0(oh01.i());
       uoc.a.W(oh01.f());
       a.o(timeRange, "timeRange");
       uoc.a.x0(timeRange.getStart());
       uoc.a.q0(timeRange.getDuration());
       uoc.a.v0(stickerResul.getZIndex());
       uoc.a.J = (int)stickerResul.getResourceWidth();
       uoc.a.K = (int)stickerResul.getResourceHeight();
       a = uoc.a;
       if (b1) {
          i4 = 4096;
       }else if(textElementV1 != null){
          i4 = 1;
       }else if(p0.a().getParameterCase() == Text$ParameterCase.SUBTITLE_EXTRA_PARAM){
          i4 = 256;
       }else {
          i4 = 16;
       }
       a.E0(i4);
       if (textElementV2 != null) {
          if (p0.a(textElementV2)) {
             uoc.a.E0(0x10000);
          }
          Object[] objArray1 = new Object[0];
          a.D().w("EditTextElementUiData", "update source:"+textElementV2, objArray1);
       }
       obj = p0.a().getText();
       a.o(obj, "editTextDraftData.draftText.text");
       uoc.b = obj;
       goto label_03b6 ;
    }
}
