package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$f;
import mu7.e$a;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import java.util.Objects;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$c;
import com.yxcorp.gifshow.relation.krn.a;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import crd.b;

public final class SocialRelationBridge$f implements e$a	// class@00192f
{
    public final WeakReference a;

    public void SocialRelationBridge$f(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.a = new WeakReference(p0);
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialRelationBridge$f.class, "1")) {
          return;
       }
       a.p(p0, "userId");
       a.p(p1, "alias");
       SocialRelationBridge$c companion = SocialRelationBridge.Companion;
       ReactContext reactContext = this.a.get();
       Objects.requireNonNull(companion);
       if (!PatchProxy.applyVoidThreeRefs(reactContext, p0, p1, companion, SocialRelationBridge$c.class, "2")) {
          t.fromCallable(new a(p0, p1, reactContext)).subscribeOn(d.c).subscribe();
       }
       return;
    }
}
