package com.kwai.video.wayne.player.util.VodPlayerUtils;
import java.lang.Object;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.lang.reflect.Method;
import com.kwai.video.wayne.player.CacheKeyGenerator;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.Integer;
import java.util.List;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.lang.Number;
import android.content.Context;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.Display;
import java.io.File;
import android.content.pm.ApplicationInfo;
import java.lang.Runtime;
import java.lang.Process;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.security.MessageDigest;
import java.util.Objects;
import java.lang.IndexOutOfBoundsException;

public class VodPlayerUtils	// class@000dc4
{
    public static final char[] HEX_CHARS;
    public static CacheKeyGenerator mCacheKeyGenerator;
    public static String sVersion;
    public static String socName;

    static {
       VodPlayerUtils.HEX_CHARS = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       VodPlayerUtils.socName = null;
       VodPlayerUtils.sVersion = null;
    }
    public void VodPlayerUtils(){
       super();
    }
    public static void closeQuietly(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, VodPlayerUtils.class, "12")) {
          return;
       }
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static String fileTypeByUrl(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ".mp4";
       if (p0 != null && !TextUtils.isEmpty(p0)) {
          p0 = Uri.parse(p0).getPath();
          if (p0 == null) {
             return ".xxx";
          }else {
             int i = p0.lastIndexOf(46);
             String str = p0.substring(i);
             if (i >= 0 && i < (p0.length() - 2)) {
                obj = (str != null)? str.toLowerCase(): str;
             }
          }
       }
       return obj;
    }
    public static String getBoardPlatform(){
       String str = String.class;
       String obj = PatchProxy.apply(null, null, VodPlayerUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "unknown";
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{str,str};
          Object[] objArray = new Object[]{"ro.board.platform",obj};
          obj = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getCacheKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       if (VodPlayerUtils.mCacheKeyGenerator != null) {
          return VodPlayerUtils.mCacheKeyGenerator.getCacheKey(p0);
       }
       return CacheKeyUtil.getCacheKey(p0, false);
    }
    public static String getPropInfo(String p0){
       String str = String.class;
       String obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "unknown";
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{str,str};
          Object[] objArray = new Object[]{p0,obj};
          obj = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getQualityTypeFromRepId(KwaiManifest p0,int p1){
       String obj;
       VodPlayerUtils vodPlayerUti = VodPlayerUtils.class;
       if (PatchProxy.isSupport(vodPlayerUti)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, vodPlayerUti, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       KwaiManifest mAdaptationS = p0.mAdaptationSet;
       if (mAdaptationS != null && !mAdaptationS.isEmpty()) {
          Adaptation uAdaptation = p0.mAdaptationSet.get(0);
          Adaptation mRepresentat = uAdaptation.mRepresentation;
          if (mRepresentat != null && !mRepresentat.isEmpty()) {
             Iterator iterator = uAdaptation.mRepresentation.iterator();
             while (iterator.hasNext()) {
                Representation representati = iterator.next();
                if (representati.mId == p1) {
                   Representation mQualityType = representati.mQualityType;
                }
             }
          }
       }
       return obj;
    }
    public static int getRepIdFromQualityType(KwaiManifest p0,String p1){
       KwaiManifest obj = PatchProxy.applyTwoRefs(p0, p1, null, VodPlayerUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (TextUtils.isEmpty(p1)) {
          return i;
       }
       obj = p0.mAdaptationSet;
       if (obj != null && !obj.isEmpty()) {
          Adaptation uAdaptation = p0.mAdaptationSet.get(0);
          Adaptation mRepresentat = uAdaptation.mRepresentation;
          if (mRepresentat != null && !mRepresentat.isEmpty()) {
             Iterator iterator = uAdaptation.mRepresentation.iterator();
             while (iterator.hasNext()) {
                Representation representati = iterator.next();
                if ((representati.mQualityType).equals(p1)) {
                   i = representati.mId;
                }
             }
          }
       }
       return i;
    }
    public static int getScreenHeight(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(obj);
       return obj.heightPixels;
    }
    public static int getScreenWidth(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(obj);
       return obj.widthPixels;
    }
    public static String getSocName(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = VodPlayerUtils.socName;
       if (obj != null || p0 == null) {
          return obj;
       }
       VodPlayerUtils.socName = "UNKNOWN";
       String str = "libcpu-info.so";
       File uFile = new File(new File(p0.getFilesDir().getParentFile(), "lib"), str);
       if (!uFile.exists()) {
          uFile = new File(p0.getApplicationInfo().nativeLibraryDir, str);
       }
       Process process = Runtime.getRuntime().exec(uFile.getAbsolutePath());
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream()));
       String str1 = uBufferedRea.readLine();
       if (TextUtils.isEmpty(str1)) {
          process.destroy();
          VodPlayerUtils.closeQuietly(uBufferedRea);
          return VodPlayerUtils.socName;
       }else {
          int i = str1.indexOf(":");
          if (i < 0) {
             process.destroy();
             VodPlayerUtils.closeQuietly(uBufferedRea);
             return VodPlayerUtils.socName;
          }else {
             str1 = (str1.substring(i)).trim();
             VodPlayerUtils.socName = str1;
             process.destroy();
             VodPlayerUtils.closeQuietly(uBufferedRea);
             return str1;
          }
       }
    }
    public static String getSysVersion(){
       String obj = PatchProxy.apply(null, null, VodPlayerUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = VodPlayerUtils.getPropInfo("ro.build.display.id");
       VodPlayerUtils.sVersion = obj;
       if (TextUtils.isEmpty(obj)) {
          return "unknown";
       }
       return VodPlayerUtils.sVersion;
    }
    public static boolean isEmui(){
       Object obj = PatchProxy.apply(null, null, VodPlayerUtils.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(VodPlayerUtils.getPropInfo("ro.build.version.emui"))) {
          return false;
       }
       return true;
    }
    public static boolean isEmuiPreviousVersion(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = VodPlayerUtils.isEmui();
       String sysVersion = VodPlayerUtils.getSysVersion();
       String str = "\)";
       if (sysVersion.equals("unknown") || !b) {
          DebugLog.e("VodPlayerUtils", "Emui version unknown \("+sysVersion+"\)\("+b+str);
          return false;
       }else {
          int i = sysVersion.indexOf(" ");
          int i1 = sysVersion.indexOf("\(");
          if (i > 0 && (i1 <= 0 || i >= i1)) {
             DebugLog.e("VodPlayerUtils", "Emui info missing. \("+sysVersion+"\)\("+b+str);
             return false;
          }else {
             obj = (sysVersion.substring((i + 1), i1)).split("\\.");
             String[] stringArray = p0.split("\\.");
             DebugLog.e("VodPlayerUtils", "isEmuiLatestVersion\("+sysVersion+"\)\("+p0+"\), latest.length:"+stringArray.length+", temp.length:"+obj.length+", start:"+i+", end:"+i1);
             if (obj.length > 0 && obj.length == stringArray.length) {
                int i2 = 0;
                while (i2 < obj.length) {
                   if (Integer.parseInt(obj[i2]) < Integer.parseInt(stringArray[i2])) {
                      return true;
                   }
                   i2++;
                }
             }
             return false;
          }
       }
    }
    public static boolean isHttps(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       return (p0.toLowerCase()).startsWith("https:");
    }
    public static boolean isKirin(){
       String obj = PatchProxy.apply(null, null, VodPlayerUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = VodPlayerUtils.getPropInfo("ro.soc.model");
       if (TextUtils.isEmpty(obj)) {
          return false;
       }
       return obj.contains("kirin");
    }
    public static boolean isLocalVideoPhoto(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(p0) && ("file").equals(Uri.parse(p0).getScheme())) {
          return new File(Uri.parse(p0).getPath()).exists();
       }
       return false;
    }
    public static boolean isM3u8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       return (p0.toLowerCase()).contains(".m3u8");
    }
    public static boolean isNetworkPlayUrl(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VodPlayerUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if ((p0.toLowerCase()).startsWith("http:") || (p0.toLowerCase()).startsWith("https:")) {
          b = true;
       }
       return b;
    }
    public static String md5Hex(String p0){
       String str = null;
       MessageDigest obj = PatchProxy.applyOneRefs(p0, str, VodPlayerUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.length()) {
          return "";
       }
       obj = MessageDigest.getInstance("MD5");
       if (obj == null) {
          return str;
       }
       obj.update(p0.getBytes("UTF-8"));
       byte[] uobyteArray = obj.digest();
       if (uobyteArray != null && uobyteArray.length >= 1) {
          str = VodPlayerUtils.toHexString(uobyteArray, 0, uobyteArray.length);
       }
       return str;
    }
    public static void setCacheKeyGenerator(CacheKeyGenerator p0){
       VodPlayerUtils.mCacheKeyGenerator = p0;
    }
    public static String toHexString(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(VodPlayerUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, VodPlayerUtils.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(p0, "bytes is null");
       if (p1 >= 0 && (p1 + p2) <= p0.length) {
          int i = p2 * 2;
          char[] uocharArray = new char[i];
          int i2 = 0;
          for (int i1 = 0; i1 < p2; i1 = i1 + 1) {
             int i3 = i1 + p1;
             i3 = p0[i3] & 0x00ff;
             int i4 = i2 + 1;
             char[] hEX_CHARS = VodPlayerUtils.HEX_CHARS;
             int i5 = i3 >> 4;
             uocharArray[i2] = hEX_CHARS[i5];
             i2 = i4 + 1;
             i3 = i3 & 0x0f;
             uocharArray[i4] = hEX_CHARS[i3];
          }
          return new String(uocharArray, 0, i);
       }else {
          throw new IndexOutOfBoundsException();
       }
    }
}
