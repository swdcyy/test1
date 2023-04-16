package com.kwai.plugin.dva.install.remote.InnerInstallWork;
import com.kwai.plugin.dva.work.FutureTaskWork;
import com.kwai.plugin.dva.install.remote.InnerInstallWork$a;
import nsd.u;
import android.content.Context;
import java.lang.String;
import com.kwai.plugin.dva.install.remote.download.c;
import mj7.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.install.remote.InnerInstallWork$doWork$1;
import csd.b;
import mj7.b;
import java.io.File;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.Thread;
import qj7.d;
import java.lang.System;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.plugin.dva.work.ListenableWork;
import nj7.c;
import java.lang.Boolean;
import com.kwai.plugin.dva.util.c;
import com.kwai.plugin.dva.util.c$b;
import java.lang.StringBuilder;
import zsd.u;
import kotlinx.coroutines.c;
import java.lang.Exception;
import java.lang.Integer;
import com.kwai.plugin.dva.util.a;
import com.kwai.plugin.dva.install.error.PluginDownloadException;
import nsd.r0;
import java.util.Arrays;
import java.io.IOException;
import java.lang.Throwable;
import kotlinx.coroutines.CoroutineDispatcher;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.install.remote.InnerInstallWork$doWork$2;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import android.content.res.AssetManager;
import java.io.InputStream;
import java.io.FileOutputStream;
import lj7.j;
import java.util.zip.ZipFile;
import com.kwai.plugin.dva.util.CpuAbiUtils;
import java.util.Map;
import java.util.HashMap;
import okio.n;
import okio.l;
import okio.d;
import cud.k;
import java.lang.CharSequence;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import java.lang.NullPointerException;
import java.io.Closeable;
import com.kwai.plugin.dva.install.remote.a;
import java.io.FilenameFilter;

public final class InnerInstallWork extends FutureTaskWork	// class@000ea1
{
    public final Context i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final c n;
    public final a o;
    public static final InnerInstallWork$a p;
    public static long q;

