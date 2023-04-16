package com.kwai.framework.cache.CacheManagerImpl$a;
import lnc.cb;
import gkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import qkd.b;
import com.kwai.framework.cache.CacheManagerImpl;
import java.lang.CharSequence;
import android.text.TextUtils;
import gkd.a$e;
import java.lang.Throwable;

public class CacheManagerImpl$a extends cb	// class@0014e7
{

    public void CacheManagerImpl$a(a p0){
       super(p0);
    }
    public void a(){
       a$e uoe;
       boolean b;
       if (PatchProxy.applyVoid(null, this, CacheManagerImpl$a.class, "1")) {
          return;
       }
       a uoa = this.b();
       if (uoa != null && !uoa.isClosed()) {
          File uFile = uoa.j();
          File[] uFileArray = new File[]{uFile};
          if (uoa.x() - b.p0(uFileArray) < 0) {
             File[] uFileArray1 = uFile.listFiles();
             if (uFileArray1 != null) {
                int len = uFileArray1.length;
                int i = 0;
                while (i < len) {
                   object oobject = uFileArray1[i];
                   if (!uoa.isClosed()) {
                      if (oobject != null) {
                         if (oobject.isDirectory()) {
                            b.m(oobject);
                            oobject.delete();
                            CacheManagerImpl.s(oobject);
                         }else {
                            String name = oobject.getName();
                            if (!TextUtils.isEmpty(name)) {
                               if (name.endsWith(".tmp")) {
                                  int i1 = 4;
                                  if (name.length() > i1) {
                                     int i2 = name.length() - i1;
                                     name = name.substring(0, i2);
                                  }
                               }
                               try{
                                  uoe = uoa.h(name);
                                  if (!name.contains("journal")) {
                                     uoa.z(name);
                                     b = true;
                                  }
                               label_0098 :
                                  if (uoe != null) {
                                     uoe.close();
                                  }
                               }catch(java.io.IOException e0){
                               }catch(java.lang.Exception e0){
                                  b = false;
                               }
                               if (!b || uoe == null) {
                                  oobject.delete();
                                  CacheManagerImpl.s(oobject);
                                  goto label_0098 ;
                               }else {
                                  goto label_0098 ;
                               }
                            }
                         }
                      }
                      i = i + 1;
                   }
                }
             }
          }
       }
       return;
    }
}
