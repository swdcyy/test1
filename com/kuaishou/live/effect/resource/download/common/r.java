package com.kuaishou.live.effect.resource.download.common.r;
import java.lang.Object;
import java.lang.Runtime;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.io.File;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Exception;
import java.util.LinkedList;
import java.util.ArrayList;
import android.util.Pair;
import java.lang.Long;
import com.kuaishou.live.effect.resource.download.common.q;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.lang.Number;
import y56.a;
import qkd.b;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.RandomAccessFile;
import java.lang.Throwable;

public class r	// class@001b49
{
    public final long a;
    public final ThreadPoolExecutor b;

    public void r(long p0){
       super();
       this.a = p0;
       int i = Runtime.getRuntime().availableProcessors() * 2;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(i, i, 3, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b("global-default-pool"));
       this.b = v10;
       v10.allowCoreThreadTimeOut(true);
    }
    public final List a(File p0){
       ArrayList uArrayList;
       long l;
       Iterator iterator;
       File uFile;
       int b;
       long l1;
       Iterator iterator1;
       File[] uFileArray;
       ArrayList uArrayList1;
       int i;
       object oobject;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LinkedList obj = PatchProxy.applyOneRefs(p0, this, r.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (System.currentTimeMillis() - p0.lastModified() > 0 && (!PatchProxy.applyVoidOneRefs(p0, this, r.class, "3") && p0.exists())) {
          try{
             if (p0.isDirectory()) {
                this.b(p0);
             }else {
                this.c(p0);
             }
          }catch(java.io.IOException e2){
          }catch(java.lang.IllegalArgumentException e2){
          }catch(java.lang.SecurityException e2){
          }
       }
    }
    public final void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "4")) {
          return;
       }
       if (!p0.setLastModified(System.currentTimeMillis())) {
          File uFile = new File(p0, "tmpDir");
          if (uFile.mkdirs()) {
             uFile.delete();
          }
       }
       return;
    }
    public final void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "5")) {
          return;
       }
       if (!p0.setLastModified(System.currentTimeMillis())) {
          long l = p0.length();
          if (!l - null) {
             if (p0.delete() && p0.createNewFile()) {
                return;
             }else {
                throw new IOException("Error recreate zero-size file "+p0);
             }
          }else {
             RandomAccessFile randomAccess = new RandomAccessFile(p0, "rwd");
             l = l - 1;
             randomAccess.seek(l);
             randomAccess.seek(l);
             randomAccess.write(randomAccess.readByte());
             randomAccess.close();
          }
       }
       return;
    }
}
