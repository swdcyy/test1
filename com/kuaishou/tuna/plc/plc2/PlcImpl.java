package com.kuaishou.tuna.plc.plc2.PlcImpl;
import u06.a;
import com.kuaishou.tuna.plc.plc2.PlcImpl$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import h4a.a;
import com.kwai.framework.player.core.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mLifeOwner$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mPlcViews$2;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mPlcActions$2;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mCoverClickLnr$2;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mLongVideoClickLnr$2;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mLandscapeClickLnr$2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ConcurrentHashMap;
import u06.c;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl;
import java.util.Map;
import v06.a;
import java.lang.NullPointerException;
import java.lang.Throwable;
import y06.a;
import u06.e;
import java.util.ArrayList;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import xy4.q;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.tuna.plc.plc2.view.PlcCover2Render;
import com.kuaishou.tuna.plc.plc2.view.PlcCover1Render;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.detail.plc.adapter.CoverStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import android.view.View$OnClickListener;
import e4a.a;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;
import f4a.v;
import bz4.c;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import ok.x;
import f4a.b0;
import java.lang.System;
import qrd.l1;
import tkd.b;
import tkd.d;
import u06.g;
import a16.a;
import sy4.h;
import java.lang.Enum;
import ry4.c;
import a16.a$a;
import ty4.b;
import ty4.c;
import ty4.a;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper;
import com.yxcorp.gifshow.util.rx.RxBus;
import u3a.e;
import brd.t;
import t45.d;
import brd.z;
import sy4.l;
import erd.g;
import crd.b;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper;
import java.util.Objects;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.yxcorp.gifshow.detail.plc.adapter.WeakStyleDataAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import vy4.d;
import vy4.c;
import vy4.b;
import com.yxcorp.gifshow.detail.plc.adapter.LongVideoStyleDataAdapter;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import mrd.c;
import java.lang.Integer;
import brd.y;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
import f4a.i0;

public final class PlcImpl implements a	// class@001044
{
    public a a;
    public boolean b;
    public final p c;
    public int d;
    public final p e;
    public final p f;
    public PlcLoggerWrapper g;
    public PlcClickHelper h;
    public final p i;
    public final p j;
    public final p k;
    public QPhoto l;
    public Activity m;
    public BaseFragment n;
    public PlcEntryStyleInfo$PageType o;
    public boolean p;
    public a q;
    public b r;
    public static final PlcImpl$a s;

