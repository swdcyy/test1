package com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Object;
import java.lang.Object;
import com.tkruntime.v8.V8Object$Undefined;
import com.tkruntime.v8.V8ResultUnSupported;
import java.nio.ByteBuffer;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;
import android.util.SparseArray;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Locker$DeprecatedV8Locker;
import android.os.Looper;
import com.tkruntime.v8.StringPool;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Byte;
import java.lang.Double;
import com.tkruntime.v8.V8MemBufferFromJS;
import java.lang.Integer;
import java.lang.Long;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.NativeLibraryLoader;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Handler;
import java.lang.Number;
import com.tkruntime.v8.LibraryLoader;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.List;
import java.lang.Boolean;
import java.lang.Runnable;
import com.tkruntime.v8.V8Array;
import com.tkruntime.v8.V8Map;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8$MethodDescriptor;
import com.tkruntime.v8.JavaCallback;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.tkruntime.v8.V8ObjectProxy;
import com.tkruntime.v8.JavaVoidCallback;
import com.tkruntime.v8.V8Plugins$ErrorHandler;
import com.tkruntime.v8.V8Plugins;
import java.lang.Error;
import com.tkruntime.v8.V8Locker;
import com.tkruntime.v8.BuildConfig;
import java.lang.System;
import com.tkruntime.v8.V8Trace;
import java.lang.Exception;
import com.tkruntime.v8.V8$StyleRunner;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8$BindingObjectCreator;
import com.tkruntime.v8.V8$1;
import com.tkruntime.v8.V8$RTMethodRunner;
import com.tkruntime.v8.V8$MethodRunner;
import com.tkruntime.v8.V8$PropRunner;
import com.tkruntime.v8.utils.AutoExpandedMap;
import com.tkruntime.v8.V8OneTimeObject;
import com.tkruntime.v8.V8JSONProxy;
import android.util.Log;
import com.tkruntime.v8.V8$CommandRunner;
import java.util.Set;
import java.util.Iterator;
import com.tkruntime.v8.utils.AutoExpandedList;
import java.lang.Float;
import com.tkruntime.v8.utils.TypedArray;
import com.tkruntime.v8.V8TypedArray;
import com.tkruntime.v8.utils.ArrayBuffer;
import com.tkruntime.v8.V8ArrayBuffer;
import com.tkruntime.v8.V8$StackListener;
import java.util.Collection;

public class V8 extends V8Object	// class@000fb0
{
    public String bundleId;
    public String businessName;
    public String contextName;
    public int currentState;
    public Map data;
    public Map functionRegistry;
    public ByteBuffer gcBuffer;
    public boolean isPendingReleased;
    public long isolatePtr;
    public long jsCallbackIndex;
    public final V8Locker locker;
    public V8$BindingObjectCreator mBindingObjectCreator;
    public SparseArray mCmds;
    public AutoExpandedMap mCurrentStyle;
    public boolean mIsGcing;
    public int mJsStackLevel;
    public int mJsonproxyNotLoad;
    public List mPendingAction;
    public Map mPendingRemovingObjs;
    public float mPropCallCostTime;
    public V8ObjectProxy mReceiver;
    public long mSessionId;
    public V8$StackListener mStackListener;
    public int mStyleSeq;
    public Map mTrackedObjs;
    public long objectReferences;
    public boolean runtimeRelesed;
    public Map sV8ExportDescriptor;
    public String sessionId;
    public long[] v8ExportDescriptor;
    public String[] v8ExportDescriptorIndex;
    public long v8RuntimePtr;
    public Map v8WeakReferences;
    public static boolean initialized;
    public static Object invalid;
    public static final Object lock;
    public static boolean nativeLibraryLoaded;
    public static Error nativeLoadError;
    public static Exception nativeLoadException;
    public static int runtimeCounter;
    public static Handler sAsyncHandler;
    public static final ByteBuffer[] sDirectBuffers;
    public static boolean sGlobalEnvInited;
    public static final V8ResultUnSupported sPropUnSupported;
    public static boolean sStrPoolInited;
    public static V8Object sV8Receiver;
    public static V8Value undefined;
    public static String v8Flags;

