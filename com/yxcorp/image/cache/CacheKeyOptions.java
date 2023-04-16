package com.yxcorp.image.cache.CacheKeyOptions;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CacheKeyOptions extends Enum	// class@00136d
{
    public static final CacheKeyOptions[] $VALUES;
    public static final CacheKeyOptions PATH;
    public static final CacheKeyOptions PATH_CDN_SIZE;
    public static final CacheKeyOptions URL;

    static {
       CacheKeyOptions uCacheKeyOpt = new CacheKeyOptions("URL", 0);
       CacheKeyOptions.URL = uCacheKeyOpt;
       CacheKeyOptions uCacheKeyOpt1 = new CacheKeyOptions("PATH", 1);
       CacheKeyOptions.PATH = uCacheKeyOpt1;
       CacheKeyOptions uCacheKeyOpt2 = new CacheKeyOptions("PATH_CDN_SIZE", 2);
       CacheKeyOptions.PATH_CDN_SIZE = uCacheKeyOpt2;
       CacheKeyOptions[] uCacheKeyOpt3 = new CacheKeyOptions[]{uCacheKeyOpt,uCacheKeyOpt1,uCacheKeyOpt2};
       CacheKeyOptions.$VALUES = uCacheKeyOpt3;
    }
    public void CacheKeyOptions(String p0,int p1){
       super(p0, p1);
    }
    public static CacheKeyOptions valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CacheKeyOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CacheKeyOptions.class, p0);
    }
    public static CacheKeyOptions[] values(){
       Object obj = PatchProxy.apply(null, null, CacheKeyOptions.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CacheKeyOptions.$VALUES.clone();
    }
}
