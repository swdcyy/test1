package com.yxcorp.gifshow.postwork.PostWorkManager$LoadPostCacheStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostWorkManager$LoadPostCacheStatus extends Enum	// class@0010b2
{
    public static final PostWorkManager$LoadPostCacheStatus[] $VALUES;
    public static final PostWorkManager$LoadPostCacheStatus STATUS_CACHE_COMPLETE;
    public static final PostWorkManager$LoadPostCacheStatus STATUS_CACHE_LOADING;
    public static final PostWorkManager$LoadPostCacheStatus STATUS_CACHE_PENDING;

    static {
       PostWorkManager$LoadPostCacheStatus loadPostCach = new PostWorkManager$LoadPostCacheStatus("STATUS_CACHE_PENDING", 0);
       PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_PENDING = loadPostCach;
       PostWorkManager$LoadPostCacheStatus loadPostCach1 = new PostWorkManager$LoadPostCacheStatus("STATUS_CACHE_LOADING", 1);
       PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_LOADING = loadPostCach1;
       PostWorkManager$LoadPostCacheStatus loadPostCach2 = new PostWorkManager$LoadPostCacheStatus("STATUS_CACHE_COMPLETE", 2);
       PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_COMPLETE = loadPostCach2;
       PostWorkManager$LoadPostCacheStatus[] loadPostCach3 = new PostWorkManager$LoadPostCacheStatus[]{loadPostCach,loadPostCach1,loadPostCach2};
       PostWorkManager$LoadPostCacheStatus.$VALUES = loadPostCach3;
    }
    public void PostWorkManager$LoadPostCacheStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PostWorkManager$LoadPostCacheStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostWorkManager$LoadPostCacheStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostWorkManager$LoadPostCacheStatus.class, p0);
    }
    public static PostWorkManager$LoadPostCacheStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PostWorkManager$LoadPostCacheStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostWorkManager$LoadPostCacheStatus.$VALUES.clone();
    }
}
