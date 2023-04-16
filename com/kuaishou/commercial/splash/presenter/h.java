package com.kuaishou.commercial.splash.presenter.h;
import im8.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import wkd.b;
import tjc.c;
import tjc.b;
import java.lang.StringBuilder;
import java.lang.String;
import iz.a;
import yx.j0;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.commercial.splash.presenter.r0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gz.s;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
import java.util.concurrent.TimeUnit;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Enum;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import gz.u2;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;
import android.app.Activity;
import mxb.u;
import com.kuaishou.commercial.splash.presenter.r0$a;
import java.lang.ref.WeakReference;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.content.Context;
import gz.j0;
import gz.k0;
import mrd.c;
import gz.f1;
import java.util.Map;
import java.util.HashMap;

public class h implements g	// class@0015ef
{
    public ViewGroup b;
    public PublishSubject c;
    public PublishSubject d;
    public ViewGroup e;
    public c f;
    public c g;
    public PublishSubject h;
    public b i;
    public r0 j;
    public u2 k;
    public s l;
    public PublishSubject m;
    public PublishSubject n;
    public PublishSubject o;
    public boolean p;
    public x0 q;
    public boolean r;
    public h$a s;
    public int t;
    public ViewGroup u;

    public void h(){
       SplashInfo mSkipInfo;
       b a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       this.c = PublishSubject.g();
       this.d = PublishSubject.g();
       this.f = PublishSubject.g();
       this.g = PublishSubject.g();
       this.h = PublishSubject.g();
       this.m = PublishSubject.g();
       this.n = PublishSubject.g();
       this.o = PublishSubject.g();
       int i = -1608526086;
       if (!b.a(i).getState()) {
          return;
       }
       b uob = b.a(i).a();
       if (uob == null) {
          return;
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       j0.f("SplashCallerContext", "adapter data "+a.a(uob), objArray);
       SplashInfo mSplashAdMat = uob.a.mSplashAdMaterialType;
       String str = "";
       String str1 = "2";
       String str2 = "1";
       int i2 = 1;
       if (mSplashAdMat == i2) {
          r0 or0 = r0.class;
          r0 or01 = PatchProxy.applyOneRefs(uob, null, or0, str2);
          if (or01 != patchProxyRe) {
          }else {
             or01 = new r0();
             or01.p = -1;
             or01.d = 0;
             mSkipInfo = uob.a.mSkipInfo;
             if (mSkipInfo != null) {
                or01.e = mSkipInfo.mHideSkipBtn;
                or01.d = TimeUnit.SECONDS.toMillis((long)mSkipInfo.mSkipTagShowTime);
                or01.f = uob.a.mSkipInfo.mSkipTitle;
             }
             s.a(uob, or01);
             s.d(uob, or01);
             s.c(uob, or01);
             if (!PatchProxy.applyVoidTwoRefs(uob, or01, null, or0, str1)) {
                or01.U = a.a().a().getString(0x7f1000d1);
                mSkipInfo = uob.a.mPreloadInfo;
                if (mSkipInfo != null) {
                   if (mSkipInfo.mHidePreloadDescription != null) {
                      or01.U = str;
                   }else if(!TextUtils.x(mSkipInfo.mPreloadDescription)){
                      or01.U = uob.a.mPreloadInfo.mPreloadDescription;
                   }
                }
             }
             s.b(uob, or01);
             a = uob.a;
             or01.S = a.mAudioButtonVisible;
             or01.T = a.mEnableStayWhenVideoFinish;
             or01.V = a.mPlayableInfo;
             if (!PatchProxy.applyVoidTwoRefs(uob, or01, null, or0, "3")) {
                a = uob.b;
                if (a != null) {
                   PhotoAdvertisement photoAdverti = a.get("AD");
                   if (photoAdverti != null) {
                      PhotoAdvertisement mSourceType = photoAdverti.mSourceType;
                      if (mSourceType > null) {
                         or01.X = mSourceType;
                      }
                      mSourceType = photoAdverti.mAdGroup;
                      if (mSourceType != null && mSourceType.ordinal() > 0) {
                         or01.b0 = (long)photoAdverti.mAdGroup.ordinal();
                      }
                      PhotoAdvertisement mCreativeId = photoAdverti.mCreativeId;
                      if (mCreativeId > 0) {
                         or01.Y = mCreativeId;
                      }
                      mCreativeId = photoAdverti.mPageId;
                      if (mCreativeId > 0) {
                         or01.Z = mCreativeId;
                      }
                      mCreativeId = photoAdverti.mSubPageId;
                      if (mCreativeId > 0) {
                         or01.a0 = mCreativeId;
                      }
                   }
                }
             }
             mSkipInfo = uob.a.mInteractionInfo;
             if (mSkipInfo != null) {
                or01.k = mSkipInfo.mInteractiveStyle;
                or01.H = mSkipInfo.mCanClickSplash;
                or01.F = mSkipInfo;
             }
             s.f(uob, or01);
          }
          this.j = or01;
          this.l = or01;
       }else if(mSplashAdMat == 2){
          u2 ou2 = u2.class;
          u2 ou21 = PatchProxy.applyOneRefs(uob, null, ou2, str2);
          if (ou21 != patchProxyRe) {
          }else {
             ou21 = new u2();
             ou21.p = i1;
             ou21.T = 1000;
             mSkipInfo = uob.a.mSkipInfo;
             if (mSkipInfo != null) {
                ou21.d = TimeUnit.SECONDS.toMillis((long)mSkipInfo.mSkipTagShowTime);
                mSkipInfo = uob.a.mSkipInfo;
                ou21.e = mSkipInfo.mHideSkipBtn;
                ou21.f = mSkipInfo.mSkipTitle;
                ou21.R = mSkipInfo.mHideCountdownTime;
             }
             s.a(uob, ou21);
             s.d(uob, ou21);
             s.c(uob, ou21);
             if (!PatchProxy.applyVoidTwoRefs(uob, ou21, null, ou2, str1)) {
                ou21.Y = i2;
                mSkipInfo = uob.a.mActionBarInfo;
                if (mSkipInfo != null) {
                   ou21.T = TimeUnit.SECONDS.toMillis((long)mSkipInfo.mActionbarShowBeginTime);
                   if (ou21.A != null) {
                      mSkipInfo = uob.a.mClickButtonInfo;
                      if (mSkipInfo != null) {
                         SplashInfo$ClickButtonInfo mLiveActionB = mSkipInfo.mLiveActionBarDescription;
                         ou21.S = mLiveActionB;
                         if (TextUtils.x(mLiveActionB)) {
                            ou21.S = a.b().getString(0x7f104a62);
                         }
                      }else {
                      label_01e2 :
                         ou21.S = uob.a.mActionBarInfo.mActionBarDescription;
                      }
                   }else {
                      goto label_01e2 ;
                   }
                   mSkipInfo = uob.a.mActionBarInfo;
                   if (mSkipInfo.mHideSplashActionBar != null) {
                      ou21.S = str;
                   }
                   ou21.Y = mSkipInfo.mNoActionbarAnimation ^ i2;
                }
                s i3 = ou21.i;
                mSplashAdMat = 9;
                if (i3 == 2 || i3 == mSplashAdMat) {
                   ou21.Y = i1;
                }
                int i4 = (i3 == 3 || i3 == mSplashAdMat)? 49: 60;
                ou21.Z = i4;
             }
             s.b(uob, ou21);
             a = uob.a;
             ou21.X = a.mIsBirthday ^ i2;
             mSplashAdMat = a.mSplashAdDisplayStyle;
             ou21.W = mSplashAdMat;
             mSkipInfo = a.mInteractionInfo;
             if (mSkipInfo != null) {
                ou21.H = mSkipInfo.mCanClickSplash;
                ou21.k = mSkipInfo.mInteractiveStyle;
                if (mSplashAdMat == 2) {
                   ou21.F = mSkipInfo;
                }
             }
             s.f(uob, ou21);
          }
          this.k = ou21;
          this.l = ou21;
       }
       return;
    }
    public void h(Activity p0){
       super(p0, false);
    }
    public void h(Activity p0,boolean p1){
       super(p0, p1, null);
    }
    public void h(Activity p0,boolean p1,u p2){
       b a;
       b b;
       String str3;
       SplashInfo mSkipInfo2;
       h oh = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       oh.c = PublishSubject.g();
       oh.d = PublishSubject.g();
       oh.f = PublishSubject.g();
       oh.g = PublishSubject.g();
       oh.h = PublishSubject.g();
       oh.m = PublishSubject.g();
       oh.n = PublishSubject.g();
       oh.o = PublishSubject.g();
       int i = -1608526086;
       String str = "1";
       if (!b.a(i).getState()) {
       }else {
          b uob1 = b.a(i).a();
          if (uob1 != null) {
             int i1 = 0;
             Object[] objArray = new Object[i1];
             j0.f("SplashCallerContext", "adapter data "+a.a(uob1), objArray);
             SplashInfo mSplashAdMat = uob1.a.mSplashAdMaterialType;
             String str1 = "";
             String str2 = "2";
             Object obj2 = null;
             int i2 = 1;
             if (mSplashAdMat == i2) {
                r0 or0 = r0.class;
                r0 or01 = PatchProxy.applyOneRefs(uob1, obj2, or0, str);
                if (or01 != patchProxyRe) {
                }else {
                   or01 = new r0();
                   or01.p = -1;
                   or01.d = 0;
                   SplashInfo mSkipInfo = uob1.a.mSkipInfo;
                   if (mSkipInfo != null) {
                      or01.e = mSkipInfo.mHideSkipBtn;
                      or01.d = TimeUnit.SECONDS.toMillis((long)mSkipInfo.mSkipTagShowTime);
                      or01.f = uob1.a.mSkipInfo.mSkipTitle;
                   }
                   s.a(uob1, or01);
                   s.d(uob1, or01);
                   s.c(uob1, or01);
                   if (!PatchProxy.applyVoidTwoRefs(uob1, or01, obj2, or0, str2)) {
                      or01.U = a.a().a().getString(0x7f1000d1);
                      SplashInfo mPreloadInfo = uob1.a.mPreloadInfo;
                      if (mPreloadInfo != null) {
                         if (mPreloadInfo.mHidePreloadDescription != null) {
                            or01.U = str1;
                         }else if(!TextUtils.x(mPreloadInfo.mPreloadDescription)){
                            or01.U = uob1.a.mPreloadInfo.mPreloadDescription;
                         }
                      }
                   }
                   s.b(uob1, or01);
                   a = uob1.a;
                   or01.S = a.mAudioButtonVisible;
                   or01.T = a.mEnableStayWhenVideoFinish;
                   or01.V = a.mPlayableInfo;
                   if (!PatchProxy.applyVoidTwoRefs(uob1, or01, obj2, or0, "3")) {
                      b = uob1.b;
                      if (b != null) {
                         PhotoAdvertisement photoAdverti = b.get("AD");
                         if (photoAdverti != null) {
                            PhotoAdvertisement mSourceType = photoAdverti.mSourceType;
                            if (mSourceType > null) {
                               or01.X = mSourceType;
                            }
                            mSourceType = photoAdverti.mAdGroup;
                            if (mSourceType != null && mSourceType.ordinal() > 0) {
                               or01.b0 = (long)photoAdverti.mAdGroup.ordinal();
                            }
                            mSourceType = photoAdverti.mCreativeId;
                            if (mSourceType > 0) {
                               or01.Y = mSourceType;
                            }
                            mSourceType = photoAdverti.mPageId;
                            if (mSourceType > 0) {
                               or01.Z = mSourceType;
                            }
                            mSourceType = photoAdverti.mSubPageId;
                            if (mSourceType > 0) {
                               or01.a0 = mSourceType;
                            }
                         }
                      }
                   }
                   mSplashAdMat = uob1.a.mInteractionInfo;
                   if (mSplashAdMat != null) {
                      or01.k = mSplashAdMat.mInteractiveStyle;
                      or01.H = mSplashAdMat.mCanClickSplash;
                      or01.F = mSplashAdMat;
                   }
                   s.f(uob1, or01);
                }
                oh.j = or01;
                oh.l = or01;
             }else if(mSplashAdMat == 2){
                u2 ou2 = u2.class;
                u2 ou21 = PatchProxy.applyOneRefs(uob1, obj2, ou2, str);
                if (ou21 != patchProxyRe) {
                }else {
                   ou21 = new u2();
                   ou21.p = i1;
                   ou21.T = 1000;
                   SplashInfo mSkipInfo1 = uob1.a.mSkipInfo;
                   if (mSkipInfo1 != null) {
                      str3 = str1;
                      ou21.d = TimeUnit.SECONDS.toMillis((long)mSkipInfo1.mSkipTagShowTime);
                      mSkipInfo2 = uob1.a.mSkipInfo;
                      ou21.e = mSkipInfo2.mHideSkipBtn;
                      ou21.f = mSkipInfo2.mSkipTitle;
                      ou21.R = mSkipInfo2.mHideCountdownTime;
                   }else {
                      str3 = str1;
                   }
                   s.a(uob1, ou21);
                   s.d(uob1, ou21);
                   s.c(uob1, ou21);
                   if (!PatchProxy.applyVoidTwoRefs(uob1, ou21, obj2, ou2, str2)) {
                      ou21.Y = i2;
                      mSplashAdMat = uob1.a.mActionBarInfo;
                      if (mSplashAdMat != null) {
                         ou21.T = TimeUnit.SECONDS.toMillis((long)mSplashAdMat.mActionbarShowBeginTime);
                         if (ou21.A != null) {
                            mSplashAdMat = uob1.a.mClickButtonInfo;
                            if (mSplashAdMat != null) {
                               SplashInfo$ClickButtonInfo mLiveActionB = mSplashAdMat.mLiveActionBarDescription;
                               ou21.S = mLiveActionB;
                               if (TextUtils.x(mLiveActionB)) {
                                  ou21.S = a.b().getString(0x7f104a62);
                               }
                            }else {
                            label_01ef :
                               ou21.S = uob1.a.mActionBarInfo.mActionBarDescription;
                            }
                         }else {
                            goto label_01ef ;
                         }
                         mSplashAdMat = uob1.a.mActionBarInfo;
                         if (mSplashAdMat.mHideSplashActionBar != null) {
                            ou21.S = str3;
                         }
                         ou21.Y = mSplashAdMat.mNoActionbarAnimation ^ i2;
                      }
                      s i3 = ou21.i;
                      mSkipInfo2 = 9;
                      if (i3 == 2 || i3 == mSkipInfo2) {
                         ou21.Y = false;
                      }
                      int i4 = (i3 == 3 || i3 == mSkipInfo2)? 49: 60;
                      ou21.Z = i4;
                   }
                   s.b(uob1, ou21);
                   b = uob1.a;
                   ou21.X = b.mIsBirthday ^ i2;
                   mSkipInfo2 = b.mSplashAdDisplayStyle;
                   ou21.W = mSkipInfo2;
                   mSplashAdMat = b.mInteractionInfo;
                   if (mSplashAdMat != null) {
                      ou21.H = mSplashAdMat.mCanClickSplash;
                      ou21.k = mSplashAdMat.mInteractiveStyle;
                      if (mSkipInfo2 == 2) {
                         ou21.F = mSplashAdMat;
                      }
                   }
                   s.f(uob1, ou21);
                }
                oh.k = ou21;
                oh.l = ou21;
             }
          }
       }
       if (!b.a(i).getState()) {
          return;
       }else {
          b uob = b.a(i).a();
          if (uob == null) {
             return;
          }else {
             h j = oh.j;
             if (j != null && (uob.b != null && obj)) {
                r0$a uoa = new r0$a();
                Object obj1 = PatchProxy.applyOneRefs(obj, uoa, r0$a.class, str);
                uoa = (obj1 != patchProxyRe)? obj1: new WeakReference(obj);
                uoa.d = p2;
                j.R = uoa;
                if (p1) {
                   oh.j.W = d.a(-536296199).c70(obj);
                }
             }else {
                h k = oh.k;
                if (k != null && (uob.b != null && obj != null)) {
                   k.U = new j0(uob, obj);
                   k.V = new k0(uob, obj);
                }
             }
             return;
          }
       }
    }
    public c a(){
       return this.f;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new f1());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
}