    static {
       V8.lock = new Object();
       V8.undefined = new V8Object$Undefined();
       V8.invalid = new Object();
       V8.sPropUnSupported = new V8ResultUnSupported();
       ByteBuffer[] uByteBufferA = new ByteBuffer[16];
       V8.sDirectBuffers = uByteBufferA;
       V8.sStrPoolInited = false;
       V8.sGlobalEnvInited = false;
       V8.sAsyncHandler = null;
    }
    public void V8(long p0,boolean p1){
       super(null, p0, p1);
    }
    public void V8(String p0,long p1,boolean p2){
       super(null);
       this.v8WeakReferences = new HashMap();
       this.sV8ExportDescriptor = null;
       this.gcBuffer = null;
       this.data = null;
       this.objectReferences = 0;
       this.v8RuntimePtr = 0;
       this.isolatePtr = 0;
       this.functionRegistry = new HashMap();
       int i = 0;
       this.mJsStackLevel = i;
       this.mPendingAction = new ArrayList();
       this.isPendingReleased = i;
       this.mSessionId = 0;
       this.runtimeRelesed = i;
       this.mJsonproxyNotLoad = i;
       this.mPropCallCostTime = 0;
       this.jsCallbackIndex = 0;
       this.v8ExportDescriptorIndex = null;
       this.v8ExportDescriptor = null;
       this.mTrackedObjs = new HashMap();
       this.mPendingRemovingObjs = new HashMap();
       this.mIsGcing = i;
       this.mCmds = new SparseArray();
       this.mReceiver = null;
       this.mCurrentStyle = null;
       this.mStyleSeq = -1;
       this.released = i;
       this.isolatePtr = p1;
       if (!V8.sGlobalEnvInited) {
          V8 v8 = V8.class;
          _monitor_enter(v8);
          if (!V8.sGlobalEnvInited) {
             V8._initGlobalEnv();
             V8.sGlobalEnvInited = true;
          }
          _monitor_exit(v8);
       }
       long l = this._createIsolate(p0, this.isolatePtr, this.gcBuffer, p2);
       this.v8RuntimePtr = l;
       if (!this.isolatePtr) {
          this.isolatePtr = this._getIsolatePtr(l);
       }
       this.objectHandle = this._getGlobalObject(this.v8RuntimePtr);
       this.locker = new V8Locker$DeprecatedV8Locker(this.isolatePtr);
       if (!V8.sStrPoolInited && Looper.myLooper() != Looper.getMainLooper()) {
          _monitor_enter(V8.class);
          if (!V8.sStrPoolInited) {
             V8._hashStr(this.isolatePtr, StringPool.sSortedHighFrequencyStrings);
             V8.sStrPoolInited = true;
          }
          _monitor_exit(V8.class);
       }
       return;
    }
    public static native void _destroyCodeCache(long p0);
    public static native String _getVersion();
    public static native void _hashStr(long p0,String[] p1);
    public static native boolean _initGlobalEnv();
    public static native int _injectProps(long p0,String[] p1,String[] p2,String[] p3);
    public static native boolean _isBigEndian();
    public static native boolean _isIsolateInUse(long p0);
    public static native boolean _pumpMessageLoop(long p0);
    public static native long _releaseIsolatePtr(long p0);
    public static void _setDByte(ByteBuffer p0,byte p1,byte p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, Byte.valueOf(p1), Byte.valueOf(p2), null, V8.class, "112")) {
          return;
       }
       byte[] uobyteArray = p0.array();
       int i = p0.arrayOffset();
       uobyteArray[i] = 127;
       uobyteArray[(i + 1)] = p1;
       uobyteArray[(i + 2)] = p2;
       return;
    }
    public static void _setDDouble(ByteBuffer p0,byte p1,double p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, Byte.valueOf(p1), Double.valueOf(p2), null, V8.class, "111")) {
          return;
       }
       byte[] uobyteArray = p0.array();
       int i = p0.arrayOffset();
       uobyteArray[i] = 127;
       uobyteArray[(i + 1)] = p1;
       V8MemBufferFromJS.loadDoubleIntoBytes(uobyteArray, (i + 2), p2);
       return;
    }
    public static void _setDInt(ByteBuffer p0,byte p1,int p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, Byte.valueOf(p1), Integer.valueOf(p2), null, V8.class, "110")) {
          return;
       }
       byte[] uobyteArray = p0.array();
       int i = p0.arrayOffset();
       uobyteArray[i] = 127;
       uobyteArray[(i + 1)] = p1;
       V8MemBufferFromJS.loadIntIntoBytes(uobyteArray, (i + 2), p2);
       return;
    }
    public static void _setDLong(ByteBuffer p0,byte p1,long p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, Byte.valueOf(p1), Long.valueOf(p2), null, V8.class, "109")) {
          return;
       }
       byte[] uobyteArray = p0.array();
       int i = p0.arrayOffset();
       uobyteArray[i] = 127;
       uobyteArray[(i + 1)] = p1;
       V8MemBufferFromJS.loadLongIntoBytes(uobyteArray, (i + 2), p2);
       return;
    }
    public static native void _setFlags(String p0);
    public static void _setPropIgnored(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8.class, "108")) {
          return;
       }
       p0.array()[p0.arrayOffset()] = 8;
       return;
    }
    public static void _setUnProcessed(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8.class, "107")) {
          return;
       }
       p0.array()[p0.arrayOffset()] = 1;
       return;
    }
    public static void checkNativeLibraryLoaded(){
       if (PatchProxy.applyVoid(null, null, V8.class, "12")) {
          return;
       }
       if (V8.nativeLibraryLoaded) {
          return;
       }
       if (V8.nativeLoadError != null) {
          throw new IllegalStateException("tkruntime native library not loaded", V8.nativeLoadError);
       }
       if (V8.nativeLoadException != null) {
          throw new IllegalStateException("tkruntime native library not loaded", V8.nativeLoadException);
       }
       throw new IllegalStateException("tkruntime native library not loaded");
    }
    public static void checkScript(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8.class, "31")) {
          return;
       }
       Objects.requireNonNull(p0, "Script is null");
       return;
    }
    public static V8 createV8Runtime(){
       Object obj = PatchProxy.apply(null, null, V8.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8.createV8Runtime(null, null);
    }
    public static V8 createV8Runtime(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, V8.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8.createV8Runtime(p0, null);
    }
    public static V8 createV8Runtime(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, V8.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8.createV8Runtime(p0, p1, 0);
    }
    public static V8 createV8Runtime(String p0,String p1,long p2){
       Object obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), null, V8.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!V8.nativeLibraryLoaded) {
          obj = V8.lock;
          _monitor_enter(obj);
          if (!V8.nativeLibraryLoaded) {
             V8.load(p1, null);
          }
          _monitor_exit(obj);
       }
       V8.checkNativeLibraryLoaded();
       if (!V8.initialized) {
          if (!TextUtils.isEmpty(V8.v8Flags)) {
             V8._setFlags(V8.v8Flags);
          }
          V8.initialized = true;
       }
       p0 = V8.lock;
       _monitor_enter(p0);
       V8.runtimeCounter = V8.runtimeCounter + true;
       _monitor_exit(p0);
       return new V8(p0, p2, false);
    }
    public static void destroyCodeCache(long p0){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, V8.class, "23")) {
          return;
       }
       V8._destroyCodeCache(p0);
       return;
    }
    public static int getActiveRuntimes(){
       return V8.runtimeCounter;
    }
    public static long getBuildID(){
       return 3;
    }
    public static Handler getHandler(){
       return V8.sAsyncHandler;
    }
    public static V8Value getUndefined(){
       return V8.undefined;
    }
    public static V8Object getV8Receiver(){
       return V8.sV8Receiver;
    }
    public static String getV8Version(){
       Object obj = PatchProxy.apply(null, null, V8.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8._getVersion();
    }
    public static int injectProps(String[] p0,String[] p1,String[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, V8.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return V8._injectProps(0, p0, p1, p2);
    }
    public static boolean isLoaded(){
       return V8.nativeLibraryLoaded;
    }
    public static synchronized void load(String p0,NativeLibraryLoader p1){
       _monitor_enter(V8.class);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, V8.class, "7")) {
          _monitor_exit(V8.class);
          return;
       }else {
          try{
             LibraryLoader.loadLibrary(p0, p1);
             V8.nativeLibraryLoaded = true;
             _monitor_exit(V8.class);
             return;
          }catch(java.lang.Error e4){
             V8.nativeLoadError = e4;
             throw e4;
          }catch(java.lang.Exception e4){
             V8.nativeLoadException = e4;
             throw e4;
          }
       }
    }
    public static void loadNativeLibraries(NativeLibraryLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8.class, "100")) {
          return;
       }
       if (!V8.nativeLibraryLoaded) {
          Object lock = V8.lock;
          _monitor_enter(lock);
          if (!V8.nativeLibraryLoaded) {
             V8.load(null, p0);
          }
          _monitor_exit(lock);
       }
       return;
    }
    public static ByteBuffer newDirectBuffer(int p0,int p1){
       ByteBuffer obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, V8.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 < 0) {
          obj = ByteBuffer.allocateDirect(p0);
       }else {
          obj = ByteBuffer.allocateDirect(p0);
          V8.sDirectBuffers[p1] = obj;
       }
       if (obj != null) {
          return obj;
       }else {
          throw new RuntimeException("fail to allocate "+p0+" for directbuffer in "+p1);
       }
    }
    public static void setFlags(String p0){
       V8.v8Flags = p0;
       V8.initialized = false;
    }
    public static void setLooper(Looper p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8.class, "40")) {
          return;
       }
       if (V8.sAsyncHandler == null) {
          V8.sAsyncHandler = new Handler(p0);
       }
       return;
    }
    public native final void _add(long p0,long p1,String p2,int p3,double p4);
    public native final void _add(long p0,long p1,String p2,int p3,int p4);
    public native final void _add(long p0,long p1,String p2,int p3,String p4,int p5);
    public native final void _add(long p0,long p1,String p2,int p3,boolean p4);
    public native final void _addArrayBooleanItem(long p0,long p1,boolean p2);
    public native final void _addArrayDoubleItem(long p0,long p1,double p2);
    public native final void _addArrayIntItem(long p0,long p1,int p2);
    public native final void _addArrayNullItem(long p0,long p1);
    public native final void _addArrayObjectItem(long p0,long p1,long p2);
    public native final void _addArrayStringItem(long p0,long p1,String p2);
    public native final void _addArrayUndefinedItem(long p0,long p1);
    public native final void _addNull(long p0,long p1,String p2,int p3);
    public native final void _addObject(long p0,long p1,String p2,int p3,long p4);
    public native final void _addUndefined(long p0,long p1,String p2,int p3);
    public native final Object _arrayGet(long p0,int p1,long p2,int p3);
    public native final boolean _arrayGetBoolean(long p0,long p1,int p2);
    public native final byte _arrayGetByte(long p0,long p1,int p2);
    public native final double _arrayGetDouble(long p0,long p1,int p2);
    public native final int _arrayGetInteger(long p0,long p1,int p2);
    public native final int _arrayGetSize(long p0,long p1);
    public native final String _arrayGetString(long p0,long p1,int p2);
    public native final void _clearWeak(long p0,long p1);
    public native final long _compileCodeCache(long p0,String p1,boolean p2,String p3,int p4);
    public native final boolean _contains(long p0,long p1,String p2);
    public native final long _createIsolate(String p0,long p1,ByteBuffer p2,boolean p3);
    public native final ByteBuffer _createV8ArrayBufferBackingStore(long p0,long p1,int p2);
    public native final boolean _equals(long p0,long p1,long p2);
    public native final Object _executeFunction(long p0,long p1,int p2,long p3,String p4,long p5,int p6,Object[] p7);
    public native final Object _executeFunction(long p0,long p1,long p2,long p3,long p4,int p5,Object[] p6);
    public native final Object _executeScript(long p0,long p1,int p2,String p3,String p4,int p5,long p6);
    public native final void _executeVoidFunction(long p0,long p1,long p2,String p3,int p4,Object[] p5);
    public native final Object _get(long p0,int p1,long p2,String p3);
    public native final Map _getAll(long p0,long p1,Object p2);
    public native final ByteBuffer _getAllQuick(long p0,long p1,boolean p2,Map p3);
    public native final int _getArrayType(long p0,long p1);
    public native final boolean _getBoolean(long p0,long p1,String p2);
    public native final long _getContextHandle(long p0);
    public native final double _getDouble(long p0,long p1,String p2);
    public native final long _getGlobalObject(long p0);
    public native final int _getInteger(long p0,long p1,String p2);
    public final long _getIsolateHandle(long p0){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "98");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.getBindingIsolatePtr();
    }
    public native final long _getIsolatePtr(long p0);
    public native final List _getList(long p0,long p1,List p2);
    public native final ByteBuffer _getListQuick(long p0,long p1,List p2);
    public native final String _getString(long p0,long p1,String p2);
    public native final int _identityHash(long p0,long p1);
    public native final long _initNewV8Array(long p0);
    public native final long _initNewV8ArrayBuffer(long p0,int p1);
    public native final long _initNewV8ArrayBuffer(long p0,ByteBuffer p1,int p2);
    public native final long[] _initNewV8Function(long p0,String p1,boolean p2);
    public native final long _initNewV8Map(long p0);
    public native final long _initNewV8Object(long p0,Object p1);
    public native final long _initNewV8ObjectProxy(long p0,Object p1,long p2,boolean p3);
    public native final boolean _isWeak(long p0,long p1);
    public native final void _markReleasing(long p0);
    public native final void _recycleDirectBuffer(int p0);
    public native final int _registerExposedComponents(long p0,int p1,String[] p2,long[] p3,boolean p4);
    public native final void _release(long p0,long p1);
    public native final void _releaseBatch(long p0,long[] p1,int p2);
    public native final void _releaseMethodDescriptor(long p0,long p1);
    public native final void _releaseRuntime(long p0,int p1);
    public native final void _setWeak(long p0,long p1);
    public native final boolean _strictEquals(long p0,long p1,long p2);
    public native final String _toString(long p0,long p1);
    public void add(long p0,long p1,String p2,double p3){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, Double.valueOf(p3), this, V8.class, "71")) {
          return;
       }
       this._add(p0, p1, p2, p2.length(), p3);
       return;
    }
    public void add(long p0,long p1,String p2,int p3){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, Integer.valueOf(p3), this, V8.class, "65")) {
          return;
       }
       this._add(p0, p1, p2, p2.length(), p3);
       return;
    }
    public void add(long p0,long p1,String p2,String p3){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, p3, this, V8.class, "72")) {
          return;
       }
       this._add(p0, p1, p2, p2.length(), p3, p3.length());
       return;
    }
    public void add(long p0,long p1,String p2,boolean p3){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, Boolean.valueOf(p3), this, V8.class, "70")) {
          return;
       }
       this._add(p0, p1, p2, p2.length(), p3);
       return;
    }
    public void addArrayBooleanItem(long p0,long p1,boolean p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), this, V8.class, "88")) {
          return;
       }
       this._addArrayBooleanItem(p0, p1, p2);
       return;
    }
    public void addArrayDoubleItem(long p0,long p1,double p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Double.valueOf(p2), this, V8.class, "89")) {
          return;
       }
       this._addArrayDoubleItem(p0, p1, p2);
       return;
    }
    public void addArrayIntItem(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "87")) {
          return;
       }
       this._addArrayIntItem(p0, p1, p2);
       return;
    }
    public void addArrayNullItem(long p0,long p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "93")) {
          return;
       }
       this._addArrayNullItem(p0, p1);
       return;
    }
    public void addArrayObjectItem(long p0,long p1,long p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, V8.class, "91")) {
          return;
       }
       this._addArrayObjectItem(p0, p1, p2);
       return;
    }
    public void addArrayStringItem(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "90")) {
          return;
       }
       this._addArrayStringItem(p0, p1, p2);
       return;
    }
    public void addArrayUndefinedItem(long p0,long p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "92")) {
          return;
       }
       this._addArrayUndefinedItem(p0, p1);
       return;
    }
    public void addJsonNotLoadNum(int p0){
       this.mJsonproxyNotLoad = this.mJsonproxyNotLoad + p0;
    }
    public void addNull(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "74")) {
          return;
       }
       this._addNull(p0, p1, p2, p2.length());
       return;
    }
    public void addObject(long p0,long p1,String p2,long p3){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, Long.valueOf(p3), this, V8.class, "66")) {
          return;
       }
       this._addObject(p0, p1, p2, p2.length(), p3);
       return;
    }
    public void addPendingAction(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "5")) {
          return;
       }
       this.mPendingAction.add(p0);
       return;
    }
    public void addPropCallTime(float p0){
       this.mPropCallCostTime = this.mPropCallCostTime + p0;
    }
    public void addTrackedObj(long p0,V8Value p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8.class, "101")) {
          return;
       }
       if (this.isPendingReleased != null) {
          V8 tmPendingRem = this.mPendingRemovingObjs;
          _monitor_enter(tmPendingRem);
          this.mPendingRemovingObjs.put(Long.valueOf(p0), p1);
          _monitor_exit(tmPendingRem);
          return;
       }else {
          this.mTrackedObjs.put(Long.valueOf(p0), p1);
          return;
       }
    }
    public void addUndefined(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "73")) {
          return;
       }
       this._addUndefined(p0, p1, p2, p2.length());
       return;
    }
    public Object arrayGet(long p0,int p1,long p2,int p3){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), Integer.valueOf(p3), this, V8.class, "86");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._arrayGet(p0, p1, p2, p3);
    }
    public boolean arrayGetBoolean(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "82");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._arrayGetBoolean(p0, p1, p2);
    }
    public byte arrayGetByte(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "83");
          if (obj != PatchProxyResult.class) {
             return obj.byteValue();
          }
       }
       return this._arrayGetByte(p0, p1, p2);
    }
    public double arrayGetDouble(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "84");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return this._arrayGetDouble(p0, p1, p2);
    }
    public int arrayGetInteger(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "81");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._arrayGetInteger(p0, p1, p2);
    }
    public int arrayGetSize(long p0,long p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "80");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._arrayGetSize(p0, p1);
    }
    public String arrayGetString(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "85");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._arrayGetString(p0, p1, p2);
    }
    public void callObjectCreate(int p0,ByteBuffer p1,Object p2){
       V8MemBufferFromJS v8MemBufferF;
       int objectCnt;
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, V8.class, "67")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       int i = 0;
       if (p0 != 100) {
          if (p0 != 101) {
             return;
          }else {
             v8MemBufferF = V8MemBufferFromJS.obtain(p1, this);
             objectCnt = v8MemBufferF.getObjectCnt();
             for (; i < objectCnt; i = i + 1) {
                List list = v8MemBufferF.readObject();
                if (list instanceof V8Array) {
                   list = this.getList(list.getHandle());
                }else if(list instanceof V8Map){
                   list = this.getAll(list.getHandle());
                }else if(!list instanceof V8Function && list instanceof V8Object){
                   list = this.getAll(list.getHandle());
                }
                p2.add(list);
             }
             v8MemBufferF.recycle();
             return;
          }
       }else {
          v8MemBufferF = V8MemBufferFromJS.obtain(p1, this);
          objectCnt = v8MemBufferF.getObjectCnt();
          for (; i < objectCnt; i = i + 2) {
             String str = v8MemBufferF.readObject();
             List list1 = v8MemBufferF.readObject();
             if (list1 instanceof V8Array) {
                list1 = this.getList(list1.getHandle());
             }else if(list1 instanceof V8Map){
                list1 = this.getAll(list1.getHandle());
             }else if(!list1 instanceof V8Function && list1 instanceof V8Object){
                list1 = this.getAll(list1.getHandle());
             }
             p2.put(str, list1);
          }
          v8MemBufferF.recycle();
          return;
       }
    }
    public Object callObjectJavaMethod(long p0,V8Object p1,Object[] p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, V8.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       V8$MethodDescriptor methodDescri = this.functionRegistry.get(Long.valueOf(p0));
       V8$MethodDescriptor callback = methodDescri.callback;
       if (callback != null) {
          return V8ObjectUtilsQuick.toReturnObjectForV8(this.v8, callback.invoke(p1, p2));
       }else {
          V8Object v8Object = null;
          try{
             V8.sV8Receiver = p1;
             V8.sV8Receiver = v8Object;
             return V8ObjectUtilsQuick.toReturnObjectForV8(this.v8, methodDescri.method.invoke(methodDescri.object, p2));
          }catch(java.lang.reflect.InvocationTargetException e8){
             throw e8.getTargetException();
          }catch(java.lang.IllegalAccessException e8){
             throw e8;
          }catch(java.lang.IllegalArgumentException e8){
             throw e8;
          }
       }
    }
    public Object callObjectJavaMethodQuick(long p0,ByteBuffer p1){
       V8MemBufferFromJS obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, V8.class, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = V8MemBufferFromJS.obtain(p1, this.v8);
       V8Object v8Object = obj.readObject();
       Object[] allObjects = obj.getAllObjects();
       obj.recycle();
       V8$MethodDescriptor methodDescri = this.functionRegistry.get(Long.valueOf(p0));
       V8$MethodDescriptor callback = methodDescri.callback;
       if (callback != null) {
          return this.getQuickReturnObject(callback.invoke(v8Object, allObjects), p1);
       }else {
          V8.sV8Receiver = v8Object;
          V8.sV8Receiver = null;
          return this.getQuickReturnObject(methodDescri.method.invoke(methodDescri.object, allObjects), p1);
       }
    }
    public void callVoidJavaMethod(long p0,V8Object p1,Object[] p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, V8.class, "39")) {
          return;
       }
       V8$MethodDescriptor methodDescri = this.functionRegistry.get(Long.valueOf(p0));
       V8$MethodDescriptor voidCallback = methodDescri.voidCallback;
       if (voidCallback != null) {
          voidCallback.invoke(p1, p2);
          return;
       }else {
          V8Object v8Object = null;
          try{
             V8.sV8Receiver = p1;
             methodDescri.method.invoke(methodDescri.object, p2);
          }catch(java.lang.Exception e8){
             if (V8Plugins.getJSBindingErrorHandler() == null) {
                throw e8;
             }
             V8Plugins.getJSBindingErrorHandler().onExceptionCaptured(e8);
          }
          V8.sV8Receiver = v8Object;
          return;
       }
    }
    public void callVoidJavaMethodQuick(long p0,ByteBuffer p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8.class, "38")) {
          return;
       }
       V8MemBufferFromJS v8MemBufferF = V8MemBufferFromJS.obtain(p1, this.v8);
       v8MemBufferF.recycle();
       this.callVoidJavaMethod(p0, v8MemBufferF.readObject(), v8MemBufferF.getAllObjects());
       return;
    }
    public void checkRuntime(V8Value p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "29")) {
          return;
       }
       if (p0 == null || p0.isUndefined()) {
          return;
       }
       V8 runtime = p0.getRuntime();
       if (runtime != null && (!runtime.isReleased() && runtime == this)) {
          return;
       }
       throw new Error("Invalid target runtime");
    }
    public void checkThread(){
       if (PatchProxy.applyVoid(null, this, V8.class, "30")) {
          return;
       }
       this.locker.checkThread();
       if (!this.isReleased()) {
          return;
       }
       throw new Error("Runtime disposed error");
    }
    public void clearJsonNotLoadNum(){
       this.mJsonproxyNotLoad = 0;
    }
    public void clearPropCallCostTime(){
       this.mPropCallCostTime = 0;
    }
    public void clearWeak(long p0,long p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "48")) {
          return;
       }
       if (this.isPendingReleased != null) {
          return;
       }
       this._clearWeak(p0, p1);
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, V8.class, "16")) {
          return;
       }
       this.close(true);
       return;
    }
    public void close(boolean p0){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, V8.class, "17")) {
          return;
       }
       this.release(true, p0);
       return;
    }
    public void commitBatchCommands(ByteBuffer p0){
       String str;
       long l2;
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "113")) {
          return;
       }
       V8MemBufferFromJS v8MemBufferF = V8MemBufferFromJS.obtain(p0, this);
       while (v8MemBufferF.hasRemaining()) {
          long l = 0;
          if (BuildConfig.ENABLE_ANALYZE_PERFORMANCE.booleanValue()) {
             l = System.nanoTime();
          }
          int i = v8MemBufferF.readInt();
          int i1 = i & 0x00ff;
          int i2 = i >> 8;
          V8Object v8Object = null;
          Object[] objArray = null;
          switch (i1){
              case 1:
                this.execSetReceiver(v8MemBufferF.readObject());
                break;
              case 2:
                this.execSetStyle(i2, v8MemBufferF.readObject(), v8MemBufferF.readObject());
                break;
              case 3:
                this.execSetProp(i2, v8MemBufferF.readObject(), v8MemBufferF.readObject());
                break;
              case 4:
                str = null;
                l2 = v8MemBufferF.readObject().longValue();
                i1 = v8MemBufferF.readObject().intValue();
                if (i1 > 0) {
                   objArray = new Object[i1];
                   for (; v8Object < i1; v8Object = v8Object + 1) {
                      objArray[v8Object] = v8MemBufferF.readObject();
                   }
                }
                this.execCallMethod(i2, l2, str, objArray, false);
                break;
              case 5:
                str = null;
                l2 = v8MemBufferF.readObject().longValue();
                i1 = v8MemBufferF.readObject().intValue();
                if (i1 > 0) {
                   objArray = new Object[i1];
                   for (; v8Object < i1; v8Object = v8Object + 1) {
                      objArray[v8Object] = v8MemBufferF.readObject();
                   }
                }
                this.execCallMethod(i2, l2, str, objArray, true);
                break;
              case 6:
                this.execGetProp(i2, v8MemBufferF.readObject());
                break;
              default:
          }
          if (BuildConfig.ENABLE_ANALYZE_PERFORMANCE.booleanValue()) {
             long l1 = System.nanoTime() - l;
             float f = (float)l1 / 1000.00f;
             f = f / 1000.00f;
             V8Trace.addCommunicationCost(this, f);
          }
       }
       v8MemBufferF.recycle();
       return;
    }
    public void commitCommand(int p0,int p1,int p2,long p3,int p4,Object[] p5,Object p6){
       int i = p1;
       int i1 = p2;
       object oobject = p5;
       object oobject1 = p6;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(V8.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),Integer.valueOf(p4),oobject,oobject1};
          if (PatchProxy.applyVoid(objArray, this, V8.class, "114")) {
             return;
          }
       }
       long l = 0;
       Boolean eNABLE_ANALY = BuildConfig.ENABLE_ANALYZE_PERFORMANCE;
       if (eNABLE_ANALY.booleanValue()) {
          l = System.nanoTime();
       }
       try{
          long l1 = l;
          switch (i){
              case 1:
                this.execSetReceiver(oobject[i3]);
                break;
              case 2:
                this.execSetStyle(i1, oobject[i3], oobject[i2]);
                break;
              case 3:
                this.execSetProp(i1, oobject[i3], oobject[i2]);
                break;
              case 4:
                this.execCallMethod(p2, p3, null, p5, false);
                break;
              case 5:
                this.execCallMethod(p2, p3, null, p5, true);
                break;
              case 6:
                this.execGetProp(i1, oobject[i3]);
                break;
              default:
          }
          if (eNABLE_ANALY.booleanValue()) {
             V8Trace.addCommunicationCost(this, (((float)(System.nanoTime() - l1) / 1000.00f) / 1000.00f));
          }
          return;
       }catch(java.lang.Exception e0){
          String str = "Native ErrorMsg : ";
          if (oobject1) {
             String str1 = " ; ";
             str = (oobject1 instanceof String)? str+oobject1+str1: str+"errorMsg name is "+p6.toString()+str1;
          }else {
             str = "Native ErrorMsg : errMsg is null ; ";
          }
          throw new RuntimeException(str+"Java ErrorMsg :  fromIndex = "+p0+" , "+e0.getMessage()+" , cmd = "+i+" , seqNum = "+i1+" ,argLen = "+p4+" , params = "+oobject, e0);
       }
    }
    public final void commitStyleIfNecessary(){
       if (PatchProxy.applyVoid(null, this, V8.class, "116")) {
          return;
       }
       if (this.mCurrentStyle != null) {
          if (this.mReceiver == null) {
             return;
          }else {
             V8$StyleRunner styleRunner = new V8$StyleRunner();
             V8 tmStyleSeq = this.mStyleSeq;
             styleRunner.seqNum = tmStyleSeq;
             styleRunner.mReceiver = this.mReceiver;
             styleRunner.style = this.mCurrentStyle;
             this.mCmds.append(tmStyleSeq, styleRunner);
             this.mCurrentStyle = null;
             this.mStyleSeq = -1;
          }
       }
       return;
    }
    public long compileCodeCache(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, V8.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       this.checkReleased();
       return this._compileCodeCache(this.getV8RuntimePtr(), p0, p2, p1, 0);
    }
    public Object constructRealObject(V8ObjectProxy p0,String p1,Object[] p2){
       V8 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, V8.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBindingObjectCreator;
       if (obj != null) {
          return obj.constructRealObject(p0, p1, p2);
       }
       return null;
    }
    public boolean contains(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "51");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._contains(p0, p1, p2);
    }
    public void createAndRegisterMethodDescriptor(JavaCallback p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, V8.class, "32")) {
          return;
       }
       V8$MethodDescriptor methodDescri = new V8$MethodDescriptor(this, null);
       methodDescri.callback = p0;
       methodDescri.functionName = p2;
       this.functionRegistry.put(Long.valueOf(p1), methodDescri);
       return;
    }
    public void createAndRegisterVoidMethodDescriptor(JavaVoidCallback p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, V8.class, "33")) {
          return;
       }
       V8$MethodDescriptor methodDescri = new V8$MethodDescriptor(this, null);
       methodDescri.voidCallback = p0;
       methodDescri.functionName = p2;
       this.functionRegistry.put(Long.valueOf(p1), methodDescri);
       return;
    }
    public ByteBuffer createV8ArrayBufferBackingStore(long p0,long p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, V8.class, "77");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._createV8ArrayBufferBackingStore(p0, p1, p2);
    }
    public void disposeMethodID(long p0){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, V8.class, "35")) {
          return;
       }
       this.functionRegistry.remove(Long.valueOf(p0));
       return;
    }
    public boolean equals(long p0,long p1,long p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, V8.class, "61");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._equals(p0, p1, p2);
    }
    public final void execCallMethod(int p0,long p1,String p2,Object[] p3,boolean p4){
       V8$RTMethodRunner rTMethodRunn;
       if (PatchProxy.isSupport(V8.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, V8.class, "121")) {
             return;
          }
       }
       this.commitStyleIfNecessary();
       if (this.mReceiver == null) {
          return;
       }else if(p4){
          rTMethodRunn = new V8$RTMethodRunner();
       }else {
          rTMethodRunn = new V8$MethodRunner();
       }
       rTMethodRunn.mReceiver = this.mReceiver;
       rTMethodRunn.seqNum = p0;
       rTMethodRunn.args = p3;
       rTMethodRunn.funcName = p2;
       rTMethodRunn.methId = p1;
       this.mCmds.append(p0, rTMethodRunn);
       return;
    }
    public final void execGetProp(int p0,String p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, V8.class, "120")) {
          return;
       }
       this.commitStyleIfNecessary();
       if (this.mReceiver == null) {
          return;
       }
       V8$PropRunner propRunner = new V8$PropRunner();
       propRunner.mReceiver = this.mReceiver;
       propRunner.seqNum = p0;
       propRunner.key = p1;
       propRunner.isGetter = true;
       this.mCmds.append(p0, propRunner);
       return;
    }
    public final void execSetProp(int p0,String p1,Object p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, V8.class, "119")) {
          return;
       }
       this.commitStyleIfNecessary();
       if (this.mReceiver == null) {
          return;
       }
       V8$PropRunner propRunner = new V8$PropRunner();
       propRunner.mReceiver = this.mReceiver;
       propRunner.seqNum = p0;
       propRunner.key = p1;
       propRunner.value = p2;
       if (p2 instanceof V8Value) {
          propRunner.hasRef = true;
       }
       this.mCmds.append(p0, propRunner);
       return;
    }
    public final void execSetReceiver(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "117")) {
          return;
       }
       this.commitStyleIfNecessary();
       this.mReceiver = p0;
       return;
    }
    public final void execSetStyle(int p0,String p1,Object p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, V8.class, "118")) {
          return;
       }
       if (this.mCurrentStyle == null) {
          this.mCurrentStyle = new AutoExpandedMap();
          this.mStyleSeq = p0;
       }
       this.mCurrentStyle.put(p1, V8ObjectUtilsQuick.getValue(p2));
       return;
    }
    public Object executeFunction(long p0,int p1,long p2,String p3,Object[] p4){
       Object obj1;
       Object obj = this;
       object oobject = p4;
       int i = 0;
       if (PatchProxy.isSupport(V8.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Integer.valueOf(p1),Long.valueOf(p2),p3,oobject};
          obj1 = PatchProxy.apply(objArray, obj, V8.class, "57");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (obj.isPendingReleased != null) {
          return null;
       }else {
          Object[] objArray1 = V8ObjectUtilsQuick.toReturnArrayForV8(obj, new Boolean(i), oobject);
          this.onEnterStack();
          int i1 = (objArray1 == null)? 0: objArray1.length;
          obj1 = this._executeFunction(obj.mSessionId, p0, p1, p2, p3, 0, i1, objArray1);
          this.onExitStack();
          Object[] objArray2 = objArray1;
          if (objArray2 != null) {
             int len = objArray2.length;
             while (i < len) {
                object oobject1 = objArray2[i];
                if (oobject1 instanceof V8OneTimeObject) {
                   oobject1.close();
                }else if(oobject1 instanceof V8JSONProxy){
                   obj.weakJSONProxy(oobject1);
                }
                i = i + 1;
             }
          }
          return obj1;
       }
    }
    public Object executeFunction(long p0,long p1,long p2,Object[] p3){
       Object this;
       V8 v8 = this;
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), p3, this, V8.class, "58");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (v8.isPendingReleased != null) {
          return null;
       }else {
          boolean b = false;
          Object[] objArray = V8ObjectUtilsQuick.toReturnArrayForV8(v8, new Boolean(b), p3);
          this.onEnterStack();
          int i = (objArray == null)? 0: objArray.length;
          this = this._executeFunction(v8.mSessionId, p0, p1, p2, 0, i, objArray);
          this.onExitStack();
          Object[] objArray1 = objArray;
          if (objArray1 != null) {
             int len = objArray1.length;
             while (b < len) {
                object oobject = objArray1[b];
                if (oobject instanceof V8OneTimeObject) {
                   oobject.close();
                }else if(oobject instanceof V8JSONProxy){
                   v8.weakJSONProxy(oobject);
                }
                b = b + 1;
             }
          }
          return this;
       }
    }
    public Object executeScript(long p0,int p1,String p2,String p3,int p4,long p5){
       V8 v8 = this;
       if (PatchProxy.isSupport(V8.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Integer.valueOf(p1),p2,p3,Integer.valueOf(p4),Long.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, V8.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (v8.isPendingReleased != null) {
          return null;
       }else {
          this.onEnterStack();
          this.onExitStack();
          return this._executeScript(v8.mSessionId, p0, p1, p2, p3, p4, p5);
       }
    }
    public Object executeScript(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.executeScript(p0, null, 0);
    }
    public Object executeScript(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.checkThread();
       V8.checkScript(p0);
       return this.executeScript(this.getV8RuntimePtr(), 0, p0, p1, 0, 0);
    }
    public Object executeScript(String p0,String p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, V8.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.checkThread();
       V8.checkScript(p0);
       return this.executeScript(this.getV8RuntimePtr(), 0, p0, p1, p2, 0);
    }
    public Object executeScript(String p0,String p1,int p2,long p3){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, V8.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.checkThread();
       V8.checkScript(p0);
       return this.executeScript(this.getV8RuntimePtr(), 0, p0, p1, p2, p3);
    }
    public void executeVoidFunction(long p0,long p1,String p2,Object[] p3){
       object this;
       V8 v8 = this;
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, p3, this, V8.class, "59")) {
          return;
       }
       if (v8.isPendingReleased != null) {
          return;
       }
       boolean b = false;
       Object[] objArray = V8ObjectUtilsQuick.toReturnArrayForV8(this, new Boolean(b), p3);
       this.onEnterStack();
       int i = (objArray == null)? 0: objArray.length;
       this._executeVoidFunction(v8.mSessionId, p0, p1, p2, i, objArray);
       this.onExitStack();
       if (objArray != null) {
          int len = objArray.length;
          while (b < len) {
             this = objArray[b];
             if (this instanceof V8OneTimeObject) {
                this.close();
             }else if(this instanceof V8JSONProxy){
                this.weakJSONProxy(this);
             }
             b = b + 1;
          }
       }
       return;
    }
    public void executeVoidScript(long p0,String p1,String p2,int p3,long p4){
       V8 v8 = this;
       if (PatchProxy.isSupport(V8.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, V8.class, "46")) {
             return;
          }
       }
       if (v8.isPendingReleased != null) {
          return;
       }else {
          this.onEnterStack();
          this._executeScript(v8.mSessionId, p0, 0, p1, p2, p3, p4);
          this.onExitStack();
          return;
       }
    }
    public void executeVoidScript(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "27")) {
          return;
       }
       this.executeVoidScript(p0, null, 0);
       return;
    }
    public void executeVoidScript(String p0,String p1,int p2){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, V8.class, "28")) {
          return;
       }
       this.checkThread();
       V8.checkScript(p0);
       this.executeVoidScript(this.v8RuntimePtr, p0, p1, p2, 0);
       return;
    }
    public Object flush(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8.class, "115");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.commitBatchCommands(p0);
       this.commitStyleIfNecessary();
       this.mReceiver = null;
       V8 tmCmds = this.mCmds;
       this.mCmds = new SparseArray();
       int i = 0;
       V8ObjectProxy v8ObjectProx = null;
       V8ObjectProxy v8ObjectProx1 = v8ObjectProx;
       while (i < tmCmds.size()) {
          v8ObjectProx = tmCmds.valueAt(i);
          V8 tmBindingObj = this.mBindingObjectCreator;
          v8ObjectProx1 = (tmBindingObj != null)? tmBindingObj.onFlushCmd(v8ObjectProx, this): v8ObjectProx.exec(this);
          i = i + 1;
       }
       try{
          if (v8ObjectProx instanceof V8$RTMethodRunner) {
             return this.getQuickReturnObject(v8ObjectProx1, p0);
          }
          if (!v8ObjectProx instanceof V8$PropRunner || v8ObjectProx.isGetter == null) {
             return v8ObjectProx1;
          }
          if (v8ObjectProx1 != V8.sPropUnSupported) {
             return this.getQuickReturnObject(v8ObjectProx1, p0);
          }
          V8._setPropIgnored(p0);
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public Object get(long p0,int p1,long p2,String p3){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), p3, this, V8.class, "56");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._get(p0, p1, p2, p3);
    }
    public Map getAll(long p0){
       AutoExpandedMap obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "68");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 - null) {
          obj = new AutoExpandedMap();
          ByteBuffer uByteBuffer = this._getAllQuick(this.v8RuntimePtr, p0, true, obj);
          if (uByteBuffer != null) {
             this.callObjectCreate(100, uByteBuffer, obj);
             int i = 0;
             while (i < 16) {
                if (V8.sDirectBuffers[i] == uByteBuffer) {
                   this._recycleDirectBuffer(i);
                   break ;
                }
                i++;
             }
             return obj;
          }else {
             Map map = this._getAll(this.v8RuntimePtr, p0, obj);
             Iterator iterator = map.keySet().iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                List list = map.get(obj1);
                if (list instanceof V8Array) {
                   list = this.getList(list.getHandle());
                }else if(list instanceof V8Map){
                   list = this.getAll(list.getHandle());
                }else if(!list instanceof V8Function && list instanceof V8Object){
                   list = this.getAll(list.getHandle());
                }
                obj.put(obj1, list);
             }
             return obj;
          }
       }else {
          throw new RuntimeException("invalid object handle = "+p0);
       }
    }
    public int getArrayType(long p0,long p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "94");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._getArrayType(p0, p1);
    }
    public long getBindingIsolatePtr(){
       return this.isolatePtr;
    }
    public boolean getBoolean(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "53");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._getBoolean(p0, p1, p2);
    }
    public long getContextHandle(){
       Object obj = PatchProxy.apply(null, this, V8.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getContextHandle(this.v8RuntimePtr);
    }
    public double getDouble(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return this._getDouble(p0, p1, p2);
    }
    public int getInteger(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "52");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._getInteger(p0, p1, p2);
    }
    public long getIsolateHandle(){
       Object obj = PatchProxy.apply(null, this, V8.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._getIsolateHandle(this.v8RuntimePtr);
    }
    public int getJsonNotLoadNum(){
       return this.mJsonproxyNotLoad;
    }
    public List getList(long p0){
       AutoExpandedList obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "69");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 - null) {
          obj = new AutoExpandedList();
          ByteBuffer uByteBuffer = this._getListQuick(this.v8RuntimePtr, p0, obj);
          if (uByteBuffer != null) {
             this.callObjectCreate(101, uByteBuffer, obj);
             int i = 0;
             while (i < 16) {
                if (V8.sDirectBuffers[i] == uByteBuffer) {
                   this._recycleDirectBuffer(i);
                   break ;
                }
                i++;
             }
             return obj;
          }else {
             AutoExpandedList uAutoExpande = new AutoExpandedList();
             Iterator iterator = this._getList(this.v8RuntimePtr, p0, obj).iterator();
             while (iterator.hasNext()) {
                List list = iterator.next();
                if (list instanceof V8Array) {
                   list = this.getList(list.getHandle());
                }else if(list instanceof V8Map){
                   list = this.getAll(list.getHandle());
                }else if(!list instanceof V8Function && list instanceof V8Object){
                   list = this.getAll(list.getHandle());
                }
                uAutoExpande.add(list);
             }
             return uAutoExpande;
          }
       }else {
          throw new RuntimeException("invalid object handle = "+p0);
       }
    }
    public V8Locker getLocker(){
       return this.locker;
    }
    public long getObjectReferenceCount(){
       Object obj = PatchProxy.apply(null, this, V8.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.objectReferences - (long)this.v8WeakReferences.size());
    }
    public float getPropCallCostTime(){
       return this.mPropCallCostTime;
    }
    public final Object getQuickReturnObject(Object p0,ByteBuffer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p1 == null) {
          return obj;
       }
       if (p0 == null) {
          V8._setDByte(p1, 0, 0);
          return obj;
       }else if(p0 instanceof Integer){
          V8._setDInt(p1, 1, p0.intValue());
          return obj;
       }else {
          byte b = 2;
          if (p0 instanceof Double) {
             V8._setDDouble(p1, b, p0.doubleValue());
             return obj;
          }else if(p0 instanceof Float){
             V8._setDDouble(p1, b, p0.doubleValue());
             return obj;
          }else if(p0 instanceof Long){
             V8._setDLong(p1, 23, p0.longValue());
             return obj;
          }else if(p0 instanceof Boolean){
             V8._setDByte(p1, 3, p0.booleanValue());
             return obj;
          }else if(p0 instanceof String){
             V8._setUnProcessed(p1);
             return p0;
          }else if(p0 instanceof V8OneTimeObject){
             V8._setDLong(p1, 19, p0.getHandle());
             return obj;
          }else {
             byte b1 = 18;
             if (p0 instanceof V8Value) {
                V8._setDLong(p1, b1, p0.getHandle());
                return obj;
             }else if(p0 instanceof TypedArray){
                V8._setDLong(p1, b1, V8ObjectUtilsQuick.toV8TypedArray(this.v8, p0, obj).getHandle());
                return obj;
             }else if(p0 instanceof ArrayBuffer){
                V8._setDLong(p1, b1, V8ObjectUtilsQuick.toV8ArrayBuffer(this.v8, p0, obj).getHandle());
                return obj;
             }else if(p0 instanceof Map){
                V8._setDLong(p1, 19, V8ObjectUtilsQuick.toV8Object(this.v8, p0, obj).getHandle());
                return obj;
             }else if(p0 instanceof List){
                V8._setDLong(p1, 19, V8ObjectUtilsQuick.toV8Array(this.v8, p0, obj).getHandle());
                return obj;
             }else {
                V8._setUnProcessed(p1);
                throw new RuntimeException("Unsupported return object "+p0);
             }
          }
       }
    }
    public String getString(long p0,long p1,String p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, V8.class, "55");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._getString(p0, p1, p2);
    }
    public String getTraceTag(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return V8Trace.createTraceTag(this.businessName, this.bundleId, this.sessionId, p0, p1);
    }
    public Object getTrackedObj(long p0){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "104");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0 - this.v8RuntimePtr) {
          return this;
       }else {
          return this.mTrackedObjs.get(Long.valueOf(p0));
       }
    }
    public Object getTrackedObjOrCreate(long p0,long p1,int p2,Object p3){
       V8ObjectProxy obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), p3, this, V8.class, "105");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0 - this.v8RuntimePtr) {
          return this;
       }else {
          obj = this.mTrackedObjs.get(Long.valueOf(p0));
          if (obj == null) {
             if (p2 != 5) {
                if (p2 != 6) {
                   if (p2 != 7) {
                      if (p2 != 8) {
                         if (p2 != 10) {
                            if (p2 != 17) {
                               if (p2 == 22) {
                                  return new V8Map(this, p0);
                               }
                            }else if(!p1 - null){
                               return null;
                            }else {
                               obj = new V8ObjectProxy(this, p0, p1, null);
                               return null;
                            }
                         }else {
                            return new V8ArrayBuffer(this, p0, p3);
                         }
                      }else {
                         return new V8TypedArray(this, p0);
                      }
                   }else {
                      return new V8Function(this, p0);
                   }
                }else {
                   return new V8Object(this, p0);
                }
             }else {
                return new V8Array(this, p0);
             }
          }
          return obj;
       }
    }
    public long getV8RuntimePtr(){
       return this.v8RuntimePtr;
    }
    public int identityHash(long p0,long p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "64");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._identityHash(p0, p1);
    }
    public long initNewV8Array(long p0){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "78");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._initNewV8Array(p0);
    }
    public long initNewV8ArrayBuffer(long p0,int p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, V8.class, "76");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._initNewV8ArrayBuffer(p0, p1);
    }
    public long initNewV8ArrayBuffer(long p0,ByteBuffer p1,int p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, V8.class, "75");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._initNewV8ArrayBuffer(p0, p1, p2);
    }
    public long[] initNewV8Function(long p0,String p1,boolean p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, V8.class, "79");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.checkThread();
       return this._initNewV8Function(p0, p1, p2);
    }
    public long initNewV8Map(long p0){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._initNewV8Map(p0);
    }
    public long initNewV8Object(long p0,Object p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, V8.class, "42");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._initNewV8Object(p0, p1);
    }
    public long initNewV8ObjectProxy(long p0,Object p1,long p2,boolean p3){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, Long.valueOf(p2), Boolean.valueOf(p3), this, V8.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._initNewV8ObjectProxy(p0, p1, p2, p3);
    }
    public boolean isWeak(long p0,long p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "49");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._isWeak(p0, p1);
    }
    public final void notifyReleaseHandlers(V8 p0){
    }
    public final void onEnterStack(){
       if (PatchProxy.applyVoid(null, this, V8.class, "3")) {
          return;
       }
       V8 tmJsStackLev = this.mJsStackLevel;
       if (tmJsStackLev == null) {
          this.mSessionId = this.mSessionId + 1;
       }
       this.mJsStackLevel = tmJsStackLev + 1;
       tmJsStackLev = this.mStackListener;
       if (tmJsStackLev != null) {
          tmJsStackLev.onEnterStack();
       }
       return;
    }
    public final void onExitStack(){
       if (PatchProxy.applyVoid(null, this, V8.class, "4")) {
          return;
       }
       int i = this.mJsStackLevel - 1;
       this.mJsStackLevel = i;
       if (!i) {
          V8 tmStackListe = this.mStackListener;
          if (tmStackListe != null) {
             tmStackListe.onAllStacksFinish();
          }
          while (!this.mPendingAction.isEmpty()) {
             this.mPendingAction.remove(0).run();
          }
       }
       if (this.mJsStackLevel >= null) {
          return;
       }else {
          throw new RuntimeException("stack level mismatch error");
       }
    }
    public void onJsRefDestroy(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "128")) {
          return;
       }
       V8 tmBindingObj = this.mBindingObjectCreator;
       if (tmBindingObj != null) {
          tmBindingObj.onJsRefDestroy(p0, true);
       }
       return;
    }
    public Object onPropCall(long p0,boolean p1,String p2,Object p3){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, V8.class, "123");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = this.getTrackedObj(p0).onPropCall(p1, p2, p3);
       if (p1 && obj1 == V8.sPropUnSupported) {
          obj1 = null;
       }
       return obj1;
    }
    public Object onPropCall(V8Object p0,Object p1,String p2,boolean p3,String p4,Object p5){
       if (PatchProxy.isSupport(V8.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, V8.class, "126");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       V8 tmBindingObj = this.mBindingObjectCreator;
       if (tmBindingObj != null) {
          return tmBindingObj.onPropCall(p0, p1, p2, p3, p4, p5);
       }else {
          return null;
       }
    }
    public Object onPropCallQuick(long p0,boolean p1,ByteBuffer p2){
       V8MemBufferFromJS obj;
       if (PatchProxy.isSupport(V8.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Boolean.valueOf(p1), p2, this, V8.class, "122");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = V8MemBufferFromJS.obtain(p2, this.v8);
       V8Object trackedObj = this.getTrackedObj(p0);
       String str = obj.readObject();
       Object obj1 = (!p1)? obj.readObject(): null;
       obj.recycle();
       if (p1) {
          Object obj2 = trackedObj.onPropCall(p1, str, obj1);
          if (obj2 == V8.sPropUnSupported) {
             V8._setPropIgnored(p2);
             return null;
          }else {
             return this.getQuickReturnObject(obj2, p2);
          }
       }else {
          return trackedObj.onPropCall(p1, str, obj1);
       }
    }
    public String[] onPropEnumerator(long p0){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "124");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       V8Object v8Object = this.mTrackedObjs.get(Long.valueOf(p0));
       String[] stringArray = (v8Object == null)? null: v8Object.onPropEnumerator();
       return stringArray;
    }
    public String[] onPropEnumerator(V8ObjectProxy p0){
       V8 obj = PatchProxy.applyOneRefs(p0, this, V8.class, "127");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBindingObjectCreator;
       if (obj != null) {
          return obj.onPropEnumerator(p0);
       }
       return null;
    }
    public boolean pumpMessageLoop(){
       Object obj = PatchProxy.apply(null, this, V8.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return V8._pumpMessageLoop(this.v8RuntimePtr);
    }
    public int registerExposedComponents(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long[] olongArray = new long[p0.length];
       this.v8ExportDescriptorIndex = p0;
       this.v8ExportDescriptor = olongArray;
       int i = this._registerExposedComponents(this.v8RuntimePtr, p0.length, p0, olongArray, true);
       if (i > 0 && this.sV8ExportDescriptor == null) {
          HashMap hashMap = new HashMap();
          for (int i1 = 0; i1 < p0.length; i1 = i1 + 1) {
             hashMap.put(p0[i1], Integer.valueOf(i1));
          }
          this.sV8ExportDescriptor = hashMap;
       }
       return i;
    }
    public void registerInternalFunction(long p0,JavaCallback p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8.class, "34")) {
          return;
       }
       V8$MethodDescriptor methodDescri = new V8$MethodDescriptor(this, null);
       methodDescri.callback = p1;
       this.functionRegistry.put(Long.valueOf(p0), methodDescri);
       return;
    }
    public void release(){
       this.close(true);
    }
    public void release(long p0,long p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "50")) {
          return;
       }
       this._release(p0, p1);
       return;
    }
    public void release(boolean p0,boolean p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, V8.class, "18")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       this.checkThread();
       this.isPendingReleased = true;
       this._markReleasing(this.getV8RuntimePtr());
       this.notifyReleaseHandlers(this);
       this.mPendingAction.clear();
       this.releaseNativeMethodDescriptors();
       V8Value lock = V8.lock;
       _monitor_enter(lock);
       V8.runtimeCounter = V8.runtimeCounter - true;
       _monitor_exit(lock);
       if (p0) {
          this.getObjectReferenceCount();
       }
       this.mTrackedObjs.size();
       Iterator iterator = this.mTrackedObjs.values().iterator();
       while (iterator.hasNext()) {
          lock = iterator.next();
          if (!lock.isReleased()) {
             if (this.mBindingObjectCreator != null && lock instanceof V8ObjectProxy) {
                this.mBindingObjectCreator.onJsRefDestroy(lock.getNativeObject(), false);
             }
             lock.released = true;
             lock.objectHandle = 0;
          }
       }
       V8 tmPendingRem = this.mPendingRemovingObjs;
       _monitor_enter(tmPendingRem);
       Iterator iterator1 = this.mPendingRemovingObjs.values().iterator();
       while (iterator1.hasNext()) {
          V8Value v8Value = iterator1.next();
          if (!v8Value.isReleased()) {
             V8 tmBindingObj = this.mBindingObjectCreator;
             if (tmBindingObj != null && v8Value instanceof V8ObjectProxy) {
                tmBindingObj.onJsRefDestroy(v8Value.getNativeObject(), false);
             }
             v8Value.released = true;
             v8Value.objectHandle = 0;
          }
       }
       _monitor_exit(tmPendingRem);
       this.v8WeakReferences.clear();
       this.mTrackedObjs.clear();
       if (this.released == null) {
          if (p1) {
             this.releaseRuntime();
          }
          this.released = true;
       }
       return;
    }
    public void releaseMethodDescriptor(long p0,long p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "95")) {
          return;
       }
       this._releaseMethodDescriptor(p0, p1);
       return;
    }
    public final void releaseNativeMethodDescriptors(){
       if (PatchProxy.applyVoid(null, this, V8.class, "20")) {
          return;
       }
       Iterator iterator = this.functionRegistry.keySet().iterator();
       while (iterator.hasNext()) {
          long l = iterator.next().longValue();
          if (l - null > 0 && l - 99 < 0) {
             continue ;
          }else {
             this.releaseMethodDescriptor(this.v8RuntimePtr, l);
          }
       }
       return;
    }
    public void releaseRuntime(){
       if (PatchProxy.applyVoid(null, this, V8.class, "19")) {
          return;
       }
       if (this.runtimeRelesed == null) {
          this._releaseRuntime(this.v8RuntimePtr, 0);
          this.v8RuntimePtr = 0;
          this.runtimeRelesed = true;
       }
       return;
    }
    public void removePendingAction(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "6")) {
          return;
       }
       this.mPendingAction.remove(p0);
       return;
    }
    public boolean removeTrackedObj(long p0){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, V8.class, "102");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.isPendingReleased != null) {
          return false;
       }else {
          V8Value v8Value = this.mTrackedObjs.remove(Long.valueOf(p0));
          if (v8Value != null) {
             v8Value.released = true;
             v8Value.objectHandle = 0;
             v8Value.onJsRefDestroy();
             return true;
          }else {
             return false;
          }
       }
    }
    public void removeTrackedObjs(ByteBuffer p0,int p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, V8.class, "103")) {
          return;
       }
       this.mIsGcing = true;
       byte[] uobyteArray = p0.array();
       int i = p0.arrayOffset();
       int i1 = 0;
       while (i1 < p1) {
          int i2 = i1 * 8;
          i2 = i2 + i;
          V8Value v8Value = this.mTrackedObjs.remove(Long.valueOf(V8MemBufferFromJS.readLong(uobyteArray, i2)));
          if (v8Value != null) {
             v8Value.released = true;
             v8Value.objectHandle = 0;
             v8Value.onJsRefDestroy();
          }
          i1 = i1 + 1;
       }
       this.mIsGcing = false;
       return;
    }
    public void setBindingObjectCreator(V8$BindingObjectCreator p0){
       this.mBindingObjectCreator = p0;
    }
    public void setStackListener(V8$StackListener p0){
       this.mStackListener = p0;
    }
    public void setWeak(long p0,long p1){
       if (PatchProxy.isSupport(V8.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "47")) {
          return;
       }
       if (this.isPendingReleased != null) {
          return;
       }
       this._setWeak(p0, p1);
       return;
    }
    public boolean strictEquals(long p0,long p1,long p2){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, V8.class, "63");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._strictEquals(p0, p1, p2);
    }
    public String toString(long p0,long p1){
       if (PatchProxy.isSupport(V8.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, V8.class, "62");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._toString(p0, p1);
    }
    public final void weakJSONProxy(V8JSONProxy p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8.class, "60")) {
          return;
       }
       if (p0 == null || (!p0.isReleased() && !p0.isWeak())) {
          p0.setWeak();
       }
    label_001d :
       return;
    }
}
