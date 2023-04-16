package com.kwai.sdk.eve.internal.pack.EvePackageManager;
import qn7.e;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$a;
import nsd.u;
import vm7.a;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.sdk.eve.EveTaskPackageSource;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$mEnableFetchFromKeep$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$mNetworkChangedReceiver$1;
import xn7.a;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import tn7.b;
import java.util.Map;
import java.util.List;
import tn7.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$d;
import java.lang.Throwable;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1;
import msd.l;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import qn7.d;
import com.kwai.sdk.eve.internal.common.utils.a;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.kwai.sdk.eve.internal.common.models.EvePackageManagerException$ContextNullException;
import java.util.ArrayList;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$DownloadCondition;
import ekd.p0;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$DownloadCondition$a;
import java.util.Date;
import java.lang.System;
import java.text.SimpleDateFormat;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import java.lang.CharSequence;
import zsd.u;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$PackageItem;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem;
import ftd.r1;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$downloadPackage$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import java.util.Collection;
import java.util.ListIterator;
import zn7.g;
import rn7.d;
import com.kwai.sdk.eve.internal.pack.api.EveServerPackageDetail;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.sdk.switchconfig.a;
import trd.t0;
import java.lang.reflect.Type;
import kotlin.Result;
import qrd.j0;
import java.util.LinkedHashMap;
import java.lang.Integer;
import trd.t;
import tm7.a;
import com.kwai.sdk.eve.internal.api.EveApi;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$e;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$f;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$g;
import erd.g;
import erd.a;
import crd.b;
import com.kwai.sdk.eve.internal.common.EvePreference;
import java.util.Set;
import java.util.Map$Entry;
import trd.y;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$h;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.Long;
import vsd.d;
import nsd.m0;
import android.content.SharedPreferences;
import en7.q;
import java.util.Objects;
import java.lang.Float;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import qn7.a;
import ekd.k1;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$i;
import java.lang.IllegalArgumentException;
import crd.a;
import trd.u0;
import trd.u;
import kotlin.Pair;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$j;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$k;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$l;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$UpdateConfig;

public final class EvePackageManager implements e	// class@00158d
{
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public d f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final CopyOnWriteArrayList i;
    public EveTaskPackageSource j;
    public File k;
    public a l;
    public ExecutorService m;
    public ExecutorService n;
    public a o;
    public CoroutineDispatcher p;
    public EveApi q;
    public a r;
    public final p s;
    public IPackageDownloader t;
    public a u;
    public final CopyOnWriteArrayList v;
    public final EvePackageManager$mNetworkChangedReceiver$1 w;
    public final a x;
    public final EvePackageManager$c y;
    public static final EvePackageManager$a z;

