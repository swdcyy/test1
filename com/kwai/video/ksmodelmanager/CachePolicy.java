package com.kwai.video.ksmodelmanager.CachePolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CachePolicy extends Enum	// class@00090e
{
    public static final CachePolicy[] $VALUES;
    public static final CachePolicy ANY;
    public static final CachePolicy EQUAL;
    public static final CachePolicy GREATER_OR_EQUAL;
    public static final CachePolicy LESS_OR_EQUAL;

    static {
       CachePolicy uCachePolicy = new CachePolicy("EQUAL", 0);
       CachePolicy.EQUAL = uCachePolicy;
       CachePolicy uCachePolicy1 = new CachePolicy("GREATER_OR_EQUAL", 1);
       CachePolicy.GREATER_OR_EQUAL = uCachePolicy1;
       CachePolicy uCachePolicy2 = new CachePolicy("LESS_OR_EQUAL", 2);
       CachePolicy.LESS_OR_EQUAL = uCachePolicy2;
       CachePolicy uCachePolicy3 = new CachePolicy("ANY", 3);
       CachePolicy.ANY = uCachePolicy3;
       CachePolicy[] uCachePolicy4 = new CachePolicy[]{uCachePolicy,uCachePolicy1,uCachePolicy2,uCachePolicy3};
       CachePolicy.$VALUES = uCachePolicy4;
    }
    public void CachePolicy(String p0,int p1){
       super(p0, p1);
    }
    public static CachePolicy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CachePolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CachePolicy.class, p0);
    }
    public static CachePolicy[] values(){
       Object obj = PatchProxy.apply(null, null, CachePolicy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CachePolicy.$VALUES.clone();
    }
}
