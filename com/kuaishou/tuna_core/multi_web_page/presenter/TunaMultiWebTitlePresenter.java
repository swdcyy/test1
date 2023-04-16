package com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$a;
import nsd.u;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$mTitles$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$mAutoCompose$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView;
import com.kuaishou.tuna_core.multi_web_page.model.a;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$TabInfo;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.app.Activity;
import android.view.View;
import android.content.Context;
import ekd.p1;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.CharSequence;
import c05.c;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import crd.a;
import com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper;
import g05.b;
import com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper$logSwitchTabClick$1;
import msd.l;
import g05.b$a;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$ButtonInfo;
import com.yxcorp.utility.TextUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$c;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageView;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$b;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.appcompat.widget.LinearLayoutCompat;

public final class TunaMultiWebTitlePresenter extends PresenterV2	// class@0010fb
{
    public KwaiActionBar p;
    public KwaiImageView q;
    public KwaiImageView r;
    public LinearLayoutCompat s;
    public a t;
    public int u;
    public final p v;
    public TunaMultiWebLoggerHelper w;
    public final p x;
    public static final TunaMultiWebTitlePresenter$a y;

    static {
       TunaMultiWebTitlePresenter.y = new TunaMultiWebTitlePresenter$a(null);
    }
    public void TunaMultiWebTitlePresenter(){
       super();
       this.u = -1;
       this.v = s.c(TunaMultiWebTitlePresenter$mTitles$2.INSTANCE);
       this.x = s.c(TunaMultiWebTitlePresenter$mAutoCompose$2.INSTANCE);
    }
    public void E8(){
       TunaMultiWebTitlePresenter t;
       a a;
       TunaMultiWebConfigInfo mDefaultTab;
       TunaMultiWebTitleView tunaMultiWeb1;
       Object obj2;
       int i4;
       int i5;
       TunaMultiWebTitleView a1;
       int i6;
       TunaMultiWebTitleView obj3;
       boolean i8;
       TunaMultiWebTitleView tunaMultiWeb3;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, TunaMultiWebTitlePresenter.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, obj, TunaMultiWebTitlePresenter.class, "11")) {
          t = obj.t;
          if (t != null) {
             a = t.a;
             if (a != null) {
                TunaMultiWebConfigInfo mTabInfos = a.mTabInfos;
                if (mTabInfos != null) {
                   int i = 1;
                   TunaMultiWebConfigInfo tunaMultiWeb = (q.f(mTabInfos) ^ i)? mTabInfos: objArray;
                   if (tunaMultiWeb != null) {
                      int i1 = (tunaMultiWeb.size() > i)? 1: 0;
                      int i2 = tunaMultiWeb.size();
                      int i3 = 0;
                      while (i3 < i2) {
                         Object obj1 = tunaMultiWeb.get(i3);
                         String str = "tabInfo";
                         a.o(obj1, str);
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         if (PatchProxy.isSupport(TunaMultiWebTitlePresenter.class)) {
                            tunaMultiWeb1 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(i3), obj, TunaMultiWebTitlePresenter.class, "13");
                            if (tunaMultiWeb1 != patchProxyRe) {
                               obj2 = obj1;
                               i4 = i3;
                               i5 = i2;
                            }else {
                            label_006d :
                               Activity activity = this.getActivity();
                               if (activity != null) {
                                  a.o(activity, "it");
                                  int i7 = activity.isFinishing() ^ i;
                                  Activity uActivity = (i7)? activity: objArray;
                                  if (uActivity != null) {
                                     TunaMultiWebTitlePresenter t1 = obj.t;
                                     if (t1 != null) {
                                        a a2 = t1.a;
                                        if (a2 != null) {
                                           TunaMultiWebConfigInfo mTabInfos1 = a2.mTabInfos;
                                           if (mTabInfos1 != null) {
                                              i8 = mTabInfos1.size();
                                           label_0096 :
                                              i8 = (i8 > i)? true: false;
                                              a.o(uActivity, "aty");
                                              TunaMultiWebTitleView tunaMultiWeb2 = new TunaMultiWebTitleView(uActivity);
                                              if (PatchProxy.isSupport(TunaMultiWebTitleView.class)) {
                                                 c obj4 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(i3), tunaMultiWeb2, TunaMultiWebTitleView.class, "3");
                                                 if (obj4 != patchProxyRe) {
                                                    tunaMultiWeb3 = obj4;
                                                    i6 = 0;
                                                 label_0118 :
                                                    if (tunaMultiWeb3 != null) {
                                                       c uoc = patchProxyRe;
                                                       obj4 = patchProxyRe;
                                                       obj2 = obj1;
                                                       i4 = i3;
                                                       i5 = i2;
                                                       uoc = new c(tunaMultiWeb2, i8, uActivity, this, obj2, i4);
                                                       tunaMultiWeb3.setOnClickListener(obj4);
                                                       LinearLayoutCompat$LayoutParams layoutParams = new LinearLayoutCompat$LayoutParams(-2, -1);
                                                       layoutParams.b = 17;
                                                       layoutParams.a = 0x3f800000;
                                                       tunaMultiWeb3.setLayoutParams(layoutParams);
                                                    }else {
                                                       obj2 = obj1;
                                                       i4 = i3;
                                                       i5 = i2;
                                                    }
                                                    tunaMultiWeb1 = tunaMultiWeb2;
                                                 }
                                              }
                                              try{
                                                 a.p(obj1, str);
                                                 tunaMultiWeb2.a = p1.g(tunaMultiWeb2.i, 0x7f0d1644);
                                              }catch(java.lang.Exception e0){
                                              }
                                              tunaMultiWeb2.d = i3;
                                              a1 = tunaMultiWeb2.a;
                                              if (a1 != null) {
                                                 tunaMultiWeb2.b = a1.findViewById(0x7f0a40b5);
                                                 tunaMultiWeb2.c = a1.findViewById(0x7f0a40b6);
                                                 if (!PatchProxy.isSupport(TunaMultiWebTitleView.class) || !PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(i3), Boolean.FALSE, tunaMultiWeb2, TunaMultiWebTitleView.class, "4")) {
                                                    a1 = tunaMultiWeb2.b;
                                                    if (a1 != null) {
                                                       a1.setGravity(17);
                                                       a1.setText(obj1.title);
                                                    }
                                                    tunaMultiWeb2.c(false);
                                                 label_0115 :
                                                    tunaMultiWeb3 = tunaMultiWeb2.a;
                                                    goto label_0118 ;
                                                 }
                                              }
                                              i6 = 0;
                                              goto label_0115 ;
                                           }
                                        }
                                        i8 = 0;
                                        goto label_0096 ;
                                     }
                                  }
                               }
                            label_014e :
                               obj2 = obj1;
                               i4 = i3;
                               i5 = i2;
                               tunaMultiWeb1 = null;
                            }
                         }else {
                            goto label_006d ;
                         }
                         if (tunaMultiWeb1 != null) {
                            this.R8().add(tunaMultiWeb1);
                            a1 = tunaMultiWeb1.a;
                            if (a1 != null) {
                               TunaMultiWebTitlePresenter s = obj.s;
                               if (s != null) {
                                  s.addView(a1);
                               }
                            }
                            t = obj.t;
                            if (t != null) {
                               a = t.a;
                               if (a != null) {
                                  mTabInfos = a.mDefaultTab;
                                  i6 = i4;
                               label_0179 :
                                  int b = (i6 == mTabInfos)? true: false;
                                  tunaMultiWeb1.c(b);
                                  if (b) {
                                     obj3 = obj2;
                                     obj.S8(obj3, "PASSIVE");
                                     obj.V8(obj3);
                                  }
                                  if (!i1) {
                                     b = 8;
                                     if (!PatchProxy.isSupport(TunaMultiWebTitleView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b), tunaMultiWeb1, TunaMultiWebTitleView.class, "5")) {
                                        obj3 = tunaMultiWeb1.c;
                                        if (obj3 != null) {
                                           obj3.setVisibility(b);
                                        }
                                     }
                                  }
                               }
                            }
                            i6 = i4;
                            mTabInfos = null;
                            goto label_0179 ;
                         }else {
                            i6 = i4;
                         }
                      label_01ac :
                         i3 = i6 + 1;
                         i2 = i5;
                         objArray = null;
                         i = 1;
                      }
                   }
                }
             }
          }
       }
       t = obj.t;
       if (t != null) {
          a = t.a;
          if (a != null) {
             mDefaultTab = a.mDefaultTab;
          label_01c0 :
             obj.u = mDefaultTab;
             return;
          }
       }
       mDefaultTab = 0;
       goto label_01c0 ;
    }
    public void J8(){
       TunaMultiWebTitlePresenter tunaMultiWeb = TunaMultiWebTitlePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, tunaMultiWeb, "14")) {
          return;
       }
       a uoa = PatchProxy.apply(objArray, this, tunaMultiWeb, "2");
       if (uoa == PatchProxyResult.class) {
          uoa = this.x.getValue();
       }
       if (uoa.isDisposed() ^ 0x01) {
          objArray = uoa;
       }
       if (objArray != null) {
          objArray.dispose();
       }
       return;
    }
    public final TunaMultiWebLoggerHelper P8(){
       Activity obj = PatchProxy.apply(null, this, TunaMultiWebTitlePresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.w == null) {
          obj = this.getActivity();
          if (obj != null) {
             a.o(obj, "aty");
             this.w = new TunaMultiWebLoggerHelper(obj);
          }
       }
       return this.w;
    }
    public final List R8(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebTitlePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final void S8(TunaMultiWebConfigInfo$TabInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaMultiWebTitlePresenter.class, "10")) {
          return;
       }
       TunaMultiWebLoggerHelper tunaMultiWeb = this.P8();
       if (tunaMultiWeb != null && !PatchProxy.applyVoidTwoRefs(p0, p1, tunaMultiWeb, TunaMultiWebLoggerHelper.class, "4")) {
          a.p(p0, "tabInfo");
          a.p(p1, "active");
          b.a.a("SWITCH_TAB", new TunaMultiWebLoggerHelper$logSwitchTabClick$1(p1, p0, tunaMultiWeb.a()));
       }
       return;
    }
    public final void V8(TunaMultiWebConfigInfo$TabInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebTitlePresenter.class, "12")) {
          return;
       }
       TunaMultiWebConfigInfo$TabInfo buttonInfo = p0.buttonInfo;
       TunaMultiWebConfigInfo$ButtonInfo uButtonInfo = null;
       TunaMultiWebConfigInfo$ButtonInfo iconUrl = (buttonInfo != null)? buttonInfo.iconUrl: uButtonInfo;
       TunaMultiWebConfigInfo$ButtonInfo scheme = (buttonInfo != null)? buttonInfo.scheme: uButtonInfo;
       int i = 0;
       scheme = (!TextUtils.x(iconUrl) && !TextUtils.x(scheme))? 1: 0;
       if (scheme) {
          TunaMultiWebTitlePresenter tr = this.r;
          if (tr != null) {
             TunaMultiWebConfigInfo$TabInfo buttonInfo1 = p0.buttonInfo;
             if (buttonInfo1 != null) {
                uButtonInfo = buttonInfo1.iconUrl;
             }
             tr.setImageURI(uButtonInfo);
          }
          TunaMultiWebTitlePresenter tp = this.p;
          if (tp != null) {
             tp.l(new TunaMultiWebTitlePresenter$c(this, p0));
          }
       }
       TunaMultiWebTitlePresenter tr1 = this.r;
       if (tr1 != null) {
          if (!scheme) {
             i = 4;
          }
          tr1.setVisibility(i);
       }
       return;
    }
    public void doBindView(View p0){
       LinearLayoutCompat linearLayout1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebTitlePresenter.class, "4")) {
          return;
       }
       LinearLayoutCompat linearLayout = null;
       KwaiActionBar kwaiActionBa = (p0 != null)? p0.findViewById(R.id.kab_tuna_multi_web): linearLayout;
       this.p = kwaiActionBa;
       if (kwaiActionBa != null) {
          kwaiActionBa.h(new TunaMultiWebTitlePresenter$b(this));
       }
       TunaMultiWebTitlePresenter tp = this.p;
       KwaiImageView kwaiImageVie = (tp != null)? tp.findViewById(R.id.left_btn): linearLayout;
       this.q = kwaiImageVie;
       tp = this.p;
       kwaiImageVie = (tp != null)? tp.findViewById(R.id.right_btn): linearLayout;
       this.r = kwaiImageVie;
       tp = this.p;
       if (tp != null) {
          linearLayout = tp.findViewById(0x7f0a3f6a);
       }
       this.s = linearLayout;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TunaMultiWebTitlePresenter.class, "3")) {
          return;
       }
       this.t = this.q8(a.class);
       return;
    }
}
