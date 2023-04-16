package com.yxcorp.gifshow.edit.previewer.loaderv2.q;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import vaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.Workspace$Type;
import haa.f;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;
import com.kwai.robust.PatchProxyResult;
import uba.d;
import java.lang.Boolean;
import android.util.Pair;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import java.io.File;
import com.kuaishou.edit.draft.Kuaishan$TemplateType;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.List;
import rk7.a;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.edit.draft.KuaishanAsset;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.StickerResult;
import rk7.a$a;
import java.util.Collection;
import com.kuaishou.edit.draft.SparkResInfo;
import com.kwai.feature.post.api.feature.kuaishan.model.SparkExternalResInfo;
import sba.j;
import sba.g;
import sba.g$a;
import com.kuaishou.edit.draft.FeatureId;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.PreviewLoaderException;
import com.kwai.video.clipkit.error.EditorSdk2MvCreationException;
import java.lang.Exception;
import java.lang.CharSequence;
import haa.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;

public class q extends a	// class@001b49
{
    public a h;
    public a i;
    public KwaiMvParam j;
    public AE2Project k;
    public String l;
    public String m;
    public EditorSdk2MvCreationResult n;
    public String o;

    public void q(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "1")) {
          return;
       }
       this.i = this.a.g1();
       this.h = this.a.F0();
       return;
    }
    public void d(){
       a f;
       Object[] objArray2;
       Boolean fALSE;
       object oobject;
       Pair pair;
       Kuaishan kuaishan1;
       List assetsList;
       String str4;
       ArrayList uArrayList;
       String str5;
       boolean b;
       Object obj1;
       File uFile2;
       List list;
       ArrayList uArrayList1;
       Iterator iterator;
       a uoa3;
       ArrayList uArrayList5;
       String str10;
       Object[] obj = this;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, obj, q.class, str)) {
          return;
       }
       Kuaishan kuaishan = obj.h.v();
       String str1 = "Kuaishan is null";
       boolean i = 0;
       if (kuaishan == null) {
          if (obj.a.a1() == Workspace$Type.KUAISHAN) {
             if (obj.a.b1() != Workspace$Type.UNKNOWN) {
                Object[] objArray1 = new Object[i];
                f.D().A("KuaishanLoader", "load: type kuaiShan,but message is null", objArray1);
                obj.a.k().t(obj.a.b1());
             }else {
                throw new PreviewLoaderException(str1);
             }
          }
          obj.j = objArray;
          obj.l = objArray;
          obj.m = objArray;
          obj.n = objArray;
          obj.o = objArray;
          return;
       }else {
          f = obj.f;
          a a = obj.a;
          q h = obj.h;
          a d = obj.d;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          d uod = d.class;
          String str2 = "2";
          int i1 = 3;
          int i2 = 4;
          int i3 = 1;
          int i4 = 2;
          if (PatchProxy.isSupport(uod)) {
             objArray2 = new Object[]{Boolean.valueOf(f),a,h,d,fALSE,oobject,fALSE};
             fALSE = Boolean.FALSE;
             oobject = null;
             pair = PatchProxy.apply(objArray2, oobject, uod, str2);
             if (pair != patchProxyRe) {
                kuaishan1 = kuaishan;
             label_03c3 :
                Pair first = pair.first;
                a uoa = this;
                uoa.m = pair.second;
                uoa.l = kuaishan1.getExtraInfo();
                uoa.n = first;
                uoa.j = first.getMVParam();
                uoa.k = first.getAE2Project();
                uoa.o = kuaishan1.getFeatureId().getExternal();
                d.c(uoa.a, uoa.h, first, uoa.d, uoa.f);
                uoa.b = first.getProject().clone();
                return;
             }
          }
          Object[] objArray3 = new Object[i];
          String str3 = "KuaishanLoaderUtils";
          f.D().w(str3, "generateKuaishanTemplateResult loaderHasInited:"+f+",isParseToAE2Project:"+i, objArray3);
          GeneratedMessageLite generatedMes = h.v();
          if (generatedMes != null) {
             str1 = generatedMes.getExtraInfo();
             File uFile = d.c(BizCache.EffectiveFile).g(new Pair(generatedMes.getTemplateDirectory(), h));
             kuaishan1 = kuaishan;
             Object[] objArray4 = new Object[0];
             f.D().w(str3, "generateKuaishanTemplateResult templateInfo:"+str1+",templateFile:"+uFile, objArray4);
             if (uFile != null) {
                String absolutePath = uFile.getAbsolutePath();
                i = (generatedMes.getTemplateType() == Kuaishan$TemplateType.SHIMMER)? true: false;
                File uFile1 = uFile;
                i2 = 0;
                obj = new Object[i2];
                f.D().w(str3, "generateKuaishanTemplateResult templateFolderPath:"+absolutePath+",isShimmer:"+i, obj);
                if (DraftUtils.P(a)) {
                   assetsList = generatedMes.getAssetsList();
                   a uoa1 = a.class;
                   if (PatchProxy.isSupport(uod)) {
                      objArray2 = new Object[]{Boolean.valueOf(f),h,assetsList,a,d};
                      str4 = null;
                      uArrayList = PatchProxy.apply(objArray2, str4, uod, "11");
                      if (uArrayList != patchProxyRe) {
                         str5 = absolutePath;
                         b = i;
                         obj1 = str4;
                         uFile2 = uFile1;
                      label_030c :
                         list = uArrayList;
                         uArrayList1 = obj1;
                      }
                   }else {
                      str4 = null;
                   }
                   ArrayList uArrayList2 = new ArrayList();
                   iterator = assetsList.iterator();
                   while (iterator.hasNext()) {
                      a obj2 = iterator.next();
                      try{
                         uoa3 = new a();
                         uoa3.e(Integer.parseInt(obj2.getGroupId()));
                      }catch(java.lang.NumberFormatException e0){
                         uoa3.e(-1);
                         str4 = "ksAsset.groupId format wrong";
                         PostUtils.D(str3, str4, new IllegalArgumentException(str4));
                      }
                      String assetTag = obj2.getAssetTag();
                      Iterator iterator1 = iterator;
                      String str6 = "<set-?>";
                      if (!PatchProxy.applyVoidOneRefs(assetTag, uoa3, uoa1, "1")) {
                         a.p(assetTag, str6);
                         uoa3.d = assetTag;
                      }
                      ArrayList uArrayList3 = uArrayList2;
                      uoa3.d(obj2.getDuration());
                      assetTag = obj2.getThemeType();
                      if (!PatchProxy.applyVoidOneRefs(assetTag, uoa3, uoa1, str2)) {
                         a.p(assetTag, str6);
                         uoa3.e = assetTag;
                      }
                      assetTag = obj2.getAssetDecorationText();
                      if (!PatchProxy.applyVoidOneRefs(assetTag, uoa3, uoa1, "4")) {
                         a.p(assetTag, str6);
                         uoa3.g = assetTag;
                      }
                      str4 = obj2.getAssetDecorationPath();
                      String str7 = str4;
                      str5 = e0;
                      b = i;
                      String str8 = uoa3;
                      uFile2 = uFile1;
                      obj1 = null;
                      ArrayList uArrayList4 = uArrayList3;
                      absolutePath = str4;
                      String str9 = str2;
                      a uoa4 = f;
                      PatchProxyResult patchProxyRe1 = patchProxyRe;
                      File uFile3 = PatchProxy.applyThreeRefs(h, str7, d, null, d.class, "10");
                      if (uFile3 != patchProxyRe1) {
                      }else {
                         uFile3 = d.c(BizCache.EffectiveFile).g(new Pair(absolutePath, h));
                         if (uFile3 == null) {
                            objArray3 = new Object[0];
                            f.D().A(str3, "Invalid assetDecoration file "+absolutePath, objArray3);
                         }
                      }
                      if (uFile3 != null) {
                         absolutePath = uFile3.getAbsolutePath();
                         if (!PatchProxy.applyVoidOneRefs(absolutePath, str8, uoa1, str)) {
                            a.p(absolutePath, str6);
                            str8.f = absolutePath;
                         }
                      }
                      uArrayList5 = new ArrayList();
                      a uoa5 = uoa4;
                      File uFile4 = d.b(h, obj2.getResult(), a, d, uoa5);
                      if (uFile4 != null) {
                         uArrayList5.add(new a$a(uFile4.getAbsolutePath(), (int)obj2.getOriginWidth(), (int)obj2.getOriginHeight(), obj2.getAssetId()));
                      }
                      iterator = obj2.getSubAssetsList().iterator();
                      while (iterator.hasNext()) {
                         KuaishanAsset kuaishanAsse = iterator.next();
                         File uFile5 = d.b(h, kuaishanAsse.getResult(), a, d, uoa5);
                         if (uFile5 != null) {
                            str10 = str;
                            obj2 = uoa1;
                            uArrayList5.add(new a$a(uFile5.getAbsolutePath(), (int)kuaishanAsse.getOriginWidth(), (int)kuaishanAsse.getOriginHeight(), kuaishanAsse.getAssetId()));
                         }else {
                            str10 = str;
                            obj2 = uoa1;
                         }
                         str = str10;
                         uoa1 = obj2;
                      }
                      str10 = str;
                      obj2 = uoa1;
                      str8.c().addAll(uArrayList5);
                      if (uArrayList5.size() > 2) {
                         str8.d(8.00f);
                      }
                      uArrayList5 = uArrayList4;
                      uArrayList5.add(str8);
                      uArrayList2 = uArrayList5;
                      str = str10;
                      uoa1 = obj2;
                      uFile1 = uFile2;
                      iterator = iterator1;
                      i = b;
                      str2 = str9;
                      str4 = obj1;
                      absolutePath = str5;
                      patchProxyRe = patchProxyRe1;
                      f = uoa5;
                   }
                   str5 = absolutePath;
                   b = i;
                   obj1 = str4;
                   uFile2 = uFile1;
                   uArrayList = uArrayList2;
                   goto label_030c ;
                }else {
                   str5 = absolutePath;
                   b = i;
                   uFile2 = uFile1;
                   boolean b1 = false;
                   uArrayList5 = new ArrayList();
                   iterator = generatedMes.getSparkResInfoListList().iterator();
                   while (iterator.hasNext()) {
                      SparkResInfo sparkResInfo = iterator.next();
                      File uFile6 = d.c(BizCache.EffectiveFile).g(new Pair(sparkResInfo.getResPath(), h));
                      if (uFile6 == null || !uFile6.exists()) {
                         continue ;
                      }
                      SparkExternalResInfo sparkExterna = new SparkExternalResInfo();
                      sparkExterna.resId = sparkResInfo.getResId();
                      sparkExterna.resPath = uFile6.getAbsolutePath();
                      uArrayList5.add(sparkExterna);
                   }
                   if (d.c(BizCache.KuaishanResourceCheckResult).e(new Pair(str1, uFile2.getAbsolutePath())).booleanValue()) {
                      uArrayList1 = uArrayList5;
                      list = b1;
                   }else {
                      throw new PreviewLoaderException("Kuaishan template resource or templatefile is not ok");
                   }
                }
                try{
                   g$a uoa2 = new g$a(uFile2.getAbsolutePath(), generatedMes.getFeatureId().getExternal(), b, null, list, uArrayList1, false, null, generatedMes.getTemplateGrade());
                   EditorSdk2MvCreationResult uEditorSdk2M = d.c(BizCache.EditorSdk2MvCreationResult).e(assetsList);
                   if (uEditorSdk2M != null && uEditorSdk2M.getProject() != null) {
                      pair = new Pair(uEditorSdk2M, str5);
                      goto label_03c3 ;
                   }else {
                      throw new PreviewLoaderException("Failed to load kuaishan template file "+uFile2.getAbsolutePath());
                   }
                }catch(java.lang.Exception e0){
                   if (e0 instanceof EditorSdk2MvCreationException && (e0.getMessage() != null && (e0.getMessage()).contains("Error parsing settings.json"))) {
                      Object[] objArray5 = new Object[0];
                      f.D().A(str3, "KuaishanSpark", objArray5);
                   }
                label_0445 :
                   throw e0;
                }
             }else {
                throw new PreviewLoaderException("Kuaishan template file not found");
             }
          }else {
             throw new PreviewLoaderException(str1);
          }
       }
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "2")) {
          return;
       }
       if (a.m(p1).v() != null) {
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
          p0.setAudioAssets(uAudioAssetA);
       }
       return;
    }
    public int g(){
       return 1;
    }
}
