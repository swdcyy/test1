package com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import o1c.a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Integer;
import java.io.File;
import lxc.c;
import w46.b;
import t16.a;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import n1c.n;
import o1c.b0;
import java.lang.Runnable;
import t45.c;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.l;
import o1c.c0;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.util.Collection;
import android.os.Looper;
import o1c.a0;
import t16.b;
import t16.f;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import o1c.y;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.files.a;
import o1c.z;
import o1c.w;
import java.lang.System;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Enum;
import lnc.a1;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.gifshow.prettify.v4.magic.filter.m;
import java.util.Map;
import t16.c;
import com.yxcorp.download.b;
import com.yxcorp.download.DownloadManager;

public class n	// class@0011c9
{
    public static final Queue a;
    public static final List b;

    static {
       n.a = new ConcurrentLinkedQueue();
       n.b = new ArrayList();
    }
    public void n(){
       super();
    }
    public static List a(List p0,boolean p1){
       ArrayList obj;
       a uoa;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, on, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("FilterDownloadHelper", "add size:"+p0.size(), objArray);
       obj = new ArrayList();
       HashMap hashMap = new HashMap();
       Iterator iterator = n.a.iterator();
       while (iterator.hasNext()) {
          uoa = iterator.next();
          hashMap.put(Integer.valueOf(uoa.a.mFilterId), uoa);
       }
       Iterator iterator1 = p0.iterator();
       while (iterator1.hasNext()) {
          FilterConfig uFilterConfi = iterator1.next();
          uoa = new a(uFilterConfi, p1);
          a uoa1 = hashMap.get(Integer.valueOf(uoa.a.mFilterId));
          if (uoa1 != null && uoa1.equals(uoa)) {
             Object[] objArray1 = new Object[0];
             a.D().w("FilterDownloadHelper", "download list contains "+uFilterConfi.mFilterId, objArray1);
             if (!obj.contains(Integer.valueOf(uFilterConfi.mFilterId))) {
                objArray1 = new Object[0];
                a.D().s("FilterDownloadHelper", "add 2 waiting list "+uFilterConfi, objArray1);
                obj.add(Integer.valueOf(uFilterConfi.mFilterId));
             }
          }else if(!n.l(uFilterConfi)){
             n.a.add(uoa);
             obj.add(Integer.valueOf(uFilterConfi.mFilterId));
             Object[] objArray2 = new Object[0];
             a.D().s("FilterDownloadHelper", "add 2 download list "+uFilterConfi, objArray2);
          }
       }
       Object[] objArray3 = new Object[0];
       a.D().w("FilterDownloadHelper", "added size:"+obj.size(), objArray3);
       return obj;
    }
    public static void b(FilterConfig p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n.class, "16")) {
          return;
       }
       try{
          File uFile = new File(c.a(), p0.getZipFileName());
          if (uFile.exists()) {
             uFile.delete();
          label_0022 :
             uFile = new File(c.a(), p0.getUnZipDir());
             if (uFile.exists()) {
                uFile.delete();
             }
          }else {
             goto label_0022 ;
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().t("FilterDownloadHelper", p1+" deleteZipFilterData ZIP filter delete file error:"+p0.mFilterName, objArray);
       }
       return;
    }
    public static void c(a p0,boolean p1,int p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, n.class, "24")) {
          return;
       }
       Queue a = n.a;
       _monitor_enter(a);
       n.o(p2, p1);
       n.p(p0);
       _monitor_exit(a);
       return;
    }
    public static void d(FilterVideoPlugin$FilterEntranceType p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FilterDownloadHelper", "downloadAllFilter start", objArray);
       c.a(new b0(p0, new a(n.c(p0))));
       return;
    }
    public static void e(FilterConfig p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n.class, "9")) {
          return;
       }
       n.g(new a(), p0, p1, false);
       return;
    }
    public static void f(a p0,FilterConfig p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "10")) {
          return;
       }
       n.g(p0, p1, p2, false);
       return;
    }
    public static void g(a p0,FilterConfig p1,b p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, n.class, "11")) {
          return;
       }
       c.a(new l(p1, p3, p2, p0));
       return;
    }
    public static void h(a p0,List p1,b p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, n.class, "21")) {
          return;
       }
       c.a(new c0(p1, p3, p2, p0));
       return;
    }
    public static List i(FilterVideoPlugin$FilterEntranceType p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = new ArrayList(Filters.getAllFilterForType(p0)).iterator();
       while (iterator.hasNext()) {
          FilterConfig uFilterConfi = iterator.next();
          if (n.l(uFilterConfi)) {
             continue ;
          }else {
             obj.add(uFilterConfi);
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("FilterDownloadHelper", "getFiltersNeedDownload "+obj.size(), objArray);
       return obj;
    }
    public static void j(a p0,boolean p1,int p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, n.class, "23")) {
          return;
       }
       if (Looper.getMainLooper() == Looper.myLooper()) {
          c.a(new a0(p0, p1, p2));
       }else {
          n.c(p0, p1, p2);
       }
       return;
    }
    public static void k(FilterConfig p0,b p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "18")) {
          return;
       }
       if (p1 != null) {
          p1.onError(p0.mFilterId);
       }
       f.c(p2, "downloadFailure");
       if (!PatchProxy.applyVoidTwoRefs(p0, "handleResError", null, n.class, "15") && (p0 != null && p0.mSourceType == 1)) {
          Object[] objArray = new Object[0];
          a.D().w("FilterDownloadHelper", "handleResError"+" deleteZipFilterData error, SOURCE_TYPE_ZIP url "+e0.c(p0.mZipSourceFile), objArray);
          if (Looper.getMainLooper() == Looper.myLooper()) {
             c.a(new y(p0, "handleResError"));
          }else {
             n.b(p0, "handleResError");
          }
       }
       return;
    }
    public static boolean l(FilterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       boolean b1 = true;
       if (p0.mSourceType == null) {
          if (!q.f(p0.mFilterResources) && !q.f(p0.mFilterResourcesUrl)) {
             if (p0.mIsFilterResExist != null) {
                return b1;
             }else {
                Iterator iterator = p0.mFilterResources.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (!new File(c.a(), iterator.next()).exists()) {
                         Object[] objArray = new Object[b];
                         a.D().w("FilterDownloadHelper", "isFilterResExist image not exist, id:"+p0.mFilterId, objArray);
                         return b;
                      }
                   }else {
                      p0.mIsFilterResExist = b1;
                      break ;
                   }
                }
             }
          }
          return b1;
       }else if(TextUtils.x(e0.c(p0.mZipSourceFile))){
          return b1;
       }else if(p0.mIsZipResExist == null){
          p0.mIsZipResExist = p0.isUnzipDirExist(c.a());
       }
       return p0.mIsZipResExist;
    }
    public static boolean m(FilterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mSourceType == true) {
          return p0.isResourceValid(c.a());
       }
       return true;
    }
    public static void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FilterDownloadHelper", p0+"  logZipFilterUnzip", objArray);
       return;
    }
    public static void o(int p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), null, on, "25")) {
          return;
       }
       Iterator iterator = n.b.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (p1) {
             uob.onError(p0);
          }else {
             uob.onComplete(p0);
          }
       }
       return;
    }
    public static void p(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n.class, "22")) {
          return;
       }
       if (n.a.isEmpty()) {
          a.a(new File(c.a()));
          n.b.clear();
       }else {
          c.a(new z(p0));
       }
       return;
    }
    public static void q(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n.class, "7")) {
          return;
       }
       c.a(new w(p0));
       return;
    }
    public static void r(a p0,a p1,b p2){
       Object[] objArray;
       object oobject = p0;
       a uoa = p1;
       b uob = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "12")) {
          return;
       }
       a a = uoa.a;
       String str = "FilterDownloadHelper";
       int i = 0;
       if (a.mSourceType == null) {
          if (q.f(a.mFilterResourcesUrl) || q.f(a.mFilterResources)) {
             objArray = new Object[i];
             a.D().t(str, "startDownloadFilter error url:"+a.mFilterResourcesUrl+" name:"+a.mFilterResources, objArray);
             if (uob) {
                uob.onError(a.mFilterId);
             }
             return;
          }
       }else if(TextUtils.x(e0.c(a.mZipSourceFile))){
          objArray = new Object[i];
          a.D().t(str, "startDownloadFilter error mZipSourceFile is empty", objArray);
          if (uob != null) {
             uob.onError(a.mFilterId);
          }
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       if (a.mSourceType == null) {
          uArrayList = a.mFilterResourcesUrl;
          uArrayList1 = a.mFilterResources;
       }else if(!TextUtils.x(e0.c(a.mZipSourceFile))){
          uArrayList.add(e0.c(a.mZipSourceFile));
          uArrayList1.add(a.getZipFileName());
       }
       int i1 = 1;
       if (a.mSourceType == i1) {
          n.n("startDownloadFilter");
       }
       n on = n.class;
       Object obj = null;
       int i2 = 3;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray1 = new Object[]{oobject,uArrayList,uArrayList1,uoa,uob};
          if (!PatchProxy.applyVoid(objArray1, obj, on, "17")) {
          label_00da :
             a = uoa.a;
             b uob1 = new b(p0.a(), p0.b(), "filterAggregationResourceType");
             uob1.e = System.currentTimeMillis();
             String str1 = (uoa.b != null)? DownloadTask$DownloadTaskType.PRE_DOWNLOAD.name(): DownloadTask$DownloadTaskType.IMMEDIATE.name();
             uob1.h = str1;
             uob1.m = String.valueOf(uoa.a.mFilterId);
             if (uArrayList != null && (uArrayList1 == null || uArrayList.size() != uArrayList1.size())) {
                Object[] objArray2 = new Object[0];
                a.D().w(str, "downloadRes names urls error "+uArrayList1+uArrayList, objArray2);
                n.k(a, uob, uob1);
             }else if(uArrayList.size() > 6){
                objArray = new Object[i];
                a.D().w(str, "download task maxsize is [6]", objArray);
                n.k(a, uob, uob1);
             }else {
                HashMap hashMap = new HashMap();
                int i3 = uArrayList.size();
                int i4 = 0;
                while (i4 < i3) {
                   String str2 = uArrayList1.get(i4);
                   a1.k();
                   DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(uArrayList.get(i4)).setDestinationDir(c.a()).setAllowedNetworkTypes(i2).setDestinationFileName(str2);
                   uDownloadReq.setBizInfo(":ks-features:ft-post:components:prettify-kwai", "post_filter_download", obj);
                   DownloadTask$DownloadTaskType pRE_DOWNLOAD = (uoa.b != null)? DownloadTask$DownloadTaskType.PRE_DOWNLOAD: DownloadTask$DownloadTaskType.IMMEDIATE;
                   uDownloadReq.setDownloadTaskType(pRE_DOWNLOAD);
                   uDownloadReq.setNeedCDNReport(i1);
                   uDownloadReq.setResourceType(16);
                   if (uoa.b != null) {
                      oobject.a = "pre_download";
                   }
                   m om = i2;
                   int i5 = i4;
                   int i6 = i3;
                   b uob2 = uob1;
                   m om1 = i2;
                   Object obj1 = obj;
                   b uob3 = uob;
                   om = new m(hashMap, str2, p2, a, i6, uArrayList1, uob2);
                   if (f.b()) {
                      c.a().d(oobject, uDownloadReq, om1);
                      str2 = 1;
                   }else {
                      b[] uobArray = new b[]{om1};
                      DownloadManager.n().E(uDownloadReq, uobArray);
                   }
                   i4 = i5 + 1;
                   uob = uob3;
                   i3 = i6;
                   uob1 = uob2;
                   obj = obj1;
                   i1 = true;
                   i2 = 3;
                   uoa = p1;
                }
             }
          }
       }else {
          goto label_00da ;
       }
       return;
    }
}
