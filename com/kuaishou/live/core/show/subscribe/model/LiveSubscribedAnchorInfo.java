package com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo;
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

public class LiveSubscribedAnchorInfo implements Serializable, b	// class@00113f
{
    public String mCursor;
    public List mSubscribedAnchorList;
    public static final long serialVersionUID = 0xb3ff4396de5fd0d9;

    public void LiveSubscribedAnchorInfo(){
       super();
    }
    public List getItems(){
       return this.mSubscribedAnchorList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribedAnchorInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
