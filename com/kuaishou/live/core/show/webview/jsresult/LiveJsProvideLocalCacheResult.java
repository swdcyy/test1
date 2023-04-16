package com.kuaishou.live.core.show.webview.jsresult.LiveJsProvideLocalCacheResult;
import java.io.Serializable;
import java.util.Map;
import java.lang.Object;
import ekd.q;
import java.util.HashMap;

public class LiveJsProvideLocalCacheResult implements Serializable	// class@001291
{
    public Map mData;
    public final int mResult;

    public void LiveJsProvideLocalCacheResult(Map p0){
       HashMap hashMap;
       super();
       int i = (q.h(p0))? -1: 1;
       this.mResult = i;
       if (q.h(p0)) {
          hashMap = new HashMap();
       }
       this.mData = hashMap;
       return;
    }
}
