package com.yxcorp.gifshow.photoad.download.k;
import com.kuaishou.webkit.DownloadListener;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import nxb.w0;
import erd.g;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import p29.j;
import com.yxcorp.gifshow.photoad.download.i;
import com.yxcorp.gifshow.ad.download.intercept.VpnAdDataWrapper;
import p29.i;
import com.yxcorp.download.DownloadTask$TagType;
import java.io.Serializable;
import com.yxcorp.gifshow.photoad.download.PhotoAdAPKDownloadNotificationInfo;
import g59.c;
import com.yxcorp.download.b;
import nxb.j;
import e17.i;
import com.yxcorp.gifshow.photoad.download.h;
import brd.t;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Long;
import g59.d;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URLDecoder;
import java.lang.Throwable;
import yx.j0;
import com.kuaishou.webkit.URLUtil;
import java.lang.StringBuilder;
import o56.a;
import android.app.Application;
import mxb.c;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import u07.t$a;
import u07.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import w07.k;
import w07.l;
import com.yxcorp.gifshow.photoad.download.j;
import java.text.DecimalFormat;
import nxb.v0;
import u07.u;
import nxb.u0;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class k implements DownloadListener	// class@000f89
{
    public final Activity a;
    public final BaseFeed b;

    public void k(Activity p0,BaseFeed p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(p0) && p0.endsWith(".apk"))? true: false;
       return b;
    }
    public final void b(int p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ok, "3")) {
          return;
       }
       i0.a().e(p0, this.b).d(new w0(p1)).a();
       return;
    }
    public final void c(String p0,String p1){
       i oi;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       DownloadManager.C("commercial-h5", null);
       DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(p0);
       uDownloadReq.setBizInfo(":ks-features:ft-commercial:commercial-libraries:commercial-download", "commercial-h5", null);
       uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       boolean b = true;
       uDownloadReq.setNeedCDNReport(b);
       if (!TextUtils.isEmpty(p0)) {
          uDownloadReq.setDestinationFileName(p1);
       }
       uDownloadReq.setNotificationVisibility(3);
       PhotoAdDataWrapper photoAdDataW = new PhotoAdDataWrapper(this.b, 0, b);
       j.g(photoAdDataW);
       if (j.d(photoAdDataW)) {
          PhotoAdDataWrapper photoAdDataW1 = PatchProxy.applyOneRefs(photoAdDataW, null, j.class, "6");
          if (photoAdDataW1 != PatchProxyResult.class) {
          }else if(!j.d(photoAdDataW)){
             photoAdDataW1 = photoAdDataW;
          }else {
             photoAdDataW1 = new VpnAdDataWrapper(photoAdDataW, new i(photoAdDataW));
          }
          oi = new i(photoAdDataW1);
       }else {
          oi = new i(this.b);
       }
       uDownloadReq.setTag(DownloadTask$TagType.TAG1, photoAdDataW);
       uDownloadReq.setTag(DownloadTask$TagType.TAG3, new PhotoAdAPKDownloadNotificationInfo(null));
       c.a(uDownloadReq.getDownloadUrl());
       b[] uobArray = new b[0];
       int i = DownloadManager.n().E(uDownloadReq, uobArray);
       b[] uobArray1 = new b[b];
       uobArray1[0] = oi;
       DownloadManager.n().b(i, uobArray1);
       b[] uobArray2 = new b[b];
       uobArray2[0] = new j(null);
       DownloadManager.n().b(i, uobArray2);
       i.a(R.style.arg_RES_7f11066a, 0x7f100ac0);
       h.n().w(i, uDownloadReq, photoAdDataW).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void onDownloadStart(String p0,String p1,String p2,String p3,long p4){
       boolean b1;
       String str1;
       double d;
       PhotoAdvertisement photoAdverti;
       String str3;
       d c;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       long l = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       String str = "1";
       int i = 3;
       int i1 = 2;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, ok, str)) {
             return;
          }
       }
       if (obj.a.isFinishing()) {
          return;
       }else {
          d obj1 = PatchProxy.applyTwoRefs(oobject, oobject1, obj, ok, "5");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = d.class;
             str = PatchProxy.applyOneRefs(oobject1, null, obj1, str);
             if (str != patchProxyRe) {
             }else {
                str = "contentDisposition";
                try{
                   a.p(oobject1, str);
                   str = d.a(p2);
                   if (str == null) {
                      c = d.c;
                      Objects.requireNonNull(c);
                      String str5 = PatchProxy.applyOneRefs(oobject1, c, obj1, "3");
                      if (str5 != patchProxyRe) {
                      }else {
                         Matcher matcher = d.b.matcher(oobject1);
                         if (matcher.find()) {
                            str = matcher.group(i1);
                            if (str != null) {
                               str5 = matcher.group(i);
                               if (str5 != null) {
                                  str5 = URLDecoder.decode(str5, str);
                               }
                            }
                         }
                      }
                      str = str5;
                   }
                }catch(java.lang.Exception e0){
                   j0.b("AdGetFileNameUtil", "parseContentDisposition error", e0);
                }
                str = null;
             }
             if (obj.a(str)) {
                obj1 = str;
                str3 = null;
             }else {
                obj1 = URLUtil.guessFileName(null, oobject1, null);
                if (obj.a(obj1)) {
                   str3 = obj1;
                }else if(!TextUtils.isEmpty(p0)){
                   str3 = URLUtil.guessFileName(oobject, null, null);
                   if (obj.a(str3)) {
                      str3 = obj1;
                      obj1 = str3;
                   }
                }
                str3 = obj1;
                obj1 = null;
             }
             str1 = ", url =";
             String str4 = "PhotoAdvertisementWebViewDownloadListener";
             if (TextUtils.isEmpty(obj1)) {
                if (TextUtils.isEmpty(str)) {
                   str = str3;
                }
                Object[] objArray2 = new Object[0];
                j0.l(str4, "apk fileName is null; contentDisposition="+oobject1+str1+oobject, objArray2);
                obj1 = str;
             }
             if (TextUtils.isEmpty(obj1)) {
                obj1 = a.B.getString(R.string.arg_RES_7f1000a6);
                Object[] objArray3 = new Object[0];
                j0.l(str4, "fileName is null; contentDisposition="+oobject1+str1+oobject, objArray3);
             }
          }
          k b = obj.b;
          Application obj2 = PatchProxy.applyOneRefs(b, null, c.class, "14");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(b != null){
             photoAdverti = b.get("AD");
          }else {
             photoAdverti = null;
          }
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mH5ControlInfo;
                if (adData != null) {
                   b1 = adData.mDisallowShowDownloadDialog;
                }
             }
          }
          b1 = null;
          if (b1 != null) {
             obj.c(oobject, obj1);
          }else if(PatchProxy.isSupport(ok) && PatchProxy.applyVoidThreeRefs(p0, obj1, Long.valueOf(p4), this, k.class, "2")){
             t$a uoa = a.b(new t$a(obj.a));
             uoa.C0(a1.f(R.drawable.arg_RES_7f0805b6));
             uoa.V0(1);
             uoa.a0(new k(R.drawable.arg_RES_7f0801be, 0x7f0606da));
             uoa.a0(j.a);
             uoa.X0(obj1);
             obj2 = a.B;
             Object[] objArray1 = new Object[1];
             if (PatchProxy.isSupport(ok)) {
                str1 = PatchProxy.applyOneRefs(Long.valueOf(p4), null, ok, "6");
                if (str1 != patchProxyRe) {
                }else if(l <= 0){
                   str1 = a1.p(R.string.arg_RES_7f104f67);
                }else {
                   d = (double)l;
                   String str2 = "0.00";
                   double d1 = 1073741824.00f;
                   if (d - d1 > 0) {
                      str1 = new DecimalFormat(str2).format((d / d1))+"G";
                   }else {
                      d1 = 1048576.00f;
                      str1 = (d - d1 > 0)? new DecimalFormat(str2).format((d / d1))+"M": new DecimalFormat("0").format((d / 1024.00f))+"K";
                   }
                }
             }else {
                goto label_01b9 ;
             }
             objArray1[0] = str1;
             uoa.z0(obj2.getString(R.string.arg_RES_7f1000a5, objArray1));
             uoa.T0(a1.p(R.string.arg_RES_7f100aad));
             uoa.u0(new v0(obj, oobject, obj1));
             uoa.s0(new u0(obj));
             uoa.v(1);
             uoa.Y(PopupInterface.a);
          }
          obj.b(140, 191);
          return;
       }
    }
}
