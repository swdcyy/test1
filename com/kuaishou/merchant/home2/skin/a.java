package com.kuaishou.merchant.home2.skin.a;
import erd.g;
import com.kuaishou.merchant.home2.skin.b;
import java.lang.Object;
import com.kuaishou.merchant.home2.skin.model.AtmosphereDownloadInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.home2.skin.f;
import java.lang.Throwable;
import com.kuaishou.merchant.home2.skin.model.AtmosphereDownloadInfoResponse$ResourceData;
import com.kuaishou.merchant.home2.skin.model.AtmosphereDownloadInfoResponse$AtmosphereDownloadInfoModel;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.home2.skin.model.AtmosphereDownloadInfoResponse$MaterialData;
import com.kuaishou.merchant.home2.skin.model.SkinConfig;
import com.kuaishou.merchant.home2.skin.model.AtmosphereDownloadInfoResponse$ExtInfo;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kuaishou.merchant.home2.skin.SkinDownloader;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabActivityStyle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import qkd.b;
import ekd.j;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$a;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin;
import e04.b;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabBarStyle;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.home2.skin.c;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;

public final class a implements g	// class@001822
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "7")) {
       }else {
          Throwable throwable = null;
          if (p0 == null) {
             tb.q.s0();
             tb.q.r0(throwable);
          }else {
             AtmosphereDownloadInfoResponse mResourceDat = p0.mResourceData;
             if (mResourceDat != null) {
                AtmosphereDownloadInfoResponse$ResourceData mDownloadInf = mResourceDat.mDownloadInfoModel;
                if (mDownloadInf != null && !q.f(mDownloadInf.mList)) {
                   int i = 0;
                   if (p0.mResourceData.mDownloadInfoModel.mList.get(i) != null && p0.mResourceData.mDownloadInfoModel.mList.get(i).mExtInfo != null) {
                      AtmosphereDownloadInfoResponse$MaterialData mExtInfo = p0.mResourceData.mDownloadInfoModel.mList.get(i).mExtInfo;
                      SkinConfig skinConfig = new SkinConfig(mExtInfo.mVersion, mExtInfo.mSuperSaleBannerJumpUrl, mExtInfo.mHotWordType, p0.mResourceData.mDownloadInfoModel.mList.get(i).mMaterialId);
                      p0 = b.a.edit();
                      p0.putString(b.d("user")+"merchant_home_skin_config", b.e(v10));
                      g.a(p0);
                      p0 = tb.r;
                      if (p0 != null) {
                         p0.a();
                      }
                      SkinDownloader skinDownload = new SkinDownloader(mExtInfo.mZipCdnUrl, mExtInfo.mVersion, mExtInfo.mZipMd5, mExtInfo.mActivityTabInfo, tb.q);
                      tb.r = p0;
                      SkinDownloader skinDownload1 = SkinDownloader.class;
                      if (!PatchProxy.applyVoid(throwable, p0, skinDownload1, "1")) {
                         DownloadTask$DownloadRequest obj = PatchProxy.apply(throwable, p0, skinDownload1, "3");
                         MerchantHomeSkin$ShowConfig showConfig = 1;
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else {
                            String[] stringArray = new String[showConfig];
                            stringArray[i] = p0.a;
                            File uFile = b.B(stringArray);
                            File[] uFileArray = uFile.listFiles();
                            if (uFile.isDirectory() && !j.h(uFileArray)) {
                               b = uFileArray.length;
                               int i1 = 0;
                               while (true) {
                                  if (i1 < b) {
                                     if (TextUtils.equals(Integer.toString(p0.c), uFileArray[i1].getName())) {
                                        b = true;
                                     }else {
                                        i1 = i1 + 1;
                                     }
                                  }
                               }
                            }
                            b = false;
                         }
                         if (b) {
                            skinDownload1 = p0.e;
                            p0 = p0.f;
                            Objects.requireNonNull(skinDownload1);
                            if (!PatchProxy.applyVoidOneRefs(p0, skinDownload1, f.class, "4") && !MerchantHomeSkin.isSameTabActivity(skinDownload1.d.getValue(), p0)) {
                               b value = skinDownload1.a.getValue();
                               if (value != null) {
                                  b a = value.a;
                                  if (a != null) {
                                     MerchantHomeSkin mShowConfig = a.mShowConfig;
                                     if (mShowConfig != null) {
                                        if (p0 != null) {
                                           p0.mSkinRootDirPath = mShowConfig.mSkinRootDirPath;
                                        }
                                        mShowConfig.mActivityStyle = p0;
                                        MerchantHomeSkin$a uoa = (skinDownload1.d.getValue() != null)? new MerchantHomeSkin$a(skinDownload1.d.getValue().b, p0): new MerchantHomeSkin$a(throwable, p0);
                                        skinDownload1.d.postValue(uoa);
                                        skinDownload1.h = b9.c(skinDownload1.h, new c(value, new File(value.b+File.separator+"config.json")));
                                     }
                                  }
                               }
                            }
                         }else {
                            obj = new DownloadTask$DownloadRequest(p0.b);
                            DownloadTask$DownloadTaskType eNQUEUE = DownloadTask$DownloadTaskType.ENQUEUE;
                            obj.setDownloadTaskType(eNQUEUE);
                            obj.setDestinationDir(p0.a);
                            obj.setNeedCDNReport(showConfig);
                            obj.setDownloadTaskType(eNQUEUE);
                            obj.setAllowedNetworkTypes(3);
                            obj.setBizInfo(":ks-features:ft-merchant:merchant-home:home2", "mechant_skin", throwable);
                            b[] uobArray = new b[showConfig];
                            uobArray[i] = p0.h;
                            p0.g = DownloadManager.n().E(obj, uobArray);
                         }
                      }
                   }
                }
             }
             b.j("");
             tb.q.q0(new b(throwable, "", ""));
          }
       }
       return;
    }
}
