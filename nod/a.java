package nod.a;
import im8.g;
import xwc.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Runnable;
import jaa.d;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Text;
import faa.a;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.FeatureId;
import q87.c;
import nod.a$a;
import io.reactivex.g;
import brd.t;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import ood.d;
import java.util.Objects;
import bod.a;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import d0c.a;
import nod.b;
import w46.b;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import xod.d;
import ood.b;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import com.kuaishou.edit.draft.StickerResult;
import xod.c;
import hba.a;
import wba.r;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextResource$a;
import com.kuaishou.edit.draft.TimeRange;
import xod.b;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextInfoModel$a;
import com.kuaishou.edit.draft.FeatureId$b;
import nuc.a;
import com.kuaishou.edit.draft.SubtitleExtraParam$b;
import com.kuaishou.edit.draft.SubtitleExtraParam;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame$a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform$a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform;
import wba.a;
import com.kuaishou.edit.draft.TextExtraParam$b;
import com.kuaishou.edit.draft.TextExtraParam;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel$a;
import com.kuaishou.edit.draft.CustomTextStyle;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;
import nod.c;
import java.util.Map;

public class a extends a implements g	// class@001e98
{
    public final d c;
    public c d;
    public a e;
    public boolean f;
    public final TextTemplateRepoV3 g;
    public List h;
    public Runnable i;
    public static HashMap j;

