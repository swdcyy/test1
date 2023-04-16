package com.meizu.cloud.pushsdk.handler.a.b.b;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.util.zip.ZipOutputStream;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.Collection;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.os.Environment;

public class b	// class@001534
{
    public final File a;

    public void b(String p0){
       this.a = new File(p0);
    }
    public final void a(File p0,ZipOutputStream p1,String p2){
       StringBuilder str = p2;
       p2 = (!(p2.trim()).length())? "": File.separator;
       p2 = str+p2+p0.getName();
       int i = 0;
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (; i < len; i = i + 1) {
             this.a(uFileArray[i], p1, p2);
          }
       }else {
          DebugLogger.i("ZipTask", "current file "+p2+"/"+p0.getName()+" size is "+(p0.length() / 1024)+"KB");
          if (p0.length() - 0xa00000 < 0) {
             byte[] uobyteArray = new byte[0x100000];
             BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0), 0x100000);
             p1.putNextEntry(new ZipEntry(p2));
             int i1 = uBufferedInp.read(uobyteArray);
             while (i1 != -1) {
                p1.write(uobyteArray, i, i1);
             }
             uBufferedInp.close();
             p1.flush();
             p1.closeEntry();
          }
       }
       return;
    }
    public final void a(Collection p0,File p1){
       ZipOutputStream zipOutputStr = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(p1), 0x100000));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next(), zipOutputStr, "");
       }
       zipOutputStr.close();
       return;
    }
    public void a(List p0){
       if (!this.a.exists()) {
          this.a.getParentFile().mkdirs();
       }
       ArrayList uArrayList = new ArrayList();
       String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          File uFile = new File(absolutePath+iterator.next());
          if (uFile.exists()) {
             uArrayList.add(uFile);
          }
       }
       this.a(uArrayList, this.a);
       return;
    }
}
