package com.kuaishou.commercial.s;
import nl9.u;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.String;
import com.kwai.framework.activitycontext.ActivityContext;
import mxb.j0;
import mxb.i0;
import cw.c0;
import erd.g;
import ml8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qx.l;
import com.kuaishou.commercial.home.c;
import com.yxcorp.gifshow.ad.detail.presenter.log.b;
import nx8.o;
import com.yxcorp.utility.RomUtils;
import android.net.Uri;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.Throwable;
import yx.j0;
import java.io.Closeable;
import ekd.p;
import mxb.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.commercial.photoreduce.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import tw.j;
import com.kwai.component.photo.reduce.model.ReduceMode;
import ky.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import mxb.c;
import android.view.View;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.commercial.photoreduce.d$a;
import java.util.List;
import com.kuaishou.commercial.photoreduce.a;
import java.util.Collection;
import ekd.q;
import android.graphics.Rect;
import com.kuaishou.commercial.photoreduce.d;
import kzc.d;
import android.app.Activity;
import java.util.Objects;
import ky.b;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import ky.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.commercial.photoreduce.c$a;
import com.kuaishou.commercial.photoreduce.c;
import ky.d;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import ky.e;
import com.yxcorp.gifshow.ad.report.ReportModuleUseTools;
import r49.a;
import com.yxcorp.gifshow.ad.reserve.model.LocalReserveAppData;
import nx8.k;
import android.text.SpannableStringBuilder;
import z1.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import y17.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import cw.d0;
import java.lang.Integer;
import cw.a0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.download.b;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import mxb.r;
import com.yxcorp.gifshow.photoad.e;
import com.yxcorp.gifshow.photoad.d;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import mxb.k;
import mxb.l;
import cw.v;
import msd.l;
import com.yxcorp.gifshow.ad.AdProcess;
import brd.t;
import wkd.b;
import u49.c;
import com.kuaishou.commercial.r;
import erd.o;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.b;
import crd.b;
import rz8.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.f;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import rz8.d;
import io.reactivex.internal.functions.Functions;
import ip.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import cw.y;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import android.content.Context;
import k59.b2;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import nl9.f;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment$a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragmentV2;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment;
import com.kuaishou.commercial.p;
import lnc.u1;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import r49.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.j;
import nx8.p;
import ekd.x0;
import android.content.pm.PackageManager;
import mxb.f0;
import androidx.fragment.app.Fragment;
import kotlin.Triple;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import hn5.n;
import hn5.m;
import gsa.i0;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import com.kwai.framework.abtest.f;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.CommercialKtUtil;
import cw.u;
import java.lang.Runnable;
import ekd.k1;
import tkd.b;
import tkd.d;
import nl9.b;
import java.util.ArrayList;
import c19.c;
import s29.b;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import ny8.l;
import mxb.h0;
import i59.a;
import qw.f;
import android.hardware.SensorManager;
import com.kuaishou.commercial.splash.SplashUtils;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import msd.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable;
import com.kuaishou.commercial.q;
import v19.e;
import wl9.o;
import org.json.JSONObject;
import lnc.k;
import ny.a;
import nl9.b0;
import com.kuaishou.commercial.log.AdLogPhotoImpressionUtils;
import nl9.i0;
import zl9.c;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.commercial.component.f;
import com.kuaishou.commercial.component.c;
import fg6.a;
import com.google.gson.Gson;
import c59.j;
import java.lang.Number;
import nl9.l;
import nx8.g;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import rz8.b;
import sy8.k;
import com.kuaishou.commercial.splash.y;
import com.kuaishou.commercial.splash.v;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter;
import c19.d;
import s29.c;
import java.util.Set;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.ad.challenge.ranklist.RankListFragment;
import mxb.o;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import g4a.c;
import com.yxcorp.gifshow.detail.plc.helper.ad.PlcAdDataWrapper;
import brd.y;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import m29.c;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import m29.a;
import android.widget.ImageButton;
import cw.x;
import lnc.g;
import cw.b0;
import cw.e0;
import n49.s;
import n49.b;
import dy.a;
import dy.e;
import android.text.TextPaint;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup;
import i2b.a;
import cw.w;
import lnc.y0;
import com.yxcorp.gifshow.photoad.game.d;
import java.util.Iterator;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import nxb.l;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;

public class s implements u	// class@001542
{

