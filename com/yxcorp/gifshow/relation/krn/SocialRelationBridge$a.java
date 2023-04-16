package com.yxcorp.gifshow.relation.krn.SocialRelationBridge$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.t;
import dub.z;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.krn.SocialRelationBridge$d;
import com.facebook.react.bridge.ReactContext;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class SocialRelationBridge$a implements Runnable	// class@00192a
{
    public final SocialRelationBridge b;
    public final ReactApplicationContext c;

    public void SocialRelationBridge$a(SocialRelationBridge p0,ReactApplicationContext p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationBridge$a.class, "1")) {
          return;
       }
       this.b.notifyDisposable = z.j("FollowerTabRedDotPresenter", Integer.valueOf(3)).observeOn(d.c).subscribe(new SocialRelationBridge$d(this.c), Functions.e);
       return;
    }
}
