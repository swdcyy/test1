package com.kwai.video.ksuploaderkit.utils.FileUtils;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Exception;
import java.lang.Number;
import java.io.File;
import com.kwai.video.ksuploaderkit.utils.FileUtils$FileType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import java.lang.Boolean;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.io.RandomAccessFile;
import java.lang.Long;
import java.io.IOException;

public class FileUtils	// class@0009dd
{

    public void FileUtils(){
       super();
    }
    public static String getContentMD5(byte[] p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          p0 = MessageDigest.getInstance("MD5").digest(p0);
          obj = "";
          for (int i = 0; i < p0.length; i = i + 1) {
             int i1 = p0[i] & 0x00ff;
             i1 = i1 + 256;
             obj = obj+(Integer.toString(i1, 16)).substring(1);
          }
          return obj;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          return null;
       }
    }
    public static String getFileName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          int i = p0.lastIndexOf("/");
          if (i != -1) {
             return p0.substring((i + 1));
          }
       }
       return null;
    }
    public static String getFileNameSuffix(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          int i = p0.lastIndexOf(".");
          if (i != -1) {
             return p0.substring((i + 1));
          }
       }
       return null;
    }
    public static long getFileSize(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 == null) {
          return 0;
       }
       return new File(p0).length();
    }
    public static FileUtils$FileType getFileType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = FileUtils.getFileNameSuffix(p0);
       if (FileUtils.isVideo(p0)) {
          return FileUtils$FileType.Video;
       }
       if (FileUtils.isImage(p0)) {
          return FileUtils$FileType.Image;
       }
       return FileUtils$FileType.Unknown;
    }
    public static KSUploaderKitCommon$MediaType getMediaType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = FileUtils.getFileNameSuffix(p0);
       if (FileUtils.isVideo(p0)) {
          return KSUploaderKitCommon$MediaType.Video;
       }
       if (FileUtils.isImage(p0)) {
          return KSUploaderKitCommon$MediaType.Image;
       }
       return KSUploaderKitCommon$MediaType.File;
    }
    public static boolean isImage(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       obj = new String[]{"jpg","jpeg","png","kpg","bmp","gif","tif","webp"};
       return FileUtils.listContainsIgnoreCase(Arrays.asList(obj), p0);
    }
    public static boolean isVideo(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, FileUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       obj = new String[]{"mp4","fmp4","m4a","mov","mpg","rm","ts","flv","mkv","avi"};
       return FileUtils.listContainsIgnoreCase(Arrays.asList(obj), p0);
    }
    public static boolean listContainsIgnoreCase(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FileUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if ((iterator.next()).equalsIgnoreCase(p1)) {
             break ;
          }
       }
       return true;
    }
    public static int readData(RandomAccessFile p0,byte[] p1,long p2,int p3){
       if (PatchProxy.isSupport(FileUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Long.valueOf(p2), Integer.valueOf(p3), null, FileUtils.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          p0.seek(p2);
          return p0.read(p1, 0, p3);
       }catch(java.io.IOException e8){
          e8.printStackTrace();
          return -1;
       }
    }
}
