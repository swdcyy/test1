package com.yxcorp.download.DownloadTask$DownloadRequest$CacheKeyGenStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadTask$DownloadRequest$CacheKeyGenStrategy extends Enum	// class@0011ae
{
    public static final DownloadTask$DownloadRequest$CacheKeyGenStrategy[] $VALUES;
    public static final DownloadTask$DownloadRequest$CacheKeyGenStrategy OnlyUrlPath;
    public static final DownloadTask$DownloadRequest$CacheKeyGenStrategy UrlPathWithQuery;
    public static final DownloadTask$DownloadRequest$CacheKeyGenStrategy WholeUrl;

    static {
       DownloadTask$DownloadRequest$CacheKeyGenStrategy uDownloadReq = new DownloadTask$DownloadRequest$CacheKeyGenStrategy("WholeUrl", 0);
       DownloadTask$DownloadRequest$CacheKeyGenStrategy.WholeUrl = uDownloadReq;
       DownloadTask$DownloadRequest$CacheKeyGenStrategy uDownloadReq1 = new DownloadTask$DownloadRequest$CacheKeyGenStrategy("OnlyUrlPath", 1);
       DownloadTask$DownloadRequest$CacheKeyGenStrategy.OnlyUrlPath = uDownloadReq1;
       DownloadTask$DownloadRequest$CacheKeyGenStrategy uDownloadReq2 = new DownloadTask$DownloadRequest$CacheKeyGenStrategy("UrlPathWithQuery", 2);
       DownloadTask$DownloadRequest$CacheKeyGenStrategy.UrlPathWithQuery = uDownloadReq2;
       DownloadTask$DownloadRequest$CacheKeyGenStrategy[] uDownloadReq3 = new DownloadTask$DownloadRequest$CacheKeyGenStrategy[]{uDownloadReq,uDownloadReq1,uDownloadReq2};
       DownloadTask$DownloadRequest$CacheKeyGenStrategy.$VALUES = uDownloadReq3;
    }
    public void DownloadTask$DownloadRequest$CacheKeyGenStrategy(String p0,int p1){
       super(p0, p1);
    }
    public static DownloadTask$DownloadRequest$CacheKeyGenStrategy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadTask$DownloadRequest$CacheKeyGenStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadTask$DownloadRequest$CacheKeyGenStrategy.class, p0);
    }
    public static DownloadTask$DownloadRequest$CacheKeyGenStrategy[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadTask$DownloadRequest$CacheKeyGenStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadTask$DownloadRequest$CacheKeyGenStrategy.$VALUES.clone();
    }
}
