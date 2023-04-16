package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$h;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import wca.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;

public final class SocialRelationBridge$h implements g	// class@001931
{
    public final WeakReference b;

    public void SocialRelationBridge$h(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationBridge$h.class, "1")) {
       }else {
          a.p(p0, "t");
          SocialRelationBridge$c companion = SocialRelationBridge.Companion;
          SocialRelationBridge$h tb = this.b;
          ReactContext reactContext = (tb != null)? tb.get(): null;
          companion.onFollowUpdateEvent(reactContext, p0);
       }
       return;
    }
}
