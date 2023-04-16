package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$g;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import cda.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import java.util.Objects;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Exception;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public final class SocialRelationBridge$g implements g	// class@001930
{
    public final WeakReference b;

    public void SocialRelationBridge$g(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       HashMap hashMap;
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationBridge$g.class, "1")) {
       }else {
          a.p(p0, "t");
          SocialRelationBridge$c companion = SocialRelationBridge.Companion;
          SocialRelationBridge$g tb = this.b;
          ReactContext reactContext = (tb != null)? tb.get(): null;
          p0 = p0.a;
          a.o(p0, "t.mPhoto");
          Objects.requireNonNull(companion);
          if (!PatchProxy.applyVoidTwoRefs(reactContext, p0, companion, SocialRelationBridge$c.class, "8")) {
             try{
                hashMap = new HashMap();
                hashMap.put("photoId", p0.getPhotoId());
                hashMap.put("userId", p0.getUserId());
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
             }
             if (reactContext != null) {
                NativeToJsKt.e(reactContext, "krnRelationSlidePlayReport", Arguments.makeNativeMap(hashMap));
             }
          }
       }
       return;
    }
}
