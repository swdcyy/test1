package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$b;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import wca.q;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import java.util.Objects;
import java.lang.Boolean;
import java.util.HashMap;
import com.kwai.framework.model.user.User;
import java.lang.Long;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Exception;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public final class SocialRelationBridge$b implements g	// class@00192b
{
    public final WeakReference b;

    public void SocialRelationBridge$b(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       SocialRelationBridge$c companion;
       SocialRelationBridge$b b1;
       HashMap hashMap;
       String id;
       QCurrentUser mE;
       Object obj = this;
       q obj1 = p0;
       SocialRelationBridge$c uoc = SocialRelationBridge$c.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SocialRelationBridge$b.class, "1")) {
       }else {
          a.p(obj1, "t");
          q b = obj1.b;
          ReactContext reactContext = null;
          if (b == 1) {
             companion = SocialRelationBridge.Companion;
             b1 = obj.b;
             if (b1 != null) {
                reactContext = b1.get();
             }
             b = obj1.a;
             a.o(b, "t.targetUser");
             obj1 = obj1.c;
             Objects.requireNonNull(companion);
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(reactContext, b, Boolean.valueOf(obj1), companion, SocialRelationBridge$c.class, "4")) {
                try{
                   hashMap = new HashMap();
                   id = b.getId();
                   a.o(id, "user.id");
                   hashMap.put("userId", Long.valueOf(Long.parseLong(id)));
                   mE = QCurrentUser.ME;
                   a.o(mE, "QCurrentUser.ME");
                   id = mE.getId();
                   a.o(id, "QCurrentUser.ME.id");
                   hashMap.put("ownerId", Long.valueOf(Long.parseLong(id)));
                   hashMap.put("addToBlackList", Boolean.valueOf(obj1));
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
                if (reactContext != null) {
                   NativeToJsKt.e(reactContext, "krnBlackStateChange", Arguments.makeNativeMap(hashMap));
                }
             }
          }else if(b == 2){
             companion = SocialRelationBridge.Companion;
             b1 = obj.b;
             if (b1 != null) {
                reactContext = b1.get();
             }
             b = obj1.a;
             a.o(b, "t.targetUser");
             obj1 = obj1.c;
             Objects.requireNonNull(companion);
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(reactContext, b, Boolean.valueOf(obj1), companion, SocialRelationBridge$c.class, "5")) {
                try{
                   hashMap = new HashMap();
                   id = b.getId();
                   a.o(id, "user.id");
                   hashMap.put("userId", Long.valueOf(Long.parseLong(id)));
                   mE = QCurrentUser.ME;
                   a.o(mE, "QCurrentUser.ME");
                   id = mE.getId();
                   a.o(id, "QCurrentUser.ME.id");
                   hashMap.put("ownerId", Long.valueOf(Long.parseLong(id)));
                   hashMap.put("success", Boolean.valueOf(obj1));
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
                if (reactContext != null) {
                   NativeToJsKt.e(reactContext, "krnRemoveFanStateChange", Arguments.makeNativeMap(hashMap));
                }
             }
          }
       }
       return;
    }
}
