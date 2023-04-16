package com.kuaishou.live.common.core.component.admin.model.KickUserResponse;
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

public class KickUserResponse implements CursorResponse, Serializable	// class@000f43
{
    public String mCursor;
    public List mKickUsers;

    public void KickUserResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mKickUsers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, KickUserResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
