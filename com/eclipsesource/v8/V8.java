package com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;
import java.lang.Object;
import com.eclipsesource.v8.V8Object$Undefined;
import java.lang.String;
import java.util.HashMap;
import java.util.LinkedList;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.V8Locker;
import com.eclipsesource.v8.LibraryLoader;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.util.Objects;
import com.eclipsesource.v8.NativeLibraryLoader;
import com.eclipsesource.v8.inspector.V8InspectorDelegate;
import java.nio.ByteBuffer;
import com.eclipsesource.v8.ReferenceHandler;
import com.eclipsesource.v8.utils.V8Runnable;
import com.eclipsesource.v8.V8Array;
import java.lang.Long;
import java.util.Map;
import com.eclipsesource.v8.V8$MethodDescriptor;
import com.eclipsesource.v8.JavaCallback;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Plugins$ErrorHandler;
import com.eclipsesource.v8.V8Plugins;
import java.lang.IllegalArgumentException;
import java.lang.Float;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Boolean;
import com.eclipsesource.v8.V8RuntimeException;
import java.lang.Class;
import java.lang.Error;
import com.eclipsesource.v8.V8$1;
import com.eclipsesource.v8.V8ResultUndefined;
import java.util.ArrayList;
import java.util.List;
import java.lang.System;
import com.eclipsesource.v8.V8Array$Undefined;
import com.eclipsesource.v8.utils.V8Executor;
import com.eclipsesource.v8.utils.V8Map;
import com.eclipsesource.v8.V8ExternalObject;
import java.lang.reflect.Array;
import java.lang.Void;
import java.util.Iterator;
import com.eclipsesource.v8.Releasable;
import java.util.Set;
import com.eclipsesource.v8.SignatureProvider;
import java.util.Collection;

public class V8 extends V8Object	// class@000fda
{
    public Map data;
    public V8Map executors;
    public Map externals;
    public boolean forceTerminateExecutors;
    public Map functionRegistry;
    public final V8Locker locker;
    public long methodId;
    public long objectReferences;
    public LinkedList referenceHandlers;
    public LinkedList releaseHandlers;
    public List resources;
    public SignatureProvider signatureProvider;
    public long v8RuntimePtr;
    public Map v8WeakReferences;
    public static boolean initialized;
    public static Object invalid;
    public static final Object lock;
    public static boolean nativeLibraryLoaded;
    public static Error nativeLoadError;
    public static Exception nativeLoadException;
    public static int runtimeCounter;
    public static V8Object sV8Receiver;
    public static V8Value undefined;
    public static String v8Flags;

