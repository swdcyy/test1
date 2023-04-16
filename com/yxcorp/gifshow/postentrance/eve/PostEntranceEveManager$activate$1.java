package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager;
import java.lang.StringBuilder;
import java.util.UUID;
import java.lang.System;
import a0c.g;
import q87.c;

public final class PostEntranceEveManager$activate$1 extends Lambda implements l	// class@001046
{
    public static final PostEntranceEveManager$activate$1 INSTANCE;

    static {
       PostEntranceEveManager$activate$1.INSTANCE = new PostEntranceEveManager$activate$1();
    }
    public void PostEntranceEveManager$activate$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntranceEveManager$activate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pipeline");
       obj = PostEntranceEveManager.c;
       _monitor_enter(obj);
       p0 = UUID.randomUUID().toString()+'_'+System.nanoTime()+'_'+p0;
       Object[] objArray = new Object[0];
       g.C().w("PostEntranceEvePresenter", "onInfer start: "+p0, objArray);
       _monitor_exit(obj);
       return p0;
    }
}