    static {
       HashMap hashMap = new HashMap();
       a.j = hashMap;
       hashMap.put("20201201_black_shadow", "608643");
       a.j.put("20201201_blue_purple_shadow", "608652");
       a.j.put("20201201_pink_border", "608654");
       a.j.put("20201201_purple_shadow", "603201");
       a.j.put("20201201_yellow_pink_border", "608628");
       a.j.put("20201201_yellow_red_shadow", "569636");
       a.j.put("20201230_black", "608682");
       a.j.put("20201230_white", "608681");
       a.j.put("20201230_yellow", "608623");
       a.j.put("20220909_yellow_black_shadow", "607201");
       a.j.put("20220909_yellow_red_shadow", "607207");
       a.j.put("20220914_orange", "607207");
       a.j.put("20220914_yellow", "607201");
       a.j.put("border_01", "608663");
       a.j.put("border_02", "608661");
       a.j.put("border_03", "608674");
       a.j.put("border_04", "608668");
       a.j.put("border_05", "608651");
       a.j.put("border_06", "603186");
       a.j.put("border_07", "608671");
       a.j.put("border_08", "608669");
       a.j.put("border_09", "608672");
       a.j.put("border_10", "608667");
       a.j.put("border_11", "608641");
       a.j.put("border_12", "576475");
       a.j.put("border_13", "608635");
       a.j.put("border_14", "603171");
       a.j.put("border_15", "608664");
       a.j.put("gradient_text0", "608681");
       a.j.put("gradient_text1", "608640");
       a.j.put("gradient_text2", "605977");
       a.j.put("gradient_text3", "603191");
       a.j.put("shadow_01", "607141");
       a.j.put("shadow_02", "607194");
       a.j.put("yellow_05", "608651");
    }
    public void a(Runnable p0){
       super();
       this.c = new d(2, 9, 55);
       this.f = false;
       this.g = new TextTemplateRepoV3("DESIGN_FONT_TEMPLATE", new TextFontRepoV3());
       this.h = new ArrayList();
       this.i = p0;
    }
    public void N(){
       a$a uoa;
       List list = this;
       if (PatchProxy.applyVoid(null, list, a.class, "1")) {
          return;
       }
       int i = 0;
       while (true) {
          if (i < list.e.p()) {
             Text text = list.e.y(i);
             if (!text.hasCompTextIndoModel()) {
                Object[] objArray = new Object[0];
                a.D().w("EditLoadNewAETextTask", "downloadNewTextData can not migrate:"+text.getFeatureId().getExternal(), objArray);
                uoa = 1;
             label_0050 :
                if (!uoa) {
                   break ;
                }else {
                   list.h = t.create(new a$a(list)).blockingLast();
                   Object[] objArray1 = new Object[0];
                   a.D().w("EditLoadNewAETextTask", "runTask designTextList loaded", objArray1);
                   int i1 = 0;
                   while (i1 < list.e.p()) {
                      GeneratedMessageLite generatedMes = list.e.y(i1);
                      if (generatedMes.hasCompTextIndoModel()) {
                         objArray = new Object[0];
                         a.D().w("EditLoadNewAETextTask", "downloadNewTextData can not migrate:"+generatedMes.getFeatureId().getExternal(), objArray);
                      }else {
                         String str = list.Q(generatedMes.getFeatureId().getExternal());
                         objArray = new Object[0];
                         a.D().w("EditLoadNewAETextTask", "runTask migrate oldText:"+generatedMes+" to newText:"+str, objArray);
                         a h = list.h;
                         String contentFontN = generatedMes.getContentFontName();
                         String str1 = contentFontN;
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         String str2 = contentFontN;
                         d uod = PatchProxy.applyThreeRefs(h, str, str1, this, a.class, "3");
                         if (uod != patchProxyRe) {
                         }else {
                            objArray = new Object[0];
                            a.D().w("EditLoadNewAETextTask", "downloadNewTextData migrate textId:"+str+",fontFileName:"+str2, objArray);
                            uod = list.P(h, str);
                            if (uod == null) {
                               objArray1 = new Object[0];
                               a.D().w("EditLoadNewAETextTask", "downloadNewTextData not this template", objArray1);
                               uod = null;
                            }else {
                               a g = list.g;
                               Objects.requireNonNull(g);
                               a uoa2 = PatchProxy.applyOneRefs(str2, g, TextTemplateRepoV3.class, "13");
                               if (uoa2 != patchProxyRe) {
                               }else {
                                  a.p(str2, "fontFileName");
                                  Collection uCollection = g.e.values();
                                  a.o(uCollection, "fontItemMap.values");
                                  Iterator iterator = uCollection.iterator();
                                  uoa2 = null;
                                  while (iterator.hasNext()) {
                                     a uoa3 = iterator.next();
                                     if (a.g(uoa3.b().c(), str2)) {
                                        uoa2 = uoa3;
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                               uod.r(uoa2);
                               Object[] objArray2 = new Object[0];
                               a.D().w("EditLoadNewAETextTask", "downloadNewTextData finded finalResult:"+uod, objArray2);
                               if (uoa2 != null) {
                                  uod.s(uoa2.e());
                               }
                               t.create(new b(list, uod)).blockingLast();
                               Object[] objArray3 = new Object[0];
                               a.D().w("EditLoadNewAETextTask", "downloadNewTextData downloaded finalResult:"+uod, objArray3);
                            }
                         }
                         if (uod == null) {
                            objArray = new Object[0];
                            a.D().t("EditLoadNewAETextTask", "downloadNewTextData can not migrate:"+generatedMes, objArray);
                         }else {
                            list.f = true;
                         label_01dd :
                            i1 = i1 + 1;
                            patchProxyRe = null;
                         }
                      }
                      a uoa1 = 1;
                      goto label_01dd ;
                   }
                   return;
                }
             }else {
                i = i + 1;
             }
          }else {
             uoa = null;
             goto label_0050 ;
          }
       }
       return;
    }
    public boolean O(){
       CommonDraftBaseAssetModel$PropertyKeyFrame$a propertyKeyF;
       CommonDraftBaseAssetModel$AssetTransform$a uAssetTransf;
       a a;
       StickerResult result2;
       Object obj = this;
       Object obj1 = PatchProxy.apply(null, obj, a.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       if (obj.f == null) {
          return false;
       }
       obj.e.c0();
       int i = 0;
       while (i < obj.e.p()) {
          Text text = obj.e.y(i);
          String str = obj.Q(text.getFeatureId().getExternal());
          Object[] objArray = new Object[false];
          String str1 = "EditLoadNewAETextTask";
          a.D().w(str1, "runTaskMain migrate oldText:"+text+" to newText:"+str, objArray);
          d uod = obj.P(obj.h, str);
          if (uod == null) {
             Object[] objArray1 = new Object[false];
             a.D().t(str1, "runTaskMain can not migrate:"+text, objArray1);
          }else {
             Text$b uob = obj.e.n(i);
             a e = obj.e;
             boolean b = text.hasSubtitleExtraParam();
             if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(uod, uob, e, Boolean.valueOf(b), null, d.class, "1")) {
                a.p(uod, "textItem");
                a.p(uob, "textBuilder");
                a.p(e, "textDraft");
                Object[] objArray2 = new Object[false];
                a.D().w("TextTemplateQTToDraftUtilsV3", "oldTextToAE textItem:"+uod+", isSubtitle:"+b, objArray2);
                if (uod.n() != null) {
                   b uob1 = uod.n();
                   a.m(uob1);
                   CommonDraftTextAssetModel$ResourceType resourceType = ((uob1.d()).length() > 0)? 1: null;
                   resourceType = (resourceType)? CommonDraftTextAssetModel$ResourceType.TEMPLATE: CommonDraftTextAssetModel$ResourceType.NONE;
                   StickerResult result = uob.getResult();
                   a.o(result, "textBuilder.result");
                   b uob2 = uod.n();
                   a.m(uob2);
                   StickerResult result1 = uob.getResult();
                   a.o(result1, "textBuilder.result");
                   TimeRange range = result1.getRange();
                   a.o(range, "textBuilder.result.range");
                   double duration = range.getDuration();
                   String str2 = "textBuilder.result";
                   FeatureId$b uob3 = FeatureId.newBuilder();
                   uob3.a(uod.p().m());
                   uob.g(uob3);
                   uob.d(d.b(uod, d.c(result.getZIndex(), uob2.d(), resourceType, new c(e)), duration, new b(e), null));
                   if (b) {
                      uob.l(SubtitleExtraParam.newBuilder());
                      propertyKeyF = CommonDraftBaseAssetModel$PropertyKeyFrame.newBuilder();
                      uAssetTransf = CommonDraftBaseAssetModel$AssetTransform.newBuilder();
                      a = a.a;
                      result2 = uob.getResult();
                      a.o(result2, str2);
                      uAssetTransf.a(a.g(result2.getCenterX()));
                      result2 = uob.getResult();
                      a.o(result2, str2);
                      uAssetTransf.b(a.g(result2.getCenterY()));
                      uAssetTransf.d(0x4011f2df2df2df2e);
                      uAssetTransf.e(0x4011f2df2df2df2e);
                      result1 = uob.getResult();
                      a.o(result1, str2);
                      uAssetTransf.c((double)result1.getRotate());
                      propertyKeyF.a(uAssetTransf);
                      uob.a(propertyKeyF);
                   }else {
                      uob.n(TextExtraParam.newBuilder());
                      propertyKeyF = CommonDraftBaseAssetModel$PropertyKeyFrame.newBuilder();
                      uAssetTransf = CommonDraftBaseAssetModel$AssetTransform.newBuilder();
                      a = a.a;
                      result2 = uob.getResult();
                      a.o(result2, str2);
                      uAssetTransf.a(a.g(result2.getCenterX()));
                      result2 = uob.getResult();
                      a.o(result2, str2);
                      uAssetTransf.b(a.g(result2.getCenterY()));
                      uAssetTransf.d(5.38f);
                      uAssetTransf.e(5.38f);
                      result1 = uob.getResult();
                      a.o(result1, str2);
                      uAssetTransf.c((double)result1.getRotate());
                      propertyKeyF.a(uAssetTransf);
                      uob.a(propertyKeyF);
                   }
                   StickerResult result3 = uob.getResult();
                   a.o(result3, str2);
                   CommonDraftTextAssetModel$TextInfoModel$a textInfoMode = d.f(result3.getZIndex(), e, false, 4, null);
                   a.m(textInfoMode);
                   CustomTextStyle customTextSt = uob.getCustomTextStyle();
                   a.o(customTextSt, "textBuilder.customTextStyle");
                   textInfoMode.a(customTextSt.getTextAlign());
                   textInfoMode.j(uob.instance.getText());
                   GeneratedMessageLite generatedMes = textInfoMode.build();
                   a.o(generatedMes, "textInfoModelBuilder.build\(\)");
                   GeneratedMessageLite generatedMes1 = generatedMes;
                   result3 = uob.getResult();
                   a.o(result3, str2);
                   d.m(generatedMes1, result3.getZIndex(), e, 0, 8, null);
                }
             }
          }
          i = i + 1;
       }
       obj.e.f();
       if (obj.f != null) {
          obj.i.run();
       }
       return false;
    }
    public final d P(List p0,String p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       int i = 0;
       while (i < p0.size()) {
          d uod = p0.get(i);
          if ((uod.b()).equals(p1)) {
             obj = uod;
          }
          i = i + 1;
       }
       return obj;
    }
    public final String Q(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = a.j.get(p0);
       if (p0 == null) {
          p0 = "608681";
       }
       return p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(a.class, new c());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
