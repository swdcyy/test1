package com.kuaishou.live.core.show.liveslidesquare.LiveSlideSquareResponse;
import java.io.Serializable;
import mkd.a;
import com.kwai.framework.model.response.CursorResponse;
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

public class LiveSlideSquareResponse implements Serializable, a, CursorResponse	// class@000c8f
{
    public String mCursor;
    public List mItems;
    public String mLlsid;
    public static final long serialVersionUID = 0xd0bb2f5835e61271;

    public void LiveSlideSquareResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveSlideSquareResponse.class, "2")) {
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
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveSlideSquareResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