    static {
       PlcImpl.s = new PlcImpl$a(null);
    }
    public void PlcImpl(QPhoto p0,Activity p1,BaseFragment p2,PlcEntryStyleInfo$PageType p3,boolean p4,a p5,b p6){
       a.p(p3, "pageType");
       a.p(p5, "plcLogHelperFactory");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.r = p6;
       this.c = s.c(new PlcImpl$mLifeOwner$2(this));
       this.d = 999;
       this.e = s.c(PlcImpl$mPlcViews$2.INSTANCE);
       this.f = s.c(PlcImpl$mPlcActions$2.INSTANCE);
       this.i = s.c(new PlcImpl$mCoverClickLnr$2(this));
       this.j = s.c(new PlcImpl$mLongVideoClickLnr$2(this));
       this.k = s.c(new PlcImpl$mLandscapeClickLnr$2(this));
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o().get(this.o);
    }
    public int b(){
       return this.d;
    }
    public c c(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m();
    }
    public Map d(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n();
    }
    public a e(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, PlcImpl.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.n().get(this.o);
          if (obj != null) {
             objArray = obj;
          }else {
             throw new NullPointerException("null cannot be cast to non-null type T");
          }
       }catch(java.lang.Exception e0){
          this.m().D(e0);
       }
       return objArray;
    }
    public Map f(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o();
    }
    public a g(){
       return this.a;
    }
    public final void h(PlcEntryStyleInfo$PageType p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcImpl.class, "17")) {
          return;
       }
       List list = this.o().get(p0);
       if (list == null) {
          list = new ArrayList();
          this.o().put(p0, list);
       }
       int i = (p0 == PlcEntryStyleInfo$PageType.ATTENTION_LIST)? 1: 0;
       if (i) {
          list.clear();
       }
       list.add(p1);
       return;
    }
    public final boolean i(){
       PlcImpl plcImpl = PlcImpl.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcImpl obj = PatchProxy.apply(null, this, plcImpl, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          QPhoto photo = obj.getPhoto();
          if (photo != null) {
             PlcImpl ta = this.a;
             if (ta != null) {
                PlcEntryStyleInfo plcEntryStyl = ta.e();
                if (plcEntryStyl != null) {
                   PlcImpl ta1 = this.a;
                   a.m(ta1);
                   PlcCover2Render plcCover2Ren = PatchProxy.applyOneRefs(ta1, null, q.class, "4");
                   if (plcCover2Ren != patchProxyRe) {
                   }else {
                      a.p(ta1, "plcContext");
                      PlcEntryStyleInfo plcEntryStyl1 = ta1.e();
                      if (plcEntryStyl1 != null) {
                         plcEntryStyl1 = plcEntryStyl1.mStyleInfo;
                         if (plcEntryStyl1 != null) {
                            PlcEntryStyleInfo$StyleInfo mCoverStyleT = plcEntryStyl1.mCoverStyleTemplateInfo;
                            if (mCoverStyleT != null) {
                               PlcEntryStyleInfo$CoverStyleInfo mStyleType = mCoverStyleT.mStyleType;
                               if (mStyleType != true) {
                                  if (mStyleType == 2) {
                                     plcCover2Ren = new PlcCover2Render(ta1);
                                  }
                               }else {
                                  plcCover2Ren = new PlcCover1Render(ta1);
                               }
                            }
                         }
                      }
                      plcCover2Ren = null;
                   }
                   if (plcCover2Ren != null) {
                      View view = plcCover2Ren.f(null, false);
                      try{
                         plcCover2Ren.h(view);
                         CoverStyleDataAdapter uCoverStyleD = new CoverStyleDataAdapter(photo, plcEntryStyl);
                         plcCover2Ren.e(uCoverStyleD);
                         plcCover2Ren.n(uCoverStyleD);
                         Object obj1 = PatchProxy.apply(null, this, plcImpl, "4");
                         if (obj1 == patchProxyRe) {
                            obj1 = this.i.getValue();
                         }
                         plcCover2Ren.setOnClickListener(obj1);
                         this.h(this.o, plcCover2Ren);
                         return true;
                      }catch(java.lang.Exception e0){
                         a uoa = new a();
                         uoa.b(4);
                         PlcExceptionHandler.a(uoa.c("plc plugin create cover view failed!").d(e0).a(), "PlcImpl");
                      }
                   }
                }
             }
          }
       }
    }
    public void initialize(){
       a uoa;
       PlcImpl ta;
       a uoa1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcImpl plcImpl = PlcImpl.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, plcImpl, "7")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       boolean b = true;
       this.b = b;
       PlcEntryStyleInfo plcEntryStyl = v.b().c(this.l);
       if (plcEntryStyl == null) {
          this.d = 6;
          this.m().E();
          return;
       }else {
          PlcImpl tl = this.l;
          if (tl != null) {
             tl.setPlcEntryStyleInfo(plcEntryStyl);
          }
          PlcImpl tl1 = this.l;
          a.m(tl1);
          c uoc = PatchProxy.applyOneRefs(tl1, this, plcImpl, "12");
          if (uoc != patchProxyRe) {
          }else {
             uoc = new c();
             uoc.c = this.m;
             uoc.d = this.n;
             uoc.a = tl1;
             uoc.i = this.o;
             uoc.b = tl1.getPlcEntryStyleInfo();
             PLCLogHelper pLCLogHelper = new PLCLogHelper();
             pLCLogHelper.j(pLCLogHelper.c(), tl1, null, this.r, this.n, this.q, this.o);
             pLCLogHelper.h().O(this.o);
             pLCLogHelper.k(System.currentTimeMillis());
             uoc.j = pLCLogHelper;
             uoc.k = d.a(0x565dccdc).aF();
          }
          this.a = uoc;
          if (uoc != null) {
             uoa = uoc.i();
             if (uoa != null) {
                uoa.b();
             }
          }
          tl = this.a;
          if (tl != null) {
             uoa = tl.i();
             if (uoa != null) {
                uoa.c();
             }
          }
          int i = h.a[this.o.ordinal()];
          if (i != b) {
             i = (i != 2)? 1: 4;
          }else {
             i = 3;
          }
          this.d = c.a(i, this.l, plcEntryStyl);
          a obj = PatchProxy.apply(objArray, this, plcImpl, "18");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): c.f(this.d);
          if (b1) {
             ta = this.a;
             if (ta != null) {
                obj = ta.i();
                if (obj != null) {
                   a$a.a(obj, plcEntryStyl, false, false, 4, null);
                }
             }
             ta = this.a;
             if (ta != null) {
                uoa1 = ta.i();
                if (uoa1 != null) {
                   uoa1.d(i);
                }
             }
             if (this.l()) {
                if (!PatchProxy.applyVoid(objArray, this, plcImpl, "8")) {
                   ta = this.a;
                   if (ta != null) {
                      int i1 = h.b[this.o.ordinal()];
                      if (i1 != b) {
                         if (i1 != 2) {
                            objArray1 = (i1 != 3)? objArray: new b(ta, this.m());
                         }else {
                            objArray1 = new c(ta, this.m());
                         }
                      }else {
                         objArray1 = new a(ta, this.m());
                      }
                      if (objArray1 != null) {
                         this.n().put(this.o, objArray1);
                      }
                   }
                }
                if (!PatchProxy.applyVoid(objArray, this, plcImpl, "9")) {
                   this.h = new PlcClickHelper(this);
                   ta = this.a;
                   if (ta != null) {
                      b uob = RxBus.f.f(e.class).observeOn(d.a).subscribe(new l(this));
                      a.o(uob, "RxBus.INSTANCE.toObserva¡­ePlcRefreshEvent\(event\) }");
                      ta.a(uob);
                   }
                   this.g = new PlcLoggerWrapper(this);
                }
             }else {
                this.d = 7;
             }
          }else {
             ta = this.a;
             if (ta != null) {
                obj = ta.i();
                if (obj != null) {
                   a$a.a(obj, plcEntryStyl, true, false, 4, null);
                }
             }
          }
          ta = this.a;
          if (ta != null) {
             uoa1 = ta.i();
             if (uoa1 != null) {
                uoa1.a(i, plcEntryStyl, false);
             }
          }
          this.m().E();
          return;
       }
    }
    public boolean isValid(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public final boolean j(){
       PlcEntryStyleInfo$WeakStyleInfo mStyleType;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcImpl plcImpl = PlcImpl.class;
       PlcImpl obj = PatchProxy.apply(null, this, plcImpl, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          QPhoto photo = obj.getPhoto();
          if (photo != null) {
             PlcImpl ta = this.a;
             if (ta != null) {
                PlcEntryStyleInfo plcEntryStyl = ta.e();
                if (plcEntryStyl != null) {
                   PlcImpl ta1 = this.a;
                   if (ta1 instanceof c) {
                      Objects.requireNonNull(ta1, "null cannot be cast to non-null type com.kuaishou.tuna.plc_base.render.PlcContextHolder");
                      PlcEntryStyleInfo$PageType pageType = ta1.getPageType();
                      String str = "plcContext.getPageType\(\)";
                      try{
                         a.o(pageType, str);
                         PlcEntryStyleInfo mStyleInfo = plcEntryStyl.mStyleInfo;
                         if (mStyleInfo != null) {
                            PlcEntryStyleInfo$StyleInfo mWeakStyleTe = mStyleInfo.mWeakStyleTemplateInfo;
                            if (mWeakStyleTe != null) {
                               mStyleType = mWeakStyleTe.mStyleType;
                            label_004b :
                               e uoe = q.b(pageType, mStyleType, ta1);
                               if (uoe != null) {
                                  uoe.h(uoe.f(null, false));
                                  WeakStyleDataAdapter weakStyleDat = new WeakStyleDataAdapter(photo, plcEntryStyl);
                                  uoe.e(weakStyleDat);
                                  uoe.n(weakStyleDat);
                                  Object obj1 = PatchProxy.apply(null, this, plcImpl, "6");
                                  if (obj1 != patchProxyRe) {
                                  }else {
                                     obj1 = this.k.getValue();
                                  }
                                  uoe.setOnClickListener(obj1);
                                  this.h(pageType, uoe);
                                  return true;
                               }else {
                                  return false;
                               }
                            }
                         }
                         mStyleType = 0;
                         goto label_004b ;
                      }catch(java.lang.Exception e0){
                         a uoa = new a();
                         uoa.b(4);
                         PlcExceptionHandler.a(uoa.c("plc plugin create landscape view failed!").d(e0).a(), "PlcImpl");
                      }
                   }
                }
             }
          }
       }
    }
    public final boolean k(){
       PlcImpl plcImpl = PlcImpl.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcImpl obj = PatchProxy.apply(null, this, plcImpl, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          QPhoto photo = obj.getPhoto();
          if (photo != null) {
             PlcImpl ta = this.a;
             if (ta != null) {
                PlcEntryStyleInfo plcEntryStyl = ta.e();
                if (plcEntryStyl != null) {
                   PlcImpl ta1 = this.a;
                   a.m(ta1);
                   d uod = PatchProxy.applyOneRefs(ta1, null, q.class, "5");
                   if (uod != patchProxyRe) {
                   }else {
                      a.p(ta1, "plcContext");
                      PlcEntryStyleInfo plcEntryStyl1 = ta1.e();
                      if (plcEntryStyl1 != null) {
                         plcEntryStyl1 = plcEntryStyl1.mStyleInfo;
                         if (plcEntryStyl1 != null) {
                            PlcEntryStyleInfo$StyleInfo mLongVideoSt = plcEntryStyl1.mLongVideoStyleTemplateInfo;
                            if (mLongVideoSt != null) {
                               PlcEntryStyleInfo$LongVideoStyleInfo mStyleType = mLongVideoSt.mStyleType;
                               if (mStyleType != true) {
                                  if (mStyleType != 2) {
                                     if (mStyleType == 3) {
                                        uod = new d(ta1);
                                     }
                                  }else {
                                     uod = new c(ta1);
                                  }
                               }else {
                                  uod = new b(ta1);
                               }
                            }
                         }
                      }
                      uod = null;
                   }
                   if (uod != null) {
                      View view = uod.f(null, false);
                      try{
                         uod.h(view);
                         LongVideoStyleDataAdapter longVideoSty = new LongVideoStyleDataAdapter(photo, plcEntryStyl);
                         uod.e(longVideoSty);
                         uod.n(longVideoSty);
                         Object obj1 = PatchProxy.apply(null, this, plcImpl, "5");
                         if (obj1 == patchProxyRe) {
                            obj1 = this.j.getValue();
                         }
                         uod.setOnClickListener(obj1);
                         this.h(this.o, uod);
                         return true;
                      }catch(java.lang.Exception e0){
                         a uoa = new a();
                         uoa.b(4);
                         PlcExceptionHandler.a(uoa.c("plc plugin create cover view failed!").d(e0).a(), "PlcImpl");
                      }
                   }
                }
             }
          }
       }
    }
    public final boolean l(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.p != null) {
          this.i();
          this.k();
          this.j();
       }else {
          int i = h.e[this.o.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   b = this.j();
                }
             }else {
                b = this.k();
             }
          }else {
             b = this.i();
          }
       }
       return b;
    }
    public final PlcLifecycleOwnerImpl m(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final ConcurrentHashMap n(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final ConcurrentHashMap o(){
       Object obj = PatchProxy.apply(null, this, PlcImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcImpl.class, "19")) {
          return;
       }
       this.d = 98;
       this.b = false;
       Iterator iterator = this.n().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().onRelease();
       }
       iterator = this.o().entrySet().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().getValue().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().onRelease();
          }
       }
       PlcLifecycleOwnerImpl plcLifecycle = this.m();
       Objects.requireNonNull(plcLifecycle);
       PlcLifecycleOwnerImpl plcLifecycle1 = PlcLifecycleOwnerImpl.class;
       if (!PatchProxy.applyVoid(objArray, plcLifecycle, plcLifecycle1, "53")) {
          if (!PatchProxy.applyVoid(objArray, plcLifecycle, plcLifecycle1, "50")) {
             plcLifecycle.A().onNext(Integer.valueOf(21));
          }
          plcLifecycle.z().clear();
       }
       PlcImpl ta = this.a;
       if (ta != null) {
          ta.release();
       }
       ta = this.h;
       if (ta != null && !PatchProxy.applyVoid(objArray, ta, PlcClickHelper.class, "5")) {
          ApkDownloadHelper uApkDownload = ta.b();
          if (uApkDownload != null) {
             uApkDownload.b();
          }
          PlcClickHelper a = ta.a;
          if (a != null) {
             a.c();
          }
          PlcClickHelper c = ta.c;
          if (c != null) {
             c.c();
          }
       }
    label_00c3 :
       return;
    }
}
