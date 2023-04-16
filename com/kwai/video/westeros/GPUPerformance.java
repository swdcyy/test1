package com.kwai.video.westeros.GPUPerformance;
import java.util.Map;
import java.lang.Object;
import com.kwai.video.westeros.GPUPerformance$Level;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import com.kwai.camerasdk.render.OpengGL.EglBase;
import android.opengl.GLES20;
import java.lang.CharSequence;
import java.lang.Exception;
import java.util.HashMap;

public class GPUPerformance	// class@000e5e
{
    public static String GPU_HARDWARE_STRING = "Adreno \(TM\) 130,1;Adreno \(TM\) 200,2;Adreno \(TM\) 203,7;Adreno \(TM\) 205,8;Adreno \(TM\) 220,17;Adreno \(TM\) 225,12;Adreno \(TM\) 302,19;Adreno \(TM\) 304,19;Adreno \(TM\) 305,19;Adreno \(TM\) 306,21;Adreno \(TM\) 308,27;Adreno \(TM\) 320,57;Adreno \(TM\) 330,129;Adreno \(TM\) 405,59;Adreno \(TM\) 418,172;Adreno \(TM\) 420,144;Adreno \(TM\) 430,324;Adreno \(TM\) 505,48;Adreno \(TM\) 506,120;Adreno \(TM\) 508,160;Adreno \(TM\) 510,180;Adreno \(TM\) 512,240;Adreno \(TM\) 530,407;Adreno \(TM\) 540,567;Adreno \(TM\) 608,600;Adreno \(TM\) 615,600;Adreno \(TM\) 630,600;Mali-400 MP,5;Mali-400 MP2,10;Mali-400 MP4,20;Mali-450,5;Mali-450 MP2,15;Mali-450 MP3,34;Mali-450 MP4,40;Mali-450 MP6,53;Mali-450 MP8,71;Mali-T604,17;Mali-T604 MP2,34;Mali-T604 MP4,68;Mali-T622,9;Mali-T624,17;Mali-T624 MP4,77;Mali-T628,17;Mali-T628 MP2,38;Mali-T628 MP3,51;Mali-T628 MP4,97;Mali-T628 MP6,102;Mali-T720,8;Mali-T720 MP2,15;Mali-T720 MP3,35;Mali-T720 MP6,70;Mali-T720 MP8,80;Mali-T760,20;Mali-T760 MP2,34;Mali-T760 MP4,75;Mali-T760 MP6,142;Mali-T760 MP8,210;Mali-T820,10;Mali-T820 MP3,30;Mali-T830,20;Mali-T830 MP2,44;Mali-T830 MP3,71;Mali-T860,23;Mali-T860 MP2,23;Mali-T860 MP3,71;Mali-T860 MP4,81;Mali-T880,28;Mali-T880 MP,50;Mali-T880 MP2,61;Mali-T880 MP4,106;Mali-T880 MP10,221;Mali-G71,28;Mali-G71 MP2,52;Mali-G71 MP8,282;Mali-G71 MP12,367;Mali-G71 MP18,334;Mali-G71 MP20,371;Mali-G72,28;Mali-G72,100;Mali-G72 MP12,346;Apple A5 GPU,12;Apple A6 GPU,25;Apple A5X GPU,32;Apple A6X GPU,68;Apple A7 GPU,115;Apple A8 GPU,115;Apple A8X GPU,230;Apple A9 GPU,172;Apple A10 GPU,250;Apple A9X GPU,409;Apple A10X GPU,500;Apple A11 GPU,350;Apple A12 GPU,500;Apple A12X GPU,800";
    public static Map mGPUHardwareList;
    public static int mScoreForThisDevice;
    public static boolean mScoreInTable;
    public static String mThisGLRenderer;

