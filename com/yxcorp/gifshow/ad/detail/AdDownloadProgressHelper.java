package com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper;
import com.yxcorp.gifshow.ad.widget.BaseAdProgressView;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$c;
import java.lang.Object;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$Status;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$1;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$a;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.h;
import com.yxcorp.gifshow.photoad.download.h;
import android.graphics.drawable.GradientDrawable;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import g59.p;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$b;
import java.lang.Enum;
import oxb.a$a;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import oxb.a;
import java.util.Objects;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import wkd.b;
import s59.s;
import s59.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.c;
import brd.t;
import t45.d;
import brd.z;
import sy8.f;
import erd.g;
import crd.b;
import androidx.lifecycle.LifecycleObserver;
import tw.j;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import ekd.p0;
import android.animation.ObjectAnimator;
import android.animation.Keyframe;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import sy8.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import sy8.g;
import android.animation.Animator$AnimatorListener;

public class AdDownloadProgressHelper	// class@001541
{
    public BaseAdProgressView a;
    public final AdUrlInfo b;
    public AdDownloadProgressHelper$Status c;
    public final AdDownloadProgressHelper$c d;
    public long e;
    public long f;
    public Lifecycle g;
    public ObjectAnimator h;
    public b i;
    public final LifecycleObserver j;
    public final b k;

