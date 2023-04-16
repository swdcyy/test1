package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipAllFileList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import android.os.Environment;
import java.util.Objects;
import qrd.p;
import java.util.Iterator;
import java.lang.Iterable;
import zsd.u;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.app.Application;
import o56.a;
import java.lang.StringBuilder;

public final class CleanerConfigurationWrapper$skipAllFileList$2 extends Lambda implements a	// class@001303
{
    public final CleanerConfigurationWrapper this$0;

    public void CleanerConfigurationWrapper$skipAllFileList$2(CleanerConfigurationWrapper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ArrayList invoke(){
       File externalStor;
       CleanerConfigurationWrapper$skipAllFileList$2 tthis$0;
       String obj1;
       Iterator iterator;
       int i;
       Object obj2;
       CleanerConfigurationWrapper uCleanerConf = CleanerConfigurationWrapper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.apply(null, this, CleanerConfigurationWrapper$skipAllFileList$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = new ArrayList();
          externalStor = Environment.getExternalStorageDirectory();
       }catch(java.lang.Exception e0){
          externalStor = null;
       }
       String str = "\(this as java.lang.String\).substring\(startIndex\)";
       if (externalStor != null) {
          tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          obj1 = PatchProxy.apply(null, tthis$0, e0, "5");
          if (obj1 != patchProxyRe) {
          }else {
             obj2 = tthis$0.d.getValue();
          }
          iterator = obj1.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             if (u.q2(obj1, "/", false, 2, null) || u.q2(obj1, "\\", false, 2, null)) {
                Objects.requireNonNull(obj1, "null cannot be cast to non-null type java.lang.String");
                obj1 = obj1.substring(1);
                a.o(obj1, str);
             }
             i = u.S1(obj1) ^ 1;
             if (i) {
                obj.add(new File(externalStor, obj1).getAbsolutePath());
             }
          }
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       externalStor = uApplication.getExternalCacheDir();
       if (externalStor != null) {
          externalStor = externalStor.getParentFile();
          if (externalStor != null) {
             externalStor = externalStor.getParentFile();
          label_0098 :
             if (externalStor != null) {
                tthis$0 = this.this$0;
                Objects.requireNonNull(tthis$0);
                obj2 = PatchProxy.apply(null, tthis$0, e0, "6");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = tthis$0.e.getValue();
                }
                iterator = obj2.iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (u.q2(obj1, "/", false, 2, null) || u.q2(obj1, "\\", false, 2, null)) {
                      Objects.requireNonNull(obj1, "null cannot be cast to non-null type java.lang.String");
                      obj1 = obj1.substring(1);
                      a.o(obj1, str);
                   }
                   i = u.S1(obj1) ^ 1;
                   if (i) {
                      obj.add(new File(externalStor, obj1).getAbsolutePath());
                   }
                }
             }
             CleanerConfigurationWrapper$skipAllFileList$2 tthis$01 = this.this$0;
             Objects.requireNonNull(tthis$01);
             ArrayList uArrayList = PatchProxy.apply(null, tthis$01, e0, "7");
             if (uArrayList == patchProxyRe) {
                uArrayList = tthis$01.f.getValue();
             }
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                String str1 = iterator1.next();
                if (u.S1(str1)) {
                   continue ;
                }else if(u.q2(str1, "/", false, 2, null) || u.q2(str1, "\\", false, 2, null)){
                   str1 = '/'+str1;
                }
                if (!obj.contains(str1)) {
                   obj.add(str1);
                }
             }
             return obj;
          }
       }
       Object[] objArray = null;
       goto label_0098 ;
    }
}