    static {
       GPUPerformance.mGPUHardwareList = GPUPerformance.initChipSetLevelMap();
    }
    public void GPUPerformance(){
       super();
    }
    public static GPUPerformance$Level convertScoreToLevel(int p0){
       if (!p0) {
          return GPUPerformance$Level.unknown;
       }
       if (p0 < 50) {
          return GPUPerformance$Level.bad;
       }
       if (p0 < 100) {
          return GPUPerformance$Level.low;
       }
       if (p0 < 200) {
          return GPUPerformance$Level.medium;
       }
       if (p0 < 500) {
          return GPUPerformance$Level.high;
       }
       return GPUPerformance$Level.best;
    }
    public static int getDeviceGPUScore(){
       Object obj = PatchProxy.apply(null, null, GPUPerformance.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int mScoreForThi = GPUPerformance.mScoreForThisDevice;
       if (mScoreForThi >= 0) {
          return mScoreForThi;
       }
       mScoreForThi = GPUPerformance.getDeviceGPUScore(GPUPerformance.getRenderer());
       GPUPerformance.mScoreForThisDevice = mScoreForThi;
       return mScoreForThi;
    }
    public static int getDeviceGPUScore(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GPUPerformance.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       p0 = p0.toLowerCase();
       Integer integer = GPUPerformance.mGPUHardwareList.get(p0);
       if (integer != null) {
          GPUPerformance.mScoreInTable = true;
          return integer.intValue();
       }else {
          GPUPerformance.mScoreInTable = i;
          GPUPerformance$Level level = GPUPerformance.guessDeviceGPULevel(p0);
          if (level == GPUPerformance$Level.bad) {
             return 50;
          }
          if (level == GPUPerformance$Level.low) {
             return 100;
          }
          if (level == GPUPerformance$Level.high) {
             return 300;
          }
          if (level == GPUPerformance$Level.best) {
             return 500;
          }
          return 200;
       }
    }
    public static Map getGPUHardwareList(){
       return GPUPerformance.mGPUHardwareList;
    }
    public static String getRenderer(){
       GL10 gL;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, GPUPerformance.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = GPUPerformance.mThisGLRenderer;
       if (obj != null) {
          return obj;
       }
       EGL10 eGL = EGLContext.getEGL();
       Object[] objArray1 = (eGL == null)? objArray: eGL.eglGetCurrentContext();
       objArray1 = (objArray1 == null || objArray1 == EGL10.EGL_NO_CONTEXT)? objArray: objArray1.getGL();
       if (objArray1 != null) {
          objArray = objArray1.glGetString(7937);
       }
       if (objArray == null) {
          EglBase uEglBase = EglBase.a();
          uEglBase.d();
          uEglBase.k();
          objArray = GLES20.glGetString(7937);
          uEglBase.l();
       }
       GPUPerformance.mThisGLRenderer = objArray;
       return objArray;
    }
    public static GPUPerformance$Level guessDeviceGPULevel(String p0){
       int i1;
       int i2;
       String obj = PatchProxy.applyOneRefs(p0, null, GPUPerformance.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return GPUPerformance$Level.unknown;
       }
       p0 = p0.toLowerCase();
       try{
          String str = 5;
          boolean b = 6;
          String str1 = "$2";
          int i = 10;
          if (p0.contains("adreno")) {
             i1 = Integer.valueOf(p0.replaceAll("adreno\([^\\d]*\)\(\\d*\)\(.*\)", str1)).intValue();
             i2 = i1 / 100;
             i1 = (i1 / i) % i;
             if (i2 >= b || (i2 >= str && i1 >= 3)) {
                return GPUPerformance$Level.best;
             }else if(i2 >= 4 && i1 >= 1){
                return GPUPerformance$Level.high;
             }else if(i1 >= 3 || i2 >= str){
                return GPUPerformance$Level.medium;
             }else {
                return GPUPerformance$Level.low;
             }
          }else if(p0.contains("mali")){
             obj = "mali-\([a-z]*\)\(\\d*\)\(.*\)";
             str = p0.replaceAll(obj, "$1");
             if (str.isEmpty()) {
                return GPUPerformance$Level.low;
             }
             String str2 = p0.replaceAll("mali-\([a-z]*\)\(\\d*\)\([ \\t]*\)mp\(\\d*\)\(.*\)", "$4");
             i2 = Integer.valueOf(p0.replaceAll(obj, str1)).intValue() / 100;
             i1 = (str2.isEmpty() || str2.equalsIgnoreCase(p0))? 0: Integer.valueOf(str2).intValue();
             if (str.equalsIgnoreCase("t")) {
                if (i2 >= 8 && i1 >= i) {
                   return GPUPerformance$Level.high;
                }else if(i2 >= 7 && i1 >= 4){
                   return GPUPerformance$Level.medium;
                }else {
                   return GPUPerformance$Level.low;
                }
             }else if(str.equalsIgnoreCase("g")){
                if (i2 >= 7 && i1 >= 8) {
                   return GPUPerformance$Level.high;
                }else if(i2 >= 7 || i1 >= 8){
                   return GPUPerformance$Level.medium;
                }else {
                   return GPUPerformance$Level.low;
                }
             }else {
                return GPUPerformance$Level.low;
             }
          }else if(p0.contains("powervr")){
             i2 = Integer.valueOf(p0.replaceAll("powervr\([^\\d]*\)\(\\d*\)\(.*\)", str1)).intValue();
             int i3 = (i2 / 100) % i;
             if (p0.contains("sgx")) {
                return GPUPerformance$Level.bad;
             }
             if (p0.contains("rogue") || (i2 / 1000) == b) {
                if (!i3) {
                   return GPUPerformance$Level.bad;
                }
                if (i3 <= 2) {
                   return GPUPerformance$Level.low;
                }
                if (i3 <= 4) {
                   return GPUPerformance$Level.medium;
                }
                return GPUPerformance$Level.high;
             }else if(p0.contains("ge")){
                if ((i2 / 1000) <= 7 || i3 <= 2) {
                   return GPUPerformance$Level.bad;
                }
                if (i3 >= 4) {
                   return GPUPerformance$Level.medium;
                }
                return GPUPerformance$Level.low;
             }else if(p0.contains("gt")){
                if (i3 >= b) {
                   return GPUPerformance$Level.best;
                }
                if (i3 >= str) {
                   return GPUPerformance$Level.high;
                }
                if (i3 <= 2) {
                   return GPUPerformance$Level.low;
                }
                return GPUPerformance$Level.medium;
             }else if(p0.contains("gx")){
                if (i3 <= 2) {
                   return GPUPerformance$Level.low;
                }
                if (i3 <= 4) {
                   return GPUPerformance$Level.medium;
                }
                return GPUPerformance$Level.high;
             }else {
                return GPUPerformance$Level.medium;
             }
          }else if(p0.contains("apple")){
             return GPUPerformance$Level.medium;
          }else {
             return GPUPerformance$Level.unknown;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          return GPUPerformance$Level.medium;
       }
    }
    public static Map initChipSetLevelMap(){
       HashMap obj = PatchProxy.apply(null, null, GPUPerformance.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (GPUPerformance.GPU_HARDWARE_STRING == null) {
          return obj;
       }
       GPUPerformance.setupDefaultRenderers(obj);
       String[] stringArray = (GPUPerformance.GPU_HARDWARE_STRING).split(";");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          if (oobject != null && oobject.length()) {
             String[] stringArray1 = oobject.split(",");
             if (stringArray1 != null && stringArray1.length == 2) {
                int i1 = 1;
                if (obj.containsKey((stringArray1[0]).toLowerCase())) {
                   obj.get((stringArray1[0]).toLowerCase()).intValue();
                   Integer.valueOf(stringArray1[i1]).intValue();
                }else {
                   (stringArray1[0]).toLowerCase();
                }
                obj.put((stringArray1[0]).toLowerCase(), Integer.valueOf(stringArray1[i1]));
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public static boolean scoreInTable(){
       return GPUPerformance.mScoreInTable;
    }
    public static void setGPUHardwarList(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, GPUPerformance.class, "3")) {
          return;
       }
       GPUPerformance.GPU_HARDWARE_STRING = p0;
       GPUPerformance.mGPUHardwareList = GPUPerformance.initChipSetLevelMap();
       return;
    }
    public static void setupDefaultRenderers(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, GPUPerformance.class, "1")) {
          return;
       }
       p0.put("adreno \(tm\) 130", Integer.valueOf(1));
       p0.put("adreno \(tm\) 200", Integer.valueOf(3));
       p0.put("adreno \(tm\) 203", Integer.valueOf(8));
       p0.put("adreno \(tm\) 205", Integer.valueOf(8));
       p0.put("adreno \(tm\) 220", Integer.valueOf(17));
       p0.put("adreno \(tm\) 225", Integer.valueOf(19));
       p0.put("adreno \(tm\) 302", Integer.valueOf(19));
       p0.put("adreno \(tm\) 304", Integer.valueOf(19));
       p0.put("adreno \(tm\) 305", Integer.valueOf(20));
       p0.put("adreno \(tm\) 306", Integer.valueOf(21));
       p0.put("adreno \(tm\) 308", Integer.valueOf(27));
       p0.put("adreno \(tm\) 320", Integer.valueOf(80));
       p0.put("adreno \(tm\) 330", Integer.valueOf(151));
       p0.put("adreno \(tm\) 405", Integer.valueOf(59));
       p0.put("adreno \(tm\) 418", Integer.valueOf(172));
       p0.put("adreno \(tm\) 420", Integer.valueOf(158));
       p0.put("adreno \(tm\) 430", Integer.valueOf(372));
       p0.put("adreno \(tm\) 505", Integer.valueOf(48));
       p0.put("adreno \(tm\) 506", Integer.valueOf(125));
       p0.put("adreno \(tm\) 508", Integer.valueOf(160));
       p0.put("adreno \(tm\) 510", Integer.valueOf(180));
       p0.put("adreno \(tm\) 512", Integer.valueOf(240));
       p0.put("adreno \(tm\) 530", Integer.valueOf(486));
       p0.put("adreno \(tm\) 540", Integer.valueOf(567));
       p0.put("bonaire xt", Integer.valueOf(1792));
       p0.put("cape verde pro", Integer.valueOf(870));
       p0.put("cape verde xt", Integer.valueOf(1344));
       p0.put("dreamcast", Integer.valueOf(2));
       p0.put("g6020", Integer.valueOf(4));
       p0.put("g6050", Integer.valueOf(9));
       p0.put("g6060", Integer.valueOf(9));
       p0.put("g6100", Integer.valueOf(38));
       p0.put("g6110", Integer.valueOf(38));
       p0.put("g6200", Integer.valueOf(73));
       p0.put("g6230", Integer.valueOf(72));
       p0.put("g6400", Integer.valueOf(122));
       p0.put("g6430", Integer.valueOf(121));
       p0.put("g6630", Integer.valueOf(201));
       p0.put("gamecube", Integer.valueOf(9));
       p0.put("gc1000", Integer.valueOf(9));
       p0.put("gc1000 plus", Integer.valueOf(10));
       p0.put("gc2000", Integer.valueOf(19));
       p0.put("gc3000", Integer.valueOf(32));
       p0.put("gc4000", Integer.valueOf(30));
       p0.put("gc500", Integer.valueOf(0));
       p0.put("gc5000", Integer.valueOf(64));
       p0.put("gc6000", Integer.valueOf(128));
       p0.put("gc7000", Integer.valueOf(64));
       p0.put("gc7000l", Integer.valueOf(32));
       p0.put("gc7000ul", Integer.valueOf(16));
       p0.put("gc7200", Integer.valueOf(128));
       p0.put("gc7400", Integer.valueOf(256));
       p0.put("gc7600", Integer.valueOf(512));
       p0.put("gc800", Integer.valueOf(4));
       p0.put("gc8000", Integer.valueOf(0));
       p0.put("ge7400", Integer.valueOf(19));
       p0.put("ge7800", Integer.valueOf(38));
       p0.put("geforce ulp x 12", Integer.valueOf(11));
       p0.put("geforce ulp x 60", Integer.valueOf(79));
       p0.put("geforce ulp x 72", Integer.valueOf(96));
       p0.put("geforce ulp x 8", Integer.valueOf(5));
       p0.put("gk104", Integer.valueOf(2823));
       p0.put("gk106", Integer.valueOf(1604));
       p0.put("gk107", Integer.valueOf(751));
       p0.put("gk110", Integer.valueOf(4500));
       p0.put("gma 4500 series", Integer.valueOf(26));
       p0.put("gt7200", Integer.valueOf(83));
       p0.put("gt7400", Integer.valueOf(166));
       p0.put("gt7400 plus", Integer.valueOf(204));
       p0.put("gt7600", Integer.valueOf(172));
       p0.put("gt7600 plus", Integer.valueOf(249));
       p0.put("gt7800", Integer.valueOf(416));
       p0.put("gt7800+", Integer.valueOf(345));
       p0.put("gt7900", Integer.valueOf(742));
       p0.put("gt8525", Integer.valueOf(192));
       p0.put("gx6240", Integer.valueOf(83));
       p0.put("gx6250", Integer.valueOf(87));
       p0.put("gx6450", Integer.valueOf(134));
       p0.put("gx6650", Integer.valueOf(230));
       p0.put("gx6850", Integer.valueOf(268));
       p0.put("hd graphics", Integer.valueOf(95));
       p0.put("hd graphics \(broadwell\)", Integer.valueOf(158));
       p0.put("hd graphics 3000", Integer.valueOf(112));
       p0.put("hd graphics 4000", Integer.valueOf(275));
       p0.put("hd graphics 405", Integer.valueOf(213));
       p0.put("hd graphics 4200", Integer.valueOf(352));
       p0.put("hd graphics 4400", Integer.valueOf(235));
       p0.put("hd graphics 4400 \(mobile\)", Integer.valueOf(352));
       p0.put("hd graphics 4600", Integer.valueOf(352));
       p0.put("hd graphics 500", Integer.valueOf(134));
       p0.put("hd graphics 5000", Integer.valueOf(672));
       p0.put("hd graphics 505", Integer.valueOf(223));
       p0.put("hd graphics 510", Integer.valueOf(182));
       p0.put("hd graphics 515", Integer.valueOf(345));
       p0.put("hd graphics 520", Integer.valueOf(393));
       p0.put("hd graphics 530", Integer.valueOf(393));
       p0.put("hd graphics 5300", Integer.valueOf(316));
       p0.put("hd graphics 5500", Integer.valueOf(338));
       p0.put("hd graphics 5600", Integer.valueOf(393));
       p0.put("hd graphics 6000", Integer.valueOf(748));
       p0.put("hd graphics 610", Integer.valueOf(187));
       p0.put("hd graphics 615", Integer.valueOf(364));
       p0.put("hd graphics 620", Integer.valueOf(412));
       p0.put("hd graphics 630", Integer.valueOf(403));
       p0.put("hd graphics p4600", Integer.valueOf(352));
       p0.put("iris graphics 540", Integer.valueOf(787));
       p0.put("iris graphics 550", Integer.valueOf(787));
       p0.put("iris graphics 6100", Integer.valueOf(825));
       p0.put("iris plus graphics 640", Integer.valueOf(806));
       p0.put("iris plus graphics 650", Integer.valueOf(806));
       p0.put("iris pro 5200", Integer.valueOf(800));
       p0.put("iris pro graphics 580", Integer.valueOf(1152));
       p0.put("iris pro graphics 6200", Integer.valueOf(825));
       p0.put("iris pro graphics p580", Integer.valueOf(1152));
       p0.put("iris pro graphics p6300", Integer.valueOf(825));
       p0.put("kepler cores x 192", Integer.valueOf(326));
       p0.put("mali-400", Integer.valueOf(3));
       p0.put("mali-400 mp2", Integer.valueOf(7));
       p0.put("mali-400 mp4", Integer.valueOf(15));
       p0.put("mali-450", Integer.valueOf(4));
       p0.put("mali-450 mp2", Integer.valueOf(13));
       p0.put("mali-450 mp3", Integer.valueOf(33));
       p0.put("mali-450 mp4", Integer.valueOf(32));
       p0.put("mali-450 mp6", Integer.valueOf(53));
       p0.put("mali-450 mp8", Integer.valueOf(71));
       p0.put("mali-g71", Integer.valueOf(28));
       p0.put("mali-g71 mp12", Integer.valueOf(367));
       p0.put("mali-g71 mp18", Integer.valueOf(334));
       p0.put("mali-g71 mp2", Integer.valueOf(58));
       p0.put("mali-g71 mp20", Integer.valueOf(371));
       p0.put("mali-g71 mp8", Integer.valueOf(282));
       p0.put("mali-g72", Integer.valueOf(28));
       p0.put("mali-g72 mp12", Integer.valueOf(346));
       p0.put("mali-t604", Integer.valueOf(17));
       p0.put("mali-t604 mp2", Integer.valueOf(34));
       p0.put("mali-t604 mp4", Integer.valueOf(68));
       p0.put("mali-t622", Integer.valueOf(8));
       p0.put("mali-t624", Integer.valueOf(17));
       p0.put("mali-t624 mp4", Integer.valueOf(76));
       p0.put("mali-t628", Integer.valueOf(17));
       p0.put("mali-t628 mp2", Integer.valueOf(38));
       p0.put("mali-t628 mp3", Integer.valueOf(51));
       p0.put("mali-t628 mp4", Integer.valueOf(87));
       p0.put("mali-t628 mp6", Integer.valueOf(108));
       p0.put("mali-t720", Integer.valueOf(7));
       p0.put("mali-t720 mp", Integer.valueOf(103));
       p0.put("mali-t720 mp2", Integer.valueOf(18));
       p0.put("mali-t720 mp3", Integer.valueOf(35));
       p0.put("mali-t720 mp8", Integer.valueOf(81));
       p0.put("mali-t760", Integer.valueOf(20));
       p0.put("mali-t760 mp2", Integer.valueOf(40));
       p0.put("mali-t760 mp4", Integer.valueOf(78));
       p0.put("mali-t760 mp6", Integer.valueOf(142));
       p0.put("mali-t760 mp8", Integer.valueOf(210));
       p0.put("mali-t820", Integer.valueOf(10));
       p0.put("mali-t820 mp3", Integer.valueOf(30));
       p0.put("mali-t830", Integer.valueOf(20));
       p0.put("mali-t830 mp2", Integer.valueOf(51));
       p0.put("mali-t830 mp3", Integer.valueOf(71));
       p0.put("mali-t860", Integer.valueOf(23));
       p0.put("mali-t860 mp2", Integer.valueOf(40));
       p0.put("mali-t860 mp3", Integer.valueOf(71));
       p0.put("mali-t860 mp4", Integer.valueOf(103));
       p0.put("mali-t880", Integer.valueOf(28));
       p0.put("mali-t880 mp10", Integer.valueOf(221));
       p0.put("mali-t880 mp12", Integer.valueOf(265));
       p0.put("mali-t880 mp2", Integer.valueOf(64));
       p0.put("mali-t880 mp4", Integer.valueOf(115));
       p0.put("maxwell cores x 256", Integer.valueOf(435));
       p0.put("n3ds", Integer.valueOf(4));
       p0.put("n64", Integer.valueOf(0));
       p0.put("nds", Integer.valueOf(0));
       p0.put("ouya", Integer.valueOf(12));
       p0.put("pascal cores x 256", Integer.valueOf(750));
       p0.put("pitcairn pro", Integer.valueOf(1761));
       p0.put("pitcairn xt", Integer.valueOf(2560));
       p0.put("playstation 2", Integer.valueOf(6));
       p0.put("playstation 3", Integer.valueOf(228));
       p0.put("playstation 4", Integer.valueOf(1840));
       p0.put("playstation 4 pro", Integer.valueOf(4200));
       p0.put("ps vita", Integer.valueOf(28));
       p0.put("psp", Integer.valueOf(2));
       p0.put("sgx530", Integer.valueOf(1));
       p0.put("sgx531", Integer.valueOf(2));
       p0.put("sgx531 ultra", Integer.valueOf(4));
       p0.put("sgx535", Integer.valueOf(2));
       p0.put("sgx540", Integer.valueOf(6));
       p0.put("sgx543", Integer.valueOf(6));
       p0.put("sgx543 mp2", Integer.valueOf(21));
       p0.put("sgx543 mp3", Integer.valueOf(25));
       p0.put("sgx543 mp4", Integer.valueOf(32));
       p0.put("sgx544", Integer.valueOf(10));
       p0.put("sgx544 mp2", Integer.valueOf(29));
       p0.put("sgx544 mp3", Integer.valueOf(51));
       p0.put("sgx545", Integer.valueOf(6));
       p0.put("sgx554", Integer.valueOf(19));
       p0.put("sgx554 mp2", Integer.valueOf(38));
       p0.put("sgx554 mp4", Integer.valueOf(68));
       p0.put("shield portable", Integer.valueOf(96));
       p0.put("shield tv", Integer.valueOf(512));
       p0.put("switch", Integer.valueOf(275));
       p0.put("tahiti le", Integer.valueOf(2918));
       p0.put("tahiti pro", Integer.valueOf(3024));
       p0.put("tahiti xt", Integer.valueOf(3788));
       p0.put("tahiti xt2", Integer.valueOf(4198));
       p0.put("videocore1", Integer.valueOf(0));
       p0.put("videocore2", Integer.valueOf(0));
       p0.put("videocore3", Integer.valueOf(0));
       p0.put("videocore4", Integer.valueOf(26));
       p0.put("volta cores x 512", Integer.valueOf(0));
       p0.put("wii", Integer.valueOf(12));
       p0.put("wii u", Integer.valueOf(176));
       p0.put("xbox", Integer.valueOf(20));
       p0.put("xbox 360", Integer.valueOf(240));
       p0.put("xbox one", Integer.valueOf(1311));
       p0.put("xbox one x", Integer.valueOf(6000));
       return;
    }
}
