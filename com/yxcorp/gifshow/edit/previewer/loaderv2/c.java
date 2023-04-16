package com.yxcorp.gifshow.edit.previewer.loaderv2.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import haa.a;
import raa.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Text;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.nano.Minecraft$KSCompTextClip;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextInfoModel;
import pba.b;
import wba.a;
import java.lang.Double;
import kotlin.jvm.internal.a;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextResource;
import wba.r;
import com.kwai.video.minecraft.model.nano.Minecraft$TextResource;
import java.util.List;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextLayerInfoModel;
import com.kwai.video.minecraft.model.nano.Minecraft$CompTextLayerInfoModel;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;
import com.kwai.video.minecraft.model.nano.Minecraft$TextInfoModel;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$Stroke;
import com.kwai.video.minecraft.model.nano.Minecraft$TextStroke;
import java.util.Objects;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$Shift;
import com.kwai.video.minecraft.model.nano.Minecraft$Shift;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$AutoWrap;
import com.kwai.video.minecraft.model.nano.Minecraft$AutoWrap;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$AnimationInfoModel;
import com.kwai.video.minecraft.model.nano.Minecraft$AnimationInfoModel;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$VideoEffectModel;
import com.kwai.video.minecraft.model.nano.Minecraft$VideoEffectModel;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame;
import com.yxcorp.gifshow.edit.previewer.loaderv2.b;
import com.kwai.video.minecraft.model.Timeline$FontResolveHandler;

public class c extends a	// class@001b37
{
    public a h;
    public g i;
    public final ArrayList j;

