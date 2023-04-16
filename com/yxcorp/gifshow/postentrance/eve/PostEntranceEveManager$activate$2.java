package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$2$a;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$2$b;
import erd.g;
import crd.b;

public final class PostEntranceEveManager$activate$2 extends Lambda implements l	// class@001049
{
    public static final PostEntranceEveManager$activate$2 INSTANCE;

    static {
       PostEntranceEveManager$activate$2.INSTANCE = new PostEntranceEveManager$activate$2();
    }
    public void PostEntranceEveManager$activate$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostEntranceEveManager$activate$2.class, "1")) {
          return;
       }
       a.p(p0, "o");
       PostEntranceEveManager.d = p0.subscribeOn(d.c).observeOn(d.a).subscribe(PostEntranceEveManager$activate$2$a.b, PostEntranceEveManager$activate$2$b.b);
       return;
    }
}
