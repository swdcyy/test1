package com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter;
import gz.y2;
import com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter$b;
import nsd.u;
import java.util.ArrayList;
import yy.f;
import java.lang.String;
import com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter$a;
import android.hardware.SensorEventListener;
import java.lang.Object;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo;
import com.kuaishou.android.model.ads.SplashInfo$AxisDirection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import wl9.z;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import hn5.h0;
import yy.x0;
import java.lang.Integer;
import java.lang.Runnable;
import io.reactivex.subjects.PublishSubject;
import bz.a;
import android.view.View$OnTouchListener;
import com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1;
import msd.l;
import lnc.y0;

public abstract class SplashBaseRotatePresenter extends y2	// class@0015cc
{
    public double[] U0;
    public ArrayList V0;
    public int W0;
    public final int X0;
    public boolean Y0;
    public double[] Z;
    public static final SplashBaseRotatePresenter$b Z0;

    static {
       SplashBaseRotatePresenter.Z0 = new SplashBaseRotatePresenter$b(null);
    }
    public void SplashBaseRotatePresenter(){
       int i;
       super();
       this.Z = new double[3]{0,0,0};
       this.U0 = new double[3]{0,0,0};
       this.V0 = new ArrayList();
       this.W0 = 3;
       f uof = this.X8();
       uof = (uof != null)? uof.mRotateDegree: 35;
       this.X0 = uof;
       this.V9("SplashBaseRotatePresenter");
       this.Q9(new SplashBaseRotatePresenter$a(this));
       return;
    }
    public static void ba(SplashBaseRotatePresenter p0,int p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.aa(p1, p2);
       return;
    }
    public void B9(SplashInfo$InteractionInfo p0){
       Object[] objArray;
       String str;
       Object[] obj;
       SplashBaseRotatePresenter splashBaseRo = SplashBaseRotatePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, splashBaseRo, "8")) {
          return;
       }
       if (p0 != null && p0.mRotationInfo != null) {
          super.B9(p0);
          SplashInfo$InteractionInfo mRotationInf = p0.mRotationInfo;
          boolean b = false;
          if (!PatchProxy.applyVoidOneRefs(mRotationInf, this, splashBaseRo, "13") && mRotationInf != null) {
             if (!PatchProxy.applyVoidOneRefs(mRotationInf, this, splashBaseRo, "4")) {
                if (mRotationInf.mXAxisDirection == null) {
                   mRotationInf.mXAxisDirection = new SplashInfo$AxisDirection();
                }
                if (mRotationInf.mYAxisDirection == null) {
                   mRotationInf.mYAxisDirection = new SplashInfo$AxisDirection();
                }
                if (mRotationInf.mZAxisDirection == null) {
                   mRotationInf.mZAxisDirection = new SplashInfo$AxisDirection();
                }
                this.M9(mRotationInf.mTriggerCount);
                if (this.h9() <= 0) {
                   this.M9(1);
                }
             }
             SplashBaseRotatePresenter tV0 = this.V0;
             tV0.add(mRotationInf.mXAxisDirection);
             tV0.add(mRotationInf.mYAxisDirection);
             tV0.add(mRotationInf.mZAxisDirection);
             Iterator iterator = tV0.iterator();
             int i = 0;
             while (iterator.hasNext()) {
                obj = iterator.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                obj = new Object[b];
                j0.f(this.x9(), i+" need angle degree:"+obj.mRotateDegree+" need direction: "+obj.mRotateDirection, obj);
                i = i1;
             }
             obj = new Object[b];
             j0.f(this.x9(), "mNeedTriggerCount: "+this.h9(), obj);
             objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, splashBaseRo, "16")) {
                Context context = this.getContext();
                a.m(context);
                Object[] systemServic = context.getSystemService("sensor");
                if (systemServic instanceof SensorManager) {
                   objArray = systemServic;
                }
                this.R9(objArray);
                if (SplashUtils.I()) {
                   systemServic = new Object[b];
                   j0.f(this.x9(), "isSplashFinished", systemServic);
                }else {
                   SensorManager sensorManage = this.s9();
                   if (sensorManage != null) {
                      Sensor defaultSenso = sensorManage.getDefaultSensor(4);
                      if (defaultSenso != null) {
                         sensorManage.registerListener(this.q9(), defaultSenso, 1);
                      }
                   }
                }
             }
          }
       label_011b :
          if (!PatchProxy.applyVoidOneRefs(p0, this, splashBaseRo, "9") && a.t().d("splashInteractionDebugLog", b)) {
             objArray = new Object[b];
             j0.f(this.x9(), "start splash rotate session log", objArray);
             if (this.V0.size() >= 3) {
                this.D9();
                Span span = SegmentManager.Instance.loadSegment(this.d9(), "ROTATE_CONVERT").f("下发值");
                span.d("interactive_style", String.valueOf(p0.mInteractiveStyle));
                span.d("threshold_rotate_x", String.valueOf(this.V0.get(b).mRotateDegree));
                span.d("threshold_rotate_y", String.valueOf(this.V0.get(1).mRotateDegree));
                span.d("threshold_rotate_z", String.valueOf(this.V0.get(2).mRotateDegree));
                p0 = p0.mRotationInfo;
                if (p0 != null) {
                   str = String.valueOf(p0.mTriggerCount);
                   if (str != null) {
                   label_01b2 :
                      span.d("threshold_rotate_count", str);
                      span.d("threshold_rotate_x_direction", String.valueOf(this.V0.get(1).mRotateDirection));
                      span.d("threshold_rotate_y_direction", String.valueOf(this.V0.get(2).mRotateDirection));
                      span.d("threshold_rotate_z_direction", String.valueOf(this.V0.get(2).mRotateDirection));
                   }
                }
                str = "-1";
                goto label_01b2 ;
             }
          }
       }
    label_01f0 :
       return;
    }
    public void C9(SplashInfo$InteractionInfo p0){
       ViewGroup viewGroup;
       TextView textView;
       SplashInfo$RotationInfo mLiveTitle;
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashBaseRotatePresenter.class, "15")) {
          return;
       }
       if (p0 != null && p0.mRotationInfo != null) {
          ViewStub viewStub = this.Z8();
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
             j0.c(this.x9(), "mRotateLayout error, will not show rotate", objArray);
             return;
          }else {
             SplashInfo$RotationInfo mTitle = p0.mRotationInfo.mTitle;
             if (mTitle != null) {
                viewGroup = (mTitle.length() > 0)? 1: null;
                if (viewGroup == 1) {
                   viewGroup = this.Y8();
                   if (viewGroup != null) {
                      textView = viewGroup.findViewById(R.id.ad_splash_rotate_title);
                      if (textView != null) {
                         textView.setText(p0.mRotationInfo.mTitle);
                      }
                   }
                }
             }
          label_0070 :
             viewGroup = this.Y8();
             textView = (viewGroup != null)? viewGroup.findViewById(R.id.ad_splash_rotate_sub_title): null;
             if (this.b9()) {
                mLiveTitle = p0.mRotationInfo.mLiveTitle;
                if (mLiveTitle != null) {
                   SplashInfo$InteractionInfo interactionI = (mLiveTitle.length() > 0)? 1: null;
                   if (interactionI == 1) {
                      if (textView != null) {
                         textView.setText(p0.mRotationInfo.mLiveTitle);
                      }
                   }
                }
             }
             mLiveTitle = p0.mRotationInfo.mSubTitle;
             if (mLiveTitle != null) {
                if (mLiveTitle.length() > 0) {
                   i = 1;
                }
                if (i == 1 && textView != null) {
                   textView.setText(p0.mRotationInfo.mSubTitle);
                }
             }
          }
       }
    label_00ba :
       return;
    }
    public void E9(){
       if (PatchProxy.applyVoid(null, this, SplashBaseRotatePresenter.class, "19")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       SplashBaseRotatePresenter splashBaseRo = (this.d9().length() > 0)? 1: null;
       if (splashBaseRo && this.Z.length == 3) {
          Span span = SegmentManager.Instance.loadSegment(this.d9(), "ROTATE_CONVERT").f("最大互动");
          span.d("rotate_x", String.valueOf(this.Z[i1]));
          span.d("rotate_y", String.valueOf(this.Z[i]));
          span.d("rotate_z", String.valueOf(this.Z[2]));
       }
       return;
    }
    public void I9(){
       this.U0 = new double[3]{0,0,0};
    }
    public void P8(z p0){
       z a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashBaseRotatePresenter.class, "17")) {
          return;
       }
       a.p(p0, "event");
       a = p0.a;
       a.o(a, "event.mRotateDegree");
       this.U0 = a;
       p0 = p0.a;
       a.o(p0, "event.mRotateDegree");
       this.Z = p0;
       this.ma();
       this.Z9();
       return;
    }
    public boolean Y9(){
       Object[] objArray = null;
       SplashBaseRotatePresenter obj = PatchProxy.apply(objArray, this, SplashBaseRotatePresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b uob = d.a(0x57892c02);
       obj = this.U0;
       float f = (float)obj[0];
       float f1 = (float)obj[1];
       float f2 = (float)obj[2];
       f uof = this.e9();
       if (uof != null) {
          x0 ox0 = uof.get();
          if (ox0 != null) {
             objArray = ox0.q();
          }
       }
       return uob.u30("", f, f1, f2, objArray);
    }
    public abstract void Z9();
    public final void aa(int p0,boolean p1){
       SplashBaseRotatePresenter splashBaseRo = SplashBaseRotatePresenter.class;
       if (PatchProxy.isSupport(splashBaseRo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, splashBaseRo, "7")) {
          return;
       }
       SplashUtils.S(500);
       SensorManager sensorManage = this.s9();
       if (sensorManage != null) {
          sensorManage.unregisterListener(this.q9());
       }
       Runnable runnable = this.j9();
       if (runnable != null) {
          runnable.run();
       }
       if (p1) {
          f uof = this.e9();
          if (uof != null) {
             x0 ox0 = uof.get();
             if (ox0 != null) {
                ox0.a(p0);
             }
          }
       }
       PublishSubject publishSubje = this.W8();
       if (publishSubje != null) {
          publishSubje.onNext(new a(2, this.D));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashBaseRotatePresenter.class, "14")) {
          return;
       }
       super.doBindView(p0);
       ViewStub viewStub = (p0 != null)? p0.findViewById(R.id.splash_rotation_stub): null;
       this.L9(viewStub);
       return;
    }
    public final int ga(){
       return this.X0;
    }
    public final int ha(){
       return this.W0;
    }
    public final ArrayList ja(){
       return this.V0;
    }
    public final double[] ka(){
       return this.U0;
    }
    public final void la(double[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashBaseRotatePresenter.class, "10")) {
          return;
       }
       a.p(p0, "rotateDegree");
       int i = 1;
       int i1 = 0;
       int i2 = (this.d9().length() > 0)? 1: 0;
       if (i2 && p0.length == 3) {
          Span span = SegmentManager.Instance.loadSegment(this.d9(), "ROTATE_CONVERT").f("达到阈值");
          span.d("convert_rotate_x", String.valueOf(p0[i1]));
          span.d("convert_rotate_y", String.valueOf(p0[i]));
          span.d("convert_rotate_z", String.valueOf(p0[2]));
       }
       return;
    }
    public final void ma(){
       if (PatchProxy.applyVoid(null, this, SplashBaseRotatePresenter.class, "5")) {
          return;
       }
       f uof = this.e9();
       if (uof != null) {
          x0 ox0 = uof.get();
          if (ox0 != null) {
             ox0.b(this.Z);
          }
       }
       return;
    }
    public final void na(View p0,boolean p1){
       SplashBaseRotatePresenter splashBaseRo = SplashBaseRotatePresenter.class;
       if (PatchProxy.isSupport(splashBaseRo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, splashBaseRo, "6")) {
          return;
       }
       if (p0 != null && !p1) {
          p0.setOnTouchListener(this.m9());
          y0.a(p0, new SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1(this));
       }
       return;
    }
    public final void oa(int p0){
       SplashBaseRotatePresenter splashBaseRo = SplashBaseRotatePresenter.class;
       if (PatchProxy.isSupport(splashBaseRo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, splashBaseRo, "3")) {
          return;
       }
       int i = 2;
       boolean b = false;
       if (this.Y9()) {
          SplashUtils.O(this.V8());
          this.la(this.U0);
          SplashBaseRotatePresenter.ba(this, p0, b, i, null);
       }else {
          SplashBaseRotatePresenter tU0 = this.U0;
          if (!PatchProxy.applyVoidOneRefs(tU0, this, splashBaseRo, "11") && this.Y0 == null) {
             boolean b1 = true;
             this.Y0 = b1;
             int i1 = ((this.d9()).length() > 0)? 1: 0;
             if (i1 && tU0.length == 3) {
                Span span = SegmentManager.Instance.loadSegment(this.d9(), "ROTATE_CONVERT").f("消费拦截");
                span.d("xiaofei_forbid_rotate_x", String.valueOf(tU0[b]));
                span.d("xiaofei_forbid_rotate_y", String.valueOf(tU0[b1]));
                span.d("xiaofei_forbid_rotate_z", String.valueOf(tU0[i]));
             }
          }
       }
       return;
    }
}
