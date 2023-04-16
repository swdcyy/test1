package aegon.chrome.base.PathUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.FutureTask;
import a0.s;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import a0.f;
import android.os.Environment;
import java.util.Arrays;
import android.os.Build$VERSION;
import java.util.Set;
import android.provider.MediaStore;
import android.os.storage.StorageManager;
import java.lang.Class;
import android.net.Uri;
import android.provider.MediaStore$Files;
import android.os.storage.StorageVolume;
import android.content.pm.ApplicationInfo;

public abstract class PathUtils	// class@00014c
{
    public static final AtomicBoolean a;
    public static FutureTask b;
    public static String c;
    public static String d;
    public static final boolean e;

    static {
       PathUtils.a = new AtomicBoolean();
    }
    public void PathUtils(){
       super();
    }
    public static String a(int p0){
       if (!PathUtils.b.isDone()) {
          PathUtils.b.run();
          s.c().close();
       }
       try{
          return PathUtils.b.get()[p0];
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
    }
    public static String[] b(List p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          if (uFile == null || TextUtils.isEmpty(uFile.getAbsolutePath())) {
             continue ;
          }else {
             uArrayList.add(uFile.getAbsolutePath());
          }
       }
       String[] stringArray = new String[uArrayList.size()];
       return uArrayList.toArray(stringArray);
    }
    public static String[] getAllPrivateDownloadsDirectories(){
       ArrayList uArrayList = new ArrayList();
       s os = s.c();
       File[] externalFile = f.a().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
       if (externalFile == null) {
       }else {
          uArrayList = Arrays.asList(externalFile);
       }
       os.close();
       return PathUtils.b(uArrayList);
    }
    public static String getCacheDirectory(){
       return PathUtils.a(2);
    }
    public static String getDataDirectory(){
       return PathUtils.a(0);
    }
    public static String getDownloadsDirectory(){
       s os = s.a();
       if (Build$VERSION.SDK_INT >= 29) {
          String[] allPrivateDo = PathUtils.getAllPrivateDownloadsDirectories();
          String str = (!allPrivateDo.length)? "": allPrivateDo[0];
          os.close();
          return str;
       }else {
          os.close();
          return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
       }
    }
    public static String[] getExternalDownloadVolumesNames(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = MediaStore.getExternalVolumeNames(f.a()).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
             uArrayList.add(new File(f.a().getSystemService(StorageManager.class).getStorageVolume(MediaStore$Files.getContentUri(str)).getDirectory().getAbsolutePath(), Environment.DIRECTORY_DOWNLOADS));
          }
       }
       return PathUtils.b(uArrayList);
    }
    public static String getExternalStorageDirectory(){
       return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    public static String getNativeLibraryDirectory(){
       ApplicationInfo applicationI = f.a().getApplicationInfo();
       ApplicationInfo flags = applicationI.flags;
       if ((flags & 0x0080) || !(flags & 0x01)) {
          return applicationI.nativeLibraryDir;
       }
       return "/system/lib/";
    }
    public static String getThumbnailCacheDirectory(){
       return PathUtils.a(1);
    }
}
