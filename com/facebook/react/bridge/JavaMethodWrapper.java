package com.facebook.react.bridge.JavaMethodWrapper;
import com.facebook.react.bridge.NativeModule$NativeMethod;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JavaMethodWrapper$2;
import com.facebook.react.bridge.JavaMethodWrapper$3;
import com.facebook.react.bridge.JavaMethodWrapper$4;
import com.facebook.react.bridge.JavaMethodWrapper$5;
import com.facebook.react.bridge.JavaMethodWrapper$6;
import com.facebook.react.bridge.JavaMethodWrapper$7;
import com.facebook.react.bridge.JavaMethodWrapper$8;
import com.facebook.react.bridge.JavaMethodWrapper$9;
import com.facebook.react.bridge.JavaMethodWrapper$10;
import mb.b;
import mb.c;
import nb.a;
import lb.a;
import com.facebook.react.bridge.JavaModuleWrapper;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Class;
import com.facebook.react.bridge.Promise;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Character;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Dynamic;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Void;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import od.a;
import java.lang.Number;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.BridgeHookInvoked;
import com.facebook.react.bridge.BaseJavaModule;
import cb.a;
import hg.b$b;
import hg.b;
import yd.e;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import com.facebook.react.bridge.NativeArgumentsParseException;
import java.lang.Exception;
import java.lang.Error;
import java.util.List;
import java.util.Iterator;
import com.facebook.react.bridge.BridgeInvokeListener;

public class JavaMethodWrapper implements NativeModule$NativeMethod	// class@0011ee
{
    public JavaMethodWrapper$ArgumentExtractor[] mArgumentExtractors;
    public Object[] mArguments;
    public boolean mArgumentsProcessed;
    public int mJSArgumentsNeeded;
    public final Method mMethod;
    public final JavaModuleWrapper mModuleWrapper;
    public final int mParamLength;
    public final Class[] mParameterTypes;
    public String mSignature;
    public String mType;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_ARRAY;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_BOOLEAN;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_CALLBACK;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_DOUBLE;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_DYNAMIC;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_FLOAT;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_INTEGER;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_MAP;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_PROMISE;
    public static final JavaMethodWrapper$ArgumentExtractor ARGUMENT_EXTRACTOR_STRING;
    public static final boolean DEBUG;

