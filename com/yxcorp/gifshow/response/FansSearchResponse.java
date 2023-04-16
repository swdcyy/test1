package com.yxcorp.gifshow.response.FansSearchResponse;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class FansSearchResponse implements b	// class@001b0a
{
    public String mCursor;
    public boolean mEnableRelationListOptimize;
    public String mPrsid;
    public int mSubTitleStyle;
    public List mUsers;

    public void FansSearchResponse(){
       super();
    }
    public List getItems(){
       return this.mUsers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FansSearchResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