    static {
       InnerInstallWork.p = new InnerInstallWork$a(null);
    }
    public void InnerInstallWork(Context p0,String p1,int p2,String p3,String p4,c p5,a p6){
       a.p(p0, "mContext");
       a.p(p1, "mName");
       a.p(p3, "mUrl");
       a.p(p5, "mDownloader");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       this.o = p6;
    }
    public Object a(c p0){
       int i;
       InnerInstallWork$doWork$1 l$4;
       InnerInstallWork$doWork$1 l$3;
       String str4;
       InnerInstallWork$doWork$1 uodoWork$1;
       InnerInstallWork$doWork$1 uodoWork$11;
       InnerInstallWork$doWork$1 uodoWork$12;
       InnerInstallWork m;
       long l;
       boolean b;
       File absoluteFile;
       File obj4;
       InnerInstallWork obj5;
       boolean b2;
       String str7;
       File uFile2;
       File uFile3;
       InnerInstallWork j;
       Object obj = this;
       InnerInstallWork$doWork$1 obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       InnerInstallWork innerInstall = InnerInstallWork.class;
       InnerInstallWork$doWork$1 obj2 = PatchProxy.applyOneRefs(obj1, obj, innerInstall, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (obj1 instanceof InnerInstallWork$doWork$1) {
          i = obj1;
          InnerInstallWork$doWork$1 label = i.label;
          int i1 = Integer.MIN_VALUE;
          if (label & i1) {
             i.label = label - i1;
             try{
             label_0029 :
                obj1 = i.result;
                c obj3 = b.h();
                InnerInstallWork$doWork$1 label1 = i.label;
                String str = "apkPath.absolutePath";
                String str1 = "java.lang.String.format\(format, *args\)";
                String str2 = 2;
                InnerInstallWork innerInstall1 = null;
                StringBuilder str3 = 1;
                if (label1 != null) {
                   if (label1 != str3) {
                      if (label1 == str2) {
                         l$4 = i.L$4;
                         l$3 = i.L$3;
                         label = i.L$2;
                         obj2 = i.L$0;
                         j0.n(obj1);
                         obj1 = i.L$1;
                         str4 = null;
                      label_0369 :
                         uodoWork$1 = obj1;
                         uodoWork$11 = l$3;
                         uodoWork$12 = label;
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      l$4 = i.L$4;
                      l$3 = i.L$3;
                      label = i.L$2;
                      label1 = i.L$1;
                      obj2 = i.L$0;
                      try{
                         j0.n(obj1);
                      label_0235 :
                         obj1 = label1;
                      label_023d :
                         str2 = obj1.getAbsolutePath();
                         a.o(str2, str);
                         obj2.j(obj2.j, obj2.k, obj2.l, str2, obj2.m);
                         obj2.f(90);
                         uodoWork$1 = obj1;
                         uodoWork$11 = l$3;
                         uodoWork$12 = label;
                         str4 = null;
                      }catch(java.lang.Exception e0){
                         e0.printStackTrace();
                         throw e0;
                      }
                   }
                }else {
                   j0.n(obj1);
                   d.c(a.C("InnerInstallWork start ", Thread.currentThread().getName()));
                   long l1 = System.currentTimeMillis();
                   List list = Dva.instance().getPluginInstallManager().b();
                   a.o(list, "instance\(\).pluginInstallManager.pluginConfigs");
                   Iterator iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         obj4 = iterator.next();
                         if (a.g(obj4.name, obj.j)) {
                         label_00cb :
                            boolean b1 = (obj4 != null && obj4.type != str3)? true: false;
                            obj.f(innerInstall1);
                            obj4 = c.b(obj.j, obj.k);
                            File uFile = c.a(obj.j, obj.k);
                            uodoWork$12 = c.e(obj.j, obj.k);
                            a.o(uFile, "apkPath");
                            if (PatchProxy.isSupport(innerInstall)) {
                               obj5 = PatchProxy.applyTwoRefs(uFile, Boolean.TRUE, obj, innerInstall, "4");
                               if (obj5 != patchProxyRe) {
                                  b2 = obj5.booleanValue();
                               }else if(uFile.exists() && uFile.isFile()){
                                  j = obj.m;
                                  if (j != null) {
                                     c$b uob1 = c.k(c.a, uFile, j, "md5", false, 8, null);
                                     d.c("for "+obj.j+" , verify result: "+uob1.a());
                                     b2 = uob1.b();
                                  }
                               }
                               b2 = false;
                            }else {
                               goto label_010d ;
                            }
                            long l2 = System.currentTimeMillis();
                            String str5 = "..installing ";
                            String str6 = str1;
                            File uFile1 = uFile;
                            d.c(str5+obj.j+" checkIsDownload cost "+(l2 - l1));
                            uodoWork$11 = c.c(obj.j, obj.k);
                            b uob = new b();
                            uob.a = obj.j;
                            if (b2 || (obj.m == null && uodoWork$11.exists())) {
                               if (b1) {
                                  a.o(uodoWork$12, "soDir");
                                  if (!obj.m(uodoWork$12)) {
                                  label_01ec :
                                     if (b2) {
                                        d.c(a.C("InnerInstallWork: plugin is downloaded ", obj.j));
                                        obj.f(90);
                                        obj2 = obj;
                                        str4 = null;
                                     label_0391 :
                                        l = System.currentTimeMillis();
                                        obj2.k(obj2.j, obj2.k);
                                        a.o(uodoWork$12, "soDir");
                                        if (obj2.m(uodoWork$12)) {
                                           uodoWork$11.createNewFile();
                                           obj2.f(100);
                                           c uoc = str4;
                                           if (obj2.o != null) {
                                              uodoWork$1.c = true;
                                              b = (uoc == null)? true: false;
                                              uodoWork$1.b = b;
                                              uodoWork$1.d = System.currentTimeMillis() - l;
                                              if (uoc != null) {
                                                 uodoWork$1.f = uoc.getMessage();
                                                 uodoWork$1.e = (uoc instanceof PluginInstallException)? uoc.getCode(): 0x4ee8;
                                              }
                                           label_03f4 :
                                              obj2.o.a(uodoWork$1);
                                           }
                                           if (uoc == null) {
                                              return obj2.j;
                                           }else {
                                              throw uoc;
                                           }
                                        }else {
                                           throw new PluginInstallException(0x4f4c, "so valid failed");
                                        }
                                     }else {
                                        try{
                                           obj4.mkdirs();
                                           if (u.q2(obj.l, "asset://", false, 2, null)) {
                                              l = InnerInstallWork.q;
                                              if (l - null > 0) {
                                                 i.L$0 = obj;
                                                 uFile2 = uFile1;
                                                 i.L$1 = uFile2;
                                                 i.L$2 = uodoWork$12;
                                                 i.L$3 = uodoWork$11;
                                                 i.L$4 = uob;
                                                 i.label = 1;
                                                 if (c.a(l, i) == obj3) {
                                                    return obj3;
                                                 }else {
                                                    obj4 = uFile2;
                                                    obj2 = obj;
                                                    uFile3 = uodoWork$12;
                                                    absoluteFile = uodoWork$11;
                                                    l$4 = uob;
                                                    goto label_0235 ;
                                                 }
                                              }else {
                                                 uFile2 = uFile1;
                                                 obj2 = obj;
                                                 uFile3 = uodoWork$12;
                                                 absoluteFile = uodoWork$11;
                                                 l$4 = uob;
                                                 goto label_023d ;
                                              }
                                           }else {
                                              uFile2 = uFile1;
                                              if (u.q2(obj.l, "file://", false, 2, null)) {
                                                 j = obj.j;
                                                 InnerInstallWork k = obj.k;
                                                 InnerInstallWork l3 = obj.l;
                                                 str4 = uFile2.getAbsolutePath();
                                                 a.o(str4, str);
                                                 InnerInstallWork m1 = obj.m;
                                                 if (PatchProxy.isSupport(innerInstall)) {
                                                    Object[] objArray1 = new Object[]{j,Integer.valueOf(k),l3,str4,m1};
                                                    if (PatchProxy.applyVoid(objArray1, obj, innerInstall, "7")) {
                                                    label_02fb :
                                                       obj.f(90);
                                                       obj2 = obj;
                                                       l$4 = uob;
                                                       str4 = null;
                                                       uFile = uFile2;
                                                    }
                                                 }
                                                 String str8 = u.g2(l3, "file://", "", false, 4, null);
                                                 try{
                                                    absoluteFile = new File(str8);
                                                    if (absoluteFile.exists()) {
                                                       a.f(absoluteFile, new File(str4));
                                                       str8 = a.h(new File(str4));
                                                       if (m1 == null || a.g(m1, str8)) {
                                                          goto label_02fb ;
                                                       }else {
                                                          Object[] objArray3 = new Object[]{l3,m1,str8};
                                                          str8 = String.format("copy %s from asset, except md5 %s, but %s", Arrays.copyOf(objArray3, 3));
                                                          a.o(str8, str6);
                                                          throw new PluginDownloadException(0x32c8, str8);
                                                       }
                                                    }else {
                                                       str = str6;
                                                       try{
                                                          throw new IOException("File "+l3+" not exist");
                                                       }catch(java.lang.Exception e0){
                                                       }
                                                       Object[] objArray2 = new Object[]{l3};
                                                       str7 = String.format("copy %s from file.", Arrays.copyOf(objArray2, 1));
                                                       a.o(str7, str);
                                                       throw new PluginDownloadException(0x2af8, str7, e0);
                                                    }
                                                 }catch(java.lang.Exception e0){
                                                    str = str6;
                                                    goto label_0328 ;
                                                 }
                                              }else {
                                                 str4 = null;
                                                 i.L$0 = obj;
                                                 i.L$1 = uFile2;
                                                 i.L$2 = uodoWork$12;
                                                 i.L$3 = uodoWork$11;
                                                 i.L$4 = uob;
                                                 i.label = 2;
                                                 if (a.i(WorkExecutors.d(), new InnerInstallWork$doWork$2(obj, uFile2, str4), i) == obj3) {
                                                    return obj3;
                                                 }else {
                                                    obj2 = obj;
                                                    uFile3 = uodoWork$12;
                                                    absoluteFile = uodoWork$11;
                                                    l$4 = uob;
                                                    goto label_0369 ;
                                                 }
                                              }
                                           }
                                        }catch(java.lang.Exception e0){
                                           Object[] objArray = new Object[]{null.getAbsolutePath()};
                                           str7 = String.format("mkdir %s fail", Arrays.copyOf(objArray, 1));
                                           a.o(str7, str6);
                                           throw new PluginInstallException(0xea60, str7, e0);
                                        }
                                     }
                                  }
                               }
                               d.c("mark file exist, reuse plugin");
                               d.c(str5+obj.j+" valid so cost "+(System.currentTimeMillis() - l2));
                               obj.f(100);
                               uob.d = System.currentTimeMillis() - l1;
                               uob.b = true;
                               uob.c = false;
                               m = obj.o;
                               if (m != null) {
                                  m.a(uob);
                                  break ;
                               }
                               break ;
                            }else {
                               goto label_01ec ;
                            }
                         }else {
                            obj5 = 2;
                         }
                      }else {
                         obj4 = null;
                         goto label_00cb ;
                      }
                   }
                   return obj.j;
                }
                m = obj2.m;
                if (m != null) {
                   absoluteFile = uodoWork$1.getAbsoluteFile();
                   obj3 = c.a;
                   a.o(absoluteFile, "apkFile");
                   obj3.a(absoluteFile);
                   c.k(obj3, absoluteFile, m, "md5", false, 8, null);
                }
                uodoWork$1 = l$4;
                goto label_0391 ;
             }catch(java.lang.Exception e0){
             }
          }
       }
       i = new InnerInstallWork$doWork$1(obj, obj1);
       goto label_0029 ;
    }
    public final void j(String p0,int p1,String p2,String p3,String p4){
       Object[] objArray1;
       Object obj = this;
       object oobject = p3;
       object oobject1 = p4;
       InnerInstallWork innerInstall = InnerInstallWork.class;
       if (PatchProxy.isSupport(innerInstall)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,oobject,oobject1};
          if (PatchProxy.applyVoid(objArray, obj, innerInstall, "6")) {
             return;
          }
       }
       String str = u.g2(p2, "asset://", "", false, 4, null);
       try{
          InnerInstallWork i = obj.i;
          if (!PatchProxy.applyVoidThreeRefs(i, str, p3, null, a.class, "41")) {
             InputStream inputStream = i.getAssets().open(str);
             FileOutputStream uFileOutputS = new FileOutputStream(oobject);
             byte[] uobyteArray = new byte[0x400000];
             int i1 = inputStream.read(uobyteArray);
             while (i1 != -1) {
                uFileOutputS.write(uobyteArray, 0, i1);
             }
             uFileOutputS.flush();
             uFileOutputS.close();
             inputStream.close();
          }
          String str2 = a.h(new File(oobject));
          if (oobject1 == null || a.g(oobject1, str2)) {
             return;
          }else {
             objArray1 = new Object[]{p2,oobject1,str2};
             str2 = String.format("copy %s from asset, except md5 %s, but %s", Arrays.copyOf(objArray1, 3));
             a.o(str2, "java.lang.String.format\(format, *args\)");
             throw new PluginDownloadException(0x32c8, str2);
          }
       }catch(java.lang.Exception e0){
          objArray1 = new Object[]{p2};
          String str1 = String.format("copy %s from asset.", Arrays.copyOf(objArray1, 1));
          a.o(str1, "java.lang.String.format\(format, *args\)");
          throw new PluginDownloadException(0x2af8, str1, e0);
       }
    }
    public final void k(String p0,int p1){
       int b;
       ZipFile zipFile;
       InnerInstallWork innerInstall = InnerInstallWork.class;
       if (PatchProxy.isSupport(innerInstall) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, innerInstall, "5")) {
          return;
       }
       d.a("extra plugin "+p0+' '+p1);
       File uFile = c.a(this.j, this.k);
       File uFile1 = c.d(p0, p1);
       if (!uFile1.exists()) {
          uFile1.mkdirs();
       }
       File uFile2 = c.e(p0, p1);
       if (!uFile2.exists()) {
          uFile2.mkdirs();
       }
       try{
          InnerInstallWork ti = this.i;
          String absolutePath = uFile.getAbsolutePath();
          uFile2 = uFile2.getAbsolutePath();
          if (!PatchProxy.applyVoidThreeRefs(ti, absolutePath, uFile2, null, j.class, "1")) {
             b = false;
             try{
                zipFile = new ZipFile(absolutePath);
                uFile = new File(uFile2);
                if (uFile.exists()) {
                   a.d(uFile);
                }
                if (uFile.mkdirs()) {
                   j.a(ti, zipFile, CpuAbiUtils.a(ti), uFile2);
                   a.a(zipFile);
                }else {
                   throw new IOException("make native dir faile "+uFile.getAbsolutePath());
                }
             }catch(java.lang.Exception e8){
             }
             throw e8;
          }
          return;
       }catch(java.lang.Exception e8){
          b = zipFile;
          goto label_00b4 ;
       }
    }
    public final Map l(File p0){
       String str2;
       HashMap obj = p0;
       String str = "";
       File obj1 = PatchProxy.applyOneRefs(obj, this, InnerInstallWork.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new File(obj, "MANIFEST.MF");
       if (!obj1.exists() || !obj1.isFile()) {
          throw new IOException("MANIFEST.MF not exist or correct");
       }
       obj = new HashMap();
       String obj2 = null;
       n on = l.j(obj1);
       d uod = l.d(on);
       while (true) {
          d uod1 = uod;
          String str1 = uod1.readUtf8Line();
          if (str1 != null) {
             a.m(str1);
             int b = false;
             if (u.q2(str1, "Name: ", b, 2, obj2)) {
                int i = str1.length() - 1;
                int i1 = 0;
                int i2 = 0;
                while (true) {
                   int i3 = 32;
                   if (i1 <= i) {
                      int i4 = (!i2)? i1: i;
                      str2 = (a.t(str1.charAt(i4), i3) <= 0)? 1: null;
                      if (!i2) {
                         if (!str2) {
                            i2 = 1;
                         }else {
                            i1 = i1 + 1;
                         }
                      }else if(!str2){
                      label_007e :
                         i = i + 1;
                         str1 = new Regex("\\r|\\n").replace(str1.subSequence(i1, i).toString(), str);
                         a.m(str1);
                         i = 6;
                         str2 = "null cannot be cast to non-null type java.lang.String";
                         if (str1 != null) {
                            str1 = str1.substring(i);
                            a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                            i = StringsKt__StringsKt.w3(str1, "/", 0, false, 6, null) + 1;
                            if (str1 != null) {
                               str1 = str1.substring(i);
                               a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                               String str3 = uod1.readUtf8Line();
                               if (str3 != null) {
                                  Object obj3 = null;
                                  if (u.H1(str1, ".so", b, 2, obj3)) {
                                     i = str3.length() - 1;
                                     i1 = 0;
                                     int i5 = 0;
                                     while (true) {
                                        if (i1 <= i) {
                                           b = (!i5)? i1: i;
                                           b = (a.t(str3.charAt(b), i3) <= 0)? true: false;
                                           if (!i5) {
                                              if (!b) {
                                                 i5 = 1;
                                              }else {
                                                 i1 = i1 + 1;
                                              }
                                           }else if(!b){
                                           label_00f7 :
                                              i = i + 1;
                                              obj2 = new Regex("\\r|\\n").replace(str3.subSequence(i1, i).toString(), str);
                                              int i6 = 13;
                                              if (obj2 != null) {
                                                 obj2 = obj2.substring(i6);
                                                 a.o(obj2, "\(this as java.lang.String\).substring\(startIndex\)");
                                                 d.c(a.C("manifest sha1 ", obj2));
                                                 obj.put(str1, obj2);
                                              }else {
                                              }
                                           }else {
                                              i = i - 1;
                                           }
                                           b = 0;
                                        }else {
                                           goto label_00f7 ;
                                        }
                                     }
                                     a.b(uod);
                                     a.b(on);
                                     return obj;
                                  }
                                  obj2 = obj3;
                               }else {
                                  obj2 = null;
                               }
                            }else {
                               throw new NullPointerException(str2);
                            }
                         }else {
                            throw new NullPointerException(str2);
                         }
                      }else {
                         i = i - 1;
                      }
                      i4 = 2;
                   }else {
                      goto label_007e ;
                   }
                }
             }
          }else {
             goto label_013a ;
          }
       }
       throw new NullPointerException(str2);
    }
    public final boolean m(File p0){
       object oobject;
       Object obj = PatchProxy.applyOneRefs(p0, this, InnerInstallWork.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String[] stringArray = p0.list(a.b);
       if (stringArray == null) {
          stringArray = new String[0];
       }
       try{
          Map map = this.l(p0);
          if (stringArray.length != map.size()) {
             d.c(a.C("[error] so size not correct in ", p0));
             return 0;
          }else {
             long l = System.currentTimeMillis();
             int len = stringArray.length;
             int i = 0;
             while (true) {
                String str = "for ";
                int i1 = 1;
                if (i < len) {
                   oobject = stringArray[i];
                   i = i + 1;
                   String str1 = map.get(oobject);
                   if (str1 == null) {
                      break ;
                   }else {
                      File uFile = new File(p0, oobject);
                      c$b uob = c.a.j(uFile, str1, "sha1", 0);
                      d.c(str+uFile.getName()+", success="+uob.b()+' '+uob.a());
                      if (!uob.b()) {
                         return 0;
                      }
                   }
                }else {
                   d.c(str+this.j+" , verify so spent "+(System.currentTimeMillis() - l)+"ms");
                   return i1;
                }
             }
             Object[] objArray = new Object[]{oobject,p0};
             String str2 = String.format("[error] so %s not found in manifest in %s", Arrays.copyOf(objArray, 2));
             a.o(str2, "java.lang.String.format\(format, *args\)");
             d.a(str2);
             return 0;
          }
       }catch(java.io.IOException e13){
          d.b("[error] read manifest.mf fail", e13);
          return 0;
       }
    }
}
