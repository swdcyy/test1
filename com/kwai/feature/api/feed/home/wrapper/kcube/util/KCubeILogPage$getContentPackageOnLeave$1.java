package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getContentPackageOnLeave$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeILogPage$getContentPackageOnLeave$1 extends FunctionReferenceImpl implements l	// class@000f24
{
    public static final KCubeILogPage$getContentPackageOnLeave$1 INSTANCE;

    static {
       KCubeILogPage$getContentPackageOnLeave$1.INSTANCE = new KCubeILogPage$getContentPackageOnLeave$1();
    }
    public void KCubeILogPage$getContentPackageOnLeave$1(){
       super(1, e0.class, "getContentPackageOnLeave", "getContentPackageOnLeave\(\)Lcom/kuaishou/client/log/content/packages/nano/ClientContent$ContentPackage;", 0);
    }
    public final ClientContent$ContentPackage invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getContentPackageOnLeave$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.Nf();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