    public void s(){
       super();
    }
    public static void F(BaseFeed p0,PlcEntryStyleInfo p1,String p2){
       if (!ActivityContext.g().h()) {
          i0.a().j(803, p0, p1).q("deeplink", p2).d(new c0(p2)).a();
       }
       return;
    }
    public void A2(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "53")) {
          return;
       }
       p0.add(new l());
       p0.add(new c());
       p0.add(new b());
       return;
    }
    public void BV(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "35")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, o.class, "1")) {
          if (!RomUtils.q()) {
             o.c.d("rom is not MIUI");
          }else {
             Uri uri = Uri.parse("content://com.xiaomi.market.provider.DirectMailProvider");
             a.o(uri, "Uri.parse\(URI_MI_MARKET_PROVIDER\)");
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             Cursor uCursor = uApplication.getContentResolver().query(uri, null, null, null, null);
             if (uCursor == null || uCursor.isClosed()) {
                o.c.d("cursor is null");
             }else {
                uCursor.moveToFirst();
                o c = o.c;
                boolean b = c.b(uCursor);
                o.a = b;
                if (b) {
                   o.b = c.c(uCursor);
                }
             }
             p.b(uCursor);
          }
       }
       return;
    }
    public boolean Bo(q p0){
       boolean b;
       boolean b2;
       String this;
       String str2;
       List obj4;
       b uob;
       String str3;
       PopupInterface$h oh1;
       String obj6;
       d uod;
       PopupInterface$h oh3;
       c$a obj7;
       q oq;
       q oq1;
       d obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj1 = PatchProxy.applyOneRefs(obj, this, s.class, "9");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = b.class;
       String str = "2";
       String obj2 = null;
       q obj3 = PatchProxy.applyOneRefs(obj, obj2, obj1, str);
       b = false;
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else {
          obj3 = obj.f;
          q h = obj.h;
          if (obj3 != null && (h != null && (h.isAd() && (VisitorModeManager.f() || !j.w(h))))) {
             Object[] objArray = new Object[0];
             j0.c("AdPhotoReduceHelper", "cannot show ad reduce popup", objArray);
          }else {
             boolean b1 = true;
             ReduceMode reduceMode = new ReduceMode(b, b1);
             a uoa = (obj.c != null)? new a(obj.d, obj.e): obj2;
             String str1 = "1";
             int i = 3;
             obj2 = "3";
             int i1 = 8;
             int i2 = 7;
             int i3 = 6;
             if (c.v(h).feedNegativeStyle == b1) {
                View view = p0.c();
                View$OnClickListener onClickListe = p0.b();
                b1 = p0.e();
                PopupInterface$h oh = p0.d();
                b2 = p0.a();
                this = "4";
                if (PatchProxy.isSupport2(obj1, this)) {
                   str2 = obj2;
                   Object[] objArray1 = new Object[9];
                   objArray1[0] = obj3;
                   objArray1[1] = view;
                   objArray1[2] = h;
                   objArray1[i] = onClickListe;
                   objArray1[4] = reduceMode;
                   objArray1[5] = Boolean.valueOf(b1);
                   objArray1[i3] = oh;
                   objArray1[i2] = uoa;
                   objArray1[i1] = Boolean.valueOf(b2);
                   obj4 = PatchProxy.apply(objArray1, null, obj1, this);
                   if (obj4 != patchProxyRe) {
                      b2 = obj4.booleanValue();
                   label_00c5 :
                      b = b2;
                   }
                }else {
                   str2 = obj2;
                }
                obj4 = a.a(h);
                if (!q.f(obj4)) {
                   d$a uoa1 = new d$a(h);
                   int[] obj5 = PatchProxy.applyOneRefs(view, uoa1, d$a.class, str1);
                   if (obj5 != patchProxyRe) {
                      uoa1 = obj5;
                      uob = obj1;
                      str3 = this;
                      oh1 = oh;
                   }else {
                      a.p(view, "sourceView");
                      obj5 = new int[2];
                      view.getLocationInWindow(obj5);
                      uob = obj1;
                      str3 = this;
                      oh1 = oh;
                      uoa1.a = new Rect(obj5[0], obj5[1], (obj5[0] + view.getWidth()), (obj5[1] + view.getHeight()));
                   }
                   uoa1.b = onClickListe;
                   obj6 = PatchProxy.applyOneRefs(obj4, uoa1, d$a.class, str);
                   if (obj6 != patchProxyRe) {
                      uoa1 = obj6;
                   }else {
                      a.p(obj4, "reasons");
                      uoa1.c = obj4;
                   }
                   uoa1.e = b2;
                   uoa1.f = b1;
                   if (uoa != null) {
                      uoa1.g = uoa;
                   }
                   obj = PatchProxy.apply(null, uoa1, d$a.class, str2);
                   if (obj != patchProxyRe) {
                   }else {
                      obj = new d();
                      obj.b = uoa1.d;
                      obj.c = uoa1.a;
                      obj.e = uoa1.c;
                      obj.f = uoa1.b;
                      obj.g = uoa1.e;
                      obj.i = uoa1.f;
                      obj.j = uoa1.g;
                   }
                   uod = new d(obj3);
                   Objects.requireNonNull(obj);
                   uod.G(new b(obj));
                   uod.O(new c(obj));
                   uod.L(obj);
                   if (uoa != null) {
                      uod.E(uoa.b());
                   }
                   uod.Y(oh1);
                   PatchProxy.onMethodExit(uob, str3);
                }else {
                   PatchProxy.onMethodExit(obj1, this);
                }
             }else {
                b this1 = obj1;
                obj6 = obj2;
                View view1 = p0.c();
                View$OnClickListener onClickListe1 = p0.b();
                b1 = p0.e();
                PopupInterface$h oh2 = p0.d();
                b2 = p0.a();
                if (PatchProxy.isSupport2(this1, obj6)) {
                   Object[] objArray2 = new Object[9];
                   objArray2[0] = obj3;
                   objArray2[1] = view1;
                   objArray2[2] = h;
                   objArray2[i] = onClickListe1;
                   objArray2[4] = reduceMode;
                   objArray2[5] = Boolean.valueOf(b1);
                   objArray2[i3] = oh2;
                   objArray2[i2] = uoa;
                   objArray2[i1] = Boolean.valueOf(b2);
                   oh3 = oh2;
                   obj7 = PatchProxy.apply(objArray2, null, this1, obj6);
                   if (obj7 != patchProxyRe) {
                      b2 = obj7.booleanValue();
                      goto label_00c5 ;
                   }
                }else {
                   oh3 = oh2;
                }
                List list = a.a(h);
                if (!q.f(list)) {
                   obj7 = new c$a(h);
                   int[] obj8 = PatchProxy.applyOneRefs(view1, obj7, c$a.class, str1);
                   if (obj8 != patchProxyRe) {
                      obj7 = obj8;
                      str2 = obj6;
                      uob = this1;
                      oq = obj3;
                      oq1 = h;
                      i2 = 1;
                   }else {
                      obj8 = new int[2];
                      view1.getLocationInWindow(obj8);
                      str2 = obj6;
                      uob = this1;
                      oq1 = h;
                      oq = obj3;
                      obj7.b = new Rect(obj8[0], obj8[1], (obj8[0] + view1.getWidth()), (obj8[1] + view1.getHeight()));
                   }
                   obj7.c = b1;
                   obj7.d = onClickListe1;
                   obj7.e = list;
                   obj7.f = reduceMode;
                   if (uoa != null) {
                      obj7.g = uoa;
                   }
                   obj7.h = b2;
                   c uoc = PatchProxy.apply(null, obj7, c$a.class, str);
                   if (uoc != patchProxyRe) {
                   }else {
                      uoc = new c();
                      uoc.b = obj7.a;
                      uoc.c = obj7.b;
                      uoc.d = obj7.c;
                      uoc.e = obj7.d;
                      uoc.f = obj7.e;
                      uoc.g = obj7.f;
                      uoc.h = obj7.g;
                      uoc.i = obj7.h;
                   }
                   uod = new d(oq);
                   Objects.requireNonNull(uoc);
                   uod.F(new d(uoc));
                   uod.N(new e(uoc));
                   uod.L(uoc);
                   if (uoa != null) {
                      uod.E(uoa.b());
                   }
                   uod.Y(oh3);
                   ReportModuleUseTools.a("ks_negative_popup_v1", oq1);
                   PatchProxy.onMethodExit(uob, str2);
                }else {
                   PatchProxy.onMethodExit(this1, obj6);
                }
             }
             b = true;
          }
          b = false;
       }
       return b;
    }
    public void DB(boolean p0,String p1,BaseFeed p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, s.class, "41")) {
          return;
       }
       a d = a.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, d, a.class, "4")) {
          a.p(p1, "orderId");
          if (p0) {
             a.a.addReserveApp(p1, p2);
          }else {
             a.a.removeFeed(p1);
          }
          d.d();
       }
       return;
    }
    public String Fi(String p0,BaseFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, s.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.d(p0, p1);
    }
    public void KM(QPhoto p0,SpannableStringBuilder p1,String p2,a p3){
       Object[] objArray;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, s.class, "59")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (photoAdverti == null) {
          return;
       }
       if (TextUtils.isEmpty(p2)) {
          objArray = new Object[0];
          j0.f("AdTagNull", "current creativeId"+photoAdverti.mCreativeId, objArray);
          return;
       }else {
          a[] spans = p1.getSpans(0, p1.length(), a.class);
          if (spans == null || !spans.length) {
             objArray = new Object[0];
             j0.f("AdTagNull", "imageSpan null current creativeId: "+photoAdverti.mCreativeId+"  adTag: "+p2, objArray);
             return;
          }else {
             ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
             tagPackage.name = p2;
             tagPackage.identity = photoAdverti.mCreativeId+"";
             tagPackage.type = 22;
             p3.accept(tagPackage);
             return;
          }
       }
    }
    public void Kh(BaseFeed p0,PlcEntryStyleInfo p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "26")) {
          return;
       }
       i0.a().j(321, p0, p1).q("deeplink", p2).d(new d0(p2)).a();
       this.bC(p0, p2, "1");
       return;
    }
    public void Ko(QPhoto p0,QPhoto p1,int p2,a p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, s.class, "67")) {
          return;
       }
       if (p0 != null && (p0.isAd() && p1 != null)) {
          i0.a().e(p2, p0.mEntity).d(new a0(p1, p3)).a();
       }
    label_003b :
       return;
    }
    public boolean LN(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.z(p0);
    }
    public void LU(Activity p0,AdDataWrapper p1,boolean p2,a p3,b[] p4){
       object oobject = p3;
       object oobject1 = p4;
       s os = s.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 0;
       int i5 = 1;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[i];
          objArray[i4] = p0;
          objArray[i5] = p1;
          objArray[i3] = Boolean.valueOf(p2);
          objArray[i2] = oobject;
          objArray[i1] = oobject1;
          if (PatchProxy.applyVoid(objArray, this, os, "5")) {
             return;
          }
       }
       AdDownloaderType dOWNLOAD_FUL = AdDownloaderType.DOWNLOAD_FULL_SPEED;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray1 = new Object[]{p0,p1,Boolean.valueOf(p2),dOWNLOAD_FUL,oobject,oobject1};
          if (!PatchProxy.applyVoid(objArray1, this, os, "6")) {
          label_0051 :
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             r or = r.class;
             Object obj = null;
             e[] uoeArray = PatchProxy.applyOneRefs(oobject1, obj, or, "2");
             if (uoeArray != patchProxyRe) {
             }else if(oobject1 == null || !oobject1.length){
                uoeArray = obj;
             }else {
                uoeArray = new e[oobject1.length];
                for (i3 = 0; i3 < oobject1.length; i3 = i3 + 1) {
                   object oobject2 = oobject1[i3];
                   d uod = PatchProxy.applyOneRefs(oobject2, obj, or, "1");
                   if (uod != patchProxyRe) {
                   }else {
                      uod = new d(oobject2);
                   }
                   uoeArray[i3] = uod;
                }
             }
             Activity uActivity = (p0 == null)? ActivityContext.g().e(): p0;
             if (uActivity == null) {
                Object[] objArray2 = new Object[i4];
                j0.c("CommercialPluginImpl", "process download but activity is null , and cannot get current activity", objArray2);
             }else if(p2 && (uActivity instanceof RxFragmentActivity && (uoeArray != null && uoeArray.length > 0))){
                int len = uoeArray.length;
                for (; i4 < len; i4 = i4 + 1) {
                   uoeArray[i4].j(uActivity);
                }
             }
          label_00b7 :
             k ok = k.a();
             ok.b(dOWNLOAD_FUL);
             k ok1 = ok;
             l.a.a(uActivity, p1, ok1, new v(oobject), 0, uoeArray);
          }
       }else {
          goto label_0051 ;
       }
       return;
    }
    public t MN(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3a268c29).A(p0).map(r.b);
    }
    public void MW(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "30")) {
          return;
       }
       if (!p0.isLiveStream()) {
          return;
       }
       PhotoAdvertisement$FanstopLiveInfo uFanstopLive = this.n(p0, p1, PhotoAdvertisement$FanstopLiveInfo.class, false);
       if (uFanstopLive != null) {
          PhotoAdvertisement photoAdverti = new PhotoAdvertisement();
          photoAdverti.mAdLiveForFansTop = uFanstopLive;
          p0.setAdvertisement(photoAdverti);
       }
       return;
    }
    public void Nb(String p0,int p1,int p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, s.class, "18")) {
          return;
       }
       RxBus f = RxBus.f;
       b uob = new b();
       uob.h(p1);
       Object obj = PatchProxy.applyOneRefs(p0, uob, b.class, "1");
       if (obj != PatchProxyResult.class) {
          uob = obj;
       }else {
          a.p(p0, "photoId");
          uob.b = p0;
       }
       uob.i(p2);
       f.b(uob);
       return;
    }
    public b Ob(Activity p0,QPhoto p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, s.class, "52");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new e(p0, p1);
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, obj, e.class, "1");
       if (objArray1 != patchProxyRe) {
       }else {
          e a = obj.a;
          if (a != null) {
             objArray = ViewModelProviders.of(a).get(f.class).o0().compose(c.c(obj.a.m(), ActivityEvent.DESTROY)).subscribe(new d(obj), Functions.d());
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public boolean Op(QPhoto p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, s.class, "65");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       BaseFeed uBaseFeed = null;
       obj = PatchProxy.applyOneRefs(p0, uBaseFeed, c.class, "95");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(photo\) ?: return true");
             b uob = b.a(-570058679);
             if (p0 != null) {
                uBaseFeed = p0.getEntity();
             }
             if (!uob.b(uBaseFeed)) {
                Object[] objArray = new Object[0];
                j0.f("AdDanmaku", "not in ThirdPartAdGroup", objArray);
             }else {
                PhotoAdvertisement mAdData = photoAdverti.mAdData;
                if (mAdData != null) {
                   PhotoAdvertisement$AdData mDanmakuInfo = mAdData.mDanmakuInfo;
                   if (mDanmakuInfo != null) {
                      b = mDanmakuInfo.mEnableDanmaku;
                   label_005d :
                      obj = new Object[0];
                      j0.f("AdDanmaku", "enableAdDanmaku: "+b, obj);
                   }
                }
                b = false;
                goto label_005d ;
             }
          }
          b = true;
       }
       return b;
    }
    public void Qd(GifshowActivity p0,QPhoto p1,User p2,AdUnionFollowInfo p3,String p4,String p5){
       int i = 0;
       if (PatchProxy.isSupport2(s.class, "45")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, s.class, "45")) {
             return;
          }
       }else {
          int i1 = this;
       }
       DialogContainerFragment uDialogConta = new DialogContainerFragment();
       uDialogConta.Ih(i);
       y oy = new y(p1, p2, p3, p4, p5);
       uDialogConta.Lh(i);
       uDialogConta.show(p0.getSupportFragmentManager(), "AdUnionHalfFollowFragment");
       PatchProxy.onMethodExit(s.class, "45");
       return;
    }
    public void RQ(Context p0,BaseFeed p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "1")) {
          return;
       }
       b2 uob2 = new b2(p0, p2);
       uob2.g(p1);
       c.i(p0, uob2.a());
       return;
    }
    public DialogContainerFragment ST(Activity p0,BaseFeed p1,String p2,f p3,DialogInterface$OnDismissListener p4){
       AdHalfWebFragment$a obj;
       AdHalfWebFragmentV2 uAdHalfWebFr;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[]{oobject,p1,p2,oobject1,oobject2};
          obj = PatchProxy.apply(objArray, this, os, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       boolean b = (oobject1 != null && oobject1.a != null)? true: false;
       float f = (oobject1 == null)? 0: oobject1.b;
       obj = new AdHalfWebFragment$a(p2, p0, p1, b, f);
       if (oobject1 != null) {
          v13.j = oobject1.c;
          v13.k = oobject1.d;
       }
       v13.d = true;
       v13.c = oobject.getSupportFragmentManager();
       String str = "1";
       if (a.t().d("uniAdHalfWebFragment", 0)) {
          uAdHalfWebFr = PatchProxy.applyOneRefs(v13, null, AdHalfWebFragmentV2.class, str);
          if (uAdHalfWebFr != PatchProxyResult.class) {
          }else {
             uAdHalfWebFr = new AdHalfWebFragmentV2(v13);
          }
       }else {
          uAdHalfWebFr = PatchProxy.applyOneRefs(v13, null, AdHalfWebFragment.class, str);
          if (uAdHalfWebFr != PatchProxyResult.class) {
          }else {
             uAdHalfWebFr = new AdHalfWebFragment(v13);
          }
       }
       uAdHalfWebFr.k0(new p(p0, oobject2));
       return uAdHalfWebFr;
    }
    public void Un(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "40")) {
          return;
       }
       a d = a.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoid(objArray, d, a.class, "1")) {
          u1.a(d);
          RxBus.f.g(n.class, RxBus$ThreadMode.ASYNC).subscribe(b.b);
       }
       return;
    }
    public void Vb(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "62")) {
          return;
       }
       p0.U7(new j());
       PatchProxy.onMethodExit(s.class, "62");
       return;
    }
    public void WE(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "36")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, p.class, "1")) {
          int i = 0;
          try{
             if (!RomUtils.s()) {
                objArray1 = new Object[i];
                j0.a("OppoMiniGameManager", "rom is not OPPO", objArray1);
             }else {
                Application uApplication = a.b();
                a.o(uApplication, "AppEnv.getAppContext\(\)");
                List list = uApplication.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", x0.f("oaps://instant/game")), 0x20000);
                a.o(list, "pm.queryIntentActivities¡­PackageManager.MATCH_ALL\)");
                boolean b = (!list.isEmpty())? true: false;
                p.a = b;
                objArray1 = new Object[i];
                j0.a("OppoMiniGameManager", "isSupportOppoMiniGame: "+p.a, objArray1);
             }
          }catch(java.lang.Exception e2){
             objArray = new Object[i];
             j0.d("OppoMiniGameManager", e2, objArray);
          }
       }
    }
    public String Y2(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.s(p0);
    }
    public void YX(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "32")) {
          return;
       }
       if (p0 != null && (p0.isAd() && !TextUtils.isEmpty(p1))) {
          b.a(-762347696).t1(p1, k.B(p0));
       }
    label_0029 :
       return;
    }
    public Triple ZF(Fragment p0){
       Triple obj = PatchProxy.applyOneRefs(p0, this, s.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          if (p0 instanceof BaseFragment && p0.Vg().c()) {
          }else {
             GifshowActivity gifshowActiv = m.a().gB();
             if (gifshowActiv == null || gifshowActiv.isFinishing()) {
                return e0;
             }else {
                gifshowActiv = m.a().y9();
                if (gifshowActiv instanceof BaseFragment) {
                }else {
                   Triple triple = obj;
                }
             }
          }
          if (p0 == null) {
             return obj;
          }else {
             boolean b = p0.Vg().e();
             Fragment uFragment = null;
             if (p0 instanceof i0) {
                uFragment = a.a(p0.Ua());
             }
             return new Triple(Integer.valueOf(uFragment), Boolean.valueOf(b), p0);
          }
       }catch(java.lang.Exception e0){
       }
    }
    public int Zx(){
       return 0x7f081ace;
    }
    public void a60(QPhoto p0,Fragment p1,int p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, s.class, "56")) {
          return;
       }
       if (!c.T(p0)) {
          return;
       }
       if (!f.a("enableClearNegativeAd")) {
          return;
       }
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "57") || (p0 != null && p1 != null)) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(p1.getParentFragment());
          if (slidePlayVie != null && !slidePlayVie.r()) {
             List list = slidePlayVie.K0();
             if (!q.f(list)) {
                int i = list.indexOf(p0);
                if (i >= 0) {
                   List list1 = CommercialKtUtil.f(i, list);
                   if (!q.f(list1)) {
                      k1.r(new u(slidePlayVie, list1), 0);
                   }
                }
             }
          }
       }
       if (!PatchProxy.isSupport(s.class) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, s.class, "58")) {
          if (!p2 && p1 instanceof BaseFragment) {
             p2 = p1.f();
          }
          if (p2 == 82 || p2 == 90) {
             d.a(0x940c093).clearCache();
          }
       }
       return;
    }
    public List b9(){
       ArrayList obj = PatchProxy.apply(null, this, s.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new c());
       obj.add(new b());
       return obj;
    }
    public void bC(BaseFeed p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "27")) {
          return;
       }
       AdProcessUtils.k(new PhotoAdDataWrapper(p0), p1, p2);
       return;
    }
    public void bJ(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "22")) {
          return;
       }
       p0.add(new l());
       return;
    }
    public String e7(QPhoto p0,SpannableStringBuilder p1){
       PhotoAdvertisement obj = PatchProxy.applyTwoRefs(p0, p1, this, s.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.B(p0);
       String str = null;
       if (obj == null) {
          return str;
       }
       if (h0.g(p0)) {
          a.c(p1, obj.mFansTopDetailPageFlameDesc);
          str = obj.mFansTopDetailPageFlameDesc;
       }else if(!h0.i(p0)){
          return str;
       }else {
          PhotoAdvertisement mSourceDescr = obj.mSourceDescriptionType;
          if (mSourceDescr != null) {
             if (mSourceDescr != 1) {
                if (mSourceDescr == 2) {
                   a.b(p1, R.drawable.arg_RES_7f080510);
                   str = "OldFansTop";
                }
             }else {
                a.b(p1, R.drawable.arg_RES_7f08050f);
                str = "FansTop";
             }
          }else if(!TextUtils.isEmpty(obj.mSourceDescription)){
             a.c(p1, obj.mSourceDescription);
             str = obj.mSourceDescription;
          }
       }
       return str;
    }
    public void eW(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "54")) {
          return;
       }
       if (!d.a(-1883158055).Sl()) {
          return;
       }
       try{
          String str = "sensor";
          if (!f.e()) {
             objArray = a.b().getSystemService(str);
             SharedPreferences$Editor uEditor = f.a.edit();
             uEditor.putBoolean("is_support_gyroscope_sensor", SplashUtils.K(objArray));
             g.a(uEditor);
          label_0041 :
             if (!f.d()) {
                if (objArray == null) {
                   objArray = a.b().getSystemService(str);
                }
                SharedPreferences$Editor uEditor1 = f.a.edit();
                uEditor1.putBoolean("is_support_accelerometer_sensor", SplashUtils.J(objArray));
                g.a(uEditor1);
             }
          }else {
             goto label_0041 ;
          }
       }catch(java.lang.Exception e0){
          objArray = new Object[0];
          j0.d("CommercialPluginImpl", e0, objArray);
       }
       return;
    }
    public b f30(BaseFragment p0,QPhoto p1,a p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, s.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AdLiveConversionObservable uAdLiveConve = new AdLiveConversionObservable(p0, p1, p2, q.b, p3);
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, obj, AdLiveConversionObservable.class, "2");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          GifshowActivity activity = obj.b.getActivity();
          if (activity != null) {
             objArray = ViewModelProviders.of(activity).get(e.class).o0().compose(c.c(activity.m(), ActivityEvent.DESTROY)).subscribe(obj.a(), Functions.d());
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public int gi(boolean p0){
       int i = (p0)? 0x7f080088: 0x7f080087;
       return i;
    }
    public Object hI(BaseFeed p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, s.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-762347696).r1(p0, p1, p2);
    }
    public String i4(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.j(p0);
    }
    public boolean isAvailable(){
       return false;
    }
    public void jD(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "61")) {
          return;
       }
       RxBus.f.b(new o(false, p0));
       return;
    }
    public void jM(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "21")) {
          return;
       }
       k.a(p0);
       return;
    }
    public void js(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "23")) {
          return;
       }
       p0.add(new a());
       return;
    }
    public void k9(String p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, s.class, "19")) {
          return;
       }
       RxBus f = RxBus.f;
       b uob = new b();
       uob.h(p1);
       Object obj = PatchProxy.applyOneRefs(p0, uob, b.class, "2");
       if (obj != PatchProxyResult.class) {
          uob = obj;
       }else {
          a.p(p0, "reservationId");
          uob.c = p0;
       }
       uob.i(p2);
       uob.e = p3;
       f.b(uob);
       return;
    }
    public void l4(QPhoto p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "33")) {
          return;
       }
       if (p0 != null && p0.isAd()) {
          d.a(0x37593069).dH(p0.mEntity, p1);
       }
       return;
    }
    public boolean lh(){
       Object obj = PatchProxy.apply(null, this, s.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AdLogPhotoImpressionUtils.c();
    }
    public DialogFragment lp(i0 p0,c p1,BaseFeed p2,g p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, s.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.t().d("uniAdTransparentBgWebViewFragment", false)) {
          return new f().c(p0, p2, p1, null, p3);
       }
       return new c().e(p0, p2, p1, null, p3);
    }
    public final Object n(QPhoto p0,String p1,Class p2,boolean p3){
       if (PatchProxy.isSupport(s.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, s.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p3 && k.B(p0) != null) {
          return null;
       }else if(TextUtils.isEmpty(p1)){
          return null;
       }else {
          try{
             JSONObject jSONObject = new JSONObject(p1).optJSONObject("adInfo");
             if (jSONObject != null) {
                return a.a.h(jSONObject.toString(), p2);
             }
          }catch(java.lang.Exception e9){
             Object[] objArray = new Object[0];
             j0.d("CommercialPluginImpl", e9, objArray);
          }
          return null;
       }
    }
    public void n1(){
       if (PatchProxy.applyVoid(null, this, s.class, "20")) {
          return;
       }
       b.a(-762347696).n1();
       return;
    }
    public boolean n3(){
       j obj = PatchProxy.apply(null, this, s.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = j.b;
       if (!obj.a()) {
          return false;
       }
       obj.b(false);
       return true;
    }
    public String nZ(QPhoto p0){
       PhotoAdvertisement$DanmakuInfo mAdInfo;
       PhotoAdvertisement$DanmakuInfo obj = PatchProxy.applyOneRefs(p0, this, s.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "94");
       if (obj != PatchProxyResult.class) {
       }else {
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData mDanmakuInfo = photoAdverti.mDanmakuInfo;
                if (mDanmakuInfo != null) {
                   mAdInfo = mDanmakuInfo.mAdInfo;
                   if (mAdInfo != null) {
                   label_0032 :
                      obj = mAdInfo;
                   }
                }
             }
          }
          mAdInfo = "";
          goto label_0032 ;
       }
       return obj;
    }
    public int nz(Activity p0,QPhoto p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(s.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, s.class, "38");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       boolean b = true;
       int i = 0;
       if (p0 != null && (p1 == null || p1.mEntity == null)) {
          StringBuilder str = "parameter exception:";
          boolean b1 = (p0 == null)? true: false;
          str = str+b1+"/";
          if (p1 != null) {
             b = false;
          }
          Object[] objArray = new Object[i];
          j0.c("CommercialPluginImpl", str+b, objArray);
          return i;
       }else if(!j.E(p1)){
          Object obj1 = PatchProxy.applyOneRefs(p1, null, j.class, "34");
          boolean b2 = (obj1 != patchProxyRe)? obj1.booleanValue(): j.x(p1, 7);
          if (!b2) {
             b2 = f.a("coronaAdConvertByClickAreaEnable");
             if (p2 != 100 && p2 != b) {
                b = false;
             }
             Object[] objArray2 = new Object[i];
             j0.f("CommercialPluginImpl", "processCoronaConvert open loadStyle "+b2+" "+p2, objArray2);
             if (p1.isVideoType() && (!b2 || b)) {
                d.a(0x51b51398).lf(p0, p1);
                return 13;
             }else {
                return g.a.b(p0, new PhotoAdDataWrapper(p1.mEntity)).m();
             }
          }
       }
       Object[] objArray1 = new Object[i];
       j0.f("CommercialPluginImpl", "processCoronaConvert open live or profile", objArray1);
       return g.a.b(p0, new PhotoAdDataWrapper(p1.mEntity)).m();
    }
    public b of(QPhoto p0,a p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, s.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0, p1, p2).a();
    }
    public void oh(c p0,boolean p1){
       k a;
       SplashNasaSlidePlayPagePresenter obj;
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, os, "14")) {
          return;
       }
       p0.add(new y());
       p0.add(new v());
       Object[] objArray = null;
       if (p1) {
          a = k.a;
          Objects.requireNonNull(a);
          obj = PatchProxy.applyWithListener(objArray, a, k.class, "3");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             PatchProxy.onMethodExit(k.class, "3");
          }
       }else {
          a = k.a;
          Objects.requireNonNull(a);
          obj = PatchProxy.applyWithListener(objArray, a, k.class, "2");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = new SplashNasaSlidePlayPagePresenter();
             PatchProxy.onMethodExit(k.class, "2");
          }
          objArray = obj;
       }
       if (objArray != null) {
          p0.add(objArray);
       }
       p0.add(new d());
       p0.add(new c());
       return;
    }
    public List om(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, s.class, "42");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.d;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, a.class, "3");
       if (objArray1 != patchProxyRe) {
       }else {
          Set orderIds = a.a.getOrderIds();
          if (orderIds != null) {
             objArray = CollectionsKt___CollectionsKt.G5(orderIds);
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public Class pS(){
       return RankListFragment.class;
    }
    public void q60(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "60")) {
          return;
       }
       RxBus.f.b(new o(true, p0));
       return;
    }
    public boolean rN(QPhoto p0){
       PlcEntryDataAdapter obj = PatchProxy.applyOneRefs(p0, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (o.b == null) {
          return false;
       }
       obj = c.a(p0);
       if (obj != null) {
          o.b.onNext(new PlcAdDataWrapper(obj));
       }else {
          o.b.onNext(new PhotoAdDataWrapper(p0.mEntity));
       }
       return true;
    }
    public Object tg(QPhoto p0,Activity p1){
       Object[] objArray;
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, s.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       String str = "Dislike";
       if (!j.e(k.B(p0), 8)) {
          objArray = new Object[i];
          j0.f(str, "not match ad dislike", objArray);
          return null;
       }else {
          obj = a.b(p0);
          if (obj.isEmpty()) {
             objArray = new Object[i];
             j0.f(str, "list is null", objArray);
             return null;
          }else {
             PhotoAdvertisement$NegativeMenuInfo negativeStyl = c.v(p0).negativeStyle;
             if (negativeStyl != 3) {
                if (negativeStyl != 4) {
                   return null;
                }
                DislikeHelper.h(p0);
                return new c(p0, p1, null, obj);
             }else {
                DislikeHelper.h(p0);
                return new a(p0, p1, null, obj);
             }
          }
       }
    }
    public void tr(ImageButton p0,Activity p1,QPhoto p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "39")) {
          return;
       }
       if (p0 != null) {
          p0.setImageResource(R.drawable.arg_RES_7f080089);
          p0.setVisibility(0);
          p0.setOnClickListener(new x(p1, p2));
       }
       return;
    }
    public void uB(BaseFeed p0,PlcEntryStyleInfo p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "25")) {
          return;
       }
       g.b(p0, "1", p2);
       i0.a().j(320, p0, p1).q("deeplink", p2).d(new b0(p2)).a();
       k1.r(new e0(p0, p1, p2), s.h());
       return;
    }
    public void v6(Activity p0,AdDataWrapper p1,a p2,b[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, s.class, "4")) {
          return;
       }
       this.LU(p0, p1, false, p2, p3);
       return;
    }
    public boolean v7(int p0){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, os, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public void vh(boolean p0,QPhoto p1,PresenterV2 p2){
       if (PatchProxy.isSupport2(s.class, "37") && PatchProxy.applyVoidThreeRefsWithListener(Boolean.valueOf(p0), p1, p2, this, s.class, "37")) {
          return;
       }
       if (p1 != null && p1.isNonSlideAd()) {
          p2.U7(new b());
       }
       if (p1 != null && p0) {
          p2.U7(new a());
          p2.U7(new e());
       }
       PatchProxy.onMethodExit(s.class, "37");
       return;
    }
    public int vq(QPhoto p0){
       PhotoAdvertisement obj = PatchProxy.applyOneRefs(p0, this, s.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = k.B(p0);
       if (obj == null) {
          return 0;
       }
       TextPaint textPaint = new TextPaint();
       textPaint.setTextSize((float)n.c0(a.b(), 10.00f));
       if (h0.g(p0)) {
          return (int)(textPaint.measureText(obj.mFansTopDetailPageFlameDesc) + (float)a1.e(12.00f));
       }
       if (!h0.i(p0)) {
          return 0;
       }
       PhotoAdvertisement mSourceDescr = obj.mSourceDescriptionType;
       if (mSourceDescr == null) {
          return (int)(textPaint.measureText(obj.mSourceDescription) + (float)a1.e(12.00f));
       }
       if (mSourceDescr != 1 && mSourceDescr != 2) {
          return 0;
       }
       return a1.e(20.00f);
    }
    public b w4(BaseFragment p0,QPhoto p1,a p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, s.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AdLiveConversionObservable uAdLiveConve = new AdLiveConversionObservable(p0, p1, p2, q.b, p3);
       return obj.c();
    }
    public View wK(Activity p0,ViewGroup p1,BaseFeed p2,boolean p3){
       View obj;
       if (PatchProxy.isSupport(s.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, s.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!c.f(p2)) {
          return null;
       }else {
          obj = a.i(p1, R.layout.arg_RES_7f0d004d);
          p1.addView(obj);
          y0.a(obj.findViewById(R.id.ad_detail_monitor_open), new w(p2, p3, p0));
          return obj;
       }
    }
    public boolean wh(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.S(p0);
    }
    public void wq(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "12")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "10") && !q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             APKDownloadTask uAPKDownload = h.n().l(iterator.next());
             if (uAPKDownload != null && uAPKDownload.mCurrentStatus != APKDownloadTask$DownloadStatus.INSTALLED) {
                uAPKDownload = uAPKDownload.mTaskInfo;
                if (uAPKDownload instanceof PhotoApkDownloadTaskInfo) {
                   PhotoApkDownloadTaskInfo mAdDataWrapp = uAPKDownload.mAdDataWrapper;
                   GameCenterDownloadParams gameCenterDo = l.b(mAdDataWrapp.getUrl(), mAdDataWrapp.getPackageName(), mAdDataWrapp.getAppIconUrl(), mAdDataWrapp.getAppName());
                   if (gameCenterDo != null) {
                      d.b(mAdDataWrapp, gameCenterDo);
                   }
                }
             }
          }
       }
       return;
    }
    public void xf(QPhoto p0,String p1){
       s os = s.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, os, "28")) {
          return;
       }
       boolean b = true;
       PhotoAdvertisement photoAdverti = this.n(p0, p1, PhotoAdvertisement.class, b);
       if (photoAdverti != null) {
          p0.setAdvertisement(photoAdverti);
          if (PatchProxy.applyVoidTwoRefs(p0, p1, this, os, "29") || (!TextUtils.isEmpty(p1) && TextUtils.isEmpty(p0.getListLoadSequenceID()))) {
             int i = 0;
             try{
                JSONObject jSONObject = new JSONObject(p1).optJSONObject("adInfo");
                if (jSONObject != null) {
                   jSONObject = jSONObject.optString("llsid");
                   Object[] objArray1 = new Object[b];
                   objArray1[i] = jSONObject;
                   j0.f("CommercialPluginImpl", "fillLLsidToPhoto", objArray1);
                   p0.setListLoadSequenceID(jSONObject);
                }
             }catch(java.lang.Exception e5){
                Object[] objArray = new Object[i];
                j0.d("CommercialPluginImpl", e5, objArray);
             }
          }
       }
    }
    public int yq(Fragment p0){
       if (p0 instanceof AdDetailVMFragment) {
          return 1;
       }
       return 0;
    }
    public boolean zT(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof QPhoto) {
          return j.w(p0);
       }
       return false;
    }
}
