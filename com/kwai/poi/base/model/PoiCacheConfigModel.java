package com.kwai.poi.base.model.PoiCacheConfigModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PoiCacheConfigModel	// class@0013ac
{
    public final long a;
    public final int cacheDBVersion;
    public final int cacheNumLimit;
    public final long cacheSizeLimit;
    public final boolean enableCache;
    public final long expiredDurationMs;
    public final int thresholdDistance;

    public void PoiCacheConfigModel(){
       super();
       this.enableCache = true;
       this.expiredDurationMs = 0x5265c00;
       this.cacheNumLimit = 10;
       this.cacheSizeLimit = 10;
       this.cacheDBVersion = 1;
       this.thresholdDistance = 10;
       long l = (long)1024;
       this.a = (10 * l) * l;
    }
    public final int a(){
       return this.cacheDBVersion;
    }
    public final boolean b(){
       return this.enableCache;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PoiCacheConfigModel && (this.enableCache == p0.enableCache && (!this.expiredDurationMs - p0.expiredDurationMs && (this.cacheNumLimit == p0.cacheNumLimit && (!this.cacheSizeLimit - p0.cacheSizeLimit && (this.cacheDBVersion == p0.cacheDBVersion && this.thresholdDistance == p0.thresholdDistance))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       PoiCacheConfigModel obj = PatchProxy.apply(null, this, PoiCacheConfigModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableCache;
       if (obj != null) {
          i = 1;
       }
       PoiCacheConfigModel texpiredDura = this.expiredDurationMs;
       texpiredDura = this.cacheSizeLimit;
       return ((((((((((i * 31) + (int)(texpiredDura ^ (texpiredDura >> 32))) * 31) + this.cacheNumLimit) * 31) + (int)(texpiredDura ^ (texpiredDura >> 32))) * 31) + this.cacheDBVersion) * 31) + this.thresholdDistance);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PoiCacheConfigModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PoiCacheConfigModel\(enableCache="+this.enableCache+", expiredDurationMs="+this.expiredDurationMs+", cacheNumLimit="+this.cacheNumLimit+", cacheSizeLimit="+this.cacheSizeLimit+", cacheDBVersion="+this.cacheDBVersion+", thresholdDistance="+this.thresholdDistance+"\)";
    }
}
