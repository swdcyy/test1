package com.yxcorp.gifshow.follow.common.data.ManagePymiListResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class ManagePymiListResponse implements Serializable, CursorResponse	// class@001020
{
    public String mCursor;
    public List mPymiUsers;
    public static final long serialVersionUID = 0x1f92824acbe8d1a7;

    public void ManagePymiListResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPymiUsers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ManagePymiListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
