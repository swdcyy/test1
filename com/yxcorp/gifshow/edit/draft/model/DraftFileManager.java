package com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import mca.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.feature.post.api.core.model.GSConfig;
import java.util.ArrayList;
import ekd.j;
import java.lang.Boolean;
import mrd.a;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$a;
import android.os.Looper;
import o56.c;
import o56.a;
import android.app.Application;
import haa.f;
import q87.c;
import java.lang.System;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import wkd.b;
import j80.c;
import java.io.File;
import laa.t;
import android.content.Context;
import java.lang.Runnable;
import crd.b;
import java.lang.StringBuilder;
import brd.t;
import com.yxcorp.gifshow.edit.draft.model.l;
import erd.r;
import laa.k;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.g;
import com.yxcorp.gifshow.edit.draft.model.f;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.b0;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import com.kuaishou.edit.draft.Workspace;
import com.google.protobuf.Timestamp;
import iaa.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kuaishou.edit.draft.Workspace$Source;
import java.util.List;
import laa.i;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import org.apache.internal.commons.io.filefilter.TrueFileFilter;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$b;
import kud.d;
import qkd.b;
import laa.n;
import java.io.IOException;
import laa.l0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.s6;
import java.util.HashSet;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.draft.model.c;
import laa.x;
import java.util.Objects;
import java.util.Calendar;
import java.lang.CharSequence;
import android.text.format.DateFormat;
import java.util.UUID;
import laa.m0;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$DraftFileException;
import com.yxcorp.gifshow.util.PostUtils;
import laa.z;
import laa.h;
import o56.d;
import android.os.Environment;
import com.yxcorp.gifshow.edit.draft.model.r;
import java.io.FileFilter;
import com.kwai.feature.post.api.reedit.PublishedBackUpInfo;
import java.util.regex.Pattern;
import lnc.v5;
import laa.r;
import com.yxcorp.gifshow.edit.draft.model.p;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.media.util.h;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$d;
import java.util.concurrent.ConcurrentMap;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import ekd.w0;
import java.util.Map;
import qkd.c;
import java.nio.charset.Charset;
import iud.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$c;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.InputStream;
import ekd.p;
import brd.a0;
import java.lang.Iterable;
import com.yxcorp.gifshow.edit.draft.model.h;
import com.yxcorp.gifshow.edit.draft.model.z;
import erd.c;
import brd.m;
import com.yxcorp.gifshow.edit.draft.model.k;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import java.lang.Long;
import com.yxcorp.gifshow.edit.draft.model.i;
import java.lang.Integer;
import laa.f0;
import java.util.concurrent.Callable;
import jaa.c;
import jaa.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import com.yxcorp.gifshow.edit.draft.model.DraftFileNotFoundException;
import com.yxcorp.gifshow.edit.draft.model.DraftNoSpaceLeftException;
import com.yxcorp.gifshow.edit.draft.model.DraftLoadException;
import w46.b;
import ekd.k1;
import laa.i0;
import msd.l;
import laa.e0;
import haa.d;
import xf6.g;
import com.kwai.framework.abtest.f;
import java.util.regex.Matcher;
import com.kuaishou.edit.draft.Workspace$From;
import com.kuaishou.edit.draft.EditConfig$b;
import com.kuaishou.edit.draft.EditConfig;
import laa.y;
import com.yxcorp.gifshow.edit.draft.model.t;
import io.reactivex.g;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.OriginalVoice$b;
import com.kuaishou.edit.draft.OriginalVoice;
import com.yxcorp.gifshow.edit.draft.model.x;
import laa.g0;
import com.yxcorp.gifshow.edit.draft.model.j;
import laa.e;
import mba.m0;
import laa.j;
import laa.j0;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import oe6.g;
import laa.v;
import laa.h0;
import laa.l;
import android.os.Handler;
import laa.g;
import com.yxcorp.gifshow.edit.draft.model.y;
import laa.k0;

public final class DraftFileManager	// class@001aed
{
    public File a;
    public File b;
    public z c;
    public final a d;
    public final ConcurrentMap e;
    public final ConcurrentMap f;
    public final Object g;
    public final b0 h;
    public final a i;
    public final Handler j;
    public static final DraftFileManager k;
    public static final int l;
    public static final List m;

