package com.yxcorp.gifshow.featured.detail.live.data.FeatureLiveFeedsResponse;
import java.io.Serializable;
import mkd.a;
import la6.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public final class FeatureLiveFeedsResponse implements Serializable, a, b	// class@000f94
{
    public String mCursor;
    public List mItems;
    public String mLlsid;
    public static final long serialVersionUID = 0xd904b7eb53299660;

    public void FeatureLiveFeedsResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, FeatureLiveFeedsResponse.class, "2")) {
          return;
       }
       if (!q.f(this.mItems)) {
          Iterator iterator = this.mItems.iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       return;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FeatureLiveFeedsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
