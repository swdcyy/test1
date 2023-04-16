package com.yxcorp.gifshow.encode.r;
import erd.a;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.yxcorp.gifshow.encode.EncodeManager$d;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import dq.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$EncodeParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import com.kwai.video.editorsdk2.DeliveryParamsManager;
import com.yxcorp.gifshow.encode.v0;
import android.util.Pair;
import java.lang.Integer;
import mca.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import pca.a0;
import w46.b;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.media.model.DegradeEncodeConfig;
import pca.b0;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.media.model.KtvMvEncodeConfig;
import q46.l;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import com.kwai.feature.post.api.core.model.GSConfig;
import sm6.b;
import com.kwai.video.minecraft.model.nano.Minecraft$Size;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import wba.d0;
import java.lang.Math;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.encode.u;
import java.lang.Runnable;
import ekd.k1;

public final class r implements a	// class@000d49
{
    public final EncodeManager b;
    public final PostEncodeInfo c;
    public final EncodeManager$d d;
    public final EditorSdk2V2$VideoEditorProject e;

    public void r(EncodeManager p0,PostEncodeInfo p1,EncodeManager$d p2,EditorSdk2V2$VideoEditorProject p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       String str;
       EditorSdk2$ExportOptions obj1;
       long l;
       boolean b1;
       String str3;
       boolean i1;
       Pair maxExportSiz;
       int encodeWidth;
       Pair pair;
       Object[] objArray2;
       File uFile1;
       r or = this;
       r b = or.b;
       r c = or.c;
       r d = or.d;
       r e = or.e;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EncodeManager", "encodeInfo.mIsVisionEngineLoadedSuccess is "+c.mIsVisionEngineLoadedSuccess, objArray);
       if (PatchProxy.isSupport(EncodeManager.class)) {
          str = PatchProxy.applyTwoRefs(Boolean.TRUE, c, b, EncodeManager.class, "28");
          if (str != patchProxyRe) {
          label_0042 :
             Object obj = str;
             if (!PatchProxy.applyVoidFourRefs(c, d, e, obj, b, EncodeManager.class, "30")) {
                Object[] objArray1 = new Object[i];
                a.D().w("EncodeManager", "encodeNormalVideoRestPart", objArray1);
                String str1 = 1;
                if (PatchProxy.applyVoidTwoRefs(c, e, b, EncodeManager.class, "24")) {
                   obj1 = null;
                label_01c9 :
                   l = 1;
                }else {
                   String str4 = ",encodeInfo.mIsImport:";
                   String str5 = ",encodeInfo.isKtvMv\(\):";
                   String str6 = ",encodeInfo.isPhotoMovie\(\):";
                   str3 = "setEncodeWH exportSize:";
                   if (b.j().uesDeliveryParamsConfig().booleanValue()) {
                      i1 = patchProxyRe.b(c);
                      if (i1 > 0) {
                         maxExportSiz = b.j().getMaxExportSizeByVideoType(i1);
                         maxExportSiz = a.n(e, maxExportSiz.first.intValue(), maxExportSiz.second.intValue());
                         if (c.useTemplateGrade() && c.getTemplateGrade() > 0) {
                            obj1 = EditorSdk2Utils.getMVExportOptionsNativeOptions(c.getTemplateGrade(), str1);
                            if (obj1 != null && (obj1.height() > 0 && (obj1.width() > 0 && (c.getWidth() > 0 && c.getHeight() > 0)))) {
                               maxExportSiz = a0.d(c.getWidth(), c.getHeight(), obj1.width(), obj1.height());
                            }
                         }
                      label_0181 :
                         c.setEncodedWithHeight(maxExportSiz.first.intValue(), maxExportSiz.second.intValue());
                         objArray = new Object[0];
                         a.D().w("EncodeManager", str3+maxExportSiz+str6+c.isPhotoMovie()+str5+c.isKtvMv()+str4+c.mIsImport, objArray);
                         goto label_01c9 ;
                      }else {
                         objArray1 = new Object[0];
                         a.D().t("EncodeManager", "No matching videoType exists!", objArray1);
                         if (a.d() && SystemUtil.K()) {
                            throw new RuntimeException("非法导出类型，需要联系@zhangpengyu @lihao22");
                         }
                      }
                   }
                   if (c.isTranscodeDegrade()) {
                      DegradeEncodeConfig uDegradeEnco = b0.a();
                      encodeWidth = uDegradeEnco.getEncodeWidth();
                      maxExportSiz = a.n(e, encodeWidth, uDegradeEnco.getEncodeHeight());
                   }else if(c.isSinglePicture() || c.isKtvSinglePicSong()){
                      pair = a.n(e, GSConfig.i(), GSConfig.i());
                      if (d0.q(e)) {
                         c.setEncodedWithHeight(Math.max(pair.first.intValue(), pair.second.intValue()), Math.min(pair.first.intValue(), pair.second.intValue()));
                      }else {
                         c.setEncodedWithHeight(Math.min(pair.first.intValue(), pair.second.intValue()), Math.max(pair.first.intValue(), pair.second.intValue()));
                      }
                      Object[] objArray3 = new Object[0];
                      a.D().w("EncodeManager", "setEncodeWH single pic exportSize:"+pair+",encodeInfo.isSinglePicture\(\):"+c.isSinglePicture(), objArray3);
                   }else if(c.isPhotoMovie() && (!c.mWorkspace.getKuaishan().hasAttributes() && !c.mWorkspace.getAiCutThemesCount())){
                      maxExportSiz = PatchProxy.applyTwoRefs(e, c, null, a0.class, "1");
                      if (maxExportSiz != patchProxyRe) {
                      }else if(c.isKtvMultiPicSong()){
                         i1 = l.c().k();
                         encodeWidth = l.c().i();
                      }else {
                         i1 = GSConfig.h();
                         encodeWidth = GSConfig.g();
                      }
                      if (e.animatedSubAssetsSize() > 0 || c.isKtvMultiPicSong()) {
                         maxExportSiz = a.n(e, i1, encodeWidth);
                      }else if(b.d()){
                         maxExportSiz = a0.d(e.projectOutputWidth(), e.projectOutputHeight(), i1, encodeWidth);
                      }else {
                         Minecraft$Size projectResol = EditorSdk2UtilsV2.getProjectResolutionUnlimit(e);
                         i = projectResol.width();
                         maxExportSiz = a0.d(i, projectResol.height(), i1, encodeWidth);
                      }
                   }else if(c.isKtvMv()){
                      KtvMvEncodeConfig ktvMvEncodeC = l.c();
                      encodeWidth = ktvMvEncodeC.k();
                      maxExportSiz = a.n(e, encodeWidth, ktvMvEncodeC.i());
                   }else if(c.getWidth() > 0 && (c.getHeight() > 0 && c.isOverrideParams())){
                      maxExportSiz = a.n(e, c.getWidth(), c.getHeight());
                   }else if(c.useTemplateGrade()){
                      i1 = true;
                      pair = a.n(e, GSConfig.l(i1), GSConfig.k(i1));
                      if (c.getTemplateGrade() > 0) {
                         obj1 = EditorSdk2Utils.getMVExportOptionsNativeOptions(c.getTemplateGrade(), i1);
                         if (obj1 != null && (obj1.height() > 0 && (obj1.width() > 0 && (c.getWidth() > 0 && c.getHeight() > 0)))) {
                            maxExportSiz = a0.d(c.getWidth(), c.getHeight(), obj1.width(), obj1.height());
                         }else {
                         label_031a :
                            l = 1;
                         label_0329 :
                            c.setEncodedWithHeight(pair.first.intValue(), pair.second.intValue());
                            objArray2 = new Object[0];
                            a.D().w("EncodeManager", str3+pair+str6+c.isPhotoMovie()+str5+c.isKtvMv()+str4+c.mIsImport, objArray2);
                         }
                      }else {
                         goto label_031a ;
                      }
                   }else {
                      i1 = true;
                      pair = a.n(e, GSConfig.l(i1), GSConfig.k(i1));
                      goto label_0329 ;
                   }
                   pair = maxExportSiz;
                   goto label_031a ;
                }
                StringBuilder obj2 = PatchProxy.applyOneRefs(c, b, EncodeManager.class, "41");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else if(c.isSinglePicture() || c.isKtvSinglePicSong()){
                   obj2 = 1;
                }else {
                   obj2 = null;
                }
                b1 = obj2;
                String str2 = (b1)? ".jpg": ".mp4";
                str3 = str2;
                try{
                   File uFile = File.createTempFile(System.currentTimeMillis()+"", str3, PostUtils.h());
                   if (!uFile.delete()) {
                      objArray1 = new Object[0];
                      a.D().t("EncodeManager", "encodeNormalVideoRestPart: delete failed "+uFile, objArray1);
                   }
                }catch(java.lang.Exception e0){
                   a.D().e("EncodeManager", "encodeNormalVideoRestPart: ", e0);
                }
                u ou = new u(b, c, d, e, str3, obj);
                k1.o(e0);
             }
             return;
          }
       }
       if (c.getThrowable() == null) {
          EncodeInfo mEncodeParam = c.mEncodeParams;
          if (mEncodeParam != null && !TextUtils.x(mEncodeParam.mEncodingTemporaryFilePath)) {
             EncodeInfo$EncodeParams mEncodingTem = c.mEncodeParams.mEncodingTemporaryFilePath;
          label_00af :
             uFile1 = new File(str);
             if (!uFile1.exists()) {
                objArray2 = new Object[i];
                a.D().w("EncodeManager", "initEncodeTemporaryFile ret: "+uFile1.mkdirs(), objArray2);
             }
             str = uFile1.getAbsolutePath();
             goto label_0042 ;
          }
       }
       uFile1 = new File(b.m(), QCurrentUser.me().getId()+"_"+System.currentTimeMillis());
       if (!uFile1.exists()) {
          objArray2 = new Object[i];
          a.D().w("EncodeManager", "new parentDir initEncodeTemporaryFile ret: "+uFile1.mkdirs(), objArray2);
       }
       str = uFile1.getAbsolutePath();
       goto label_00af ;
    }
}
