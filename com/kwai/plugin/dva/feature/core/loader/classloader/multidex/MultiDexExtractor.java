package com.kwai.plugin.dva.feature.core.loader.classloader.multidex.MultiDexExtractor;
import java.io.Closeable;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.lang.StringBuilder;
import java.util.zip.ZipOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import android.content.Context;
import android.content.SharedPreferences;
import com.kwai.robust.PatchProxyResult;
import oe6.o;
import java.lang.Number;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.c;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.c$a;
import java.util.List;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.MultiDexExtractor$ExtractedDex;
import oe6.g;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import ui7.a;
import java.io.FileFilter;

public final class MultiDexExtractor implements Closeable	// class@001317
{
    public final File b;
    public final long c;
    public final File d;
    public final RandomAccessFile e;
    public final FileChannel f;
    public final FileLock g;

    public void MultiDexExtractor(File p0,File p1){
       super();
       p0.getPath();
       p1.getPath();
       this.b = p0;
       this.d = p1;
       this.c = MultiDexExtractor.e(p0);
       p0 = new File(p1, "MultiDex.lock");
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "rw");
       try{
          this.e = randomAccess;
          FileChannel channel = randomAccess.getChannel();
          try{
             this.f = channel;
             p0.getPath();
             FileLock uFileLock = channel.lock();
             this.g = uFileLock;
             p0.getPath();
             return;
          }catch(java.io.IOException e3){
          }catch(java.lang.RuntimeException e3){
          }catch(java.lang.Error e3){
          }catch(java.lang.RuntimeException e3){
          }catch(java.lang.Error e3){
          }
       }catch(java.io.IOException e3){
       }catch(java.lang.RuntimeException e3){
       }catch(java.lang.Error e3){
       }
       MultiDexExtractor.a(this.e);
       throw e3;
    }
    public static void a(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MultiDexExtractor.class, "12")) {
          return;
       }
       try{
          p0.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static void b(ZipFile p0,ZipEntry p1,File p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, MultiDexExtractor.class, "11")) {
          return;
       }
       InputStream inputStream = p0.getInputStream(p1);
       File uFile = File.createTempFile("tmp-"+p3, ".zip", p2.getParentFile());
       uFile.getPath();
       ZipOutputStream zipOutputStr = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(uFile)));
       ZipEntry zipEntry = new ZipEntry("classes.dex");
       zipEntry.setTime(p1.getTime());
       zipOutputStr.putNextEntry(zipEntry);
       byte[] uobyteArray = new byte[0x4000];
       for (int i = inputStream.read(uobyteArray); i != -1; i = inputStream.read(uobyteArray)) {
          zipOutputStr.write(uobyteArray, 0, i);
       }
       zipOutputStr.closeEntry();
       zipOutputStr.close();
       if (!uFile.setReadOnly()) {
          throw new IOException("Failed to mark readonly \""+uFile.getAbsolutePath()+"\" \(tmp of \""+p2.getAbsolutePath()+"\"\)");
       }
       p2.getPath();
       if (!uFile.renameTo(p2)) {
          throw new IOException("Failed to rename \""+uFile.getAbsolutePath()+"\" to \""+p2.getAbsolutePath()+"\"");
       }
       MultiDexExtractor.a(inputStream);
       uFile.delete();
       return;
    }
    public static SharedPreferences c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiDexExtractor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.c(p0, "multidex.version", 4);
    }
    public static long d(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiDexExtractor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = p0.lastModified();
       if (!l - -1) {
          l = l - 1;
       }
       return l;
    }
    public static long e(File p0){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, MultiDexExtractor.class, "6");
       if (obj1 != patchProxyRe) {
          return obj1.longValue();
       }
       obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "1");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
          randomAccess.close();
          l = c.a(randomAccess, c.b(randomAccess));
       }
       if (!l - -1) {
          l = l - 1;
       }
       return l;
    }
    public static void k(Context p0,String p1,long p2,long p3,List p4){
       int i = 2;
       if (PatchProxy.isSupport(MultiDexExtractor.class)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Long.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, MultiDexExtractor.class, "8")) {
             return;
          }
       }
       SharedPreferences$Editor uEditor = MultiDexExtractor.c(p0).edit();
       uEditor.putLong(p1+"timestamp", p2);
       uEditor.putLong(p1+"crc", p3);
       uEditor.putInt(p1+"dex.number", (p4.size() + 1));
       Iterator iterator = p4.iterator();
       while (iterator.hasNext()) {
          MultiDexExtractor$ExtractedDex uExtractedDe = iterator.next();
          uEditor.putLong(p1+"dex.crc."+i, uExtractedDe.crc);
          uEditor.putLong(p1+"dex.time."+i, uExtractedDe.lastModified());
          i = i + 1;
       }
       g.b(uEditor);
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, MultiDexExtractor.class, "2")) {
          return;
       }
       this.g.release();
       this.f.close();
       this.e.close();
       return;
    }
    public List f(Context p0,String p1,boolean p2){
       MultiDexExtractor obj;
       boolean b;
       List list;
       MultiDexExtractor multiDexExtr = this;
       String str = p1;
       if (PatchProxy.isSupport(MultiDexExtractor.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, MultiDexExtractor.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       multiDexExtr.b.getPath();
       if (multiDexExtr.g.isValid()) {
          if (!p2) {
             obj = multiDexExtr.b;
             MultiDexExtractor c = multiDexExtr.c;
             if (PatchProxy.isSupport(MultiDexExtractor.class)) {
                SharedPreferences obj1 = PatchProxy.applyFourRefs(p0, obj, Long.valueOf(c), p1, null, MultiDexExtractor.class, "4");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else {
                label_005b :
                   obj1 = MultiDexExtractor.c(p0);
                   long l = -1;
                   b = (obj1.getLong(str+"timestamp", l) - MultiDexExtractor.d(obj) || obj1.getLong(str+"crc", l) - c)? true: false;
                }
             }else {
                goto label_005b ;
             }
             if (!b) {
                try{
                   list = this.g(p0, p1);
                }catch(java.io.IOException e0){
                   list = this.j();
                   MultiDexExtractor.k(p0, p1, MultiDexExtractor.d(multiDexExtr.b), multiDexExtr.c, list);
                }
             }else {
             label_00b7 :
                list = this.j();
                MultiDexExtractor.k(p0, p1, MultiDexExtractor.d(multiDexExtr.b), multiDexExtr.c, list);
             }
          }else {
             goto label_00b7 ;
          }
       }else {
          throw new IllegalStateException("MultiDexExtractor was closed");
       }
    }
    public final List g(Context p0,String p1){
       MultiDexExtractor$ExtractedDex uExtractedDe;
       long longx;
       long longx1;
       long l;
       Object obj = this;
       Object obj1 = p1;
       String obj2 = PatchProxy.applyTwoRefs(p0, obj1, obj, MultiDexExtractor.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = obj.b.getName()+".classes";
       SharedPreferences sharedPrefer = MultiDexExtractor.c(p0);
       int intx = sharedPrefer.getInt(obj1+"dex.number", 1);
       ArrayList uArrayList = new ArrayList((intx - 1));
       int i = 2;
       while (true) {
          if (i > intx) {
             return uArrayList;
          }
          uExtractedDe = new MultiDexExtractor$ExtractedDex(obj.d, obj2+i+".zip");
          if (!uExtractedDe.isFile()) {
             throw new IOException("Missing extracted secondary dex file \'"+uExtractedDe.getPath()+"\'");
          }
          uExtractedDe.crc = MultiDexExtractor.e(uExtractedDe);
          longx = sharedPrefer.getLong(obj1+"dex.crc."+i, -1);
          longx1 = sharedPrefer.getLong(obj1+"dex.time."+i, -1);
          l = uExtractedDe.lastModified();
          if (!longx1 - l) {
             String str = obj2;
             SharedPreferences sharedPrefer1 = sharedPrefer;
             if (!longx - uExtractedDe.crc) {
                uArrayList.add(uExtractedDe);
                i = i + 1;
                sharedPrefer = sharedPrefer1;
                obj2 = str;
             }
          }
          break ;
       }
       throw new IOException("Invalid extracted dex: "+uExtractedDe+" \(key \""+obj1+"\"\), expected modification time: "+longx1+", modification time: "+l+", expected crc: "+longx+", file crc: "+uExtractedDe.crc);
    }
    public final List j(){
       int i;
       MultiDexExtractor$ExtractedDex uExtractedDe;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, MultiDexExtractor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getName()+".classes";
       if (!PatchProxy.applyVoid(objArray, this, MultiDexExtractor.class, "10")) {
          File[] uFileArray = this.d.listFiles(new a(this));
          if (uFileArray == null) {
             this.d.getPath();
          }else {
             int len = uFileArray.length;
             i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                oobject.getPath();
                oobject.length();
                if (!oobject.delete()) {
                   oobject.getPath();
                }else {
                   oobject.getPath();
                }
                i = i + 1;
             }
          }
       }
       ArrayList uArrayList = new ArrayList();
       ZipFile zipFile = new ZipFile(this.b);
       i = 2;
       ZipEntry entry = zipFile.getEntry("classes2.dex");
       while (true) {
          if (entry != null) {
             uExtractedDe = new MultiDexExtractor$ExtractedDex(this.d, obj+i+".zip");
             uArrayList.add(uExtractedDe);
             StringBuilder str = "Extraction is needed for file "+uExtractedDe;
             int i1 = 0;
             long l = 0;
             while (i1 < 3 && !l) {
                i1 = i1 + 1;
                try{
                   MultiDexExtractor.b(zipFile, entry, uExtractedDe, obj);
                   uExtractedDe.crc = MultiDexExtractor.e(uExtractedDe);
                   l = 1;
                }catch(java.io.IOException e0){
                   uExtractedDe.getAbsolutePath();
                   l = 0;
                }
                uExtractedDe.getAbsolutePath();
                uExtractedDe.length();
                if (!l) {
                   uExtractedDe.delete();
                   if (uExtractedDe.exists()) {
                      uExtractedDe.getPath();
                   }
                }
             }
             if (l) {
                i = i + 1;
                entry = zipFile.getEntry("classes"+i+".dex");
             }else {
             }
          }else {
             try{
                zipFile.close();
                return uArrayList;
             }catch(java.io.IOException e0){
             }
          }
       }
       throw new IOException("Could not create zip file "+uExtractedDe.getAbsolutePath()+" for secondary dex \("+i+"\)");
    }
}
