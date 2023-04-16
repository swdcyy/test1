package com.kuaishou.live.playback.list.response.LivePlaybackListResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LivePlaybackListResponse implements CursorResponse, Serializable	// class@000d28
{
    public String mCursor;
    public List mPlaybackList;
    public String mPlaybackListNoMoreTips;
    public static final long serialVersionUID = 0x30deb1db5ff356b2;

    public void LivePlaybackListResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPlaybackList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
