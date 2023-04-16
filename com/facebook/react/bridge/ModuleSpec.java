package com.facebook.react.bridge.ModuleSpec;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fe.a;
import java.lang.annotation.Annotation;
import java.lang.StringBuilder;
import cb.a;
import com.facebook.react.bridge.NativeModule;

public class ModuleSpec	// class@001206
{
    public final String mName;
    public final Provider mProvider;
    public final Class mType;

    public void ModuleSpec(Provider p0){
       super();
       this.mType = null;
       this.mProvider = p0;
       this.mName = null;
    }
    public void ModuleSpec(Provider p0,String p1){
       super();
       this.mType = null;
       this.mProvider = p0;
       this.mName = p1;
    }
    public static ModuleSpec nativeModuleSpec(Class p0,Provider p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, null, ModuleSpec.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getAnnotation(a.class);
       if (obj != null) {
          return new ModuleSpec(p1, obj.name());
       }
       a.x("ModuleSpec", "Could not find @ReactModule annotation on "+p0.getName()+". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
       return new ModuleSpec(p1, p1.get().getName());
    }
    public static ModuleSpec nativeModuleSpec(String p0,Provider p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ModuleSpec.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ModuleSpec(p1, p0);
    }
    public static ModuleSpec viewManagerSpec(Provider p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ModuleSpec.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ModuleSpec(p0);
    }
    public static ModuleSpec viewManagerSpec(Provider p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ModuleSpec.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ModuleSpec(p0, p1);
    }
    public String getName(){
       return this.mName;
    }
    public Provider getProvider(){
       return this.mProvider;
    }
    public Class getType(){
       return this.mType;
    }
}
