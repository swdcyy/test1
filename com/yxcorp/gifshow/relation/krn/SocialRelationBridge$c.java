package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import java.lang.Object;
import nsd.u;
import com.facebook.react.bridge.ReactContext;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Long;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import fbc.a;
import java.lang.Enum;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public final class SocialRelationBridge$c	// class@00192c
{

    public void SocialRelationBridge$c(){
       super();
    }
    public void SocialRelationBridge$c(u p0){
       super();
    }
    public final void onFollowUpdateEvent(ReactContext p0,n p1){
       HashMap hashMap;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationBridge$c.class, "1")) {
          return;
       }
       try{
          n b = p1.b;
          a.o(b, "event.mUserId");
          long l = Long.parseLong(b);
          p1 = p1.a;
          User$FollowStatus followStatus = (p1 != null)? p1.getFollowStatus(): null;
          if (followStatus != null) {
             int i = a.a[followStatus.ordinal()];
             int i1 = 2;
             if (i != 1) {
                if (i != i1) {
                   if (i == 3) {
                   }
                }else {
                   i1 = 0;
                }
             }else {
                i1 = 1;
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
