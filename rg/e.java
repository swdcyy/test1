package rg.e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import rg.g;
import rg.b;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.String;
import java.io.File;
import java.util.Iterator;
import android.content.Context;
import rg.d$b;
import java.lang.CharSequence;
import rg.h;
import java.lang.StringBuilder;
import java.lang.ClassLoader;
import java.lang.Class;
import dalvik.system.BaseDexClassLoader;
import rg.d$c;
import java.lang.Thread;
import rg.e$a;
import java.lang.Runnable;
import java.lang.IllegalArgumentException;
import rg.c;
import java.util.List;
import rg.c$c;
import sg.f;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.lang.Throwable;
import android.util.Log;
import rg.f;
import java.io.FilenameFilter;
import rg.d$a;
import java.lang.UnsatisfiedLinkError;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import java.lang.RuntimeException;
import rg.d$d;

public class e	// class@002384
{
    public final Set a;
    public final d$b b;
    public final d$a c;
    public boolean d;
    public boolean e;
    public boolean f;
    public d$d g;
    public static Map h;
    public static Map i;
    public static final Set j;

    static {
       e.h = new ConcurrentHashMap();
       e.i = new ConcurrentHashMap();
       e.j = Collections.newSetFromMap(new ConcurrentHashMap());
    }
    public void e(){
       super();
       this.a = new LinkedHashSet();
       this.e = true;
       this.b = new g();
       this.c = new b();
    }
    public static synchronized void a(String p0){
       _monitor_enter(e.class);
       e.j.add(p0);
       _monitor_exit(e.class);
    }
    public static File d(String p0){
       File uFile;
       Iterator iterator = e.j.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uFile = new File(iterator.next(), p0);
          if (uFile.exists()) {
             break ;
          }
       }
       return uFile;
    }
    public e b(){
       this.f = true;
       return this;
    }
    public e c(){
       this.d = true;
       return this;
    }
    public File e(Context p0){
       return p0.getDir("lib", 0);
    }
    public File f(Context p0,String p1,String p2){
       p1 = this.b.b(p1);
       if (h.a(p2)) {
          return new File(this.e(p0), p1);
       }
       return new File(this.e(p0), p1+"."+p2);
    }
    public final boolean g(String p0){
       p0 = e.class.getClassLoader().findLibrary(p0);
       boolean b = (!h.a(p0) && (!p0.startsWith("/system") && (p0.startsWith("/vendor") || p0.startsWith("/apex"))))? true: false;
       return b;
    }
    public void h(Context p0,String p1){
       this.j(p0, p1, null, null);
    }
    public void i(Context p0,String p1,String p2){
       this.j(p0, p1, p2, null);
    }
    public void j(Context p0,String p1,String p2,d$c p3){
       if (h.a(p1)) {
          throw new IllegalArgumentException("Given library is either null or empty");
       }
       if (p3 == null) {
          this.k(p0, p1, p2);
       }else {
          e$a uoa = new e$a(this, p0, p1, p2, p3);
          new Thread(v7).start();
       }
       return;
    }
    public void k(Context p0,String p1,String p2){
       d$b uob;
       File uFile;
       File uFile2;
       List eMPTY_LIST;
       File[] uFileArray;
       e uoe = this;
       Context uContext = p0;
       Object obj = p1;
       if (uoe.a.contains(obj) && (uoe.f != null || uoe.d == null)) {
          return;
       }
       Iterator iterator = c.a().a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             c$c uoc = iterator.next();
             if (uoc.enable(obj)) {
                uob = uoc.a();
             }
          }else {
             uob = null;
          }
          if (uob != null) {
             uFile = e.d(uob.b(obj));
             if (uFile != null && uFile.exists()) {
                f uof = new f(uFile);
                List list = uof.a();
                try{
                   uof.close();
                   if (list != null) {
                      iterator = list.iterator();
                      while (iterator.hasNext()) {
                         String str = uob.a(iterator.next());
                         if (uoe.g(str)) {
                            continue ;
                         }
                         uoe.h(uContext, str);
                      }
                   }
                   break ;
                }catch(java.io.IOException e0){
                   break ;
                }catch(java.lang.IllegalStateException e0){
                   throw e0;
                }
             }else {
                throw new MissingLibraryException(uob.b(obj));
             }
          }else {
             try{
                uoe.b.loadLibrary(obj);
                uoe.a.add(obj);
                return;
             }catch(java.lang.UnsatisfiedLinkError e0){
                Throwable throwable = e0;
                Log.getStackTraceString(throwable);
                if (!uContext) {
                   return;
                }else {
                   File uFile1 = e.d(uoe.b.b(obj));
                   int i = 0;
                   if (uFile1 != null) {
                      uFile2 = uFile1;
                      uob = 1;
                   }else {
                      try{
                         uFile1 = this.f(p0, p1, p2);
                         if (!uFile1.exists() || uoe.d != null) {
                            uFile = this.f(p0, p1, p2);
                            uFileArray = this.e(p0).listFiles(new f(uoe, uoe.b.b(obj)));
                            if (uFileArray != null) {
                               int len = uFileArray.length;
                               int i1 = 0;
                            label_00f0 :
                               if (i1 < len) {
                                  object oobject = uFileArray[i1];
                                  if (uoe.d != null || !(oobject.getAbsolutePath()).equals(uFile.getAbsolutePath())) {
                                     oobject.delete();
                                  }
                                  i1 = i1 + 1;
                                  goto label_00f0 ;
                               }
                            }
                            uoe.c.a(p0, uoe.b.c(), uoe.b.b(obj), uFile1, this);
                         }
                         uFile2 = uFile1;
                         uFileArray = 0;
                      }catch(com.getkeepsafe.relinker.MissingLibraryException e0){
                         throw new MissingLibraryException(uoe.b.b(obj), throwable);
                      }
                   }
                   String message = throwable.getMessage();
                   int b = message.contains(obj);
                   try{
                      b = b ^ 1;
                      ArrayList uArrayList = new ArrayList();
                      if (uoe.e == null && (uob || b)) {
                         f uof1 = new f(uFile2);
                         eMPTY_LIST = uof1.a();
                         uof1.close();
                         if (eMPTY_LIST != null) {
                            Iterator iterator1 = eMPTY_LIST.iterator();
                         label_014c :
                            if (iterator1.hasNext()) {
                               String str2 = iterator1.next();
                               if (uoe.e != null) {
                                  String str3 = uoe.b.a(str2);
                                  if (str3 != null && uoe.g(str3)) {
                                     goto label_014c ;
                                  }
                               }else if(uob){
                                  if (e.d(str2) == null) {
                                     goto label_014c ;
                                  }
                               }else if(b && !message.contains(str2)){
                                  goto label_014c ;
                               }
                               uoe.h(uContext, uoe.b.a(str2));
                               uArrayList.add(str2);
                               i = i + 1;
                               goto label_014c ;
                            }
                         }else {
                            i = -1;
                         }
                      }
                      e.h.put(obj, uArrayList);
                      try{
                         uoe.b.d(uFile2.getAbsolutePath());
                      label_0269 :
                         uoe.a.add(obj);
                         return;
                      }catch(java.lang.UnsatisfiedLinkError e0){
                         String str1 = "relinker.dependencies";
                         if (!v11) {
                            eMPTY_LIST = Collections.EMPTY_LIST;
                         }
                         uoe.m(str1, eMPTY_LIST);
                         uoe.m("relinker.loadedLibrary", uoe.a);
                         uoe.m("relinker.retryLoadFile", uFile2+v10+uFile2.exists()+v10+uFile2.length()+v10+uFile2.lastModified());
                         str1 = e0.getMessage();
                         if (str1 != null && str1.contains(obj)) {
                            uoe.m("relinker.firstLoadError", Log.getStackTraceString(throwable));
                            uoe.m("relinker.retryLoadError", Log.getStackTraceString(e0));
                            if (!uob) {
                               uFile2.delete();
                            }
                            uoe.c.a(p0, uoe.b.c(), uoe.b.b(obj), uFile2, this);
                            uoe.m("relinker.retryInstallAgain", uFile2+v10+uFile2.exists()+v10+uFile2.length()+v10+uFile2.lastModified());
                            uoe.b.d(uFile2.getAbsolutePath());
                            goto label_0269 ;
                         }else if(e0.getCause() == null){
                            e0.initCause(throwable);
                         }
                         if (throwable.getCause() == null) {
                            throwable.initCause(new RuntimeException("because of load lib "+obj+", file "+uFile2+", recursive load "+i));
                         }
                         throw e0;
                      }
                   }catch(java.io.IOException e0){
                   }catch(java.lang.IllegalStateException e0){
                      if (!uob) {
                         uFile2.delete();
                      }
                      if (e0.getCause() == null) {
                         e0.initCause(throwable);
                      }
                      throw e0;
                   }
                }
             }
          }
       }
       try{
          uob.d(uFile.getAbsolutePath());
          uoe.a.add(obj);
          return;
       }catch(java.lang.UnsatisfiedLinkError e0){
          throw e0;
       }
    }
    public e l(d$d p0){
       this.g = p0;
       return this;
    }
    public final void m(String p0,Object p1){
       Map i = e.i;
       if (p1 == null) {
          p1 = "null";
       }
       i.put(p0, p1);
       return;
    }
    public e n(){
       this.e = true;
       return this;
    }
}
