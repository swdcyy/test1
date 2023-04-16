package com.facebook.react.bridge.Inspector;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.Object;
import com.facebook.react.bridge.Inspector$RemoteConnection;
import com.facebook.react.bridge.Inspector$LocalConnection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import cb.a;
import java.lang.RuntimeException;
import java.util.List;
import com.facebook.react.bridge.Inspector$Page;
import java.util.Arrays;
import java.util.Collections;

public class Inspector	// class@0011ca
{
    public final HybridData mHybridData;

    static {
       ReactBridge.staticInit();
    }
    public void Inspector(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public static Inspector$LocalConnection connect(int p0,Inspector$RemoteConnection p1){
       Inspector inspector = Inspector.class;
       if (PatchProxy.isSupport(inspector)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, inspector, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return Inspector.instance().connectNative(p0, p1);
       }catch(java.lang.UnsatisfiedLinkError e4){
          a.h("ReactNative", "Inspector doesn\'t work in open source yet", e4);
          throw new RuntimeException(e4);
       }
    }
    public static List getPages(){
       Object obj = PatchProxy.apply(null, null, Inspector.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Arrays.asList(Inspector.instance().getPagesNative());
       }catch(java.lang.UnsatisfiedLinkError e0){
          a.h("ReactNative", "Inspector doesn\'t work in open source yet", e0);
          return Collections.emptyList();
       }
    }
    public static native Inspector instance();
    public native final Inspector$LocalConnection connectNative(int p0,Inspector$RemoteConnection p1);
    public native final Inspector$Page[] getPagesNative();
}
