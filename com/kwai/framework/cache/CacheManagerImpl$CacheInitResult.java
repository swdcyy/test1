package com.kwai.framework.cache.CacheManagerImpl$CacheInitResult;
import java.io.Serializable;
import com.kwai.framework.cache.CacheManagerImpl;
import java.lang.Object;

public class CacheManagerImpl$CacheInitResult implements Serializable	// class@000b19
{
    public long availableSpace;
    public String cacheDirPath;
    public long cachedFilesSize;
    public String exceptionMes;
    public boolean isCacheDirExist;
    public boolean isInMemMounted;
    public final CacheManagerImpl this$0;
    public static final long serialVersionUID = 0xc763cb6fbb1f231;

    public void CacheManagerImpl$CacheInitResult(CacheManagerImpl p0){
       this.this$0 = p0;
       super();
    }
}
