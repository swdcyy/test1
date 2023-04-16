package com.kwai.sdk.eve.internal.pack.EvePackageManager$mEnableFetchFromKeep$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class EvePackageManager$mEnableFetchFromKeep$2 extends Lambda implements a	// class@00158a
{
    public static final EvePackageManager$mEnableFetchFromKeep$2 INSTANCE;

    static {
       EvePackageManager$mEnableFetchFromKeep$2.INSTANCE = new EvePackageManager$mEnableFetchFromKeep$2();
    }
    public void EvePackageManager$mEnableFetchFromKeep$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, EvePackageManager$mEnableFetchFromKeep$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableFetchPackageFromKeep", false);
    }
}
