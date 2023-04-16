package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$d;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dg7.c;
import android.app.Application;
import o56.a;
import java.util.Objects;
import java.io.File;
import android.content.Context;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.lang.Long;
import java.lang.Exception;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.lang.CharSequence;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import yf7.i;

public final class IOMonitorInitModule$d implements Runnable	// class@000e82
{
    public final String b;

    public void IOMonitorInitModule$d(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int i;
       long l1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IOMonitorInitModule$d.class, "1")) {
          return;
       }
       c uoc = c.b();
       Application uApplication = a.b();
       long l = 0x493e0;
       IOMonitorInitModule$d tb = this.b;
       Objects.requireNonNull(uoc);
       if (!uoc.c - -1) {
          uoc.c = l;
          File filesDir = uApplication.getFilesDir();
          if (filesDir != null && filesDir.exists()) {
             File uFile = new File(filesDir.getAbsolutePath()+"/io-detector/"+tb);
             if (uFile.exists()) {
                File[] uFileArray = uFile.listFiles();
                ArrayList uArrayList = new ArrayList();
                if (uFileArray != null) {
                   if (uFileArray.length > 0) {
                      int len = uFileArray.length;
                      i = 0;
                      while (i < len) {
                         object oobject = uFileArray[i];
                         if (oobject != null) {
                            c b = uoc.b;
                            try{
                               b.add(oobject);
                               l1 = Long.parseLong(oobject.getName());
                            }catch(java.lang.Exception e7){
                               e7.printStackTrace();
                               l1 = -1;
                            }
                            if (l1 - -1) {
                               long l2 = uoc.a - l1;
                               if (l2 - uoc.c > 0) {
                                  Collections.addAll(uArrayList, oobject.listFiles());
                               }
                            }
                         }
                         i = i + 1;
                      }
                   }
                   objArray = uArrayList;
                }
             }
             if (objArray != null && !objArray.isEmpty()) {
                Iterator iterator = objArray.iterator();
                while (iterator.hasNext()) {
                   filesDir = iterator.next();
                   if ((filesDir.getAbsolutePath()).contains("issue_files")) {
                      i.a.e("io-file-issue", FilesKt__FileReadWriteKt.y(filesDir, Charset.defaultCharset()), false);
                   }else if((filesDir.getAbsolutePath()).contains("io_info")){
                      i.a.e("io-overview", FilesKt__FileReadWriteKt.y(filesDir, Charset.defaultCharset()), false);
                   }
                }
                Iterator iterator1 = uoc.b.iterator();
                while (iterator1.hasNext()) {
                   File uFile1 = iterator1.next();
                   if (uFile1.exists()) {
                      uFile1.getAbsolutePath();
                      c.a(uFile1);
                   }
                }
             }
          }
       }
       return;
    }
}
