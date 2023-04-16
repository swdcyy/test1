package com.yxcorp.gifshow.detail.model.MagicFaceFriendsFeedsResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class MagicFaceFriendsFeedsResponse implements Serializable, CursorResponse	// class@001586
{
    public List mFeedList;
    public String mPcursor;
    public int mResult;
    public static final long serialVersionUID = 0x361b50460584ee0e;

    public void MagicFaceFriendsFeedsResponse(){
       super();
       this.mResult = 0;
       this.mFeedList = new ArrayList();
    }
    public String getCursor(){
       return this.mPcursor;
    }
    public List getItems(){
       return this.mFeedList;
    }
    public int getResult(){
       return this.mResult;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MagicFaceFriendsFeedsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
}
