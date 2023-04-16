package com.kwai.video.ksuploaderkit.utils.UploaderLruCache;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class UploaderLruCache extends LinkedHashMap	// class@0009e6
{
    public final int mMaxSize;

    public void UploaderLruCache(){
       super(16);
    }
    public void UploaderLruCache(int p0){
       super();
       this.mMaxSize = p0;
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, UploaderLruCache.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > this.mMaxSize)? true: false;
       return b;
    }
}
