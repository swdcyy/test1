package com.kwai.sdk.eve.EveTaskPackageSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveTaskPackageSource extends Enum	// class@00143d
{
    public static final EveTaskPackageSource[] $VALUES;
    public static final EveTaskPackageSource KSwitch;
    public static final EveTaskPackageSource RecoServer;

    static {
       EveTaskPackageSource uEveTaskPack1;
       EveTaskPackageSource[] uEveTaskPack = new EveTaskPackageSource[]{uEveTaskPack1,uEveTaskPack1};
       uEveTaskPack1 = new EveTaskPackageSource("RecoServer", 0);
       EveTaskPackageSource.RecoServer = uEveTaskPack1;
       uEveTaskPack1 = new EveTaskPackageSource("KSwitch", 1);
       EveTaskPackageSource.KSwitch = uEveTaskPack1;
       EveTaskPackageSource.$VALUES = uEveTaskPack;
    }
    public void EveTaskPackageSource(String p0,int p1){
       super(p0, p1);
    }
    public static EveTaskPackageSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveTaskPackageSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EveTaskPackageSource.class, p0);
    }
    public static EveTaskPackageSource[] values(){
       Object obj = PatchProxy.apply(null, null, EveTaskPackageSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EveTaskPackageSource.$VALUES.clone();
    }
}
