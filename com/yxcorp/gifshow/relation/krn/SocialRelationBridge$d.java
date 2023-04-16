package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$d;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import java.util.Objects;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import java.util.HashMap;
import java.lang.Exception;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public final class SocialRelationBridge$d implements g	// class@00192d
{
    public final WeakReference b;

    public void SocialRelationBridge$d(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       HashMap hashMap;
       int i = p0.intValue();
       SocialRelationBridge$d uod = SocialRelationBridge$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uod, "1")) {
          SocialRelationBridge$c companion = SocialRelationBridge.Companion;
          SocialRelationBridge$d tb = this.b;
          ReactContext reactContext = (tb != null)? tb.get(): null;
          Objects.requireNonNull(companion);
          SocialRelationBridge$c uoc = SocialRelationBridge$c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(reactContext, Integer.valueOf(i), companion, uoc, "7")) {
             try{
                hashMap = new HashMap();
                hashMap.put("count", Integer.valueOf(i));
                hashMap.put("type", Integer.valueOf(3));
             }catch(java.lang.Exception e6){
                e6.printStackTrace();
             }
             if (reactContext != null) {
                NativeToJsKt.e(reactContext, "krnFansListRedDotChange", Arguments.makeNativeMap(hashMap));
             }
          }
       }
    label_0069 :
       return;
    }
}
