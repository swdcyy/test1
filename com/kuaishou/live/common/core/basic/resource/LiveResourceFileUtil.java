package com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$a;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.util.Set;
import java.util.LinkedHashSet;
import qrd.p;
import java.util.List;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ja1.d;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import ja1.f;
import ja1.f$a;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import kotlin.jvm.internal.a;
import nsd.u;
import java.io.File;
import java.lang.reflect.Type;
import z83.a;
import java.util.ArrayList;
import com.kuaishou.live.common.core.basic.resource.e;
import s02.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$c;
import com.kuaishou.live.common.core.basic.tools.g;
import com.kuaishou.live.common.core.basic.tools.g$c;
import com.kuaishou.live.common.core.basic.tools.g$d$a;
import com.kuaishou.live.common.core.basic.tools.g$d;
import com.kuaishou.live.common.core.basic.tools.g$a;
import com.kuaishou.live.common.core.basic.resource.f;
import la1.a;
import java.util.UUID;
import com.kuaishou.live.common.core.basic.resource.g;
import lnc.i3;
import k2b.u1;
import com.yxcorp.download.DownloadManager;
import qkd.b;
import wkd.b;
import j80.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveControlFileDownloadConfig;
import wg3.a;
import android.content.SharedPreferences;
import km8.b;
import o56.c;
import o56.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$a;
import va1.f;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import ia1.g;
import ia1.f;
import erd.g;
import crd.b;
import com.kuaishou.live.common.core.basic.resource.controlfiles.LiveControlFilePolicy;
import ja1.e;
import ja1.c;
import ja1.c$a;
import na1.a;
import ja1.a;
import java.lang.Enum;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer;
import ja1.b;
import ka1.a;

public class LiveResourceFileUtil	// class@000ebc
{
    public HashMap a;
    public static final List b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final List e;
    public static final HashMap f;
    public static boolean g;
    public static final Set h;

