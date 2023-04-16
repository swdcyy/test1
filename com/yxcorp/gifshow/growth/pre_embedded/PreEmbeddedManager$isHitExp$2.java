package com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager$isHitExp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import com.yxcorp.gifshow.growth.abtest.PreEmbeddedVideoFeedAB;
import com.yxcorp.gifshow.growth.abtest.LocalABTest;
import cra.w;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import java.lang.StringBuilder;
import q87.c;

public final class PreEmbeddedManager$isHitExp$2 extends Lambda implements a	// class@00147c
{
    public static final PreEmbeddedManager$isHitExp$2 INSTANCE;

    static {
       PreEmbeddedManager$isHitExp$2.INSTANCE = new PreEmbeddedManager$isHitExp$2();
    }
    public void PreEmbeddedManager$isHitExp$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PreEmbeddedManager$isHitExp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = PreEmbeddedVideoFeedAB.p.d().booleanValue();
       Object[] objArray = new Object[0];
       w.C().w(PreEmbeddedManager.l.d(), "PreEmbedded Exp value = "+b+"; did = "+a.a, objArray);
       return b;
    }
}
