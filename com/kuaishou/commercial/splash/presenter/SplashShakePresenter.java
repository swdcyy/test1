package com.kuaishou.commercial.splash.presenter.SplashShakePresenter;
import gz.y2;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$b;
import nsd.u;
import yy.f;
import java.lang.String;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$a;
import android.hardware.SensorEventListener;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo;
import java.lang.StringBuilder;
import yx.j0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.hardware.SensorManager;
import com.kuaishou.commercial.splash.SplashUtils;
import android.hardware.Sensor;
import com.kwai.sdk.switchconfig.a;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import com.kwai.adclient.kscommerciallogger.snapshot.a;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import android.view.ViewStub;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import im8.f;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import yy.a1;
import gz.n3;
import java.lang.Runnable;
import android.widget.ImageView;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import java.util.Iterator;
import java.lang.Iterable;
import android.animation.Animator;
import ekd.k1;
import wl9.z;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet$Builder;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import gz.o3;
import android.animation.Animator$AnimatorListener;
import java.lang.Float;
import yy.x0;
import usd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import hn5.h0;
import io.reactivex.subjects.PublishSubject;
import bz.a;
import android.view.View$OnTouchListener;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$setConvertTouchListenerIfNeed$1;
import msd.l;
import lnc.y0;
import android.animation.Keyframe;
import ky8.a;
import android.animation.PropertyValuesHolder;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter$d;
import qrd.l1;

public final class SplashShakePresenter extends y2	// class@0015d7
{
    public float[] U0;
    public float V0;
    public int W0;
    public int X0;
    public long Y0;
    public final float[] Z;
    public AnimatorSet Z0;
    public KwaiImageView a1;
    public boolean b1;
    public final int c1;
    public static final SplashShakePresenter$b d1;

