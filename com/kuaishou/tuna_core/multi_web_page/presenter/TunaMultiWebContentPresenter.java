package com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter$a;
import nsd.u;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter$mAutoCompose$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter$mFragments$2;
import com.kuaishou.tuna_core.multi_web_page.model.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.e;
import androidx.fragment.app.c;
import java.util.List;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$TabInfo;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import vs3.a;
import us3.i;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.util.Map;
import crd.b;
import c05.b;
import erd.g;
import brd.t;
import crd.a;
import c05.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import android.view.View;
import com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment;

public final class TunaMultiWebContentPresenter extends PresenterV2	// class@0010f5
{
    public final p p;
    public a q;
    public Fragment r;
    public c s;
    public final p t;
    public static final int u;
    public static final TunaMultiWebContentPresenter$a v;

    static {
       TunaMultiWebContentPresenter.v = new TunaMultiWebContentPresenter$a(null);
       TunaMultiWebContentPresenter.u = 0x7f0a100e;
    }
    public void TunaMultiWebContentPresenter(){
       super();
       this.p = s.c(TunaMultiWebContentPresenter$mAutoCompose$2.INSTANCE);
       this.t = s.c(TunaMultiWebContentPresenter$mFragments$2.INSTANCE);
    }
    public void E8(){
       TunaMultiWebContentPresenter obj1;
       TunaMultiWebContentPresenter s;
       a uoa1;
       TunaMultiWebContentPresenter obj4;
       String obj5;
       TunaMultiWebContentPresenter q;
       a a;
       Object obj = this;
       a uoa = a.class;
       TunaMultiWebContentPresenter tunaMultiWeb = TunaMultiWebContentPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, tunaMultiWeb, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, obj, tunaMultiWeb, "10")) {
          obj1 = obj.q;
          if (obj1 != null) {
             uoa1 = obj1.a;
             if (uoa1 != null) {
                TunaMultiWebConfigInfo mTabInfos = uoa1.mTabInfos;
                if (mTabInfos != null) {
                   if (!(q.f(mTabInfos) ^ 1)) {
                      mTabInfos = objArray;
                   }
                   if (mTabInfos != null) {
                      obj4 = obj.s;
                      e uoe1 = (obj4 != null)? obj4.beginTransaction(): objArray;
                      int i1 = mTabInfos.size();
                      int i2 = 0;
                      while (true) {
                         if (i2 < i1) {
                            try{
                               TunaMultiWebConfigInfo$TabInfo tabInfo = mTabInfos.get(i2);
                               a.o(tabInfo, "tabInfo");
                               obj5 = PatchProxy.applyOneRefs(tabInfo, obj, tunaMultiWeb, "11");
                               if (obj5 != PatchProxyResult.class) {
                               }else if(tabInfo.webViewType != 1){
                                  tabInfo = tabInfo.url;
                                  a.o(tabInfo, "tabInfo.url");
                                  obj5 = "";
                                  Context obj6 = PatchProxy.applyTwoRefs(tabInfo, obj5, obj, tunaMultiWeb, "12");
                                  if (obj6 != PatchProxyResult.class) {
                                     obj5 = obj6;
                                  }else {
                                     obj6 = this.getContext();
                                     if (obj6 != null) {
                                        KwaiYodaWebViewFragment kwaiYodaWebV = new KwaiYodaWebViewFragment();
                                        Intent intent = KwaiYodaWebViewActivity.G3(obj6, tabInfo).k(obj5).a();
                                        intent.putExtra("KEY_THEME", "3");
                                        a.o(intent, "intent");
                                        kwaiYodaWebV.setArguments(intent.getExtras());
                                        obj5 = kwaiYodaWebV;
                                     }
                                  }
                               }else {
                                  s = obj.r;
                                  if (s != null) {
                                     i oi = d.a(0x7074b578).X00(s, TunaMultiWebContentPresenter.u, tabInfo.url, "", false);
                                     if (oi.a() instanceof KwaiYodaWebViewFragment) {
                                        Bundle obj7 = oi.a();
                                        if (obj7 != null) {
                                           obj7 = obj7.getArguments();
                                           if (obj7 != null) {
                                              obj7.putString("KEY_THEME", "3");
                                           }
                                           Object obj8 = oi.a();
                                           if (obj8 != null) {
                                              obj5 = obj8;
                                           }else {
                                              throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
                                           }
                                        }else {
                                           throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment");
                                        }
                                     }
                                  }
                               }
                               obj5 = objArray;
                            }catch(java.lang.Exception e0){
                            }
                               if (obj5 != null) {
                                  String str = obj5.getClass().getName()+'_'+i2;
                                  this.R8().put(str, obj5);
                                  q = obj.q;
                                  if (q != null && q.a != null) {
                                     if (uoe1 != null) {
                                        uoe1.g(R.id.frg_tuna_multi_web, obj5, str);
                                     }
                                     s = obj.q;
                                     if (s != null) {
                                        a = s.a;
                                        if (a != null && i2 == a.mDefaultTab) {
                                           if (uoe1 != null) {
                                              uoe1.E(obj5);
                                           }
                                        }
                                     }
                                     if (uoe1 != null) {
                                        uoe1.s(obj5);
                                     }
                                  }
                               }
                            label_0141 :
                               i2 = i2 + 1;
                         }else if((this.R8().isEmpty() ^ 1) && uoe1 != null){
                            uoe1.o();
                         }
                      }
                   }
                }
             }
          }
       }
       obj1 = PatchProxy.apply(objArray, obj, tunaMultiWeb, "8");
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj1 = obj.q;
          if (obj1 != null) {
             b uob = new b(obj);
             obj4 = PatchProxy.applyOneRefs(uob, obj1, uoa, "4");
             obj1 = (obj4 != PatchProxyResult.class)? obj4: obj1.b.subscribe(uob);
          }else {
             obj1 = objArray;
          }
       }
       if (obj1 != null) {
          this.P8().c(obj1);
       }
       Object obj2 = PatchProxy.apply(objArray, obj, tunaMultiWeb, "6");
       if (obj2 != PatchProxyResult.class) {
          objArray = obj2;
       }else {
          tunaMultiWeb = obj.q;
          obj1 = obj.s;
          e uoe = (obj1 != null)? obj1.beginTransaction(): objArray;
          s = obj.s;
          List fragments = (s != null)? s.getFragments(): objArray;
          int i = (tunaMultiWeb != null && (uoe != null && !q.f(fragments)))? 1: 0;
          if (i) {
             uoa1 = new a(obj, fragments);
             if (tunaMultiWeb != null) {
                Object obj3 = PatchProxy.applyOneRefs(uoa1, tunaMultiWeb, uoa, "2");
                if (obj3 != PatchProxyResult.class) {
                   objArray = obj3;
                }else {
                   objArray = tunaMultiWeb.c.subscribe(uoa1);
                }
             }
          }
       }
       if (objArray != null) {
          this.P8().c(objArray);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TunaMultiWebContentPresenter.class, "13")) {
          return;
       }
       a uoa = this.P8();
       if (uoa.isDisposed() ^ 0x01) {
          objArray = uoa;
       }
       if (objArray != null) {
          objArray.dispose();
       }
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebContentPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final Map R8(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebContentPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public final void S8(Fragment p0,boolean p1){
       JsNativeEventCommunication jsNativeEven;
       TunaMultiWebContentPresenter tunaMultiWeb = TunaMultiWebContentPresenter.class;
       if (PatchProxy.isSupport(tunaMultiWeb) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tunaMultiWeb, "9")) {
          return;
       }
       if (p0 instanceof KwaiYodaWebViewFragment) {
          if (p1) {
             jsNativeEven = p0.zh();
             if (jsNativeEven != null) {
                jsNativeEven.o();
             }
          }else {
             jsNativeEven = p0.zh();
             if (jsNativeEven != null) {
                jsNativeEven.n();
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebContentPresenter.class, "4");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TunaMultiWebContentPresenter.class, "3")) {
          return;
       }
       this.q = this.q8(a.class);
       Fragment uFragment = this.q8(TunaMultiWebFragment.class);
       this.r = uFragment;
       this.s = uFragment.getChildFragmentManager();
       return;
    }
}
