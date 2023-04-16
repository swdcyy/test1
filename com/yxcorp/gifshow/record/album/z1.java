package com.yxcorp.gifshow.record.album.z1;
import java.util.concurrent.Callable;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import java.util.ArrayList;
import k8c.a;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.m;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kuaishou.edit.draft.Workspace;
import qkd.b;
import qr4.i;
import android.util.Pair;
import com.yxcorp.gifshow.record.album.u1;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public final class z1 implements Callable	// class@00178b
{
    public static final z1 b;

    static {
       z1.b = new z1();
    }
    public void z1(){
       super();
    }
    public final Object call(){
       File uFile = b.a(-1504323719).c("published_data");
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       if (!uFile.exists()) {
          Object[] objArray = new Object[i];
          a.D().w("LocalAlbumUtils", "no published_data", objArray);
       }else {
          File[] uFileArray = uFile.listFiles(m.b);
          if (uFileArray != null && uFileArray.length) {
             int len = uFileArray.length;
             int i1 = 0;
             while (i1 < len) {
                File[] uFileArray1 = uFileArray[i1].listFiles(m.b);
                if (uFileArray1 != null && uFileArray1.length == 2) {
                   int len1 = uFileArray1.length;
                   FileInputStream uFileInputSt = null;
                   i oi = uFileInputSt;
                   int i2 = 0;
                   while (i2 < len1) {
                      object oobject = uFileArray1[i2];
                      if (("workspace.pb").equals(oobject.getName())) {
                         uFileInputSt = Workspace.parseFrom(new FileInputStream(oobject.getAbsolutePath()));
                      }
                      if (("photoMeta.pb").equals(oobject.getName())) {
                         oi = i.a(b.e0(oobject));
                      }
                      i2 = i2 + 1;
                   }
                   if (uFileInputSt != null && oi != null) {
                      uArrayList.add(new Pair(uFileInputSt, oi));
                   }
                }
                i1 = i1 + 1;
             }
             Collections.sort(uArrayList, u1.b);
          }
       }
       return uArrayList;
    }
}
