package com.kwai.nearby.startup.local.model.FestivalBubbleConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FestivalBubbleConfig implements Serializable	// class@00101a
{
    public boolean mActiveNow;
    public String mFestivalId;
    public String mIcon;
    public String mPageUrl;
    public String mText;
    public static final long serialVersionUID = 0xc09d8c3575acb43c;

    public void FestivalBubbleConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FestivalBubbleConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FestivalBubbleConfig{mActiveNow="+this.mActiveNow+", mIcon=\'"+this.mIcon+'''+", mText=\'"+this.mText+'''+", mPageUrl=\'"+this.mPageUrl+'''+", mFestivalId=\'"+this.mFestivalId+'''+'}';
    }
}
