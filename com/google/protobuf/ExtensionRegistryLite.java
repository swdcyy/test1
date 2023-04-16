package com.google.protobuf.ExtensionRegistryLite;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import com.google.protobuf.ExtensionRegistryFactory;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import java.lang.Class;
import com.google.protobuf.ExtensionRegistryLite$ExtensionClassHolder;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.google.protobuf.ExtensionRegistryLite$ObjectIntPair;
import com.google.protobuf.MessageLite;

public class ExtensionRegistryLite	// class@00040d
{
    public final Map extensionsByNumber;
    public static final ExtensionRegistryLite EMPTY_REGISTRY_LITE;
    public static boolean doFullRuntimeInheritanceCheck;
    public static boolean eagerlyParseMessageSets;
    public static ExtensionRegistryLite emptyRegistry;

    static {
       ExtensionRegistryLite.EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    }
    public void ExtensionRegistryLite(){
       super();
       this.extensionsByNumber = new HashMap();
    }
    public void ExtensionRegistryLite(ExtensionRegistryLite p0){
       super();
       this.extensionsByNumber = (p0 == ExtensionRegistryLite.EMPTY_REGISTRY_LITE)? Collections.emptyMap(): Collections.unmodifiableMap(p0.extensionsByNumber);
       return;
    }
    public void ExtensionRegistryLite(boolean p0){
       super();
       this.extensionsByNumber = Collections.emptyMap();
    }
    public static ExtensionRegistryLite getEmptyRegistry(){
       ExtensionRegistryLite emptyRegistr = ExtensionRegistryLite.emptyRegistry;
       if (emptyRegistr == null) {
          _monitor_enter(ExtensionRegistryLite.class);
          emptyRegistr = ExtensionRegistryLite.emptyRegistry;
          if (emptyRegistr == null) {
             emptyRegistr = (ExtensionRegistryLite.doFullRuntimeInheritanceCheck)? ExtensionRegistryFactory.createEmpty(): ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
             ExtensionRegistryLite.emptyRegistry = emptyRegistr;
          }
          _monitor_exit(ExtensionRegistryLite.class);
       }
       return emptyRegistr;
    }
    public static boolean isEagerlyParseMessageSets(){
       return ExtensionRegistryLite.eagerlyParseMessageSets;
    }
    public static ExtensionRegistryLite newInstance(){
       ExtensionRegistryLite uExtensionRe = (ExtensionRegistryLite.doFullRuntimeInheritanceCheck)? ExtensionRegistryFactory.create(): new ExtensionRegistryLite();
       return uExtensionRe;
    }
    public static void setEagerlyParseMessageSets(boolean p0){
       ExtensionRegistryLite.eagerlyParseMessageSets = p0;
    }
    public final void add(ExtensionLite p0){
       if (GeneratedMessageLite$GeneratedExtension.class.isAssignableFrom(p0.getClass())) {
          this.add(p0);
       }
       if (ExtensionRegistryLite.doFullRuntimeInheritanceCheck && ExtensionRegistryFactory.isFullRegistry(this)) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = ExtensionRegistryLite$ExtensionClassHolder.INSTANCE;
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             this.getClass().getMethod("add", uClassArray).invoke(this, objArray);
          }catch(java.lang.Exception e2){
             Object[] objArray1 = new Object[i];
             objArray1[0] = p0;
             throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", objArray1), e2);
          }
       }
       return;
    }
    public final void add(GeneratedMessageLite$GeneratedExtension p0){
       this.extensionsByNumber.put(new ExtensionRegistryLite$ObjectIntPair(p0.getContainingTypeDefaultInstance(), p0.getNumber()), p0);
    }
    public GeneratedMessageLite$GeneratedExtension findLiteExtensionByNumber(MessageLite p0,int p1){
       return this.extensionsByNumber.get(new ExtensionRegistryLite$ObjectIntPair(p0, p1));
    }
    public ExtensionRegistryLite getUnmodifiable(){
       return new ExtensionRegistryLite(this);
    }
}
