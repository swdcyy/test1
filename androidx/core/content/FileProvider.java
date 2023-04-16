package androidx.core.content.FileProvider;
import android.content.ContentProvider;
import java.lang.String;
import java.io.File;
import java.util.HashMap;
import java.lang.Object;
import java.lang.System;
import android.content.Context;
import androidx.core.content.FileProvider$a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.net.Uri;
import android.net.Uri$Builder;
import java.lang.StringBuilder;
import androidx.core.content.FileProvider$b;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Environment;
import androidx.core.content.ContextCompat;
import java.lang.SecurityException;
import com.kuaishou.webkit.MimeTypeMap;
import android.content.ContentValues;
import java.lang.UnsupportedOperationException;
import android.os.ParcelFileDescriptor;
import android.database.Cursor;
import java.lang.Long;
import android.database.MatrixCursor;

public class FileProvider extends ContentProvider	// class@00070e
{
    public String mAuthority;
    public FileProvider$a mStrategy;
    public static final String[] COLUMNS;
    public static final File DEVICE_ROOT;
    public static HashMap sCache;

    static {
       String[] stringArray = new String[]{"_display_name","_size"};
       FileProvider.COLUMNS = stringArray;
       FileProvider.DEVICE_ROOT = new File("/");
       FileProvider.sCache = new HashMap();
    }
    public void FileProvider(){
       super();
    }
    public static File buildPath(File p0,String[] p1){
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (oobject != null) {
             p0 = new File(p0, oobject);
          }
          i = i + 1;
       }
       return p0;
    }
    public static Object[] copyOf(Object[] p0,int p1){
       Object[] objArray = new Object[p1];
       System.arraycopy(p0, 0, objArray, 0, p1);
       return objArray;
    }
    public static String[] copyOf(String[] p0,int p1){
       String[] stringArray = new String[p1];
       System.arraycopy(p0, 0, stringArray, 0, p1);
       return stringArray;
    }
    public static FileProvider$a getPathStrategy(Context p0,String p1){
       HashMap sCache = FileProvider.sCache;
       _monitor_enter(sCache);
       FileProvider$a uoa = FileProvider.sCache.get(p1);
       if (uoa == null) {
          try{
             uoa = FileProvider.parsePathStrategy(p0, p1);
             FileProvider.sCache.put(p1, uoa);
          }catch(java.io.IOException e2){
             throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
          }catch(org.xmlpull.v1.XmlPullParserException e2){
             throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
          }
       }
       _monitor_exit(sCache);
       return uoa;
    }
    public static Uri getUriForFile(Context p0,String p1,File p2){
       return FileProvider.getPathStrategy(p0, p1).a(p2);
    }
    public static Uri getUriForFile(Context p0,String p1,File p2,String p3){
       return FileProvider.getUriForFile(p0, p1, p2).buildUpon().appendQueryParameter("displayName", p3).build();
    }
    public static int modeToMode(String p0){
       int i;
       if (("r").equals(p0)) {
          i = 0x10000000;
       }else if(("w").equals(p0) || ("wt").equals(p0)){
          i = 0x2c000000;
       }else if(("wa").equals(p0)){
          i = 0x2a000000;
       }else if(("rw").equals(p0)){
          i = 0x38000000;
       }else if(("rwt").equals(p0)){
          i = 0x3c000000;
       }else {
          throw new IllegalArgumentException("Invalid mode: "+p0);
       }
       return i;
    }
    public static FileProvider$a parsePathStrategy(Context p0,String p1){
       File[] externalFile;
       FileProvider$b uob = new FileProvider$b(p1);
       ProviderInfo providerInfo = p0.getPackageManager().resolveContentProvider(p1, 128);
       if (providerInfo == null) {
          throw new IllegalArgumentException("Couldn\'t find meta-data for provider with authority "+p1);
       }
       XmlResourceParser xmlResourceP = providerInfo.loadXmlMetaData(p0.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
       if (xmlResourceP == null) {
       label_00b0 :
          throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
       }
       int i = xmlResourceP.next();
       while (i != 1) {
          if (i == 2) {
             String name = xmlResourceP.getName();
             String str = null;
             String attributeVal = xmlResourceP.getAttributeValue(str, "name");
             String attributeVal1 = xmlResourceP.getAttributeValue(str, "path");
             if (("root-path").equals(name)) {
                str = FileProvider.DEVICE_ROOT;
             }else if(("files-path").equals(name)){
                str = p0.getFilesDir();
             }else if(("cache-path").equals(name)){
                str = p0.getCacheDir();
             }else if(("external-path").equals(name)){
                str = Environment.getExternalStorageDirectory();
             }else if(("external-files-path").equals(name)){
                externalFile = ContextCompat.getExternalFilesDirs(p0, str);
                if (externalFile.length > 0) {
                   str = externalFile[0];
                }
             }else if(("external-cache-path").equals(name)){
                externalFile = ContextCompat.getExternalCacheDirs(p0);
                if (externalFile.length > 0) {
                   str = externalFile[0];
                }
             }else if(("external-media-path").equals(name)){
                externalFile = p0.getExternalMediaDirs();
                if (externalFile.length > 0) {
                   str = externalFile[0];
                }
             }
             if (str != null) {
                String[] stringArray = new String[]{attributeVal1};
                uob.c(attributeVal, FileProvider.buildPath(str, stringArray));
             }
          }
       }
       return uob;
    }
    public void attachInfo(Context p0,ProviderInfo p1){
       super.attachInfo(p0, p1);
       if (p1.exported != null) {
          throw new SecurityException("Provider must not be exported");
       }
       if (p1.grantUriPermissions == null) {
          throw new SecurityException("Provider must grant uri permissions");
       }
       this.mAuthority = (p1.authority).split(";")[0];
       return;
    }
    public int delete(Uri p0,String p1,String[] p2){
       this.initPathStrategyIfNecessary();
       return this.mStrategy.b(p0).delete();
    }
    public String getType(Uri p0){
       this.initPathStrategyIfNecessary();
       File uFile = this.mStrategy.b(p0);
       int i = (uFile.getName()).lastIndexOf(46);
       if (i >= 0) {
          String mimeTypeFrom = MimeTypeMap.getSingleton().getMimeTypeFromExtension((uFile.getName()).substring((i + 1)));
          if (mimeTypeFrom != null) {
             return mimeTypeFrom;
          }
       }
       return "application/octet-stream";
    }
    public final void initPathStrategyIfNecessary(){
       if (this.mStrategy == null) {
          _monitor_enter(this);
          if (this.mStrategy == null) {
             this.mStrategy = FileProvider.getPathStrategy(this.getContext(), this.mAuthority);
          }
          _monitor_exit(this);
       }
       return;
    }
    public Uri insert(Uri p0,ContentValues p1){
       throw new UnsupportedOperationException("No external inserts");
    }
    public boolean onCreate(){
       return true;
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       this.initPathStrategyIfNecessary();
       return ParcelFileDescriptor.open(this.mStrategy.b(p0), FileProvider.modeToMode(p1));
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       int i2;
       this.initPathStrategyIfNecessary();
       File uFile = this.mStrategy.b(p0);
       String queryParamet = p0.getQueryParameter("displayName");
       if (p1 == null) {
          p1 = FileProvider.COLUMNS;
       }
       p3 = new String[p1.length];
       Object[] objArray = new Object[p1.length];
       int len = p1.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          object oobject = p1[i];
          String str = "_display_name";
          if (str.equals(oobject)) {
             p3[i1] = str;
             i2 = i1 + 1;
             str = (queryParamet == null)? uFile.getName(): queryParamet;
             objArray[i1] = str;
          }else {
             str = "_size";
             if (str.equals(oobject)) {
                p3[i1] = str;
                i2 = i1 + 1;
                objArray[i1] = Long.valueOf(uFile.length());
             }
          }
          i1 = i2;
       label_004e :
          i = i + 1;
       }
       MatrixCursor matrixCursor = new MatrixCursor(FileProvider.copyOf(p3, i1), 1);
       matrixCursor.addRow(FileProvider.copyOf(objArray, i1));
       return matrixCursor;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       throw new UnsupportedOperationException("No external updates");
    }
}
