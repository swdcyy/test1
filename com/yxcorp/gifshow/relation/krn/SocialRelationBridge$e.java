package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$e;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import mac.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import java.util.Objects;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import java.lang.Boolean;
import java.util.HashMap;
import com.kwai.framework.model.user.User;
import java.lang.Long;
import java.lang.Exception;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public final class SocialRelationBridge$e implements g	// class@00192e
{
    public final WeakReference b;

    public void SocialRelationBridge$e(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       l a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationBridge$e.class, "1")) {
       }else {
          a.p(p0, "t");
          SocialRelationBridge$c companion = SocialRelationBridge.Companion;
          SocialRelationBridge$e tb = this.b;
          ReactContext reactContext = (tb != null)? tb.get(): null;
          a = p0.a;
          a.o(a, "t.mTargetUser");
          p0 = p0.b;
          Objects.requireNonNull(companion);
          if (!PatchProxy.isSupport(SocialRelationBridge$c.class) || !PatchProxy.applyVoidThreeRefs(reactContext, a, Boolean.valueOf(p0), companion, SocialRelationBridge$c.class, "3")) {
             try{
                p0 = new HashMap();
                String id = a.getId();
                a.o(id, "user.id");
                p0.put("userId", Long.valueOf(Long.parseLong(id)));
                p0.put("favoriteState", Boolean.valueOf(a.mFavorited));
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
             }
             if (reactContext != null) {
                NativeToJsKt.e(reactContext, "krnFavoriteStateChange", Arguments.makeNativeMap(p0));
             }
          }
       }
       return;
    }
}