    static {
       String[] obj;
       int i;
       DraftFileManager.k = new DraftFileManager();
       if (a.x()) {
          obj = PatchProxy.apply(null, null, a.class, "2");
          i = (obj != PatchProxyResult.class)? obj.intValue(): ClipKitConfigManager.getSingleImageQuality();
       }else {
          i = GSConfig.j();
       }
       DraftFileManager.l = i;
       obj = new String[]{"CASE_FILE_DIR"};
       DraftFileManager.m = j.a(obj);
    }
    public void DraftFileManager(){
       long l;
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       super();
       this.d = a.h(Boolean.FALSE);
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
       this.g = new Object();
       this.j = new DraftFileManager$a(this, Looper.getMainLooper());
       Application uApplication = a.a().a();
       if (PatchProxy.applyVoidOneRefs(uApplication, this, uDraftFileMa, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          f.D().w("DraftFileManager", "init", objArray);
          l = System.currentTimeMillis();
          if (this.c == null) {
             String str = "workspace";
             this.c = b.b(c.f(str));
             DraftUtils.b = a.m;
             if (!PatchProxy.applyVoidOneRefs(uApplication, this, uDraftFileMa, "2")) {
                this.a = b.a(-1504323719).h(str);
                this.b = b.a(-1504323719).h(".post");
                this.c.d(new t(this, uApplication));
                objArray = new Object[i];
                f.D().w("DraftFileManager", "initWorkspaceDirectory\(\) mWorkspaceDirectory="+this.a.getAbsolutePath()+" mTempDirectory="+this.b.getAbsolutePath(), objArray);
             }
             Object[] objArray1 = new Object[i];
             f.D().w("DraftFileManager", "Init cost "+(System.currentTimeMillis() - l)+" on thread: ", objArray1);
          }
       }
       if (!PatchProxy.applyVoid(null, this, uDraftFileMa, "75")) {
          this.S().filter(l.b).flatMap(new k(this)).subscribe(g.b, f.b);
       }
       this.h = new b0(this);
       this.i = ReEditAfterDeleteOperator.d;
       return;
    }
    public static DraftFileManager E(){
       return DraftFileManager.k;
    }
    public static File F(Workspace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftFileManager.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = new File(DraftFileManager.E().I(p0), "clipped_music_file"+DraftUtils.k0(p0.getOutputContentModifiedAt()));
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "getMusicOutputFile musicOutputFile:"+uFile+",exist:"+uFile.exists(), objArray);
       return uFile;
    }
    public static File L(a p0){
       Object obj = null;
       a obj1 = PatchProxy.applyOneRefs(p0, obj, DraftFileManager.class, "82");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.g;
       if (obj1 != null) {
          if (obj1 != 3) {
             return obj;
          }
          obj1 = p0.f;
          if (obj1 != null) {
             return DraftFileManager.L(obj1);
          }
          i1.c(new RuntimeException("DraftFileManagererror mInternalResourceOrigin is null resource:"+p0));
          return obj;
       }else if(p0.a != null){
          Object[] objArray = new Object[0];
          f.D().w("DraftFileManager", "getResourceOriginFile: "+p0.a, objArray);
          return new File(p0.a);
       }else {
          i1.c(new RuntimeException("DraftFileManagererror mFilePath is null resource:"+p0));
          return obj;
       }
    }
    public static File P(File p0,Workspace p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, DraftFileManager.class, "73");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = PatchProxy.applyOneRefs(p1, obj, DraftUtils.class, "81");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p1.getSource() == Workspace$Source.MERCHANT_COMMENT_RECREATION){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return new File(p0, ".ignore-"+p1.getIdentifier());
       }else {
          return new File(p0, p1.getIdentifier());
       }
    }
    public static List W(File p0,List p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, DraftFileManager.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getAbsolutePath();
       return q.g(b.T(p0, TrueFileFilter.INSTANCE, new DraftFileManager$b(q.g(p1, new i(p0)))), new n(obj, obj.length()));
    }
    public static boolean c0(File p0){
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, null, DraftFileManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.exists() && (!p0.isDirectory() && !b.k0(p0, new File(p0.getParent(), p0.getName()+".bak")))) {
          objArray = new Object[i];
          f.D().A("DraftFileManager", "File at "+p0.getAbsolutePath()+" cannot be renamed.", objArray);
          return i;
       }else if(!p0.exists()){
          if (!p0.mkdirs()) {
             objArray = new Object[i];
             f.D().A("DraftFileManager", "Failed to mkdir "+p0.getAbsolutePath(), objArray);
             return i;
          }else {
             Object[] objArray1 = new Object[i];
             f.D().w("DraftFileManager", "mkdir "+p0.getAbsolutePath(), objArray1);
          }
       }
       try{
          if (new File(p0, ".nomedia").createNewFile()) {
             Object[] objArray2 = new Object[i];
             f.D().w("DraftFileManager", "Create .nomedia in "+p0.getAbsolutePath(), objArray2);
          }
       }catch(java.io.IOException e0){
          l0.c("create .nomedia ", p0.getPath(), e0);
       }
       return true;
    }
    public static void d(c p0,Collection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DraftFileManager.class, "93")) {
          return;
       }
       if (!p1.isEmpty()) {
          DraftFileManager.e(p0, p1, null);
       }
       return;
    }
    public static void d0(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DraftFileManager.class, "11")) {
          return;
       }
       if (p0.exists() && p0.isDirectory()) {
          f uof = f.D();
          String str = "moveContents\(\) Move "+p0.getAbsolutePath()+" to "+p1.getAbsolutePath();
          Object[] objArray = new Object[0];
          try{
             uof.w("DraftFileManager", str, objArray);
             DraftFileManager.f0(p0);
             b.c(p0, p1);
             b.b(p0);
          }catch(java.io.IOException e0){
             l0.c("moveContents\(\): "+p0+" to: "+p1, p1.getPath(), e0);
          }
       }
    }
    public static void e(c p0,Collection p1,List p2){
       c uoc;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DraftFileManager.class, "94")) {
          return;
       }
       if (!s6.c()) {
          return;
       }
       HashSet hashSet = new HashSet();
       ArrayList uArrayList = new ArrayList();
       hashSet.add(p0);
       uArrayList.add(p0.D0());
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          uoc = iterator.next();
          if (hashSet.add(uoc)) {
             uArrayList.add(uoc.D0());
          }
       }
       iterator = hashSet.iterator();
       while (iterator.hasNext()) {
          uoc = iterator.next();
          if (!uArrayList.equals(p2) && !PatchProxy.applyVoidTwoRefs(uoc, uArrayList, null, DraftFileManager.class, "96")) {
             if (!uoc.D()) {
                Object[] objArray = new Object[0];
                f.D().w("DraftFileManager", "setPairIdentifiers not in editing", objArray);
             }else {
                DraftFileManager.E().c.d(new x(uoc, uArrayList));
             }
          }
          Objects.requireNonNull(uoc);
          if (PatchProxy.applyVoidOneRefs(hashSet, uoc, c.class, "70") || !s6.c()) {
             continue ;
          }
          uoc.q = hashSet;
       }
       return;
    }
    public static void f0(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DraftFileManager.class, "22")) {
          return;
       }
       String[] stringArray = p0.list();
       String str = "printFileList ";
       if (stringArray == null || !stringArray.length) {
          Object[] objArray = new Object[0];
          f.D().w("DraftFileManager", str+p0.getAbsoluteFile()+" no files", objArray);
          return;
       }else {
          int len = stringArray.length;
          for (int i = 0; i < len; i = i + 1) {
             Object[] objArray1 = new Object[0];
             f.D().w("DraftFileManager", str+stringArray[i], objArray1);
          }
          return;
       }
    }
    public static String l(){
       Object obj = PatchProxy.apply(null, null, DraftFileManager.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ws_"+DateFormat.format("yyyyMMdd_kkmmss", Calendar.getInstance()).toString()+"_"+UUID.randomUUID().toString();
    }
    public static boolean o0(c p0,boolean p1){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uDraftFileMa, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!DraftUtils.o0(p0, p1)) {
          File uFile = p0.f0();
          Object[] objArray = new Object[0];
          f.D().A("DraftFileManager", "validateAssetFiles, delete "+uFile+" lastModify="+uFile.lastModified()+" "+p0, objArray);
          PostUtils.D("DraftFileManager", "validateAssetFiles", new DraftFileManager$DraftFileException("draft id:"+p0.D0()+" InValidateAssetFiles"));
          File uFile1 = new File(uFile.getParent(), uFile.getName()+".trash");
          if (uFile.renameTo(uFile1)) {
             c.a(new z(uFile1));
          }else {
             b.q(uFile);
          }
          return 0;
       }else {
          return true;
       }
    }
    public static h w(boolean p0){
       File obj;
       Object[] objArray;
       int i1;
       int i2;
       int i3;
       int i4;
       int i5;
       int i6;
       File[] uFileArray;
       ReEditAfterDeleteOperator d;
       long l1;
       File[] uFileArray1;
       int i7;
       boolean b;
       long l2;
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uDraftFileMa, "85");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "local_album_usage";
       int i = 0;
       if (!d.i) {
          objArray = new Object[i];
          f.D().A(str, "getDiskUsage AppStatus.IS_IN_MAIN_PROCESS false", objArray);
          return new h();
       }else if(!("mounted").equals(Environment.getExternalStorageState())){
          objArray = new Object[i];
          f.D().A(str, "getDiskUsage Environment.MEDIA_MOUNTED.equals\(Environment.getExternalStorageState\(\)\) false", objArray);
          return new h();
       }else {
          obj = Environment.getExternalStorageDirectory();
          if (obj == null) {
             objArray = new Object[i];
             f.D().A(str, "getDiskUsage sdcard0 is null", objArray);
             return new h();
          }else {
             File uFile = DraftFileManager.E().O();
             try{
                i1 = 0;
                if (b.r(obj, uFile)) {
                   long l = b.n0(uFile);
                   try{
                      l = l + i1;
                      uFileArray = uFile.listFiles(r.b);
                      i3 = (uFileArray != null)? (long)uFileArray.length + i1: i1;
                      if (p0 && uFileArray != null) {
                         try{
                            i2 = uFileArray.length;
                            i4 = i1;
                            i5 = i4;
                            i6 = i5;
                            while (i < i2) {
                               try{
                                  object oobject = uFileArray[i];
                                  d = ReEditAfterDeleteOperator.d;
                                  PublishedBackUpInfo publishedBac = d.c(oobject.getName());
                                  if (publishedBac != null) {
                                     l1 = i1 + 1;
                                     uFileArray1 = uFileArray;
                                     i7 = i2;
                                     b = d.n(publishedBac.getPublishedDate());
                                     if (b) {
                                        i4 = i4 + 1;
                                     }
                                     if (b && !publishedBac.isAutoSave()) {
                                        d = i5 + 1;
                                        try{
                                           i6 = i6 + oobject.length();
                                           i5 = d;
                                        }catch(java.io.IOException e0){
                                           i2 = l1;
                                           i5 = d;
                                        }
                                     }
                                  }else {
                                     uFileArray1 = uFileArray;
                                     i7 = i2;
                                  }
                                  i = i + 1;
                                  i2 = i7;
                                  uFileArray = uFileArray1;
                               }catch(java.io.IOException e0){
                                  i2 = i1;
                               }
                            }
                            i2 = i1;
                         }catch(java.io.IOException e0){
                            i2 = i1;
                            i4 = i2;
                         }
                         i5 = i4;
                         i6 = i5;
                      }else {
                         i2 = i1;
                         i4 = i2;
                         i5 = i4;
                         i6 = i5;
                      }
                      l1 = l;
                   }catch(java.io.IOException e0){
                      i2 = i1;
                      i3 = i2;
                      i4 = i3;
                      goto label_00e7 ;
                   }
                }else {
                   i2 = i1;
                   i3 = i2;
                   i4 = i3;
                   i5 = i4;
                   i6 = i5;
                }
                int i8 = -1504323719;
                uFileArray = b.a(i8).k().listFiles(new r(v5.b()));
                if (uFileArray != null) {
                   int len = uFileArray.length;
                   for (int i9 = 0; i9 < len; i9 = i9 + 1) {
                      l1 = l1 + uFileArray[i9].length();
                      i3 = i3 + 1;
                   }
                }
                uFileArray = b.a(i8).d(".long_video").listFiles(p.b);
                if (uFileArray != null) {
                   i8 = uFileArray.length;
                   l2 = l1;
                   for (i1 = 0; i1 < i8; i1 = i1 + 1) {
                      l2 = l2 + b.n0(uFileArray[i1]);
                      i3 = i3 + 1;
                   }
                   l1 = l2;
                }
                h oh = new h(i1, i3, i2, i4, i5, i6);
                return e0;
             }catch(java.io.IOException e0){
                i2 = i1;
                i3 = i2;
                i4 = i3;
                i5 = i4;
                i6 = i5;
             }catch(java.io.IOException e0){
             }catch(java.io.IOException e0){
                i1 = l2;
             }
             f.D().z("DraftFileManager", "draft error", e0);
             goto label_0160 ;
          }
       }
    }
    public Bitmap A(String p0,c p1,boolean p2){
       File obj;
       a uoa;
       Object[] objArray;
       if (PatchProxy.isSupport(DraftFileManager.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, DraftFileManager.class, "64");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.B(p0, p1);
       if (obj != null) {
          return h.a(obj);
       }else {
          DraftFileManager$d uod = this.x(p1);
          int i = 0;
          if (uod != null) {
             uoa = uod.c.get(p0);
             if (uoa != null && uoa.c != null) {
                objArray = new Object[i];
                f.D().w("DraftFileManager", "Found saving bitmap "+uoa.c, objArray);
                if (p2) {
                   return Bitmap.createBitmap(uoa.c);
                }else {
                   return uoa.c;
                }
             }
          }
          uoa = p1.m(p0);
          if (uoa != null && uoa.c != null) {
             objArray = new Object[i];
             f.D().w("DraftFileManager", "Found registered bitmap "+uoa.c, objArray);
             if (p2) {
                return Bitmap.createBitmap(uoa.c);
             }else {
                return uoa.c;
             }
          }else {
             File uFile = this.B(p0, p1);
             if (uFile != null) {
                return h.a(uFile);
             }else {
                return null;
             }
          }
       }
    }
    public File B(String p0,c p1){
       Object[] objArray;
       Object[] objArray1;
       a uoa;
       File uFile1;
       c c;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, DraftFileManager.class, "61");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.x(p0) || (!URLUtil.isNetworkUrl(p0) && p1 != null)) {
          if (URLUtil.isFileUrl(p0)) {
             Uri uri = w0.f(p0);
             if (!TextUtils.x(uri.getPath())) {
                obj = new Object[0];
                f.D().y("DraftFileManager", "getEffectiveFile: return isFileUrl:"+uri, obj);
                return new File(uri.getPath());
             }else {
                objArray = new Object[0];
                f.D().w("DraftFileManager", "getEffectiveFile: return isFileUrl null", objArray);
                return null;
             }
          }else {
             File uFile = p1.s(p0);
             if (uFile.exists()) {
                objArray1 = new Object[0];
                f.D().w("DraftFileManager", "getEffectiveFile: draft result:"+uFile, objArray1);
                return uFile;
             }else {
                DraftFileManager$d uod = this.x(p1);
                if (uod != null) {
                   uoa = uod.c.get(p0);
                   if (uoa != null) {
                      uFile1 = DraftFileManager.L(uoa);
                      obj = new Object[0];
                      f.D().w("DraftFileManager", "getEffectiveFile: getEditingContext result:"+uFile1, obj);
                      return uFile1;
                   }
                }
                uoa = p1.m(p0);
                if (uoa != null) {
                   uFile1 = DraftFileManager.L(uoa);
                   obj = new Object[0];
                   f.D().w("DraftFileManager", "getEffectiveFile: getAddingExternalFile result:"+uFile1, obj);
                   return uFile1;
                }else if(uFile.exists()){
                   objArray1 = new Object[0];
                   f.D().w("DraftFileManager", "getEffectiveFile: 再检查一次 result:"+uFile, objArray1);
                   return uFile;
                }else if(p1.c instanceof c){
                   uFile = new File(this.H(p1.c), p0);
                   if (uFile.exists()) {
                      objArray1 = new Object[0];
                      f.D().w("DraftFileManager", "getEffectiveFile: 源目录 result:"+uFile, objArray1);
                      return uFile;
                   }else {
                      c = p1.c;
                      Objects.requireNonNull(c);
                      File uFile2 = PatchProxy.applyOneRefs(p0, c, c.class, "12");
                      if (uFile2 != patchProxyRe) {
                      }else {
                         c o = c.o;
                         if (o != null) {
                            String str = o.get(p0);
                            objArray2 = new Object[0];
                            String str1 = "WorkspaceDraft";
                            f.D().w(str1, "getExternalFile\(\) called internalPath="+p0+" filePath="+str, objArray2);
                            if (str != null) {
                               uFile2 = new File(str);
                               if (!uFile2.isFile()) {
                                  obj = new Object[0];
                                  f.D().A(str1, "getExternalFile\(\) not exist internalPath="+p0, obj);
                               }
                            }
                         }
                         uFile2 = null;
                      }
                      if (uFile2 != null && uFile2.exists()) {
                         return uFile2;
                      }else {
                         uFile1 = new File(p1.c.f0().getPath(), p1.q().getAbsolutePath());
                         if (uFile1.isDirectory()) {
                            File[] uFileArray = uFile1.listFiles();
                            if (uFileArray != null && uFileArray.length > 0) {
                               int len = uFileArray.length;
                               for (int i = 0; i < len; i = i + 1) {
                                  objArray2 = new Object[0];
                                  f.D().w("DraftFileManager", "getEffectiveFile folder file: "+uFileArray[i].getAbsolutePath(), objArray2);
                               }
                            }else {
                               objArray = new Object[0];
                               f.D().w("DraftFileManager", "getEffectiveFile folder file dir is empty", objArray);
                            }
                         }
                      }
                   }
                }
                objArray = new Object[0];
                f.D().w("DraftFileManager", "getEffectiveFile: finally null", objArray);
             }
          }
       }
       return null;
    }
    public String C(String p0,c p1){
       a uoa;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uDraftFileMa, "65");
       if (obj != patchProxyRe) {
          return obj;
       }
       byte[] uobyteArray = PatchProxy.applyTwoRefs(p0, p1, this, uDraftFileMa, "66");
       if (uobyteArray != patchProxyRe) {
       }else {
          File uFile = this.B(p0, p1);
          if (uFile != null) {
             try{
                uobyteArray = b.e0(uFile);
             }catch(java.io.IOException e7){
                f.D().z("DraftFileManager", "draft error", e7);
             }
          }else {
             DraftFileManager$d uod = this.x(p1);
             int i = 0;
             if (uod != null) {
                uoa = uod.c.get(p0);
                if (uoa != null && uoa.d != null) {
                   objArray = new Object[i];
                   f.D().w("DraftFileManager", "Found saving bytes", objArray);
                   uobyteArray = uoa.d;
                }
             }
             uoa = p1.m(p0);
             if (uoa != null && uoa.d != null) {
                objArray = new Object[i];
                f.D().w("DraftFileManager", "Found registered bytes", objArray);
                uobyteArray = uoa.d;
             }else {
                try{
                   File uFile1 = this.B(p0, p1);
                   if (uFile1 != null) {
                      uobyteArray = b.e0(uFile1);
                   }
                }catch(java.io.IOException e7){
                   f.D().z("DraftFileManager", "draft error", e7);
                }
                uobyteArray = null;
             }
          }
       }
       if (uobyteArray != null) {
          try{
             return new String(uobyteArray, a.a("UTF-8"));
          }catch(java.io.IOException e7){
             f.D().z(obj, v4, e7);
          }
          return v3;
       }else {
          goto label_009a ;
       }
    }
    public final Phase D(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (p0.exists())? b.f0(p0): "";
       return Phase.getDraftOpenFlagByName(str);
    }
    public File G(a p0){
       Object[] objArray;
       File obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       int i = 0;
       if (p0 == null) {
          objArray = new Object[i];
          f.D().w("DraftFileManager", "coverDraft is null", objArray);
          return obj;
       }else {
          Cover uCover = p0.v();
          if (uCover == null) {
             objArray = new Object[i];
             f.D().w("DraftFileManager", "getOriginCoverFile null", objArray);
             return obj;
          }else if(!uCover.getImportCoverParamV2().getUsed()){
             objArray = new Object[i];
             f.D().w("DraftFileManager", "importCover has not used, return null", objArray);
             return obj;
          }else {
             File uFile = this.B(uCover.getImportCoverParamV2().getDraftFile(), p0);
             objArray = new Object[i];
             f.D().w("DraftFileManager", "getEffectiveFile originCoverFile:"+uFile, objArray);
             return uFile;
          }
       }
    }
    public File H(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftFileManager.P(new File(p0.f0().getParent()), p0.v());
    }
    public File I(Workspace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftFileManager.P(this.b, p0);
    }
    public File J(Workspace p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DraftUtils.k0(p0.getOutputContentModifiedAt());
       String str = ".jpg";
       String str1 = ".mp4";
       switch (DraftFileManager$c.a[p0.getType().ordinal()]){
           case 1:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 2:
             str = str1;
             break;
           case 8:
             if (p0.getAssetsCount() > 1) {
                goto label_0036 ;
             }
             break;
           case 9:
           default:
             return this.I(p0);
       }
       return new File(this.I(p0), obj+str);
    }
    public final List K(File p0){
       File obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return Collections.emptyList();
       }
       obj = new File(p0, ".pair");
       if (!obj.isFile()) {
          return Collections.emptyList();
       }
       try{
          FileInputStream uFileInputSt = b.b0(obj);
          p.c(uFileInputSt);
          return c.n(uFileInputSt, a.b(Charset.defaultCharset()));
       }catch(java.io.IOException e0){
          return Collections.emptyList();
       }
    }
    public File M(){
       return this.b;
    }
    public final String N(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((p0.getPath()).endsWith("-editing")) {
          return "-editing";
       }
       return "";
    }
    public File O(){
       return this.a;
    }
    public List Q(){
       ArrayList obj = PatchProxy.apply(null, this, DraftFileManager.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       DraftFileManager ta = this.a;
       if (ta != null) {
          obj.add(ta);
       }
       return obj;
    }
    public a0 R(){
       Object obj = PatchProxy.apply(null, this, DraftFileManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromIterable(this.Q()).flatMap(new h(this)).reduce(z.a).D();
    }
    public t S(){
       Object obj = PatchProxy.apply(null, this, DraftFileManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "isDraftCopyComplete\(\) result: "+this.d.i(), objArray);
       return this.d.takeUntil(k.b);
    }
    public final boolean T(c p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a uoa = p0.F0();
       boolean b = false;
       if (uoa == null) {
          return b;
       }
       Kuaishan kuaishan = uoa.v();
       if (kuaishan == null) {
          return b;
       }
       if (!TextUtils.x(kuaishan.getExtraInfo())) {
          return b;
       }
       obj = new Object[b];
       f.D().w("DraftFileManager", "isKuaiShanAndNoTemplateId: find a old kuaishan draft "+kuaishan.getTemplateDirectory(), obj);
       return true;
    }
    public t U(){
       Object obj = PatchProxy.apply(null, this, DraftFileManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V(Long.MAX_VALUE);
    }
    public t V(long p0){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uDraftFileMa, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.fromIterable(this.Q()).flatMap(new i(this, p0));
    }
    public t X(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y(p0, 0);
    }
    public t Y(File p0,int p1){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDraftFileMa, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.fromCallable(new f0(this, p0, p1)).subscribeOn(this.c);
    }
    public final c Z(File p0){
       boolean b;
       c uoc;
       List obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K(p0);
       if (obj.isEmpty()) {
          return this.a0(p0);
       }
       File parentFile = p0.getParentFile();
       String str = this.N(p0);
       Iterator iterator = obj.iterator();
       while (true) {
          if (iterator.hasNext()) {
             String str1 = iterator.next();
             if (!TextUtils.x(str1)) {
                if (new File(parentFile, str1+str).exists()) {
                   b = TextUtils.n(str1+str, p0.getName());
                }else {
                   if (!str.isEmpty() && new File(parentFile, str1).exists()) {
                      b = TextUtils.n(str1, p0.getName());
                   }
                }
             }
          }else {
             b = false;
          }
          if (!b) {
             break ;
          }else if(!s6.c()){
             return this.a0(p0);
          }else {
             ArrayList uArrayList = new ArrayList();
             iterator = obj.iterator();
             while (iterator.hasNext()) {
                String str2 = iterator.next();
                if (!TextUtils.x(str2)) {
                   if (new File(parentFile, str2+str).exists()) {
                      uoc = this.a0(new File(parentFile, str2+str));
                      if (uoc != null) {
                         uArrayList.add(uoc);
                      }else {
                         continue ;
                      }
                   }else if(!str.isEmpty() && new File(parentFile, str2).exists()){
                      uoc = this.a0(new File(parentFile, str2));
                      if (uoc != null) {
                         uArrayList.add(uoc);
                         continue ;
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }else {
                   continue ;
                }
             }
             if (uArrayList.isEmpty()) {
                return null;
             }else {
                c uoc1 = uArrayList.get(0);
                DraftFileManager.e(uoc1, uArrayList, obj);
                return uoc1;
             }
          }
       }
       return null;
    }
    public final String a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = l0.b();
       StringBuilder str = "";
       if (p0.isDirectory() && p0.canRead()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (oobject.isDirectory()) {
                   str = str+oobject.getName()+", ";
                }else {
                   Object[] objArray = new Object[]{Long.valueOf(oobject.length())};
                   str = str+oobject.getName()+String.format("\(%d bytes\), ", objArray);
                }
                i = i + 1;
             }
          }
       }
       return "load workspace failed, space left: "+l+"MB\ndirectory files: "+str;
    }
    public final c a0(File p0){
       int i;
       c uoc;
       DraftFileNotFoundException uDraftFileNo;
       Workspace workspace;
       File obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0, "workspace.pb");
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "loadSync\(\) directory="+p0, objArray);
       try{
          i = 0;
          try{
             FileInputStream uFileInputSt = new FileInputStream(obj);
             workspace = Workspace.parseFrom(uFileInputSt);
             if (TextUtils.x(workspace.getIdentifier())) {
                throw new DraftEditException("Missing identifier on a workspace."+p0);
             }
             workspace = b.a(workspace, p0).a.build();
             VideoContext videoContext = VideoContextDraftHelper.a(p0, workspace);
             Phase phase = this.D(new File(p0, "flag.txt"));
             try{
                uoc = new c(p0, workspace, videoContext, phase);
                if (this.T(uoc)) {
                   PostUtils.D("DraftFileManager", "loadSync\(\) kuaishan old draft "+p0, new DraftFileManager$DraftFileException("isKuaiShanAndNoTemplateId"));
                   this.g0(p0);
                }
                uoc.h1();
                uoc.i0();
                p.c(uFileInputSt);
             label_0129 :
                if (uoc && (p0.getName()).endsWith("-editing")) {
                   Object[] objArray1 = new Object[0];
                   f.D().w("DraftFileManager", "loadSync\(\) has editing dir directory="+p0, objArray1);
                   String str = uoc.D0();
                   DraftFileManager$d uod = this.e.get(str);
                   if (uod != null) {
                      uoc = uod.a;
                   }else {
                      uoc.c0();
                      this.e.put(str, new DraftFileManager$d(uoc, k1.i()));
                   }
                }
                return uoc;
             }catch(com.yxcorp.gifshow.edit.draft.model.DraftEditException e0){
             }catch(java.io.IOException e0){
             }
             InputStream inputStream = uFileInputSt;
          }catch(com.yxcorp.gifshow.edit.draft.model.DraftEditException e0){
             uoc = i;
          }catch(java.io.IOException e0){
             uoc = i;
             goto label_00b7 ;
          }
       }catch(com.yxcorp.gifshow.edit.draft.model.DraftEditException e0){
          uoc = i;
       }catch(java.io.IOException e0){
          uoc = i;
       }
       String message = e0.getMessage();
       if (message != null && message.contains("No such file or directory")) {
          uDraftFileNo = new DraftFileNotFoundException(message, e0);
       }else if(message != null && message.contains("No space left on device")){
          uDraftFileNo = new DraftNoSpaceLeftException(message, e0);
       }else {
          uDraftFileNo = new DraftLoadException(message, e0);
       }
       Object[] objArray2 = new Object[0];
       f.D().t("DraftFileManager", "loadSync\(\) fail lastModify="+p0.lastModified()+" "+p0, objArray2);
       PostUtils.D("DraftFileManager", this.a(p0), uDraftFileNo);
       this.g0(p0);
    label_0126 :
       p.c(i);
       goto label_0129 ;
    }
    public t b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!s6.c()) {
          return this.c(p0);
       }
       return l0.a.a(p0, new i0(this)).d0();
    }
    public t b0(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new e0(this, p0)).subscribeOn(this.c);
    }
    public final t c(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "completeEdit", objArray);
       if (!b.S(this.H(p0))) {
          long l = d.b() + 1;
          Object[] objArray1 = new Object[0];
          f.D().w("DraftFileManager", "completeEdit new count: "+l, objArray1);
          d.c(l);
       }
       return this.i0(p0, true, 0);
    }
    public final boolean e0(String p0,String p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uDraftFileMa, "87");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.apply(null, this, uDraftFileMa, "88");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(g.i1() || f.a("draft_copy_optimize")){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          boolean b2 = p0.contains("asset");
          if (b2 && (b2.c().matcher(p1).matches() && (!p1.contains(a.B.getPackageName()) && !p1.contains("workspace")))) {
             b = true;
          }
       }
    label_0064 :
       return b;
    }
    public c f(Workspace$Type p0,Workspace$Source p1,String p2,VideoContext p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, DraftFileManager.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i(DraftFileManager.l(), p0, p1, p2, p3);
    }
    public c g(Workspace$Type p0,Workspace$Source p1,String p2,VideoContext p3,Workspace$From p4){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uDraftFileMa, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.j(DraftFileManager.l(), p0, p1, p2, p3, p4, EditConfig.newBuilder().build());
    }
    public final void g0(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DraftFileManager.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "quickDelete\(\) called with: directory = ["+p0+"]", objArray);
       File uFile = new File(p0.getParent(), p0.getName()+".trash");
       if (p0.renameTo(uFile)) {
          c.a(new y(uFile));
       }else {
          b.q(p0);
       }
       return;
    }
    public c h(Workspace$Type p0,Workspace$Source p1,String p2,VideoContext p3,Workspace$From p4,EditConfig p5){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, this, uDraftFileMa, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.j(DraftFileManager.l(), p0, p1, p2, p3, p4, p5);
    }
    public t h0(){
       Object obj = PatchProxy.apply(null, this, DraftFileManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new t(this)).subscribeOn(this.c);
    }
    public c i(String p0,Workspace$Type p1,Workspace$Source p2,String p3,VideoContext p4){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uDraftFileMa, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.j(p0, p1, p2, p3, p4, Workspace$From.FROM_UNKNOW, EditConfig.newBuilder().build());
    }
    public final t i0(c p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(DraftFileManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DraftFileManager.class, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1 && !p2) {
          return t.error(new DraftEditException("Bad parameter."));
       }else {
          return this.s(p0, p1, p2);
       }
    }
    public c j(String p0,Workspace$Type p1,Workspace$Source p2,String p3,VideoContext p4,Workspace$From p5,EditConfig p6){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, this, uDraftFileMa, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.k(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public t j0(c p0,boolean p1){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDraftFileMa, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "saveEdit", objArray);
       return this.i0(p0, p1, true);
    }
    public c k(String p0,Workspace$Type p1,Workspace$Source p2,String p3,VideoContext p4,Workspace$From p5,EditConfig p6,boolean p7){
       Workspace$b obj;
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,Boolean.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, uDraftFileMa, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Workspace.newBuilder();
       obj.copyOnWrite();
       obj.instance.setIdentifier(p0);
       obj.h(DraftUtils.i());
       OriginalVoice$b uob = OriginalVoice.newBuilder();
       uob.d(0x3f800000);
       obj.copyOnWrite();
       obj.instance.setOriginalVoice(uob);
       obj.t(p1);
       obj.copyOnWrite();
       obj.instance.setSource(p2);
       obj.r(p3);
       obj.copyOnWrite();
       obj.instance.setEditConfig(p6);
       obj.f("Android");
       obj.v("2.9.602");
       obj.copyOnWrite();
       obj.instance.setFrom(p5);
       Workspace workspace = obj.build();
       if (p7) {
          return new c(new File(this.a, ".ignore-"+p0), workspace, p4, Phase.NONE);
       }else {
          return new c(new File(this.a, p0), workspace, p4, Phase.NONE);
       }
    }
    public t k0(c p0,boolean p1){
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDraftFileMa, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "saveEdit", objArray);
       return this.t(p0, p1, true);
    }
    public t l0(c p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(DraftFileManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DraftFileManager.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "saveEdit", objArray);
       return this.t(p0, p1, p2);
    }
    public final t m(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "deleteDirectories", objArray);
       return t.create(new x(p0)).subscribeOn(this.c);
    }
    public t m0(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!s6.c()) {
          return this.n0(p0);
       }
       return l0.a.a(p0, new g0(this)).d0();
    }
    public t n(File p0){
       t obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o(p0);
       File parentFile = p0.getParentFile();
       Iterator iterator = this.K(p0).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!b.v(str, p0.getName())) {
             File uFile = new File(parentFile, str);
             if (uFile.exists()) {
                obj = obj.flatMap(new j(this, uFile));
             }
          }
       }
       return obj;
    }
    public final t n0(c p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.D0();
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "DraftFileManager";
       f.D().w(str, "startEdit "+obj, objArray);
       if (p0.D()) {
          i1.a(str, "Workspace "+obj+" is already editing.");
       }
       DraftFileManager$d uod = this.e.putIfAbsent(obj, new DraftFileManager$d(p0, 0));
       if (uod != null) {
          Object[] objArray1 = new Object[i];
          f.D().w(str, "startEdit not absent in editing contexts.", objArray1);
          return t.just(uod.a);
       }else if(p0.D()){
          return t.just(p0);
       }else {
          File uFile = new File(p0.f0().getParent(), p0.f0().getName()+"-editing");
          File uFile1 = p0.f0();
          p0.g0(uFile);
          p0.c0();
          Object[] objArray2 = new Object[i];
          f.D().w(str, "startEdit onNext", objArray2);
          return t.just(p0).observeOn(this.c).doOnNext(new j(uFile1, obj, p0)).doOnComplete(new j0(uFile1, p0.u().n(), uFile));
       }
    }
    public final t o(File p0){
       DraftFileGuard obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "DraftFileManager";
       f.D().w(str, "deleteOriginDirectory: "+p0, objArray);
       if ((p0.getName()).endsWith("-editing")) {
          return t.error(new DraftEditException("Removing editing directory "+p0.getName()+" not allowed."));
       }
       if (b.S(p0)) {
          long l = d.b() - 1;
          Object[] objArray1 = new Object[i];
          f.D().w(str, "deleteOriginDirectory new count: "+l, objArray1);
          d.c(l);
          obj = DraftFileGuard.b;
          String name = p0.getName();
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(name, obj, DraftFileGuard.class, "19")) {
             a.p(name, "id");
             Object[] objArray2 = new Object[i];
             f.D().w("DraftFileGuard", "clearDraftInfo\(\) "+name, objArray2);
             obj.c(name);
             g.a(n.b().edit().remove(obj.h(name)));
          }
       }
       k1.o(new v(this, p0));
       return this.m(Collections.singletonList(p0));
    }
    public t p(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!s6.c()) {
          return this.q(p0);
       }
       return l0.a.a(p0, new h0(this)).d0();
    }
    public final t q(c p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.D0();
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("DraftFileManager", "discardEdit "+obj, objArray);
       DraftFileGuard.b.c(obj);
       if (!p0.D() || this.e.remove(p0.D0()) == null) {
          i1.a("DraftFileManager", "Workspace "+obj+" is not editing.");
          if (p0.D()) {
             p0.j();
          }
          return t.just(p0);
       }else {
          p0.j();
          p0.g0(this.H(p0));
          Object[] objArray1 = new Object[i];
          f.D().w("DraftFileManager", "discardEdit start mv/rm directory", objArray1);
          return this.m(Collections.singletonList(p0.f0())).map(new l(p0));
       }
    }
    public final t r(c p0,boolean p1,boolean p2,boolean p3){
       DraftFileManager obj;
       DraftFileManager uDraftFileMa = this;
       c uoc = p0;
       boolean b = p3;
       if (PatchProxy.isSupport(DraftFileManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, DraftFileManager.class, "55");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = p0.D0();
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("DraftFileManager", "doSave\(\) "+str+" saveToOrigin="+p1+" doOnComplete="+b, objArray);
       if (!p0.D()) {
          return t.error(new DraftEditException("Workspace "+str+" is not editing."));
       }else {
          obj = uDraftFileMa.g;
          _monitor_enter(obj);
          DraftFileManager$d uod = (p2)? uDraftFileMa.e.get(str): uDraftFileMa.e.remove(str);
          Object obj1 = uod;
          if (obj1 == null) {
             _monitor_exit(obj);
             return t.error(new DraftEditException("Workspace "+str+" is not editing."));
          }else if(!p2){
             uDraftFileMa.f.put(str, obj1);
          }
          _monitor_exit(obj);
          VideoContextDraftHelper.b(uoc, i);
          uDraftFileMa.j.removeMessages(2018, p0.u());
          List list = p0.u().n();
          File uFile = this.H(p0);
          File uFile1 = p0.f0();
          boolean b1 = true;
          boolean b2 = (p2 || p0.M0() == Phase.POST)? true: false;
          if (p2) {
             uoc.h(b1, i);
             DraftFileManager$d c = obj1.c;
             uod = obj1.d;
             if (!PatchProxy.applyVoidTwoRefs(c, uod, uoc, c.class, "21")) {
                uoc.e0(uoc.d, c, uod);
             }
          }else {
             uoc.h(i, i);
             uoc.d0(obj1.c, obj1.d);
             uoc.g0(uFile);
          }
          Object[] i1 = new Object[i];
          f.D().w("DraftFileManager", "doSave\(\) "+str+"\n mAddingFiles"+obj1.c+",mRemovingFiles:"+obj1.d, i1);
          y oy = new y(this, str, p0.v(), obj1, uFile1, p1, uFile, p0, list, b2);
          if (b) {
             return t.just(p0).observeOn(uDraftFileMa.c).doOnComplete(v14);
          }else {
             return t.just(p0).observeOn(uDraftFileMa.c).doOnNext(new k0(v14));
          }
       }
    }
    public final t s(c p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(DraftFileManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DraftFileManager.class, "53");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.r(p0, p1, p2, true);
    }
    public final t t(c p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(DraftFileManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DraftFileManager.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.r(p0, p1, p2, false);
    }
    public File u(c p0){
       Workspace workspace;
       File obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v(p0.s0());
       if (obj != null) {
          return obj;
       }
       obj = null;
       try{
          workspace = p0.v();
       }catch(java.lang.ArrayIndexOutOfBoundsException e2){
          PostUtils.D("DraftFileManager", "getFirstMessage error", e2);
          f.D().z("DraftFileManager", "draft error", e2);
          workspace = obj;
       }
       int i = 0;
       if (workspace == null) {
          Object[] objArray = new Object[i];
          f.D().w("DraftFileManager", "getCoverFile null", objArray);
          return obj;
       }else {
          obj = DraftUtils.q(p0, p0.f0(), workspace);
          File uFile = this.H(p0);
          if (obj == null || (!obj.exists() && !p0.f0().equals(uFile))) {
             obj = DraftUtils.q(p0, uFile, workspace);
          }
          Object[] objArray1 = new Object[i];
          f.D().w("DraftFileManager", "getCoverFile file:"+obj, objArray1);
          return obj;
       }
    }
    public File v(a p0){
       Cover obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.v();
          if (obj != null) {
             File uFile = this.B(obj.getOutputFile(), p0);
             Object[] objArray = new Object[0];
             f.D().w("DraftFileManager", "getCoverFile coverFile:"+uFile, objArray);
             if (uFile != null) {
                return uFile;
             }
          }
       }
       return null;
    }
    public final DraftFileManager$d x(c p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.c.D0();
       DraftFileManager$d uod = null;
       if (TextUtils.x(obj)) {
          return uod;
       }
       DraftFileManager tg = this.g;
       _monitor_enter(tg);
       DraftFileManager$d uod1 = this.e.get(obj);
       if (uod1 == null) {
          uod1 = this.f.get(obj);
       }
       _monitor_exit(tg);
       if (uod1 == null || uod1.a == p0.c) {
          uod = uod1;
       }
       return uod;
    }
    public c y(String p0){
       c uoc;
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DraftFileManager$d uod = this.e.get(p0);
       uod = (uod != null)? uod.a: null;
       return uod;
    }
    public Bitmap z(String p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DraftFileManager.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A(p0, p1, false);
    }
}