    static {
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_BOOLEAN = new JavaMethodWrapper$1();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_DOUBLE = new JavaMethodWrapper$2();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_FLOAT = new JavaMethodWrapper$3();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_INTEGER = new JavaMethodWrapper$4();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_STRING = new JavaMethodWrapper$5();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_ARRAY = new JavaMethodWrapper$6();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_DYNAMIC = new JavaMethodWrapper$7();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_MAP = new JavaMethodWrapper$8();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK = new JavaMethodWrapper$9();
       JavaMethodWrapper.ARGUMENT_EXTRACTOR_PROMISE = new JavaMethodWrapper$10();
       JavaMethodWrapper.DEBUG = c.a().a(a.d);
    }
    public void JavaMethodWrapper(JavaModuleWrapper p0,Method p1,boolean p2){
       super();
       this.mType = "async";
       this.mArgumentsProcessed = false;
       this.mModuleWrapper = p0;
       this.mMethod = p1;
       boolean b = true;
       p1.setAccessible(b);
       Class[] parameterTyp = p1.getParameterTypes();
       this.mParameterTypes = parameterTyp;
       int len = parameterTyp.length;
       this.mParamLength = len;
       if (p2) {
          this.mType = "sync";
       }else if(len > 0 && parameterTyp[(len - b)] == Promise.class){
          this.mType = "promise";
       }
       return;
    }
    public static char commonTypeToChar(Class p0){
       if (p0 == Boolean.TYPE) {
          return 'z';
       }
       if (p0 == Boolean.class) {
          return 'Z';
       }
       if (p0 == Integer.TYPE) {
          return 'i';
       }
       if (p0 == Integer.class) {
          return 'I';
       }
       if (p0 == Double.TYPE) {
          return 'd';
       }
       if (p0 == Double.class) {
          return 'D';
       }
       if (p0 == Float.TYPE) {
          return 'f';
       }
       if (p0 == Float.class) {
          return 'F';
       }
       if (p0 == String.class) {
          return 'S';
       }
       return 0;
    }
    public static char paramTypeToChar(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaMethodWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.charValue();
       }
       char c = JavaMethodWrapper.commonTypeToChar(p0);
       if (c) {
          return c;
       }
       if (p0 == Callback.class) {
          return 'X';
       }
       if (p0 == Promise.class) {
          return 'P';
       }
       if (p0 == ReadableMap.class) {
          return 'M';
       }
       if (p0 == ReadableArray.class) {
          return 'A';
       }
       if (p0 == Dynamic.class) {
          return 'Y';
       }
       throw new RuntimeException("Got unknown param class: "+p0.getSimpleName());
    }
    public static char returnTypeToChar(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaMethodWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.charValue();
       }
       char c = JavaMethodWrapper.commonTypeToChar(p0);
       if (c) {
          return c;
       }
       if (p0 == Void.TYPE) {
          return 'v';
       }
       if (p0 == WritableMap.class) {
          return 'M';
       }
       if (p0 == WritableArray.class) {
          return 'A';
       }
       throw new RuntimeException("Got unknown return class: "+p0.getSimpleName());
    }
    public final JavaMethodWrapper$ArgumentExtractor[] buildArgumentExtractors(Class[] p0){
       object oobject;
       JavaMethodWrapper$ArgumentExtractor[] obj = PatchProxy.applyOneRefs(p0, this, JavaMethodWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JavaMethodWrapper$ArgumentExtractor[p0.length];
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return obj;
          }
          oobject = p0[i];
          if (oobject == Boolean.class || oobject == Boolean.TYPE) {
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_BOOLEAN;
          }else if(oobject == Integer.class || oobject == Integer.TYPE){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_INTEGER;
          }else if(oobject == Double.class || oobject == Double.TYPE){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_DOUBLE;
          }else if(oobject == Float.class || oobject == Float.TYPE){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_FLOAT;
          }else if(oobject == String.class){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_STRING;
          }else if(oobject == Callback.class){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK;
          }else if(oobject == Promise.class){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_PROMISE;
             int i1 = 1;
             int i2 = p0.length - i1;
             if (i != i2) {
                i1 = false;
             }
             a.b(i1, "Promise must be used as last parameter only");
          }else if(oobject == ReadableMap.class){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_MAP;
          }else if(oobject == ReadableArray.class){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_ARRAY;
          }else if(oobject == Dynamic.class){
             obj[i] = JavaMethodWrapper.ARGUMENT_EXTRACTOR_DYNAMIC;
          }else {
             break ;
          }
          i = i + obj[i].getJSArgumentsNeeded();
       }
       throw new RuntimeException("Got unknown argument class: "+oobject.getSimpleName());
    }
    public final String buildSignature(Method p0,Class[] p1,boolean p2){
       StringBuilder obj;
       if (PatchProxy.isSupport(JavaMethodWrapper.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, JavaMethodWrapper.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new StringBuilder((p1.length + 2));
       obj = (p2)? obj+JavaMethodWrapper.returnTypeToChar(p0.getReturnType())+'.': obj+"v.";
       for (int i = 0; i < p1.length; i++) {
          object oobject = p1[i];
          if (oobject == Promise.class) {
             int i1 = 1;
             int i2 = p1.length - i1;
             if (i != i2) {
                i1 = false;
             }
             a.b(i1, "Promise must be used as last parameter only");
          }
          obj = obj+JavaMethodWrapper.paramTypeToChar(oobject);
       }
       return obj;
    }
    public final int calculateJSArgumentsNeeded(){
       JavaMethodWrapper obj = PatchProxy.apply(null, this, JavaMethodWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mArgumentExtractors;
       a.c(obj);
       int len = obj.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          i1 = i1 + obj[i].getJSArgumentsNeeded();
       }
       return i1;
    }
    public final String getAffectedRange(int p0,int p1){
       String obj;
       JavaMethodWrapper javaMethodWr = JavaMethodWrapper.class;
       if (PatchProxy.isSupport(javaMethodWr)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, javaMethodWr, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       String str = (p1 > 1)? obj+p0+"-"+((p0 + p1) - 1): obj+p0;
       return str;
    }
    public Method getMethod(){
       return this.mMethod;
    }
    public String getSignature(){
       JavaMethodWrapper obj = PatchProxy.apply(null, this, JavaMethodWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mArgumentsProcessed == null) {
          this.processArguments();
       }
       obj = this.mSignature;
       a.c(obj);
       return obj;
    }
    public String getType(){
       return this.mType;
    }
    public final boolean hookBridgeInvoked(JSInstance p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaMethodWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof CatalystInstance) {
          return b;
       }
       BridgeHookInvoked bridgeHookIn = p0.getBridgeHookInvoked();
       if (bridgeHookIn == null) {
          return b;
       }
       if (bridgeHookIn.matchBridgeHookCondition(p0, this.mModuleWrapper.getModule(), this.mModuleWrapper.getName(), this.mMethod.getName(), this.mArguments)) {
          Object[] objArray = new Object[]{this.mModuleWrapper.getName(),this.mMethod.getName()};
          b = 1;
          a.x("ReactNative", String.format("Hit Bridge Hook: %s.%s\(\)", objArray));
       }
       return b;
    }
    public void invoke(JSInstance p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaMethodWrapper.class, "9")) {
          return;
       }
       String str = this.mModuleWrapper.getName()+"."+this.mMethod.getName();
       b.a(0, str).d("method", str).e();
       int i = 0;
       if (JavaMethodWrapper.DEBUG) {
          Object[] objArray = new Object[]{this.mModuleWrapper.getName(),this.mMethod.getName()};
          c.a().c(a.d, "JS->Java: %s.%s\(\)", objArray);
       }
       if (this.mArgumentsProcessed == null) {
          this.processArguments();
       }
       if (this.mArguments != null && this.mArgumentExtractors != null) {
          if (this.mJSArgumentsNeeded == p1.size()) {
             int i1 = 0;
             try{
                JavaMethodWrapper tmArgumentEx = this.mArgumentExtractors;
                while (i < tmArgumentEx.length) {
                   this.mArguments[i] = tmArgumentEx[i].extractArgument(p0, p1, i1);
                   i1 = i1 + this.mArgumentExtractors[i].getJSArgumentsNeeded();
                   i = i + 1;
                }
                try{
                   if (e.T) {
                      this.notifyInvoke(p0);
                   }
                   if (e.U && this.hookBridgeInvoked(p0)) {
                      b.b(0, str).e();
                      return;
                   }else {
                      this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                      b.b(0, str).e();
                      return;
                   }
                }catch(java.lang.IllegalArgumentException e11){
                   throw new RuntimeException("Could not invoke "+str, e11);
                }catch(java.lang.IllegalAccessException e11){
                   throw new RuntimeException("Could not invoke "+str, e11);
                }catch(java.lang.reflect.InvocationTargetException e11){
                   if (e11.getCause() instanceof RuntimeException) {
                      throw e11.getCause();
                   }else {
                      throw new RuntimeException("Could not invoke "+str, e11);
                   }
                }
             }catch(java.lang.Exception e11){
                throw new NativeArgumentsParseException(e11.getMessage()+" \(constructing arguments for "+str+" at argument index "+this.getAffectedRange(i1, this.mArgumentExtractors[i].getJSArgumentsNeeded())+"\)", e11);
             }
          }else {
             throw new NativeArgumentsParseException(str+" got "+p1.size()+" arguments, expected "+this.mJSArgumentsNeeded);
          }
       }else {
          throw new Error("processArguments failed");
       }
    }
    public final void notifyInvoke(JSInstance p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JavaMethodWrapper.class, "11")) {
          return;
       }
       if (!p0 instanceof CatalystInstance) {
          return;
       }
       List bridgeInvoke = p0.getBridgeInvokeListeners();
       if (bridgeInvoke != null && !bridgeInvoke.isEmpty()) {
          Iterator iterator = bridgeInvoke.iterator();
          while (iterator.hasNext()) {
             iterator.next().onBridgeInvoked(this.mModuleWrapper.getModule(), this.mModuleWrapper.getName(), this.mMethod.getName(), this.mArguments);
          }
       }
       return;
    }
    public final void processArguments(){
       if (PatchProxy.applyVoid(null, this, JavaMethodWrapper.class, "3")) {
          return;
       }
       if (this.mArgumentsProcessed != null) {
          return;
       }
       b.a(0, "processArguments").d("method", this.mModuleWrapper.getName()+"."+this.mMethod.getName()).e();
       this.mArgumentsProcessed = true;
       this.mArgumentExtractors = this.buildArgumentExtractors(this.mParameterTypes);
       this.mSignature = this.buildSignature(this.mMethod, this.mParameterTypes, (this.mType).equals("sync"));
       Object[] objArray = new Object[this.mParameterTypes.length];
       this.mArguments = objArray;
       this.mJSArgumentsNeeded = this.calculateJSArgumentsNeeded();
       b.b(0, "processArguments").e();
       return;
    }
}
