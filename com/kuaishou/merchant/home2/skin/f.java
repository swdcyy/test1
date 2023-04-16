package com.kuaishou.merchant.home2.skin.f;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import e04.b;
import zw3.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$BaseConfig;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Long;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$a;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabBarStyle;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabActivityStyle;
import crd.b;
import lnc.b9;
import java.lang.System;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.yxcorp.download.DownloadManager;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.RetrofitException;
import aegon.chrome.net.NetworkException;
import retrofit2.HttpException;
import com.yxcorp.retrofit.model.KwaiException;
import java.io.FileNotFoundException;
import com.kuaishou.merchant.home2.skin.SkinDownloader$SkinDownloaderException;
import java.lang.Integer;

public class f extends ViewModel	// class@001827
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public long e;
    public long f;
    public long g;
    public b h;
    public b i;
    public b j;

    public void f(){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
    }
    public static f p0(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(p0).get(f.class);
    }
    public final void o0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       b.j(p0.b);
       b a = p0.a;
       if (a == null) {
          if (this.b.getValue() != null) {
             this.a.postValue(null);
             this.b.postValue(null);
             this.c.postValue(null);
             this.d.postValue(null);
          }
          return;
       }else {
          MerchantHomeSkin mBaseConfig = a.mBaseConfig;
          if (mBaseConfig != null && !q.f(mBaseConfig.mTimeData)) {
             MerchantHomeSkin$BaseConfig mTimeData = p0.a.mBaseConfig.mTimeData;
             b.k(mTimeData.get((mTimeData.size() - 1)).longValue());
          }
          mBaseConfig = p0.a.mShowConfig;
          if (mBaseConfig != null) {
             this.a.postValue(p0);
             this.b.postValue(mBaseConfig);
             MerchantHomeSkin$ShowConfig mNavigationS = mBaseConfig.mNavigationStyle;
             if (mNavigationS != null) {
                this.c.postValue(mNavigationS);
             }
             this.d.postValue(new MerchantHomeSkin$a(mBaseConfig.mTabBarStyle, mBaseConfig.mActivityStyle));
          }
          return;
       }
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       super.onCleared();
       b9.a(this.h);
       b9.a(this.i);
       return;
    }
    public void q0(b p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uof, "9")) {
          long l = System.currentTimeMillis();
          this.g = l;
          a.s(MerchantHomeLogBiz.Skin, "SKIN_PERFORMANCE", "type=download&status=success&downloadApplySkinSpend="+(l - this.e));
       }
       this.o0(p0);
       DownloadManager.C("mechant_skin", "");
       return;
    }
    public void r0(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (p0 instanceof RetrofitException || (!p0 instanceof NetworkException && !p0 instanceof HttpException)) {
          if (p0 instanceof KwaiException) {
             return;
          }else if(p0 instanceof FileNotFoundException){
             a.l(MerchantHomeLogBiz.Skin, "DOWNLOAD_SKIN", "FileNotFoundException", p0);
             return;
          }else if(p0 instanceof SkinDownloader$SkinDownloaderException){
             a.m(MerchantHomeLogBiz.Skin, "DOWNLOAD_SKIN", "fail in downloader", p0, "errorCode", Integer.valueOf(p0.errorCode));
             return;
          }else if(p0 == null){
             return;
          }else {
             this.s0();
             a.l(MerchantHomeLogBiz.Skin, "DOWNLOAD_SKIN", "Fail to download Skin", p0);
          }
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       long l = System.currentTimeMillis();
       this.f = l;
       a.s(MerchantHomeLogBiz.Skin, "SKIN_PERFORMANCE", "type=download&status=failed&downloadSpend="+(l - this.e));
       return;
    }
}
