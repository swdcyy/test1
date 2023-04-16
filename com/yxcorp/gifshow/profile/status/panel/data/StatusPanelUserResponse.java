package com.yxcorp.gifshow.profile.status.panel.data.StatusPanelUserResponse;
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

public final class StatusPanelUserResponse implements CursorResponse, Serializable	// class@0015be
{
    public String mCursor;
    public List mItems;
    public static final long serialVersionUID = 0xb156853596a615ee;

    public void StatusPanelUserResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, StatusPanelUserResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