    static {
       EvePackageManager.z = new EvePackageManager$a(null);
    }
    public void EvePackageManager(a p0,EvePackageManager$c p1){
       a.p(p0, "context");
       a.p(p1, "master");
       super();
       this.x = p0;
       this.y = p1;
       this.e = -1;
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = new CopyOnWriteArrayList();
       this.j = EveTaskPackageSource.RecoServer;
       this.s = s.c(EvePackageManager$mEnableFetchFromKeep$2.INSTANCE);
       this.v = new CopyOnWriteArrayList();
       this.w = new EvePackageManager$mNetworkChangedReceiver$1(this);
    }
    public static final a b(EvePackageManager p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mDownloadLogger");
       }
       return p0;
    }
    public static void t(EvePackageManager p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.s(p1);
       return;
    }
    public static void z(EvePackageManager p0,EveServerPackage p1,boolean p2,int p3,Object p4){
       int i = 2;
       if (p3 & i) {
          p2 = false;
       }
       EvePackageManager uEvePackageM = EvePackageManager.class;
       if (!PatchProxy.isSupport(uEvePackageM) || !PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(p2), p0, uEvePackageM, "17")) {
          EveLog.i$default("EPM#updateTaskPackageByServer : serverPackage = "+p1, false, i, null);
          uEvePackageM = p0.g;
          _monitor_enter(uEvePackageM);
          b uob = p0.v(p1);
          if (uob == null) {
             EveLog.w$default("EPM#updateTaskPackageByServer : can not transformToTaskPackage ===> serverPackage = "+p1, false, i, null);
             _monitor_exit(uEvePackageM);
          }else {
             b uob1 = p0.h.get(uob.taskId);
             if (uob1 != null) {
                if (a.g(uob1, uob)) {
                   EveLog.w$default("EPM#updateTaskPackageByServer : same isUpdating return ===> "+uob1, false, i, null);
                   _monitor_exit(uEvePackageM);
                }else {
                   EveLog.w$default("EPM#updateTaskPackageByServer : another isUpdating ===> "+uob1, false, i, null);
                }
             }
             if (p0.h() && uob.keepTaskId == null) {
                uob1 = p0.g.get(uob.taskId);
                boolean b = (uob1 != null)? uob1.f(): false;
                if (b) {
                   EveLog.w$default("EPM#updateTaskPackageByServer : can\'t update from reco server when last is from keep "+uob, false, i, null);
                   _monitor_exit(uEvePackageM);
                }
             }
          label_00c3 :
             p0.h.put(uob.taskId, uob);
             uob1 = p0.g.get(uob.taskId);
             List list = (uob1 != null)? c.b(uob1): null;
             b uob2 = 1;
             if (list == null || list.contains(uob) != uob2) {
                uob2 = null;
             }
             if (uob2) {
                EveLog.w$default("EPM#updateTaskPackageByServer : hasDownload ===> serverPackage = "+p1, false, i, null);
                p0.j(uob);
                _monitor_exit(uEvePackageM);
             }else if(p0.y.a(uob.taskId, uob.version)){
                EveLog.e$default("EPM#updateTaskPackageByServer "+uob.taskId+' '+uob.version+" localGuard download disable", false, i, null);
                _monitor_exit(uEvePackageM);
             }else if(!p2){
                i = p0.i.iterator();
                while (i.hasNext()) {
                   EvePackageManager$d uod = i.next();
                   if (uod != null) {
                      uod.a(p1);
                   }
                }
             }
             p0.e(p1, uob, new EvePackageManager$updateTaskPackageByServer$$inlined$synchronized$lambda$1(uob, p0, p1, p2));
             _monitor_exit(uEvePackageM);
          }
       }
       return;
    }
    public final boolean A(b p0){
       File obj = PatchProxy.applyOneRefs(p0, this, EvePackageManager.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.usingStatus == 2) {
          return false;
       }
       obj = p0.b();
       File uFile = p0.a();
       if (uFile != null) {
          if (d.b(uFile) && uFile.isFile()) {
             d.a(uFile);
          }
          if (d.b(uFile) && (uFile.isDirectory() && this.d(uFile, p0))) {
             if (d.b(obj)) {
                EveLog.w$default("EPM#verify "+p0.taskId+" dirUnzip already exist, zipFile no need save,"+" delete zipFile:"+obj, false, 2, null);
                d.a(obj);
             }
             return true;
          }else {
             d.a(uFile);
             if (obj == null || (d.b(obj) && obj.isFile())) {
                if (a.g(p0.md5, a.e(obj)) ^ true) {
                   return false;
                }else {
                   uFile.mkdirs();
                   a.i(obj, uFile.getAbsolutePath());
                   boolean b = this.d(uFile, p0);
                   if (b) {
                      EveLog.w$default("EPM#verify "+p0.taskId+" unzip success, delete zipFile:"+obj.getAbsolutePath(), false, 2, null);
                      d.a(obj);
                   }else {
                      EveLog.w$default("EPM#verify "+p0.taskId+" unzip fail", false, 2, null);
                   }
                   return b;
                }
             }
          }
       }
    label_00e2 :
       return false;
    }
    public b a(String p0){
       EvePackageManager obj = PatchProxy.applyOneRefs(p0, this, EvePackageManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "taskId");
       obj = this.g;
       _monitor_enter(obj);
       b uob = (this.i(p0))? null: this.g.get(p0);
       _monitor_exit(obj);
       return uob;
    }
    public final Context c(){
       Context obj = PatchProxy.apply(null, this, EvePackageManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x.c().get();
       if (obj == null) {
          throw new EvePackageManagerException$ContextNullException();
       }
       a.o(obj, "context.contextRef.get\(\)¡­ow ContextNullException\(\)");
       return obj;
    }
    public final boolean d(File p0,b p1){
       StringBuilder str;
       File[] obj = PatchProxy.applyTwoRefs(p0, p1, this, EvePackageManager.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d.b(p0) || !p0.isDirectory()) {
          return false;
       }
       obj = p0.listFiles();
       if (obj != null) {
          obj = (!obj.length)? 1: 0;
          if (!obj) {
             str = null;
          label_0035 :
             if (str) {
                return false;
             }else {
                str = "EPM#checkFileTree : taskId = "+p1.taskId+", version = "+p1.version+"\n== "+p0.getName();
                StringBuilder str1 = "";
                File[] uFileArray = p0.listFiles();
                if (uFileArray != null) {
                   ArrayList uArrayList = new ArrayList(uFileArray.length);
                   int len = uFileArray.length;
                   for (int i = 0; i < len; i = i + 1) {
                      object oobject = uFileArray[i];
                      a.o(oobject, "it");
                      uArrayList.add("\n - "+oobject.getName());
                   }
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      str1 = str1+iterator.next();
                   }
                }
                EveLog.i$default(str+str1, false, 2, null);
                return true;
             }
          }
       }
       str = 1;
       goto label_0035 ;
    }
    public final void e(EveServerPackage p0,b p1,l p2){
       boolean this;
       boolean b;
       IPackageDownloader$DownloadIncrementalItem uDownloadInc;
       EveServerPackage uEveServerPa;
       EveServerPackage$PackageItem md51;
       String str4;
       String str5;
       boolean b2;
       Date uDate;
       SimpleDateFormat simpleDateFo;
       Date uDate1;
       Date uDate2;
       Object obj = this;
       Object obj1 = p0;
       EveServerPackage obj2 = p1;
       l ol = p2;
       EvePackageManager uEvePackageM = EvePackageManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EvePackageManager.class, "24")) {
          return;
       }
       int i = 2;
       Object obj3 = null;
       this = false;
       EveLog.i$default("EPM#downloadPackage : serverPackage = "+obj1, this, i, obj3);
       EveServerPackage obj4 = PatchProxy.applyOneRefs(obj1, obj, uEvePackageM, "26");
       String str = 1;
       if (obj4 != patchProxyRe) {
          b = obj4.booleanValue();
       }else {
          obj4 = obj1.condition;
          if (obj4 != null) {
             EveServerPackage$DownloadCondition$a obj5 = PatchProxy.applyOneRefs(obj4, obj, uEvePackageM, "27");
             if (obj5 != patchProxyRe) {
                b = obj5.booleanValue();
             }else if(obj4.wifiOnly != null && !p0.F(this.c())){
                EveServerPackage$DownloadCondition disDurationD = obj4.disDurationDurations;
                if (disDurationD != null) {
                   Iterator iterator = disDurationD.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         obj5 = iterator.next();
                         if (obj5 != null) {
                            EveServerPackage$DownloadCondition$a obj6 = PatchProxy.applyOneRefs(obj5, obj, uEvePackageM, "28");
                            if (obj6 != patchProxyRe) {
                               b2 = obj6.booleanValue();
                            }else {
                               obj6 = obj5.start;
                               if (obj6 != null) {
                                  obj5 = obj5.end;
                                  if (obj5 != null) {
                                     long l1 = 5;
                                     if (obj6.length() == l1 && obj5.length() == l1) {
                                        uDate = new Date(System.currentTimeMillis());
                                        simpleDateFo = new SimpleDateFormat("HH:mm");
                                        uDate1 = simpleDateFo.parse(obj6);
                                        if (uDate1 != null) {
                                           uDate1.setYear(uDate.getYear());
                                           uDate1.setMonth(uDate.getMonth());
                                           uDate1.setDate(uDate.getDate());
                                           uDate2 = simpleDateFo.parse(obj5);
                                           if (uDate2 != null) {
                                              uDate2.setYear(uDate.getYear());
                                              uDate2.setMonth(uDate.getMonth());
                                              uDate2.setDate(uDate.getDate());
                                              if (!uDate.after(uDate1) || !uDate.before(uDate2)) {
                                              label_0131 :
                                                 b2 = false;
                                              }
                                           }else {
                                              goto label_0131 ;
                                           }
                                        }else {
                                           goto label_0131 ;
                                        }
                                     }else {
                                        l1 = 16;
                                        if (obj6.length() == l1 && obj5.length() == l1) {
                                           uDate = new Date(System.currentTimeMillis());
                                           simpleDateFo = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                                           uDate1 = simpleDateFo.parse(obj6);
                                           if (uDate1 != null) {
                                              uDate2 = simpleDateFo.parse(obj5);
                                              if (uDate2 == null || (!uDate.after(uDate1) || !uDate.before(uDate2))) {
                                              }
                                           }else {
                                              goto label_0131 ;
                                           }
                                        }else {
                                           goto label_0131 ;
                                        }
                                     }
                                     b2 = true;
                                  }else {
                                     goto label_0131 ;
                                  }
                               }else {
                                  goto label_0131 ;
                               }
                            }
                            if (!b2) {
                               continue ;
                            }
                         }
                      }
                   }
                }
                b = true;
             }
             b = false;
             if (!b) {
                b = false;
             }
          }
          b = true;
       }
       if (!b) {
          ol.invoke(Boolean.FALSE);
          EveLog.w$default("EPM#downloadPackage : CHECK can not download ===> serverPackage = "+obj1, this, i, obj3);
          return;
       }else {
          obj4 = PatchProxy.applyTwoRefs(obj2, obj1, obj, uEvePackageM, "29");
          if (obj4 != patchProxyRe) {
             uDownloadInc = obj4;
          }else {
             EvePackageManager g = obj.g;
             _monitor_enter(g);
             b uob = obj.g.get(obj2.taskId);
             if (uob != null) {
                b baseVersion = obj2.baseVersion;
                b uob1 = PatchProxy.applyTwoRefs(uob, baseVersion, obj3, c.class, "2");
                if (uob1 != patchProxyRe) {
                }else if(baseVersion != null){
                   b uob2 = (u.S1(baseVersion) ^ str)? baseVersion: obj3;
                   if (uob2 != null) {
                      uob1 = uob;
                      while (true) {
                         if (uob1 != null) {
                            if (!a.g(uob1.version, baseVersion)) {
                               uob1 = uob1.d();
                            }
                         }else {
                            uob1 = uob.c();
                            while (true) {
                               if (uob1 != null) {
                                  if (!a.g(uob1.version, baseVersion)) {
                                     uob1 = uob1.c();
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             label_01b8 :
                uob1 = obj3;
                if (uob1 != null) {
                   uob = uob1.filePath;
                label_01bf :
                   uob1 = obj2.taskId;
                   obj2 = obj1.isIncremental;
                   EveServerPackage fullPack = obj1.fullPack;
                   if (fullPack != null) {
                      String str2 = fullPack.a();
                      if (str2 != null) {
                         fullPack = obj1.fullPack;
                         if (fullPack != null) {
                            EveServerPackage$PackageItem version = fullPack.version;
                            if (version != null) {
                               EveServerPackage$PackageItem md5 = fullPack.md5;
                               if (md5 != null) {
                                  EveServerPackage condition = obj1.condition;
                                  EveServerPackage$DownloadCondition uDownloadCon = (condition != null)? condition.wifiOnly: false;
                                  if (obj2 != null) {
                                     if (uob != null && !u.S1(uob)) {
                                        str = null;
                                     }
                                     if (str == null && d.b(new File(uob))) {
                                        uEveServerPa = obj1.incrementalPack;
                                        if (uEveServerPa != null) {
                                           str = uEveServerPa.a();
                                           if (str != null) {
                                           label_020a :
                                              String str3 = str;
                                              uEveServerPa = obj1.incrementalPack;
                                              if (uEveServerPa != null) {
                                                 EveServerPackage$PackageItem version1 = uEveServerPa.version;
                                                 if (version1 != null) {
                                                 label_0217 :
                                                    if (uEveServerPa != null) {
                                                       md51 = uEveServerPa.md5;
                                                       if (md51 != null) {
                                                       label_0220 :
                                                          str4 = obj.p(uob1, version, md5);
                                                          a.o(str4, "obtainFilePath\(\n        ¡­      fullMd5\n          \)");
                                                          str5 = obj.p(uob1, version1, md51);
                                                          a.o(str5, "obtainFilePath\(\n        ¡­ncrementalMd5\n          \)");
                                                          IPackageDownloader$DownloadIncrementalItem uDownloadInc1 = new IPackageDownloader$DownloadIncrementalItem(uob1, version, str2, str4, md5, str3, str5, md51, uob, uDownloadCon);
                                                       label_0256 :
                                                          _monitor_exit(g);
                                                       }
                                                    }
                                                    md51 = "";
                                                    goto label_0220 ;
                                                 }
                                              }
                                              str5 = "";
                                              goto label_0217 ;
                                           }
                                        }
                                        str = "";
                                        goto label_020a ;
                                     }
                                  }
                               label_0242 :
                                  str4 = obj.p(uob1, version, md5);
                                  a.o(str4, "obtainFilePath\(\n        ¡­      fullMd5\n          \)");
                                  IPackageDownloader$DownloadItem uDownloadIte = new IPackageDownloader$DownloadItem(uob1, version, str2, str4, md5, uDownloadCon);
                                  goto label_0256 ;
                               }else {
                                  _monitor_exit(g);
                               }
                            }
                         }
                         _monitor_exit(g);
                      }else {
                      label_025c :
                         _monitor_exit(g);
                      }
                   }else {
                      goto label_025c ;
                   }
                   uDownloadInc = obj3;
                }
             }
             uob = obj3;
             goto label_01bf ;
          }
          if (uDownloadInc == null) {
             EveLog.w$default("EPM#downloadPackage : downloadItem can not download ===> serverPackage = "+obj1, this, i, obj3);
             ol.invoke(Boolean.FALSE);
          }
          if (uDownloadInc != null) {
             obj4 = obj1.taskId;
             if (obj4 == null) {
                String str1 = "";
             }
             uEveServerPa = obj4;
             long l = System.currentTimeMillis();
             r1 b1 = r1.b;
             EvePackageManager p = obj.p;
             if (p == null) {
                a.S("mIODispatcher");
             }
             EvePackageManager$downloadPackage$1 uodownloadPa = new EvePackageManager$downloadPackage$1(this, uDownloadInc, p0, uEveServerPa, l, p2, null);
             a.f(b1, p, null, v14, 2, null);
          }
          return;
       }
    }
    public final void f(String p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager.class, "20")) {
          return;
       }
       EvePackageManager tg = this.g;
       _monitor_enter(tg);
       boolean b = false;
       b uob = null;
       EveLog.i$default("EPM#dropAllTaskPackage : taskId = "+p0, b, 2, uob);
       b uob1 = this.g.get(p0);
       if (uob1 != null) {
          List list = c.b(uob1);
          if (list != null) {
             if (!(list.isEmpty() ^ 1)) {
                list = uob;
             }
             if (list != null) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                   if (listIterator.hasPrevious()) {
                      obj = listIterator.previous();
                      if (!obj.g()) {
                         continue ;
                      }
                   }else {
                      obj = uob;
                   }
                   if (obj != null) {
                      EveLog.e$default("EPM#dropAllTaskPackage : cancel task = "+obj, b, 2, uob);
                      EvePackageManager tl = this.l;
                      if (tl == null) {
                         a.S("mContext");
                      }
                      tl.i().remove(p0);
                   }
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      b uob2 = iterator.next();
                      if (uob2.a != 2) {
                         if (!this.q(uob2)) {
                            if (uob2.usingStatus != 2) {
                               uob2.usingStatus = 2;
                               uob = uob2;
                            }else {
                               uob = uob2;
                               continue ;
                            }
                         }
                         b = true;
                      }else {
                         continue ;
                      }
                   }
                   if (obj == null) {
                      obj = uob;
                   }
                   if (obj != null) {
                      this.g.put(p0, obj);
                   }
                }
             }
          }
       }
       if (b) {
          this.u();
       }
       _monitor_exit(tg);
       return;
    }
    public final void g(b p0,boolean p1){
       EvePackageManager uEvePackageM = EvePackageManager.class;
       if (PatchProxy.isSupport(uEvePackageM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uEvePackageM, "19")) {
          return;
       }
       boolean b = p0.g();
       EveLog.w$default("EPM#finishLinkTaskPackage : isRunning = "+b+", isCanRunning = "+p0.e()+','+" needNotify = "+p1+", taskPackage = "+p0, false, 2, null);
       this.u();
       if (!b && p1) {
          this.n(p0);
       }
       this.h.remove(p0.taskId);
       return;
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, EvePackageManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.s.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean i(String p0){
       EvePackageManager obj = PatchProxy.applyOneRefs(p0, this, EvePackageManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       int i = 1;
       if (obj != null) {
          d packageDetai = obj.packageDetail;
          if (packageDetai != null) {
             EveServerPackageDetail dropList = packageDetai.dropList;
             if (dropList != null) {
                if (!(dropList.isEmpty() ^ i)) {
                   dropList = null;
                }
                if (dropList != null) {
                   List list = CollectionsKt___CollectionsKt.d2(dropList);
                   if (list != null && list.contains(p0) == i) {
                   label_0039 :
                      return i;
                   }
                }
             }
          }
       }
       i = false;
       goto label_0039 ;
    }
    public final void j(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager.class, "18")) {
          return;
       }
       EvePackageManager tg = this.g;
       _monitor_enter(tg);
       int i = 1;
       p0.j(i);
       int i1 = 2;
       boolean b = false;
       EveLog.i$default("EPM#linkNewTaskPackage : taskPackage = "+p0, b, i1, null);
       b uob = this.h.get(p0.taskId);
       int i2 = a.g(uob, p0) ^ i;
       if (i2) {
          EveLog.w$default("EPM#linkNewTaskPackage : stop because the last updating is another = "+uob, b, i1, null);
          _monitor_exit(tg);
          return;
       }else {
          uob = this.g.get(p0.taskId);
          b uob1 = this.g.get(p0.taskId);
          List list = (uob1 != null)? c.b(uob1): null;
          uob1 = (list != null)? CollectionsKt___CollectionsKt.e3(list): null;
          if (a.g(uob, p0)) {
             uob.updateConfig = p0.updateConfig;
             this.g(uob, b);
             EveLog.w$default("EPM#linkNewTaskPackage : has been active ===> active = "+uob, b, i1, null);
             _monitor_exit(tg);
             return;
          }else if(a.g(uob1, p0)){
             uob1.updateConfig = p0.updateConfig;
             this.g(uob1, i);
             EveLog.w$default("EPM#linkNewTaskPackage : has been last and notify ===> last = "+uob, b, i1, null);
             _monitor_exit(tg);
             return;
          }else if(uob == null){
             this.g.put(p0.taskId, p0);
             this.g(p0, i);
          }else if(uob1 != null){
             uob = uob1.d();
          }else {
             uob = null;
          }
          while (true) {
             if (uob != null) {
                if (a.g(uob, p0)) {
                   EveLog.w$default("EPM#linkNewTaskPackage : find and move old package  = "+uob, b, i1, null);
                   uob.updateConfig = p0.updateConfig;
                   b uob2 = uob.d();
                   if (uob2 != null) {
                      uob2.h(uob.c());
                   }
                   uob2 = uob.c();
                   if (uob2 != null) {
                      uob2.i(uob.d());
                   }
                   uob.h(null);
                   uob.i(uob1);
                   if (uob1 != null) {
                      uob1.h(uob);
                   }
                   p0.usingStatus = uob.usingStatus;
                   this.g(uob, i);
                   _monitor_exit(tg);
                   return;
                }else {
                   uob = uob.d();
                }
             }else if(uob1 != null){
                uob1.h(p0);
                p0.i(uob1);
             }
             this.g(p0, i);
             break ;
          }
          _monitor_exit(tg);
          return;
       }
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, EvePackageManager.class, "3")) {
          return;
       }
       a uoa = a.t();
       Map value = uoa.getValue("EveTaskIdsCollections", Map.class, t0.z());
       ArrayList uArrayList = (value != null)? value.get("taskIds"): null;
       if (uArrayList != null && (uArrayList.isEmpty() ^ 0x01)) {
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          int i = 4;
          while (iterator.hasNext()) {
             String str = iterator.next();
             EveServerPackage$PackageItem value1 = uoa.getValue(str, EveServerPackage$PackageItem.class, new EveServerPackage$PackageItem());
             if (value1.taskId != null) {
                a.o(value1, "packageInfo");
                uArrayList1.add(value1);
             }
             Object obj = Result.constructor-impl(l1.a);
             Throwable throwable = Result.exceptionOrNull-impl(obj);
             if (throwable != null) {
                EveLog.e$default("EPM#parse "+str+" config error", throwable, false, i, null);
             }
             if (Result.isSuccess-impl(obj)) {
                EveLog.w$default("EPM#parse "+str+" config finished", false, 2, null);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList1, this, EvePackageManager.class, "10") && !uArrayList1.isEmpty()) {
             Iterator iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                EveServerPackage$PackageItem packageItem = iterator1.next();
                EveServerPackage uEveServerPa = PatchProxy.applyOneRefs(packageItem, this, EvePackageManager.class, "11");
                if (uEveServerPa != PatchProxyResult.class) {
                }else {
                   uEveServerPa = new EveServerPackage();
                   uEveServerPa.isIncremental = false;
                   uEveServerPa.taskId = packageItem.taskId;
                   uEveServerPa.fullPack = packageItem;
                }
                EvePackageManager.z(this, uEveServerPa, false, 2, null);
             }
          }
       }
       return;
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EvePackageManager.class, "4")) {
          return;
       }
       int i = 2;
       boolean b = false;
       if (this.b == null) {
          EveLog.w$default("EPM#requestTaskPackage : has not init completed", b, i, objArray);
          return;
       }else if(this.q == null){
          EveLog.w$default("EPM#requestServerPackage : mApi is null ===>", b, i, objArray);
          return;
       }else {
          EveLog.w$default("EPM#requestServerPackage : start ===>", b, i, objArray);
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator = this.g.values().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob.f()) {
                linkedHashMa.put("bizId", uob.taskId);
                linkedHashMa.put("version", Integer.valueOf(uob.keepTaskVersion));
             }
          }
          List list = t.k(linkedHashMa);
          EvePackageManager tq = this.q;
          if (tq != null) {
             a uoa = tq.d();
             if (uoa != null) {
                String str = DataKt.a().q(list);
                a.o(str, "gson.toJson\(list\)");
                uoa.d(str, new EvePackageManager$e(this), EvePackageManager$f.b, EvePackageManager$g.b);
             }
          }
          return;
       }
    }
    public final boolean m(){
       StringBuilder str2;
       EvePackageManager uEvePackageM;
       b uob1;
       EvePackageManager obj = PatchProxy.apply(null, this, EvePackageManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 2;
       EveLog.i$default("EPM#loadLocalPackage : ", false, i, null);
       obj = this.g;
       _monitor_enter(obj);
       EvePackageManager tl = this.l;
       if (tl == null) {
          a.S("mContext");
       }
       List list = tl.g().d();
       StringBuilder str = "EPM#loadLocalPackage : local size = ";
       Integer integer = (list != null)? Integer.valueOf(list.size()): null;
       str = str+integer+','+"\nlocalList ===>";
       StringBuilder str1 = "";
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             str1 = str1+"\n-- "+iterator.next();
          }
       }
       EveLog.i$default(str+str1, false, i, null);
       char c = ' ';
       int i1 = 1;
       if (list != null) {
          list = CollectionsKt___CollectionsKt.d2(list);
          if (list != null) {
             Iterator iterator1 = list.iterator();
             str2 = null;
             uEvePackageM = null;
             while (iterator1.hasNext()) {
                b uob = iterator1.next();
                if (this.y.b(uob.taskId, uob.version)) {
                   if (this.q(uob)) {
                      EveLog.e$default("EPM "+uob.taskId+c+uob.version+" localGuard realDropTaskPackage success", false, i, null);
                   }else if(uob.usingStatus != i){
                      EveLog.e$default("EPM "+uob.taskId+c+uob.version+" localGuard realDropTaskPackage fail", false, i, null);
                      uob.usingStatus = i;
                      uob1 = c.a(this.g.get(uob.taskId));
                      if (uob1 != null) {
                         uob1.h(uob);
                      }
                      uob.i(uob1);
                      if (uob1 == null) {
                         this.g.put(uob.taskId, uob);
                      }
                   }
                   str2 = 1;
                }else if(this.A(uob)){
                   uob.j(i1);
                   EveLog.i$default("EPM#loadLocalPackage : verify success ===> taskPackage = "+uob, false, i, null);
                   b uob2 = c.a(this.g.get(uob.taskId));
                   if (uob2 != null) {
                      uob2.h(uob);
                   }
                   uob.i(uob2);
                   this.g.put(uob.taskId, uob);
                }else {
                   EveLog.i$default("EPM#loadLocalPackage : verify fail need request ===> taskPackage = "+uob, false, i, null);
                   if (!this.q(uob)) {
                      if (uob.usingStatus != i) {
                         uob.usingStatus = i;
                         uob1 = c.a(this.g.get(uob.taskId));
                         if (uob1 != null) {
                            uob1.h(uob);
                         }
                         uob.i(uob1);
                         if (uob1 == null) {
                            this.g.put(uob.taskId, uob);
                         }
                      }else {
                      label_01a6 :
                         uEvePackageM = 1;
                      }
                   }
                   str2 = 1;
                   goto label_01a6 ;
                }
             }
             if (str2 != null) {
                this.u();
             }
             ArrayList uArrayList = new ArrayList();
             iterator1 = this.g.entrySet().iterator();
             while (iterator1.hasNext()) {
                y.q0(uArrayList, c.b(iterator1.next().getValue()));
             }
             if (!uArrayList.isEmpty()) {
                i1 = uEvePackageM;
             }
             StringBuilder str3 = "EPM#loadLocalPackage : map size = "+this.g.size()+"\nmap ===> ";
             str2 = "";
             Set set = this.g.keySet();
             a.o(set, "mTaskPackageMap.keys");
             Iterator iterator2 = set.iterator();
             while (iterator2.hasNext()) {
                String str4 = iterator2.next();
                str2 = str2+"\n-- "+str4+" : "+this.g.get(str4)+c;
             }
             EveLog.i$default(str3+str2, false, i, null);
             tl = this.l;
             if (tl == null) {
                a.S("mContext");
             }
             this.f = tl.g().c();
             EveLog.i$default("EPM#loadLocalPackage : updateTaskPackageByResponse ===> Init", false, i, null);
             this.y(this.f, null);
             EvePackageManager tn = this.n;
             if (tn == null) {
                a.S("mIOExecutorService");
             }
             tn.submit(new EvePackageManager$h(this));
             _monitor_exit(obj);
             return i1;
          }
       }
       str2 = null;
       uEvePackageM = null;
       goto label_01ab ;
    }
    public final void n(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager.class, "37")) {
          return;
       }
       int i = 2;
       EveLog.w$default("EPM#notifyListeners : taskPackage = "+p0, false, i, null);
       if (this.i(p0.taskId)) {
          EveLog.w$default("EPM#notifyListeners : has Drop ===> taskPackage = "+p0, false, i, null);
          return;
       }else if(!p0.e()){
          EveLog.w$default("EPM#notifyListeners : isCan Not Running ===> taskPackage = "+p0, false, i, null);
          return;
       }else {
          Iterator iterator = this.i.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0);
          }
          return;
       }
    }
    public final void o(boolean p0){
       EvePackageManager uEvePackageM = EvePackageManager.class;
       if (PatchProxy.isSupport(uEvePackageM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEvePackageM, "36")) {
          return;
       }
       uEvePackageM = this.g;
       _monitor_enter(uEvePackageM);
       if (!p0 && this.b == null) {
          _monitor_exit(uEvePackageM);
          return;
       }else {
          Iterator iterator = this.g.entrySet().iterator();
          while (iterator.hasNext()) {
             this.n(iterator.next().getValue());
          }
          _monitor_exit(uEvePackageM);
          return;
       }
    }
    public final String p(String p0,String p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EvePackageManager.class, "32");
       if (obj != patchProxyRe) {
          return obj;
       }
       EvePackageManager tk = this.k;
       String str = PatchProxy.applyThreeRefs(p0, p1, p2, this, EvePackageManager.class, "31");
       if (str != patchProxyRe) {
       }else {
          str = a.g(p0+'|'+p1+'|'+p2);
       }
       return new File(tk, str).getAbsolutePath();
    }
    public final boolean q(b p0){
       String str = "EPM#realDropTaskPackage : delete dir = ";
       String str1 = "EPM#realDropTaskPackage : delete zip = ";
       Object obj = PatchProxy.applyOneRefs(p0, this, EvePackageManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       EveLog.i$default("EPM#realDropTaskPackage : dropPackage = "+p0, false, 2, null);
       boolean b = true;
       File uFile = p0.b();
       if (uFile != null && uFile.delete() == b) {
          EveLog.w$default(str1+p0.b(), false, 2, null);
       }
    label_006a :
       File uFile1 = p0.a();
       if (uFile1 != null && FilesKt__UtilsKt.V(uFile1) == b) {
          EveLog.w$default(str+p0.a(), false, 2, null);
       }
    label_00a4 :
       if (d.b(p0.b()) || d.b(p0.a())) {
          b = false;
       }
       if (b) {
          b uob = p0.c();
          if (uob != null) {
             uob.i(p0.d());
          }
          p0.h(null);
          uob = p0.d();
          if (uob != null) {
             uob.h(p0.c());
          }
          p0.i(null);
       }
       EveLog.e$default("EPM#realDropTaskPackage : success = "+b+", dropPackage = "+p0, false, 2, null);
       return b;
    }
    public final void r(){
       Object[] objArray1;
       int b;
       long l;
       String str1;
       String str2;
       EvePackageManager to;
       Long longx1;
       String str3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EvePackageManager.class, "39")) {
          return;
       }
       EvePackageManager tl = this.l;
       String str = "mContext";
       if (tl == null) {
          a.S(str);
       }
       EvePreference uEvePreferen = tl.g();
       Long longx = Long.valueOf(-1);
       if (!u.S1("last_pack_list_report_time")) {
          d uod = m0.d(longx.getClass());
          if (a.g(uod, m0.d(Boolean.TYPE))) {
             objArray1 = (!longx instanceof Boolean)? objArray: longx;
             b = (objArray1 != null)? objArray1.booleanValue(): false;
             if (uEvePreferen.a().getBoolean("last_pack_list_report_time", b)) {
                longx = Boolean.TRUE;
             }
          }else if(a.g(uod, m0.d(String.class))){
             objArray1 = (!longx instanceof String)? objArray: longx;
             if (objArray1 == null) {
                str1 = "";
             }
             str2 = uEvePreferen.a().getString("last_pack_list_report_time", objArray1);
             l = (str2 == null || !str2.length())? 1: 0;
             if (!l) {
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.Long");
                longx = str2;
             }
          }else if(a.g(uod, m0.d(Integer.TYPE))){
             objArray1 = (!longx instanceof Integer)? objArray: longx;
             str3 = Integer.MIN_VALUE;
             b = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
             int intx = uEvePreferen.a().getInt("last_pack_list_report_time", b);
             if (intx != str3) {
                longx = Integer.valueOf(intx);
             }
          }else if(a.g(uod, m0.d(Long.TYPE))){
             l = uEvePreferen.a().getLong("last_pack_list_report_time", longx.longValue());
             if (l - Long.MIN_VALUE) {
                longx = Long.valueOf(l);
             }
          }else if(a.g(uod, m0.d(Float.TYPE))){
             objArray1 = (!longx instanceof Float)? objArray: longx;
             str3 = 1;
             float f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
             float floatx = uEvePreferen.a().getFloat("last_pack_list_report_time", f);
             if (floatx - str3) {
                longx = Float.valueOf(floatx);
             }
          }
          l = longx.longValue();
          if (SystemUtil.S(new Date(System.currentTimeMillis()), new Date(l))) {
             EveLog.i$default("EPM#reportPackSpace disable, lastReportTime:"+l, false, 2, objArray);
             return;
          }else {
             tl = this.o;
             str1 = "mPackConfig";
             if (tl == null) {
                a.S(str1);
             }
             if (!k1.l(tl.a())) {
                str2 = "EPM#reportPackSpace disable, ratio:";
                to = this.o;
                if (to == null) {
                   a.S(str1);
                }
                EveLog.i$default(str2+to.a(), false, 2, objArray);
                return;
             }else {
                str2 = "EPM#reportPackSpace enable, ratio:";
                EvePackageManager to1 = this.o;
                if (to1 == null) {
                   a.S(str1);
                }
                EveLog.i$default(str2+to1.a(), false, 2, objArray);
                tl = this.l;
                if (tl == null) {
                   a.S(str);
                }
                tl.g().b("last_pack_list_report_time", Long.valueOf(System.currentTimeMillis()));
                tl = this.n;
                if (tl == null) {
                   a.S("mIOExecutorService");
                }
                tl.submit(new EvePackageManager$i(this));
                return;
             }
          }
       }else {
          throw new IllegalArgumentException("pref key is empty");
       }
    }
    public final void s(boolean p0){
       EvePackageManager tr;
       EvePackageManager uEvePackageM = EvePackageManager.class;
       if (PatchProxy.isSupport(uEvePackageM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEvePackageM, "13")) {
          return;
       }
       boolean b = false;
       int i = 2;
       EveServerPackage$PackageItem obj = null;
       EveLog.i$default("EPM#requestServerPackage : ===> isFirst = "+p0, b, i, obj);
       if (!p0 && this.b == null) {
          EveLog.w$default("EPM#requestServerPackage : has not init completed ===>", b, i, obj);
          return;
       }else if(this.q == null){
          EveLog.w$default("EPM#requestServerPackage : mApi is null ===>", b, i, obj);
          return;
       }else {
          long l = System.currentTimeMillis();
          if ((l - this.d) - 0xea60 > 0) {
             tr = this.r;
             if (tr != null) {
                tr.dispose();
             }
             this.r = new a();
             this.c = b;
          }
          if (this.c != null) {
             EveLog.w$default("EPM#requestServerPackage : is requesting ===>", b, i, obj);
             return;
          }else {
             this.c = true;
             this.d = l;
             EveLog.w$default("EPM#requestServerPackage : start ===>", b, i, obj);
             ArrayList uArrayList = PatchProxy.apply(obj, this, uEvePackageM, "16");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                tr = this.g;
                _monitor_enter(tr);
                List list = u0.D1(this.g);
                ArrayList uArrayList1 = new ArrayList(u.Y(list, 10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Pair pair = iterator.next();
                   String str1 = pair.component1();
                   b uob1 = pair.component2();
                   obj = new EveServerPackage$PackageItem();
                   obj.taskId = str1;
                   obj.version = uob1.version;
                   obj.md5 = uob1.md5;
                   uArrayList1.add(obj);
                }
                _monitor_exit(tr);
                uArrayList = uArrayList1;
             }
             uEvePackageM = this.q;
             if (uEvePackageM != null) {
                a uoa = uEvePackageM.d();
                if (uoa != null) {
                   String str = DataKt.a().q(uArrayList);
                   a.o(str, "gson.toJson\(requestLocalList\)");
                   b uob = uoa.a(str, new EvePackageManager$j(this, uArrayList), new EvePackageManager$k(this), new EvePackageManager$l(this));
                   if (uob != null) {
                      uEvePackageM = this.r;
                      if (uEvePackageM != null) {
                         uEvePackageM.c(uob);
                      }
                   }
                }
             }
             return;
          }
       }
    }
    public final void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EvePackageManager.class, "8")) {
          return;
       }
       EvePackageManager tg = this.g;
       _monitor_enter(tg);
       StringBuilder str = "EPM#saveTaskPackage : map size = "+this.g.size()+"\nmap ===> ";
       StringBuilder str1 = "";
       Set set = this.g.keySet();
       a.o(set, "mTaskPackageMap.keys");
       Iterator iterator = set.iterator();
       char c = ' ';
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          str1 = str1+"\n-- "+str2+" : "+this.g.get(str2)+c;
       }
       int i = 2;
       EveLog.i$default(str+str1, false, i, objArray);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator1 = this.g.entrySet().iterator();
       while (iterator1.hasNext()) {
          y.q0(uArrayList, c.b(iterator1.next().getValue()));
       }
       str = "EPM#saveTaskPackage : allList size = "+uArrayList.size()+"\nallList ===> ";
       StringBuilder str3 = "";
       Iterator iterator2 = uArrayList.iterator();
       while (iterator2.hasNext()) {
          b uob = iterator2.next();
          str3 = str3+"\n-- "+uob.taskId+" : "+uob+c;
       }
       EveLog.i$default(str+str3, false, i, objArray);
       EvePackageManager tl = this.l;
       if (tl == null) {
          a.S("mContext");
       }
       EvePreference uEvePreferen = tl.g();
       Objects.requireNonNull(uEvePreferen);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, uEvePreferen, EvePreference.class, "5")) {
          uEvePreferen.b("KEY_EVE_TASK_PACKAGE_LIST", DataKt.a().q(uArrayList));
       }
       _monitor_exit(tg);
       return;
    }
    public final b v(EveServerPackage p0){
       EveServerPackage$PackageItem packageItem2;
       Object obj = this;
       Object obj1 = p0;
       b obj2 = PatchProxy.applyOneRefs(obj1, obj, EvePackageManager.class, "30");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       EveServerPackage taskId = obj1.taskId;
       obj2 = null;
       if (taskId != null) {
          EveServerPackage fullPack = obj1.fullPack;
          if (fullPack != null) {
             EveServerPackage$PackageItem version = fullPack.version;
             if (version != null && fullPack != null) {
                EveServerPackage$PackageItem md5 = fullPack.md5;
                if (md5 != null) {
                   EveServerPackage$PackageItem packageItem = (fullPack != null)? fullPack.a: 0;
                   EveServerPackage$PackageItem packageItem1 = (fullPack != null)? fullPack.b: 0;
                   String str = obj.p(taskId, version, md5);
                   a.o(str, "obtainFilePath\(\n        ¡­,\n        fullMd5\n      \)");
                   fullPack = obj1.incrementalPack;
                   String str1 = "";
                   if (fullPack != null) {
                      EveServerPackage$PackageItem version1 = fullPack.version;
                      if (version1 != null) {
                         packageItem2 = version1;
                      label_004d :
                         fullPack = obj1.baseVersion;
                         EveServerPackage uEveServerPa = (fullPack != null)? fullPack: str1;
                         b uob = new b(taskId, str, md5, version, packageItem2, uEveServerPa, 0, obj1.updateConfig, packageItem, packageItem1, 0, 1024, null);
                      }
                   }
                   packageItem2 = str1;
                   goto label_004d ;
                }
             }
          }
       }
       return obj2;
    }
    public final void w(IPackageDownloader$DownloadItem p0,boolean p1){
       String str = "EPM#tryToCleanDownloadRubbish : delete incrementalFile = ";
       EvePackageManager uEvePackageM = EvePackageManager.class;
       if (PatchProxy.isSupport(uEvePackageM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uEvePackageM, "25")) {
          return;
       }
       EveLog.i$default("EPM#tryToCleanDownloadRubbish : ", false, 2, null);
       if (p0 instanceof IPackageDownloader$DownloadIncrementalItem && p0.d().delete()) {
          EveLog.w$default(str+p0.d(), false, 2, null);
       }
    label_0067 :
       if (!p1 && p0.a().delete()) {
          EveLog.w$default("EPM#tryToCleanDownloadRubbish : delete zip = "+p0.a(), false, 2, null);
       }
    label_00a1 :
       return;
    }
    public final void x(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager.class, "43")) {
          return;
       }
       EveLog.i$default("EPM#tryToDropTaskPackage : from = "+p0, false, 2, null);
       ArrayList uArrayList = new ArrayList();
       for (; p0 != null; p0 = p0.d()) {
          uArrayList.add(p0);
       }
       Iterator iterator = uArrayList.iterator();
       int i = 0;
       StringBuilder str = null;
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!str && uob.usingStatus == 1) {
             EveLog.w$default("EPM#tryToDropTaskPackage : keep ===> "+uob, false, 2, null);
             str = 1;
          }else {
             EveLog.w$default("EPM#tryToDropTaskPackage : drop ====> "+uob, false, 2, null);
             if (!this.q(uob)) {
                if (uob.usingStatus != 2) {
                   uob.usingStatus = 2;
                }
             }
             i = 1;
          }
       }
       if (i) {
          this.u();
       }
       return;
    }
    public synchronized final void y(d p0,List p1){
       List list;
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EvePackageManager.class, "14")) {
          return;
       }
       EveServerPackageDetail uEveServerPa = null;
       EveLog.i$default("EPM#updateTaskPackageByResponse : response = "+DataKt.a().q(p0), false, 2, uEveServerPa);
       if (p0 != null) {
          p0.a(p1);
       }
       if (p0 != null) {
          d packageDetai = p0.packageDetail;
          if (packageDetai != null) {
             if (a.g(this.f, p0) ^ 0x01) {
                this.f = p0;
                EvePackageManager tl = this.l;
                if (tl == null) {
                   a.S("mContext");
                }
                EvePreference uEvePreferen = tl.g();
                Objects.requireNonNull(uEvePreferen);
                if (!PatchProxy.applyVoidOneRefs(p0, uEvePreferen, EvePreference.class, "3")) {
                   uEvePreferen.b("KEY_EVE_SERVER_PACKAGE_RESPONSE", DataKt.a().q(p0));
                }
             }
             EveServerPackageDetail updateList = packageDetai.updateList;
             if (updateList != null) {
                if (!(updateList.isEmpty() ^ 0x01)) {
                   updateList = uEveServerPa;
                }
                if (updateList != null) {
                   list = CollectionsKt___CollectionsKt.d2(updateList);
                   if (list != null) {
                      iterator = list.iterator();
                      while (iterator.hasNext()) {
                         EvePackageManager.z(this, iterator.next(), false, 2, uEveServerPa);
                      }
                   }
                }
             }
             updateList = packageDetai.dropList;
             if (updateList != null) {
                if (updateList.isEmpty() ^ 0x01) {
                   uEveServerPa = updateList;
                }
                if (uEveServerPa != null) {
                   list = CollectionsKt___CollectionsKt.d2(uEveServerPa);
                   if (list != null) {
                      iterator = list.iterator();
                      while (iterator.hasNext()) {
                         this.f(iterator.next());
                      }
                   }
                }
             }
             return;
          }
       }
       return;
    }
}
