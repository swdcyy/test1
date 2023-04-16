package com.kwai.feature.api.feed.thanos.ThanosPlugin$ThanosResId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ThanosPlugin$ThanosResId extends Enum	// class@000f74
{
    public static final ThanosPlugin$ThanosResId[] $VALUES;
    public static final ThanosPlugin$ThanosResId THANOS_HOME_TAB_RES_ID;

    static {
       ThanosPlugin$ThanosResId thanosResId = new ThanosPlugin$ThanosResId("THANOS_HOME_TAB_RES_ID", 0);
       ThanosPlugin$ThanosResId.THANOS_HOME_TAB_RES_ID = thanosResId;
       ThanosPlugin$ThanosResId[] thanosResIdA = new ThanosPlugin$ThanosResId[]{thanosResId};
       ThanosPlugin$ThanosResId.$VALUES = thanosResIdA;
    }
    public void ThanosPlugin$ThanosResId(String p0,int p1){
       super(p0, p1);
    }
    public static ThanosPlugin$ThanosResId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ThanosPlugin$ThanosResId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ThanosPlugin$ThanosResId.class, p0);
    }
    public static ThanosPlugin$ThanosResId[] values(){
       Object obj = PatchProxy.apply(null, null, ThanosPlugin$ThanosResId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ThanosPlugin$ThanosResId.$VALUES.clone();
    }
}
