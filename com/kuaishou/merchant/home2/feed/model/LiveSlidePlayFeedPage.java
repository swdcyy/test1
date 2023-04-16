package com.kuaishou.merchant.home2.feed.model.LiveSlidePlayFeedPage;
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

public class LiveSlidePlayFeedPage implements Serializable, b	// class@0017b6
{
    public String mCursor;
    public List mItems;
    public static final long serialVersionUID = 0x2685c262bcabe796;

    public void LiveSlidePlayFeedPage(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveSlidePlayFeedPage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
