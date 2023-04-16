package com.yxcorp.gifshow.aggregate.model.AggregateFeedResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class AggregateFeedResponse implements Serializable, b	// class@001930
{
    public String mCursor;
    public List mItems;
    public String mLlsid;
    public static final long serialVersionUID = 0xb448242488da0bc6;

    public void AggregateFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, AggregateFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
