package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getFollowPageRef$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lnc.s5;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class KCubeILogPage$getFollowPageRef$1 extends FunctionReferenceImpl implements l	// class@000f29
{
    public static final KCubeILogPage$getFollowPageRef$1 INSTANCE;

    static {
       KCubeILogPage$getFollowPageRef$1.INSTANCE = new KCubeILogPage$getFollowPageRef$1();
    }
    public void KCubeILogPage$getFollowPageRef$1(){
       super(1, s5.class, "getFollowPageRef", "getFollowPageRef\(\)I", 0);
    }
    public final int invoke(s5 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getFollowPageRef$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "p1");
       return p0.Ab();
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
