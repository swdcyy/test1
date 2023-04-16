package com.kuaishou.merchant.api.core.model.CardCollectionFeedResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class CardCollectionFeedResponse implements Serializable, b	// class@001510
{
    public String mCursor;
    public List mQPhotos;
    public static final long serialVersionUID = 0x78980a128291999;

    public void CardCollectionFeedResponse(){
       super();
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CardCollectionFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
