package com.kuaishou.merchant.home2.skin.SkinDownloader$a;
import com.yxcorp.download.k;
import com.kuaishou.merchant.home2.skin.SkinDownloader;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import k66.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.home2.skin.SkinDownloadException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.u0;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin;
import qkd.b;
import e04.b;
import com.kuaishou.merchant.home2.skin.f;
import java.lang.Throwable;
import java.lang.Integer;
import com.kuaishou.merchant.home2.skin.SkinDownloader$SkinDownloaderException;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ToolbarStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$SuperSaleBannerStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$SeparateBannerStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabBarStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabActivityStyle;
import yz7.e;

public class SkinDownloader$a extends k	// class@001820
{
    public b c;
    public Exception d;
    public boolean e;
    public final SkinDownloader f;

    public void SkinDownloader$a(SkinDownloader p0){
       this.f = p0;
       super();
    }
    public void a(DownloadTask p0){
       SkinDownloader skinDownload = SkinDownloader.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SkinDownloader$a.class, "1")) {
          return;
       }
       try{
          File uFile = new File(p0.getTargetFilePath());
          SkinDownloader$a tf = this.f;
          String str = a.b(uFile);
          Objects.requireNonNull(tf);
          Object obj = PatchProxy.applyOneRefs(str, tf, skinDownload, "5");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): TextUtils.equals(str, tf.d);
          if (!b) {
             this.d = new SkinDownloadException("MD5校验失败");
             return;
          }else {
             File uFile1 = new File(this.f.a, this.f.c+"");
             SkinDownloader$a tf1 = this.f;
             Objects.requireNonNull(tf1);
             if (!PatchProxy.applyVoidTwoRefs(uFile, uFile1, tf1, skinDownload, "4") && uFile.exists()) {
                u0.i(uFile, uFile1.getAbsolutePath());
                uFile.delete();
             }
             if (uFile1.exists() && uFile1.isDirectory()) {
                File uFile2 = new File(uFile1, "config.json");
                MerchantHomeSkin merchantHome = this.f.b(uFile2);
                this.q(merchantHome, uFile1.getAbsolutePath(), uFile2, this.f.c);
                uFile2 = new File(uFile1, "images");
                if (b.R(uFile2)) {
                   this.c = new b(merchantHome, uFile1.getAbsolutePath(), uFile2.getAbsolutePath());
                   return;
                }
             }
             this.d = new SkinDownloadException("解压后文件有误");
          }
       }catch(java.lang.Exception e6){
          this.d = e6;
       }
       return;
    }
    public void b(DownloadTask p0){
       this.e = true;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SkinDownloader$a.class, "3")) {
          return;
       }
       SkinDownloader$a tc = this.c;
       if (tc != null && this.e == null) {
          this.f.e.q0(tc);
       }else {
          tc = this.d;
          if (tc != null) {
             this.f.e.r0(tc);
          }else {
             this.f.e.r0(null);
          }
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       SkinDownloader$SkinDownloaderException skinDownload;
       SkinDownloader$a uoa = SkinDownloader$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
          return;
       }
       p0 = PatchProxy.applyOneRefs(p1, this, uoa, "4");
       if (p0 != PatchProxyResult.class) {
       }else {
          Integer integer = null;
          if (p1 != null) {
             String message = p1.getMessage();
             if (message != null) {
                integer = Integer.valueOf(Integer.parseInt(message));
             }
          }
       }
       if (p0 != null) {
          skinDownload = new SkinDownloader$SkinDownloaderException(p0.intValue(), p1);
       }
       this.f.e.r0(skinDownload);
       return;
    }
    public final void q(MerchantHomeSkin p0,String p1,File p2,int p3){
       if (PatchProxy.isSupport(SkinDownloader$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, SkinDownloader$a.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       MerchantHomeSkin mShowConfig = p0.mShowConfig;
       if (mShowConfig != null) {
          mShowConfig.mVersion = p3;
          mShowConfig.mSkinRootDirPath = p1;
          MerchantHomeSkin$ShowConfig mNavigationS = mShowConfig.mNavigationStyle;
          if (mNavigationS != null) {
             mNavigationS.mSkinRootDirPath = p1;
          }
          mNavigationS = mShowConfig.mToolbarStyle;
          if (mNavigationS != null) {
             mNavigationS.mSkinRootDirPath = p1;
          }
          mNavigationS = mShowConfig.mSuperSaleBannerStyle;
          if (mNavigationS != null) {
             mNavigationS.mSkinRootDirPath = p1;
          }
          mNavigationS = mShowConfig.mSeparateBannerStyle;
          if (mNavigationS != null) {
             mNavigationS.mSkinRootDirPath = p1;
          }
          mNavigationS = mShowConfig.mTabBarStyle;
          if (mNavigationS != null) {
             mNavigationS.mSkinRootDirPath = p1;
          }
          mNavigationS = mShowConfig.mActivityStyle;
          if (mNavigationS != null) {
             mNavigationS.mSkinRootDirPath = p1;
          }
       }
       b.v0(p2, e.f(p0));
       return;
    }
}
