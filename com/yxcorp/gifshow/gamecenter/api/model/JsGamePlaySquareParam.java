package com.yxcorp.gifshow.gamecenter.api.model.JsGamePlaySquareParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;

public class JsGamePlaySquareParam implements Serializable	// class@0012a9
{
    public LiveStreamFeed mFeed;
    public List mFeeds;
    public String mSourceType;
    public String mUtmSource;
    public static final long serialVersionUID = 0x5fbe24e23aedb840;

    public void JsGamePlaySquareParam(){
       super();
    }
    public int feedIndex(){
       Object obj = PatchProxy.apply(null, this, JsGamePlaySquareParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.isValide())? this.mFeeds.indexOf(this.mFeed): 0;
       return i;
    }
    public boolean isValide(){
       boolean b = (this.mFeed != null && this.mFeeds != null)? true: false;
       return b;
    }
}
