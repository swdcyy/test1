package com.facebook.react.bridge.JavaModuleWrapper;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ModuleHolder;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg.a;
import java.util.HashSet;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.lang.reflect.Method;
import com.facebook.react.bridge.ReactMethod;
import java.lang.annotation.Annotation;
import com.facebook.react.bridge.JavaModuleWrapper$MethodDescriptor;
import com.facebook.react.bridge.JavaMethodWrapper;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.react.bridge.NativeMap;
import com.kwai.robust.PatchProxyResult;
import hg.b$b;
import hg.b;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.Enum;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import java.util.List;
import com.facebook.react.bridge.ReadableNativeArray;
import java.lang.Integer;
import yd.e;
import cb.a;
import com.facebook.react.bridge.NativeModule$NativeMethod;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Throwable;

public class JavaModuleWrapper	// class@0011f0
{
    public final ArrayList mDescs;
    public final CatalystInstance mJSInstance;
    public final ArrayList mMethods;
    public final ModuleHolder mModuleHolder;

    public void JavaModuleWrapper(CatalystInstance p0,ModuleHolder p1){
       super();
       this.mJSInstance = p0;
       this.mModuleHolder = p1;
       this.mMethods = new ArrayList();
       this.mDescs = new ArrayList();
    }
    public final void findMethods(){
       String name;
       if (PatchProxy.applyVoid(null, this, JavaModuleWrapper.class, "3")) {
          return;
       }
       long l = 0;
       String str = "findMethods";
       a.a(l, str);
       HashSet hashSet = new HashSet();
       Class class = this.mModuleHolder.getModule().getClass();
       Class superclass = class.getSuperclass();
       if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
          class = superclass;
       }
       Method[] declaredMeth = class.getDeclaredMethods();
       int len = declaredMeth.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = declaredMeth[i];
             ReactMethod annotation = oobject.getAnnotation(ReactMethod.class);
             if (annotation != null) {
                name = oobject.getName();
                if (!hashSet.contains(name)) {
                   JavaModuleWrapper$MethodDescriptor methodDescri = new JavaModuleWrapper$MethodDescriptor(this);
                   JavaMethodWrapper javaMethodWr = new JavaMethodWrapper(this, oobject, annotation.isBlockingSynchronousMethod());
                   methodDescri.name = name;
                   String type = javaMethodWr.getType();
                   methodDescri.type = type;
                   if (("sync").equals(type)) {
                      methodDescri.signature = javaMethodWr.getSignature();
                      methodDescri.method = oobject;
                   }
                   this.mMethods.add(javaMethodWr);
                   this.mDescs.add(methodDescri);
                }else {
                   break ;
                }
             }
             i = i + 1;
          }else {
             a.c(l, str);
             return;
          }
       }
       throw new IllegalArgumentException("Java Module "+this.getName()+" method name already registered: "+name);
    }
    public NativeMap getConstants(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, JavaModuleWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.mModuleHolder.getHasConstants()) {
          return objArray;
       }
       obj = this.getName();
       b.a(0, "JavaModuleWrapper.getConstants").d("moduleName", obj).e();
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.GET_CONSTANTS_START.name(), obj, this.mJSInstance.getUniqueId());
       a.a(0, "module.getConstants");
       a.c(0, "module.getConstants");
       a.a(0, "create WritableNativeMap");
       ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, obj);
       ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, obj);
       a.c(0, "create WritableNativeMap");
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.GET_CONSTANTS_END.name(), obj, this.mJSInstance.getUniqueId());
       b.b(0, "JavaModuleWrapper.getConstants").e();
       return Arguments.makeNativeMap(this.getModule().getConstants());
    }
    public List getMethodDescriptors(){
       Object obj = PatchProxy.apply(null, this, JavaModuleWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDescs.isEmpty()) {
          this.findMethods();
       }
       return this.mDescs;
    }
    public BaseJavaModule getModule(){
       Object obj = PatchProxy.apply(null, this, JavaModuleWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mModuleHolder.getModule();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, JavaModuleWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mModuleHolder.getName();
    }
    public void invoke(int p0,ReadableNativeArray p1){
       JavaModuleWrapper javaModuleWr = JavaModuleWrapper.class;
       if (PatchProxy.isSupport(javaModuleWr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, javaModuleWr, "6")) {
          return;
       }
       javaModuleWr = this.mMethods;
       if (javaModuleWr != null && p0 < javaModuleWr.size()) {
          try{
             if (e.n) {
                a.x("ReactNativeDestroy", "JavaModuleWrapper::invoke "+this.getMethodDescriptors().get(p0).name);
             }
             this.mMethods.get(p0).invoke(this.mJSInstance, p1);
          }catch(java.lang.Exception e4){
             JavaModuleWrapper tmJSInstance = this.mJSInstance;
             if (tmJSInstance == null || tmJSInstance.isDestroyed()) {
                a.h("ReactNative", "exception", e4);
             }else {
                throw e4;
             }
          }
       }
       return;
    }
}