    static {
       SplashShakePresenter.d1 = new SplashShakePresenter$b(null);
    }
    public void SplashShakePresenter(){
       int i;
       super();
       float[] uofloatArray = new float[3];
       this.Z = uofloatArray;
       uofloatArray = new float[3];
       this.U0 = uofloatArray;
       this.X0 = 3;
       f uof = this.X8();
       uof = (uof != null)? uof.mShakeAcceleration: 80;
       this.c1 = uof;
       this.V9("SplashShakePresenter");
       this.Q9(new SplashShakePresenter$a(this));
       return;
    }
    public void B9(SplashInfo$InteractionInfo p0){
       Object[] objArray;
       String str1;
       SplashShakePresenter splashShakeP = SplashShakePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, splashShakeP, "7")) {
          return;
       }
       super.B9(p0);
       if (p0 != null) {
          SplashInfo$InteractionInfo mShakeInfo = p0.mShakeInfo;
          if (mShakeInfo != null) {
             boolean b = false;
             if (!PatchProxy.applyVoidOneRefs(mShakeInfo, this, splashShakeP, "8") && mShakeInfo != null) {
                this.W0 = mShakeInfo.mAccelerationThreshold;
                this.M9(mShakeInfo.mTriggerCount);
                Object[] objArray1 = new Object[b];
                j0.f(this.x9(), " need "+mShakeInfo.mAccelerationThreshold+" mapTo "+this.W0+' '+"mNeedTriggerCount: "+this.h9(), objArray1);
                int i = 1;
                if (this.h9() <= 0) {
                   this.M9(i);
                }
                objArray = null;
                if (!PatchProxy.applyVoid(objArray, this, splashShakeP, "21")) {
                   Context context = this.getContext();
                   a.m(context);
                   Object systemServic = context.getSystemService("sensor");
                   if (systemServic instanceof SensorManager) {
                      objArray = systemServic;
                   }
                   this.R9(objArray);
                   if (SplashUtils.I()) {
                      Object[] objArray2 = new Object[b];
                      j0.f(this.x9(), "isSplashFinished", objArray2);
                   }else {
                      SensorManager sensorManage = this.s9();
                      if (sensorManage != null) {
                         Sensor defaultSenso = sensorManage.getDefaultSensor(i);
                         if (defaultSenso != null) {
                            sensorManage.registerListener(this.q9(), defaultSenso, 3);
                         }
                      }
                   }
                }
             }
          label_00b3 :
             if (!PatchProxy.applyVoidOneRefs(p0, this, splashShakeP, "9") && a.t().d("splashInteractionDebugLog", b)) {
                objArray = new Object[b];
                j0.f(this.x9(), "start splash shake session log", objArray);
                this.D9();
                Span span = SegmentManager.Instance.loadSegment(this.d9(), "SHAKE_CONVERT").f("下发值");
                span.d("interactive_style", String.valueOf(p0.mInteractiveStyle));
                mShakeInfo = p0.mShakeInfo;
                String str = "-1";
                if (mShakeInfo != null) {
                   str1 = String.valueOf(mShakeInfo.mAccelerationThreshold);
                   if (str1 != null) {
                   label_0104 :
                      span.d("threshold_acceleration", str1);
                      p0 = p0.mShakeInfo;
                      if (p0 != null) {
                         String str2 = String.valueOf(p0.mTriggerCount);
                         if (str2 != null) {
                            str = str2;
                         }
                      }
                      span.d("threshold_acceleration_count", str);
                   }
                }
                str1 = str;
                goto label_0104 ;
             }
          }
       }
       return;
    }
    public void C9(SplashInfo$InteractionInfo p0){
       ViewStub viewStub;
       SplashInfo$ShakeInfo mLiveTitle;
       ViewGroup viewGroup;
       TextView textView;
       ViewGroup viewGroup1;
       SplashShakePresenter splashShakeP = SplashShakePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, splashShakeP, "14")) {
          return;
       }
       if (this.c9()) {
          viewStub = this.Z8();
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0084);
          }
       }else {
          viewStub = this.Z8();
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0083);
          }
       }
       if (p0 != null && p0.mShakeInfo != null) {
          viewStub = this.Z8();
          if (viewStub != null && viewStub.getParent() != null) {
             this.K9(viewStub.inflate());
             f uof = this.a9();
             if (uof != null) {
                uof.set(this.Y8());
             }
          }
          int i = 0;
          if (this.Y8() == null) {
             Object[] objArray = new Object[i];
             j0.c(this.x9(), "mShakeLayout error, will not show Shake", objArray);
             return;
          }else {
             int i1 = 0x7f0a015a;
             if (this.b9()) {
                mLiveTitle = p0.mShakeInfo.mLiveTitle;
                if (mLiveTitle != null) {
                   viewGroup = (mLiveTitle.length() > 0)? 1: null;
                   if (viewGroup == 1) {
                      viewGroup = this.Y8();
                      if (viewGroup != null) {
                         textView = viewGroup.findViewById(i1);
                         if (textView != null) {
                            textView.setText(p0.mShakeInfo.mLiveTitle);
                         }
                      }
                   }else {
                   label_0096 :
                      mLiveTitle = p0.mShakeInfo.mTitle;
                      if (mLiveTitle != null) {
                         viewGroup = (mLiveTitle.length() > 0)? 1: null;
                         if (viewGroup == 1) {
                            viewGroup = this.Y8();
                            if (viewGroup != null) {
                               textView = viewGroup.findViewById(i1);
                               if (textView != null) {
                                  textView.setText(p0.mShakeInfo.mTitle);
                               }
                            }
                         }
                      }
                   }
                }else {
                   goto label_0096 ;
                }
             }else {
                goto label_0096 ;
             }
          label_00bc :
             mLiveTitle = p0.mShakeInfo.mSubtitle;
             if (mLiveTitle != null) {
                viewGroup = (mLiveTitle.length() > 0)? 1: null;
                if (viewGroup == 1) {
                   viewGroup = this.Y8();
                   if (viewGroup != null) {
                      textView = viewGroup.findViewById(R.id.ad_splash_shake_sub_title);
                      if (textView != null) {
                         textView.setText(p0.mShakeInfo.mSubtitle);
                      }
                   }
                }
             }
          label_00e5 :
             KwaiImageView kwaiImageVie = null;
             if (this.c9()) {
                if (!PatchProxy.applyVoidOneRefs(p0, this, splashShakeP, "15")) {
                   String str = this.l9();
                   if (str != null) {
                      if (str.length() > 0) {
                         i = 1;
                      }
                      if (i == 1) {
                         viewGroup1 = this.Y8();
                         if (viewGroup1 != null) {
                            TextView textView1 = viewGroup1.findViewById(R.id.ad_splash_personal_tip);
                            if (textView1 != null) {
                               textView1.setText(this.l9());
                            }
                         }
                      }
                   }
                label_011c :
                   viewGroup1 = this.Y8();
                   if (viewGroup1 != null) {
                      kwaiImageVie = viewGroup1.findViewById(0x7f0a014b);
                   }
                   this.a1 = kwaiImageVie;
                   a1.a.a(kwaiImageVie);
                   this.ba(this.a1, p0.mShakeInfo.mClickDisabled);
                }
             }else if(PatchProxy.applyVoid(kwaiImageVie, this, splashShakeP, "16")){
                viewGroup1 = this.Y8();
                if (viewGroup1 != null) {
                   KwaiImageView kwaiImageVie1 = viewGroup1.findViewById(R.id.ad_splash_shake_hand);
                   if (kwaiImageVie1 != null) {
                      kwaiImageVie1.postDelayed(new n3(kwaiImageVie1, this), 480);
                   }
                }
             }
             this.ba(this.m8().findViewById(R.id.ad_splash_shake_circle), p0.mShakeInfo.mClickDisabled);
          }
       }
       return;
    }
    public void E9(){
       if (PatchProxy.applyVoid(null, this, SplashShakePresenter.class, "24")) {
          return;
       }
       SegmentManager segmentManag = (this.d9().length() > 0)? 1: null;
       if (segmentManag) {
          SegmentManager.Instance.loadSegment(this.d9(), "SHAKE_CONVERT").f("最大互动").d("acceleration", String.valueOf(this.V0));
       }
       return;
    }
    public void I9(){
       float[] uofloatArray = new float[3];
       this.U0 = uofloatArray;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SplashShakePresenter.class, "22")) {
          return;
       }
       super.J8();
       SplashShakePresenter tZ0 = this.Z0;
       if (tZ0 != null) {
          ArrayList childAnimati = tZ0.getChildAnimations();
          if (childAnimati != null) {
             Iterator iterator = childAnimati.iterator();
             while (iterator.hasNext()) {
                iterator.next().removeAllListeners();
             }
          }
       }
       tZ0 = this.Z0;
       if (tZ0 != null) {
          tZ0.removeAllListeners();
       }
       tZ0 = this.Z0;
       if (tZ0 != null) {
          tZ0.cancel();
       }
       SensorManager sensorManage = this.s9();
       if (sensorManage != null) {
          sensorManage.unregisterListener(this.q9());
       }
       this.H9();
       k1.n(this);
       return;
    }
    public void P8(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashShakePresenter.class, "23")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.b;
       if (p0 - (float)0 >= 0) {
          this.Y9((float)Math.sqrt((double)p0), 0, 0);
       }
       return;
    }
    public void X9(){
       AnimatorSet$Builder uBuilder;
       SplashShakePresenter splashShakeP = SplashShakePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, splashShakeP, "17")) {
          return;
       }
       if (this.c9() && !PatchProxy.applyVoid(objArray, this, splashShakeP, "20")) {
          ViewGroup viewGroup = this.Y8();
          View view = (viewGroup != null)? viewGroup.findViewById(R.id.ad_splash_personal_tip): objArray;
          ViewGroup viewGroup1 = this.Y8();
          View view1 = (viewGroup1 != null)? viewGroup1.findViewById(R.id.ad_splash_shake_normal): objArray;
          ViewGroup viewGroup2 = this.Y8();
          if (viewGroup2 != null) {
             objArray = viewGroup2.findViewById(R.id.ad_splash_shake_hand);
          }
          this.Z0 = new AnimatorSet();
          a1 a = a1.a;
          ValueAnimator valueAnimato = a.c(this.a1, true);
          ValueAnimator valueAnimato1 = a.b(this.a1);
          ValueAnimator valueAnimato2 = a.e(view);
          ValueAnimator valueAnimato3 = a.d(view1, false);
          ValueAnimator valueAnimato4 = a.d(view1, true);
          SplashShakePresenter tZ0 = this.Z0;
          if (tZ0 != null) {
             uBuilder = tZ0.play(valueAnimato);
             if (uBuilder != null) {
                uBuilder.before(valueAnimato1);
             }
          }
          tZ0 = this.Z0;
          if (tZ0 != null) {
             tZ0.setInterpolator(new LinearInterpolator());
          }
          tZ0 = this.Z0;
          if (tZ0 != null) {
             uBuilder = tZ0.play(valueAnimato1);
             if (uBuilder != null) {
                uBuilder = uBuilder.with(valueAnimato3);
                if (uBuilder != null) {
                   AnimatorSet$Builder uBuilder1 = uBuilder.with(valueAnimato4);
                   if (uBuilder1 != null) {
                      uBuilder1.with(valueAnimato2);
                   }
                }
             }
          }
          splashShakeP = this.Z0;
          if (splashShakeP != null) {
             splashShakeP.addListener(new o3(this, objArray));
          }
          splashShakeP = this.Z0;
          if (splashShakeP != null) {
             splashShakeP.start();
          }
       }
    label_00af :
       return;
    }
    public final void Y9(float p0,float p1,float p2){
       f obj;
       boolean b;
       x0 ox0;
       SplashShakePresenter splashShakeP = SplashShakePresenter.class;
       if (PatchProxy.isSupport(splashShakeP) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, SplashShakePresenter.class, "2")) {
          return;
       }
       if (SplashUtils.z(this.V8())) {
          return;
       }
       p0 = ((p0 * p0) + (p1 * p1)) + (p2 * p2);
       Object[] objArray = null;
       if (p0 - this.V0 > 0) {
          this.V0 = p0;
          if (!PatchProxy.applyVoid(objArray, this, splashShakeP, "1")) {
             obj = this.e9();
             if (obj != null) {
                ox0 = obj.get();
                if (ox0 != null) {
                   ox0.v(this.V0);
                }
             }
          }
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       j0.f(this.x9(), "checkShakeConvert magnitude: "+p0+" , mMaxShake: "+this.V0, objArray1);
       if (p0 - (float)q.n(this.W0, this.c1) >= 0) {
          this.U9((this.u9() + 1));
          Object[] objArray2 = new Object[i];
          j0.f(this.x9(), " mTriggerCount:"+this.u9(), objArray2);
          if (this.u9() >= this.h9()) {
             if (!PatchProxy.isSupport(splashShakeP) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, splashShakeP, "4")) {
                if (PatchProxy.isSupport(splashShakeP)) {
                   obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, splashShakeP, "6");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   label_010b :
                      if (b) {
                         obj = this.e9();
                         if (obj != null) {
                            ox0 = obj.get();
                            if (ox0 != null) {
                               ox0.e();
                            }
                         }
                         if (!PatchProxy.isSupport(splashShakeP) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, splashShakeP, "12")) {
                            this.aa(p0);
                         }
                         this.Z9();
                      }else if(PatchProxy.isSupport(splashShakeP) && (PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, splashShakeP, "5") || this.b1 != null)){
                         this.b1 = true;
                         if ((this.d9()).length() > 0) {
                            i = 1;
                         }
                         if (i) {
                            SegmentManager.Instance.loadSegment(this.d9(), "SHAKE_CONVERT").f("消费拦截").d("xiaofei_forbid_shake_magnitude", String.valueOf(p0));
                         }
                      }
                   }
                }
                h0 oh0 = d.a(0x57892c02);
                f uof = this.e9();
                if (uof != null) {
                   x0 ox01 = uof.get();
                   if (ox01 != null) {
                      objArray = ox01.q();
                   }
                }
                b = oh0.qG("", p0, objArray);
                goto label_010b ;
             }
          }else {
             this.aa(p0);
          }
       }
       return;
    }
    public final void Z9(){
       if (PatchProxy.applyVoid(null, this, SplashShakePresenter.class, "3")) {
          return;
       }
       SplashUtils.S(500);
       SensorManager sensorManage = this.s9();
       if (sensorManage != null) {
          sensorManage.unregisterListener(this.q9());
       }
       SplashUtils.O(this.V8());
       Runnable runnable = this.j9();
       if (runnable != null) {
          runnable.run();
       }
       PublishSubject publishSubje = this.W8();
       if (publishSubje != null) {
          publishSubje.onNext(new a(2));
       }
       return;
    }
    public final void aa(float p0){
       SplashShakePresenter splashShakeP = SplashShakePresenter.class;
       if (PatchProxy.isSupport(splashShakeP) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, splashShakeP, "10")) {
          return;
       }
       SegmentManager segmentManag = (this.d9().length() > 0)? 1: null;
       if (segmentManag) {
          SegmentManager.Instance.loadSegment(this.d9(), "SHAKE_CONVERT").f("达到阈值").d("convert_acceleration", String.valueOf(p0));
       }
       return;
    }
    public final void ba(View p0,boolean p1){
       SplashShakePresenter splashShakeP = SplashShakePresenter.class;
       if (PatchProxy.isSupport(splashShakeP) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, splashShakeP, "18")) {
          return;
       }
       if (p0 != null && !p1) {
          p0.setOnTouchListener(this.m9());
          y0.a(p0, new SplashShakePresenter$setConvertTouchListenerIfNeed$1(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashShakePresenter.class, "13")) {
          return;
       }
       super.doBindView(p0);
       ViewStub viewStub = (p0 != null)? p0.findViewById(R.id.splash_shake_stub): null;
       this.L9(viewStub);
       return;
    }
    public final void ga(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashShakePresenter.class, "19")) {
          return;
       }
       if (this.S8()) {
          this.H9();
          return;
       }else {
          Keyframe keyframe = Keyframe.ofFloat(0.13f, 16.00f);
          keyframe.setInterpolator(new LinearInterpolator());
          Keyframe keyframe1 = Keyframe.ofFloat(0.38f, -16.00f);
          keyframe1.setInterpolator(new a(0x3e5c28f6, 0x3f1c28f6, 0x3eb5c28f, 0x3f800000));
          Keyframe keyframe2 = Keyframe.ofFloat(0x3f200000, 16.00f);
          keyframe2.setInterpolator(new LinearInterpolator());
          Keyframe keyframe3 = Keyframe.ofFloat(0x3f600000, -16.00f);
          keyframe3.setInterpolator(new a(0x3e5c28f6, 0x3f1c28f6, 0x3eb5c28f, 0x3f800000));
          Keyframe keyframe4 = Keyframe.ofFloat(0x3f800000, 0);
          keyframe4.setInterpolator(new LinearInterpolator());
          Keyframe[] keyframeArra = new Keyframe[]{Keyframe.ofFloat(0, 0),keyframe,keyframe,keyframe1,keyframe2,keyframe3,keyframe4};
          PropertyValuesHolder propertyValu = PropertyValuesHolder.ofKeyframe("shake", keyframeArra);
          a.o(propertyValu, "PropertyValuesHolder.ofK…      kf3, kf4, kf5, kf6\)");
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{propertyValu};
          ValueAnimator valueAnimato = ValueAnimator.ofPropertyValuesHolder(propertyValu1);
          valueAnimato.setDuration(800);
          valueAnimato.addUpdateListener(new SplashShakePresenter$c(this, p0));
          valueAnimato.addListener(new SplashShakePresenter$d(this, p0));
          valueAnimato.start();
          this.J9(valueAnimato);
          return;
       }
    }
}
