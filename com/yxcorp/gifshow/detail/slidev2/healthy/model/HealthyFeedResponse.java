package com.yxcorp.gifshow.detail.slidev2.healthy.model.HealthyFeedResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class HealthyFeedResponse implements b, Serializable, Cloneable	// class@0018a8
{
    public String mDepartmentName;
    public String mEntryIcon;
    public List mFeeds;
    public String mLlsid;
    public String mResult;
    public int mTotalCount;
    public String mbCursor;
    public String mpCursor;
    public static final long serialVersionUID = 0xe053136a98a2b690;

    public void HealthyFeedResponse(){
       super();
    }
    public List getItems(){
       return this.mFeeds;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, HealthyFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mbCursor);
    }
    public boolean hasPrevious(){
       Object obj = PatchProxy.apply(null, this, HealthyFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mpCursor);
    }
}
