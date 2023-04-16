package com.kwai.feature.api.social.nearby.LocalDelegateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocalDelegateType extends Enum	// class@001199
{
    public final String mValue;
    public static final LocalDelegateType[] $VALUES;
    public static final LocalDelegateType ACTIVITY_LOCAL;
    public static final LocalDelegateType HOME_LOCAL;

    static {
       LocalDelegateType localDelegat = new LocalDelegateType("HOME_LOCAL", 0, "home_local");
       LocalDelegateType.HOME_LOCAL = localDelegat;
       LocalDelegateType localDelegat1 = new LocalDelegateType("ACTIVITY_LOCAL", 1, "activity_local");
       LocalDelegateType.ACTIVITY_LOCAL = localDelegat1;
       LocalDelegateType[] localDelegat2 = new LocalDelegateType[]{localDelegat,localDelegat1};
       LocalDelegateType.$VALUES = localDelegat2;
    }
    public void LocalDelegateType(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LocalDelegateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalDelegateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocalDelegateType.class, p0);
    }
    public static LocalDelegateType[] values(){
       Object obj = PatchProxy.apply(null, null, LocalDelegateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalDelegateType.$VALUES.clone();
    }
    public String getValue(){
       return this.mValue;
    }
}