    public void AdDownloadProgressHelper(BaseAdProgressView p0,AdUrlInfo p1,AdDownloadProgressHelper$c p2){
       super();
       this.c = AdDownloadProgressHelper$Status.NORMAL;
       this.j = new AdDownloadProgressHelper$1(this);
       this.k = new AdDownloadProgressHelper$a(this);
       this.a = p0;
       this.b = p1;
       this.d = p2;
    }
    public APKDownloadTask a(){
       Object obj = PatchProxy.apply(null, this, AdDownloadProgressHelper.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.n().l(h.a(this.b.mUrl));
    }
    public void b(){
       int i1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdDownloadProgressHelper uAdDownloadP = AdDownloadProgressHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdDownloadP, "4")) {
          return;
       }
       this.e = 0;
       this.f = 0;
       GradientDrawable gradientDraw = new GradientDrawable();
       int i = 0;
       gradientDraw.setShape(i);
       gradientDraw.setCornerRadius((float)R.dimen.arg_RES_7f07042c);
       AdDownloadProgressHelper td = this.d;
       Object obj = PatchProxy.applyOneRefs(td, this, uAdDownloadP, "8");
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else {
          int i3 = 0x7f0600e8;
          if (td != null) {
             i1 = (!TextUtils.x(td.c))? p.c(td.b, a1.a(i3), td.c): p.b(td.b, a1.a(i3));
          }else {
             i1 = a1.a(i3);
          }
       }
       gradientDraw.setColor(i1);
       td = this.d;
       if (td != null) {
          gradientDraw.setStroke(td.d, td.e);
       }
       this.a.setBackground(gradientDraw);
       if (!TextUtils.x(this.b.mPkgName) && SystemUtil.M(a.b(), this.b.mPkgName)) {
          this.c = AdDownloadProgressHelper$Status.INSTALLED;
          this.h();
          return;
       }else {
          APKDownloadTask obj1 = PatchProxy.apply(objArray, this, uAdDownloadP, "7");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = this.a();
             if (obj1 != null) {
                int i2 = AdDownloadProgressHelper$b.a[obj1.mCurrentStatus.ordinal()];
                if (i2 != 1) {
                   if (i2 != 2) {
                      if (i2 != 3) {
                         if (i2 != 4) {
                            this.c = (i2 != 5)? AdDownloadProgressHelper$Status.NORMAL: AdDownloadProgressHelper$Status.INSTALLED;
                         }else {
                            this.c = AdDownloadProgressHelper$Status.COMPLETED;
                         }
                      }else {
                         this.c = AdDownloadProgressHelper$Status.PAUSED;
                      }
                   }else {
                      this.c = AdDownloadProgressHelper$Status.DOWNLOADING;
                   }
                }else {
                   this.c = AdDownloadProgressHelper$Status.NORMAL;
                }
                this.e = obj1.mTotalBytes;
                this.f = obj1.mSoFarBytes;
                this.h();
                b = true;
             }else {
                b = false;
             }
          }
          if (b) {
             return;
          }else {
             AdDownloadProgressHelper obj2 = PatchProxy.apply(objArray, this, uAdDownloadP, "5");
             if (obj2 != patchProxyRe) {
                i = obj2.booleanValue();
             }else {
                obj2 = this.b;
                GameCenterDownloadParams$DownloadInfo uDownloadInf = a.b(new a$a(obj2.mUrl, obj2.mPkgName, obj2.mAppIcon, obj2.mAppName));
                if (uDownloadInf != null && !TextUtils.x(uDownloadInf.mStage)) {
                   if (!PatchProxy.applyVoidOneRefs(uDownloadInf, this, uAdDownloadP, "6")) {
                      GameCenterDownloadParams$DownloadInfo mStage = uDownloadInf.mStage;
                      Objects.requireNonNull(mStage);
                      switch (mStage.hashCode()){
                          case 0xc454c22d:
                            if (!mStage.equals("progress")) {
                            label_0170 :
                               i = -1;
                            }
                            break;
                          case 0xc84dc82d:
                            if (!mStage.equals("resume")) {
                               goto label_0170 ;
                            }else {
                               i = 1;
                            }
                            break;
                          case 0xdc453139:
                            if (!mStage.equals("complete")) {
                               goto label_0170 ;
                            }else {
                               i = 2;
                            }
                            break;
                          case 0x5c4d208:
                            if (!mStage.equals("error")) {
                               goto label_0170 ;
                            }else {
                               i = 3;
                            }
                            break;
                          case 0x65825f6:
                            if (!mStage.equals("pause")) {
                               goto label_0170 ;
                            }else {
                               i = 4;
                            }
                            break;
                          case 0x68ac462:
                            if (!mStage.equals("start")) {
                               goto label_0170 ;
                            }else {
                               i = 5;
                            }
                            break;
                          default:
                            goto label_0170 ;
                      }
                      if (i) {
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  if (i != 4) {
                                     if (i == 5 && !uDownloadInf.mSoFarBytes) {
                                        this.c = AdDownloadProgressHelper$Status.DOWNLOADING;
                                     }
                                  }else {
                                     this.c = AdDownloadProgressHelper$Status.PAUSED;
                                  }
                               }else {
                                  this.c = AdDownloadProgressHelper$Status.NORMAL;
                               }
                            }else {
                               this.c = AdDownloadProgressHelper$Status.COMPLETED;
                            }
                         }else {
                            this.c = AdDownloadProgressHelper$Status.DOWNLOADING;
                         }
                      }else {
                         this.c = AdDownloadProgressHelper$Status.DOWNLOADING;
                      }
                   }
                   this.e = uDownloadInf.mTotalBytes;
                   this.f = uDownloadInf.mSoFarBytes;
                   this.h();
                   i = true;
                }
             }
             if (i) {
                return;
             }else {
                this.c = AdDownloadProgressHelper$Status.NORMAL;
                this.h();
                return;
             }
          }
       }
    }
    public void c(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadProgressHelper.class, "3")) {
          return;
       }
       AdDownloadProgressHelper ta = this.a;
       if (ta instanceof View) {
          ta.setOnClickListener(p0);
       }
       return;
    }
    public void d(Lifecycle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadProgressHelper.class, "1")) {
          return;
       }
       b.a(-901401630).r(this.k);
       if (this.i == null) {
          this.i = RxBus.f.f(c.class).observeOn(d.a).subscribe(new f(this));
       }
       this.g = p0;
       if (p0 != null) {
          p0.addObserver(this.j);
       }
       this.b();
       return;
    }
    public void e(){
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdDownloadProgressHelper uAdDownloadP = AdDownloadProgressHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdDownloadP, "16")) {
          return;
       }
       APKDownloadTask obj = PatchProxy.apply(objArray, this, uAdDownloadP, "17");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!j.B(this.b.mType) || this.b.mUsePriorityCard == null){
          obj = this.a();
          if (obj == null || obj.mCurrentStatus == APKDownloadTask$DownloadStatus.PAUSED) {
             b = false;
          }
       }
       b = true;
       if (b) {
          this.g();
       }else {
          AdDownloadProgressHelper ta = this.a;
          obj = PatchProxy.apply(objArray, objArray, j.class, "28");
          if (obj != patchProxyRe) {
             objArray1 = obj;
          }else if(!p0.A(a.b())){
             objArray = "√‚¡˜œ¬‘ÿ";
          }
          objArray1 = objArray;
          ta.e(objArray1, 400, 200, 1500);
       }
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDownloadProgressHelper.class, "2")) {
          return;
       }
       this.g();
       b.a(-901401630).v(this.k);
       AdDownloadProgressHelper ti = this.i;
       if (ti != null) {
          ti.dispose();
          this.i = objArray;
       }
       ti = this.g;
       if (ti != null) {
          ti.removeObserver(this.j);
       }
       ti = this.h;
       if (ti != null) {
          ti.cancel();
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper.class, "15")) {
          return;
       }
       this.a.f();
       return;
    }
    public void h(){
       AdDownloadProgressHelper uAdDownloadP = AdDownloadProgressHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdDownloadP, "10")) {
          return;
       }
       AdDownloadProgressHelper tc = this.c;
       if (tc != AdDownloadProgressHelper$Status.NORMAL && tc != AdDownloadProgressHelper$Status.PAUSED) {
          this.a.f();
       }
       this.c.showProgressStatus(this.a, this.f, this.e, this.d);
       if (this.c == AdDownloadProgressHelper$Status.COMPLETED) {
          tc = this.d;
          if (tc != null && tc.f != null) {
             if (!PatchProxy.applyVoid(objArray, this, uAdDownloadP, "11") && this.h == null) {
                Keyframe keyframe = Keyframe.ofFloat(0, 0x3f800000);
                Keyframe keyframe1 = Keyframe.ofFloat(0.07f, 0x3f733333);
                Keyframe keyframe2 = Keyframe.ofFloat(0x3e2f837b, 0x3f87ae14);
                Keyframe keyframe3 = Keyframe.ofFloat(0.24f, 0x3f75c28f);
                Keyframe keyframe4 = Keyframe.ofFloat(0.29f, 0x3f800000);
                Keyframe keyframe5 = Keyframe.ofFloat(0x3f800000, 0x3f800000);
                Keyframe[] keyframeArra = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3,keyframe4,keyframe5};
                Keyframe[] keyframeArra1 = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3,keyframe4,keyframe5};
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeArra),PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeArra1)};
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.a, propertyValu);
                this.h = objectAnimat;
                objectAnimat.setDuration(2800);
                this.h.setRepeatCount(-1);
                this.h.setInterpolator(new LinearInterpolator());
                this.h.addUpdateListener(new e(this));
                this.h.addListener(new g(this));
             }
             uAdDownloadP = this.h;
             if (uAdDownloadP != null && !uAdDownloadP.isRunning()) {
                this.h.start();
             }
          }else {
          label_00ea :
             uAdDownloadP = this.h;
             if (uAdDownloadP != null) {
                uAdDownloadP.cancel();
             }
          }
       }else {
          goto label_00ea ;
       }
       return;
    }
    public void onAppInstallEvent(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadProgressHelper.class, "9")) {
          return;
       }
       if (!TextUtils.x(p0.a) && (p0.a).endsWith(this.b.mPkgName)) {
          this.c = AdDownloadProgressHelper$Status.INSTALLED;
          this.h();
       }
       return;
    }
}
