package com.facebook.react.turbomodule.core.JavaTurboModuleManagerDelegate;
import ye.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.String;
import java.lang.Enum;
import com.facebook.react.bridge.ReactMarker;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Object;
import rd.i0;
import ge.b;
import java.util.Map;
import java.util.Collection;
import com.facebook.react.module.model.ReactModuleInfo;
import ge.a;
import com.facebook.react.module.model.MethodDescriptor;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.jni.HybridData;

public class JavaTurboModuleManagerDelegate extends a	// class@001307
{

    public void JavaTurboModuleManagerDelegate(ReactApplicationContext p0,List p1){
       ReactModuleInfo reactModuleI;
       super(p0, p1);
       String str = null;
       int i = 0;
       ReactMarker.logTMMMarker(ReactMarkerConstants.registerModulesStart.name(), str, str, i);
       HashSet hashSet = new HashSet();
       Iterator iterator = this.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().d().a().values().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   reactModuleI = iterator1.next();
                   if (reactModuleI.a()) {
                      if (!hashSet.contains(reactModuleI.b())) {
                         Iterator iterator2 = reactModuleI.h.a().iterator();
                         while (iterator2.hasNext()) {
                            MethodDescriptor methodDescri = iterator2.next();
                            this.registerModules(reactModuleI.b(), methodDescri.argCount, methodDescri.name, methodDescri.retKind.ordinal(), methodDescri.signature);
                         }
                         hashSet.add(reactModuleI.b());
                      }else {
                         break ;
                      }
                   }
                }else {
                   continue ;
                }
             }
             throw new IllegalArgumentException("TurboModule "+reactModuleI.b()+" already existed");
          }else {
          }
       }
    }
    public native boolean canCreateTurboModule(String p0);
    public native HybridData initHybrid();
    public native void registerModules(String p0,int p1,String p2,int p3,String p4);
}