    static {
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveControlFileUtil$a uoa = LiveControlFileUtil$a.class;
       LiveResourceFileUtil.b = new Vector();
       LiveResourceFileUtil.c = new ConcurrentHashMap();
       LiveResourceFileUtil.d = new ConcurrentHashMap();
       LiveResourceFileUtil.e = new Vector();
       LiveResourceFileUtil.f = new HashMap();
       LiveControlFileUtil$a e = LiveControlFileUtil.e;
       Objects.requireNonNull(e);
       LinkedHashSet obj = PatchProxy.apply(null, e, uoa, "4");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("liveResourceFileOptSwitch", false);
       LiveResourceFileUtil.g = b;
       Objects.requireNonNull(e);
       obj = PatchProxy.apply(null, e, uoa, "10");
       if (obj != patchProxyRe) {
       }else {
          obj = new LinkedHashSet();
          obj.add(String.valueOf(34));
          obj.add(String.valueOf(53));
          Boolean uBoolean = PatchProxy.apply(null, e, uoa, "3");
          if (uBoolean == patchProxyRe) {
             uBoolean = LiveControlFileUtil.d.getValue();
          }
          if (uBoolean.booleanValue()) {
             obj.add(String.valueOf(26));
          }
       }
       LiveResourceFileUtil.h = obj;
    }
    public void LiveResourceFileUtil(){
       super();
    }
    public static synchronized void a(List p0,StringBuilder p1){
       boolean b;
       _monitor_enter(LiveResourceFileUtil.class);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveResourceFileUtil.class, "31")) {
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }else {
          LiveResourceFileUtil$LiveResourceFileType[] liveResource = LiveResourceFileUtil$LiveResourceFileType.values();
          int len = liveResource.length;
          int i = 0;
          while (i < len) {
             object oobject = liveResource[i];
             LiveResourceFileUtil$LiveResourceFileType mType = oobject.mType;
             d obj = PatchProxy.applyOneRefs(mType, null, LiveResourceFileUtil.class, "32");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(LiveControlFileUtil.e.b() && (mType == null || mType.isEmpty())){
                b = false;
             }else {
                b = LiveResourceFileUtil.h.contains(mType);
             }
             if (!b) {
                List b1 = LiveResourceFileUtil.b;
                if (b1.contains(oobject)) {
                   b.Z(LiveLogTag.LIVE_RESOURCE, "checkUpdatesForResourceFile: type "+oobject+" is checking");
                }else {
                   p0.add(oobject);
                   b1.add(oobject);
                   if (!TextUtils.x(p1)) {
                      p1 = p1+",";
                   }
                   p1 = p1+oobject.mType;
                   LiveControlFileUtil$a e = LiveControlFileUtil.e;
                   Objects.requireNonNull(e);
                   obj = PatchProxy.apply(null, e, LiveControlFileUtil$a.class, "6");
                   boolean b2 = true;
                   if (obj != PatchProxyResult.class) {
                      b2 = obj.booleanValue();
                   }else {
                      obj = LiveControlFileUtil.a;
                      if (obj == null || obj.enablePatch != b2) {
                         b2 = false;
                      }
                   }
                   if (b2) {
                      Map map = e.a();
                      if (map != null) {
                         List list = map.get(oobject.mType);
                         if (list != null) {
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               p1 = p1+","+iterator.next();
                            }
                         }
                      }
                   }
                }
             }
             i = i + 1;
          }
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }
    }
    public static void b(LiveResourceFileUtil$LiveResourceFileType p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveResourceFileUtil.class, "27")) {
          return;
       }
       if (p0.mIsNeedHighPriorityDownload == null) {
          return;
       }
       for (int i = 0; i < p1.length; i++) {
          p1[i] = TextUtils.d(p1[i], "liveHighPriorityDownloadTag");
       }
       return;
    }
    public static f c(LiveResourceFileUtil$LiveResourceFileType p0,LiveResourceFileResponse$LiveResourceFileInfo p1,boolean p2,boolean p3){
       LiveResourceFileUtil$d b;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(LiveResourceFileUtil.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, LiveResourceFileUtil.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          return null;
       }else {
          String[] stringArray = e0.b(p1.mFileUrls, null);
          if (stringArray == null || !stringArray.length) {
             return null;
          }else {
             LiveResourceFileUtil.b(p0, stringArray);
             DownloadTask$DownloadTaskType pRE_DOWNLOAD = (p3)? DownloadTask$DownloadTaskType.PRE_DOWNLOAD: DownloadTask$DownloadTaskType.IMMEDIATE;
             b.Z(LiveLogTag.LIVE_RESOURCE, "downloadLiveResourceFile type "+p1.mType+" with url: "+stringArray[0]);
             f$a uoa1 = new f$a();
             uoa1.c = p1.mIsZipFile;
             String str = p0.mFilePathInfo.a();
             Object obj1 = PatchProxy.applyOneRefs(str, uoa1, uoa, "1");
             if (obj1 != PatchProxyResult.class) {
                uoa1 = obj1;
             }else {
                a.p(str, "path");
                uoa1.a = str;
             }
             b = p0.mFilePathInfo.b;
             Objects.requireNonNull(uoa1);
             Object obj2 = PatchProxy.applyOneRefs(b, uoa1, uoa, "2");
             if (obj2 != PatchProxyResult.class) {
                uoa1 = obj2;
             }else {
                a.p(b, "fileName");
                uoa1.b = b;
             }
             LiveResourceFileResponse$LiveResourceFileInfo mMd5 = p1.mMd5;
             Objects.requireNonNull(uoa1);
             obj2 = PatchProxy.applyOneRefs(mMd5, uoa1, uoa, "3");
             if (obj2 != PatchProxyResult.class) {
                uoa1 = obj2;
             }else {
                a.p(mMd5, "targetMd5");
                uoa1.d = mMd5;
             }
             Objects.requireNonNull(uoa1);
             Object obj3 = PatchProxy.applyOneRefs(stringArray, uoa1, uoa, "4");
             if (obj3 != PatchProxyResult.class) {
                uoa1 = obj3;
             }else {
                a.p(stringArray, "targetUrls");
                uoa1.e = stringArray;
             }
             uoa1.i = LiveResourceFileUtil.o(p0);
             Object obj4 = PatchProxy.applyOneRefs(pRE_DOWNLOAD, uoa1, uoa, "6");
             if (obj4 != PatchProxyResult.class) {
                uoa1 = obj4;
             }else {
                a.p(pRE_DOWNLOAD, "taskType");
                uoa1.h = pRE_DOWNLOAD;
             }
             LiveResourceFileResponse$LiveResourceFileInfo mType = p1.mType;
             Objects.requireNonNull(uoa1);
             obj4 = PatchProxy.applyOneRefs(mType, uoa1, uoa, "5");
             if (obj4 != PatchProxyResult.class) {
                uoa1 = obj4;
             }else {
                a.p(mType, "type");
                uoa1.f = mType;
             }
             p0 = p0.mDownloadBizType;
             Objects.requireNonNull(uoa1);
             Object obj5 = PatchProxy.applyOneRefs(p0, uoa1, uoa, "8");
             if (obj5 != PatchProxyResult.class) {
                uoa1 = obj5;
             }else {
                a.p(p0, "type");
                uoa1.g = p0;
             }
             uoa1.k = p2;
             LiveResourceFileResponse$LiveResourceFileInfo mVersion = p1.mVersion;
             p1 = PatchProxy.applyOneRefs(mVersion, uoa1, uoa, "7");
             if (p1 != PatchProxyResult.class) {
                uoa1 = p1;
             }else {
                a.p(mVersion, "version");
                uoa1.l = mVersion;
             }
             Objects.requireNonNull(uoa1);
             f uof = f.class;
             f uof1 = PatchProxy.apply(null, uoa1, uoa, "9");
             if (uof1 != PatchProxyResult.class) {
             }else {
                uof1 = new f(null);
                uof1.a = uoa1.a;
                uof1.b = uoa1.b;
                uof1.c = uoa1.c;
                uof1.d = uoa1.d;
                uof1.e = uoa1.e;
                uof1.f = uoa1.f;
                f$a h = uoa1.h;
                if (!PatchProxy.applyVoidOneRefs(h, uof1, uof, "1")) {
                   a.p(h, "<set-?>");
                   uof1.h = h;
                }
                uof1.i = uoa1.i;
                uof1.l = uoa1.k;
                h = uoa1.l;
                if (!PatchProxy.applyVoidOneRefs(h, uof1, uof, "2")) {
                   a.p(h, "<set-?>");
                   uof1.n = h;
                }
                uof1.g = uoa1.g;
             }
             return uof1;
          }
       }
    }
    public static boolean d(LiveResourceFileUtil$LiveResourceFileType p0,LiveResourceFileResponse$LiveResourceFileInfo p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveResourceFileUtil.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(p0.mFilePathInfo.b());
       HashMap hashMap = a.b(HashMap.class);
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       boolean b = (obj.exists() && (!obj.isDirectory() || (obj.list() != null && (LiveResourceFileUtil.m(obj) || (p1 != null && !(p1.mVersion).equals(hashMap.get(p1.mType)))))))? true: false;
       return b;
    }
    public static synchronized void e(){
       _monitor_enter(LiveResourceFileUtil.class);
       if (PatchProxy.applyVoid(null, null, LiveResourceFileUtil.class, "3")) {
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }else {
          LiveResourceFileUtil.f(true);
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }
    }
    public static synchronized void f(boolean p0){
       _monitor_enter(LiveResourceFileUtil.class);
       ArrayList uArrayList = new ArrayList();
       StringBuilder str = "";
       e.b();
       LiveResourceFileUtil.a(uArrayList, str);
       b.Z(LiveLogTag.LIVE_RESOURCE, "checkUpdatesForResourceFile for file types: "+str);
       if (TextUtils.x(str)) {
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }else {
          a.a(false);
          LiveResourceFileUtil.p(uArrayList, str, p0);
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }
    }
    public static boolean g(boolean p0,LiveResourceFileUtil$LiveResourceFileType p1,LiveResourceFileResponse$LiveResourceFileInfo p2,String p3,LiveResourceFileUtil$c p4){
       String[] obj1;
       boolean b;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveResourceFileUtil liveResource = LiveResourceFileUtil.class;
       LiveResourceFileResponse$LiveResourceFileInfo obj = null;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 0;
       if (PatchProxy.isSupport(liveResource)) {
          Object[] objArray = new Object[i];
          objArray[i4] = Boolean.valueOf(p0);
          objArray[1] = oobject;
          objArray[i3] = oobject1;
          objArray[i2] = p3;
          objArray[i1] = oobject2;
          obj1 = PatchProxy.apply(objArray, obj, liveResource, "25");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       obj1 = e0.b(oobject1.mFileUrls, obj);
       if (obj1 == null || !obj1.length) {
          return i4;
       }else {
          LiveResourceFileUtil.b(oobject, obj1);
          b.Z(LiveLogTag.LIVE_RESOURCE, "downloadLiveResourceFile with url: "+obj1[i4]);
          DownloadTask$DownloadTaskType pRE_DOWNLOAD = (p0)? DownloadTask$DownloadTaskType.PRE_DOWNLOAD: DownloadTask$DownloadTaskType.IMMEDIATE;
          b = LiveResourceFileUtil.o(p1);
          String str = oobject.mFilePathInfo.a();
          LiveResourceFileUtil$d b1 = oobject.mFilePathInfo.b;
          obj = oobject1.mIsZipFile;
          LiveResourceFileResponse$LiveResourceFileInfo mMd5 = oobject1.mMd5;
          LiveResourceFileUtil$LiveResourceFileType mDownloadBiz = oobject.mDownloadBizType;
          g og = g.class;
          if (PatchProxy.isSupport(og)) {
             Object[] objArray1 = new Object[9];
             objArray1[i4] = pRE_DOWNLOAD;
             objArray1[1] = Boolean.valueOf(b);
             objArray1[i3] = obj1;
             objArray1[i2] = str;
             objArray1[4] = b1;
             objArray1[5] = Boolean.valueOf(obj);
             objArray1[6] = mMd5;
             objArray1[7] = oobject2;
             objArray1[8] = mDownloadBiz;
             if (PatchProxy.apply(objArray1, null, og, "3") != patchProxyRe) {
             label_00d5 :
                return 1;
             }
          }
          g$d$a uod$a = new g$d$a();
          uod$a.i(obj1);
          uod$a.a(mDownloadBiz);
          uod$a.g(str);
          uod$a.h(b1);
          uod$a.d(obj);
          uod$a.e(mMd5);
          uod$a.c(pRE_DOWNLOAD);
          uod$a.f(b);
          g.a(uod$a.b(), oobject2);
          goto label_00d5 ;
       }
    }
    public static void h(LiveResourceFileUtil$LiveResourceFileType p0){
       LiveResourceFileUtil liveResource = LiveResourceFileUtil.class;
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, liveResource, "5")) {
          return;
       }
       if (LiveResourceFileUtil.g) {
          if (!PatchProxy.applyVoidOneRefs(p0, obj, liveResource, "6") && LiveResourceFileUtil.r(p0)) {
             LiveResourceFileUtil.t(p0, LiveResourceFileUtil.c.get(p0), new f(p0, p0), false);
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, obj, liveResource, "7") || !LiveResourceFileUtil.r(p0)){
          LiveResourceFileResponse$LiveResourceFileInfo liveResource1 = LiveResourceFileUtil.c.get(p0);
          if (LiveResourceFileUtil.s(p0, liveResource1, true)) {
             obj = UUID.randomUUID().toString();
             LiveResourceFileUtil.g(false, p0, liveResource1, obj, new g(liveResource1, obj, p0));
          }
       }
       return;
    }
    public static String i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ", fileType = "+p0+", sCurrentCheckingResourceFileType = "+LiveResourceFileUtil.b;
    }
    public static File j(LiveResourceFileUtil$LiveResourceFileType p0,String p1){
       boolean b;
       e uoe = e.class;
       Object obj = null;
       HashMap obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, LiveResourceFileUtil.class, "12");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (LiveResourceFileUtil.l()) {
          obj1 = LiveResourceFileUtil.f;
          if (obj1.get(p0.mType) == null || !obj1.get(p0.mType).booleanValue()) {
             LiveResourceFileUtil$LiveResourceFileType mType = p0.mType;
             if (!PatchProxy.applyVoidOneRefs(mType, obj, uoe, "3")) {
                i3 oi31 = i3.f();
                oi31.d("resource_type", mType);
                String str1 = oi31.toString();
                u1.R("LIVE_RESOURCE_USING_DETAILS", str1, 3);
             }
             obj1.put(p0.mType, Boolean.TRUE);
          }
       }
       DownloadManager.C(p0.mDownloadBizType, "");
       String[] stringArray = new String[]{p1};
       File uFile = b.B(stringArray);
       p0 = p0.mType;
       b = uFile.exists();
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(b), obj, uoe, "4")) {
          i3 oi3 = i3.f();
          oi3.d("resType", p0);
          String str = (b)? "0": "1";
          oi3.d("isResReady", str);
          u1.R("control_file_consume_event", oi3.toString(), 3);
       }
       return uFile;
    }
    public static String k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).d(p0).getAbsolutePath();
    }
    public static boolean l(){
       boolean b;
       Object[] objArray = null;
       LiveConfigStartupResponse$LiveControlFileDownloadConfig obj = PatchProxy.apply(objArray, objArray, LiveResourceFileUtil.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveConfigStartupResponse$LiveControlFileDownloadConfig.class;
       String str = a.a.getString("liveControlFileDownloadConfig", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       b = (objArray != null && objArray.mEnableLiveControlFileDownloadPolicy != null)? true: false;
       return b;
    }
    public static boolean m(File p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0.isDirectory()) {
          return b;
       }
       obj = p0.list();
       if (obj == null || obj.length > 1) {
          return b;
       }
       return new File(p0, ".nomedia").exists();
    }
    public static boolean n(LiveResourceFileUtil$LiveResourceFileType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new File(p0.mFilePathInfo.b()).exists();
    }
    public static boolean o(LiveResourceFileUtil$LiveResourceFileType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (a.a().c()) {
          return b;
       }
       if (p0 == LiveResourceFileUtil$LiveResourceFileType.MERCHANT_SKIN || (p0 == LiveResourceFileUtil$LiveResourceFileType.LIVE_WEALTH_GRADE_ENTER_ROOM_EFFECT || (p0 == LiveResourceFileUtil$LiveResourceFileType.MMU_MODEL || (p0 == LiveResourceFileUtil$LiveResourceFileType.MMU_ROBOT_MODEL || (p0 == LiveResourceFileUtil$LiveResourceFileType.ROBOT_AUDIO || (p0 == LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_CUSTOM_SKIN_V2 || (p0 != LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_ANCHOR_HONOR_V2 && p0 != LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_SLOT_BACKGROUND_RESOURCE))))))) {
          b = false;
       }
    label_0042 :
       return b;
    }
    public static synchronized void p(List p0,StringBuilder p1,boolean p2){
       _monitor_enter(LiveResourceFileUtil.class);
       if (PatchProxy.isSupport(LiveResourceFileUtil.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, LiveResourceFileUtil.class, "13")) {
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }else {
          f.a(LiveResourceFileUtil$a.class).a(p1).map(new e()).observeOn(d.c).subscribe(new g(p0, p2), new f(p0));
          _monitor_exit(LiveResourceFileUtil.class);
          return;
       }
    }
    public static void q(LiveResourceFileUtil$LiveResourceFileType p0){
       HashMap hashMap = a.b(HashMap.class);
       if (hashMap == null) {
          return;
       }
       hashMap.remove(p0.mType);
       a.e(hashMap);
       return;
    }
    public static boolean r(LiveResourceFileUtil$LiveResourceFileType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!LiveResourceFileUtil.l()) {
          return b;
       }
       if (LiveResourceFileUtil.e.contains(p0)) {
          return b;
       }
       if (LiveResourceFileUtil.c.get(p0) != null) {
          b = true;
       }
       return b;
    }
    public static boolean s(LiveResourceFileUtil$LiveResourceFileType p0,LiveResourceFileResponse$LiveResourceFileInfo p1,boolean p2){
       File obj;
       if (PatchProxy.isSupport(LiveResourceFileUtil.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, LiveResourceFileUtil.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new File(p0.mFilePathInfo.b());
       HashMap hashMap = a.b(HashMap.class);
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       boolean b = (p2 && (obj.exists() && (!obj.isDirectory() || (obj.list() != null && (LiveResourceFileUtil.m(obj) || (p1 != null && !(p1.mVersion).equals(hashMap.get(p1.mType))))))))? true: false;
       return b;
    }
    public static boolean t(LiveResourceFileUtil$LiveResourceFileType p0,LiveResourceFileResponse$LiveResourceFileInfo p1,a p2,boolean p3){
       c$a obj1;
       ArrayList uArrayList1;
       Object obj = p0;
       boolean b = p3;
       if (PatchProxy.isSupport(LiveResourceFileUtil.class)) {
          obj1 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, LiveResourceFileUtil.class, "4");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       boolean b1 = false;
       if (p1 == null) {
          return b1;
       }else {
          boolean b2 = LiveResourceFileUtil.d(p0, p1);
          ArrayList uArrayList = PatchProxy.applyOneRefs(obj, null, LiveResourceFileUtil.class, "18");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             List list = LiveResourceFileUtil.d.get(obj.mType);
             uArrayList1 = new ArrayList();
             if (list != null) {
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   LiveResourceFileResponse$LiveResourceFileInfo liveResource = iterator1.next();
                   if (LiveResourceFileUtil.d(obj, liveResource)) {
                      uArrayList1.add(liveResource);
                   }
                }
             }
             uArrayList = uArrayList1;
          }
          int i = uArrayList.isEmpty() ^ 1;
          if (b2 || i) {
             LiveControlFilePolicy mULTI_BIZ_ME = LiveControlFilePolicy.MULTI_BIZ_MERGE;
             object oobject = (b2)? p1: null;
             if (PatchProxy.isSupport(LiveResourceFileUtil.class)) {
                Object[] objArray = new Object[]{Boolean.valueOf(p3),mULTI_BIZ_ME,obj,oobject,uArrayList,p2};
                if (!PatchProxy.applyVoid(objArray, null, LiveResourceFileUtil.class, "19")) {
                label_00a5 :
                   uArrayList1 = new ArrayList();
                   f uof = LiveResourceFileUtil.c(obj, oobject, 1, b);
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      f uof1 = LiveResourceFileUtil.c(obj, iterator.next(), b1, b);
                      if (uof1 != null) {
                         uArrayList1.add(uof1);
                      }
                   }
                   if (!uArrayList1.isEmpty() || uof != null) {
                      String str = obj.mFilePathInfo.a();
                      LiveResourceFileUtil$d b3 = obj.mFilePathInfo.b;
                      boolean b4 = (uof != null)? true: false;
                      e uoe = new e(mULTI_BIZ_ME, str, b3, uof, uArrayList1, b4, p2);
                      obj1 = c.a;
                      Objects.requireNonNull(obj1);
                      c$a uoa = c$a.class;
                      if (!PatchProxy.applyVoidOneRefs(iterator, obj1, uoa, "1")) {
                         a.p(iterator, "task");
                         e b5 = iterator.b;
                         Object obj2 = PatchProxy.applyOneRefs(b5, obj1, uoa, "2");
                         if (obj2 != PatchProxyResult.class) {
                         }else if(a.a[b5.ordinal()] != 1){
                            obj2 = null;
                         }else {
                            obj2 = new LiveControlFileDownloadProducer().b(new LiveControlFileMd5CheckProducer()).b(new LiveControlFileUnzipToMergeProducer()).b(new LiveControlFileStatisticProducer());
                         }
                         if (obj2 != null) {
                            obj2.c(iterator, new b(iterator, null));
                         }
                      }
                   }
                }
             }else {
                goto label_00a5 ;
             }
             return 1;
          }else {
             return b1;
          }
       }
    }
}
