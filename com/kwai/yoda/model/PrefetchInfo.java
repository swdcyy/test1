package com.kwai.yoda.model.PrefetchInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PrefetchInfo implements Serializable	// class@0012c3
{
    public String mContent;
    public String mContentType;
    public String mEvent;
    public long mExpireTime;
    public Map mHeaderMap;
    public String mHyId;
    public String mMethod;
    public String mUrl;
    public int mVersion;
    public static final long serialVersionUID = 0x42d4790f29c85029;

    public void PrefetchInfo(){
       super();
       this.mUrl = "";
       this.mMethod = "";
       this.mContent = "";
       this.mHeaderMap = new HashMap();
       this.mEvent = "";
       this.mContentType = "";
       this.mHyId = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PrefetchInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mUrl = "+this.mUrl+", mMethod = "+this.mMethod+", mContent = "+this.mContent+", mHeaderMap = "+this.mHeaderMap+", mContentType = "+this.mContentType+", mVersion = "+this.mVersion+", mHyId = "+this.mHyId+", mEvent = "+this.mEvent+", mExpireTime = "+this.mExpireTime+"\n";
    }
}
