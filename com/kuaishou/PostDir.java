package com.kuaishou.PostDir;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashSet;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import java.util.Set;
import java.lang.Boolean;
import qkd.b;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import j80.c;
import java.util.Objects;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.RuntimeException;
import com.kuaishou.PostDir$a;
import android.os.FileObserver;

public class PostDir implements Serializable	// class@00076e
{
    public FileObserver b;
    public boolean mCacheIsDir;
    public boolean mIsResource;
    public String mName;
    public String mPath;
    public final Set mUsedFile;
    public static final long serialVersionUID = 0xcfe190bcf933d741;

    public void PostDir(){
       super();
       this.mUsedFile = new HashSet();
    }
    public static String eventToString(int p0){
       if (PatchProxy.isSupport(PostDir.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, PostDir.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 8) {
             if (p0 != 16) {
                if (p0 != 32) {
                   if (p0 != 128) {
                      if (p0 != 256) {
                         if (p0 != 512) {
                            if (p0 != 1024) {
                               return Integer.toHexString(p0);
                            }else {
                               return "DELETE_SELF";
                            }
                         }else {
                            return "DELETE";
                         }
                      }else {
                         return "CREATE";
                      }
                   }else {
                      return "MOVED_TO";
                   }
                }else {
                   return "OPEN";
                }
             }else {
                return "CLOSE_NOWRITE";
             }
          }else {
             return "CLOSE_WRITE";
          }
       }else {
          return "ACCESS";
       }
    }
    public final boolean a(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public void deleteUnusedCacheFile(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PostDir.class, "4")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("PostDir", "deleteUnusedCacheFile\(\) "+this, objArray1);
       if (!this.a()) {
          return;
       }
       File dirForWatchi = this.getDirForWatching();
       Object[] objArray2 = PatchProxy.applyOneRefs(dirForWatchi, objArray, PostDir.class, "5");
       if (objArray2 != patchProxyRe) {
       }else {
          String str = "PostDir";
          if (dirForWatchi == null) {
             Object[] objArray4 = new Object[0];
             a.D().A(str, "listCacheFiles\(\) dir is null", objArray4);
          }else if(!dirForWatchi.exists()){
             objArray1 = new Object[0];
             a.D().s(str, "listCacheFiles\(\) not exist "+dirForWatchi, objArray1);
          }else {
             objArray2 = dirForWatchi.listFiles();
          }
          objArray2 = objArray;
       }
       if (objArray2 == null || !objArray2.length) {
          objArray = new Object[0];
          a.D().w("PostDir", "deleteUnusedCacheFile\(\) is empty "+this.mName, objArray);
          return;
       }else {
          int len = objArray2.length;
          int i = 0;
          while (i < len) {
             object oobject = objArray2[i];
             String absolutePath = oobject.getAbsolutePath();
             PostDir tmUsedFile = this.mUsedFile;
             _monitor_enter(tmUsedFile);
             if (this.mUsedFile.contains(absolutePath)) {
                Object[] objArray3 = new Object[0];
                a.D().w("PostDir", "deleteUnusedCacheFile\(\) exclude used "+absolutePath, objArray3);
                _monitor_exit(tmUsedFile);
             }else {
                _monitor_exit(tmUsedFile);
                if (!absolutePath.endsWith(".nomedia")) {
                   Object[] obj = PatchProxy.applyOneRefs(oobject, objArray, PostDir.class, "6");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(oobject.isFile()){
                      b = oobject.delete();
                   }else if(oobject.isDirectory()){
                      try{
                         b.p(oobject);
                         b = true;
                      }catch(java.io.IOException e7){
                         a.D().z("PostDir", "deleteFile\(\) failed "+oobject, e7);
                      }
                      b = false;
                   }else {
                      goto label_0100 ;
                   }
                   obj = new Object[0];
                   a.D().w("PostDir", "deleteUnusedCacheFile\(\) delete ok="+b+" "+oobject, obj);
                }
             }
             i = i + 1;
          }
          return;
       }
    }
    public File getDirForWatching(){
       PostDir tmName;
       Object[] objArray = null;
       PostDir obj = PatchProxy.apply(objArray, this, PostDir.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "PostDir";
       if (TextUtils.isEmpty(this.mName) || TextUtils.isEmpty(this.mPath)) {
          PostUtils.D(str, "", new RuntimeException("need init first"));
          return objArray;
       }else {
          int i = -1504323719;
          if (("DirInRoot").equals(this.mPath)) {
             tmName = this.mName;
             Objects.requireNonNull(tmName);
             return b.a(i).h(tmName);
          }else if(("DirInPrivateRoot").equals(this.mPath)){
             tmName = this.mName;
             Objects.requireNonNull(tmName);
             return b.a(i).g(tmName);
          }else if(("DirInPhoto").equals(this.mPath)){
             tmName = this.mName;
             Objects.requireNonNull(tmName);
             return b.a(i).d(tmName);
          }else if(("AppCacheDir").equals(this.mPath)){
             PostDir tmName1 = this.mName;
             Objects.requireNonNull(tmName1);
             return new File(a.b().getCacheDir(), tmName1);
          }else if(("DirInCache").equals(this.mPath)){
             tmName = this.mName;
             Objects.requireNonNull(tmName);
             return b.a(i).c(tmName);
          }else if(("DirInPrivateCache").equals(this.mPath)){
             tmName = this.mName;
             Objects.requireNonNull(tmName);
             return b.a(i).f(tmName);
          }else if(("PostSubDir").equals(this.mPath)){
             obj = this.mName;
             Objects.requireNonNull(obj);
             return PostUtils.p(obj);
          }else if(("PostVideoSubDir").equals(this.mPath)){
             return new File(PostUtils.p(".video_cache")+File.separator+this.mName);
          }else if(("PrivatePostSubDir").equals(this.mPath)){
             obj = this.mName;
             Objects.requireNonNull(obj);
             return PostUtils.r(obj);
          }else {
             PostUtils.D(str, "getDirForWatching\(\) wrong config", new RuntimeException("cant find mPath="+this.mPath+" for="+this.mName));
             return objArray;
          }
       }
    }
    public void startWatch(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, PostDir.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostDir", "startWatch\(\) "+this, objArray);
       if (this.a()) {
          return;
       }
       File dirForWatchi = this.getDirForWatching();
       if (dirForWatchi == null) {
          objArray1 = new Object[i];
          a.D().w("PostDir", "startWatch\(\) cant get dir file "+this.mName, objArray1);
          return;
       }else if(!dirForWatchi.exists() && !dirForWatchi.mkdirs()){
          objArray1 = new Object[i];
          a.D().A("PostDir", "PostVideoSubDir\(\) create failed "+dirForWatchi, objArray1);
       }
       if (!dirForWatchi.isDirectory()) {
          PostUtils.D("PostDir", "startWatch\(\) not dir "+dirForWatchi, new RuntimeException("not dir "+dirForWatchi));
          return;
       }else {
          PostDir$a uoa = new PostDir$a(this, dirForWatchi.getAbsolutePath(), 289, dirForWatchi.getAbsolutePath());
          this.b = uoa;
          uoa.startWatching();
          return;
       }
    }
    public void stopWatch(){
       if (PatchProxy.applyVoid(null, this, PostDir.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostDir", "stopWatch\(\) "+this.mName, objArray);
       if (!this.a()) {
          return;
       }
       this.b.stopWatching();
       this.b = null;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostDir.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostCacheDir{mName=\'"+this.mName+'''+", mPath=\'"+this.mPath+'''+", mIsResource="+this.mIsResource+", mCacheIsDir="+this.mCacheIsDir+", is watching="+this.a()+'}';
    }
}
