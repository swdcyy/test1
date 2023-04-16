package com.kuaishou.live.core.show.webview.cache.LiveWebViewLocalCacheEntry;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ok.j$b;
import ok.j;
import java.util.HashMap;

public class LiveWebViewLocalCacheEntry implements Serializable	// class@001285
{
    public String mCacheKey;
    public Map mData;
    public long mExpiredDuration;
    public long mSaveTimeStamp;
    public static final long serialVersionUID = 0xc386ca10a7f995a0;

    public void LiveWebViewLocalCacheEntry(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWebViewLocalCacheEntry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof LiveWebViewLocalCacheEntry || !TextUtils.equals(p0.mCacheKey, this.mCacheKey)) {
          b = false;
       }
       return b;
    }
    public long getExpiredTimeStamp(){
       return (this.mExpiredDuration + this.mSaveTimeStamp);
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, LiveWebViewLocalCacheEntry.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.c("mCacheKey", this.mCacheKey);
       obj.b("mExpiredTimestamp", this.mExpiredDuration);
       obj.b("saveTimeStamp", this.mSaveTimeStamp);
       LiveWebViewLocalCacheEntry tmData = this.mData;
       if (tmData == null) {
          tmData = new HashMap();
       }
       obj.c("mData", tmData);
       return obj.toString();
    }
}
