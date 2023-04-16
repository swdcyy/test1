package com.kwai.video.player.kwai_player.FileUtils;
import java.lang.Class;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import android.content.res.AssetManager;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.content.Context;
import java.lang.Exception;
import java.io.File;
import java.lang.Number;
import java.io.FileOutputStream;
import java.lang.Long;
import com.kwai.video.player.kwai_player.FileUtils$FileState;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Float;
import java.lang.Runtime;
import java.lang.Process;
import java.nio.channels.FileLock;
import java.lang.ref.WeakReference;
import android.os.Environment;
import android.os.StatFs;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.ArrayList;
import java.lang.SecurityManager;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.nio.channels.FileChannel;

public final class FileUtils	// class@000b2e
{
    public static final Class[] SIG_SET_PERMISSION;
    public static WeakReference exReference;

    static {
       Class tYPE;
       Class[] uClassArray = new Class[]{String.class,tYPE,tYPE,tYPE};
       tYPE = Integer.TYPE;
       FileUtils.SIG_SET_PERMISSION = uClassArray;
    }
    public void FileUtils(){
       super();
    }
    public static boolean assetExist(AssetManager p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          InputStream inputStream = SplitAssetHelper.open(p0, p1);
          try{
             int i = 1;
             inputStream.close();
             return i;
          }catch(java.lang.Exception e0){
          }
       }catch(java.io.IOException e0){
          try{
             throw null;
          }catch(java.lang.Exception e0){
             return false;
          }
       }
    }
    public static byte[] assetToBytes(Context p0,String p1){
       InputStream inputStream;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          inputStream = SplitAssetHelper.open(p0.getAssets(), p1);
          try{
             byte[] uobyteArray = new byte[inputStream.available()];
             try{
                inputStream.read(uobyteArray);
                inputStream.close();
                return uobyteArray;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e4){
          }
          try{
             FileUtils.setLastException(e4);
             inputStream.close();
             return null;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e4){
          inputStream = null;
          goto label_002b ;
       }
    }
    public static int assetToFile(Context p0,String p1,File p2){
       InputStream obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FileUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       try{
          obj = SplitAssetHelper.open(p0.getAssets(), p1);
          int i = FileUtils.streamToFile(p2, obj, false);
          try{
             obj.close();
             return i;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
          try{
             e0.close();
             return -1;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static int assetToFile(Context p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FileUtils.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FileUtils.assetToFile(p0, p1, new File(p2));
    }
    public static int assetToFileIfNotExist(Context p0,String p1,File p2){
       InputStream obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FileUtils.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       try{
          obj = SplitAssetHelper.open(p0.getAssets(), p1);
          if (!FileUtils.checkExistBySize(p2, (long)obj.available())) {
             int i = FileUtils.streamToFile(p2, obj, false);
             try{
                obj.close();
                return i;
             }catch(java.lang.Exception e0){
             }
          }else {
             try{
                obj.close();
                return false;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
          try{
             e0.close();
             return -1;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static String assetToString(Context p0,String p1){
       String str = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, str, FileUtils.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       byte[] uobyteArray = FileUtils.assetToBytes(p0, p1);
       if (uobyteArray != null) {
          str = new String(uobyteArray);
       }
       return str;
    }
    public static int bytesToFile(File p0,byte[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FileUtils.bytesToFile(p0, p1, 0, p1.length, 0);
    }
    public static int bytesToFile(File p0,byte[] p1,int p2,int p3,boolean p4){
       FileOutputStream uFileOutputS;
       FileUtils uFileUtils = FileUtils.class;
       if (PatchProxy.isSupport(uFileUtils)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uFileUtils, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       FileUtils.checkParentPath(p0);
       if (p1 == null) {
          return -1;
       }else if(p3 <= 0){
          p3 = p1.length;
       }
       try{
          try{
             uFileOutputS = new FileOutputStream(p0, p4);
             uFileOutputS.write(p1, p2, p3);
             try{
                uFileOutputS.flush();
                uFileOutputS.close();
                return 0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
             FileOutputStream uFileOutputS1 = uFileOutputS;
             try{
                null.close();
                return e0;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int bytesToFile(File p0,byte[] p1,boolean p2){
       if (PatchProxy.isSupport(FileUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, FileUtils.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return FileUtils.bytesToFile(p0, p1, 0, p1.length, p2);
    }
    public static int bytesToFile(String p0,byte[] p1,int p2,int p3,boolean p4){
       FileUtils uFileUtils = FileUtils.class;
       if (PatchProxy.isSupport(uFileUtils)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uFileUtils, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return FileUtils.bytesToFile(new File(p0), p1, p2, p3, p4);
    }
    public static boolean checkExistBySize(File p0,long p1){
       FileUtils uFileUtils = FileUtils.class;
       if (PatchProxy.isSupport(uFileUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uFileUtils, "44");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0.exists() && (!p0.isFile() || p0.length() - p1)) {
          return false;
       }else {
          return true;
       }
    }
    public static void checkParentPath(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FileUtils.class, "8")) {
          return;
       }
       p0 = p0.getParentFile();
       if (p0 != null && !p0.isDirectory()) {
          FileUtils.createDir(p0);
       }
       return;
    }
    public static void checkParentPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FileUtils.class, "7")) {
          return;
       }
       FileUtils.checkParentPath(new File(p0));
       return;
    }
    public static int copyTo(File p0,File p1){
       FileInputStream obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (FileUtils.fileState(p1) != FileUtils$FileState.FState_File) {
          return -1;
       }
       try{
          obj = new FileInputStream(p1);
          try{
             int i = 0;
             int i1 = FileUtils.streamToFile(p0, obj, i);
             try{
                obj.close();
                return i1;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
             FileInputStream uFileInputSt = e0;
             try{
                null.close();
                return -1;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int copyTo(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FileUtils.copyTo(new File(p0), new File(p1));
    }
    public static String coverSize(long p0){
       StringBuilder obj;
       String str;
       Object[] objArray1;
       FileUtils uFileUtils = FileUtils.class;
       if (PatchProxy.isSupport(uFileUtils)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uFileUtils, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = 1024;
       if (p0 - obj < 0) {
          str = p0+"b";
       }else if(p0 - 0x100000 < 0){
          Object[] objArray = new Object[]{Float.valueOf(((float)p0 / 1024.00f))};
          str = String.format(Locale.getDefault(), "%.1fK", objArray);
       }else if(p0 - 0x40000000 < 0){
          objArray1 = new Object[]{Float.valueOf(((float)(p0 / obj) / 1024.00f))};
          str = String.format(Locale.getDefault(), "%.1fM", objArray1);
       }else {
          objArray1 = new Object[]{Float.valueOf(((float)((p0 / obj) / obj) / 1024.00f))};
          str = String.format(Locale.getDefault(), "%.1fG", objArray1);
       }
       return str;
    }
    public static int createDir(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.exists()) {
          if (p0.isDirectory()) {
             return 0;
          }else {
             p0.delete();
          }
       }
       if (p0.mkdirs()) {
          return 0;
       }else {
          return -1;
       }
    }
    public static int createDir(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FileUtils.createDir(new File(p0));
    }
    public static boolean createLink(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       try{
          Object[] objArray = new Object[]{p0,p1};
          Process process = Runtime.getRuntime().exec(String.format("ln -s %s %s", objArray));
          InputStream inputStream = process.getInputStream();
          do {
          } while (inputStream.read() != -1);
          inputStream.close();
          process.waitFor();
          return 1;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static int deleteBlankPath(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new File(p0);
       if (!obj.canWrite()) {
          return 1;
       }
       if (obj.list() != null && obj.list().length > 0) {
          return 2;
       }
       if (obj.delete()) {
          return 0;
       }
       return 3;
    }
    public static FileUtils$FileState fileState(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists()) {
          return FileUtils$FileState.FState_None;
       }
       if (p0.isFile()) {
          return FileUtils$FileState.FState_File;
       }
       if (p0.isDirectory()) {
          return FileUtils$FileState.FState_Dir;
       }
       return FileUtils$FileState.FState_Other;
    }
    public static FileUtils$FileState fileState(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileUtils.fileState(new File(p0));
    }
    public static byte[] fileToBytes(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileUtils.fileToBytes(p0, 0, 0);
    }
    public static byte[] fileToBytes(File p0,int p1,int p2){
       if (PatchProxy.isSupport(FileUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, FileUtils.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (p2 < 0 || !p0.exists()) {
          }else {
             FileInputStream uFileInputSt = new FileInputStream(p0);
             if (!p2) {
                p2 = uFileInputSt.available();
             }
             byte[] uobyteArray = new byte[p2];
             try{
                uFileInputSt.read(uobyteArray, p1, p2);
                uFileInputSt.close();
                return uobyteArray;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
          InputStream inputStream = e0;
          try{
             inputStream.close();
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
       return null;
    }
    public static byte[] fileToBytes(String p0,int p1,int p2){
       if (PatchProxy.isSupport(FileUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, FileUtils.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return FileUtils.fileToBytes(new File(p0), p1, p2);
    }
    public static String fileToString(File p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, FileUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       byte[] uobyteArray = FileUtils.fileToBytes(p0);
       if (uobyteArray != null) {
          str = new String(uobyteArray);
       }
       return str;
    }
    public static void freeFileLock(FileLock p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FileUtils.class, "38")) {
          return;
       }
       if (p1 != null) {
          p1.delete();
       }
       try{
          if (p0 != null && p0.isValid()) {
             p0.release();
          }
       label_001d :
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static String getDirPathInPrivate(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getDir(p1, 0).getAbsolutePath()+File.separator;
    }
    public static Exception getLastException(){
       Object[] objArray = null;
       WeakReference obj = PatchProxy.apply(objArray, objArray, FileUtils.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FileUtils.exReference;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public static String getPathName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.substring((p0.lastIndexOf(File.separator) + 1), p0.length());
    }
    public static long getROMLeft(){
       Object obj = PatchProxy.apply(null, null, FileUtils.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
       statFs.getBlockCount();
       return ((long)statFs.getAvailableBlocks() * (long)statFs.getBlockSize());
    }
    public static long getSDLeftSpace(){
       StatFs obj = PatchProxy.apply(null, null, FileUtils.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!FileUtils.isSDMounted()) {
          return 0;
       }
       obj = new StatFs(Environment.getExternalStorageDirectory()+File.separator);
       return ((long)obj.getAvailableBlocks() * (long)obj.getBlockSize());
    }
    public static String getSDPath(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, FileUtils.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((Environment.getExternalStorageState()).equals("mounted")) {
          objArray = Environment.getExternalStorageDirectory();
       }
       return objArray.toString();
    }
    public static String getSDRoot(){
       Object obj = PatchProxy.apply(null, null, FileUtils.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Environment.getExternalStorageDirectory().getAbsolutePath()+File.separator;
    }
    public static String getSoPath(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getApplicationInfo().dataDir+"/lib/";
    }
    public static List getVideoFileName(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       File[] uFileArray = new File(p0).listFiles();
       int i = 0;
       while (i < uFileArray.length) {
          if (!uFileArray[i].isDirectory()) {
             String name = uFileArray[i].getName();
             if (((name.trim()).toLowerCase()).endsWith(".mp4")) {
                obj.add(name);
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public static boolean isFileExist(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new File(p0).exists();
    }
    public static boolean isSDAvailable(){
       File obj = PatchProxy.apply(null, null, FileUtils.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!FileUtils.isSDMounted()) {
          return false;
       }
       obj = Environment.getExternalStorageDirectory();
       if (!obj.canRead() || !obj.canWrite()) {
          return false;
       }
       return true;
    }
    public static boolean isSDAvailable(int p0){
       FileUtils uFileUtils = FileUtils.class;
       if (PatchProxy.isSupport(uFileUtils)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uFileUtils, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!FileUtils.isSDAvailable()) {
          return b;
       }else if(FileUtils.getSDLeftSpace() - (((long)p0 * 1024) * 1024) >= 0){
          b = true;
       }
       return b;
    }
    public static boolean isSDMounted(){
       Object obj = PatchProxy.apply(null, null, FileUtils.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (Environment.getExternalStorageState()).equals("mounted");
    }
    public static List listPath(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       File uFile = new File(p0);
       new SecurityManager().checkRead(p0);
       if (uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles();
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                obj.add(oobject.getAbsolutePath());
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public static void printLastException(){
       if (PatchProxy.applyVoid(null, null, FileUtils.class, "50")) {
          return;
       }
       Exception lastExceptio = FileUtils.getLastException();
       if (lastExceptio != null) {
          lastExceptio.printStackTrace();
       }
       return;
    }
    public static boolean reNamePath(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new File(p0).renameTo(new File(p1));
    }
    public static int removeDir(File p0){
       File[] obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (!p0.exists()) {
          return i;
       }
       if (p0.isDirectory()) {
          obj = p0.listFiles();
          if (obj != null) {
             int len = obj.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = obj[i1];
                if (oobject.isDirectory()) {
                   FileUtils.removeDir(oobject);
                }else {
                   oobject.delete();
                }
                i1 = i1 + 1;
             }
          }
       }
       if (!p0.delete()) {
          i = -1;
       }
       return i;
    }
    public static int removeDir(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FileUtils.removeDir(new File(p0));
    }
    public static void setLastException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FileUtils.class, "51")) {
          return;
       }
       FileUtils.exReference = new WeakReference(p0);
       return;
    }
    public static int setPermissions(String p0,int p1){
       FileUtils uFileUtils = FileUtils.class;
       if (PatchProxy.isSupport(uFileUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uFileUtils, "45");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return FileUtils.setPermissions(p0, p1, -1, -1);
    }
    public static int setPermissions(String p0,int p1,int p2,int p3){
       Method obj;
       if (PatchProxy.isSupport(FileUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, FileUtils.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          obj = Class.forName("android.os.FileUtils").getDeclaredMethod("setPermissions", FileUtils.SIG_SET_PERMISSION);
          obj.setAccessible(true);
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3)};
          return obj.invoke(null, objArray).intValue();
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
    public static ByteArrayOutputStream streamToByteArray(InputStream p0){
       byte[] obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 256;
       try{
          obj = new byte[i];
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          int i1 = p0.read(obj);
          while (i1 != -1) {
             uByteArrayOu.write(obj, 0, i1);
          }
          return uByteArrayOu;
       }catch(java.lang.Exception e5){
          FileUtils.setLastException(e5);
          return null;
       }
    }
    public static int streamToFile(File p0,InputStream p1,boolean p2){
       FileOutputStream obj;
       if (PatchProxy.isSupport(FileUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, FileUtils.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       FileUtils.checkParentPath(p0);
       try{
          int i = -1;
          FileOutputStream uFileOutputS = new FileOutputStream(p0, p2);
          try{
             int i1 = 0x8000;
             byte[] uobyteArray = new byte[i1];
             int i2 = p1.read(uobyteArray);
             while (i2 != i) {
                uFileOutputS.write(uobyteArray, 0, i2);
             }
             try{
                uFileOutputS.flush();
                uFileOutputS.close();
                return e0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
             obj = uFileOutputS;
             try{
                e0.close();
                return i;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int streamToFile(String p0,InputStream p1,boolean p2){
       if (PatchProxy.isSupport(FileUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, FileUtils.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return FileUtils.streamToFile(new File(p0), p1, p2);
    }
    public static String streamToString(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ByteArrayOutputStream uByteArrayOu = FileUtils.streamToByteArray(p0);
       if (uByteArrayOu != null) {
          return uByteArrayOu.toString();
       }
       return null;
    }
    public static int stringToFile(File p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FileUtils.bytesToFile(p0, p1.getBytes());
    }
    public static FileLock tryFileLock(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          FileUtils.checkParentPath(p0);
          FileLock uFileLock = new FileOutputStream(p0).getChannel().tryLock();
          if (uFileLock.isValid()) {
             return uFileLock;
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public static FileLock tryFileLock(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileUtils.tryFileLock(new File(p0));
    }
}