    static {
       V8.lock = new Object();
       V8.undefined = new V8Object$Undefined();
       V8.invalid = new Object();
    }
    public void V8(){
       super(null);
    }
    public void V8(String p0){
       super(null);
       this.v8WeakReferences = new HashMap();
       this.data = null;
       this.signatureProvider = null;
       this.objectReferences = 0;
       this.v8RuntimePtr = 0;
       this.resources = null;
       this.executors = null;
       this.forceTerminateExecutors = false;
       this.functionRegistry = new HashMap();
       this.referenceHandlers = new LinkedList();
       this.releaseHandlers = new LinkedList();
       this.externals = new HashMap();
       this.released = false;
       this.v8RuntimePtr = this._createIsolate(p0);
       this.locker = new V8Locker(this);
       this.checkThread();
       this.objectHandle = this._getGlobalObject(this.v8RuntimePtr);
    }
    public static native long _getBuildID();
    public static native String _getVersion();
    public static native boolean _isNodeCompatible();
    public static native boolean _isRunning(long p0);
    public static native boolean _pumpMessageLoop(long p0);
    public static native void _setFlags(String p0);
    public static native void _startNodeJS(long p0,String p1);
    public static void checkNativeLibraryLoaded(){
       if (V8.nativeLibraryLoaded) {
          return;
       }
       String str = "J2V8 native library not loaded \("+LibraryLoader.computeLibraryShortName(false)+"/"+LibraryLoader.computeLibraryShortName(true)+"\)";
       if (V8.nativeLoadError != null) {
          throw new IllegalStateException(str, V8.nativeLoadError);
       }
       if (V8.nativeLoadException != null) {
          throw new IllegalStateException(str, V8.nativeLoadException);
       }
       throw new IllegalStateException(str);
    }
    public static void checkScript(String p0){
       Objects.requireNonNull(p0, "Script is null");
    }
    public static V8 createV8Runtime(){
       return V8.createV8Runtime(null, null);
    }
    public static V8 createV8Runtime(String p0){
       return V8.createV8Runtime(p0, null);
    }
    public static V8 createV8Runtime(String p0,String p1){
       if (!V8.nativeLibraryLoaded) {
          Object lock = V8.lock;
          _monitor_enter(lock);
          if (!V8.nativeLibraryLoaded) {
             V8.load(p1, null);
          }
          _monitor_exit(lock);
       }
       V8.checkNativeLibraryLoaded();
       if (!V8.initialized) {
          V8._setFlags(V8.v8Flags);
          V8.initialized = true;
       }
       p0 = V8.lock;
       _monitor_enter(p0);
       V8.runtimeCounter = V8.runtimeCounter + true;
       _monitor_exit(p0);
       return new V8(p0);
    }
    public static int getActiveRuntimes(){
       return V8.runtimeCounter;
    }
    public static long getBuildID(){
       return V8._getBuildID();
    }
    public static String getSCMRevision(){
       return "Unknown revision ID";
    }
    public static V8Value getUndefined(){
       return V8.undefined;
    }
    public static V8Object getV8Receiver(){
       return V8.sV8Receiver;
    }
    public static String getV8Version(){
       return V8._getVersion();
    }
    public static boolean isLoaded(){
       return V8.nativeLibraryLoaded;
    }
    public static boolean isNodeCompatible(){
       if (!V8.nativeLibraryLoaded) {
          Object lock = V8.lock;
          _monitor_enter(lock);
          if (!V8.nativeLibraryLoaded) {
             V8.load(null, null);
          }
          _monitor_exit(lock);
       }
       return V8._isNodeCompatible();
    }
    public static synchronized void load(String p0,NativeLibraryLoader p1){
       _monitor_enter(V8.class);
       try{
          LibraryLoader.loadLibrary(p0, p1);
          V8.nativeLibraryLoaded = true;
          _monitor_exit(V8.class);
          return;
       }catch(java.lang.Error e1){
          V8.nativeLoadError = e1;
          throw e1;
       }catch(java.lang.Exception e1){
          V8.nativeLoadException = e1;
          throw e1;
       }
    }
    public static void loadNativeLibraries(NativeLibraryLoader p0){
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
    public static void setFlags(String p0){
       V8.v8Flags = p0;
       V8.initialized = false;
    }
    public native final void _acquireLock(long p0);
    public native final void _add(long p0,long p1,String p2,double p3);
    public native final void _add(long p0,long p1,String p2,int p3);
    public native final void _add(long p0,long p1,String p2,String p3);
    public native final void _add(long p0,long p1,String p2,boolean p3);
    public native final void _addArrayBooleanItem(long p0,long p1,boolean p2);
    public native final void _addArrayDoubleItem(long p0,long p1,double p2);
    public native final void _addArrayIntItem(long p0,long p1,int p2);
    public native final void _addArrayNullItem(long p0,long p1);
    public native final void _addArrayObjectItem(long p0,long p1,long p2);
    public native final void _addArrayStringItem(long p0,long p1,String p2);
    public native final void _addArrayUndefinedItem(long p0,long p1);
    public native final void _addNull(long p0,long p1,String p2);
    public native final void _addObject(long p0,long p1,String p2,long p3);
    public native final void _addUndefined(long p0,long p1,String p2);
    public native final Object _arrayGet(long p0,int p1,long p2,int p3);
    public native final boolean _arrayGetBoolean(long p0,long p1,int p2);
    public native final int _arrayGetBooleans(long p0,long p1,int p2,int p3,boolean[] p4);
    public native final boolean[] _arrayGetBooleans(long p0,long p1,int p2,int p3);
    public native final byte _arrayGetByte(long p0,long p1,int p2);
    public native final int _arrayGetBytes(long p0,long p1,int p2,int p3,byte[] p4);
    public native final byte[] _arrayGetBytes(long p0,long p1,int p2,int p3);
    public native final double _arrayGetDouble(long p0,long p1,int p2);
    public native final int _arrayGetDoubles(long p0,long p1,int p2,int p3,double[] p4);
    public native final double[] _arrayGetDoubles(long p0,long p1,int p2,int p3);
    public native final int _arrayGetInteger(long p0,long p1,int p2);
    public native final int _arrayGetIntegers(long p0,long p1,int p2,int p3,int[] p4);
    public native final int[] _arrayGetIntegers(long p0,long p1,int p2,int p3);
    public native final int _arrayGetSize(long p0,long p1);
    public native final String _arrayGetString(long p0,long p1,int p2);
    public native final int _arrayGetStrings(long p0,long p1,int p2,int p3,String[] p4);
    public native final String[] _arrayGetStrings(long p0,long p1,int p2,int p3);
    public native final void _clearWeak(long p0,long p1);
    public native final boolean _contains(long p0,long p1,String p2);
    public native final long _createInspector(long p0,V8InspectorDelegate p1,String p2);
    public native final long _createIsolate(String p0);
    public native final void _createTwin(long p0,long p1,long p2);
    public native final ByteBuffer _createV8ArrayBufferBackingStore(long p0,long p1,int p2);
    public native final void _dispatchProtocolMessage(long p0,long p1,String p2);
    public native final boolean _equals(long p0,long p1,long p2);
    public native final boolean _executeBooleanFunction(long p0,long p1,String p2,long p3);
    public native final boolean _executeBooleanScript(long p0,String p1,String p2,int p3);
    public native final double _executeDoubleFunction(long p0,long p1,String p2,long p3);
    public native final double _executeDoubleScript(long p0,String p1,String p2,int p3);
    public native final Object _executeFunction(long p0,int p1,long p2,String p3,long p4);
    public native final Object _executeFunction(long p0,long p1,long p2,long p3);
    public native final int _executeIntegerFunction(long p0,long p1,String p2,long p3);
    public native final int _executeIntegerScript(long p0,String p1,String p2,int p3);
    public native final Object _executeScript(long p0,int p1,String p2,String p3,int p4);
    public native final String _executeStringFunction(long p0,long p1,String p2,long p3);
    public native final String _executeStringScript(long p0,String p1,String p2,int p3);
    public native final void _executeVoidFunction(long p0,long p1,String p2,long p3);
    public native final void _executeVoidScript(long p0,String p1,String p2,int p3);
    public native final Object _get(long p0,int p1,long p2,String p3);
    public native final int _getArrayType(long p0,long p1);
    public native final boolean _getBoolean(long p0,long p1,String p2);
    public native final String _getConstructorName(long p0,long p1);
    public native final double _getDouble(long p0,long p1,String p2);
    public native final long _getGlobalObject(long p0);
    public native final int _getInteger(long p0,long p1,String p2);
    public native final String[] _getKeys(long p0,long p1);
    public native final String _getString(long p0,long p1,String p2);
    public native final int _getType(long p0,long p1);
    public native final int _getType(long p0,long p1,int p2);
    public native final int _getType(long p0,long p1,int p2,int p3);
    public native final int _getType(long p0,long p1,String p2);
    public native final int _identityHash(long p0,long p1);
    public native final long _initEmptyContainer(long p0);
    public native final long _initNewV8Array(long p0);
    public native final long _initNewV8ArrayBuffer(long p0,int p1);
    public native final long _initNewV8ArrayBuffer(long p0,ByteBuffer p1,int p2);
    public native final long _initNewV8Float32Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8Float64Array(long p0,long p1,int p2,int p3);
    public native final long[] _initNewV8Function(long p0);
    public native final long _initNewV8Int16Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8Int32Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8Int8Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8Object(long p0);
    public native final long _initNewV8UInt16Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8UInt32Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8UInt8Array(long p0,long p1,int p2,int p3);
    public native final long _initNewV8UInt8ClampedArray(long p0,long p1,int p2,int p3);
    public native final boolean _isWeak(long p0,long p1);
    public native final void _lowMemoryNotification(long p0);
    public native final long _registerJavaMethod(long p0,long p1,String p2,boolean p3);
    public native final void _release(long p0,long p1);
    public native final void _releaseLock(long p0);
    public native final void _releaseMethodDescriptor(long p0,long p1);
    public native final void _releaseRuntime(long p0);
    public native final boolean _sameValue(long p0,long p1,long p2);
    public native final void _schedulePauseOnNextStatement(long p0,long p1,String p2);
    public native final void _setPrototype(long p0,long p1,long p2);
    public native final void _setWeak(long p0,long p1);
    public native final boolean _strictEquals(long p0,long p1,long p2);
    public native final void _terminateExecution(long p0);
    public native final String _toString(long p0,long p1);
    public void acquireLock(long p0){
       this._acquireLock(p0);
    }
    public void add(long p0,long p1,String p2,double p3){
       this._add(p0, p1, p2, p3);
    }
    public void add(long p0,long p1,String p2,int p3){
       this._add(p0, p1, p2, p3);
    }
    public void add(long p0,long p1,String p2,String p3){
       this._add(p0, p1, p2, p3);
    }
    public void add(long p0,long p1,String p2,boolean p3){
       this._add(p0, p1, p2, p3);
    }
    public void addArrayBooleanItem(long p0,long p1,boolean p2){
       this._addArrayBooleanItem(p0, p1, p2);
    }
    public void addArrayDoubleItem(long p0,long p1,double p2){
       this._addArrayDoubleItem(p0, p1, p2);
    }
    public void addArrayIntItem(long p0,long p1,int p2){
       this._addArrayIntItem(p0, p1, p2);
    }
    public void addArrayNullItem(long p0,long p1){
       this._addArrayNullItem(p0, p1);
    }
    public void addArrayObjectItem(long p0,long p1,long p2){
       this._addArrayObjectItem(p0, p1, p2);
    }
    public void addArrayStringItem(long p0,long p1,String p2){
       this._addArrayStringItem(p0, p1, p2);
    }
    public void addArrayUndefinedItem(long p0,long p1){
       this._addArrayUndefinedItem(p0, p1);
    }
    public void addNull(long p0,long p1,String p2){
       this._addNull(p0, p1, p2);
    }
    public void addObjRef(V8Value p0){
       this.objectReferences = this.objectReferences + 1;
       if (!this.referenceHandlers.isEmpty()) {
          this.notifyReferenceCreated(p0);
       }
       return;
    }
    public void addObject(long p0,long p1,String p2,long p3){
       this._addObject(p0, p1, p2, p3);
    }
    public void addReferenceHandler(ReferenceHandler p0){
       this.referenceHandlers.add(0, p0);
    }
    public void addReleaseHandler(V8Runnable p0){
       this.releaseHandlers.add(p0);
    }
    public void addUndefined(long p0,long p1,String p2){
       this._addUndefined(p0, p1, p2);
    }
    public Object arrayGet(long p0,int p1,long p2,int p3){
       return this._arrayGet(p0, p1, p2, p3);
    }
    public boolean arrayGetBoolean(long p0,long p1,int p2){
       return this._arrayGetBoolean(p0, p1, p2);
    }
    public int arrayGetBooleans(long p0,long p1,int p2,int p3,boolean[] p4){
       return this._arrayGetBooleans(p0, p1, p2, p3, p4);
    }
    public boolean[] arrayGetBooleans(long p0,long p1,int p2,int p3){
       return this._arrayGetBooleans(p0, p1, p2, p3);
    }
    public byte arrayGetByte(long p0,long p1,int p2){
       return this._arrayGetByte(p0, p1, p2);
    }
    public int arrayGetBytes(long p0,long p1,int p2,int p3,byte[] p4){
       return this._arrayGetBytes(p0, p1, p2, p3, p4);
    }
    public byte[] arrayGetBytes(long p0,long p1,int p2,int p3){
       return this._arrayGetBytes(p0, p1, p2, p3);
    }
    public double arrayGetDouble(long p0,long p1,int p2){
       return this._arrayGetDouble(p0, p1, p2);
    }
    public int arrayGetDoubles(long p0,long p1,int p2,int p3,double[] p4){
       return this._arrayGetDoubles(p0, p1, p2, p3, p4);
    }
    public double[] arrayGetDoubles(long p0,long p1,int p2,int p3){
       return this._arrayGetDoubles(p0, p1, p2, p3);
    }
    public int arrayGetInteger(long p0,long p1,int p2){
       return this._arrayGetInteger(p0, p1, p2);
    }
    public int arrayGetIntegers(long p0,long p1,int p2,int p3,int[] p4){
       return this._arrayGetIntegers(p0, p1, p2, p3, p4);
    }
    public int[] arrayGetIntegers(long p0,long p1,int p2,int p3){
       return this._arrayGetIntegers(p0, p1, p2, p3);
    }
    public int arrayGetSize(long p0,long p1){
       return this._arrayGetSize(p0, p1);
    }
    public String arrayGetString(long p0,long p1,int p2){
       return this._arrayGetString(p0, p1, p2);
    }
    public int arrayGetStrings(long p0,long p1,int p2,int p3,String[] p4){
       return this._arrayGetStrings(p0, p1, p2, p3, p4);
    }
    public String[] arrayGetStrings(long p0,long p1,int p2,int p3){
       return this._arrayGetStrings(p0, p1, p2, p3);
    }
    public Object callObjectJavaMethod(long p0,V8Object p1,V8Array p2){
       V8$MethodDescriptor methodDescri = this.functionRegistry.get(Long.valueOf(p0));
       V8$MethodDescriptor callback = methodDescri.callback;
       if (callback != null) {
          return this.checkResult(callback.invoke(p1, p2));
       }
       boolean b = methodDescri.method.isVarArgs();
       Object[] args = this.getArgs(p1, methodDescri, p2, b);
       this.checkArgs(args);
       try{
          int i = 0;
          V8.sV8Receiver = p1;
          V8.sV8Receiver = i;
          this.releaseArguments(args, b);
          return this.checkResult(methodDescri.method.invoke(methodDescri.object, args));
       }catch(java.lang.reflect.InvocationTargetException e2){
          throw e2.getTargetException();
       }catch(java.lang.IllegalAccessException e2){
          throw e2;
       }catch(java.lang.IllegalArgumentException e2){
          throw e2;
       }
    }
    public void callVoidJavaMethod(long p0,V8Object p1,V8Array p2){
       int i;
       V8$MethodDescriptor methodDescri = this.functionRegistry.get(Long.valueOf(p0));
       V8$MethodDescriptor voidCallback = methodDescri.voidCallback;
       if (voidCallback != null) {
          voidCallback.invoke(p1, p2);
          return;
       }else {
          boolean b = methodDescri.method.isVarArgs();
          Object[] args = this.getArgs(p1, methodDescri, p2, b);
          this.checkArgs(args);
          try{
             i = 0;
             V8.sV8Receiver = p1;
             methodDescri.method.invoke(methodDescri.object, args);
          }catch(java.lang.Exception e2){
             if (V8Plugins.getJSBindingErrorHandler() == null) {
                throw e2;
             }
             V8Plugins.getJSBindingErrorHandler().onExceptionCaptured(e2);
          }
          V8.sV8Receiver = i;
          this.releaseArguments(args, b);
          return;
       }
    }
    public final void checkArgs(Object[] p0){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          if (p0[i] != V8.invalid) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("argument type mismatch");
    }
    public final Object checkResult(Object p0){
       if (p0 == null) {
          return p0;
       }
       if (p0 instanceof Float) {
          return Double.valueOf(p0.doubleValue());
       }
       if (!p0 instanceof Integer && (!p0 instanceof Double && (p0 instanceof Boolean || p0 instanceof String))) {
          return p0;
       }
       if (!p0 instanceof V8Value) {
          throw new V8RuntimeException("Unknown return type: "+p0.getClass());
       }
       if (!p0.isReleased()) {
          return p0;
       }
       throw new V8RuntimeException("V8Value already released");
    }
    public void checkRuntime(V8Value p0){
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
       this.locker.checkThread();
       if (!this.isReleased()) {
          return;
       }
       throw new Error("Runtime disposed error");
    }
    public void clearWeak(long p0,long p1){
       this._clearWeak(p0, p1);
    }
    public void close(){
       this.release(true);
    }
    public boolean contains(long p0,long p1,String p2){
       return this._contains(p0, p1, p2);
    }
    public void createAndRegisterMethodDescriptor(JavaCallback p0,long p1){
       V8$MethodDescriptor methodDescri = new V8$MethodDescriptor(this, null);
       methodDescri.callback = p0;
       this.functionRegistry.put(Long.valueOf(p1), methodDescri);
    }
    public long createInspector(V8InspectorDelegate p0,String p1){
       return this._createInspector(this.v8RuntimePtr, p0, p1);
    }
    public void createNodeRuntime(String p0){
       V8._startNodeJS(this.v8RuntimePtr, p0);
    }
    public void createTwin(long p0,long p1,long p2){
       this._createTwin(p0, p1, p2);
    }
    public void createTwin(V8Value p0,V8Value p1){
       this.checkThread();
       this.createTwin(this.v8RuntimePtr, p0.getHandle(), p1.getHandle());
    }
    public ByteBuffer createV8ArrayBufferBackingStore(long p0,long p1,int p2){
       return this._createV8ArrayBufferBackingStore(p0, p1, p2);
    }
    public void dispatchProtocolMessage(long p0,String p1){
       this.checkThread();
       this._dispatchProtocolMessage(this.v8RuntimePtr, p0, p1);
    }
    public void disposeMethodID(long p0){
       this.functionRegistry.remove(Long.valueOf(p0));
    }
    public boolean equals(long p0,long p1,long p2){
       return this._equals(p0, p1, p2);
    }
    public V8Array executeArrayScript(String p0){
       return this.executeArrayScript(p0, null, 0);
    }
    public V8Array executeArrayScript(String p0,String p1,int p2){
       this.checkThread();
       p0 = this.executeScript(p0, p1, p2);
       if (p0 instanceof V8Array) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public boolean executeBooleanFunction(long p0,long p1,String p2,long p3){
       return this._executeBooleanFunction(p0, p1, p2, p3);
    }
    public boolean executeBooleanScript(long p0,String p1,String p2,int p3){
       return this._executeBooleanScript(p0, p1, p2, p3);
    }
    public boolean executeBooleanScript(String p0){
       return this.executeBooleanScript(p0, null, 0);
    }
    public boolean executeBooleanScript(String p0,String p1,int p2){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeBooleanScript(this.v8RuntimePtr, p0, p1, p2);
    }
    public double executeDoubleFunction(long p0,long p1,String p2,long p3){
       return this._executeDoubleFunction(p0, p1, p2, p3);
    }
    public double executeDoubleScript(long p0,String p1,String p2,int p3){
       return this._executeDoubleScript(p0, p1, p2, p3);
    }
    public double executeDoubleScript(String p0){
       return this.executeDoubleScript(p0, null, 0);
    }
    public double executeDoubleScript(String p0,String p1,int p2){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeDoubleScript(this.v8RuntimePtr, p0, p1, p2);
    }
    public Object executeFunction(long p0,int p1,long p2,String p3,long p4){
       return this._executeFunction(p0, p1, p2, p3, p4);
    }
    public Object executeFunction(long p0,long p1,long p2,long p3){
       return this._executeFunction(p0, p1, p2, p3);
    }
    public int executeIntegerFunction(long p0,long p1,String p2,long p3){
       return this._executeIntegerFunction(p0, p1, p2, p3);
    }
    public int executeIntegerScript(long p0,String p1,String p2,int p3){
       return this._executeIntegerScript(p0, p1, p2, p3);
    }
    public int executeIntegerScript(String p0){
       return this.executeIntegerScript(p0, null, 0);
    }
    public int executeIntegerScript(String p0,String p1,int p2){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeIntegerScript(this.v8RuntimePtr, p0, p1, p2);
    }
    public Object executeModule(String p0,String p1,String p2,String p3){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeScript(this.getV8RuntimePtr(), 0, p1+p0+p2, p3, 0);
    }
    public V8Object executeObjectScript(String p0){
       return this.executeObjectScript(p0, null, 0);
    }
    public V8Object executeObjectScript(String p0,String p1,int p2){
       this.checkThread();
       p0 = this.executeScript(p0, p1, p2);
       if (p0 instanceof V8Object) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public Object executeScript(long p0,int p1,String p2,String p3,int p4){
       return this._executeScript(p0, p1, p2, p3, p4);
    }
    public Object executeScript(String p0){
       return this.executeScript(p0, null, 0);
    }
    public Object executeScript(String p0,String p1){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeScript(this.getV8RuntimePtr(), 0, p0, p1, 0);
    }
    public Object executeScript(String p0,String p1,int p2){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeScript(this.getV8RuntimePtr(), 0, p0, p1, p2);
    }
    public String executeStringFunction(long p0,long p1,String p2,long p3){
       return this._executeStringFunction(p0, p1, p2, p3);
    }
    public String executeStringScript(long p0,String p1,String p2,int p3){
       return this._executeStringScript(p0, p1, p2, p3);
    }
    public String executeStringScript(String p0){
       return this.executeStringScript(p0, null, 0);
    }
    public String executeStringScript(String p0,String p1,int p2){
       this.checkThread();
       V8.checkScript(p0);
       return this.executeStringScript(this.v8RuntimePtr, p0, p1, p2);
    }
    public void executeVoidFunction(long p0,long p1,String p2,long p3){
       this._executeVoidFunction(p0, p1, p2, p3);
    }
    public void executeVoidScript(long p0,String p1,String p2,int p3){
       this._executeVoidScript(p0, p1, p2, p3);
    }
    public void executeVoidScript(String p0){
       this.executeVoidScript(p0, null, 0);
    }
    public void executeVoidScript(String p0,String p1,int p2){
       this.checkThread();
       V8.checkScript(p0);
       this.executeVoidScript(this.v8RuntimePtr, p0, p1, p2);
    }
    public Object get(long p0,int p1,long p2,String p3){
       return this._get(p0, p1, p2, p3);
    }
    public final Object[] getArgs(V8Object p0,V8$MethodDescriptor p1,V8Array p2,boolean p3){
       int len = p1.method.getParameterTypes().length;
       int i = (p3)? len - 1: len;
       Object[] objArray = new Object[len];
       Object[] objArray1 = this.setDefaultValues(objArray, p1.method.getParameterTypes(), p0, p1.includeReceiver);
       ArrayList uArrayList = new ArrayList();
       this.populateParamters(p2, i, objArray1, uArrayList, p1.includeReceiver);
       if (p3) {
          p1 = this.getVarArgContainer(p1.method.getParameterTypes(), uArrayList.size());
          System.arraycopy(uArrayList.toArray(), 0, p1, 0, uArrayList.size());
          objArray1[i] = p1;
       }
       return objArray1;
    }
    public final Object getArrayItem(V8Array p0,int p1){
       try{
          int type = p0.getType(p1);
          if (type == 10) {
             return p0.get(p1);
          }
          if (type == 99) {
             return V8.getUndefined();
          }
          switch (type){
              case 1:
                return Integer.valueOf(p0.getInteger(p1));
              case 2:
                return Double.valueOf(p0.getDouble(p1));
              case 3:
                return Boolean.valueOf(p0.getBoolean(p1));
              case 4:
                return p0.getString(p1);
              case 5:
              case 8:
                return p0.getArray(p1);
              case 6:
                return p0.getObject(p1);
              case 7:
                return p0.getObject(p1);
              default:
                return null;
          }
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
       }
    }
    public int getArrayType(long p0,long p1){
       return this._getArrayType(p0, p1);
    }
    public boolean getBoolean(long p0,long p1,String p2){
       return this._getBoolean(p0, p1, p2);
    }
    public String getConstructorName(long p0,long p1){
       return this._getConstructorName(p0, p1);
    }
    public Object getData(String p0){
       V8 tdata = this.data;
       if (tdata == null) {
          return null;
       }
       return tdata.get(p0);
    }
    public final Object getDefaultValue(Class p0){
       if (p0.equals(V8Object.class)) {
          return new V8Object$Undefined();
       }
       if (p0.equals(V8Array.class)) {
          return new V8Array$Undefined();
       }
       return V8.invalid;
    }
    public double getDouble(long p0,long p1,String p2){
       return this._getDouble(p0, p1, p2);
    }
    public V8Executor getExecutor(V8Object p0){
       this.checkThread();
       V8 texecutors = this.executors;
       if (texecutors == null) {
          return null;
       }
       return texecutors.get(p0);
    }
    public Object getExternalObjectByKey(String p0){
       if (!V8ExternalObject.isExternalObject(p0)) {
          return null;
       }
       V8 texternals = this.externals;
       _monitor_enter(texternals);
       V8ExternalObject v8ExternalOb = this.externals.get(p0);
       _monitor_exit(texternals);
       if (v8ExternalOb == null) {
          return null;
       }
       return v8ExternalOb.getValue();
    }
    public int getInteger(long p0,long p1,String p2){
       return this._getInteger(p0, p1, p2);
    }
    public String[] getKeys(long p0,long p1){
       return this._getKeys(p0, p1);
    }
    public V8Locker getLocker(){
       return this.locker;
    }
    public long getObjectReferenceCount(){
       return (this.objectReferences - (long)this.v8WeakReferences.size());
    }
    public String getString(long p0,long p1,String p2){
       return this._getString(p0, p1, p2);
    }
    public int getType(long p0,long p1){
       return this._getType(p0, p1);
    }
    public int getType(long p0,long p1,int p2){
       return this._getType(p0, p1, p2);
    }
    public int getType(long p0,long p1,int p2,int p3){
       return this._getType(p0, p1, p2, p3);
    }
    public int getType(long p0,long p1,String p2){
       return this._getType(p0, p1, p2);
    }
    public long getV8RuntimePtr(){
       return this.v8RuntimePtr;
    }
    public final Object getVarArgContainer(Class[] p0,int p1){
       object oobject = p0[(p0.length - 1)];
       if (oobject.isArray()) {
          oobject = oobject.getComponentType();
       }
       return Array.newInstance(oobject, p1);
    }
    public int identityHash(long p0,long p1){
       return this._identityHash(p0, p1);
    }
    public long initEmptyContainer(long p0){
       return this._initEmptyContainer(p0);
    }
    public long initNewV8Array(long p0){
       return this._initNewV8Array(p0);
    }
    public long initNewV8ArrayBuffer(long p0,int p1){
       return this._initNewV8ArrayBuffer(p0, p1);
    }
    public long initNewV8ArrayBuffer(long p0,ByteBuffer p1,int p2){
       return this._initNewV8ArrayBuffer(p0, p1, p2);
    }
    public long initNewV8Float32Array(long p0,long p1,int p2,int p3){
       return this._initNewV8Float32Array(p0, p1, p2, p3);
    }
    public long initNewV8Float64Array(long p0,long p1,int p2,int p3){
       return this._initNewV8Float64Array(p0, p1, p2, p3);
    }
    public long[] initNewV8Function(long p0){
       this.checkThread();
       return this._initNewV8Function(p0);
    }
    public long initNewV8Int16Array(long p0,long p1,int p2,int p3){
       return this._initNewV8Int16Array(p0, p1, p2, p3);
    }
    public long initNewV8Int32Array(long p0,long p1,int p2,int p3){
       return this._initNewV8Int32Array(p0, p1, p2, p3);
    }
    public long initNewV8Int8Array(long p0,long p1,int p2,int p3){
       return this._initNewV8Int8Array(p0, p1, p2, p3);
    }
    public long initNewV8Object(long p0){
       return this._initNewV8Object(p0);
    }
    public long initNewV8UInt16Array(long p0,long p1,int p2,int p3){
       return this._initNewV8UInt16Array(p0, p1, p2, p3);
    }
    public long initNewV8UInt32Array(long p0,long p1,int p2,int p3){
       return this._initNewV8UInt32Array(p0, p1, p2, p3);
    }
    public long initNewV8UInt8Array(long p0,long p1,int p2,int p3){
       return this._initNewV8UInt8Array(p0, p1, p2, p3);
    }
    public long initNewV8UInt8ClampedArray(long p0,long p1,int p2,int p3){
       return this._initNewV8UInt8ClampedArray(p0, p1, p2, p3);
    }
    public boolean isRunning(){
       return V8._isRunning(this.v8RuntimePtr);
    }
    public final boolean isVoidMethod(Method p0){
       if (p0.getReturnType().equals(Void.TYPE)) {
          return true;
       }
       return false;
    }
    public boolean isWeak(long p0,long p1){
       return this._isWeak(p0, p1);
    }
    public void lowMemoryNotification(){
       this.checkThread();
       this.lowMemoryNotification(this.getV8RuntimePtr());
    }
    public void lowMemoryNotification(long p0){
       this._lowMemoryNotification(p0);
    }
    public String makeExternalObject(Object p0){
       if (p0 == null) {
          return null;
       }
       V8ExternalObject v8ExternalOb = new V8ExternalObject(this, p0);
       V8 texternals = this.externals;
       _monitor_enter(texternals);
       this.externals.put(v8ExternalOb.getKey(), v8ExternalOb);
       _monitor_exit(texternals);
       return v8ExternalOb.getKey();
    }
    public final void notifyReferenceCreated(V8Value p0){
       Iterator iterator = this.referenceHandlers.iterator();
       while (iterator.hasNext()) {
          iterator.next().v8HandleCreated(p0);
       }
       return;
    }
    public final void notifyReferenceDisposed(V8Value p0){
       Iterator iterator = this.referenceHandlers.iterator();
       while (iterator.hasNext()) {
          iterator.next().v8HandleDisposed(p0);
       }
       return;
    }
    public final void notifyReleaseHandlers(V8 p0){
       Iterator iterator = this.releaseHandlers.iterator();
       while (iterator.hasNext()) {
          iterator.next().run(p0);
       }
       return;
    }
    public Object peekExternalObjectByKey(String p0){
       if (!V8ExternalObject.isExternalObject(p0)) {
          return null;
       }
       V8 texternals = this.externals;
       _monitor_enter(texternals);
       V8ExternalObject v8ExternalOb = this.externals.remove(p0);
       _monitor_exit(texternals);
       if (v8ExternalOb == null) {
          return null;
       }
       return v8ExternalOb.getValue();
    }
    public final void populateParamters(V8Array p0,int p1,Object[] p2,List p3,boolean p4){
       int i = p4;
       int i1 = p0.length() + p4;
       while (i < i1) {
          if (i >= p1) {
             i1 = i - p4;
             p3.add(this.getArrayItem(p0, i1));
          }else {
             i1 = i - p4;
             p2[i] = this.getArrayItem(p0, i1);
          }
          i = i + 1;
       }
       return;
    }
    public boolean pumpMessageLoop(){
       return V8._pumpMessageLoop(this.v8RuntimePtr);
    }
    public void registerCallback(JavaCallback p0,long p1,String p2){
       this.createAndRegisterMethodDescriptor(p0, this.registerJavaMethod(this.getV8RuntimePtr(), p1, p2, false));
    }
    public void registerCallback(Object p0,Method p1,long p2,String p3,boolean p4){
       V8$MethodDescriptor methodDescri = new V8$MethodDescriptor(this, null);
       methodDescri.object = p0;
       methodDescri.method = p1;
       methodDescri.includeReceiver = p4;
       long l = this.registerJavaMethod(this.getV8RuntimePtr(), p2, p3, this.isVoidMethod(p1));
       this.methodId = l;
       this.functionRegistry.put(Long.valueOf(l), methodDescri);
    }
    public long registerJavaMethod(long p0,long p1,String p2,boolean p3){
       return this._registerJavaMethod(p0, p1, p2, p3);
    }
    public void registerResource(Releasable p0){
       this.checkThread();
       if (this.resources == null) {
          this.resources = new ArrayList();
       }
       this.resources.add(p0);
       return;
    }
    public void registerV8Executor(V8Object p0,V8Executor p1){
       this.checkThread();
       if (this.executors == null) {
          this.executors = new V8Map();
       }
       this.executors.put(p0, p1);
       return;
    }
    public void registerVoidCallback(JavaVoidCallback p0,long p1,String p2){
       V8$MethodDescriptor methodDescri = new V8$MethodDescriptor(this, null);
       methodDescri.voidCallback = p0;
       this.functionRegistry.put(Long.valueOf(this.registerJavaMethod(this.getV8RuntimePtr(), p1, p2, true)), methodDescri);
    }
    public void release(){
       this.release(true);
    }
    public void release(long p0,long p1){
       this._release(p0, p1);
    }
    public void release(boolean p0){
       if (this.isReleased()) {
          return;
       }
       this.checkThread();
       long l = 0;
       int i = 1;
       this.notifyReleaseHandlers(this);
       this.releaseResources();
       this.shutdownExecutors(this.forceTerminateExecutors);
       V8 texecutors = this.executors;
       if (texecutors != null) {
          texecutors.clear();
       }
       this.releaseNativeMethodDescriptors();
       Object lock = V8.lock;
       _monitor_enter(lock);
       V8.runtimeCounter = V8.runtimeCounter - i;
       _monitor_exit(lock);
       this._releaseRuntime(this.v8RuntimePtr);
       this.v8RuntimePtr = l;
       this.released = i;
       if (!p0 || this.getObjectReferenceCount() - l <= 0) {
          this.externals.clear();
          return;
       }else {
          throw new IllegalStateException(this.getObjectReferenceCount()+" Object\(s\) still exist in runtime");
       }
    }
    public final void releaseArguments(Object[] p0,boolean p1){
       int i = 0;
       if (p1 && (p0.length > 0 && p0[(p0.length - 1)] instanceof Object[])) {
          object oobject = p0[(p0.length - 1)];
          int len = oobject.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject1 = oobject[i1];
             if (oobject1 instanceof V8Value) {
                oobject1.close();
             }
             i1 = i1 + 1;
          }
       }
       int len1 = p0.length;
       while (i < len1) {
          object oobject2 = p0[i];
          if (oobject2 instanceof V8Value) {
             oobject2.close();
          }
          i = i + 1;
       }
       return;
    }
    public void releaseLock(long p0){
       this._releaseLock(p0);
    }
    public void releaseMethodDescriptor(long p0,long p1){
       this._releaseMethodDescriptor(p0, p1);
    }
    public final void releaseNativeMethodDescriptors(){
       Iterator iterator = this.functionRegistry.keySet().iterator();
       while (iterator.hasNext()) {
          this.releaseMethodDescriptor(this.v8RuntimePtr, iterator.next().longValue());
       }
       return;
    }
    public void releaseObjRef(V8Value p0){
       if (!this.referenceHandlers.isEmpty()) {
          this.notifyReferenceDisposed(p0);
       }
       this.objectReferences = this.objectReferences - 1;
       return;
    }
    public final void releaseResources(){
       V8 tresources = this.resources;
       if (tresources != null) {
          Iterator iterator = tresources.iterator();
          while (iterator.hasNext()) {
             iterator.next().release();
          }
          this.resources.clear();
          this.resources = null;
       }
       return;
    }
    public V8Executor removeExecutor(V8Object p0){
       this.checkThread();
       V8 texecutors = this.executors;
       if (texecutors == null) {
          return null;
       }
       return texecutors.remove(p0);
    }
    public void removeReferenceHandler(ReferenceHandler p0){
       this.referenceHandlers.remove(p0);
    }
    public void removeReleaseHandler(V8Runnable p0){
       this.releaseHandlers.remove(p0);
    }
    public boolean sameValue(long p0,long p1,long p2){
       return this._sameValue(p0, p1, p2);
    }
    public void schedulePauseOnNextStatement(long p0,String p1){
       this.checkThread();
       this._schedulePauseOnNextStatement(this.v8RuntimePtr, p0, p1);
    }
    public synchronized void setData(String p0,Object p1){
       if (this.data == null) {
          this.data = new HashMap();
       }
       this.data.put(p0, p1);
       return;
    }
    public final Object[] setDefaultValues(Object[] p0,Class[] p1,V8Object p2,boolean p3){
       int i = 0;
       if (p3) {
          p0[i] = p2;
          i = 1;
       }
       while (i < p0.length) {
          p0[i] = this.getDefaultValue(p1[i]);
          i = i + 1;
       }
       return p0;
    }
    public void setPrototype(long p0,long p1,long p2){
       this._setPrototype(p0, p1, p2);
    }
    public void setSignatureProvider(SignatureProvider p0){
       this.signatureProvider = p0;
    }
    public void setWeak(long p0,long p1){
       this._setWeak(p0, p1);
    }
    public void shutdownExecutors(boolean p0){
       this.checkThread();
       V8 texecutors = this.executors;
       if (texecutors == null) {
          return;
       }
       Iterator iterator = texecutors.values().iterator();
       while (iterator.hasNext()) {
          V8Executor v8Executor = iterator.next();
          if (p0) {
             v8Executor.forceTermination();
          }else {
             v8Executor.shutdown();
          }
       }
       return;
    }
    public boolean strictEquals(long p0,long p1,long p2){
       return this._strictEquals(p0, p1, p2);
    }
    public void terminateExecution(){
       this.forceTerminateExecutors = true;
       this.terminateExecution(this.v8RuntimePtr);
    }
    public void terminateExecution(long p0){
       this._terminateExecution(p0);
    }
    public String toString(long p0,long p1){
       return this._toString(p0, p1);
    }
    public void weakReferenceReleased(long p0){
       try{
          V8Value v8Value = this.v8WeakReferences.get(Long.valueOf(p0));
          if (v8Value != null) {
             V8 tv8WeakRefer = this.v8WeakReferences;
             Long longx = Long.valueOf(p0);
             tv8WeakRefer.remove(longx);
             v8Value.close();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
