package com.kuaishou.live.core.show.topic.api.LiveTopicListResponse;
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

public class LiveTopicListResponse implements Serializable, b	// class@0011e8
{
    public String mPcursor;
    public List mTopicInfoList;
    public long mVersion;
    public static final long serialVersionUID = 0x85f15b5005a385d5;

    public void LiveTopicListResponse(){
       super();
    }
    public String getCursor(){
       return this.mPcursor;
    }
    public List getItems(){
       return this.mTopicInfoList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveTopicListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
}
