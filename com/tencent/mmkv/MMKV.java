package com.tencent.mmkv.MMKV;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.EnumMap;
import com.tencent.mmkv.MMKVRecoverStrategic;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Enum;
import java.lang.Object;
import com.tencent.mmkv.MMKVLogLevel;
import java.util.HashSet;
import java.util.HashMap;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.RuntimeException;
import com.tencent.mmkv.NativeBuffer;
import com.tencent.mmkv.MMKV$LibLoader;
import java.lang.System;
import android.content.Context;
import java.io.File;
import android.content.pm.ApplicationInfo;
import com.tencent.mmkv.MMKV$1;
import com.tencent.mmkv.MMKVHandler;
import android.os.Process;
import com.tencent.mmkv.MMKVContentProvider;
import java.lang.CharSequence;
import android.net.Uri;
import android.os.Bundle;
import android.content.ContentResolver;
import com.tencent.mmkv.ParcelableMMKV;
import java.lang.ClassLoader;
import android.os.Parcelable;
import com.tencent.mmkv.MMKVContentChangeNotification;
import java.lang.Thread;
import java.lang.StackTraceElement;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.lang.reflect.Field;
import java.lang.Exception;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public class MMKV implements SharedPreferences, SharedPreferences$Editor	// class@000fdd
{
    public final long nativeHandle;
    public static final Set checkedHandleSet;
    public static MMKVHandler gCallbackHandler;
    public static MMKVContentChangeNotification gContentChangeNotify;
    public static boolean gWantLogReDirecting;
    public static final MMKVLogLevel[] index2LogLevel;
    public static boolean isProcessModeCheckerEnabled;
    public static final EnumMap logLevel2Index;
    public static final HashMap mCreators;
    public static final EnumMap recoverIndex;
    public static String rootDir;

    static {
       EnumMap uEnumMap = new EnumMap(MMKVRecoverStrategic.class);
       MMKV.recoverIndex = uEnumMap;
       Integer integer = Integer.valueOf(0);
       uEnumMap.put(MMKVRecoverStrategic.OnErrorDiscard, integer);
       Integer integer1 = Integer.valueOf(1);
       uEnumMap.put(MMKVRecoverStrategic.OnErrorRecover, integer1);
       uEnumMap = new EnumMap(MMKVLogLevel.class);
       MMKV.logLevel2Index = uEnumMap;
       MMKVLogLevel levelDebug = MMKVLogLevel.LevelDebug;
       uEnumMap.put(levelDebug, integer);
       MMKVLogLevel levelInfo = MMKVLogLevel.LevelInfo;
       uEnumMap.put(levelInfo, integer1);
       MMKVLogLevel levelWarning = MMKVLogLevel.LevelWarning;
       uEnumMap.put(levelWarning, Integer.valueOf(2));
       MMKVLogLevel levelError = MMKVLogLevel.LevelError;
       uEnumMap.put(levelError, Integer.valueOf(3));
       MMKVLogLevel levelNone = MMKVLogLevel.LevelNone;
       uEnumMap.put(levelNone, Integer.valueOf(4));
       MMKVLogLevel[] mMKVLogLevel = new MMKVLogLevel[]{levelDebug,levelInfo,levelWarning,levelError,levelNone};
       MMKV.index2LogLevel = mMKVLogLevel;
       MMKV.checkedHandleSet = new HashSet();
       MMKV.rootDir = null;
       MMKV.isProcessModeCheckerEnabled = true;
       MMKV.mCreators = new HashMap();
       MMKV.gWantLogReDirecting = false;
    }
    public void MMKV(long p0){
       super();
       this.nativeHandle = p0;
    }
    public static MMKV backedUpMMKVWithID(String p0,int p1,String p2,String p3){
       if (MMKV.rootDir == null) {
          throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
       }
       p1 = p1 | 0x10;
       return MMKV.checkProcessMode(MMKV.getMMKVWithID(p0, p1, p2, p3), p0, p1);
    }
    public static native long backupAllToDirectory(String p0);
    public static native boolean backupOneToDirectory(String p0,String p1,String p2);
    public static MMKV checkProcessMode(long p0,String p1,int p2){
       if (!p0 - false) {
          throw new RuntimeException("Fail to create an MMKV instance ["+p1+"] in JNI");
       }
       if (!MMKV.isProcessModeCheckerEnabled) {
          return new MMKV(p0);
       }
       Set checkedHandl = MMKV.checkedHandleSet;
       _monitor_enter(checkedHandl);
       if (!checkedHandl.contains(Long.valueOf(p0))) {
          if (!MMKV.checkProcessMode(p0)) {
             String str = (p2 == 1)? "Opening a multi-process MMKV instance ["+p1+"] with SINGLE_PROCESS_MODE!": "Opening an MMKV instance ["+p1+"] with MULTI_PROCESS_MODE, "+"while it\'s already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
             throw new IllegalArgumentException(str);
          }else {
             checkedHandl.add(Long.valueOf(p0));
          }
       }
       _monitor_exit(checkedHandl);
       return new MMKV(p0);
    }
    public static native boolean checkProcessMode(long p0);
    public static native long createNB(int p0);
    public static NativeBuffer createNativeBuffer(int p0){
       long l = MMKV.createNB(p0);
       if (l - null <= 0) {
          return null;
       }
       return new NativeBuffer(l, p0);
    }
    public static MMKV defaultMMKV(){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getDefaultMMKV(1, null), "DefaultMMKV", 1);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static MMKV defaultMMKV(int p0,String p1){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getDefaultMMKV(p0, p1), "DefaultMMKV", p0);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static native void destroyNB(long p0,int p1);
    public static void destroyNativeBuffer(NativeBuffer p0){
       MMKV.destroyNB(p0.pointer, p0.size);
    }
    public static void disableProcessModeChecker(){
       Set checkedHandl = MMKV.checkedHandleSet;
       _monitor_enter(checkedHandl);
       MMKV.isProcessModeCheckerEnabled = false;
       _monitor_exit(checkedHandl);
    }
    public static String doInitialize(String p0,String p1,MMKV$LibLoader p2,MMKVLogLevel p3){
       if (p2 != null) {
          p2.loadLibrary("mmkv");
       }else {
          System.loadLibrary("mmkv");
       }
       MMKV.jniInitialize(p0, p1, MMKV.logLevel2Int(p3));
       MMKV.rootDir = p0;
       return p0;
    }
    public static void enableProcessModeChecker(){
       Set checkedHandl = MMKV.checkedHandleSet;
       _monitor_enter(checkedHandl);
       MMKV.isProcessModeCheckerEnabled = true;
       _monitor_exit(checkedHandl);
    }
    public static native long getDefaultMMKV(int p0,String p1);
    public static native long getMMKVWithAshmemFD(String p0,int p1,int p2,String p3);
    public static native long getMMKVWithID(String p0,int p1,String p2,String p3);
    public static native long getMMKVWithIDAndSize(String p0,int p1,int p2,String p3);
    public static String getRootDir(){
       return MMKV.rootDir;
    }
    public static String initialize(Context p0){
       return MMKV.initialize(p0, p0.getFilesDir().getAbsolutePath()+"/mmkv", null, MMKVLogLevel.LevelInfo);
    }
    public static String initialize(Context p0,MMKV$LibLoader p1){
       return MMKV.initialize(p0, p0.getFilesDir().getAbsolutePath()+"/mmkv", p1, MMKVLogLevel.LevelInfo);
    }
    public static String initialize(Context p0,MMKV$LibLoader p1,MMKVLogLevel p2){
       return MMKV.initialize(p0, p0.getFilesDir().getAbsolutePath()+"/mmkv", p1, p2);
    }
    public static String initialize(Context p0,MMKVLogLevel p1){
       return MMKV.initialize(p0, p0.getFilesDir().getAbsolutePath()+"/mmkv", null, p1);
    }
    public static String initialize(Context p0,String p1){
       return MMKV.initialize(p0, p1, null, MMKVLogLevel.LevelInfo);
    }
    public static String initialize(Context p0,String p1,MMKV$LibLoader p2){
       return MMKV.initialize(p0, p1, p2, MMKVLogLevel.LevelInfo);
    }
    public static String initialize(Context p0,String p1,MMKV$LibLoader p2,MMKVLogLevel p3){
       if (!(p0.getApplicationInfo().flags & 0x02)) {
          MMKV.disableProcessModeChecker();
       }else {
          MMKV.enableProcessModeChecker();
       }
       return MMKV.doInitialize(p1, p0.getCacheDir().getAbsolutePath(), p2, p3);
    }
    public static String initialize(Context p0,String p1,MMKVLogLevel p2){
       return MMKV.initialize(p0, p1, null, p2);
    }
    public static String initialize(String p0){
       return MMKV.doInitialize(p0, p0+"/.tmp", null, MMKVLogLevel.LevelInfo);
    }
    public static String initialize(String p0,MMKV$LibLoader p1){
       return MMKV.doInitialize(p0, p0+"/.tmp", p1, MMKVLogLevel.LevelInfo);
    }
    public static String initialize(String p0,MMKV$LibLoader p1,MMKVLogLevel p2){
       return MMKV.doInitialize(p0, p0+"/.tmp", p1, p2);
    }
    public static String initialize(String p0,MMKVLogLevel p1){
       return MMKV.doInitialize(p0, p0+"/.tmp", null, p1);
    }
    public static boolean isFileValid(String p0){
       return MMKV.isFileValid(p0, null);
    }
    public static native boolean isFileValid(String p0,String p1);
    public static native void jniInitialize(String p0,String p1,int p2);
    public static int logLevel2Int(MMKVLogLevel p0){
       int i = MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[p0.ordinal()];
       int i1 = 4;
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != i1) {
                   i1 = 1;
                }
             }else {
                i1 = 3;
             }
          }else {
             i1 = 2;
          }
       }else {
          i1 = 0;
       }
       return i1;
    }
    public static void mmkvLogImp(int p0,String p1,int p2,String p3,String p4){
       MMKVHandler gCallbackHan = MMKV.gCallbackHandler;
       if (gCallbackHan != null && MMKV.gWantLogReDirecting) {
          gCallbackHan.mmkvLog(MMKV.index2LogLevel[p0], p1, p2, p3, p4);
       }else {
          p0 = MMKV$1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKV.index2LogLevel[p0].ordinal()];
       }
       return;
    }
    public static MMKV mmkvWithAshmemFD(String p0,int p1,int p2,String p3){
       long mMKVWithAshm = MMKV.getMMKVWithAshmemFD(p0, p1, p2, p3);
       if (mMKVWithAshm) {
          return new MMKV(mMKVWithAshm);
       }
       throw new RuntimeException("Fail to create an ashmem MMKV instance ["+p0+"] in JNI");
    }
    public static MMKV mmkvWithAshmemID(Context p0,String p1,int p2,int p3,String p4){
       ParcelableMMKV parcelable;
       if (MMKV.rootDir == null) {
          throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
       }
       String processNameB = MMKVContentProvider.getProcessNameByPID(p0, Process.myPid());
       if (processNameB != null && processNameB.length()) {
          if (processNameB.contains(":")) {
             Uri uri = MMKVContentProvider.contentUri(p0);
             if (uri != null) {
                MMKVLogLevel levelInfo = MMKVLogLevel.LevelInfo;
                MMKV.simpleLog(levelInfo, "getting parcelable mmkv in process, Uri = "+uri);
                Bundle uBundle = new Bundle();
                uBundle.putInt("KEY_SIZE", p2);
                uBundle.putInt("KEY_MODE", p3);
                if (p4 != null) {
                   uBundle.putString("KEY_CRYPT", p4);
                }
                Bundle uBundle1 = p0.getContentResolver().call(uri, "mmkvFromAshmemID", p1, uBundle);
                if (uBundle1 != null) {
                   uBundle1.setClassLoader(ParcelableMMKV.class.getClassLoader());
                   parcelable = uBundle1.getParcelable("KEY");
                   if (parcelable != null) {
                      MMKV mMKV = parcelable.toMMKV();
                      if (mMKV != null) {
                         MMKV.simpleLog(levelInfo, mMKV.mmapID()+" fd = "+mMKV.ashmemFD()+", meta fd = "+mMKV.ashmemMetaFD());
                         return mMKV;
                      }
                   }
                }
             }else {
                MMKV.simpleLog(MMKVLogLevel.LevelError, "MMKVContentProvider has invalid authority");
                throw new IllegalStateException("MMKVContentProvider has invalid authority");
             }
          }
          MMKV.simpleLog(MMKVLogLevel.LevelInfo, "getting mmkv in main process");
          long mMKVWithIDAn = MMKV.getMMKVWithIDAndSize(p1, p2, (p3 | 0x08), p4);
          if (mMKVWithIDAn) {
             return new MMKV(mMKVWithIDAn);
          }else {
             throw new IllegalStateException("Fail to create an Ashmem MMKV instance ["+p1+"]");
          }
       }else {
          MMKV.simpleLog(MMKVLogLevel.LevelError, "process name detect fail, try again later");
          throw new IllegalStateException("process name detect fail, try again later");
       }
    }
    public static MMKV mmkvWithID(String p0){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getMMKVWithID(p0, 1, null, null), p0, 1);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static MMKV mmkvWithID(String p0,int p1){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getMMKVWithID(p0, p1, null, null), p0, p1);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static MMKV mmkvWithID(String p0,int p1,String p2){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getMMKVWithID(p0, p1, p2, null), p0, p1);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static MMKV mmkvWithID(String p0,int p1,String p2,String p3){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getMMKVWithID(p0, p1, p2, p3), p0, p1);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static MMKV mmkvWithID(String p0,String p1){
       if (MMKV.rootDir != null) {
          return MMKV.checkProcessMode(MMKV.getMMKVWithID(p0, 1, null, p1), p0, 1);
       }
       throw new IllegalStateException("You should Call MMKV.initialize\(\) first.");
    }
    public static void onContentChangedByOuterProcess(String p0){
       MMKVContentChangeNotification gContentChan = MMKV.gContentChangeNotify;
       if (gContentChan != null) {
          gContentChan.onContentChangedByOuterProcess(p0);
       }
       return;
    }
    public static native void onExit();
    public static int onMMKVCRCCheckFail(String p0){
       MMKVRecoverStrategic onErrorDisca = MMKVRecoverStrategic.OnErrorDiscard;
       MMKVHandler gCallbackHan = MMKV.gCallbackHandler;
       if (gCallbackHan != null) {
          onErrorDisca = gCallbackHan.onMMKVCRCCheckFail(p0);
       }
       MMKV.simpleLog(MMKVLogLevel.LevelInfo, "Recover strategic for "+p0+" is "+onErrorDisca);
       Integer integer = MMKV.recoverIndex.get(onErrorDisca);
       int i = (integer == null)? 0: integer.intValue();
       return i;
    }
    public static int onMMKVFileLengthError(String p0){
       MMKVRecoverStrategic onErrorDisca = MMKVRecoverStrategic.OnErrorDiscard;
       MMKVHandler gCallbackHan = MMKV.gCallbackHandler;
       if (gCallbackHan != null) {
          onErrorDisca = gCallbackHan.onMMKVFileLengthError(p0);
       }
       MMKV.simpleLog(MMKVLogLevel.LevelInfo, "Recover strategic for "+p0+" is "+onErrorDisca);
       Integer integer = MMKV.recoverIndex.get(onErrorDisca);
       int i = (integer == null)? 0: integer.intValue();
       return i;
    }
    public static native int pageSize();
    public static void registerContentChangeNotify(MMKVContentChangeNotification p0){
       MMKV.gContentChangeNotify = p0;
       boolean b = (p0 != null)? true: false;
       MMKV.setWantsContentChangeNotify(b);
       return;
    }
    public static void registerHandler(MMKVHandler p0){
       MMKV.gCallbackHandler = p0;
       if (p0.wantLogRedirecting()) {
          MMKV.setCallbackHandler(true, true);
          MMKV.gWantLogReDirecting = true;
       }else {
          MMKV.setCallbackHandler(false, true);
          MMKV.gWantLogReDirecting = false;
       }
       return;
    }
    public static native long restoreAllFromDirectory(String p0);
    public static native boolean restoreOneMMKVFromDirectory(String p0,String p1,String p2);
    public static native void setCallbackHandler(boolean p0,boolean p1);
    public static native void setLogLevel(int p0);
    public static void setLogLevel(MMKVLogLevel p0){
       MMKV.setLogLevel(MMKV.logLevel2Int(p0));
    }
    public static native void setWantsContentChangeNotify(boolean p0);
    public static void simpleLog(MMKVLogLevel p0,String p1){
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       object oobject = stackTrace[(stackTrace.length - 1)];
       Integer integer = MMKV.logLevel2Index.get(p0);
       int i = (integer == null)? 0: integer.intValue();
       MMKV.mmkvLogImp(i, oobject.getFileName(), oobject.getLineNumber(), oobject.getMethodName(), p1);
       return;
    }
    public static void unregisterContentChangeNotify(){
       MMKV.gContentChangeNotify = null;
       MMKV.setWantsContentChangeNotify(false);
    }
    public static void unregisterHandler(){
       MMKV.gCallbackHandler = null;
       MMKV.setCallbackHandler(false, false);
       MMKV.gWantLogReDirecting = false;
    }
    public static native String version();
    public long actualSize(){
       return this.actualSize(this.nativeHandle);
    }
    public native final long actualSize(long p0);
    public native String[] allKeys();
    public void apply(){
       this.sync(false);
    }
    public native int ashmemFD();
    public native int ashmemMetaFD();
    public void async(){
       this.sync(false);
    }
    public native void checkContentChangedByOuterProcess();
    public native void checkReSetCryptKey(String p0);
    public SharedPreferences$Editor clear(){
       this.clearAll();
       return this;
    }
    public native void clearAll();
    public native void clearMemoryCache();
    public native void close();
    public boolean commit(){
       this.sync(true);
       return true;
    }
    public boolean contains(String p0){
       return this.containsKey(p0);
    }
    public native final boolean containsKey(long p0,String p1);
    public boolean containsKey(String p0){
       return this.containsKey(this.nativeHandle, p0);
    }
    public long count(){
       return this.count(this.nativeHandle);
    }
    public native final long count(long p0);
    public native String cryptKey();
    public native final boolean decodeBool(long p0,String p1,boolean p2);
    public boolean decodeBool(String p0){
       return this.decodeBool(this.nativeHandle, p0, false);
    }
    public boolean decodeBool(String p0,boolean p1){
       return this.decodeBool(this.nativeHandle, p0, p1);
    }
    public native final byte[] decodeBytes(long p0,String p1);
    public byte[] decodeBytes(String p0){
       return this.decodeBytes(p0, null);
    }
    public byte[] decodeBytes(String p0,byte[] p1){
       byte[] uobyteArray = this.decodeBytes(this.nativeHandle, p0);
       if (uobyteArray != null) {
          p1 = uobyteArray;
       }
       return p1;
    }
    public native final double decodeDouble(long p0,String p1,double p2);
    public double decodeDouble(String p0){
       return this.decodeDouble(this.nativeHandle, p0, 0);
    }
    public double decodeDouble(String p0,double p1){
       return this.decodeDouble(this.nativeHandle, p0, p1);
    }
    public native final float decodeFloat(long p0,String p1,float p2);
    public float decodeFloat(String p0){
       return this.decodeFloat(this.nativeHandle, p0, 0);
    }
    public float decodeFloat(String p0,float p1){
       return this.decodeFloat(this.nativeHandle, p0, p1);
    }
    public native final int decodeInt(long p0,String p1,int p2);
    public int decodeInt(String p0){
       return this.decodeInt(this.nativeHandle, p0, 0);
    }
    public int decodeInt(String p0,int p1){
       return this.decodeInt(this.nativeHandle, p0, p1);
    }
    public native final long decodeLong(long p0,String p1,long p2);
    public long decodeLong(String p0){
       return this.decodeLong(this.nativeHandle, p0, 0);
    }
    public long decodeLong(String p0,long p1){
       return this.decodeLong(this.nativeHandle, p0, p1);
    }
    public Parcelable decodeParcelable(String p0,Class p1){
       return this.decodeParcelable(p0, p1, null);
    }
    public Parcelable decodeParcelable(String p0,Class p1,Parcelable p2){
       if (p1 == null) {
          return p2;
       }
       byte[] uobyteArray = this.decodeBytes(this.nativeHandle, p0);
       if (uobyteArray == null) {
          return p2;
       }
       Parcel parcel = Parcel.obtain();
       int i = 0;
       parcel.unmarshall(uobyteArray, i, uobyteArray.length);
       try{
          parcel.setDataPosition(i);
          uobyteArray = p1.toString();
          HashMap mCreators = MMKV.mCreators;
          _monitor_enter(mCreators);
          Parcelable$Creator uCreator = mCreators.get(uobyteArray);
          if (uCreator == null) {
             uCreator = p1.getField("CREATOR").get(null);
             if (uCreator != null) {
                mCreators.put(uobyteArray, uCreator);
             }
          }
          _monitor_exit(mCreators);
          if (uCreator != null) {
             parcel.recycle();
             return uCreator.createFromParcel(parcel);
          }else {
             throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class "+uobyteArray);
          }
       }catch(java.lang.Exception e4){
          MMKV.simpleLog(MMKVLogLevel.LevelError, e4.toString());
          parcel.recycle();
          return p2;
       }
    }
    public native final String decodeString(long p0,String p1,String p2);
    public String decodeString(String p0){
       return this.decodeString(this.nativeHandle, p0, null);
    }
    public String decodeString(String p0,String p1){
       return this.decodeString(this.nativeHandle, p0, p1);
    }
    public Set decodeStringSet(String p0){
       return this.decodeStringSet(p0, null);
    }
    public Set decodeStringSet(String p0,Set p1){
       return this.decodeStringSet(p0, p1, HashSet.class);
    }
    public Set decodeStringSet(String p0,Set p1,Class p2){
       String[] stringArray = this.decodeStringSet(this.nativeHandle, p0);
       if (stringArray == null) {
          return p1;
       }
       try{
          Set set = p2.newInstance();
          set.addAll(Arrays.asList(stringArray));
          return set;
       }catch(java.lang.IllegalAccessException e0){
          return p1;
       }catch(java.lang.InstantiationException e0){
       }
    }
    public native final String[] decodeStringSet(long p0,String p1);
    public SharedPreferences$Editor edit(){
       return this;
    }
    public boolean encode(String p0,double p1){
       return this.encodeDouble(this.nativeHandle, p0, p1);
    }
    public boolean encode(String p0,float p1){
       return this.encodeFloat(this.nativeHandle, p0, p1);
    }
    public boolean encode(String p0,int p1){
       return this.encodeInt(this.nativeHandle, p0, p1);
    }
    public boolean encode(String p0,long p1){
       return this.encodeLong(this.nativeHandle, p0, p1);
    }
    public boolean encode(String p0,Parcelable p1){
       if (p1 == null) {
          return this.encodeBytes(this.nativeHandle, p0, null);
       }
       Parcel parcel = Parcel.obtain();
       p1.writeToParcel(parcel, 0);
       byte[] uobyteArray = parcel.marshall();
       parcel.recycle();
       return this.encodeBytes(this.nativeHandle, p0, uobyteArray);
    }
    public boolean encode(String p0,String p1){
       return this.encodeString(this.nativeHandle, p0, p1);
    }
    public boolean encode(String p0,Set p1){
       String[] stringArray;
       MMKV tnativeHandl = this.nativeHandle;
       if (p1 == null) {
          stringArray = null;
       }else {
          String[] stringArray1 = new String[0];
          stringArray = p1.toArray(stringArray1);
       }
       return this.encodeSet(tnativeHandl, p0, stringArray);
    }
    public boolean encode(String p0,boolean p1){
       return this.encodeBool(this.nativeHandle, p0, p1);
    }
    public boolean encode(String p0,byte[] p1){
       return this.encodeBytes(this.nativeHandle, p0, p1);
    }
    public native final boolean encodeBool(long p0,String p1,boolean p2);
    public native final boolean encodeBytes(long p0,String p1,byte[] p2);
    public native final boolean encodeDouble(long p0,String p1,double p2);
    public native final boolean encodeFloat(long p0,String p1,float p2);
    public native final boolean encodeInt(long p0,String p1,int p2);
    public native final boolean encodeLong(long p0,String p1,long p2);
    public native final boolean encodeSet(long p0,String p1,String[] p2);
    public native final boolean encodeString(long p0,String p1,String p2);
    public Map getAll(){
       throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys\(\) instead, getAll\(\) not implement because type-erasure inside mmkv");
    }
    public boolean getBoolean(String p0,boolean p1){
       return this.decodeBool(this.nativeHandle, p0, p1);
    }
    public byte[] getBytes(String p0,byte[] p1){
       return this.decodeBytes(p0, p1);
    }
    public float getFloat(String p0,float p1){
       return this.decodeFloat(this.nativeHandle, p0, p1);
    }
    public int getInt(String p0,int p1){
       return this.decodeInt(this.nativeHandle, p0, p1);
    }
    public long getLong(String p0,long p1){
       return this.decodeLong(this.nativeHandle, p0, p1);
    }
    public String getString(String p0,String p1){
       return this.decodeString(this.nativeHandle, p0, p1);
    }
    public Set getStringSet(String p0,Set p1){
       return this.decodeStringSet(p0, p1);
    }
    public int getValueActualSize(String p0){
       return this.valueSize(this.nativeHandle, p0, true);
    }
    public int getValueSize(String p0){
       return this.valueSize(this.nativeHandle, p0, false);
    }
    public int importFromSharedPreferences(SharedPreferences p0){
       Map all = p0.getAll();
       if (all == null || all.size() <= 0) {
          return 0;
       }
       Iterator iterator = all.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object obj = uEntry.getKey();
          Object value = uEntry.getValue();
          if (obj == null || value == null) {
             continue ;
          }else if(value instanceof Boolean){
             this.encodeBool(this.nativeHandle, obj, value.booleanValue());
          }else if(value instanceof Integer){
             this.encodeInt(this.nativeHandle, obj, value.intValue());
          }else if(value instanceof Long){
             this.encodeLong(this.nativeHandle, obj, value.longValue());
          }else if(value instanceof Float){
             this.encodeFloat(this.nativeHandle, obj, value.floatValue());
          }else if(value instanceof Double){
             this.encodeDouble(this.nativeHandle, obj, value.doubleValue());
          }else if(value instanceof String){
             this.encodeString(this.nativeHandle, obj, value);
          }else if(value instanceof Set){
             this.encode(obj, value);
          }else {
             MMKV.simpleLog(MMKVLogLevel.LevelError, "unknown type: "+value.getClass());
          }
       }
       return all.size();
    }
    public native void lock();
    public native String mmapID();
    public SharedPreferences$Editor putBoolean(String p0,boolean p1){
       this.encodeBool(this.nativeHandle, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putBytes(String p0,byte[] p1){
       this.encode(p0, p1);
       return this;
    }
    public SharedPreferences$Editor putFloat(String p0,float p1){
       this.encodeFloat(this.nativeHandle, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putInt(String p0,int p1){
       this.encodeInt(this.nativeHandle, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putLong(String p0,long p1){
       this.encodeLong(this.nativeHandle, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putString(String p0,String p1){
       this.encodeString(this.nativeHandle, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putStringSet(String p0,Set p1){
       this.encode(p0, p1);
       return this;
    }
    public native boolean reKey(String p0);
    public void registerOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }
    public SharedPreferences$Editor remove(String p0){
       this.removeValueForKey(p0);
       return this;
    }
    public native final void removeValueForKey(long p0,String p1);
    public void removeValueForKey(String p0){
       this.removeValueForKey(this.nativeHandle, p0);
    }
    public native void removeValuesForKeys(String[] p0);
    public void sync(){
       this.sync(true);
    }
    public native final void sync(boolean p0);
    public long totalSize(){
       return this.totalSize(this.nativeHandle);
    }
    public native final long totalSize(long p0);
    public native void trim();
    public native boolean tryLock();
    public native void unlock();
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }
    public native final int valueSize(long p0,String p1,boolean p2);
    public native final int writeValueToNB(long p0,String p1,long p2,int p3);
    public int writeValueToNativeBuffer(String p0,NativeBuffer p1){
       return this.writeValueToNB(this.nativeHandle, p0, p1.pointer, p1.size);
    }
}
