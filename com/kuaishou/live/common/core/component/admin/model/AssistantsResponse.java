package com.kuaishou.live.common.core.component.admin.model.AssistantsResponse;
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

public class AssistantsResponse implements CursorResponse, Serializable	// class@000f41
{
    public int mAdminLimit;
    public String mCursor;
    public String mPrompt;
    public int mSuperAssistantLimit;
    public List mUsers;
    public static final long serialVersionUID = 0x65e123e5d9e175a8;

    public void AssistantsResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mUsers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, AssistantsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