    public void c(){
       super();
       this.j = new ArrayList();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       this.h = a.r(this.a);
       this.i = a.s(this.a);
       return;
    }
    public void d(){
       int b;
       c uoc2;
       Object[] objArray1;
       String str1;
       int i;
       int i1;
       Object[] objArray2;
       Text text2;
       StickerResult stickerResul;
       double d2;
       String str3;
       Minecraft$TextInfoModel obj3;
       boolean b2;
       ArrayList uArrayList1;
       Minecraft$CompTextLayerInfoModel uCompTextLay;
       String str7;
       String str8;
       boolean b3;
       ArrayList uArrayList2;
       Object obj4;
       a a;
       c uoc = this;
       c uoc1 = c.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, uoc, uoc1, str)) {
          return;
       }
       uoc.j.clear();
       String obj = PatchProxy.apply(objArray, uoc, uoc1, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(uoc.h.E() || uoc.h.v() == null){
          uoc.b.setCompTextClips(objArray);
          b = 1;
       }else {
          b = 0;
          int i3 = 0;
          while (b < uoc.h.p()) {
             if (uoc.h.y(b).hasCompTextIndoModel()) {
                i3 = 1;
             }
             b = b + 1;
          }
          b = i3 ^ 0x01;
       }
       if (b) {
          this.h();
          return;
       }else {
          b = 0;
          while (b < uoc.h.p()) {
             Text text = uoc.h.y(b);
             StickerResult obj1 = PatchProxy.applyOneRefs(text, uoc, uoc1, "3");
             if (obj1 != PatchProxyResult.class) {
                uoc2 = uoc1;
                objArray1 = objArray;
                str1 = str;
                i = b;
                i1 = 1;
             }else {
                obj1 = text.getResult();
                double start = obj1.getRange().getStart();
                CommonDraftTextAssetModel$CompTextInfoModel compTextIndo = text.getCompTextIndoModel();
                b uob = new b(uoc);
                String text1 = text.getText();
                double d = obj1.getRange().getDuration() + start;
                double d1 = (double)text.getResult().getScale();
                boolean b1 = text.hasSubtitleExtraParam();
                uoc2 = uoc1;
                a uoa = a.class;
                i = b;
                b = 5;
                if (PatchProxy.isSupport(uoa)) {
                   objArray2 = new Object[b];
                   objArray2[0] = compTextIndo;
                   objArray2[1] = uob;
                   objArray2[2] = text1;
                   objArray2[3] = Double.valueOf(d1);
                   objArray2[4] = Boolean.valueOf(b1);
                   Minecraft$PropertyKeyFrame[] obj2 = PatchProxy.apply(objArray2, null, uoa, str);
                   if (obj2 != PatchProxyResult.class) {
                      str1 = str;
                      text2 = text;
                      stickerResul = obj1;
                      d2 = start;
                      text1 = 0;
                      obj1 = obj2;
                   label_0485 :
                      obj1.setClipId(String.valueOf(stickerResul.getZIndex()));
                      obj1.setFreezeFrame(text2.getResult().getDisableRotate());
                      obj1.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(d2), RationalTime.fromSeconds(d)));
                      obj2 = new Minecraft$PropertyKeyFrame[text2.getPropertyKeyFramesCount()];
                      for (int i2 = 0; i2 < text2.getPropertyKeyFramesCount(); i2 = i2 + 1) {
                         text = text2;
                         obj2[i2] = a.d(text.getPropertyKeyFrames(i2), (double)text.getResult().getScale());
                      }
                      obj1.setPropertyKeyFrames(obj2);
                   }
                }
                a.p(compTextIndo, "$this$toProjectKSCompTextClip");
                String str2 = "filePathSupplier";
                a.p(uob, str2);
                obj = "inputText";
                a.p(text1, obj);
                str1 = str;
                Minecraft$KSCompTextClip kSCompTextCl = new Minecraft$KSCompTextClip();
                if (compTextIndo.hasResource()) {
                   str3 = text1;
                   CommonDraftTextAssetModel$TextResource resource = compTextIndo.getResource();
                   d2 = start;
                   a.o(resource, "this.resource");
                   kSCompTextCl.setResource(a.e(resource, uob));
                }else {
                   str3 = text1;
                   d2 = start;
                }
                List layerInfosLi = compTextIndo.getLayerInfosList();
                a.o(layerInfosLi, "this.layerInfosList");
                ArrayList uArrayList = new ArrayList(u.Y(layerInfosLi, 10));
                Iterator iterator = layerInfosLi.iterator();
                String str4 = 1;
                String str5 = "null cannot be cast to non-null type kotlin.Array<T>";
                while (iterator.hasNext()) {
                   Iterator iterator1 = iterator;
                   obj3 = iterator.next();
                   text2 = text;
                   String str6 = "it";
                   a.o(obj3, str6);
                   if (!obj3.getIsLock() && str4 != null) {
                      str4 = str3;
                      b2 = false;
                   }else {
                      b2 = str4;
                      str4 = "";
                   }
                   Minecraft$KSCompTextClip kSCompTextCl1 = kSCompTextCl;
                   if (PatchProxy.isSupport(uoa)) {
                      stickerResul = obj1;
                      Object[] objArray3 = new Object[]{obj3,uob,str4,Double.valueOf(d1),Boolean.valueOf(b1)};
                      uArrayList1 = uArrayList;
                      uCompTextLay = PatchProxy.apply(objArray3, null, uoa, "4");
                      if (uCompTextLay != PatchProxyResult.class) {
                         str7 = str2;
                         str8 = obj;
                         b3 = b1;
                         uArrayList2 = uArrayList1;
                         i1 = 1;
                      label_0451 :
                         uArrayList2.add(uCompTextLay);
                         uArrayList = uArrayList2;
                         text = text2;
                         iterator = iterator1;
                         str4 = b2;
                         obj1 = stickerResul;
                         kSCompTextCl = kSCompTextCl1;
                         b1 = b3;
                         str2 = str7;
                         obj = str8;
                         str5 = 10;
                      }
                   }else {
                      stickerResul = obj1;
                      uArrayList1 = uArrayList;
                   }
                   a.p(obj3, "$this$toProjectCompTextLayerInfoModel");
                   a.p(uob, str2);
                   a.p(str4, obj);
                   uCompTextLay = new Minecraft$CompTextLayerInfoModel();
                   if (obj3.hasTextInfo()) {
                      CommonDraftTextAssetModel$TextInfoModel textInfo = obj3.getTextInfo();
                      a.o(textInfo, "this.textInfo");
                      obj4 = obj3;
                      if (PatchProxy.isSupport(uoa)) {
                         objArray1 = new Object[]{textInfo,uob,str4,Double.valueOf(d1),Boolean.valueOf(b1)};
                         b3 = b1;
                         obj3 = PatchProxy.apply(objArray1, null, uoa, "5");
                         if (obj3 != PatchProxyResult.class) {
                            str7 = str2;
                            str8 = obj;
                         }else {
                         label_020e :
                            a.p(textInfo, "$this$toProjectTextInfoModel");
                            a.p(uob, str2);
                            a.p(str4, obj);
                            obj3 = new Minecraft$TextInfoModel();
                            String str9 = (str4.length() > 0)? 1: null;
                            if (!str9) {
                               str4 = textInfo.getText();
                            }
                            obj3.setText(str4);
                            str9 = textInfo.getFontId();
                            a.o(str9, "this.fontId");
                            str9 = uob.get(str9);
                            str7 = str2;
                            str8 = obj;
                            Object[] objArray4 = new Object[0];
                            f.D().w("AeDraftUtils", "toProjectTextInfoModel fontId:"+str9+", showText:"+str4, objArray4);
                            obj3.setTextColor(textInfo.getTextColor());
                            obj3.setFontId(str9);
                            obj3.setAlignType(textInfo.getAlignType());
                            obj3.setShadowColor(textInfo.getShadowColor());
                            obj3.setShadowIntensity(textInfo.getShadowIntensity());
                            obj3.setFillBackgroundColor(textInfo.getFillBackgroundColor());
                            obj3.setFillBackgroundAlpha(a.a.a(textInfo.getFillBackgroundAlpha()));
                            obj3.setFlowerWordId(textInfo.getFlowerWordId());
                            obj3.setTextColorAlpha(textInfo.getTextColorAlpha());
                            List strokeList = textInfo.getStrokeList();
                            a.o(strokeList, "this.strokeList");
                            ArrayList uArrayList3 = new ArrayList(u.Y(strokeList, 10));
                            Iterator iterator2 = strokeList.iterator();
                            while (iterator2.hasNext()) {
                               CommonDraftBaseAssetModel$Stroke stroke = iterator2.next();
                               a.o(stroke, str6);
                               Minecraft$TextStroke textStroke = PatchProxy.applyOneRefs(stroke, null, uoa, "6");
                               if (textStroke != PatchProxyResult.class) {
                               }else {
                                  a.p(stroke, "$this$toProjectTextStroke");
                                  textStroke = new Minecraft$TextStroke();
                                  textStroke.setColor(stroke.getColor());
                                  textStroke.setWidth(stroke.getWidth());
                               }
                               uArrayList3.add(textStroke);
                               textStroke = 10;
                            }
                            Minecraft$TextStroke[] textStrokeAr = new Minecraft$TextStroke[0];
                            objArray2 = uArrayList3.toArray(textStrokeAr);
                            Objects.requireNonNull(objArray2, str5);
                            obj3.setStroke(objArray2);
                            obj3.setScale(textInfo.getScale());
                            a = a.a;
                            double letterSpace = textInfo.getLetterSpace();
                            a.b(letterSpace);
                            obj3.setLetterSpace(letterSpace);
                            obj3.setLineSpace(textInfo.getLineSpace());
                            obj3.setShadowAlpha(a.a(textInfo.getShadowAlpha()));
                            if (textInfo.hasShadowShift()) {
                               CommonDraftBaseAssetModel$Shift shadowShift = textInfo.getShadowShift();
                               a.o(shadowShift, "this.shadowShift");
                               Minecraft$Shift shift = PatchProxy.applyOneRefs(shadowShift, null, uoa, "7");
                               if (shift != PatchProxyResult.class) {
                               }else {
                                  a.p(shadowShift, "$this$toProjectShift");
                                  shift = new Minecraft$Shift();
                                  shift.setX(shadowShift.getX());
                                  shift.setY(shadowShift.getY());
                               }
                               obj3.setShadowShift(shift);
                            }
                            obj3.setShadowAngle(textInfo.getShadowAngle());
                            obj3.setEffectSourcePath(textInfo.getEffectSourcePath());
                            obj3.setEffectType(textInfo.getEffectType());
                            obj3.setThickness(textInfo.getThickness());
                            obj3.setItalic(textInfo.getItalic());
                            obj3.setUnderline(textInfo.getUnderline());
                            if (textInfo.hasAutoWrap()) {
                               CommonDraftTextAssetModel$AutoWrap autoWrap = textInfo.getAutoWrap();
                               a.o(autoWrap, "this.autoWrap");
                               Minecraft$AutoWrap uAutoWrap = PatchProxy.applyOneRefs(autoWrap, null, uoa, "8");
                               if (uAutoWrap != PatchProxyResult.class) {
                               }else {
                                  a.p(autoWrap, "$this$toProjectAutoWrap");
                                  uAutoWrap = new Minecraft$AutoWrap();
                                  uAutoWrap.setHadAdjustMaxWidth(autoWrap.getHadAdjustMaxWidth());
                                  uAutoWrap.setCurrentScale(autoWrap.getCurrentScale());
                                  uAutoWrap.setDocWidth(autoWrap.getDocWidth());
                               }
                               obj3.setAutoWrap(uAutoWrap);
                            }
                         }
                      }else {
                         b3 = b1;
                         i1 = 1;
                         goto label_020e ;
                      }
                      uCompTextLay.setTextInfo(obj3);
                   }else {
                      str7 = str2;
                      str8 = obj;
                      obj4 = obj3;
                      b3 = b1;
                      i1 = 1;
                   }
                   if (obj4.hasAnimationInfo()) {
                      CommonDraftTextAssetModel$AnimationInfoModel animationInf = obj4.getAnimationInfo();
                      a.o(animationInf, "this.animationInfo");
                      Minecraft$AnimationInfoModel uAnimationIn = PatchProxy.applyOneRefs(animationInf, null, uoa, "9");
                      if (uAnimationIn != PatchProxyResult.class) {
                      }else {
                         a.p(animationInf, "$this$toProjectAnimationInfoModel");
                         uAnimationIn = new Minecraft$AnimationInfoModel();
                         CommonDraftBaseAssetModel$VideoEffectModel subInEffect = animationInf.getSubInEffect();
                         a.o(subInEffect, "this.subInEffect");
                         uAnimationIn.setSubInEffect(a.f(subInEffect));
                         subInEffect = animationInf.getSubOutEffect();
                         a.o(subInEffect, "this.subOutEffect");
                         uAnimationIn.setSubOutEffect(a.f(subInEffect));
                         CommonDraftBaseAssetModel$VideoEffectModel subRepeatEff = animationInf.getSubRepeatEffect();
                         a.o(subRepeatEff, "this.subRepeatEffect");
                         uAnimationIn.setSubRepeatEffect(a.f(subRepeatEff));
                      }
                      uCompTextLay.setAnimationInfo(uAnimationIn);
                   }else {
                      iterator = null;
                   }
                   uCompTextLay.setIsLock(obj4.getIsLock());
                   if (obj4.hasFlowerResource()) {
                      CommonDraftTextAssetModel$TextResource flowerResour = obj4.getFlowerResource();
                      a.o(flowerResour, "this.flowerResource");
                      uCompTextLay.setFlowerResource(a.e(flowerResour, uob));
                   }
                   uArrayList2 = uArrayList1;
                   goto label_0451 ;
                }
                text2 = text;
                stickerResul = obj1;
                obj3 = 0;
                Minecraft$CompTextLayerInfoModel[] uCompTextLay1 = new Minecraft$CompTextLayerInfoModel[0];
                objArray2 = uArrayList.toArray(uCompTextLay1);
                Objects.requireNonNull(objArray2, str5);
                Minecraft$KSCompTextClip kSCompTextCl2 = kSCompTextCl;
                kSCompTextCl2.setLayerInfos(objArray2);
                obj1 = kSCompTextCl2;
                goto label_0485 ;
             }
             uoc = this;
             if (obj1 != null) {
                uoc.j.add(obj1);
             }
             b = i + 1;
             objArray = objArray1;
             uoc1 = uoc2;
             str = str1;
             objArray1 = 1;
          }
          this.h();
          return;
       }
    }
    public int g(){
       return 1;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.b.setCompTextClips(this.j);
       this.b.setDisableSubtitleAutoWrap(false);
       this.b.setSubtitleRangeRatio(0);
       this.b.setDisableSubtitleAttributeOverride(true);
       this.b.setFontResolveHandler(b.a);
       return;
    }
}
