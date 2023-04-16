package com.kuaishou.merchant.home2.skin.SkinDownloader;
import java.lang.String;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabActivityStyle;
import com.kuaishou.merchant.home2.skin.f;
import java.lang.Object;
import com.kuaishou.merchant.home2.skin.SkinDownloader$a;
import wkd.b;
import j80.c;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin;
import com.kwai.robust.PatchProxyResult;
import qkd.b;
import yz7.e;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ToolbarStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabBarStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$SuperSaleBannerStyle;

public class SkinDownloader	// class@001821
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final f e;
    public final MerchantHomeSkin$TabActivityStyle f;
    public int g;
    public final b h;

    public void SkinDownloader(String p0,int p1,String p2,MerchantHomeSkin$TabActivityStyle p3,f p4){
       super();
       this.h = new SkinDownloader$a(this);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p4;
       this.f = p3;
       this.a = b.a(-1504323719).h("merchant/home/skin/").getAbsolutePath();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SkinDownloader.class, "2")) {
          return;
       }
       if (this.g != null) {
          DownloadManager.n().c(this.g);
          this.g = 0;
       }
       return;
    }
    public MerchantHomeSkin b(File p0){
       MerchantHomeSkin obj = PatchProxy.applyOneRefs(p0, this, SkinDownloader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MerchantHomeSkin merchantHome = e.a(b.f0(p0), MerchantHomeSkin.class);
       if (merchantHome != null) {
          obj = merchantHome.mShowConfig;
          if (obj != null) {
             MerchantHomeSkin$ShowConfig mToolbarStyl = obj.mToolbarStyle;
             if (mToolbarStyl != null) {
                mToolbarStyl.mapItems();
             }
             mToolbarStyl = merchantHome.mShowConfig.mTabBarStyle;
             if (mToolbarStyl != null) {
                mToolbarStyl.mapItems();
             }
             mToolbarStyl = merchantHome.mShowConfig.mSuperSaleBannerStyle;
             if (mToolbarStyl != null) {
                mToolbarStyl.mapItems();
             }
             merchantHome.mShowConfig.mActivityStyle = this.f;
          }
       }
       return merchantHome;
    }
}
