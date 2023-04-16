package androidx.multidex.MultiDexExtractor;
import java.io.Closeable;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
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
import androidx.multidex.ZipUtil;
import java.util.List;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import androidx.multidex.MultiDexExtractor$ExtractedDex;
import oe6.g;
import androidx.multidex.MultiDexExtractor$1;
import java.io.FileFilter;
import java.lang.IllegalStateException;
import java.util.ArrayList;

public final class MultiDexExtractor implements Closeable	// class@00085a
{
    public final FileLock cacheLock;
    public final File dexDir;
    public final FileChannel lockChannel;
    public final RandomAccessFile lockRaf;
    public final File sourceApk;
    public final long sourceCrc;

    public void MultiDexExtractor(File p0,File p1){
       super();
       p0.getPath();
       p1.getPath();
       this.sourceApk = p0;
       this.dexDir = p1;
       this.sourceCrc = MultiDexExtractor.getZipCrc(p0);
       p0 = new File(p1, "MultiDex.lock");
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "rw");
       try{
          this.lockRaf = randomAccess;
          FileChannel channel = randomAccess.getChannel();
          try{
             this.lockChannel = channel;
             p0.getPath();
             FileLock uFileLock = channel.lock();
             this.cacheLock = uFileLock;
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
       MultiDexExtractor.closeQuietly(this.lockRaf);
       throw e3;
    }
    public static void closeQuietly(Closeable p0){
       try{
          p0.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static void extract(ZipFile p0,ZipEntry p1,File p2,String p3){
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
       MultiDexExtractor.closeQuietly(inputStream);
       uFile.delete();
       return;
    }
    public static SharedPreferences getMultiDexPreferences(Context p0){
       return p0.getSharedPreferences("multidex.version", 4);
    }
    public static long getTimeStamp(File p0){
       long l = p0.lastModified();
       if (!l - -1) {
          l = l - 1;
       }
       return l;
    }
    public static long getZipCrc(File p0){
       long zipCrc = ZipUtil.getZipCrc(p0);
       if (!zipCrc - -1) {
          zipCrc = zipCrc - 1;
       }
       return zipCrc;
    }
    public static boolean isModified(Context p0,File p1,long p2,String p3){
       SharedPreferences multiDexPref = MultiDexExtractor.getMultiDexPreferences(p0);
       boolean b = (multiDexPref.getLong(p3+"timestamp", -1) - MultiDexExtractor.getTimeStamp(p1) || multiDexPref.getLong(p3+"crc", -1) - p2)? true: false;
       return b;
    }
    public static void putStoredApkInfo(Context p0,String p1,long p2,long p3,List p4){
       SharedPreferences$Editor uEditor = MultiDexExtractor.getMultiDexPreferences(p0).edit();
       uEditor.putLong(p1+"timestamp", p2);
       uEditor.putLong(p1+"crc", p3);
       uEditor.putInt(p1+"dex.number", (p4.size() + 1));
       Iterator iterator = p4.iterator();
       int i = 2;
       while (iterator.hasNext()) {
          MultiDexExtractor$ExtractedDex uExtractedDe = iterator.next();
          uEditor.putLong(p1+"dex.crc."+i, uExtractedDe.crc);
          uEditor.putLong(p1+"dex.time."+i, uExtractedDe.lastModified());
          i = i + 1;
       }
       g.b(uEditor);
       return;
    }
    public final void clearDexDir(){
       File[] uFileArray = this.dexDir.listFiles(new MultiDexExtractor$1(this));
       if (uFileArray == null) {
          this.dexDir.getPath();
          return;
       }else {
          int len = uFileArray.length;
          int i = 0;
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
          return;
       }
    }
    public void close(){
       this.cacheLock.release();
       this.lockChannel.close();
       this.lockRaf.close();
    }
    public List load(Context p0,String p1,boolean p2){
       List list;
       this.sourceApk.getPath();
       if (!this.cacheLock.isValid()) {
          throw new IllegalStateException("MultiDexExtractor was closed");
       }
       if (!p2 && !MultiDexExtractor.isModified(p0, this.sourceApk, this.sourceCrc, p1)) {
          try{
             list = this.loadExistingExtractions(p0, p1);
          }catch(java.io.IOException e0){
             list = this.performExtractions();
             MultiDexExtractor.putStoredApkInfo(p0, p1, MultiDexExtractor.getTimeStamp(this.sourceApk), this.sourceCrc, list);
          }
       }else {
          list = this.performExtractions();
          MultiDexExtractor.putStoredApkInfo(p0, p1, MultiDexExtractor.getTimeStamp(this.sourceApk), this.sourceCrc, list);
       }
    }
    public final List loadExistingExtractions(Context p0,String p1){
       MultiDexExtractor$ExtractedDex uExtractedDe;
       long longx;
       long longx1;
       long l;
       MultiDexExtractor multiDexExtr = this;
       String str = p1;
       String str1 = multiDexExtr.sourceApk.getName()+".classes";
       SharedPreferences multiDexPref = MultiDexExtractor.getMultiDexPreferences(p0);
       int intx = multiDexPref.getInt(str+"dex.number", 1);
       ArrayList uArrayList = new ArrayList((intx - 1));
       int i = 2;
       while (true) {
          if (i > intx) {
             return uArrayList;
          }
          uExtractedDe = new MultiDexExtractor$ExtractedDex(multiDexExtr.dexDir, str1+i+".zip");
          if (!uExtractedDe.isFile()) {
             throw new IOException("Missing extracted secondary dex file \'"+uExtractedDe.getPath()+"\'");
          }
          uExtractedDe.crc = MultiDexExtractor.getZipCrc(uExtractedDe);
          longx = multiDexPref.getLong(str+"dex.crc."+i, -1);
          longx1 = multiDexPref.getLong(str+"dex.time."+i, -1);
          l = uExtractedDe.lastModified();
          if (!longx1 - l) {
             String str2 = str1;
             SharedPreferences sharedPrefer = multiDexPref;
             if (!longx - uExtractedDe.crc) {
                uArrayList.add(uExtractedDe);
                i = i + 1;
                multiDexPref = sharedPrefer;
                str1 = str2;
             }
          }
          break ;
       }
       throw new IOException("Invalid extracted dex: "+uExtractedDe+" \(key \""+str+"\"\), expected modification time: "+longx1+", modification time: "+l+", expected crc: "+longx+", file crc: "+uExtractedDe.crc);
    }
    public final List performExtractions(){
       MultiDexExtractor$ExtractedDex uExtractedDe;
       String str = this.sourceApk.getName()+".classes";
       this.clearDexDir();
       ArrayList uArrayList = new ArrayList();
       ZipFile zipFile = new ZipFile(this.sourceApk);
       int i = 2;
       ZipEntry entry = zipFile.getEntry("classes2.dex");
       while (true) {
          if (entry != null) {
             uExtractedDe = new MultiDexExtractor$ExtractedDex(this.dexDir, str+i+".zip");
             uArrayList.add(uExtractedDe);
             StringBuilder str1 = "Extraction is needed for file "+uExtractedDe;
             int i1 = 0;
             long l = 0;
             while (i1 < 3 && !l) {
                i1 = i1 + 1;
                try{
                   MultiDexExtractor.extract(zipFile, entry, uExtractedDe, str);
                   uExtractedDe.crc = MultiDexExtractor.getZipCrc(uExtractedDe);
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
